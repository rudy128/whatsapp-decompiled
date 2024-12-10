package X;

import android.os.IBinder;
import java.util.List;

/* renamed from: X.Cyk  reason: case insensitive filesystem */
public final /* synthetic */ class C26384Cyk implements IBinder.DeathRecipient {
    public final /* synthetic */ C26028Cqm A00;

    public /* synthetic */ C26384Cyk(C26028Cqm cqm) {
        this.A00 = cqm;
    }

    public final void binderDied() {
        C26028Cqm cqm = this.A00;
        C25764Cla cla = cqm.A06;
        cla.A02("reportBinderDeath", new Object[0]);
        cqm.A0A.get();
        String str = cqm.A09;
        cla.A02("%s : Binder has died.", BE7.A1b(str));
        List<C27079DTe> list = cqm.A0B;
        for (C27079DTe a : list) {
            a.a(BEA.A0N(str));
        }
        list.clear();
        synchronized (cqm.A08) {
            C26028Cqm.A00(cqm);
        }
    }
}
