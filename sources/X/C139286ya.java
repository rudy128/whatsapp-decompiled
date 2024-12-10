package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6ya  reason: invalid class name and case insensitive filesystem */
public final class C139286ya {
    public long A00;
    public AnonymousClass64Z A01;
    public AnonymousClass6R6 A02 = AnonymousClass6R6.UNKNOWN;
    public Long A03;
    public String A04;
    public AtomicInteger A05 = new AtomicInteger();
    public boolean A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    public final synchronized void A01() {
        long j;
        AnonymousClass64Z r4 = this.A01;
        if (r4 != null) {
            this.A01 = null;
            String str = this.A04;
            if (str != null) {
                r4.A0F = str;
                Long l = r4.A07;
                if (l == null || l.longValue() == 0) {
                    r4.A0E = Long.valueOf(A00(this));
                    ((C136746uK) this.A07.get()).A00();
                    int ordinal = this.A02.ordinal();
                    if (ordinal == 1) {
                        r4.A04 = 1;
                    } else if (ordinal == 2) {
                        r4.A04 = C17880vN.A0k();
                        r4.A06 = this.A03;
                        if (this.A05.get() > 0) {
                            j = 1;
                        } else {
                            j = 0;
                        }
                        r4.A05 = Long.valueOf(j);
                    } else if (ordinal == 4) {
                        r4.A04 = C17880vN.A0j();
                        r4.A01 = Boolean.valueOf(this.A06);
                        r4.A08 = Long.valueOf(this.A00);
                        r4.A0B = this.A03;
                        long j2 = (long) this.A05.get();
                        r4.A09 = C17880vN.A0n(this.A05.get());
                        r4.A0A = Long.valueOf(Math.max(0, this.A00 - j2));
                    } else if (ordinal == 3) {
                        r4.A04 = C17880vN.A0i();
                        r4.A02 = Boolean.valueOf(this.A06);
                        r4.A0C = Long.valueOf(this.A00);
                    } else if (ordinal != 0) {
                        throw AnonymousClass3MW.A14();
                    }
                    ((AnonymousClass18K) this.A08.get()).CC4(r4);
                } else {
                    ((AnonymousClass18K) this.A08.get()).CC4(r4);
                }
            }
        }
    }

    public static final long A00(C139286ya r3) {
        AnonymousClass00H r32 = r3.A07;
        ((C136746uK) r32.get()).A00();
        long j = ((C136746uK) r32.get()).A00;
        ((C136746uK) r32.get()).A02();
        return j;
    }

    public C139286ya(AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0j(r2, r3);
        this.A07 = r2;
        this.A08 = r3;
    }
}
