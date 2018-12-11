package com.vg.mapper.user;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.vg.entity.User;
import com.vg.entity.UserTeam;
import com.vg.entity.EVO.UserLogin;
import com.vg.entity.EVO.UserRegister;

@Repository
public interface UserBehaviorMapper {

	// 测试查询所有team
	@Select({ "select * from t_team" })
	List<Map<String, Object>> getallteam();

	// 获取系统当前邀请码
	@Select({ "select bis_content from t_biscuits where bis_id=2" })
	String getSysInviteCode();

	// 更新系统当前邀请码
	@Update({ "UPDATE t_biscuits SET bis_content=#{arg0} WHERE bis_id=2" })
	int updataSysInviteCode(String code);

	// 验证登录
	@Select({ "select * from t_user where user_phone = #{user_phone} and user_password=#{user_password}" })
	User getUserByPhoneAndPass(UserLogin userlogin);

	// 获取免责声明
	@Select({ "select bis_name,bis_content from t_biscuits WHERE bis_state=1 AND bis_id=#{arg0}" })
	Map<String, Object> getStatementByFun(int bis_id);

	// 获取某个用户的权限
	@Select({ "select user_role from t_user  WHERE user_id=#{user_id}" })
	int getUserRoleById(String user_id);

	// 创建用户
	@Insert("INSERT INTO t_user VALUES (#{user_id},#{user_phone},#{user_password},1,#{create_time})")
	int createUser(User user);

	// 获取用户通过邀请码查询
	@Select({ "select user_id from t_user_data WHERE invite_code=#{invite_code}" })
	String getUserIdByinviteCode(String invite_code);

	// 获取某个用户通过手机号码查询
	@Select({ "select count(*) from t_user WHERE user_phone=#{user_phone}" })
	Integer getUserIdByPhone(String user_phone);

	// 注册时插入userdata
	@Insert("INSERT INTO t_user_data (user_id, user_realname,user_equipment_id1,invite_code,user_balance,pool_usedCapacity,pool_rank,user_vip) VALUES (#{user_id}, #{user_realname},#{user_equipment_id1},#{invite_code},0,0,0,0)")
	int insertUserData(UserRegister userRegister);

	// 通过id获取用户所属团队信息
	@Select({ "select * from t_user_team WHERE user_id=#{user_id}" })
	UserTeam getUserTemaById(String user_id);

	// 通过user_id获取用户的IMIE码
	@Select({ "select user_equipment_id1,user_equipment_id2 from t_user_data WHERE user_id=#{user_id}" })
	Map<String, String> getUserIMIE(String user_id);
}
