package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3dw  reason: invalid class name and case insensitive filesystem */
public final class C75073dw extends TextEmojiLabel implements AnonymousClass5ZH {
    public C75073dw(Context context, AnonymousClass5ZG r4) {
        super(context, (AttributeSet) null);
        C29261bv.A08(this, 2132083159);
        setLineHeight(getResources().getDimensionPixelSize(2131169431));
        setGravity(17);
        setEllipsize(TextUtils.TruncateAt.END);
        setMaxLines(3);
        C72453Mb.A1L(this, r4.BaY());
    }

    public View getTitleView() {
        return this;
    }

    public LinearLayout.LayoutParams getTitleViewLayoutParams() {
        LinearLayout.LayoutParams A0R = C72463Mc.A0R();
        A0R.gravity = 17;
        A0R.setMargins(0, getResources().getDimensionPixelSize(2131166136), 0, A0R.bottomMargin);
        return A0R;
    }
}
