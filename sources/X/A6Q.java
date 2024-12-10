package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class A6Q {
    public Map A00 = C17880vN.A13();
    public final C18030ve A01;
    public final AtomicInteger A02 = new AtomicInteger();
    public final AnonymousClass1HA A03;

    private final C222119a A00(int i) {
        AnonymousClass1HA r4 = this.A03;
        C18030ve r3 = this.A01;
        C222219b r2 = new C222219b(r3, i);
        if (C18020vd.A05(C18040vf.A02, r3, 7677)) {
            r2.A04 = true;
        }
        return r4.A01(r2, "NewsletterPerfTracker");
    }

    public static final void A02(A6Q a6q, Integer num, short s) {
        if (num != null) {
            Map map = a6q.A00;
            C222119a r1 = (C222119a) map.get(num);
            if (r1 != null) {
                r1.A04(num.intValue(), s);
                map.remove(num);
            }
        }
    }

    public A6Q(AnonymousClass1HA r2, C18030ve r3) {
        C18070vi.A0j(r3, r2);
        this.A01 = r3;
        this.A03 = r2;
    }

    public static final Integer A01(A6Q a6q, long j) {
        C222119a A002 = a6q.A00(1026958641);
        int andIncrement = a6q.A02.getAndIncrement();
        if (!A002.A0E("NewsletterPerfTracker", true, andIncrement)) {
            return null;
        }
        A002.A09("origin", andIncrement, j, false);
        Integer valueOf = Integer.valueOf(andIncrement);
        a6q.A00.put(valueOf, A002);
        return valueOf;
    }

    public final Integer A03(int i) {
        C222119a A002 = A00(1026963966);
        int andIncrement = this.A02.getAndIncrement();
        if (!A002.A0E("NewsletterPerfTracker", true, andIncrement)) {
            return null;
        }
        A002.A09("entry_point", andIncrement, (long) i, false);
        Integer valueOf = Integer.valueOf(andIncrement);
        this.A00.put(valueOf, A002);
        return valueOf;
    }

    public final Integer A04(Integer num, int i) {
        C222119a A002 = A00(1026960759);
        int andIncrement = this.A02.getAndIncrement();
        if (!A002.A0E("NewsletterPerfTracker", true, andIncrement)) {
            return null;
        }
        A002.A09("surface", andIncrement, (long) i, false);
        if (num != null) {
            A002.A09("unit", andIncrement, (long) num.intValue(), false);
        }
        Integer valueOf = Integer.valueOf(andIncrement);
        this.A00.put(valueOf, A002);
        return valueOf;
    }

    public final Integer A05(Integer num, int i) {
        C222119a A002 = A00(1026957851);
        int andIncrement = this.A02.getAndIncrement();
        if (!A002.A0E("NewsletterPerfTracker", true, andIncrement)) {
            return null;
        }
        A002.A09("surface", andIncrement, (long) i, false);
        if (num != null) {
            A002.A09("unit", andIncrement, (long) num.intValue(), false);
        }
        Integer valueOf = Integer.valueOf(andIncrement);
        this.A00.put(valueOf, A002);
        return valueOf;
    }
}
