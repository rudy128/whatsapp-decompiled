package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3XU  reason: invalid class name */
public final class AnonymousClass3XU extends C40611uz {
    public final int A00;
    public final /* synthetic */ C78493st A01;

    public AnonymousClass3XU(C78493st r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public void A05(Rect rect, View view, C38021qZ r5, RecyclerView recyclerView) {
        C18070vi.A0n(rect, view, recyclerView);
        Rect A07 = AnonymousClass3MW.A07();
        if (RecyclerView.A00(view) != 0) {
            A07.top = this.A00;
        }
        rect.set(A07);
    }
}
