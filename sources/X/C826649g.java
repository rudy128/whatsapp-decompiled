package X;

import android.app.Activity;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.49g  reason: invalid class name and case insensitive filesystem */
public final class C826649g extends A34 {
    public final long A00 = SystemClock.elapsedRealtime();
    public final C33251iW A01;
    public final C72073Kn A02;
    public final C136876uY A03;
    public final AnonymousClass1E7 A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final WeakReference A0A;
    public final WeakReference A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public void A0F() {
        WeakReference weakReference = this.A0B;
        if (weakReference.get() != null) {
            ((AnonymousClass1FR) weakReference.get()).CNB(0, 2131895077);
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        boolean z;
        Activity activity = (Activity) this.A0A.get();
        if (activity != null) {
            if (this.A0F) {
                this.A03.A02(this.A04, this.A07, (List) null);
            }
            AnonymousClass1E7 r7 = this.A04;
            boolean A0F2 = r7.A0F();
            C136876uY r4 = this.A03;
            if (A0F2) {
                z = this.A0E;
                r4.A01((C1600186u) null, r7, z, false);
            } else {
                String str = this.A08;
                Integer num = this.A06;
                String str2 = this.A09;
                Integer num2 = this.A05;
                z = this.A0E;
                r4.A00(activity, (C1600286v) null, r7, num, num2, str, str2, this.A07, z);
            }
            if (z) {
                this.A01.A0X(C72463Mc.A0g(r7), this.A0C, false);
            }
            AnonymousClass1FU.A0X(this.A00, 300);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass1FR r0 = (AnonymousClass1FR) this.A0B.get();
        if (r0 != null) {
            r0.CEx();
        }
        C72073Kn r1 = this.A02;
        if (r1 != null) {
            r1.C3p(true);
        }
        Activity activity = (Activity) this.A0A.get();
        if (activity != null && this.A0D) {
            activity.finish();
        }
    }

    public C826649g(AnonymousClass01E r3, AnonymousClass1FR r4, C33251iW r5, C72073Kn r6, C136876uY r7, AnonymousClass1E7 r8, Integer num, Integer num2, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0D = z;
        this.A0F = z2;
        this.A0A = AnonymousClass3MW.A0z(r3);
        this.A0B = AnonymousClass3MW.A0z(r4);
        this.A01 = r5;
        this.A03 = r7;
        this.A0E = z3;
        this.A0C = z4;
        this.A04 = r8;
        this.A08 = str;
        this.A06 = num;
        this.A09 = str2;
        this.A05 = num2;
        this.A07 = str3;
        this.A02 = r6;
    }
}
