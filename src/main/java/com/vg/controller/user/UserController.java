package com.vg.controller.user;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.vg.config.MyAnn.Authorization;
import com.vg.config.Util.BackJSON;
import com.vg.entity.EVO.UserInfo;
import com.vg.service.user.UserService;

/**
 * 个人信息
 * @author bc
 * @date 2018年12月11日
 */ 

@RestController
@RequestMapping("/userInfo/")
@CrossOrigin
public class UserController {
	
	@Autowired
	private UserService us;
	
	//绑定的设备
	@Authorization(authorization="user")
	@GetMapping("equipment/{user_id}")
	public BackJSON getEquipment(@PathVariable String user_id) {
		return us.getEquipment(user_id);
	}
	//解除绑定
	@Authorization(authorization="user")
	@PostMapping("untie/{user_id}/{equipment_num}")
	public BackJSON untie(@PathVariable("user_id") String user_id, @PathVariable("equipment_num") int equipment_num) {
		return us.untie(user_id, equipment_num);
	}
	//个人信息
	@Authorization(authorization="user")
	@GetMapping("info/{user_id}")
	public BackJSON getInfo(@PathVariable String user_id) {
		return us.getInfo(user_id);
	}
	//修改个人信息
	@Authorization(authorization="user")
	@PostMapping("alterInfo")
	public BackJSON alterInfo(@RequestBody UserInfo user) {
		return us.alterInfo(user);
	}
	//个人中心
	@Authorization(authorization="user")
	@GetMapping("center/{user_id}")
	public BackJSON getCenter(@PathVariable String user_id) {
		return us.getCenter(user_id);
	}
	//联系我们
	@Authorization(authorization="open")
	@GetMapping("contactUS")
	public BackJSON contactUS() {
		return us.contactUS(1);
	}
	//我的团队
	@Authorization(authorization="user")
	@GetMapping("myTeam/{user_id}")
	public BackJSON getTeamNum(@PathVariable String user_id) {
		return us.getTeamNum(user_id);
	}
	//判断手机号是否正确
	@Authorization(authorization="user")
	@GetMapping("truePhone/{user_id}/{user_phone}")
	public BackJSON truePhone(@PathVariable("user_id") String user_id, @PathVariable("user_phone") String user_phone) {
		return us.truePhone(user_id, user_phone);
	}
	//重置密码
	@Authorization(authorization="user")
	@PostMapping("resetPassword")
	public BackJSON resetPassword(@RequestBody Map<String, Object> map) {
		return us.resetPassword((String)map.get("user_id"), (String)map.get("new_password"), (Integer)map.get("type"));
	}
	//更新头像
	@Authorization(authorization="user")
	@PostMapping("updateHeadPic")
	public BackJSON updateHeadPic(@RequestBody String data) {
		JSONObject json = JSONObject.parseObject(data);
		String user_id = json.getString("user_id");
		String head_picture = json.getString("head_picture");
		return us.updateHeadPic(user_id, head_picture);
	}
	//发送验证码
	@Authorization(authorization="open")
	@PostMapping("newIdentifyCode/{user_phone}")
	public BackJSON newIdentifyCode(@PathVariable String user_phone) {
		return us.newIdentifyCode(user_phone);
	}
	//验证验证码
	@Authorization(authorization="open")
	@PostMapping("checkIdentifyCode/{user_phone}/{identify_code}")
	public BackJSON checkIdentifyCode(@PathVariable("user_phone")String phone, @PathVariable("identify_code")int code){
		return us.checkIdentifyCode(phone, code);
	}
	//获取轮播图
	@Authorization(authorization="open")
	@GetMapping("getSlidePicture")
	public BackJSON getSlidePicture() {
		return us.getSlidePicture();
	}
	//用户忘记密码重置密码，是公开接口
	@Authorization(authorization="open")
	@PostMapping("resetStartPassword")
	public BackJSON resetStartPassword(@RequestBody Map<String, Object> map) {
		return us.resetStartPassword((String)map.get("user_phone"), (String)map.get("new_password"));
	}
	//欢迎页图片
	@Authorization(authorization="open")
	@GetMapping("welcomePicture")
	public BackJSON WelcomePicture() {
		return us.getWelcomePicture();
	}

}
