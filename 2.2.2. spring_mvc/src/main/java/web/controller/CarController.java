package web.controller;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import web.config.WebConfig;
import web.service.ServiceCar;
import web.service.ServiceCarImp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

@Controller
public class CarController {
   ServiceCarImp serviceCarImp = new ServiceCarImp();
    @GetMapping(value = "/cars")
    public String printCar(HttpServletRequest request, ModelMap model) {
        String tablename;
        switch (request.getParameter("locale")){
            case "en":
                tablename = "CARS";
                break;
            case "ru":
                tablename = "МАШИНЫ";
                break;
            default:
                tablename = "CARS";
                break;
        }
        model.addAttribute("tablename", tablename);
        model.addAttribute("messages",serviceCarImp.getCar());
        return "cars";
    }
}
