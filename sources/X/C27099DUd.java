package X;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: X.DUd  reason: case insensitive filesystem */
public class C27099DUd implements Enumeration {
    public Object A00;
    public C24178Bwo A01;

    public static AnonymousClass1Bz A00(C27099DUd dUd) {
        try {
            return dUd.A01.A05();
        } catch (IOException e) {
            throw new C24415C2o(AnonymousClass001.A1E(e, "malformed DER construction: ", AnonymousClass000.A10()), e);
        }
    }

    public boolean hasMoreElements() {
        return AnonymousClass000.A1W(this.A00);
    }

    public Object nextElement() {
        Object obj = this.A00;
        if (obj != null) {
            this.A00 = A00(this);
            return obj;
        }
        throw BE6.A14();
    }
}
