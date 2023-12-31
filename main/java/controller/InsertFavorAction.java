package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.FavorDAO;
import model.FavorVO;

public class InsertFavorAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ActionForward forward = null;
		
		FavorDAO fDAO = new FavorDAO();
		FavorVO fVO = new FavorVO();
		
		HttpSession session = request.getSession();
		
		fVO.setMemberId((String)session.getAttribute("ssMemberId"));
		fVO.setTeaNum(Integer.parseInt(request.getParameter("teaNum")));
		
		if (fDAO.insert(fVO)) {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("favor.jsp"); // 경로 수정 필요
		}
		
		return forward;
	}
	
}
