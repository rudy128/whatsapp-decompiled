package X;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.3tU  reason: invalid class name */
public abstract class AnonymousClass3tU extends AnonymousClass3uM {
    public boolean A00;

    public static void A06(Resources resources, C73203Rj r5, AnonymousClass3uP r6, AnonymousClass1E7 r7, int i) {
        r5.A0S(resources.getString(i, new Object[]{r6.A0l.A0I(r7)}));
        r5.A0Z((DialogInterface.OnClickListener) null, 2131899286);
        r5.A0T(true);
        r5.create().show();
    }

    public static void A07(View view, C79093uR r3) {
        C18140vp r0 = ((C93084iP) r3.A09).A05;
        C18070vi.A0d(r0, 0);
        Drawable drawable = (Drawable) r0.get();
        C18070vi.A0b(drawable);
        view.setBackground(drawable);
        r3.A0U = false;
    }

    public static void A08(C19880zA r1, AnonymousClass10E r2, AnonymousClass10G r3, AnonymousClass3uL r4) {
        r4.A03 = (C219217x) r2.ABj.get();
        r4.A06 = (C32431hB) r2.A66.get();
        r4.A08 = C000200d.A00(r2.Aau);
        r4.A07 = (C139246yW) r3.AD7.get();
        r4.A05 = (C32861hs) r2.Agw.get();
        r4.A04 = (C86324Re) r3.A7Y.get();
        r4.A01 = r1;
    }

    public void A1M() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass3uL r5 = (AnonymousClass3uL) this;
            C27691Xc r6 = (C27691Xc) AnonymousClass3MX.A0T(this);
            AnonymousClass10E r4 = r6.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r4, r6, r5);
            AnonymousClass10G r2 = r4.A00;
            AnonymousClass3uQ.A16(r2, r5);
            AnonymousClass3uQ.A0w(A0n, r4, r2, r5);
            AnonymousClass3uQ.A12(r4, r2, r5);
            AnonymousClass3uQ.A0y(A0n, r4, r5, BE8.A0d(r4));
            AnonymousClass3uQ.A13(r4, r2, r5, r4.ABq);
            AnonymousClass3uQ.A0x(A0n, r4, r2, r5, r4.AIy);
            C19890zB r1 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r1, r4, r2, r6, r5);
            AnonymousClass3uQ.A11(r4, r2, r5);
            AnonymousClass3uQ.A15(r4, r5);
            AnonymousClass3uQ.A0s(r1, A0n, r4, r2, r5);
            AnonymousClass3uQ.A0u(r1, r4, r2, r6, r5);
            AnonymousClass3uQ.A0t(r1, A0n, r4, r6, r5);
            AnonymousClass3uQ.A10(r4, r2, r5);
            AnonymousClass3uQ.A0z(r4, r2, r6, r5, AnonymousClass3uQ.A0o(r4));
            A08(r1, r4, r2, r5);
        }
    }

    public static void A09(C79093uR r0, AnonymousClass00H r1, int i) {
        ((C57802jf) r1.get()).A00((AnonymousClass21V) r0.A0I, i);
    }
}
