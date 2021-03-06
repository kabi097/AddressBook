package addressbook;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactEditorController {
    @FXML private Label errorLabel;
    @FXML private Button okButton;
    @FXML private Button cancelButton;
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField nameField;
    @FXML private TextField pseudonymField;
    @FXML private TextField hausePhoneNumberField;
    @FXML private TextField faxPhoneNumberField;
    @FXML private TextField pagerPhoneNumberField;
    @FXML private TextField emailField;
    @FXML private TextField phoneNumberField;
    @FXML private TextField workPhoneNumberField;
    @FXML private TextField secondEmailField;
    @FXML private TextField addressField;
    @FXML private TextField cityField;
    @FXML private TextField voivodeshipField;
    @FXML private TextField postalCodeField;
    @FXML private TextField countryField;
    @FXML private TextField websiteField;
    @FXML private DatePicker birthdayField;
    @FXML private TextField officeField;
    @FXML private TextField departamentField;
    @FXML private TextField companyNameField;
    @FXML private TextField companyAddressField;
    @FXML private TextField companyAddres;
    @FXML private TextField companyPostalCodeField;
    @FXML private TextField companyCountryField;
    @FXML private TextField companyWebsiteField;
    @FXML private TextField info1Field;
    @FXML private TextField info2Field;
    @FXML private TextField info3Field;
    @FXML private TextField info4Field;
    @FXML private TextArea notesField;
    @FXML private ComboBox<MailingList> mailingListsBox;

    public String getFirstNameField() {
        return firstNameField.getText();
    }

    public String getLastNameField() {
        return lastNameField.getText();
    }

    public String getNameField() {
        return nameField.getText();
    }

    public String getPseudonymField() {
        return pseudonymField.getText();
    }

    public String getHausePhoneNumberField() {
        return hausePhoneNumberField.getText();
    }

    public String getFaxPhoneNumberField() {
        return faxPhoneNumberField.getText();
    }

    public String getPagerPhoneNumberField() {
        return pagerPhoneNumberField.getText();
    }

    public String getEmailField() {
        return emailField.getText();
    }

    public String getPhoneNumberField() {
        return phoneNumberField.getText();
    }

    public String getWorkPhoneNumberField() {
        return workPhoneNumberField.getText();
    }

    public String getSecondEmailField() {
        return secondEmailField.getText();
    }

    public String getAddressField() {
        return addressField.getText();
    }

    public String getCityField() {
        return cityField.getText();
    }

    public String getVoivodeshipField() {
        return voivodeshipField.getText();
    }

    public String getPostalCodeField() {
        return postalCodeField.getText();
    }

    public String getCountryField() {
        return countryField.getText();
    }

    public String getWebsiteField() {
        return websiteField.getText();
    }

    public String getOfficeField() {
        return officeField.getText();
    }

    public String getDepartamentField() {
        return departamentField.getText();
    }

    public String getCompanyNameField() {
        return companyNameField.getText();
    }

    public String getCompanyAddressField() {
        return companyAddressField.getText();
    }

    public String getCompanyAddres() {
        return companyAddres.getText();
    }

    public String getCompanyPostalCodeField() {
        return companyPostalCodeField.getText();
    }

    public String getCompanyCountryField() {
        return companyCountryField.getText();
    }

    public String getCompanyWebsiteField() {
        return companyWebsiteField.getText();
    }

    public String getInfo1Field() {
        return info1Field.getText();
    }

    public String getInfo2Field() {
        return info2Field.getText();
    }

    public String getInfo3Field() {
        return info3Field.getText();
    }

    public String getInfo4Field() {
        return info4Field.getText();
    }

    public String getNotesField() {
        return notesField.getText();
    }

    public LocalDate getBirthdayField() {
        if (birthdayField.getEditor().getText().isEmpty()==true) {
            return null;
        }
        return birthdayField.getValue();
    }

    //Setters

    public void setFirstNameField(String firstName) {
        this.firstNameField.setText(firstName);
    }

    public void setLastNameField(String lastName) {
        this.lastNameField.setText(lastName);
    }

    public void setNameField(String name) {
        this.nameField.setText(name);
    }

    public void setPseudonymField(String pseudonym) {
        this.pseudonymField.setText(pseudonym);
    }

    public void setHausePhoneNumberField(String hausePhoneNumber) {
        this.hausePhoneNumberField.setText(hausePhoneNumber);
    }

    public void setFaxPhoneNumberField(String faxPhoneNumber) {
        this.faxPhoneNumberField.setText(faxPhoneNumber);
    }

    public void setPagerPhoneNumberField(String pagerPhoneNumber) {
        this.pagerPhoneNumberField.setText(pagerPhoneNumber);
    }

    public void setEmailField(String email) {
        this.emailField.setText(email);
    }

    public void setPhoneNumberField(String phoneNumber) {
        this.phoneNumberField.setText(phoneNumber);
    }

    public void setWorkPhoneNumberField(String workPhoneNumber) {
        this.workPhoneNumberField.setText(workPhoneNumber);
    }

    public void setSecondEmailField(String secondEmail) {
        this.secondEmailField.setText(secondEmail);
    }

    public void setAddressField(String address) {
        this.addressField.setText(address);
    }

    public void setCityField(String city) {
        this.cityField.setText(city);
    }

    public void setVoivodeshipField(String voivodeship) {
        this.voivodeshipField.setText(voivodeship);
    }

    public void setPostalCodeField(String postalCode) {
        this.postalCodeField.setText(postalCode);
    }

    public void setCountryField(String country) {
        this.countryField.setText(country);
    }

    public void setWebsiteField(String website) {
        this.websiteField.setText(website);
    }

    public void setOfficeField(String office) {
        this.officeField.setText(office);
    }

    public void setDepartamentField(String departament) {
        this.departamentField.setText(departament);
    }

    public void setCompanyNameField(String companyName) {
        this.companyNameField.setText(companyName);
    }

    public void setCompanyAddressField(String companyAddress) {
        this.companyAddressField.setText(companyAddress);
    }

    public void setCompanyPostalCodeField(String companyPostalCode) {
        this.companyPostalCodeField.setText(companyPostalCode);
    }

    public void setCompanyCountryField(String companyCountry) {
        this.companyCountryField.setText(companyCountry);
    }

    public void setCompanyWebsiteField(String companyWebsite) {
        this.companyWebsiteField.setText(companyWebsite);
    }

    public void setBirthdayField(LocalDate birthday) {
        this.birthdayField.setValue(birthday);
    }

    public void setInfo1Field(String info1) {
        this.info1Field.setText(info1);
    }

    public void setInfo2Field(String info2) {
        this.info2Field.setText(info2);
    }

    public void setInfo3Field(String info3) {
        this.info3Field.setText(info3);
    }

    public void setInfo4Field(String info4) {
        this.info4Field.setText(info4);
    }

    public void setNotesField(String notes) {
        this.notesField.setText(notes);
    }

    private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public boolean formStatus = false;

    private boolean hasMinData() {
        if (nameField.getText().isEmpty()==false || firstNameField.getText().isEmpty()==false || lastNameField.getText().isEmpty()==false) {
            return true;
        } else {
            return false;
        }
    }

    private boolean validateEmail(TextField source) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(source.getText());
        return matcher.find();
    }

    private void setErrorInfo(String errorMsg) {
        errorLabel.setText(errorMsg);

    }

    private void setErrorField(TextField field) {
        field.getStylesheets().add(getClass().getResource("ContactEditorStyle.css").toExternalForm());
    }

    private void setFieldOk(TextField field) {
        field.getStylesheets().clear();
    }

    public boolean validateEmailField() {

        return true;
    }


    public void validateWebsite(Event event) throws MalformedURLException {
        TextField source = (TextField)event.getSource();
        try {
            URL myURL = new URL(source.getText());
        } catch (MalformedURLException e) {
            setErrorInfo("Błąd! Podano niepoprawny e-mail.");
        }
    }

    public void buttonClicked(ActionEvent event) {
        if (event.getSource() == cancelButton) {
            formStatus = false;
            Stage myStage = (Stage)cancelButton.getScene().getWindow();
            myStage.close();
        } else {
            if (hasMinData()==false) {
                setErrorInfo("Wypełnij przynajmniej jedno z zaznaczonych pól");
                setErrorField(nameField);
                setErrorField(lastNameField);
                setErrorField(firstNameField);
                return;
            } else {
                setFieldOk(nameField);
                setFieldOk(lastNameField);
                setFieldOk(firstNameField);
            }

            if (emailField.getText().isEmpty()==false && validateEmail(emailField)==false) {
                setErrorInfo("Błąd! Podano niepoprawny e-mail.");
                setErrorField(emailField);
                return;
            } else {
                setFieldOk(emailField);
            }

            if (secondEmailField.getText().isEmpty()==false && validateEmail(secondEmailField)==false) {
                setErrorInfo("Błąd! Podano niepoprawny e-mail.");
                setErrorField(secondEmailField);
                return;
            } else {
                setFieldOk(secondEmailField);
            }

            formStatus = true;
            Stage myStage = (Stage)okButton.getScene().getWindow();
            myStage.close();
        }
    }

    public void setMailingLists(ObservableList<MailingList> list) {
        mailingListsBox.setItems(list);
        mailingListsBox.getSelectionModel().selectFirst();
    }

    public MailingList getMailingList() {
        return mailingListsBox.getSelectionModel().getSelectedItem();
    }

    public void setMailingList(int id) {
        for (MailingList mailingList : mailingListsBox.getItems()) {
            if (mailingList.getId()==id) {
                mailingListsBox.getSelectionModel().select(mailingList);
                return;
            }
        }
        mailingListsBox.getSelectionModel().selectFirst();
    }
}
