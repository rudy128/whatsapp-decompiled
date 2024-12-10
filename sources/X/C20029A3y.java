package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.A3y  reason: case insensitive filesystem */
public class C20029A3y {
    public final Map A00 = C17880vN.A11();

    public static int A00(C20029A3y a3y, String str) {
        AtomicInteger atomicInteger;
        synchronized (a3y) {
            Map map = a3y.A00;
            atomicInteger = (AtomicInteger) map.get(str);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                map.put(str, atomicInteger);
            }
        }
        return atomicInteger.get();
    }

    public static void A01(C20029A3y a3y, String str) {
        AtomicInteger atomicInteger;
        synchronized (a3y) {
            Map map = a3y.A00;
            atomicInteger = (AtomicInteger) map.get(str);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                map.put(str, atomicInteger);
            }
        }
        atomicInteger.incrementAndGet();
    }
}
