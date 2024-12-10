package X;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Iterator;

/* renamed from: X.BEo  reason: case insensitive filesystem */
public final class C22589BEo extends ContentObserver {
    public final /* synthetic */ C25987Cq1 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22589BEo(C25987Cq1 cq1) {
        super((Handler) null);
        this.A00 = cq1;
    }

    public final void onChange(boolean z) {
        C25987Cq1 cq1 = this.A00;
        synchronized (cq1.A03) {
            cq1.A06 = null;
        }
        synchronized (cq1.A04) {
            Iterator it = cq1.A05.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass000.A0s("zzk");
            }
        }
    }
}
