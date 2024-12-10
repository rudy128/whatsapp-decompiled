package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: X.BIv  reason: case insensitive filesystem */
public final class C22661BIv extends PopupWindow {
    public int A00;
    public View A01;
    public C18090vk A02;
    public C18090vk A03;
    public C18090vk A04;
    public final View.OnLayoutChangeListener A05 = new C26581D4v(this, 0);

    public C22661BIv(Context context) {
        super(context);
        setContentView(new BV3(context));
        setInputMethodMode(2);
        setBackgroundDrawable(new ColorDrawable(0));
        setAnimationStyle(0);
        setFocusable(true);
        setOutsideTouchable(true);
    }

    public final void A01(View view, int i, int i2) {
        if (!isShowing()) {
            this.A01 = view;
            this.A00 = view.getResources().getConfiguration().orientation;
            View view2 = this.A01;
            if (view2 != null) {
                View rootView = view2.getRootView();
                View.OnLayoutChangeListener onLayoutChangeListener = this.A05;
                rootView.removeOnLayoutChangeListener(onLayoutChangeListener);
                view2.getRootView().addOnLayoutChangeListener(onLayoutChangeListener);
                super.showAtLocation(view, 0, i, i2);
                return;
            }
            throw C17890vO.A0K();
        }
    }

    public void showAsDropDown(View view) {
    }

    public void showAsDropDown(View view, int i, int i2) {
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
    }

    public void showAtLocation(View view, int i, int i2, int i3) {
    }

    public final void A00() {
        if (isShowing()) {
            super.dismiss();
            View view = this.A01;
            if (view != null) {
                view.getRootView().removeOnLayoutChangeListener(this.A05);
                this.A01 = null;
                this.A00 = 0;
                View contentView = getContentView();
                C18070vi.A0z(contentView, "null cannot be cast to non-null type com.facebook.rendercore.RenderTreeHostView");
                ((C01920By) contentView).setRenderTree((C04240Mk) null);
                this.A04 = null;
                this.A02 = null;
                this.A03 = null;
                return;
            }
            throw C17890vO.A0K();
        }
    }

    public void dismiss() {
        C18090vk r0;
        if (getContentView().getKeyDispatcherState().isTracking(new KeyEvent(0, 4))) {
            r0 = this.A02;
        } else {
            r0 = this.A04;
        }
        if (r0 != null) {
            r0.invoke();
        }
    }
}
