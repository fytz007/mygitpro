package cn.mldn.travel.dao;

import java.util.List;
import java.util.Map;

import cn.mldn.travel.vo.Dept;
import cn.mldn.util.dao.IBaseDAO;

public interface IDeptDAO extends IBaseDAO<Long, Dept> {
	public List<Dept> findAll(Map<String,Object> param);
}
