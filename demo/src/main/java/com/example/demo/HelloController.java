@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Welcome to Jenkins CI/CD!";
    }
}