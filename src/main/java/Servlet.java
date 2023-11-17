import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import org.graalvm.polyglot.Source;

import java.io.IOException;

@WebServlet(name = "Servlet", urlPatterns = "/", loadOnStartup = 1)
public class Servlet extends HttpServlet
{
    public void init()
    {
        {
            try
            {
                Source.newBuilder("js", "", "DUMMY").build();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}