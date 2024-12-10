package X;

/* renamed from: X.2Qv  reason: invalid class name and case insensitive filesystem */
public enum C49532Qv {
    UNENCRYPTED("unencrypted"),
    PASSWORD_ENCRYPTED("password_encrypted"),
    ENCRYPTION_KEY_ENCRYPTED("encryption_key_encrypted"),
    PASSKEY_ENCRYPTED("passkey_encrypted");
    
    public final String persistedName;

    /* access modifiers changed from: public */
    static {
        C49532Qv[] r1;
        A00 = C19780yz.A00(r1);
    }

    /* access modifiers changed from: public */
    C49532Qv(String str) {
        this.persistedName = str;
    }
}
