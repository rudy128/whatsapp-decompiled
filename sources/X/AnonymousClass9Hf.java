package X;

/* renamed from: X.9Hf  reason: invalid class name */
public enum AnonymousClass9Hf {
    KEY_CODE_EMPTY(1001, "Your organization key is empty. Please provide a organization key."),
    KEY_CODE_INVALID(1002, "Your organization key is invalid. Please contact your system administrator or UPI support team."),
    PARSER_MISCONFIG(1004, "XML Parser configuration error.Keys.xml may not be formatted correctly."),
    KEYS_NOT_VALID(1006, "Keys are not valid. Please contact your system administrator UPI support team"),
    UNKNOWN_ERROR(1007, "Unknown error occurred."),
    TRUST_NOT_VALID(1008, "Trust is not valid");
    
    public final int i;
    public final String j;

    /* access modifiers changed from: public */
    static {
        KEY_CODE_EMPTY = new AnonymousClass9Hf("KEY_CODE_EMPTY", 0, 1001, "Your organization key is empty. Please provide a organization key.");
        KEY_CODE_INVALID = new AnonymousClass9Hf("KEY_CODE_INVALID", 1, 1002, "Your organization key is invalid. Please contact your system administrator or UPI support team.");
        new AnonymousClass9Hf("PUBLICKEY_NOT_FOUND", 2, 1003, "Public key file not found please contact your system administrator UPI support team");
        PARSER_MISCONFIG = new AnonymousClass9Hf("PARSER_MISCONFIG", 3, 1004, "XML Parser configuration error.Keys.xml may not be formatted correctly.");
        new AnonymousClass9Hf("XML_PATH_ERROR", 4, 1005, "XML File is not found or cannot be read.");
        KEYS_NOT_VALID = new AnonymousClass9Hf("KEYS_NOT_VALID", 5, 1006, "Keys are not valid. Please contact your system administrator UPI support team");
        UNKNOWN_ERROR = new AnonymousClass9Hf("UNKNOWN_ERROR", 6, 1007, "Unknown error occurred.");
        TRUST_NOT_VALID = new AnonymousClass9Hf("TRUST_NOT_VALID", 7, 1008, "Trust is not valid");
    }

    /* access modifiers changed from: public */
    AnonymousClass9Hf(int i2, String str) {
        this.i = i2;
        this.j = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.i);
        A10.append(": ");
        return AnonymousClass000.A0y(this.j, A10);
    }
}
