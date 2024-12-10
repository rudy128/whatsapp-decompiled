package X;

import android.webkit.JavascriptInterface;

/* renamed from: X.6ld  reason: invalid class name and case insensitive filesystem */
public class C131766ld {
    public final /* synthetic */ C122086Ms A00;

    public C131766ld(C122086Ms r1) {
        this.A00 = r1;
    }

    @JavascriptInterface
    public void postPlayerEvent(int i, int i2) {
        if (i2 >= 0 && i2 < 2147483) {
            this.A00.A0E.A0J(new AnonymousClass7RE(this, i2, i, 11));
        }
    }
}
