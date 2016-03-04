package com.dongwt.nb.ctrl.b;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dongwt.nb.ctrl.base.BaseCtrl;
import com.dongwt.nb.framework.Result;

@Controller
@RequestMapping("/user")
public class UserCtrl extends BaseCtrl {

	@RequestMapping(value="/login",method={RequestMethod.GET})
	@ResponseBody
	public Result login() {
		Result result = new Result();
		result.put("msg", "success");
		return result;
	}

}
