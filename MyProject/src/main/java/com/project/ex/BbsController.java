package com.project.ex;

import mybatis.dao.BbsDAO;
import mybatis.vo.BbsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BbsController {

	@Autowired
	private BbsDAO b_dao;

	//blockList: 한 페이지에 보여질 게시물 수
	private int blockList = 10;
	//blockPage: 한 블럭당 보여질 페이지 수
	private int blockPage = 5;

	@RequestMapping("/bbs")
	public ModelAndView bbsList(String bname, String cPage) {
		ModelAndView mv = new ModelAndView();


		//현재 페이지 값인 cPage라는 파라미터 값을 받지 못한 경우는
		//무조건 1페이지가 기본.


		if(bname == null)
			bname = "BBS";

		int rowTotal = b_dao.totalCount(bname);
		mv.addObject("rowTotal", rowTotal);

		int c_page = 1;
		//cPage가 넘어올 경우
		if(cPage != null) {
			c_page = Integer.parseInt(cPage);
		}
		Paging page = new Paging(c_page, rowTotal, blockList, blockPage);




		mv.addObject("p_code", page.getSb().toString());
		mv.addObject("blockList", blockList);
		mv.addObject("nowPage", c_page);

		BbsVO[] ar = b_dao.getList(page.getBegin(), page.getEnd(), bname);
		mv.addObject("ar", ar);
		//화면을 표현할 뷰페이지를 설정
		mv.setViewName("bbs/list");
		return mv;
	}


}
