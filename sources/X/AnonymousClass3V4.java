package X;

import com.whatsapp.util.Log;

/* renamed from: X.3V4  reason: invalid class name */
public final class AnonymousClass3V4 extends AnonymousClass1J2 {
    public final AnonymousClass1DS A00;
    public final AnonymousClass4VJ A01;
    public final C19830z4 A02;
    public final C18030ve A03;
    public final AnonymousClass1L1 A04;
    public final C41111vp A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass10I A07;

    public AnonymousClass3V4(AnonymousClass1KB r33, AnonymousClass4VJ r34, AnonymousClass11P r35, C19830z4 r36, C18030ve r37, AnonymousClass1BI r38, AnonymousClass1L1 r39, AnonymousClass1Nb r40, AnonymousClass10I r41, boolean z, boolean z2, boolean z3) {
        int i;
        AnonymousClass11P r8 = r35;
        C18070vi.A0d(r8, 1);
        C19830z4 r7 = r36;
        C18030ve r6 = r37;
        AnonymousClass10I r1 = r41;
        C18070vi.A0p(r6, r7, r1);
        AnonymousClass1L1 r3 = r39;
        C18070vi.A0d(r3, 5);
        AnonymousClass1KB r4 = r33;
        AnonymousClass1Nb r2 = r40;
        C18070vi.A0l(r4, r2);
        this.A06 = r8;
        this.A03 = r6;
        this.A02 = r7;
        this.A07 = r1;
        this.A04 = r3;
        AnonymousClass4VJ r62 = r34;
        this.A01 = r62;
        int i2 = 0;
        C41111vp A0n = AnonymousClass3MW.A0n(new C88134Yl(0, 0, false, true, false, false, false, false, false, false, true, false));
        this.A05 = A0n;
        C22801Dg A002 = C22791Df.A00(C22791Df.A01(A0n, C99244sV.A00(this, 19)));
        this.A00 = A002;
        C88134Yl A0e = AnonymousClass3MX.A0e(A0n);
        boolean z4 = r62.A06;
        boolean z5 = r62.A05;
        AnonymousClass1BI r63 = r38;
        if (r38 != null && z2 && z5 && (i = r2.A0a(r63).A02) != 0 && i == 1) {
            i2 = 1;
        }
        boolean A012 = C42701yb.A01(r63);
        boolean z6 = A0e.A0B;
        boolean z7 = A0e.A04;
        int i3 = A0e.A01;
        boolean z8 = A0e.A08;
        boolean z9 = z4;
        boolean z10 = z5;
        boolean z11 = z8;
        int i4 = i3;
        boolean z12 = z6;
        boolean z13 = z7;
        A0n.A0F(new C88134Yl(i2, i4, z12, z13, z9, z10, z, z11, z3, A0e.A09, A0e.A05, A012));
        A002.A0C(new C91644g1(new C99204sR(new C98554rL(this, 11), r4, 2), 25));
    }

