package kr.co.ksk.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.ksk.mvc.dao.TestDAO;
import kr.co.ksk.mvc.vo.TestVO;

@Controller
public class TestController {

	@Autowired
	private TestDAO dao;
	
	@RequestMapping("/testList")
	public String testList(Model m, TestVO vo) {
		
		List<TestVO> tlist = dao.testList(vo);
		m.addAttribute("tlist", tlist);
		
		return "test";
	}
}
