package constants;

public enum AuthorizationTextError {

    ERROR_LOGIN_OR_PASSWORD("Не правильный логин или пароль"),
    ERROR_NOT_GOOD("Все пошло не очень...");

    private final String error;

    AuthorizationTextError(String error) {
        this.error = error;
    }

    public String getErrorText() {
        return error;
    }

}
