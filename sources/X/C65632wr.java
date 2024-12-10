package X;

import android.content.Context;

/* renamed from: X.2wr  reason: invalid class name and case insensitive filesystem */
public class C65632wr implements C18290w6 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C65632wr(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final Object get() {
        if (this.A00 != 0) {
            C18330wD r2 = (C18330wD) this.A02;
            return r2.A02.BGj(new C18750x6(r2, (C18410wM) this.A01));
        }
        C18220vy r0 = (C18220vy) this.A01;
        return new C19730ys((Context) this.A02, (C18430wO) r0.A02.BMD(C18430wO.class), r0.A04());
    }
}
