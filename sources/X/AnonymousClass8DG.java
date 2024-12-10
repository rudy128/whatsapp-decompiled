package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;

/* renamed from: X.8DG  reason: invalid class name */
public final class AnonymousClass8DG extends FrameLayout {
    public View.OnClickListener A00;
    public final View A01;
    public final View A02;

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        C18070vi.A0d(keyEvent, 1);
        if (i != 4 || keyEvent.getAction() != 1) {
            return super.onKeyUp(i, keyEvent);
        }
        A00();
        return true;
    }

    public final void A00() {
        this.A01.animate().alpha(0.0f).setDuration(250).start();
        View view = this.A02;
        AnonymousClass8BS.A0y(new C161018Ba(this, 0), view.animate().translationY((float) view.getHeight()).setInterpolator(new AccelerateInterpolator()).setDuration(250));
        View.OnClickListener onClickListener = this.A00;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8DG(Context context, View view, int i) {
        super(context);
        C18070vi.A0j(context, view);
        this.A02 = view;
        View view2 = new View(context);
        view2.setBackground(new ColorDrawable(i));
        AnonymousClass3MZ.A1N(view2, this, 8);
        view2.setAlpha(0.0f);
        this.A01 = view2;
        addView(view2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        addView(view, layoutParams);
    }

    public final void setOnHideListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }
}
