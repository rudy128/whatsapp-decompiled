package X;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* renamed from: X.3Mt  reason: invalid class name and case insensitive filesystem */
public class C72593Mt extends ContentObserver {
    public final /* synthetic */ AnonymousClass408 A00;

    public boolean deliverSelfNotifications() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72593Mt(Handler handler, AnonymousClass408 r2) {
        super(handler);
        this.A00 = r2;
    }

    public void onChange(boolean z) {
        int count;
        C17900vP.A0n("DocumentsAdapter/onChange ", AnonymousClass000.A10(), z);
        AnonymousClass408 r1 = this.A00;
        Cursor cursor = r1.A00;
        if (cursor == null) {
            count = 0;
        } else {
            count = cursor.getCount();
        }
        r1.A00 = count;
        r1.A02.A0A.notifyDataSetChanged();
    }
}
