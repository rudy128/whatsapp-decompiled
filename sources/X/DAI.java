package X;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

public abstract class DAI implements C28618EAq {
    public static final C25782Clt A02 = new C25782Clt(32);
    public int A00;
    public final AtomicLong A01 = new AtomicLong(0);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.C5Q, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v3, types: [X.C5Q, java.lang.Object] */
    public static C5Q A00(InputStream inputStream, boolean z) {
        C25782Clt clt = A02;
        C5Q c5q = (C5Q) clt.A00();
        C5Q c5q2 = c5q;
        if (c5q == null) {
            byte[] bArr = new byte[A7Y.A0F];
            ? obj = new Object();
            obj.A01 = null;
            obj.A02 = bArr;
            obj.A00 = 0;
            c5q2 = obj;
        }
        byte[] bArr2 = c5q2.A02;
        byte[] bArr3 = bArr2;
        int i = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr2, i, bArr2.length - i);
                if (read == -1) {
                    break;
                }
                i += read;
                int length = bArr2.length;
                if (i >= length) {
                    byte[] bArr4 = new byte[(length << 1)];
                    System.arraycopy(bArr2, 0, bArr4, 0, length);
                    bArr2 = bArr4;
                }
            } catch (IOException e) {
                if (!z || i == 0) {
                    clt.A02(c5q2);
                    if (z) {
                        C26138Ct1.A0J.A02();
                        return null;
                    }
                    throw e;
                }
            }
        }
        if (bArr3 != bArr2) {
            clt.A02(c5q2);
            ? obj2 = new Object();
            obj2.A01 = null;
            obj2.A02 = bArr2;
            obj2.A00 = i;
            return obj2;
        }
        c5q2.A00 = i;
        return c5q2;
    }

    public static void A01(C5Q c5q) {
        if (c5q.A02.length == 131072) {
            c5q.A01 = null;
            A02.A02(c5q);
        }
    }

    public DAI(int i) {
        this.A00 = i;
    }
}
