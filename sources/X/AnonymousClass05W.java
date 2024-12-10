package X;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.05W  reason: invalid class name */
public class AnonymousClass05W extends FrameLayout implements C16530sa {
    public final CollapsibleActionView A00;

    public void onActionViewCollapsed() {
        this.A00.onActionViewCollapsed();
    }

    public void onActionViewExpanded() {
        this.A00.onActionViewExpanded();
    }

    public AnonymousClass05W(View view) {
        super(view.getContext());
        this.A00 = (CollapsibleActionView) view;
        addView(view);
    }
}
