package ui;

@Component
public class HomeUI {
    private String label1;
    private Button btnCreateNewPresentation;
    private Button btnViewPresentation;

    public String getLabel1() {
        return label1;
    }

    public void setLabel1(String label1) {
        this.label1 = label1;
    }

    public Button getBtnCreateNewPresentation() {
        return btnCreateNewPresentation;
    }

    public void setBtnCreateNewPresentation(Button btnCreateNewPresentation) {
        this.btnCreateNewPresentation = btnCreateNewPresentation;
    }

    public Button getBtnViewPresentation() {
        return btnViewPresentation;
    }

    public void setBtnViewPresentation(Button btnViewPresentation) {
        this.btnViewPresentation = btnViewPresentation;
    }
}