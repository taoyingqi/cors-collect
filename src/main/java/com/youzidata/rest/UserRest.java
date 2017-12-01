package com.youzidata.rest;

import com.youzidata.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api/users")
public class UserRest {
    private final Logger Log = LoggerFactory.getLogger(this.getClass());

    @PostMapping("")
    public Object save(@RequestBody User user) {
        Log.debug(user.toString());
        return "";
    }

    @PutMapping("")
    public Object update(@RequestBody User user) {
        Log.debug(user.toString());
        return "";
    }

    @GetMapping("/{id}")
    public Object get(@PathVariable Long id) {
        User user = new User();
        user.setId(10000L);
        user.setUn("admin");
        user.setPwd("123456");
        user.setCreatedAt(new Date());
        return user;
    }


}
