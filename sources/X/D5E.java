package X;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

public class D5E implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public final WeakReference A00;
    public final WeakReference A01;

    public void A00() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            C108945cZ.A0O(weakReference).removeOnAttachStateChangeListener(this);
            View A0O = C108945cZ.A0O(weakReference);
            if (A0O != null) {
                AnonymousClass3MY.A1D(A0O, this);
            }
        }
        weakReference.clear();
        this.A01.clear();
    }

    public void onGlobalLayout() {
        WeakReference weakReference = this.A01;
        if (weakReference.get() == null) {
            A00();
            return;
        }
        weakReference.get();
        Handler handler = C26155CtN.A0M;
    }

    public void onViewAttachedToWindow(View view) {
        if (this.A01.get() == null) {
            A00();
        } else if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    public void onViewDetachedFromWindow(View view) {
        if (this.A01.get() == null) {
            A00();
        } else if (view != null) {
            AnonymousClass3MY.A1D(view, this);
        }
    }

    public D5E(View view, C26155CtN ctN) {
        this.A01 = AnonymousClass3MW.A0z(ctN);
        this.A00 = AnonymousClass3MW.A0z(view);
    }
}
