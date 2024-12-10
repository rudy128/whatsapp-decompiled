package X;

import java.io.Closeable;
import java.nio.ByteBuffer;

public class DRG implements Closeable {
    public DRN A00;
    public final int A01;

    public synchronized byte A00(int i) {
        A02();
        boolean z = true;
        C26208Cuj.A04(AnonymousClass000.A1Q(i));
        if (i >= this.A01) {
            z = false;
        }
        C26208Cuj.A04(z);
        C26208Cuj.A01(this.A00);
        return ((EAI) this.A00.A05()).CDI(i);
    }

    public synchronized ByteBuffer A01() {
        C26208Cuj.A01(this.A00);
        return ((EAI) this.A00.A05()).BNu();
    }

    public synchronized void A02() {
        synchronized (this) {
            try {
                if (!DRN.A02(this.A00)) {
                    th = new DZZ();
                    throw th;
                }
            } catch (Throwable th) {
                th = th;
            }
        }
    }

    public synchronized void A03(int i, byte[] bArr, int i2, int i3) {
        A02();
        C26208Cuj.A04(BE8.A1U(i + i3, this.A01));
        C26208Cuj.A01(this.A00);
        ((EAI) this.A00.A05()).CDO(i, bArr, i2, i3);
    }

    public synchronized void close() {
        DRN drn = this.A00;
        if (drn != null) {
            drn.close();
        }
        this.A00 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r4 > ((X.EAI) r3.A05()).BZK()) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DRG(X.DRN r3, int r4) {
        /*
            r2 = this;
            r2.<init>()
            if (r4 < 0) goto L_0x0012
            java.lang.Object r0 = r3.A05()
            X.EAI r0 = (X.EAI) r0
            int r1 = r0.BZK()
            r0 = 1
            if (r4 <= r1) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            X.C26208Cuj.A04(r0)
            X.DRN r0 = r3.clone()
            r2.A00 = r0
            r2.A01 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DRG.<init>(X.DRN, int):void");
    }
}
