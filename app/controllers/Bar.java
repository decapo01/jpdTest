package controllers;

import play.mvc.Result;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import cn.bran.play.JapidController;

@Path("")
public class Bar extends JapidController{
    
    @GET
    public static Result yahoo(){
        return ok("Yahoo!! foo");
    }
    
    @GET
    public static Result hello(){
        return ok("hello");
    }
}
