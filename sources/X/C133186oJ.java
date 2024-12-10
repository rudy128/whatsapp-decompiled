package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6oJ  reason: invalid class name and case insensitive filesystem */
public class C133186oJ {
    public AnonymousClass6MN A00;
    public AnonymousClass00H A01;
    public final C133656pG A02;
    public final AnonymousClass1KB A03;
    public final AnonymousClass1NM A04;
    public final C35551mQ A05;
    public final AnonymousClass707 A06;
    public final AnonymousClass1DC A07;
    public final AnonymousClass10I A08;
    public final AnonymousClass00H A09;

    public void A00(AnonymousClass1FU r18, AnonymousClass770 r19, AnonymousClass1EC r20, String str, String str2, String str3, String str4, ArrayList arrayList, List list, boolean z) {
        AnonymousClass6MN r0 = this.A00;
        if (r0 != null && r0.A09() == 1) {
            this.A00.A0B(false);
        }
        C129846iT r4 = new C129846iT(r18, this, str2, str3, arrayList);
        C35551mQ r11 = this.A05;
        AnonymousClass6MN r42 = new AnonymousClass6MN(((C35541mP) this.A01.get()).A00(), this.A04, (AnonymousClass11Z) this.A09.get(), r19, r20, r4, r11, this.A06, str, str4, list, z);
        this.A00 = r42;
        AnonymousClass3MW.A1T(r42, this.A08, 0);
    }

    public C133186oJ(C133656pG r1, AnonymousClass1KB r2, AnonymousClass1NM r3, C35551mQ r4, AnonymousClass707 r5, AnonymousClass1DC r6, AnonymousClass10I r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        this.A03 = r2;
        this.A08 = r7;
        this.A02 = r1;
        this.A09 = r8;
        this.A07 = r6;
        this.A05 = r4;
        this.A04 = r3;
        this.A06 = r5;
        this.A01 = r9;
    }
}
