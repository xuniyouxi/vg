package com.vg.service.user;


import com.vg.config.Util.BackJSON;
import com.vg.entity.User;
import com.vg.entity.EVO.UserLogin;
import com.vg.entity.EVO.UserRegister;
public interface UserBehaviorservice {

	BackJSON getallteam();
	//获取用户
	BackJSON login(UserLogin userlogin) throws Exception;
	
	//获取免责声明
	BackJSON getStatementByFun(int bis_id);
	
	//获取用户权限
	int getUserRoleById(String user_id);
	
	//用户注册
	BackJSON UserRegister(UserRegister userRegister) throws Exception;
}
