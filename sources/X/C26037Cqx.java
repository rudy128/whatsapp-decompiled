package X;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.Adler32;
import java.util.zip.Checksum;

/* renamed from: X.Cqx  reason: case insensitive filesystem */
public class C26037Cqx {
    public static final long A07 = new Adler32().getValue();
    public int A00;
    public int A01 = 0;
    public final ByteBuffer A02;
    public final Checksum A03;
    public final int A04;
    public final AnonymousClass185 A05;
    public final RandomAccessFile A06;

    private void A00(long j) {
        RandomAccessFile randomAccessFile = this.A06;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.seek(j);
            } catch (IOException e) {
                AnonymousClass185 r1 = this.A05;
                r1.A02 = AnonymousClass000.A0i();
                r1.A0d();
                throw e;
            }
        } else {
            throw C17880vN.A0f("File not available");
        }
    }

    public final long A01() {
        Checksum checksum = this.A03;
        ByteBuffer byteBuffer = this.A02;
        checksum.update(byteBuffer.array(), this.A00, byteBuffer.position() - this.A00);
        this.A00 = byteBuffer.position();
        return checksum.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r4 = r6.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r6 = this;
            java.io.RandomAccessFile r5 = r6.A06
            if (r5 == 0) goto L_0x0039
            java.nio.ByteBuffer r4 = r6.A02
            int r0 = r4.position()
            int r1 = r6.A01
            if (r0 == r1) goto L_0x0039
            int r0 = r6.A04
            int r0 = r0 + r1
            long r0 = (long) r0
            r6.A00(r0)
            byte[] r3 = r4.array()     // Catch:{ IOException -> 0x0026 }
            int r2 = r6.A01     // Catch:{ IOException -> 0x0026 }
            int r1 = r4.position()     // Catch:{ IOException -> 0x0026 }
            int r0 = r6.A01     // Catch:{ IOException -> 0x0026 }
            int r1 = r1 - r0
            r5.write(r3, r2, r1)     // Catch:{ IOException -> 0x0026 }
            goto L_0x0033
        L_0x0026:
            r2 = move-exception
            X.185 r1 = r6.A05
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A01 = r0
            r1.A0d()
            throw r2
        L_0x0033:
            int r0 = r4.position()
            r6.A01 = r0
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26037Cqx.A02():void");
    }

    public void A03(int i) {
        AnonymousClass185 r1;
        RandomAccessFile randomAccessFile = this.A06;
        if (randomAccessFile != null) {
            A00((long) this.A04);
            try {
                ByteBuffer byteBuffer = this.A02;
                randomAccessFile.readFully(byteBuffer.array(), 0, i);
                byteBuffer.position(i);
                this.A01 = i;
                this.A03.reset();
                this.A00 = 0;
            } catch (EOFException e) {
                e = e;
                r1 = this.A05;
                r1.A09 = AnonymousClass000.A0i();
                r1.A0d();
                throw e;
            } catch (IOException e2) {
                e = e2;
                r1 = this.A05;
                r1.A0D = AnonymousClass000.A0i();
                r1.A0d();
                throw e;
            }
        } else {
            throw C17880vN.A0f("File not available");
        }
    }

    public final void A04(long j) {
        if (j < 0 || j > 4294967295L) {
            throw AnonymousClass000.A0k("Value is not an unsigned integer");
        }
        this.A02.putInt((int) j);
    }

    public C26037Cqx(AnonymousClass185 r4, RandomAccessFile randomAccessFile, int i, int i2) {
        this.A06 = randomAccessFile;
        this.A04 = i;
        ByteBuffer allocate = ByteBuffer.allocate(i2);
        this.A02 = allocate;
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        this.A03 = new Adler32();
        this.A00 = 0;
        this.A05 = r4;
    }
}
