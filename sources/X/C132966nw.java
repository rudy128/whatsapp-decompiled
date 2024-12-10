package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.6nw  reason: invalid class name and case insensitive filesystem */
public final class C132966nw {
    public final AnonymousClass1KB A00;
    public final AnonymousClass11E A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass1VP A06;

    public final View A00(ViewGroup viewGroup, AnonymousClass1FL r11, int i) {
        C18070vi.A0d(viewGroup, 0);
        LayoutInflater layoutInflater = r11.getLayoutInflater();
        int A002 = AnonymousClass1YL.A00(viewGroup.getContext(), 2130970097, C72473Md.A06(viewGroup));
        return C88554a7.A01(layoutInflater, new AnonymousClass78T(this, i, 7, r11), viewGroup, 2131233226, A002, 2131892453);
    }

    public C132966nw(AnonymousClass1KB r1, AnonymousClass1VP r2, AnonymousClass11E r3, C18030ve r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r4, r1, r3, r5, r2);
        C18070vi.A0l(r6, r7);
        this.A02 = r4;
        this.A00 = r1;
        this.A01 = r3;
        this.A03 = r5;
        this.A06 = r2;
        this.A05 = r6;
        this.A04 = r7;
    }
}
