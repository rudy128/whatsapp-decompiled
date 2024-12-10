package X;

import android.os.Handler;
import android.os.SystemClock;
import java.util.Set;

/* renamed from: X.2pr  reason: invalid class name and case insensitive filesystem */
public class C61542pr {
    public long A00;
    public final Handler A01 = C17890vO.A0D();
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public static final void A00(C61542pr r3, Set set, boolean z) {
        r3.A02.get();
        r3.A00 = SystemClock.elapsedRealtime();
        AnonymousClass2FJ r2 = new AnonymousClass2FJ();
        r2.A01 = C29431cG.A0h(",", set, (C22821Di) null);
        r2.A00 = Boolean.valueOf(z);
        ((AnonymousClass18K) r3.A03.get()).CC4(r2);
    }

    public C61542pr(AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0j(r2, r3);
        this.A03 = r2;
        this.A02 = r3;
    }
}
