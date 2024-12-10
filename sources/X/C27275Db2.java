package X;

import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;

/* renamed from: X.Db2  reason: case insensitive filesystem */
public class C27275Db2 extends CertPathValidatorException {
    public Throwable cause;

    public C27275Db2() {
        super("OCSP response expired");
    }

    public C27275Db2(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public C27275Db2(String str, Throwable th, CertPath certPath, int i) {
        super(str, th, certPath, i);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public static C27275Db2 A00(String str, Throwable th, CertPath certPath, int i) {
        return new C27275Db2(str, th, certPath, i);
    }
}
