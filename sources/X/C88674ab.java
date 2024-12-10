package X;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.4ab  reason: invalid class name and case insensitive filesystem */
public final class C88674ab implements LayoutTransition.TransitionListener {
    public final /* synthetic */ LayoutTransition A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;

    public void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        C18070vi.A0d(view, 2);
        if (view == this.A01) {
            this.A00.removeTransitionListener(this);
            ViewGroup viewGroup2 = this.A02;
            viewGroup2.postDelayed(new C21425Ajs((Object) viewGroup2, 19), 100);
        }
    }

    public void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
    }

    public C88674ab(LayoutTransition layoutTransition, View view, ViewGroup viewGroup) {
        this.A01 = view;
        this.A00 = layoutTransition;
        this.A02 = viewGroup;
    }
}
