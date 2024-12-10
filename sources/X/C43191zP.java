package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1zP  reason: invalid class name and case insensitive filesystem */
public class C43191zP {
    public static int A0C;
    public double A00;
    public double A01;
    public double A02 = 0.0d;
    public C43211zR A03;
    public CopyOnWriteArraySet A04 = new CopyOnWriteArraySet();
    public boolean A05;
    public boolean A06 = true;
    public final C43201zQ A07 = new Object();
    public final C43201zQ A08 = new Object();
    public final C43201zQ A09 = new Object();
    public final C43171zN A0A;
    public final String A0B;

    public void A00(double d) {
        this.A01 = d;
        C43201zQ r3 = this.A07;
        r3.A00 = d;
        this.A0A.A02(this.A0B);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((C43091zF) it.next()).C65(this);
        }
        double d2 = r3.A00;
        this.A00 = d2;
        this.A09.A00 = d2;
        r3.A01 = 0.0d;
    }

    public void A01(double d) {
        if (this.A00 != d || !A02()) {
            this.A01 = this.A07.A00;
            this.A00 = d;
            this.A0A.A02(this.A0B);
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public boolean A02() {
        C43201zQ r6 = this.A07;
        if (Math.abs(r6.A01) > 0.005d) {
            return false;
        }
        if (Math.abs(this.A00 - r6.A00) <= 0.005d || this.A03.A01 == 0.0d) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.1zQ] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.1zQ] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.1zQ] */
    public C43191zP(C43171zN r4) {
        this.A0A = r4;
        StringBuilder sb = new StringBuilder();
        sb.append("spring:");
        int i = A0C;
        A0C = i + 1;
        sb.append(i);
        this.A0B = sb.toString();
        this.A03 = C43211zR.A02;
    }
}
