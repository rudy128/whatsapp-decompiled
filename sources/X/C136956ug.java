package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.6ug  reason: invalid class name and case insensitive filesystem */
public class C136956ug {
    public long A00;
    public long A01;
    public AnonymousClass70M A02;
    public File A03;
    public final C128746gc A04 = new C128746gc();
    public final List A05 = new CopyOnWriteArrayList();
    public final boolean A06;
    public volatile int A07 = -1;
    public volatile int A08;
    public volatile int A09;
    public volatile long A0A;
    public volatile long A0B;
    public volatile File A0C;
    public volatile Long A0D;
    public volatile String A0E;
    public volatile boolean A0F;
    public volatile boolean A0G = false;
    public volatile boolean A0H;
    public volatile boolean A0I;

    public synchronized long A00() {
        long j;
        j = this.A01;
        if (j == 0) {
            j = this.A00;
        }
        return j;
    }

    public synchronized void A01() {
        File file = this.A03;
        if (file != null) {
            if (!file.delete()) {
                Log.w("DownloadContext/unable to delete chunkstore file");
            }
            this.A03 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A05(long r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r1 = r4.A08     // Catch:{ all -> 0x0035 }
            r0 = 3
            r3 = 1
            if (r1 == r0) goto L_0x0033
            long r1 = r4.A00()     // Catch:{ all -> 0x0035 }
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x002c
            X.70M r0 = r4.A02     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x001e
            int r1 = r0.A03(r5)     // Catch:{ all -> 0x0035 }
            X.70M r0 = r4.A02     // Catch:{ all -> 0x0035 }
            boolean r1 = r0.A09(r1)     // Catch:{ all -> 0x0035 }
            goto L_0x002a
        L_0x001e:
            boolean r0 = r4.A06     // Catch:{ all -> 0x0035 }
            r1 = 0
            if (r0 == 0) goto L_0x002a
            long r1 = r4.A0B     // Catch:{ all -> 0x0035 }
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0033
            goto L_0x0032
        L_0x002a:
            monitor-exit(r4)
            return r1
        L_0x002c:
            java.io.EOFException r0 = new java.io.EOFException     // Catch:{ all -> 0x0035 }
            r0.<init>()     // Catch:{ all -> 0x0035 }
            throw r0     // Catch:{ all -> 0x0035 }
        L_0x0032:
            r3 = 0
        L_0x0033:
            monitor-exit(r4)
            return r3
        L_0x0035:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136956ug.A05(long):boolean");
    }

    public void A02(int i) {
        if (this.A07 != i) {
            this.A07 = i;
            for (C160828Ab BsE : this.A05) {
                BsE.BsE(i);
            }
        }
    }

    public void A03(int i) {
        if (this.A08 != i) {
            this.A08 = i;
            for (C160828Ab BsF : this.A05) {
                BsF.BsF(this.A08);
            }
        }
    }

    public void A04(long j, long j2) {
        this.A0B = j;
        for (C160828Ab Bn3 : this.A05) {
            Bn3.Bn3(this, j2);
        }
    }

    public C136956ug(boolean z) {
        this.A06 = z;
    }
}
