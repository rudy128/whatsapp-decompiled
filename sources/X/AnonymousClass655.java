package X;

import android.graphics.Bitmap;
import java.io.File;

/* renamed from: X.655  reason: invalid class name */
public final class AnonymousClass655 extends AnonymousClass7H2 {
    public final long A00;
    public final C32021gV A01;
    public final String A02;

    public Bitmap CP6(int i) {
        AnonymousClass21V r1 = this.A01;
        if (r1 instanceof C438921i) {
            return this.A01.A0B(r1);
        }
        return null;
    }

    public AnonymousClass655(C438921i r1, C32021gV r2, File file, String str, long j, long j2) {
        super(r1, file, j);
        this.A01 = r2;
        this.A00 = j2;
        this.A02 = str == null ? "application/*" : str;
    }

    public String BUw() {
        return this.A02;
    }

    public int getType() {
        return 4;
    }
}
