package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.8uz  reason: invalid class name and case insensitive filesystem */
public class C173388uz extends A3R implements C72203La {
    public A99 A00;
    public CountDownLatch A01;
    public final AnonymousClass1HQ A02;
    public final AnonymousClass1V7 A03;
    public final AnonymousClass1TM A04;
    public final C20047A4q A05;
    public final AnonymousClass19T A06;
    public final AnonymousClass10I A07;

    public void C5G() {
        this.A00 = null;
    }

    public void C5F(A99 a99) {
        this.A00 = a99;
        this.A01.countDown();
        this.A06.markerPoint(494348122, "bind_voice_service_end");
    }

    public C173388uz(AnonymousClass1HQ r1, AnonymousClass1V7 r2, AnonymousClass1TM r3, C20047A4q a4q, AnonymousClass19T r5, AnonymousClass10I r6) {
        this.A06 = r5;
        this.A07 = r6;
        this.A02 = r1;
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = a4q;
    }
}
