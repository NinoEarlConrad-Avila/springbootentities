package controller;

@RestController
public class ViewPresentationController {
    private boolean btnDownloadPresentationStatus;

    @GetMapping("/downloadPresentation")
    public ResponseEntity<byte[]> downloadPresentation() {
        // buhatan pa
    }

    @GetMapping("/currentSlide")
    public ResponseEntity<PresentationSlide> getCurrentSlide() {
        // buhatan pa
    }

    @GetMapping("/previousSlide")
    public ResponseEntity<PresentationSlide> getPreviousSlide() {
        // buhatan pa
    }

    @GetMapping("/nextSlide")
    public ResponseEntity<PresentationSlide> getNextSlide() {
        // buhatan pa
    }
}