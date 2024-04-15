package models;

public class GeneratePresentation {
    private String topicName;
    private String keyPoints;
    private int numOfSlides;

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getKeyPoints() {
        return keyPoints;
    }

    public void setKeyPoints(String keyPoints) {
        this.keyPoints = keyPoints;
    }

    public int getNumOfSlides() {
        return numOfSlides;
    }

    public void setNumOfSlides(int numOfSlides) {
        this.numOfSlides = numOfSlides;
    }
}