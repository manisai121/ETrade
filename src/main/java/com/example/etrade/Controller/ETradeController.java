package com.example.etrade.Controller;

import com.example.etrade.Model.Account;
import com.example.etrade.Model.Stock;
import com.example.etrade.Service.ETradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ETradeController {

    @Autowired
    private ETradeService eTradeService;

    @GetMapping("/accounts")
    public List<Account> getAllAccounts() {
        // Return dummy data instead of making an API call
        return eTradeService.getAllAccounts();
    }

    @GetMapping("/accounts/{accountId}/stocks")
    public List<Stock> getStockListForAccount(@PathVariable String accountId) {
        // Return dummy stock list data
        return eTradeService.getStocksInAccount(accountId);
    }
}
