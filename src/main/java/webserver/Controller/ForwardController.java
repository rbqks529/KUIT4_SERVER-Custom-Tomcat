package webserver.Controller;

import webserver.HttpRequest;
import webserver.HttpResponse;
import java.io.IOException;

public class ForwardController implements Controller {
    @Override
    public void execute(HttpRequest request, HttpResponse response) throws IOException {
        response.forward(request.getPath());
    }
}
