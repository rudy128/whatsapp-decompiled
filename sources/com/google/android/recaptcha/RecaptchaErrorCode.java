package com.google.android.recaptcha;

import X.C19780yz;
import X.C19810z2;

public enum RecaptchaErrorCode {
    UNKNOWN_ERROR(0, "Unknown Error"),
    NETWORK_ERROR(1, "Network Error"),
    INVALID_SITEKEY(2, "Site key invalid"),
    INVALID_KEYTYPE(3, "Key type invalid"),
    INVALID_PACKAGE_NAME(4, "Package name not allowed"),
    INVALID_ACTION(5, "Invalid action name, may only include alphanumeric characters like [A-Z], [a-z], [0-9], / and _. Do not include user-specific information"),
    INVALID_TIMEOUT(6, "Invalid timeout, minimum value is 5_000L milliseconds"),
    INTERNAL_ERROR(100, "Internal Error");
    
    public final int errorCode;
    public final String errorMessage;

    /* access modifiers changed from: public */
    static {
        RecaptchaErrorCode[] $values;
        $ENTRIES = C19780yz.A00($values);
    }

    public static C19810z2 getEntries() {
        return $ENTRIES;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* access modifiers changed from: public */
    RecaptchaErrorCode(int i, String str) {
        this.errorCode = i;
        this.errorMessage = str;
    }
}
