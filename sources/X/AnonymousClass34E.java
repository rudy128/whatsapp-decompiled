package X;

import android.content.Context;

/* renamed from: X.34E  reason: invalid class name */
public class AnonymousClass34E implements E8E {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AnonymousClass34E(AnonymousClass34B r1, C55982gh r2, AnonymousClass1T5 r3, C58192kI r4, int i) {
        this.A00 = i;
        this.A01 = r3;
        this.A03 = r2;
        this.A02 = r1;
        this.A04 = r4;
    }

    public void Bud(C55362fe r9) {
        if (r9.A03) {
            AnonymousClass1T5 r2 = (AnonymousClass1T5) this.A01;
            AnonymousClass1T3 r1 = r2.A03;
            AnonymousClass34B r6 = (AnonymousClass34B) this.A02;
            String str = ((C58192kI) this.A04).A09;
            Context context = r2.A00.A00;
            if (str != null) {
                C218617r r4 = r1.A00;
                AnonymousClass1KW r5 = r1.A01;
                C18070vi.A0d(r4, 1);
                C18070vi.A0d(r5, 2);
                C18070vi.A0d(context, 5);
                C144737Im r22 = new C144737Im(context, r4, r5, r6, str);
                r1.A04(r22.BUa(), r22);
            }
        }
        ((C55982gh) this.A03).A05.A04(r9);
    }

    public void C6O() {
        ((C55982gh) this.A03).A03.A04(AnonymousClass000.A0i());
    }
}