    public final void A0V(int i) {
        int i2 = i;
        if (i2 == 4) {
            this.A07.CGF(new AnonymousClass7RP(this));
            return;
        }
        if (i2 == 1) {
            C88134Yl A0e = AnonymousClass3MX.A0e(this.A05);
            if (A0e.A02 && A0e.A07) {
                C19830z4 r4 = this.A02;
                if (r4.A0R() > 0 && System.currentTimeMillis() - r4.A0R() >= 604800000 && !this.A01.A07 && !C17880vN.A1W(C17890vO.A0B(r4), "push_to_video_nux_shown") && !AnonymousClass2T9.A00(r4, this.A03)) {
                    C17880vN.A1F(C19830z4.A00(r4), "push_to_video_nux_shown", true);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (i2 == 2 && !this.A01.A0B) {
            return;
        }
        C41111vp r2 = this.A05;
        C88134Yl A0e2 = AnonymousClass3MX.A0e(r2);
        boolean z = A0e2.A04;
        boolean z2 = A0e2.A03;
        boolean z3 = A0e2.A02;
        r2.A0F(new C88134Yl(A0e2.A00, i2, true, z, z2, z3, A0e2.A07, A0e2.A08, A0e2.A0A, A0e2.A09, A0e2.A05, A0e2.A06));
    }

    public static void A00(AnonymousClass1DS r13, C88134Yl r14, boolean z, boolean z2, boolean z3) {
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        r13.A0F(new C88134Yl(r14.A00, r14.A01, z4, z5, z6, r14.A02, r14.A07, r14.A08, r14.A0A, r14.A09, r14.A05, r14.A06));
    }

    public final void A0T() {
        C41111vp r4 = this.A05;
        C88134Yl A0e = AnonymousClass3MX.A0e(r4);
        if (A0e.A0B) {
            A00(r4, A0e, false, A0e.A04, A0e.A03);
        }
    }

    public final void A0U(int i) {
        C41111vp r1 = this.A05;
        C88134Yl A0e = AnonymousClass3MX.A0e(r1);
        int i2 = A0e.A00;
        int i3 = i;
        if (i3 == i2) {
            return;
        }
        if (!this.A01.A09) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("|conversation/viewmodel/ConversationEntryActionButtonViewModel/setRecorderMode called despite canToggleRecorderMode=false;\n             |  prevRecorderMode=");
            A10.append(i2);
            Log.e(AnonymousClass1Y7.A02(AnonymousClass001.A1I(";\n             |  nextRecorderMode=", A10, i3)));
            return;
        }
        r1.A0F(new C88134Yl(i3, A0e.A01, A0e.A0B, A0e.A04, A0e.A03, A0e.A02, A0e.A07, A0e.A08, A0e.A0A, A0e.A09, A0e.A05, A0e.A06));
    }

    public final void A0W(boolean z) {
        C41111vp r1 = this.A05;
        boolean z2 = z;
        if (AnonymousClass3MX.A0e(r1).A05 != z2) {
            C88134Yl A0e = AnonymousClass3MX.A0e(r1);
            r1.A0F(new C88134Yl(A0e.A00, A0e.A01, A0e.A0B, A0e.A04, A0e.A03, A0e.A02, A0e.A07, A0e.A08, A0e.A0A, A0e.A09, z2, A0e.A06));
        }
    }

    public final void A0X(boolean z) {
        C41111vp r3 = this.A05;
        if (AnonymousClass3MX.A0e(r3).A04 != z) {
            C88134Yl A0e = AnonymousClass3MX.A0e(r3);
            A00(r3, A0e, A0e.A0B, z, A0e.A03);
            if (!z) {
                A0T();
            }
        }
    }

    public final void A0Y(boolean z) {
        boolean z2;
        C41111vp r1 = this.A05;
        C88134Yl A0e = AnonymousClass3MX.A0e(r1);
        boolean z3 = A0e.A08;
        boolean z4 = z;
        if (z4 == z3) {
            return;
        }
        if (this.A01.A00 == 2) {
            if (z) {
                z2 = false;
            } else {
                z2 = AnonymousClass3MX.A0e(r1).A0B;
            }
            r1.A0F(new C88134Yl(A0e.A00, A0e.A01, z2, A0e.A04, A0e.A03, A0e.A02, A0e.A07, z4, A0e.A0A, A0e.A09, A0e.A05, A0e.A06));
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("|conversation/viewmodel/ConversationEntryActionButtonViewModel/isRecorderModeMenuVisible set despite isRecorderModeMenuEnabled=false;\n             |  prevIsRecorderModeMenuVisible=");
        A10.append(z3);
        Log.e(AnonymousClass1Y7.A02(C17900vP.A0D(";\n             |  nextIsRecorderModeMenuVisible=", A10, z4)));
    }

    public final void A0Z(boolean z) {
        C41111vp r1 = this.A05;
        boolean z2 = z;
        if (AnonymousClass3MX.A0e(r1).A0A != z2) {
            C88134Yl A0e = AnonymousClass3MX.A0e(r1);
            r1.A0F(new C88134Yl(A0e.A00, A0e.A01, A0e.A0B, A0e.A04, A0e.A03, A0e.A02, A0e.A07, A0e.A08, z2, A0e.A09, A0e.A05, A0e.A06));
        }
    }
}
