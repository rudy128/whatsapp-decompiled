package X;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.2wE  reason: invalid class name and case insensitive filesystem */
public class C65332wE implements AnonymousClass1AQ {
    public long A00 = 0;
    public InputStream A01;
    public boolean A02 = true;
    public final long A03;
    public final ZipEntry A04;
    public final ZipFile A05;

    public int CDK(ByteBuffer byteBuffer, long j) {
        if (this.A01 != null) {
            int remaining = byteBuffer.remaining();
            long j2 = this.A03;
            long j3 = j2 - j;
            if (j3 <= 0) {
                return -1;
            }
            int i = (int) j3;
            if (remaining > i) {
                remaining = i;
            }
            InputStream inputStream = this.A01;
            if (inputStream != null) {
                long j4 = this.A00;
                if (j != j4) {
                    if (j > j2) {
                        j = j2;
                    }
                    if (j >= j4) {
                        inputStream.skip(j - j4);
                    } else {
                        inputStream.close();
                        ZipFile zipFile = this.A05;
                        ZipEntry zipEntry = this.A04;
                        InputStream inputStream2 = zipFile.getInputStream(zipEntry);
                        this.A01 = inputStream2;
                        if (inputStream2 != null) {
                            inputStream2.skip(j);
                        } else {
                            throw C17880vN.A0f(AnonymousClass001.A1H(zipEntry.getName(), "'s InputStream is null", AnonymousClass000.A10()));
                        }
                    }
                    this.A00 = j;
                }
                if (byteBuffer.hasArray()) {
                    this.A01.read(byteBuffer.array(), 0, remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                } else {
                    byte[] bArr = new byte[remaining];
                    this.A01.read(bArr, 0, remaining);
                    byteBuffer.put(bArr, 0, remaining);
                }
                this.A00 += (long) remaining;
                return remaining;
            }
            throw C17880vN.A0f(AnonymousClass001.A1H(this.A04.getName(), "'s InputStream is null", AnonymousClass000.A10()));
        }
        throw C17880vN.A0f("InputStream is null");
    }

    public void close() {
        InputStream inputStream = this.A01;
        if (inputStream != null) {
            inputStream.close();
            this.A02 = false;
        }
    }

    public int read(ByteBuffer byteBuffer) {
        return CDK(byteBuffer, this.A00);
    }

    public int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }

    public C65332wE(ZipEntry zipEntry, ZipFile zipFile) {
        this.A05 = zipFile;
        this.A04 = zipEntry;
        this.A03 = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.A01 = inputStream;
        if (inputStream == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(zipEntry.getName());
            throw C17880vN.A0f(AnonymousClass000.A0y("'s InputStream is null", A10));
        }
    }

    public boolean isOpen() {
        return this.A02;
    }
}
