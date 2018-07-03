package com.example.expensecalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    ExpensesRepository expensesRepository;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("expenses", expensesRepository.findAll());
        return "list";
    }

    @RequestMapping("/calculate")
    public String form(Model model){
        model.addAttribute("expense", new Expenses());
        return "index";
    }

    @PostMapping("/process")
    public String formProcess(@ModelAttribute Expenses expense){
        String s = String.format("%.2f", expense.totalExpenses());
        expense.setTotal(s);

        expensesRepository.save(expense);
        return "redirect:/";
    }
}
