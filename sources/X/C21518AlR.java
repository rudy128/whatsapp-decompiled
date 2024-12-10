package X;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* renamed from: X.AlR  reason: case insensitive filesystem */
public final class C21518AlR implements HostnameVerifier {
    public final String A00;
    public final HostnameVerifier A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C21518AlR alR = (C21518AlR) obj;
            if (this.A00.equals(alR.A00)) {
                return this.A01.equals(alR.A01);
            }
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, C17880vN.A03(this.A00));
    }

    public boolean verify(String str, SSLSession sSLSession) {
        return this.A01.verify(this.A00, sSLSession);
    }

    public C21518AlR(String str, HostnameVerifier hostnameVerifier) {
        this.A00 = str;
        this.A01 = hostnameVerifier;
    }
}
