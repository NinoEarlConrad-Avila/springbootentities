package ui;

@Component
public class SignUpUI {
    private TextBox txtUsername;
    private TextBox txtPassword;
    private TextBox txtFirstname;
    private TextBox txtLastname;
    private TextBox txtEmail;
    private Button btnSignUp;

    public TextBox getTxtUsername() {
        return txtUsername;
    }

    public void setTxtUsername(TextBox txtUsername) {
        this.txtUsername = txtUsername;
    }

    public TextBox getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(TextBox txtPassword) {
        this.txtPassword = txtPassword;
    }

    public TextBox getTxtFirstname() {
        return txtFirstname;
    }

    public void setTxtFirstname(TextBox txtFirstname) {
        this.txtFirstname = txtFirstname;
    }

    public TextBox getTxtLastname() {
        return txtLastname;
    }

    public void setTxtLastname(TextBox txtLastname) {
        this.txtLastname = txtLastname;
    }

    public TextBox getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(TextBox txtEmail) {
        this.txtEmail = txtEmail;
    }

    public Button getBtnSignUp() {
        return btnSignUp;
    }

    public void setBtnSignUp(Button btnSignUp) {
        this.btnSignUp = btnSignUp;
    }
}
