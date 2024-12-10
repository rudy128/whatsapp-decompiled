package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.10M  reason: invalid class name */
public final class AnonymousClass10M {
    public final AnonymousClass10N A00 = new AnonymousClass10N();
    public final List A01 = new ArrayList(2);
    public volatile AnonymousClass190 A02;

    public void A00(AnonymousClass10P r6) {
        AnonymousClass10R r4 = AnonymousClass10R.A00;
        synchronized (this) {
            AnonymousClass10N r2 = this.A00;
            synchronized (r2) {
                HashMap hashMap = r2.A00;
                AnonymousClass10S r0 = (AnonymousClass10S) hashMap.get(r6);
                if (r0 == null) {
                    hashMap.put(r6, new AnonymousClass10S(r4));
                } else {
                    r0.A00 = r4;
                }
            }
        }
    }
}
