package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.BLw  reason: case insensitive filesystem */
public final class C22711BLw extends C40611uz {
    public final DOZ A00;
    public final DFL A01;

    public C22711BLw(DOZ doz, DFL dfl) {
        this.A01 = dfl;
        this.A00 = doz;
    }

    public void A05(Rect rect, View view, C38021qZ r6, RecyclerView recyclerView) {
        List unmodifiableList;
        Rect rect2;
        C18070vi.A0n(rect, view, recyclerView);
        int A002 = RecyclerView.A00(view);
        List list = ((C25743ClD) BE9.A0l(this.A00, this.A01)).A08;
        if (list != null && (unmodifiableList = Collections.unmodifiableList(list)) != null && (rect2 = (Rect) C29431cG.A0f(unmodifiableList, A002)) != null) {
            rect.set(rect2);
        }
    }
}
