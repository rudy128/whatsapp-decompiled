package X;

/* renamed from: X.9Qz  reason: invalid class name and case insensitive filesystem */
public abstract class C181569Qz {
    public static final C193939qu A00(Throwable th) {
        String str;
        String A0l;
        Class<?> cls;
        String str2 = null;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        if (th instanceof BKE) {
            A0l = "CreateCredentialCancellationException";
        } else if (th instanceof AnonymousClass8EL) {
            A0l = "CreateCredentialCustomException";
        } else if (th instanceof BKF) {
            A0l = "CreateCredentialInterruptedException";
        } else if (th instanceof BKG) {
            A0l = "CreateCredentialNoCreateOptionException";
        } else if (th instanceof AnonymousClass8EM) {
            A0l = "CreateCredentialProviderConfigurationException";
        } else if (th instanceof BKH) {
            A0l = "CreateCredentialUnknownException";
        } else if (th instanceof BKI) {
            A0l = "CreateCredentialUnsupportedException";
        } else if (th instanceof AnonymousClass8EQ) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("CreatePublicKeyCredentialDomException (");
            A0l = AnonymousClass8BW.A0l(((AnonymousClass8EQ) th).domError.A00, A10, ')');
        } else if (th instanceof AnonymousClass8ER) {
            A0l = "CreatePublicKeyCredentialException";
        } else if (th instanceof C2O) {
            A0l = "CreateCredentialException";
        } else if (th instanceof BKJ) {
            A0l = "GetCredentialCancellationException";
        } else if (th instanceof AnonymousClass8EN) {
            A0l = "GetCredentialCustomException";
        } else if (th instanceof BKK) {
            A0l = "GetCredentialInterruptedException";
        } else if (th instanceof AnonymousClass8EP) {
            A0l = "GetCredentialProviderConfigurationException";
        } else if (th instanceof BKL) {
            A0l = "GetCredentialUnknownException";
        } else if (th instanceof BKM) {
            A0l = "GetCredentialUnsupportedException";
        } else if (th instanceof BKN) {
            A0l = "NoCredentialException";
        } else if (th instanceof AnonymousClass8ES) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("GetPublicKeyCredentialDomException (");
            A0l = AnonymousClass8BW.A0l(((AnonymousClass8ES) th).domError.A00, A102, ')');
        } else if (th instanceof AnonymousClass8EO) {
            A0l = "GetPublicKeyCredentialException";
        } else if (th instanceof C24398C1t) {
            A0l = "GetCredentialException";
        } else {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("unexpected exception (");
            if (!(th == null || (cls = th.getClass()) == null)) {
                str2 = cls.getCanonicalName();
            }
            A0l = AnonymousClass8BW.A0l(str2, A103, ')');
        }
        return new C193939qu(A0l, str);
    }
}
