package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AlertVO;
import model.MemberDAO;
import model.MemberVO;

public class UpdateInfoAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ActionForward forward = null;
		
		MemberDAO mDAO = new MemberDAO();
		MemberVO mVO = new MemberVO();
		
		mVO.setMemberSearch("회원정보변경");
		mVO.setMemberId(request.getParameter("memberId"));
		mVO.setMemberName(request.getParameter("memberName"));
		mVO.setMemberAddress(request.getParameter("memberAddress").equals("") ? null : request.getParameter("memberAddress"));
		mVO.setMemberPhone(request.getParameter("memberPhone").equals("") ? 0 : Long.parseLong(request.getParameter("memberPhone")));
		mVO.setMemberEmail(request.getParameter("memberEmail").equals("") ? null : request.getParameter("memberEmail"));
		
		System.out.println(mVO);
		
		if (mDAO.update(mVO)) {
			AlertVO saVO = new AlertVO("회원정보 변경", "회원정보 변경", null, "success", "main.do");
			request.setAttribute("sa", saVO);
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("alertTrue.jsp");	
		}
		
		return forward;
	}
	
}
