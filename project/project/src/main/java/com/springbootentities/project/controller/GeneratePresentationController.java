package controller;

@RestController
public class GeneratePresentationController {
    private boolean generatePresentationStatus;
    private boolean downloadPresentationStatus;

    @PostMapping("/generatePresentation")
    public ResponseEntity<GeneratePresentation> generatePresentation(@RequestBody GeneratePresentation presentation) {
        // buhatan pa
    }

    @GetMapping("/downloadPresentation/{id}")
    public ResponseEntity<byte[]> downloadPresentation(@PathVariable("id") String id) {
        // buhatan pa
    }

    // pak ganurn methods
}
