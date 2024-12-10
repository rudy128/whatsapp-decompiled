package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.CcL  reason: case insensitive filesystem */
public class C25273CcL {
    public int A00 = 0;
    public int A01 = 0;
    public final int A02;
    public final AnonymousClass18A A03 = new AnonymousClass18A();
    public final C26037Cqx A04;
    public final CT0 A05;
    public final AnonymousClass11N A06;
    public final AnonymousClass185 A07;

    public byte[] A05(int i) {
        if (i == 1) {
            C24999CSz cSz = this.A05.A05[this.A02];
            int i2 = cSz.A00;
            return new byte[]{(byte) cSz.A02, (byte) i2, (byte) (i2 >> 8)};
        }
        C24999CSz cSz2 = this.A05.A05[this.A02];
        int i3 = cSz2.A00;
        return new byte[]{(byte) cSz2.A02, (byte) i3, (byte) (i3 >> 8), (byte) cSz2.A05};
    }

    public final int A00() {
        if (this.A02 == this.A05.A01) {
            return this.A00;
        }
        throw BE6.A0v("No event count available for rotated buffers");
    }

    public void A01() {
        C26037Cqx cqx = this.A04;
        cqx.A02.clear();
        cqx.A01 = 0;
        cqx.A03.reset();
        cqx.A00 = 0;
        C24999CSz cSz = this.A05.A05[this.A02];
        cSz.A01 = cqx.A01;
        cSz.A04 = 0;
        cSz.A02 = 1;
        cSz.A00 = 0;
        cSz.A03 = cqx.A01();
        this.A01 = 0;
        this.A00 = 0;
        this.A03.A00.clear();
    }

    public void A02() {
        try {
            C26037Cqx cqx = this.A04;
            cqx.A02();
            C24999CSz cSz = this.A05.A05[this.A02];
            cSz.A01 = cqx.A01;
            cSz.A03 = cqx.A01();
        } catch (IOException e) {
            AnonymousClass185 r1 = this.A07;
            r1.A0B = AnonymousClass000.A0i();
            r1.A0d();
            Log.e("eventbuffer/flushEventBuffers: cannot write event buffer", e);
            throw e;
        }
    }

    public void A03() {
        try {
            C26037Cqx cqx = this.A04;
            CT0 ct0 = this.A05;
            C24999CSz[] cSzArr = ct0.A05;
            int i = this.A02;
            cqx.A03(cSzArr[i].A01);
            ByteBuffer byteBuffer = cqx.A02;
            boolean z = true;
            Log.a(AnonymousClass000.A1T(byteBuffer.position(), cSzArr[i].A01));
            if (cqx.A01 != cSzArr[i].A01) {
                z = false;
            }
            Log.a(z);
            int i2 = (cqx.A01() > cSzArr[i].A03 ? 1 : (cqx.A01() == cSzArr[i].A03 ? 0 : -1));
            boolean A1T = AnonymousClass000.A1T(i, ct0.A01);
            if (i2 != 0) {
                AnonymousClass185 r1 = this.A07;
                Boolean A0i = AnonymousClass000.A0i();
                if (A1T) {
                    r1.A06 = A0i;
                } else {
                    r1.A05 = A0i;
                }
                throw new C24387C1h("Invalid checksum");
            } else if (A1T) {
                this.A01 = 0;
                this.A00 = 0;
                AnonymousClass18A r5 = this.A03;
                r5.A00.clear();
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                asReadOnlyBuffer.flip();
                if (asReadOnlyBuffer.limit() != 0) {
                    byte[][] bArr = CGF.A00;
                    byte[] bArr2 = new byte[bArr[2].length];
                    try {
                        asReadOnlyBuffer.get(bArr2);
                        int i3 = 0;
                        while (!Arrays.equals(bArr2, bArr[i3])) {
                            i3++;
                            if (i3 >= 3) {
                                throw AnonymousClass8BR.A0w(AnonymousClass001.A1E(bArr2, "Invalid value: ", AnonymousClass000.A10()));
                            }
                        }
                        if (i3 >= 0) {
                            if (i3 >= 1) {
                                asReadOnlyBuffer.get(A05(i3));
                            }
                            while (asReadOnlyBuffer.position() < asReadOnlyBuffer.limit()) {
                                try {
                                    CQX A032 = C26239Cvc.A03(asReadOnlyBuffer);
                                    this.A01++;
                                    int i4 = A032.A01;
                                    if (i4 == 1) {
                                        this.A00++;
                                    } else if (i4 == 0) {
                                        r5.A00(A032.A00, A032.A02);
                                    }
                                } catch (C24388C1i e) {
                                    throw new C24387C1h(e.toString());
                                }
                            }
                            return;
                        }
                        throw new C24387C1h("Invalid event buffer header");
                    } catch (BufferUnderflowException unused) {
                        throw new C24387C1h("Event buffer does not have a header");
                    }
                }
            }
        } catch (IOException e2) {
            throw new C24387C1h(e2.toString());
        }
    }

    public final void A04(byte[] bArr, int i) {
        ByteBuffer byteBuffer = this.A04.A02;
        if (byteBuffer.position() == 0) {
            byteBuffer.put(CGF.A00[2]);
            CT0 ct0 = this.A05;
            C24999CSz cSz = ct0.A05[this.A02];
            int i2 = ct0.A00 + 1;
            ct0.A00 = i2;
            if (i2 > 65535) {
                ct0.A00 = 1;
                i2 = 1;
            }
            cSz.A00 = i2;
            byteBuffer.put(A05(2));
        }
        int min = Math.min(bArr.length, i);
        if (min <= byteBuffer.remaining()) {
            byteBuffer.put(bArr, 0, min);
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Not enough space in the buffer lenToWrite = ");
        A10.append(min);
        A10.append(" remaining = ");
        throw BE6.A0l(C17880vN.A0t(A10, byteBuffer.remaining()));
    }

    public C25273CcL(AnonymousClass11N r5, CT0 ct0, AnonymousClass185 r7, RandomAccessFile randomAccessFile, int i, int i2) {
        C26037Cqx cqx;
        int i3 = 65536;
        int i4 = (i * 65536) + 65536;
        if (i2 != 0) {
            if (i2 == 1) {
                i4 = (i * 16384) + 65536;
                i3 = 16384;
            } else {
                cqx = new C26037Cqx(r7, randomAccessFile, (i * 32768) + 65536, 32768);
                this.A04 = cqx;
                this.A02 = i;
                this.A05 = ct0;
                this.A07 = r7;
                this.A06 = r5;
            }
        }
        cqx = new C26037Cqx(r7, randomAccessFile, i4, i3);
        this.A04 = cqx;
        this.A02 = i;
        this.A05 = ct0;
        this.A07 = r7;
        this.A06 = r5;
    }
}
