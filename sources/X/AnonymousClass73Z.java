package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: X.73Z  reason: invalid class name */
public final class AnonymousClass73Z {
    public C1598586d A00;
    public final Activity A01;
    public final C25721Pj A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C19880zA A05;

    public static final void A01(C1416576l r3, AnonymousClass73Z r4, Integer num, int i, boolean z) {
        AnonymousClass4W5.A00(r4.A05);
        A00(r3, r4, AnonymousClass6RD.META_AI_SHORTCUT_TOS, num, i, z);
    }

    public final void A07(AnonymousClass1BI r4, int i, int i2) {
        A03(new C115935w5((C115945w6) null, r4, i2, false), (Integer) null, i, false);
    }

    public static final void A00(C1416576l r9, AnonymousClass73Z r10, AnonymousClass6RD r11, Integer num, int i, boolean z) {
        Activity activity = r10.A01;
        if (activity instanceof AnonymousClass1FU) {
            r10.A02.A03((AnonymousClass1FU) activity, (AnonymousClass86Z) null, (C1598286a) null, new C143217Cn(r9, num, r10, 0), new C134526qj(r9, i), r11, num, z);
        }
    }

    private final void A03(C115935w5 r11, Integer num, int i, boolean z) {
        Activity activity = this.A01;
        if (activity instanceof AnonymousClass1FU) {
            this.A02.A03((AnonymousClass1FU) activity, (AnonymousClass86Z) null, (C1598286a) null, new C143227Co(this, r11, num, i, z), new C134526qj(r11, i), AnonymousClass6RD.META_AI_IMAGINE_ME_NUX, num, z);
        }
    }

    public final void A04(Intent intent) {
        Parcelable parcelable;
        if (intent != null) {
            boolean A1a = AnonymousClass3MY.A1a(intent, "tos_just_accepted");
            Bundle bundleExtra = intent.getBundleExtra("passthrough_bundle");
            if (bundleExtra == null) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) C24141Ja.A00(bundleExtra, C1416576l.class, "onboarding_request_data");
            }
            C1416576l r0 = (C1416576l) parcelable;
            if (r0 != null) {
                A02(r0, this, A1a);
            }
        }
    }

    public final void A05(Intent intent, int i, int i2, boolean z) {
        if (z) {
            C47192Hl r1 = new C47192Hl();
            AnonymousClass3MZ.A1T(r1, Integer.valueOf(i2));
            if (intent == null || i != -1) {
                C108945cZ.A1M(r1, 34);
                C108965cb.A1F(r1, this.A04);
                return;
            }
            C108945cZ.A1M(r1, 33);
            C108965cb.A1F(r1, this.A04);
        }
        A04(intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0.length() == 0) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.C115945w6 r12, boolean r13) {
        /*
            r11 = this;
            r9 = 299(0x12b, float:4.19E-43)
            r5 = r12
            java.lang.String r0 = r12.A02
            if (r0 == 0) goto L_0x000e
            int r0 = r0.length()
            r10 = 0
            if (r0 != 0) goto L_0x000f
        L_0x000e:
            r10 = 1
        L_0x000f:
            r6 = r11
            X.0zA r0 = r11.A05
            X.AnonymousClass4W5.A00(r0)
            r0 = 12
            if (r13 == 0) goto L_0x0029
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r3 = 1
            r2 = 0
            r1 = 3
            X.5w5 r0 = new X.5w5
            r0.<init>(r12, r2, r1, r3)
            r11.A03(r0, r4, r9, r10)
            return
        L_0x0029:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            X.6RD r7 = X.AnonymousClass6RD.META_AI_SHORTCUT_TOS
            A00(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73Z.A06(X.5w6, boolean):void");
    }

    public AnonymousClass73Z(Activity activity, C19880zA r2, C25721Pj r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(activity, r4, r5, r3, r2);
        this.A01 = activity;
        this.A04 = r4;
        this.A03 = r5;
        this.A02 = r3;
        this.A05 = r2;
    }

    public static final void A02(C1416576l r5, AnonymousClass73Z r6, boolean z) {
        if (r5.A00()) {
            Activity activity = r6.A01;
            if (activity instanceof AnonymousClass1FU) {
                C25721Pj r3 = r6.A02;
                AnonymousClass1FU r4 = (AnonymousClass1FU) activity;
                C1588882k r2 = new C1588882k(r5, r6, z);
                C18070vi.A0d(r4, 0);
                AnonymousClass00H r1 = r3.A07;
                AnonymousClass1E7 r0 = ((C42961z1) r1.get()).A08;
                if (r0 != null) {
                    r2.invoke(r0);
                } else {
                    ((C42961z1) r1.get()).A03(r4, new C1589082m(r4, r3, r2));
                }
            }
        } else {
            C1598586d r12 = r6.A00;
            if (r12 != null) {
                r12.C7d((AnonymousClass1E7) null, r5, z);
            }
        }
    }
}
