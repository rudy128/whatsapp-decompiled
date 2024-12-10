package X;

import java.io.IOException;

/* renamed from: X.BxS  reason: case insensitive filesystem */
public class C24215BxS extends IOException {
    public boolean contentIsMalformed;
    public int dataType;

    public C24215BxS(String str, Throwable th, boolean z) {
        super(str, th);
        this.contentIsMalformed = z;
        this.dataType = 1;
    }

    public static C24215BxS A00(String str) {
        return new C24215BxS(str);
    }

    @Deprecated
    public C24215BxS(String str) {
        super(str);
    }

    @Deprecated
    public C24215BxS(String str, Throwable th) {
        super(str, th);
    }

    @Deprecated
    public C24215BxS(Throwable th) {
        super(th);
    }

    @Deprecated
    public C24215BxS() {
    }
}
