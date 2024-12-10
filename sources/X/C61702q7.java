package X;

import android.content.SharedPreferences;
import com.whatsapp.messaging.receiver.PersistedIntStore$startDelayedPersistTaskIfNeeded$1;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2q7  reason: invalid class name and case insensitive filesystem */
public final class C61702q7 {
    public LinkedHashSet A00 = C17880vN.A14();
    public AtomicBoolean A01 = new AtomicBoolean(false);
    public boolean A02;
    public boolean A03;
    public final SharedPreferences A04;
    public final AnonymousClass1OX A05;

    public static final void A00(C61702q7 r4) {
        if (!r4.A03 && r4.A02) {
            AnonymousClass1OX r3 = r4.A05;
            PersistedIntStore$startDelayedPersistTaskIfNeeded$1 persistedIntStore$startDelayedPersistTaskIfNeeded$1 = new PersistedIntStore$startDelayedPersistTaskIfNeeded$1(r4, (C30391dr) null);
            C30451dy.A02(AnonymousClass00R.A00, AnonymousClass1OR.A00, persistedIntStore$startDelayedPersistTaskIfNeeded$1, r3);
            r4.A03 = true;
        }
    }

    public C61702q7(SharedPreferences sharedPreferences, AnonymousClass1OX r4) {
        this.A04 = sharedPreferences;
        this.A05 = r4;
    }
}
