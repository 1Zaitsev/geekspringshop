package qdo_ln.geekspringshop.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import qdo_ln.geekspringshop.services.ProductService;


@Controller
@RequiredArgsConstructor
public class ShopController {

    private final ProductService productService;

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String index(Model uiModel, @RequestParam(required = false) Integer category){
        uiModel.addAttribute("products", productService.findAll(category));
        return "index";
    }

}
