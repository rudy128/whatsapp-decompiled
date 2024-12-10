package X;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.2uC  reason: invalid class name and case insensitive filesystem */
public class C64082uC implements LayoutTransition.TransitionListener {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C23251Fh A01;

    public void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
    }

    public C64082uC(ViewGroup viewGroup, C23251Fh r2) {
        this.A01 = r2;
        this.A00 = viewGroup;
    }

    public void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        this.A00.setLayoutTransition((LayoutTransition) null);
    }
}
