package X;

import android.view.ViewGroup;

/* renamed from: X.3Wl  reason: invalid class name and case insensitive filesystem */
public class C73563Wl extends C38391rD {
    public final AnonymousClass01E A00;
    public final AnonymousClass3TL A01;
    public final int[] A02;
    public final int[] A03;
    public final int[] A04;

    public int A0Q() {
        return this.A03.length;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r3, int i) {
        C74303Zh r32 = (C74303Zh) r3;
        boolean A1T = AnonymousClass000.A1T(i, C72463Mc.A0A(this.A01.A01));
        r32.A0B(A1T, i);
        r32.A01.setChecked(A1T);
    }

    public C73563Wl(AnonymousClass01E r1, AnonymousClass3TL r2, int[] iArr, int[] iArr2, int[] iArr3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = iArr;
        this.A04 = iArr2;
        this.A02 = iArr3;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C74303Zh r2 = new C74303Zh(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625519), this.A03, this.A04, this.A02);
        this.A01.A01.A0A(this.A00, r2);
        C90014dO.A00(r2.A00, this, r2, 43);
        return r2;
    }
}
