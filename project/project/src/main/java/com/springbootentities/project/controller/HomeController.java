package controller;

@RestController
public class HomeController {
    private boolean createNewPresentationStatus;
    private boolean viewPresentationStatus;

    @PostMapping("/createPresentation")
    public ResponseEntity<Home> createNewPresentation(@RequestBody Home presentation) {
        // buhatan pa
    }

    @GetMapping("/presentation/{id}")
    public ResponseEntity<Presentation> viewPresentation(@PathVariable("id") String id) {
        // buhatan pa
    }
}