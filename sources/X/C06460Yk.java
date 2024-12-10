package X;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: X.0Yk  reason: invalid class name and case insensitive filesystem */
public class C06460Yk implements Runnable {
    public final /* synthetic */ ActionBarOverlayLayout A00;

    public C06460Yk(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.A00 = actionBarOverlayLayout;
    }

    public void run() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.A00;
        actionBarOverlayLayout.A01();
        actionBarOverlayLayout.A00 = actionBarOverlayLayout.A02.animate().translationY((float) (-actionBarOverlayLayout.A02.getHeight())).setListener(actionBarOverlayLayout.A0K);
    }
}
