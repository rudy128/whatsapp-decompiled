package X;

import android.os.Build;

/* renamed from: X.8Jt  reason: invalid class name and case insensitive filesystem */
public final class C162228Jt extends C196269uj {
    public /* bridge */ /* synthetic */ C185319cO A01() {
        if (!this.A02 || Build.VERSION.SDK_INT < 23 || !this.A00.A0B.A04()) {
            return new C185319cO(this.A00, this.A03, this.A01);
        }
        throw AnonymousClass000.A0k("Cannot set backoff criteria on an idle mode job");
    }
}
