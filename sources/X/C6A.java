package X;

import android.util.Log;

public abstract class C6A {
    public C6A A00(String str, C22821Di r9) {
        if (!(this instanceof C22724BMl)) {
            return this;
        }
        C22724BMl bMl = (C22724BMl) this;
        Object obj = bMl.A02;
        if (AnonymousClass000.A1Y(r9.invoke(obj))) {
            return bMl;
        }
        return new C22725BMm(bMl.A00, bMl.A01, obj, bMl.A03, str);
    }

    public Object A01() {
        if (this instanceof C22724BMl) {
            return ((C22724BMl) this).A02;
        }
        C22725BMm bMm = (C22725BMm) this;
        int intValue = bMm.A01.intValue();
        if (intValue == 0) {
            throw bMm.A00;
        } else if (intValue == 1) {
            String str = bMm.A04;
            String A1E = AnonymousClass001.A1E(bMm.A02, " value: ", AnonymousClass000.A11(bMm.A03));
            C18070vi.A0d(A1E, 1);
            Log.d(str, A1E);
            return null;
        } else if (intValue == 2) {
            return null;
        } else {
            throw AnonymousClass3MW.A14();
        }
    }
}
