package Client.Commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class Hello {

    @ShellMethod(key = "helloK", value = "I'll say hello")
    public String hello(){
        return "Hello, World!";
    }
    
    @ShellMethod(key = "goodbyeK", value = "I'll say goodbye")
    public String goodbye(){
        return "goodbe, World";
    }
}
