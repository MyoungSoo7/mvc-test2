package lms.mvctest.di;

import lms.mvctest.di.annotation.Controller;
import lms.mvctest.di.annotation.Inject;

@Controller
public class UserController {

    private UserService userService;

    @Inject
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }
}
