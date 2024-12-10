package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.1rT  reason: invalid class name and case insensitive filesystem */
public final class C38551rT {
    public final Context A00;
    public final AnonymousClass11C A01;
    public final AnonymousClass1KW A02;
    public final C18030ve A03;
    public final C28931bI A04;
    public final boolean A05;
    public final View A06;
    public final AnonymousClass1LU A07;
    public final C38541rS A08;

    public C38551rT(View view, AnonymousClass11C r5, AnonymousClass1KW r6, C18030ve r7, AnonymousClass1LU r8, C38541rS r9, boolean z) {
        C18070vi.A0d(r7, 1);
        C18070vi.A0d(r9, 2);
        C18070vi.A0d(r8, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(view, 5);
        C18070vi.A0d(r6, 7);
        this.A03 = r7;
        this.A08 = r9;
        this.A07 = r8;
        this.A01 = r5;
        this.A06 = view;
        this.A05 = z;
        this.A02 = r6;
        this.A00 = view.getContext();
        C28931bI r2 = new C28931bI(view.findViewById(2131429653));
        r2.A07(new AnonymousClass3AR(this, 6));
        this.A04 = r2;
    }
}
