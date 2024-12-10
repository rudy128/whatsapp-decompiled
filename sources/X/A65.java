package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class A65 {
    public A05 A00;
    public final AnonymousClass9WS A01;
    public final C188989iK A02;
    public final Object A03 = C17880vN.A0p();
    public final List A04 = AnonymousClass000.A13();
    public final Map A05 = C17880vN.A11();
    public final Map A06 = C17880vN.A11();
    public final Queue A07 = new PriorityBlockingQueue(10, new C21479Akk(this, 0));
    public final AnonymousClass9UT A08;
    public final C187139fK A09;
    public final AnonymousClass9P7 A0A;

    public static ArrayList A00(A65 a65) {
        if (Thread.holdsLock(a65.A03)) {
            List list = a65.A04;
            ArrayList A10 = C17880vN.A10(list);
            list.clear();
            return A10;
        }
        throw AnonymousClass000.A0n("Should always be called while holding lock");
    }

    public static void A01(A65 a65) {
        if (a65.A00 == null) {
            Queue queue = a65.A07;
            if (!queue.isEmpty()) {
                A05 a05 = (A05) queue.poll();
                a65.A00 = a05;
                C20282AEq aEq = a05.A04;
                Map map = a65.A05;
                if (!map.containsKey(a05)) {
                    boolean A1Z = AnonymousClass000.A1Z(a05.A00, AnonymousClass00R.A0C);
                    C187139fK r6 = a65.A09;
                    C183659Zc r7 = new C183659Zc(a05, a65);
                    AtomicBoolean A0w = C108965cb.A0w();
                    r6.A03.execute(new C21368Aix(r6, r7, aEq, A0w, 31));
                    AIL ail = new AIL(A0w);
                    a05.A00(AnonymousClass00R.A01);
                    map.put(a05, ail);
                    a65.A04.add(new AnonymousClass7RF(a65, a05, 2, A1Z));
                    return;
                }
                throw new IllegalStateException();
            }
        }
    }

    public static void A02(A65 a65, List list) {
        if (!Thread.holdsLock(a65.A03)) {
            for (Object A1P : list) {
                C108945cZ.A1P(A1P);
            }
            return;
        }
        throw AnonymousClass000.A0n("Should never be called while holding lock");
    }

    public A65(E4N e4n, C187139fK r5, AnonymousClass9WS r6, C188989iK r7, AnonymousClass9P7 r8) {
        this.A09 = r5;
        this.A02 = r7;
        this.A01 = r6;
        TimeUnit.SECONDS.toMillis(1);
        this.A08 = new AnonymousClass9UT(e4n);
        this.A0A = r8;
    }
}
