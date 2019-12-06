package jp.co.systena.tigerscave.rollplayinggame.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.rollplayinggame.application.service.CharForm;

@Controller
public class DonburiQuestController {

  // キャラクター作成画面
  @RequestMapping(value = "/Charcter")
  public ModelAndView CharacterCreate(ModelAndView mav) {
//    mav.addObject("TEXT", "Hello World!");
    mav.setViewName("CharacterCreate");
    return mav;
  }

  //コマンド画面
  @RequestMapping(value = "/Command", method = RequestMethod.POST)
  public ModelAndView Command(ModelAndView mav, CharForm charForm) {
    mav.addObject("TEXT", "Hello World!");
    mav.setViewName("Command");
    return mav;
  }
}
