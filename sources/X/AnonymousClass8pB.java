package X;

import java.util.ArrayList;

/* renamed from: X.8pB  reason: invalid class name */
public final class AnonymousClass8pB extends AnonymousClass8p3 {
    public final AnonymousClass1TD A00;
    public final AnonymousClass121 A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public ArrayList A02(AnonymousClass205 r7, int i, long j) {
        C18070vi.A0d(r7, 0);
        return ((ARP) this.A04.get()).A03(r7, 6, i, j);
    }

    public ArrayList A01(int i, long j) {
        return ((ARP) this.A04.get()).A02(6, i, j);
    }

    public AnonymousClass8pB(AnonymousClass1TD r1, AnonymousClass121 r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r3, r1, r4, r5, r2);
        this.A04 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r5;
        this.A01 = r2;
    }

    public String A00() {
        return "MessageCallLogOrphanResolver";
    }
}
