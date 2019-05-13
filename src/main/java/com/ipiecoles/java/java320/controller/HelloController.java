package com.ipiecoles.java.java320.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    /**
     *
     * @param name
     * @param n
     * @return
    @RequestMapping(value = "/{name}")
    public String sayHello(

            @RequestParam (value = "name") String name,
            @PathVariable (value = "name2") String n){
        return "<html><head>"
        + "<title>Hello Servlet</title>"
        + "</head><body>"
        + "<h1>" + n + " Hello " + name + " !</h1>"
        + "</body></html>";
    }
     */

    /** Exemple de GET
     *
     *     @RequestMapping(value = "/{nom}")
     *     public String sayHello(@RequestParam(value = "nom", defaultValue = "Carole") String nom){
     *         return "<html><head>"
     *         + "<title>Hello Servlet</title>"
     *         + "</head><body>"
     *         + "<h1>Hello " + nom + " !</h1>"
     *         + "</body></html>";
     *     }
     */
}
