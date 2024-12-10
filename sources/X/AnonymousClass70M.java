package X;

import com.whatsapp.util.Log;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;

/* renamed from: X.70M  reason: invalid class name */
public abstract class AnonymousClass70M {
    public final int A00;
    public final long A01;
    public final int[] A02;

    public static synchronized long A01(AnonymousClass70M r2, int i) {
        long j;
        synchronized (r2) {
            j = (long) r2.A02[i];
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        if (r16 == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        r3 = (int) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006b, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r11.A02[r6] = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
        if (r1 != ((long) A02(r6))) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
        X.C17890vO.A1D(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A07(long r12, long r14, boolean r16) {
        /*
            r11 = this;
            r10 = r11
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
        L_0x0005:
            r8 = 0
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0089
            int r7 = r11.A03(r12)
            long r3 = r11.A05(r7)
            long r1 = r12 - r3
            r6 = 1
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            X.C17960vV.A0D(r0)
            int r0 = r11.A02(r7)
            long r3 = (long) r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0029
            r6 = 0
        L_0x0029:
            X.C17960vV.A0D(r6)
            int r6 = r11.A03(r12)
            long r3 = A01(r11, r6)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0082
            long r1 = r1 + r14
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0089
            int r7 = r11.A02(r6)
            long r3 = (long) r7
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0068
            if (r16 == 0) goto L_0x004e
            monitor-enter(r10)
            int[] r0 = r11.A02     // Catch:{ all -> 0x0071 }
            r0[r6] = r7     // Catch:{ all -> 0x0071 }
            monitor-exit(r10)
        L_0x004e:
            long r3 = (long) r7
            long r1 = r1 - r3
            int r3 = r6 + 1
            int r0 = r11.A00
            if (r3 >= r0) goto L_0x0061
            X.C17890vO.A1D(r5, r6)
            int r0 = r6 + 1
            long r12 = r11.A05(r0)
            r14 = r1
            goto L_0x0005
        L_0x0061:
            java.lang.String r0 = "downloaded more bytes than chunks"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0068:
            if (r16 == 0) goto L_0x0075
            int r3 = (int) r1
            monitor-enter(r10)
            int[] r0 = r11.A02     // Catch:{ all -> 0x0071 }
            r0[r6] = r3     // Catch:{ all -> 0x0071 }
            goto L_0x0074
        L_0x0071:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x0074:
            monitor-exit(r10)
        L_0x0075:
            int r0 = r11.A02(r6)
            long r3 = (long) r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0089
            X.C17890vO.A1D(r5, r6)
            return r5
        L_0x0082:
            java.lang.String r0 = "gap in downloaded chunk"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0089:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70M.A07(long, long, boolean):java.util.ArrayList");
    }

    public synchronized boolean A09(int i) {
        return AnonymousClass000.A1T(this.A02[i], A02(i));
    }

    public synchronized String toString() {
        StringBuilder A10;
        String str;
        A10 = AnonymousClass000.A10();
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("totalBytes: ");
        A102.append(this.A01);
        A102.append(", ");
        StringBuilder A0q = C108985cd.A0q(A102, A10);
        A0q.append("chunkCount: ");
        int i = this.A00;
        A0q.append(i);
        C108985cd.A1L(", ", A0q, A10);
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            if (!A09(i3)) {
                if (i2 >= 0) {
                    if (i3 - 1 != i2) {
                        StringBuilder A103 = AnonymousClass000.A10();
                        A103.append("-");
                        A103.append(i3 - 1);
                        str = AnonymousClass000.A0y("]", A103);
                    } else {
                        str = "]";
                    }
                    A10.append(str);
                    i2 = -1;
                }
                int[] iArr = this.A02;
                if (iArr[i3] > 0) {
                    StringBuilder A104 = AnonymousClass000.A10();
                    A104.append("[");
                    A104.append(i3);
                    A104.append("] ");
                    A104.append(iArr[i3]);
                    C108985cd.A1L(", ", A104, A10);
                }
            } else if (i2 < 0) {
                A10.append(AnonymousClass001.A1I("[", AnonymousClass000.A10(), i3));
                i2 = i3;
            }
        }
        if (i2 >= 0) {
            StringBuilder A105 = AnonymousClass000.A10();
            A105.append("[");
            A105.append(i2);
            A105.append("-");
            A105.append(i - 1);
            C108985cd.A1L("]", A105, A10);
        }
        return A10.toString();
    }

    public int A02(int i) {
        if (this instanceof AnonymousClass6IQ) {
            return AnonymousClass001.A0n(((AnonymousClass6IQ) this).A00, i);
        }
        AnonymousClass6IP r1 = (AnonymousClass6IP) this;
        int i2 = r1.A00 - 1;
        long j = r1.A01;
        if (i == i2) {
            j = Math.min(j, r1.A01 % j);
        }
        return (int) j;
    }

    public int A03(long j) {
        boolean z = true;
        int i = 0;
        C17960vV.A0D(AnonymousClass000.A1Q((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        if (j >= this.A01) {
            z = false;
        }
        C17960vV.A0D(z);
        int i2 = 0;
        while (i < this.A00) {
            i2 += A02(i);
            if (j < ((long) i2)) {
                break;
            }
            i++;
        }
        return i;
    }

    public long A04() {
        long j = 0;
        for (int i = 0; i < this.A00; i++) {
            j += A01(this, i);
        }
        return j;
    }

    public long A05(int i) {
        long j = 0;
        int i2 = 0;
        while (i2 < i && i2 < this.A00) {
            j += (long) A02(i2);
            i2++;
        }
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A06(long r7) {
        /*
            r6 = this;
            long r4 = r6.A01
            r2 = -1
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0024
            int r4 = r6.A03(r7)
        L_0x000c:
            int r1 = r6.A00
            if (r4 >= r1) goto L_0x0019
            boolean r0 = r6.A09(r4)
            if (r0 == 0) goto L_0x0019
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0019:
            if (r4 == r1) goto L_0x0024
            long r2 = r6.A05(r4)
            long r0 = A01(r6, r4)
            long r2 = r2 + r0
        L_0x0024:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70M.A06(long):long");
    }

    public void A08(File file) {
        DataOutputStream dataOutputStream;
        if (this instanceof AnonymousClass6IQ) {
            try {
                dataOutputStream = new DataOutputStream(new BufferedOutputStream(C108945cZ.A19(file)));
                dataOutputStream.writeLong(this.A01);
                for (int i = 0; i < this.A00; i++) {
                    dataOutputStream.writeInt(this.A02[i]);
                }
            } catch (IOException e) {
                Log.e("ChunkStore/chunk store write failed", e);
                return;
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
        } else {
            AnonymousClass6IP r2 = (AnonymousClass6IP) this;
            dataOutputStream = new DataOutputStream(new BufferedOutputStream(C108945cZ.A19(file)));
            dataOutputStream.writeLong(r2.A01);
            dataOutputStream.writeLong(r2.A01);
            dataOutputStream.writeInt(r2.A00);
            for (int i2 = 0; i2 < r2.A00; i2++) {
                dataOutputStream.writeInt(r2.A02[i2]);
            }
        }
        dataOutputStream.flush();
        dataOutputStream.close();
        return;
        throw th;
    }

    public AnonymousClass70M(int[] iArr, int i, long j) {
        this.A01 = j;
        this.A00 = i;
        if (iArr == null) {
            this.A02 = new int[i];
        } else {
            this.A02 = iArr;
        }
    }
}
