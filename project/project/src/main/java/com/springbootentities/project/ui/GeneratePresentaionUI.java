package ui;

@Component
public class GeneratePresentationUI {
    private String txtTopic;
    private String txtKeypoint;
    private int txtSlidesNumber;
    private String label1;
    private String label2;
    private String label3;
    private Button btnGeneratePresentation;
    private Button btnDownloadPresentation;
    private Container ctnPowerPointPreview;

    public String getTxtTopic() {
        return txtTopic;
    }

    public void setTxtTopic(String txtTopic) {
        this.txtTopic = txtTopic;
    }

    public String getTxtKeypoint() {
        return txtKeypoint;
    }

    public void setTxtKeypoint(String txtKeypoint) {
        this.txtKeypoint = txtKeypoint;
    }

    public int getTxtSlidesNumber() {
        return txtSlidesNumber;
    }

    public void setTxtSlidesNumber(int txtSlidesNumber) {
        this.txtSlidesNumber = txtSlidesNumber;
    }

    public String getLabel1() {
        return label1;
    }

    public void setLabel1(String label1) {
        this.label1 = label1;
    }

    public String getLabel2() {
        return label2;
    }

    public void setLabel2(String label2) {
        this.label2 = label2;
    }

    public String getLabel3() {
        return label3;
    }

    public void setLabel3(String label3) {
        this.label3 = label3;
    }

    public Button getBtnGeneratePresentation() {
        return btnGeneratePresentation;
    }

    public void setBtnGeneratePresentation(Button btnGeneratePresentation) {
        this.btnGeneratePresentation = btnGeneratePresentation;
    }

    public Button getBtnDownloadPresentation() {
        return btnDownloadPresentation;
    }

    public void setBtnDownloadPresentation(Button btnDownloadPresentation) {
        this.btnDownloadPresentation = btnDownloadPresentation;
    }

    public Container getCtnPowerPointPreview() {
        return ctnPowerPointPreview;
    }

    public void setCtnPowerPointPreview(Container ctnPowerPointPreview) {
        this.ctnPowerPointPreview = ctnPowerPointPreview;
    }
}