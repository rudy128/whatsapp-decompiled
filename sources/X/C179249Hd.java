package X;

import com.whatsapp.util.Log;
import java.io.OutputStream;
import java.security.MessageDigest;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;

/* renamed from: X.9Hd  reason: invalid class name and case insensitive filesystem */
public class C179249Hd extends OutputStream {
    public int A00;
    public boolean A01;
    public byte[] A02 = new byte[1];
    public final C184429aw A03;
    public final OutputStream A04;
    public final Cipher A05;
    public final Mac A06;
    public final byte[] A07;

    public void close() {
        this.A04.close();
    }

    public void write(byte[] bArr, int i, int i2) {
        long j;
        if (i2 > 0) {
            C184429aw r6 = this.A03;
            long j2 = r6.A01;
            if (((long) (i + i2)) <= j2) {
                long j3 = r6.A00;
                long j4 = j2 - 10;
                if (j3 < j4) {
                    if (j3 > j4) {
                        j = 0;
                    } else {
                        j = j4 - j3;
                    }
                    int min = (int) Math.min(j, (long) i2);
                    r6.A00 = j3 + ((long) min);
                    this.A06.update(bArr, i, min);
                    byte[] update = this.A05.update(bArr, i, min);
                    if (update != null && update.length > 0) {
                        this.A04.write(update);
                    }
                    if (i2 > min) {
                        i += min;
                        i2 -= min;
                    } else {
                        return;
                    }
                } else if (j3 >= j2) {
                    throw C17880vN.A0f("Passed in total length is already read");
                }
                int i3 = this.A00;
                int i4 = i2 - (10 - i3);
                if (i4 > 0) {
                    i2 -= i4;
                }
                r6.A00 += (long) i2;
                byte[] bArr2 = this.A07;
                System.arraycopy(bArr, i, bArr2, i3, i2);
                int i5 = this.A00 + i2;
                this.A00 = i5;
                if (i5 >= 10) {
                    A8G.A04(bArr2, 10);
                    try {
                        if (MessageDigest.isEqual(bArr2, A8G.A04(this.A06.doFinal(), 10))) {
                            this.A04.write(this.A05.doFinal());
                            this.A01 = true;
                            return;
                        }
                        return;
                    } catch (IllegalBlockSizeException e) {
                        Log.w((Throwable) e);
                        throw C17880vN.A0f("Bad block size!");
                    } catch (BadPaddingException e2) {
                        Log.w((Throwable) e2);
                        throw C17880vN.A0f("Bad padding!");
                    }
                } else {
                    return;
                }
            }
        }
        throw C17880vN.A0f("Incorrect parameters passed in to read from");
    }

    public C179249Hd(C185849dF r4, OutputStream outputStream, long j) {
        this.A04 = outputStream;
        this.A03 = new C184429aw(j);
        byte[] bArr = r4.A01;
        this.A05 = A3N.A01(bArr, r4.A00, 2);
        this.A06 = A3N.A02(bArr, r4.A02);
        this.A07 = new byte[10];
        this.A01 = false;
    }

    public void write(int i) {
        byte[] bArr = this.A02;
        bArr[0] = (byte) (i & 255);
        write(bArr, 0, 1);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
