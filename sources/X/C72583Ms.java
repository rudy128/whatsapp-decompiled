package X;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* renamed from: X.3Ms  reason: invalid class name and case insensitive filesystem */
public class C72583Ms extends ContentObserver {
    public final /* synthetic */ C73093Oy A00;

    public boolean deliverSelfNotifications() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72583Ms(C73093Oy r2) {
        super(new Handler());
        this.A00 = r2;
    }

    public void onChange(boolean z) {
        Cursor cursor;
        C73093Oy r1 = this.A00;
        if (r1.A05 && (cursor = r1.A02) != null && !cursor.isClosed()) {
            r1.A06 = r1.A02.requery();
        }
    }
}
