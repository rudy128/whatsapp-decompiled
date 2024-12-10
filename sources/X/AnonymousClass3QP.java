package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3QP  reason: invalid class name */
public final class AnonymousClass3QP extends LinearLayout implements AnonymousClass5ZC {
    public final Context A00;
    public final C32191gn A01;
    public final C436420i A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3QP(Context context, C32191gn r6, C436420i r7) {
        super(context, (AttributeSet) null);
        C18070vi.A0d(r6, 1);
        this.A01 = r6;
        this.A00 = context;
        this.A02 = r7;
        setGravity(17);
        setOrientation(1);
        List bulletMessages = getBulletMessages();
        if (bulletMessages != null) {
            Iterator it = bulletMessages.iterator();
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                View A09 = AnonymousClass3MX.A09(LayoutInflater.from(this.A00), this, 2131624805);
                C72453Mb.A1L(C72453Mb.A0c(A09, 2131432664), A0v);
                addView(A09);
            }
        }
    }

    private final List getBulletMessages() {
        String A0S = this.A01.A0S(this.A02, true);
        if (A0S == null) {
            return null;
        }
        return AnonymousClass1YF.A0S(A0S, new String[]{"\n"}, 0);
    }

    public View getBodyView() {
        return this;
    }

    public LinearLayout.LayoutParams getBodyViewLayoutParams() {
        LinearLayout.LayoutParams A0R = C72463Mc.A0R();
        A0R.gravity = 3;
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131166129);
        A0R.setMargins(dimensionPixelSize, getResources().getDimensionPixelSize(2131166130), dimensionPixelSize, A0R.bottomMargin);
        return A0R;
    }
}
