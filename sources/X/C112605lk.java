package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5lk  reason: invalid class name and case insensitive filesystem */
public class C112605lk extends C40611uz {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass701 A01;
    public final /* synthetic */ C18000vb A02;

    public C112605lk(AnonymousClass701 r1, C18000vb r2, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }

    public void A05(Rect rect, View view, C38021qZ r6, RecyclerView recyclerView) {
        boolean A1b = AnonymousClass3MY.A1b(this.A02);
        int i = this.A00;
        if (A1b) {
            rect.set(0, 0, i, 0);
        } else {
            rect.set(i, 0, 0, 0);
        }
    }
}
