package X;

import android.os.Message;
import com.whatsapp.util.Log;
import java.io.InputStream;

/* renamed from: X.9Hb  reason: invalid class name and case insensitive filesystem */
public class C179229Hb extends InputStream {
    public final AnonymousClass181 A00;
    public final InputStream A01;
    public final Integer A02;
    public final Integer A03;

    public synchronized void reset() {
        Log.w("reset called in MessageInputStream");
    }

    public void A00(int i) {
        Integer num = this.A02;
        if (num != null) {
            AnonymousClass181 r3 = this.A00;
            int intValue = num.intValue();
            r3.A02();
            Message.obtain(r3.A00, 3, intValue, i).sendToTarget();
            AnonymousClass181.A00(r3);
        }
        AnonymousClass181 r1 = this.A00;
        int intValue2 = this.A03.intValue();
        AnonymousClass180 r5 = r1.A05;
        if (((long) i) >= 0 && r5.A00 != null) {
            AnonymousClass180.A00(r5);
            Message.obtain(r5.A00, 3, intValue2, i).sendToTarget();
            AnonymousClass180.A01(r5);
        }
    }

    public void A01(long j) {
        Integer num = this.A02;
        if (num != null) {
            this.A00.A05(j, num.intValue());
        }
        this.A00.A06(j, this.A03.intValue());
    }

    public int available() {
        return this.A01.available();
    }

    public void close() {
        this.A01.close();
    }

    public void mark(int i) {
        Log.w("mark called in MessageInputStream");
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.A01.read(bArr, i, i2);
        if (read > 0) {
            A00(read);
        }
        return read;
    }

    public long skip(long j) {
        long skip = this.A01.skip(j);
        A01(skip);
        return skip;
    }

    public C179229Hb(AnonymousClass181 r1, InputStream inputStream, Integer num, Integer num2) {
        this.A01 = inputStream;
        this.A02 = num;
        this.A00 = r1;
        this.A03 = num2;
    }

    public int read(byte[] bArr) {
        int read = this.A01.read(bArr);
        if (read > 0) {
            A00(read);
        }
        return read;
    }

    public int read() {
        int read = this.A01.read();
        if (read != -1) {
            A00(1);
        }
        return read;
    }
}
