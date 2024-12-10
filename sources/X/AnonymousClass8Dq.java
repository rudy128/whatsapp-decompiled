package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: X.8Dq  reason: invalid class name */
public final class AnonymousClass8Dq extends RelativeLayout {
    public AnonymousClass8Dq(Context context) {
        super(context, (AttributeSet) null, 0);
        View.inflate(context, 2131627376, this);
        AnonymousClass3MX.A1A(context, this, AnonymousClass4Z9.A01(context, false));
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168777);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public final void setSearchHint(String str) {
        C18070vi.A0d(str, 0);
        C17880vN.A0E(this, 2131434894).setText(str);
    }
}
