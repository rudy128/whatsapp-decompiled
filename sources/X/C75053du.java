package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.3du  reason: invalid class name and case insensitive filesystem */
public final class C75053du extends TextEmojiLabel implements AnonymousClass5ZC {
    public final C32191gn A00;
    public final C436420i A01;
    public final Context A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75053du(Context context, C32191gn r6, C436420i r7) {
        super(context, (AttributeSet) null);
        C18070vi.A0d(r6, 1);
        this.A00 = r6;
        this.A02 = context;
        this.A01 = r7;
        C29261bv.A08(this, 2132083154);
        setGravity(17);
        A0S(this.A00.A0S(this.A01, true), (List) null, 0, false);
    }

    public View getBodyView() {
        return this;
    }

    public LinearLayout.LayoutParams getBodyViewLayoutParams() {
        LinearLayout.LayoutParams A0R = C72463Mc.A0R();
        A0R.gravity = 3;
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131166125);
        A0R.setMargins(dimensionPixelSize, getResources().getDimensionPixelSize(2131166126), dimensionPixelSize, A0R.bottomMargin);
        return A0R;
    }
}
