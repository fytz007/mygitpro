package cn.mldn.travel.service.back.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import cn.mldn.travel.dao.IDeptDAO;
import cn.mldn.travel.service.back.IDeptServiceBack;
@Service
public class DeptServiceBackImpl implements IDeptServiceBack{
	@Resource
	private IDeptDAO deptDAO;
	@Override
	public Map<String, Object> list() {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("allDepts", this.deptDAO.findAll());
		return map;
	}
	
	
}
