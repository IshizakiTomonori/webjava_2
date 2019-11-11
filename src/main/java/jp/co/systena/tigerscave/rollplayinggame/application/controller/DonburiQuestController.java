package jp.co.systena.tigerscave.rollplayinggame.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DonburiQuestController {

  // キャラクター作成画面
  @RequestMapping(value = "/Charcter")
  public ModelAndView CharacterCreate(ModelAndView mav) {
    mav.addObject("TEXT", "Hello World!");
    mav.setViewName("CharacterCreate");
    return mav;
  }
}
