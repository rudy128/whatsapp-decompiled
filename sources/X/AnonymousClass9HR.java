package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.List;
import javax.crypto.Mac;

/* renamed from: X.9HR  reason: invalid class name */
public abstract class AnonymousClass9HR extends FilterInputStream {
    public boolean A00 = false;
    public int A01 = 0;
    public Mac A02;
    public final int A03 = 10;
    public final AnonymousClass9j6 A04;
    public final C185849dF A05;
    public final List A06;
    public final AnonymousClass9NI A07;
    public final byte[] A08;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.9NI, java.lang.Object] */
    public AnonymousClass9HR(C185849dF r5, InputStream inputStream) {
        super(inputStream);
        ? obj = new Object();
        obj.A01 = 0;
        obj.A00 = 0;
        obj.A02 = new byte[16];
        this.A07 = obj;
        this.A05 = r5;
        this.A06 = AnonymousClass000.A13();
        this.A02 = A3N.A02(r5.A01, r5.A02);
        this.A08 = new byte[DefaultCrypto.BUFFER_SIZE];
        this.A04 = new AnonymousClass9j6(this);
    }

    private byte[] A00(byte[] bArr, int i) {
        byte[] bArr2 = new byte[16];
        if (i < 16) {
            AnonymousClass9NI r5 = this.A07;
            int i2 = 16 - i;
            boolean z = false;
            if (i2 <= r5.A00) {
                z = true;
            }
            C17960vV.A0D(z);
            byte[] bArr3 = new byte[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = (r5.A01 - i2) + i3;
                if (i4 < 0) {
                    i4 += 16;
                }
                bArr3[i3] = r5.A02[i4];
            }
            System.arraycopy(bArr3, 0, bArr2, 0, i2);
            System.arraycopy(bArr, 0, bArr2, i2, i);
            return bArr2;
        }
        System.arraycopy(bArr, i - 16, bArr2, 0, 16);
        return bArr2;
    }

    public long skip(long j) {
        byte[] bArr = this.A08;
        return (long) read(bArr, 0, (int) Math.min((long) bArr.length, j));
    }

    public void close() {
        super.close();
        if (this.A01 > 0) {
            this.A06.add(A8G.A04(this.A02.doFinal(), this.A03));
        }
        this.A00 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f5, code lost:
        r12.A02.update(r13, r6, r2);
        r12.A01 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r2 == (r1 - 1)) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0104 A[LOOP:1: B:30:0x00d1->B:40:0x0104, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f5 A[EDGE_INSN: B:46:0x00f5->B:37:0x00f5 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r13, int r14, int r15) {
        /*
            r12 = this;
            int r9 = super.read(r13, r14, r15)
            if (r9 <= 0) goto L_0x0126
            r0 = r12
            boolean r8 = r12 instanceof X.AnonymousClass8oM
            if (r8 == 0) goto L_0x0123
            X.8oM r0 = (X.AnonymousClass8oM) r0
            int r2 = r0.A00
            java.util.List r0 = r0.A01
            int r1 = r0.size()
            r0 = 1
            int r1 = r1 - r0
            if (r2 != r1) goto L_0x0123
        L_0x0019:
            r7 = 0
            if (r0 == 0) goto L_0x004e
            int r0 = r12.A01
            int r0 = r0 + r9
            r12.A01 = r0
            javax.crypto.Mac r0 = r12.A02
            r0.update(r13, r7, r9)
        L_0x0026:
            int r0 = r9 + -16
            int r5 = java.lang.Math.max(r7, r0)
        L_0x002c:
            if (r5 >= r9) goto L_0x0126
            X.9NI r4 = r12.A07
            byte r3 = r13[r5]
            int r2 = r4.A01
            r1 = 16
            if (r2 < r1) goto L_0x003b
            r4.A01 = r7
            r2 = 0
        L_0x003b:
            byte[] r0 = r4.A02
            r0[r2] = r3
            int r0 = r2 + 1
            r4.A01 = r0
            int r0 = r4.A00
            if (r0 >= r1) goto L_0x004b
            int r0 = r0 + 1
            r4.A00 = r0
        L_0x004b:
            int r5 = r5 + 1
            goto L_0x002c
        L_0x004e:
            r2 = r12
            if (r8 == 0) goto L_0x0099
            r0 = r2
            X.8oM r0 = (X.AnonymousClass8oM) r0
            java.util.List r1 = r0.A01
            int r0 = r0.A00
            int r6 = X.AnonymousClass001.A0n(r1, r0)
        L_0x005c:
            int r3 = r12.A01
            int r0 = r3 + r9
            if (r0 > r6) goto L_0x009f
            r12.A01 = r0
            javax.crypto.Mac r0 = r12.A02
            r0.update(r13, r7, r9)
            int r0 = r12.A01
            if (r0 != r6) goto L_0x0026
            r12.A01 = r7
            javax.crypto.Mac r0 = r12.A02
            byte[] r1 = r0.doFinal()
            int r0 = r12.A03
            byte[] r1 = X.A8G.A04(r1, r0)
            java.util.List r0 = r12.A06
            r0.add(r1)
            byte[] r1 = r12.A00(r13, r9)
            X.9dF r0 = r12.A05
            byte[] r0 = r0.A02
            javax.crypto.Mac r0 = X.A3N.A02(r1, r0)
            r12.A02 = r0
            if (r8 == 0) goto L_0x0026
            X.8oM r2 = (X.AnonymousClass8oM) r2
            int r0 = r2.A00
            int r0 = r0 + 1
            r2.A00 = r0
            goto L_0x0026
        L_0x0099:
            r0 = r2
            X.8oL r0 = (X.AnonymousClass8oL) r0
            int r6 = r0.A00
            goto L_0x005c
        L_0x009f:
            javax.crypto.Mac r1 = r12.A02
            int r0 = r6 - r3
            r1.update(r13, r7, r0)
            javax.crypto.Mac r0 = r12.A02
            byte[] r0 = r0.doFinal()
            int r5 = r12.A03
            byte[] r0 = X.A8G.A04(r0, r5)
            java.util.List r4 = r12.A06
            r4.add(r0)
            int r0 = r12.A01
            int r0 = r6 - r0
            byte[] r1 = r12.A00(r13, r0)
            X.9dF r0 = r12.A05
            byte[] r3 = r0.A02
            javax.crypto.Mac r0 = X.A3N.A02(r1, r3)
            r12.A02 = r0
            int r0 = r12.A01
            int r2 = r0 + r9
            int r2 = r2 - r6
            int r6 = r6 - r0
            r12.A01 = r7
        L_0x00d1:
            r11 = r12
            if (r8 == 0) goto L_0x00dd
            r1 = r11
            X.8oM r1 = (X.AnonymousClass8oM) r1
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A00 = r0
        L_0x00dd:
            if (r2 <= 0) goto L_0x0026
            if (r8 == 0) goto L_0x00fe
            X.8oM r11 = (X.AnonymousClass8oM) r11
            java.util.List r10 = r11.A01
            int r0 = r11.A00
            int r1 = X.AnonymousClass001.A0n(r10, r0)
            int r11 = r11.A00
            int r10 = r10.size()
            r0 = 1
            int r10 = r10 - r0
            if (r11 != r10) goto L_0x0102
        L_0x00f5:
            javax.crypto.Mac r0 = r12.A02
            r0.update(r13, r6, r2)
            r12.A01 = r2
            goto L_0x0026
        L_0x00fe:
            X.8oL r11 = (X.AnonymousClass8oL) r11
            int r1 = r11.A00
        L_0x0102:
            if (r2 < r1) goto L_0x00f5
            javax.crypto.Mac r0 = r12.A02
            r0.update(r13, r6, r1)
            javax.crypto.Mac r0 = r12.A02
            byte[] r0 = r0.doFinal()
            byte[] r0 = X.A8G.A04(r0, r5)
            r4.add(r0)
            int r6 = r6 + r1
            byte[] r0 = r12.A00(r13, r6)
            javax.crypto.Mac r0 = X.A3N.A02(r0, r3)
            r12.A02 = r0
            int r2 = r2 - r1
            goto L_0x00d1
        L_0x0123:
            r0 = 0
            goto L_0x0019
        L_0x0126:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9HR.read(byte[], int, int):int");
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read() {
        int read;
        byte[] bArr = new byte[1];
        do {
            read = read(bArr, 0, 1);
            if (read == -1) {
                return -1;
            }
        } while (read == 0);
        return bArr[0];
    }
}
