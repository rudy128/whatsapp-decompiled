package X;

import android.net.Uri;
import android.os.Handler;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.7B2  reason: invalid class name */
public class AnonymousClass7B2 implements E9Q, C160828Ab {
    public long A00;
    public RandomAccessFile A01;
    public boolean A02;
    public long A03;
    public long A04;
    public final Handler A05 = C17890vO.A0D();
    public final C24921Me A06;
    public final AnonymousClass118 A07;
    public final AnonymousClass11Z A08;
    public final C25181Nf A09;
    public final AnonymousClass21W A0A;
    public final C136956ug A0B;
    public final C131776le A0C;

    public void BBr(C28570E8b e8b) {
    }

    public void Bn3(C136956ug r1, long j) {
    }

    public void BsE(int i) {
    }

    public void C06(File file, boolean z) {
    }

    public void C3T() {
    }

    public Uri Bb3() {
        return Uri.fromFile(this.A0B.A0C);
    }

    public void BsF(int i) {
        this.A05.post(new C146827Qt(this, i, 1));
    }

    public void BuV() {
        RandomAccessFile randomAccessFile;
        File file = this.A0B.A0C;
        if (this.A02 && (randomAccessFile = this.A01) != null) {
            try {
                long filePointer = randomAccessFile.getFilePointer();
                try {
                    this.A01.close();
                    this.A01 = null;
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                    this.A01 = randomAccessFile2;
                    randomAccessFile2.seek(filePointer);
                } catch (IOException e) {
                    Log.e((Throwable) e);
                    this.A01 = null;
                } catch (Throwable th) {
                    this.A01 = null;
                    throw th;
                }
            } catch (IOException e2) {
                Log.e((Throwable) e2);
                Log.e("WhatsappChunkAwareDataSource/hotswap failed");
            }
        }
    }

    public long CAj(C26115Csd csd) {
        this.A03 = 0;
        long j = csd.A03;
        this.A00 = j;
        C136956ug r8 = this.A0B;
        r8.A05.add(this);
        C128746gc r1 = r8.A04;
        long j2 = this.A00;
        Handler handler = r1.A02;
        handler.removeCallbacks(r1.A01);
        C146487Ph r2 = new C146487Ph(r1, j2, 25);
        r1.A01 = r2;
        handler.postDelayed(r2, 200);
        long A002 = r8.A00() - j;
        this.A04 = A002;
        return A002;
    }

