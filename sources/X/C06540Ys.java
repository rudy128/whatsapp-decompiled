package X;

import android.database.Cursor;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0Ys  reason: invalid class name and case insensitive filesystem */
public class C06540Ys implements Runnable {
    public final /* synthetic */ SearchView A00;

    public C06540Ys(SearchView searchView) {
        this.A00 = searchView;
    }

    public void run() {
        C73093Oy r1 = this.A00.A07;
        if (r1 instanceof AnonymousClass0Bl) {
            r1.BEZ((Cursor) null);
        }
    }
}
