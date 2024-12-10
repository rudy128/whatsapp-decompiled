package X;

import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.19B  reason: invalid class name */
public class AnonymousClass19B implements AnonymousClass19A {
    public final AnonymousClass18K A00;
    public final AtomicInteger A01 = new AtomicInteger();

    public void BC7(int i, String str) {
        A00("markerId:%d, annotationKey:%s", new Object[]{Integer.valueOf(i), str}, 13);
    }

    public void BC8(int i, String str) {
        A00("markerId:%d, key:%s", new Object[]{Integer.valueOf(i), str}, 23);
    }

    public void BC9(int i, String str, int i2) {
        A00("markerId:%d, annotationKey:%s", new Object[]{Integer.valueOf(i), str}, 1);
    }

    public void BCt() {
        A00((String) null, new Object[0], 17);
    }

    public void BKV(String str) {
        A00("errorString:%s", new Object[]{str}, 16);
    }

    public void BKW(String str) {
        A00("errorString:%s", new Object[]{str}, 11);
    }

    public void BKX(String str) {
        A00("errorString:%s", new Object[]{str}, 15);
    }

    public void BKY(String str) {
        if (str != null && str.length() > 200) {
            str = str.substring(0, 200);
        }
        A00("errorString:%s", new Object[]{str}, 10);
    }

    public void BKZ(String str) {
        A00("errorString:%s", new Object[]{str}, 8);
    }

    public void BKg(int i) {
        A00("markerId:%d", new Object[]{Integer.valueOf(i)}, 22);
    }

    public void Bd2(int i, String str, double d) {
        A00("markerId:%d, annotationKey:%s, value:%s", new Object[]{Integer.valueOf(i), str, Double.toString(d)}, 7);
    }

    public void BhE(int i, String str) {
        A00("markerId:%d, errorString:%s", new Object[]{Integer.valueOf(i), str}, 6);
    }

    public void Bj8() {
        A00((String) null, new Object[0], 9);
    }

    public void BjG(int i) {
        A00("markerId:%d", new Object[]{Integer.valueOf(i)}, 3);
    }

    public void BjH(int i) {
        A00("markerId:%d", new Object[]{Integer.valueOf(i)}, 2);
    }

    public void BkP(int i) {
        A00("markerId:%d", new Object[]{Integer.valueOf(i)}, 20);
    }

    public void CBl(int i, String str) {
        A00("markerId:%d, data:%s", new Object[]{Integer.valueOf(i), str}, 14);
    }

    public void CBm(int i, String str) {
        A00("markerId:%d, pointName:%s", new Object[]{Integer.valueOf(i), str}, 12);
    }

    public void CBn(int i, String str) {
        A00("markerId:%d, pointName:%s", new Object[]{Integer.valueOf(i), str}, 5);
    }

    public void CFO(String str) {
        A00("msg: %s", new Object[]{str}, 24);
    }

    public void CPb(Collection collection) {
        Object[] objArr = new Object[1];
        String str = "null";
        if (collection != null) {
            str = collection.toString();
        }
        objArr[0] = str;
        A00("allOpenMarkerIds:%s", objArr, 4);
    }

    public void CQ8() {
        A00((String) null, new Object[0], 18);
    }

    private void A00(String str, Object[] objArr, int i) {
        if (this.A01.getAndIncrement() < 5) {
            AnonymousClass2FC r1 = new AnonymousClass2FC();
            r1.A00 = Integer.valueOf(i);
            if (str != null) {
                r1.A01 = String.format(Locale.US, str, objArr);
            }
            this.A00.CC7(r1);
        }
    }

    public AnonymousClass19B(AnonymousClass18K r2) {
        this.A00 = r2;
    }
}
