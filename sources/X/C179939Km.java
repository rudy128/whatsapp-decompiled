package X;

/* renamed from: X.9Km  reason: invalid class name and case insensitive filesystem */
public enum C179939Km implements B9I {
    PRIMARY_PAYMENT_METHOD("primary_payment_method"),
    PAYMENT_METHOD("payment_method"),
    ALL_PAYMENT_METHODS("all_payment_methods"),
    CONTACT("contact"),
    ORDER("order"),
    DEVICE("device"),
    ERROR_MAP("error_map"),
    CURRENCY_AMOUNT("currency_amount");
    
    public final String fieldName;

    /* access modifiers changed from: public */
    static {
        C179939Km[] r0;
        A00 = C19780yz.A00(r0);
    }

    /* access modifiers changed from: public */
    C179939Km(String str) {
        this.fieldName = str;
    }

    public String BRa() {
        return this.fieldName;
    }
}
