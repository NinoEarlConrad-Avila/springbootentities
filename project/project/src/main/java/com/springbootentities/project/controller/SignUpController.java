package controller;

@RestController
public class SignUpController {
    private boolean signUpStatus;

    @PostMapping("/signup")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        // buhatan pa
    }

    // Churbachuchu methods
}