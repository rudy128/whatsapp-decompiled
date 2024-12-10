package X;

import android.app.Activity;
import android.widget.TextView;

/* renamed from: X.7EL  reason: invalid class name */
public final class AnonymousClass7EL implements AnonymousClass8AN {
    public AnonymousClass6MQ A00;
    public AnonymousClass1E7 A01;
    public String A02;
    public C121846Ls A03;
    public final Activity A04;
    public final AnonymousClass11E A05;
    public final AnonymousClass1M9 A06;
    public final C133996pq A07;
    public final C678831f A08;
    public final AnonymousClass1OZ A09;
    public final AnonymousClass10I A0A;
    public final C37551pj A0B;
    public final C37311pJ A0C;

    public AnonymousClass7EL(Activity activity, C37551pj r3, AnonymousClass11E r4, AnonymousClass1M9 r5, C133996pq r6, C37311pJ r7, C678831f r8, AnonymousClass1OZ r9, AnonymousClass10I r10) {
        C18070vi.A0g(r9, 3, r3);
        this.A04 = activity;
        this.A0A = r10;
        this.A09 = r9;
        this.A06 = r5;
        this.A0B = r3;
        this.A08 = r8;
        this.A05 = r4;
        this.A07 = r6;
        this.A0C = r7;
    }

    public /* synthetic */ void BuF() {
    }

    public /* synthetic */ void BuH() {
    }

    public /* synthetic */ void Bvd() {
    }

    public final void A00() {
        boolean A1G = C108975cc.A1G(this.A03);
        this.A03 = null;
        AnonymousClass6MQ r0 = this.A00;
        if (r0 != null) {
            r0.A0B(A1G);
        }
        this.A00 = null;
    }

    public void BuG(AnonymousClass1E7 r7) {
        Activity activity = this.A04;
        if (!activity.isFinishing()) {
            boolean A022 = this.A0C.A02();
            if (r7 != null) {
                int i = 2131888766;
                if (A022) {
                    i = 2131893329;
                }
                this.A07.A01(r7, C18070vi.A0F(activity, i));
                return;
            }
            int i2 = 2131888765;
            if (A022) {
                i2 = 2131893328;
            }
            C133996pq r5 = this.A07;
            r5.A01((AnonymousClass1E7) null, C18070vi.A0F(activity, i2));
            String A0F = C18070vi.A0F(activity, 2131888815);
            AnonymousClass783 r3 = new AnonymousClass783(this, 21);
            C28931bI r1 = r5.A05;
            ((TextView) r1.A02()).setText(A0F);
            AnonymousClass3MY.A0I(r1, 0).setOnClickListener(r3);
        }
    }

    public void C5X(int i) {
        Integer valueOf;
        if (!this.A04.isFinishing()) {
            C133996pq r2 = this.A07;
            int i2 = 1;
            if (i != 0) {
                int i3 = 3;
                if (i != 1) {
                    i2 = 2;
                    if (i != 2) {
                        i3 = 4;
                    }
                }
                valueOf = Integer.valueOf(i3);
                r2.A01 = valueOf;
            }
            valueOf = Integer.valueOf(i2);
            r2.A01 = valueOf;
        }
    }

    public final void A01(String str, String str2) {
        boolean A15 = C18070vi.A15(str, str2);
        this.A02 = str;
        this.A07.A00();
        C121846Ls r1 = new C121846Ls(this.A0B, this.A06, this, str2);
        this.A03 = r1;
        AnonymousClass3MW.A1T(r1, this.A0A, A15 ? 1 : 0);
    }
}
