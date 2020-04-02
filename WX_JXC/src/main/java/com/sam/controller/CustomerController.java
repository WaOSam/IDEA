package com.sam.controller;

import com.sam.pojo.Customer;
import com.sam.pojo.CustomerExample;
import com.sam.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 作者 Sam_T
 * 描述 
 * 日期 2020/3/22
 * @Param
 * @return
 **/
@Controller
@RequestMapping("customer")
public class CustomerController extends BaseController<Customer, CustomerExample> {
    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
        this.baseService = customerService;
    }

    /*
    @Autowired
    private CustomerService customerService;

    @Autowired
    private UserService userService;

    @RequestMapping("queryExample")
    @ResponseBody
    public String queryExample(){
        List<Customer> list = customerService.queryExample();
        Map<String, Object> map = new HashMap<>();

        map.put("list", list);
        map.put("总记录数", customerService.count());

        String res = JSON.toJSONString(map);

        return res;
    }

    @RequestMapping("count")
    @ResponseBody
    public String count(){
        int res = customerService.count();
        String json = JSON.toJSONString(res);

        return json;
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("listCustomer")
    @ResponseBody
    public String listCustomer() throws Exception {
        return JSON.toJSONString(customerService.list());
    }

    @RequestMapping("listUser")
    @ResponseBody
    public String listUser() throws Exception {
        return JSON.toJSONString(userService.list());
    }

    @RequestMapping("add")
    public void insert(){
        Customer customer = new Customer();
        customer.setCustId(5);
        customer.setCustName("尝试使用抽取");
        customer.setCustPhone("1234775");
        customer.setCustAddress("在哪都行");
        customer.setCustBank("不晓得什么银行");
        customerService.insert(customer);
    }*/
}
