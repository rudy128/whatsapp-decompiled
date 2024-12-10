package X;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: X.BEp  reason: case insensitive filesystem */
public final class C22590BEp extends ContentObserver {
    public final /* synthetic */ C26938DJt A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22590BEp(C26938DJt dJt) {
        super((Handler) null);
        this.A00 = dJt;
    }

    public final void onChange(boolean z) {
        this.A00.A03.set(true);
    }
}
