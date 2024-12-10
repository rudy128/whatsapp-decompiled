package X;

import android.view.View;

/* renamed from: X.4d3  reason: invalid class name and case insensitive filesystem */
public class C89804d3 implements View.OnClickListener {
    public final AnonymousClass1FU A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass1PW A02;
    public final AnonymousClass18K A03;
    public final AnonymousClass1BI A04;
    public final String A05;
    public final boolean A06;
    public final AnonymousClass10I A07;

    public void onClick(View view) {
        if (this.A00 != null) {
            if (this.A06) {
                C98784ri.A00(this.A07, this, 2);
            }
            this.A07.CGN(new C98784ri((Object) this, 3));
        }
    }

    public C89804d3(AnonymousClass1FU r1, AnonymousClass1KB r2, AnonymousClass1PW r3, AnonymousClass18K r4, AnonymousClass1BI r5, AnonymousClass10I r6, String str, boolean z) {
        this.A01 = r2;
        this.A07 = r6;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A05 = str;
        this.A06 = z;
    }
}
