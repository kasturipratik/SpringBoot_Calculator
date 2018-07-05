package com.example.expensecalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/expenseCalculate")
    public String expense(Model model){
        model.addAttribute("expense", new Expenses());
        return "expense";
    }

    @GetMapping("/mortgageCalculate")
    public String mortgage(Model model){
        model.addAttribute("mortgage", new Mortgage());
        return "mortgage";
    }

    @GetMapping("/autoloanCalculate")
    public String autoLoan(Model model){
        model.addAttribute("autoLoan", new AutoLoan());
        return "autoLoan";
    }

    @PostMapping("/processAutoloan")
    public String reload(@ModelAttribute AutoLoan loan, Model model, BindingResult result){
        if(result.hasErrors()){
            return "redirect:/autoLoan";
        }
        String l = String.format("%.2f",loan.totalLoan (loan.getRate(),loan.getPrincipal(),loan.getMonth()));
        loan.setLoanAmount(l);

        String month =String.format("%.2f",loan.monthlyPayment(loan.getRate(),loan.getPrincipal(),loan.getMonth()));
        loan.setMonthlyPayment(month);

        String interest =String.format("%.2f",loan.totalInterest(loan.getRate(),loan.getPrincipal(),loan.getMonth()));
        loan.setInterestAmount(interest);

        model.addAttribute("autoLoan", loan);
        return "autoLoan";
    }

    /*  public String index(Model model){
        model.addAttribute("expenses", expensesRepository.findAll());
        return "list";
    }

    @RequestMapping("/calculate")
    public String form(Model model){
        model.addAttribute("expense", new Expenses());
        return "expense";
    }

    @PostMapping("/processExpenses")
    public String formProcess(@ModelAttribute Expenses expense){
        String s = String.format("%.2f", expense.totalExpenses());
        expense.setTotal(s);

        expensesRepository.save(expense);
        return "redirect:/";
    }*/
}

