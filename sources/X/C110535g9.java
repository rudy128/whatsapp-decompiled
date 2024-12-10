package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: X.5g9  reason: invalid class name and case insensitive filesystem */
public abstract class C110535g9 extends LinearLayout {
    public final TextView A00 = AnonymousClass3Ma.A0E(this, 2131436208);

    public C110535g9(Context context) {
        super(context);
        View.inflate(context, 2131626856, this);
        AnonymousClass3Ma.A18(this, -1, -2);
        setBackgroundResource(2131232942);
        setGravity(16);
        setMinimumHeight(context.getResources().getDimensionPixelOffset(2131168583));
    }

    public final TextView getTitle() {
        return this.A00;
    }
}
