package X;

import java.util.ArrayList;

/* renamed from: X.Aeh  reason: case insensitive filesystem */
public class C21113Aeh implements AnonymousClass1TI {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C21113Aeh(C167198fc r1, int i, int i2) {
        this.A00 = i2;
        this.A02 = r1;
        this.A01 = i;
    }

    public final void accept(Object obj) {
        ArrayList arrayList;
        AnonymousClass9LH r1;
        int i = this.A00;
        C167198fc r3 = (C167198fc) this.A02;
        int i2 = this.A01;
        synchronized (r3) {
            if (i != 0) {
                r3.A03.set(i2, obj);
                int i3 = r3.A00 - 1;
                r3.A00 = i3;
                if (i3 != 0) {
                    return;
                }
            } else {
                r3.A02.set(i2, obj);
                r3.A01 = true;
                int i4 = r3.A00 - 1;
                r3.A00 = i4;
                if (i4 != 0) {
                    return;
                }
            }
            synchronized (r3) {
                arrayList = null;
                if (r3.A01) {
                    r1 = null;
                    arrayList = C17880vN.A10(r3.A02);
                } else {
                    r1 = new AnonymousClass9LH(r3.A03);
                }
            }
            if (arrayList != null) {
                r3.A0B(arrayList);
            } else {
                r3.A0C(r1);
            }
        }
    }
}
