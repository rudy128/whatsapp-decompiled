package X;

import android.graphics.Bitmap;
import java.io.File;

/* renamed from: X.653  reason: invalid class name */
public final class AnonymousClass653 extends AnonymousClass7H2 {
    public final C32021gV A00;

    public Bitmap CP6(int i) {
        AnonymousClass21V r1 = this.A01;
        if (r1 != null) {
            return this.A00.A0B(r1);
        }
        return null;
    }

    public AnonymousClass653(AnonymousClass21V r1, C32021gV r2, File file, long j) {
        super(r1, file, j);
        this.A00 = r2;
    }

    public String BUw() {
        return "application/zip";
    }

    public int getType() {
        return 6;
    }
}
