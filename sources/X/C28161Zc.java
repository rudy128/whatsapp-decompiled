package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.1Zc  reason: invalid class name and case insensitive filesystem */
public class C28161Zc extends C28151Zb {
    public static final AnonymousClass1HO A00;

    public final void A0A(View view) {
    }

    static {
        WindowInsets windowInsets = WindowInsets.CONSUMED;
        AnonymousClass1HO r0 = AnonymousClass1HO.A01;
        C28111Yx.A02(windowInsets);
        A00 = new AnonymousClass1HO(windowInsets);
    }

    public C33321id A05(int i) {
        return C33321id.A01(this.A04.getInsets(C33371ii.A00(i)));
    }

    public C33321id A06(int i) {
        return C33321id.A01(this.A04.getInsetsIgnoringVisibility(C33371ii.A00(i)));
    }

    public boolean A0D(int i) {
        return this.A04.isVisible(C33371ii.A00(i));
    }

    public C28161Zc(AnonymousClass1HO r1, WindowInsets windowInsets) {
        super(r1, windowInsets);
    }
}
