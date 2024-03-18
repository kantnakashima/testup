package com.example.ginkou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ginkou.model.UsresetModel;
import com.example.ginkou.service.MainService;

import io.micrometer.common.lang.NonNull;

@Controller
public class MainController {
	@Autowired
	private MainService MainService;
  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("message", "ようこそ");
    return "top";
  }
  
  @GetMapping("/roguin")
  public String indrx(Model model) {
    model.addAttribute("message", "通帳情報2");
    return "roguin";
  }
  
  @GetMapping("/top2")
  public String balanse(Model model) {
	model.addAttribute("kanryou", "ログイン中");
	return "top2";
  }
 
  @GetMapping("/nyukin")
  public String balase(Model model) {
	model.addAttribute("kanryou", "完了ページ");
	return "nyukin";
  }

  @GetMapping("/syukkin")
  public String balane(Model model) {
	model.addAttribute("kanryou", "完了ページ");
	return "syukkin";
  }

  @GetMapping("/rireki")
  public String balne(Model model) {
	model.addAttribute("kanryou", "完了ページ");
	return "rireki";
  }

    @GetMapping("/touroku/")
    public ModelAndView add(UsresetModel Usresetmodel, ModelAndView model) {
        model.addObject("userset", Usresetmodel);
        model.setViewName("touroku");
        return model;
    }
    
    @PostMapping("/touroku/")
    public String userset(@Validated @ModelAttribute @NonNull UsresetModel UsresetModel, RedirectAttributes result, ModelAndView model,
            RedirectAttributes redirectAttributes) {
        try {
            this.MainService.save(UsresetModel);
            redirectAttributes.addFlashAttribute("exception", "");

        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("exception", e.getMessage());
        }
        return "roguin";

      }
}


