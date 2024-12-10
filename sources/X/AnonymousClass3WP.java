package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;

/* renamed from: X.3WP  reason: invalid class name */
public abstract class AnonymousClass3WP extends C38391rD {
    public static final CardView A00(View view, ViewGroup viewGroup) {
        View inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(2131624718, viewGroup, false);
        C18070vi.A0z(inflate, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        CardView cardView = (CardView) inflate;
        cardView.addView(view);
        return cardView;
    }
}
