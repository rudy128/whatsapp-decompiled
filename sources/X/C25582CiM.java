package X;

import android.os.Handler;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CiM  reason: case insensitive filesystem */
public class C25582CiM {
    public final C24793CKm A00;
    public final List A01 = Collections.synchronizedList(AnonymousClass8BR.A14());
    public final int A02;
    public final Handler A03;
    public final Runnable A04 = C27082DTh.A00(this, 41);

    public static void A00(C25582CiM ciM) {
        ciM.A03.postDelayed(ciM.A04, TimeUnit.SECONDS.toMillis((long) ciM.A02));
    }

    public C25582CiM(Handler handler, C24793CKm cKm, int i) {
        this.A00 = cKm;
        this.A03 = handler;
        this.A02 = i;
        A00(this);
    }
}
