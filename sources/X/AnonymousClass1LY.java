package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1LY  reason: invalid class name */
public class AnonymousClass1LY {
    public final AnonymousClass1Cd A00;
    public final AtomicLong A01 = new AtomicLong(-1);
    public final AnonymousClass18K A02;
    public final C18180vt A03 = new AnonymousClass1LZ().samplingRate;

    public AnonymousClass1LY(AnonymousClass1Cd r4, AnonymousClass18K r5) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r4, 2);
        this.A02 = r5;
        this.A00 = r4;
    }

    public final void A00(C18180vt r11, String str, long j) {
        C18070vi.A0d(r11, 2);
        AnonymousClass18K r6 = this.A02;
        AnonymousClass1Be BDn = r6.BDn(new AnonymousClass1LZ(), r11);
        if (BDn.A00 != null) {
            AnonymousClass1LZ r4 = new AnonymousClass1LZ();
            r4.A04 = str;
            r4.A02 = Long.valueOf(j);
            r4.A00 = Boolean.valueOf(C22781De.A03());
            AtomicLong atomicLong = this.A01;
            if (atomicLong.get() == -1) {
                AnonymousClass1Cd r0 = this.A00;
                r0.A06();
                atomicLong.compareAndSet(-1, r0.A03.length() / 1048576);
            }
            r4.A03 = Long.valueOf(atomicLong.get());
            if (C18070vi.A18(C17960vV.A01, true)) {
                r4.A01 = 1;
            }
            r6.CC8(r4, BDn);
        }
    }

    public final void A01(String str, long j) {
        A00(this.A03, str, j);
    }
}
