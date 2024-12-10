package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3dv  reason: invalid class name and case insensitive filesystem */
public abstract class C75063dv extends TextEmojiLabel implements AnonymousClass5ZF {
    public View getSubtitleView() {
        return this;
    }

    public C75063dv(Context context) {
        super(context);
        C29261bv.A08(this, 2132083158);
        setLineHeight(getResources().getDimensionPixelSize(2131166134));
        setGravity(17);
        setVisibility(8);
    }

    public LinearLayout.LayoutParams getSubtitleViewLayoutParams() {
        LinearLayout.LayoutParams A0R = C72463Mc.A0R();
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131166125);
        A0R.setMargins(dimensionPixelSize, getResources().getDimensionPixelSize(2131166135), dimensionPixelSize, A0R.bottomMargin);
        return A0R;
    }
}
