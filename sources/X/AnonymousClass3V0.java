package X;

import android.os.Handler;

/* renamed from: X.3V0  reason: invalid class name */
public final class AnonymousClass3V0 extends AnonymousClass1J2 {
    public final AnonymousClass1DS A00;
    public final AnonymousClass4VJ A01;
    public final C19830z4 A02;
    public final C41111vp A03;
    public final C18100vl A04 = AnonymousClass1DF.A01(new C99064sD(13));
    public final AnonymousClass11P A05;

    public AnonymousClass3V0(AnonymousClass1KB r12, AnonymousClass4VJ r13, AnonymousClass11P r14, C19830z4 r15) {
        boolean z = true;
        C18070vi.A0d(r14, 1);
        C18070vi.A0k(r15, r12);
        this.A05 = r14;
        this.A02 = r15;
        this.A01 = r13;
        C41111vp A0n = AnonymousClass3MW.A0n(new AnonymousClass4YX(0, false, true, false, false));
        this.A03 = A0n;
        C22801Dg A002 = C22791Df.A00(C22791Df.A01(A0n, new C99234sU(14)));
        this.A00 = A002;
        AnonymousClass4YX r1 = (AnonymousClass4YX) A0n.A06();
        A0n.A0F(new AnonymousClass4YX(r1.A00, r1.A04, r1.A02, r13.A05, (!r13.A07 || r13.A08) ? false : z));
        A002.A0C(new C91644g1(new C99204sR(new C98554rL(this, 15), r12, 3), 26));
    }

    public static final void A00(AnonymousClass3V0 r8, AnonymousClass1BI r9, AnonymousClass206 r10, int i) {
        long j;
        AnonymousClass4YX r1 = (AnonymousClass4YX) r8.A03.A06();
        if (r1.A01 && r1.A03 && r1.A02) {
            if (i == 0 || i == 1 || i == 2) {
                C19830z4 r6 = r8.A02;
                if (r6.A0R() > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - r6.A0R();
                    if (i == 0) {
                        j = 604800000;
                    } else {
                        j = 7776000000L;
                    }
                    if (currentTimeMillis < j || C17890vO.A0B(r6).getBoolean("push_to_video_camera_entry_point_nux_shown", false)) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (i == 4) {
                AnonymousClass00H r2 = r8.A02.A00;
                if (!C17880vN.A0B(r2).getBoolean("push_to_video_first_time_watching_educational_nux_shown_individual_chat", false)) {
                    AnonymousClass4VJ r5 = r8.A01;
                    if (System.currentTimeMillis() - C17890vO.A05(C17880vN.A0B(r2), "last_ptv_sent_timestamp") < ((long) C72453Mb.A0I(r5.A02)) * 86400000 || r9 == null || r10 == null || r10.A0v.A02 || !C72453Mb.A1a(r5.A03)) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (i != 5) {
                return;
            }
            C18100vl r0 = r8.A04;
            C72473Md.A1P(r0);
            ((Handler) r0.getValue()).postDelayed(new AnonymousClass7RP(r8, i, 46), 600);
        }
    }

    public void A0S() {
        C72473Md.A1P(this.A04);
    }

    public final void A0T() {
        C72473Md.A1P(this.A04);
        C41111vp r2 = this.A03;
        AnonymousClass4YX r1 = (AnonymousClass4YX) r2.A06();
        if (r1.A04) {
            r2.A0F(new AnonymousClass4YX(r1.A00, false, r1.A02, r1.A01, r1.A03));
        }
    }

    public final void A0U(boolean z) {
        C41111vp r1 = this.A03;
        boolean z2 = z;
        if (((AnonymousClass4YX) r1.A06()).A02 != z) {
            AnonymousClass4YX r0 = (AnonymousClass4YX) r1.A06();
            r1.A0F(new AnonymousClass4YX(r0.A00, r0.A04, z2, r0.A01, r0.A03));
            if (!z) {
                A0T();
            }
        }
    }
}
