package models;

public class ViewPresentation {
    private String presentationID;
    private List<PresentationSlide> presentationSlide;
    private int slideIndex;

    public Presentation getPresentation() {
        // buhatan pa
    }

    public PresentationSlide getPresentationSlide() {
        // buhatan pa
    }

    public int getSlideIndex() {
        // buhatan pa
    }

    public String getPresentationID() {
        return presentationID;
    }

    public void setPresentationID(String presentationID) {
        this.presentationID = presentationID;
    }

    public List<PresentationSlide> getPresentationSlide() {
        return presentationSlide;
    }

    public void setPresentationSlide(List<PresentationSlide> presentationSlide) {
        this.presentationSlide = presentationSlide;
    }

    public int getSlideIndex() {
        return slideIndex;
    }

    public void setSlideIndex(int slideIndex) {
        this.slideIndex = slideIndex;
    }
}
