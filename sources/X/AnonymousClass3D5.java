package X;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.net.ssl.SSLSession;

/* renamed from: X.3D5  reason: invalid class name */
public class AnonymousClass3D5 implements Enumeration {
    public SSLSession A00;
    public final /* synthetic */ C219618b A01;
    public final /* synthetic */ Iterator A02;

    public AnonymousClass3D5(C219618b r1, Iterator it) {
        this.A01 = r1;
        this.A02 = it;
    }

    public boolean hasMoreElements() {
        SSLSession sSLSession;
        if (this.A00 != null) {
            return true;
        }
        do {
            Iterator it = this.A02;
            if (it.hasNext()) {
                sSLSession = (SSLSession) it.next();
            } else {
                this.A00 = null;
                return false;
            }
        } while (!sSLSession.isValid());
        this.A00 = sSLSession;
        return true;
    }

    public /* bridge */ /* synthetic */ Object nextElement() {
        if (hasMoreElements()) {
            byte[] id = this.A00.getId();
            this.A00 = null;
            return id;
        }
        throw new NoSuchElementException();
    }
}
