package X;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: X.04O  reason: invalid class name */
public final class AnonymousClass04O extends ContentObserver {
    public final /* synthetic */ C108485bm A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass04O(Handler handler, C108485bm r2) {
        super(handler);
        this.A00 = r2;
    }

    public void onChange(boolean z, Uri uri) {
        this.A00.CQ0(C27621Wu.A00);
    }
}
