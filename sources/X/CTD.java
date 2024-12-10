package X;

import android.content.Context;

public class CTD {
    public final Context A00;
    public final CET A01;
    public final CEU A02;
    public final C8D A03;
    public final CEX A04;
    public final E4K A05;
    public final String A06;

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, X.CEX] */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.CEU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v12, types: [X.CET, java.lang.Object] */
    public CTD(CPJ cpj) {
        CET cet;
        CEU ceu;
        CEX cex;
        this.A00 = cpj.A02;
        E4K e4k = cpj.A01;
        if (e4k == null) {
            e4k = new DB9(this, 0);
            cpj.A01 = e4k;
        }
        this.A06 = "image_cache";
        this.A05 = e4k;
        C8D c8d = cpj.A00;
        C26208Cuj.A01(c8d);
        this.A03 = c8d;
        synchronized (CET.class) {
            CET cet2 = CET.A00;
            cet = cet2;
            if (cet2 == null) {
                ? obj = new Object();
                CET.A00 = obj;
                cet = obj;
            }
        }
        this.A01 = cet;
        synchronized (CEU.class) {
            CEU ceu2 = CEU.A00;
            ceu = ceu2;
            if (ceu2 == null) {
                ? obj2 = new Object();
                CEU.A00 = obj2;
                ceu = obj2;
            }
        }
        this.A02 = ceu;
        synchronized (CEX.class) {
            CEX cex2 = CEX.A00;
            cex = cex2;
            if (cex2 == null) {
                ? obj3 = new Object();
                CEX.A00 = obj3;
                cex = obj3;
            }
        }
        this.A04 = cex;
    }
}
