package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.28L  reason: invalid class name */
public class AnonymousClass28L extends C40611uz {
    public final int A00;
    public final Object A01;

    public AnonymousClass28L(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A05(Rect rect, View view, C38021qZ r7, RecyclerView recyclerView) {
        if (this.A00 != 0) {
            rect.set(0, 0, 0, ((Context) this.A01).getResources().getDimensionPixelSize(2131168008));
            return;
        }
        view.getLayoutParams();
        rect.set(0, 0, 0, 0);
        if (RecyclerView.A00(view) != 0) {
            ConversationsFragment conversationsFragment = (ConversationsFragment) this.A01;
            boolean z = !C18000vb.A00(conversationsFragment.A1t).A06;
            int applyDimension = (int) TypedValue.applyDimension(1, 6.0f, conversationsFragment.A14().getResources().getDisplayMetrics());
            if (z) {
                rect.left = applyDimension;
            } else {
                rect.right = applyDimension;
            }
        }
    }
}
