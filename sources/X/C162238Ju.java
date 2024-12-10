package X;

import android.os.Build;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8Ju  reason: invalid class name and case insensitive filesystem */
public final class C162238Ju extends C196269uj {
    public /* bridge */ /* synthetic */ C185319cO A01() {
        if (!this.A02 || Build.VERSION.SDK_INT < 23 || !this.A00.A0B.A04()) {
            A2t a2t = this.A00;
            if (!a2t.A0J) {
                return new C185319cO(a2t, this.A03, this.A01);
            }
            throw AnonymousClass000.A0k("PeriodicWorkRequests cannot be expedited");
        }
        throw AnonymousClass000.A0k("Cannot set backoff criteria on an idle mode job");
    }

    public C162238Ju(Class cls, TimeUnit timeUnit, long j) {
        super(cls);
        A2t a2t = this.A00;
        long millis = timeUnit.toMillis(j);
        if (millis < 900000) {
            A5Z.A00().A06(A2t.A0O, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        millis = millis < 900000 ? 900000 : millis;
        a2t.A01(millis, millis);
    }
}
