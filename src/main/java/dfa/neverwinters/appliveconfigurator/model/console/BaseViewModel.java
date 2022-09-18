package dfa.neverwinters.appliveconfigurator.model.console;

import dfa.neverwinters.appliveconfigurator.utils.AppConstants;

public class BaseViewModel {

    private boolean error;
    private String message;

    public BaseViewModel()
    {

        this.error = AppConstants.FALSE;
        this.message = AppConstants.EMPTY_STRING;

    }

    public boolean isError() { return error; }

    public void setError(boolean error) { this.error = error; }

    public String getMessage() { return message; }

    public void setMessage(String message) { this.message = message; }
}

