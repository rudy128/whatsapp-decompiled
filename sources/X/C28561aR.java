package X;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1aR  reason: invalid class name and case insensitive filesystem */
public class C28561aR {
    public final C18010vc A00;
    public final C18100vl A01 = new C18110vm(new C28571aS(this));
    public final AnonymousClass11P A02;

    public C28561aR(AnonymousClass11P r3, C18010vc r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        this.A02 = r3;
        this.A00 = r4;
    }

    public final long A00() {
        C18100vl r6 = this.A01;
        if (((SharedPreferences) r6.getValue()).getLong("migration_start_time", 0) == 0) {
            return -1;
        }
        return TimeUnit.MILLISECONDS.toSeconds((SystemClock.elapsedRealtime() - ((SharedPreferences) r6.getValue()).getLong("migration_start_time", 0)) + 999);
    }
}
