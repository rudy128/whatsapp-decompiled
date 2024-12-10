package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.19Z  reason: invalid class name */
public final class AnonymousClass19Z {
    public final C222119a A00;

    public AnonymousClass19Z(AnonymousClass11P r13, AnonymousClass118 r14, C18030ve r15, AnonymousClass18K r16, AnonymousClass19V r17, AnonymousClass19Y r18, AnonymousClass19T r19, AnonymousClass198 r20, AnonymousClass10I r21) {
        C18070vi.A0d(r13, 1);
        C18070vi.A0d(r14, 2);
        AnonymousClass10I r9 = r21;
        C18070vi.A0d(r9, 3);
        AnonymousClass18K r4 = r16;
        C18070vi.A0d(r4, 4);
        AnonymousClass198 r8 = r20;
        C18070vi.A0d(r8, 5);
        AnonymousClass19T r7 = r19;
        C18070vi.A0d(r7, 6);
        AnonymousClass19V r5 = r17;
        C18070vi.A0d(r5, 7);
        AnonymousClass19Y r6 = r18;
        C18070vi.A0d(r6, 8);
        C18070vi.A0d(r15, 9);
        this.A00 = new C222119a(r13, r14, r15, r4, r5, r6, r7, r8, r9, "ApplicationCreatePerfTracker", 703926783);
    }

    public final void A00() {
        C222119a r1 = this.A00;
        r1.A06("app_creation_on_create");
        r1.A0C(2);
    }

    public final void A01() {
        this.A00.A07("app_creation_on_create");
    }

    public final void A02(long j) {
        C222119a r2 = this.A00;
        r2.A05.A04 = true;
        r2.A07.markerStart(703926783, "perf_origin", "ApplicationCreatePerfTracker", j, TimeUnit.NANOSECONDS);
        r2.A05(j);
    }

    public final void A03(String str) {
        this.A00.A06(str);
    }

    public final void A04(String str) {
        this.A00.A07(str);
    }
}
