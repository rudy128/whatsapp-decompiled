package X;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Cks  reason: case insensitive filesystem */
public class C25722Cks {
    public static final C28549E6x A02 = new DY6(5);
    public static final C28549E6x A03 = new DY6(4);
    public static final C28549E6x A04 = new DY6(2);
    public static final C28549E6x A05 = new DY6(3);
    public static final C28549E6x A06 = new DY6(6);
    public static final C28549E6x A07 = new DY6(1);
    public static final C28549E6x A08 = new DY6(0);
    public static final C28549E6x A09 = new Object();
    public static final C28549E6x A0A = new Object();
    public static final C28549E6x A0B = new DY6(7);
    public LinkedList A00 = AnonymousClass8BR.A14();
    public ConcurrentHashMap A01 = AnonymousClass8BR.A17();

    public void A01(C28549E6x e6x, Class... clsArr) {
        for (Class put : clsArr) {
            this.A01.put(put, e6x);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.C5K] */
    public void A00(Class cls, C28549E6x e6x) {
        LinkedList linkedList = this.A00;
        ? obj = new Object();
        obj.A00 = cls;
        obj.A01 = e6x;
        linkedList.addLast(obj);
    }

    public C25722Cks() {
        A01(new DY7(this, 9), String.class);
        A01(new DY7(this, 0), Double.class);
        A01(new DY7(this, 1), Date.class);
        A01(new DY7(this, 2), Float.class);
        C28549E6x e6x = A0B;
        A01(e6x, Integer.class, Long.class, Byte.class, Short.class, BigInteger.class, BigDecimal.class);
        A01(e6x, Boolean.class);
        A01(new DY7(this, 3), int[].class);
        A01(new DY7(this, 4), short[].class);
        A01(new DY7(this, 5), long[].class);
        A01(new DY7(this, 6), float[].class);
        A01(new DY7(this, 7), double[].class);
        A01(new DY7(this, 8), boolean[].class);
        A00(EEH.class, A07);
        A00(C28546E6u.class, A08);
        A00(EEG.class, A04);
        A00(C28545E6t.class, A05);
        A00(Map.class, A06);
        A00(Iterable.class, A03);
        A00(Enum.class, A02);
        A00(Number.class, e6x);
    }
}
