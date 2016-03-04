package com.dongwt.nb.ctrl.b;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dongwt.nb.ctrl.base.BaseCtrl;
import com.dongwt.nb.framework.Result;

@Controller
@RequestMapping("/user")
public class UserCtrl extends BaseCtrl {
	
	 private static Logger log = LoggerFactory.getLogger(UserCtrl.class);  

	@RequestMapping(value="/login",method={RequestMethod.GET})
	@ResponseBody
	public Result login() {
		log.debug("begin login");
		Result result = new Result();
		result.put("msg", "success");
		return result;
	}

}
