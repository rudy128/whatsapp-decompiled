package X;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: X.19N  reason: invalid class name */
public class AnonymousClass19N implements AnonymousClass191 {
    public final AnonymousClass19I A00;
    public final AnonymousClass19M A01;
    public final AnonymousClass19K A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass199 A04;

    public /* synthetic */ void Blg() {
    }

    public static boolean A00(AnonymousClass19N r6, int i) {
        if (TimeUnit.MINUTES.toMillis((long) i) < Math.abs(System.currentTimeMillis() - ((SharedPreferences) ((C19830z4) r6.A04.A00.get()).A00.get()).getLong("qpl_last_upload_ts", -1))) {
            return true;
        }
        return false;
    }

    public void Blf() {
        new AnonymousClass7RB((Object) this, 46).run();
    }

    public AnonymousClass19N(AnonymousClass11P r1, AnonymousClass19I r2, AnonymousClass19M r3, AnonymousClass199 r4, AnonymousClass19K r5) {
        this.A03 = r1;
        this.A04 = r4;
        this.A02 = r5;
        this.A00 = r2;
        this.A01 = r3;
    }

    public void Ba9() {
    }
}