    public void close() {
        RandomAccessFile randomAccessFile = this.A01;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                this.A01 = null;
                if (this.A02) {
                    this.A02 = false;
                }
            } catch (IOException e) {
                throw new C24186Bww(e);
            } catch (Throwable th) {
                this.A01 = null;
                if (this.A02) {
                    this.A02 = false;
                }
                throw th;
            }
        }
        this.A0B.A05.remove(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a2, code lost:
        if (r0 == -1) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ae, code lost:
        if (r0 == 0) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b0, code lost:
        r4 = r11.A01.read(r12, r13, (int) java.lang.Math.min((long) r6, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bc, code lost:
        if (r4 != -1) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c4, code lost:
        if (r11.A04 == r11.A03) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00cb, code lost:
        throw new java.io.EOFException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00cc, code lost:
        r11.A03 += (long) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d2, code lost:
        return r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r12, int r13, int r14) {
        /*
            r11 = this;
            X.6ug r4 = r11.A0B
            int r0 = r4.A08
            r10 = 0
            if (r0 == 0) goto L_0x00e4
            int r1 = r4.A08
            r0 = 2
            if (r1 == r0) goto L_0x00e4
            java.io.File r0 = r4.A0C
            boolean r1 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "downloadFile is null"
            X.C17960vV.A0F(r1, r0)
            boolean r0 = r11.A02
            if (r0 != 0) goto L_0x0036
            java.io.File r1 = r4.A0C     // Catch:{ IOException -> 0x002c }
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x002c }
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x002c }
            r11.A01 = r2     // Catch:{ IOException -> 0x002c }
            long r0 = r11.A00     // Catch:{ IOException -> 0x002c }
            r2.seek(r0)     // Catch:{ IOException -> 0x002c }
            goto L_0x0033
        L_0x002c:
            r0 = move-exception
            X.Bww r1 = new X.Bww
            r1.<init>(r0)
            throw r1
        L_0x0033:
            r0 = 1
            r11.A02 = r0
        L_0x0036:
            long r5 = (long) r14
            long r2 = r11.A04
            long r0 = r11.A03
            long r2 = r2 - r0
            long r0 = java.lang.Math.min(r5, r2)
            int r6 = (int) r0
            r5 = -1
            if (r6 == 0) goto L_0x00e3
            java.io.RandomAccessFile r0 = r11.A01
            X.C17960vV.A07(r0)
            long r0 = r0.getFilePointer()
            boolean r0 = r4.A05(r0)
            if (r0 == 0) goto L_0x00e4
            java.io.RandomAccessFile r0 = r11.A01
            long r2 = r0.getFilePointer()
            monitor-enter(r4)
            int r1 = r4.A08     // Catch:{ all -> 0x00e0 }
            r0 = 3
            if (r1 != r0) goto L_0x0062
            long r0 = r4.A01     // Catch:{ all -> 0x00e0 }
            goto L_0x00a8
        L_0x0062:
            boolean r0 = r4.A05(r2)     // Catch:{ all -> 0x00e0 }
            if (r0 != 0) goto L_0x006a
            monitor-exit(r4)
            return r10
        L_0x006a:
            long r7 = r4.A00()     // Catch:{ all -> 0x00e0 }
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x00d3
            X.70M r8 = r4.A02     // Catch:{ all -> 0x00e0 }
            if (r8 == 0) goto L_0x0094
            long r0 = r8.A01     // Catch:{ all -> 0x00e0 }
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a4
            int r7 = r8.A03(r2)     // Catch:{ all -> 0x00e0 }
        L_0x0080:
            int r1 = r8.A00     // Catch:{ all -> 0x00e0 }
            if (r7 >= r1) goto L_0x008d
            boolean r0 = r8.A09(r7)     // Catch:{ all -> 0x00e0 }
            if (r0 == 0) goto L_0x008d
            int r7 = r7 + 1
            goto L_0x0080
        L_0x008d:
            if (r7 == r1) goto L_0x00a4
            long r0 = r8.A05(r7)     // Catch:{ all -> 0x00e0 }
            goto L_0x009e
        L_0x0094:
            boolean r0 = r4.A06     // Catch:{ all -> 0x00e0 }
            if (r0 == 0) goto L_0x00d9
            long r0 = r4.A0B     // Catch:{ all -> 0x00e0 }
            r7 = 65536(0x10000, double:3.2379E-319)
            long r0 = r0 + r7
        L_0x009e:
            r8 = -1
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x00a8
        L_0x00a4:
            long r0 = r4.A00()     // Catch:{ all -> 0x00e0 }
        L_0x00a8:
            long r0 = r0 - r2
            monitor-exit(r4)
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x00e4
            java.io.RandomAccessFile r4 = r11.A01
            long r2 = (long) r6
            long r1 = java.lang.Math.min(r2, r0)
            int r0 = (int) r1
            int r4 = r4.read(r12, r13, r0)
            if (r4 != r5) goto L_0x00cc
            long r3 = r11.A04
            long r1 = r11.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00e3
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L_0x00cc:
            long r2 = r11.A03
            long r0 = (long) r4
            long r2 = r2 + r0
            r11.A03 = r2
            return r4
        L_0x00d3:
            java.io.EOFException r0 = new java.io.EOFException     // Catch:{ all -> 0x00e0 }
            r0.<init>()     // Catch:{ all -> 0x00e0 }
            goto L_0x00df
        L_0x00d9:
            java.lang.String r0 = "chunkStore is null for encrypted media"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x00e0 }
        L_0x00df:
            throw r0     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r1 = move-exception
            monitor-exit(r4)
            throw r1
        L_0x00e3:
            return r5
        L_0x00e4:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7B2.read(byte[], int, int):int");
    }

    public AnonymousClass7B2(C24921Me r2, AnonymousClass118 r3, AnonymousClass11Z r4, C25181Nf r5, AnonymousClass21W r6, C136956ug r7, C131776le r8) {
        this.A07 = r3;
        this.A08 = r4;
        this.A06 = r2;
        this.A09 = r5;
        this.A0A = r6;
        this.A0B = r7;
        this.A0C = r8;
    }
}
