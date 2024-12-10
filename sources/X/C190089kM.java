package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9kM  reason: invalid class name and case insensitive filesystem */
public class C190089kM {
    public BCG A00;
    public final AtomicInteger A01 = new AtomicInteger();

    public Object A00(B8D b8d) {
        BCG bcg;
        C191779nA BQ1 = this.A00.BQ1();
        if (BQ1 == null) {
            return null;
        }
        A88 a88 = null;
        boolean z = false;
        while (BQ1 != null) {
            a88 = b8d.CGA(BQ1);
            if (z) {
                this.A01.incrementAndGet();
            }
            if (!a88.A05) {
                int i = a88.A00;
                z = true;
                if (i != 1 || (bcg = a88.A01) == null) {
                    this.A00.Bt5(a88.A04, i);
                    if (!a88.A03) {
                    }
                } else {
                    this.A00 = bcg;
                    z = false;
                }
                try {
                    Thread.sleep(this.A00.BNK());
                    BQ1 = this.A00.BQ1();
                } catch (InterruptedException unused) {
                    AnonymousClass8BS.A0x();
                }
            }
            return a88.A02;
        }
        if (a88 != null) {
            return a88.A02;
        }
        return null;
    }

    public C190089kM(BCG bcg) {
        this.A00 = bcg;
    }
}
