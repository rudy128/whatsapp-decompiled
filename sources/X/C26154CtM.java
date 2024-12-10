package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.CtM  reason: case insensitive filesystem */
public final class C26154CtM {
    public final int A00;
    public final C25199Caq A01;
    public final CopyOnWriteArrayList A02;

    public void A05(D48 d48, int i, long j) {
        A0A(new CTB(d48, (Object) null, 1, i, 0, A00(j), -9223372036854775807L));
    }

    public void A06(CJ1 cj1, CTB ctb) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C24844CMn cMn = (C24844CMn) it.next();
            A01(cMn.A00, new C21368Aix(this, cj1, cMn.A01, ctb, 5));
        }
    }

    public void A07(CJ1 cj1, CTB ctb) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C24844CMn cMn = (C24844CMn) it.next();
            A01(cMn.A00, new C21368Aix(this, cj1, cMn.A01, ctb, 4));
        }
    }

    public void A08(CJ1 cj1, CTB ctb, IOException iOException, boolean z) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C24844CMn cMn = (C24844CMn) it.next();
            A01(cMn.A00, new AnonymousClass7QF(this, cMn.A01, cj1, ctb, iOException, 0, z));
        }
    }

    public void A09(CJ1 cj1, CTB ctb, Object obj) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C24844CMn cMn = (C24844CMn) it.next();
            A01(cMn.A00, new C21468AkZ(this, cj1, ctb, cMn.A01, obj));
        }
    }

    public static long A00(long j) {
        UUID uuid = C24736CHy.A04;
        long A05 = Util.A05(j);
        if (A05 != -9223372036854775807L) {
            return 0 + A05;
        }
        return -9223372036854775807L;
    }

    public void A02() {
        C26056CrS.A03(AnonymousClass000.A1W(this.A01));
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C24844CMn cMn = (C24844CMn) it.next();
            A01(cMn.A00, new C21471Akc((Object) this, (Object) cMn.A01, 41));
        }
    }

    public void A03() {
        C26056CrS.A03(AnonymousClass000.A1W(this.A01));
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C24844CMn cMn = (C24844CMn) it.next();
            A01(cMn.A00, new C21471Akc((Object) this, (Object) cMn.A01, 42));
        }
    }

    public void A04() {
        C26056CrS.A03(AnonymousClass000.A1W(this.A01));
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C24844CMn cMn = (C24844CMn) it.next();
            A01(cMn.A00, new C21471Akc((Object) this, (Object) cMn.A01, 43));
        }
    }

    public void A0A(CTB ctb) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C24844CMn cMn = (C24844CMn) it.next();
            A01(cMn.A00, new C27081DTg(ctb, this, cMn.A01, 14));
        }
    }

    public C26154CtM(C25199Caq caq, CopyOnWriteArrayList copyOnWriteArrayList, int i) {
        this.A02 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = caq;
    }

    public static void A01(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public C26154CtM() {
        this((C25199Caq) null, new CopyOnWriteArrayList(), 0);
    }
}
