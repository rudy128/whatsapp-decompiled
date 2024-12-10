package X;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Iterator;

/* renamed from: X.BEn  reason: case insensitive filesystem */
public final class C22588BEn extends ContentObserver {
    public final /* synthetic */ C25684CkF A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22588BEn(C25684CkF ckF) {
        super((Handler) null);
        this.A00 = ckF;
    }

    public final void onChange(boolean z) {
        C25684CkF ckF = this.A00;
        synchronized (ckF.A02) {
            ckF.A06 = null;
            C26123Csl.A05.incrementAndGet();
        }
        synchronized (ckF) {
            Iterator it = ckF.A03.iterator();
            if (it.hasNext()) {
                it.next();
                throw BE7.A0a();
            }
        }
    }
}
