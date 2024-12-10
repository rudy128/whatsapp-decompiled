package X;

import java.util.concurrent.atomic.AtomicInteger;

public final class A2D {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final long A03;
    public final String A04;
    public final AtomicInteger A05;
    public final /* synthetic */ C20132A8s A06;

    public A2D(C20132A8s a8s, String str, long j) {
        this.A06 = a8s;
        long j2 = j;
        if (j < 0) {
            C20132A8s.A04(a8s, AnonymousClass001.A1H("Negative Cache Recency Threshold Entered For Query: ", str, AnonymousClass000.A10()));
        }
        a8s.A08.add(str);
        String A1H = AnonymousClass001.A1H("recency_threshold_for_", str, AnonymousClass000.A10());
        if (A1H != null) {
            a8s.A04.markerAnnotate(a8s.A02, a8s.A01, A1H, j2);
        }
        this.A04 = str;
        this.A05 = new AtomicInteger(0);
        this.A03 = j;
    }

    public final AnonymousClass9IC A00() {
        return (AnonymousClass9IC) AnonymousClass9IC.A00.get(this.A05.get());
    }

    public final void A01() {
        C20132A8s a8s;
        String str;
        AnonymousClass9IC A002 = A00();
        String str2 = "CACHE";
        if (A002 == AnonymousClass9IC.QUERY_SUCCESSFULLY_COMPLETED) {
            if (!this.A02 || this.A01) {
                a8s = this.A06;
                str = AnonymousClass000.A0y(this.A04, AnonymousClass000.A11("ttrc_source_for_"));
                str2 = "NETWORK";
                a8s.A0J(str, str2);
            }
        } else if (A002 != AnonymousClass9IC.CACHE_DONE_NETWORK_PENDING || this.A00) {
            if (A002 != AnonymousClass9IC.QUERY_NOT_NEEDED) {
                C20132A8s.A04(this.A06, AnonymousClass001.A1E(A002, "Unexpected call to addSourceAnnotation in state ", AnonymousClass000.A10()));
                return;
            }
            return;
        }
        a8s = this.A06;
        str = AnonymousClass000.A0y(this.A04, AnonymousClass000.A11("ttrc_source_for_"));
        a8s.A0J(str, str2);
    }

    public final boolean A02(AnonymousClass9IC r6) {
        int ordinal = r6.ordinal();
        AtomicInteger atomicInteger = this.A05;
        if (ordinal == 2) {
            return atomicInteger.compareAndSet(0, ordinal);
        }
        if (atomicInteger.compareAndSet(0, ordinal) || atomicInteger.compareAndSet(2, ordinal) || atomicInteger.compareAndSet(1, ordinal)) {
            return true;
        }
        return false;
    }

    public A2D(C20132A8s a8s, String str) {
        this.A06 = a8s;
        this.A04 = str;
        this.A05 = new AtomicInteger(1);
        this.A03 = -1;
        a8s.A09.add(str);
    }
}
