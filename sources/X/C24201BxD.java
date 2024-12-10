package X;

import java.io.IOException;

/* renamed from: X.BxD  reason: case insensitive filesystem */
public final class C24201BxD extends IOException {
    public final C24346Bzh error;

    public C24201BxD(C24346Bzh bzh, String str, Throwable th) {
        super(AnonymousClass001.A1E(bzh, ": ", AnonymousClass000.A11(str)), th);
        this.error = bzh;
    }
}
