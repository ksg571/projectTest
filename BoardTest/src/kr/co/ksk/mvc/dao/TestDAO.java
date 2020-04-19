package kr.co.ksk.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ksk.mvc.vo.TestVO;

@Repository
public class TestDAO {

	@Autowired
	private SqlSessionTemplate ss;
	
	
	public List<TestVO> testList(TestVO vo){
		return ss.selectList("test.testList",vo);
	}
}
