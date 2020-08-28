package m154_crm_web.m154_crm_w.web;

import static io.javalin.apibuilder.ApiBuilder.get;
import static io.javalin.apibuilder.ApiBuilder.post;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import m154_crm_web.m154_crm_w.web.controller.CustomerController;
import m154_crm_web.m154_crm_w.web.controller.ProductController;

public class CrmApp {
		
    public static void main(String[] args) {

		Javalin app = Javalin.create();

		app.config.addStaticFiles("public", Location.CLASSPATH);

        app.routes(() -> {
        	get(Path.Web.CUSTOMERS, CustomerController.showIndex);
        	post(Path.Web.CUSTOMER, CustomerController.selectCustomer);
        	post(Path.Web.CREATE_CUSTOMER, CustomerController.createCustomer);
        	
        	get(Path.Web.PRODUCTS, ProductController.showIndex);
        	post(Path.Web.PRODUCT, ProductController.selectProduct);
        	post(Path.Web.CREATE_PRODUCT, ProductController.createProduct);
        });
        
		app.error(404, ViewUtil.notFound);

		app.start(7070);
    }
}
