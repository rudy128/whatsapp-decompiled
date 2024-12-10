package X;

import android.content.Context;

/* renamed from: X.6Mz  reason: invalid class name and case insensitive filesystem */
public final class C122156Mz extends C142837Az {
    public final AnonymousClass118 A00;
    public final AnonymousClass34B A01;
    public final C128806gi A02;

    public C122156Mz(AnonymousClass118 r3, C32861hs r4, AnonymousClass21W r5) {
        this.A00 = null;
        this.A00 = r3;
        this.A01 = r4.A04(C32861hs.A00(r4, r5));
        this.A02 = null;
    }

    public E9Q BHH() {
        E9Q bpi;
        AnonymousClass34B r3 = this.A01;
        Context context = this.A00.A00;
        if (r3 != null) {
            bpi = new AnonymousClass6N0(context, r3, this.A02);
        } else {
            bpi = new BPI(context);
        }
        return bpi;
    }

    public C122156Mz(AnonymousClass118 r2, C32861hs r3, AnonymousClass21W r4, C128806gi r5) {
        this.A00 = null;
        this.A00 = r2;
        this.A01 = r3.A04(C32861hs.A00(r3, r4));
        this.A02 = r5;
    }
}
