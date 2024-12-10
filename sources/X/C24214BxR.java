package X;

import java.io.IOException;

/* renamed from: X.BxR  reason: case insensitive filesystem */
public class C24214BxR extends IOException {
    public final int reason;

    public C24214BxR(String str, Throwable th, int i) {
        super(str, th);
        this.reason = i;
    }

    public C24214BxR(int i, Throwable th) {
        super(th);
        this.reason = i;
    }

    public C24214BxR(String str, int i) {
        super(str);
        this.reason = i;
    }

    public C24214BxR() {
        this.reason = 2008;
    }
}
