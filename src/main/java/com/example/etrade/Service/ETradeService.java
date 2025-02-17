package com.example.etrade.Service;

import com.example.etrade.Model.Account;
import com.example.etrade.Model.Stock;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ETradeService {

    @Value("${etrade.api.url.accounts}")
    private String accountsUrl;

    @Value("${etrade.api.url.stocks}")
    private String stocksUrl;

    private final RestTemplate restTemplate;

    public ETradeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // Fetch accounts from the E*TRADE API
    public List<Account> getAllAccounts() {
        Account account1 = new Account("12345", "Checking", "1000.50");
        Account account2 = new Account("67890", "Savings", "5000.75");
        return Arrays.asList(account1, account2);
        //return restTemplate.getForObject(accountsUrl, List.class);
    }

    // Fetch stocks in a given account
    public List<Stock> getStocksInAccount(String accountId) {
        Stock stock1 = new Stock("AAPL", 50);
        Stock stock2 = new Stock("GOOGL", 20);
        return Arrays.asList(stock1, stock2);
        //return restTemplate.getForObject(stocksUrl + accountId, List.class);
    }
}
