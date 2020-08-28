package m154_crm_web.m154_crm_w.web;



import io.javalin.http.ErrorHandler;

public class ViewUtil {

    public static ErrorHandler notFound = ctx -> {
        ctx.render(Path.Template.NOT_FOUND);
    };
    

}
