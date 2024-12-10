package X;

import android.os.Message;
import java.io.OutputStream;

/* renamed from: X.9He  reason: invalid class name and case insensitive filesystem */
public class C179259He extends OutputStream {
    public final AnonymousClass181 A00;
    public final OutputStream A01;
    public final Integer A02;
    public final Integer A03;

    public void A00(int i) {
        Integer num = this.A02;
        if (num != null) {
            AnonymousClass181 r3 = this.A00;
            int intValue = num.intValue();
            r3.A02();
            if (i >= 0) {
                Message.obtain(r3.A00, 2, intValue, i).sendToTarget();
                AnonymousClass181.A00(r3);
            }
        }
        AnonymousClass181 r1 = this.A00;
        int intValue2 = this.A03.intValue();
        AnonymousClass180 r5 = r1.A05;
        if (((long) i) >= 0 && r5.A00 != null) {
            AnonymousClass180.A00(r5);
            Message.obtain(r5.A00, 2, intValue2, i).sendToTarget();
            AnonymousClass180.A01(r5);
        }
    }

    public void close() {
        this.A01.close();
    }

    public void flush() {
        this.A01.flush();
    }

    public void write(byte[] bArr, int i, int i2) {
        this.A01.write(bArr, i, i2);
        A00(i2);
    }

    public C179259He(AnonymousClass181 r1, OutputStream outputStream, Integer num, Integer num2) {
        this.A01 = outputStream;
        this.A02 = num;
        this.A00 = r1;
        this.A03 = num2;
    }

    public void write(int i) {
        this.A01.write(i);
        A00(1);
    }

    public void write(byte[] bArr) {
        this.A01.write(bArr);
        A00(bArr.length);
    }
}
