package X;

import android.view.KeyEvent;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: X.D4s  reason: case insensitive filesystem */
public final /* synthetic */ class C26578D4s implements View.OnKeyListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AppBarLayout.BaseBehavior A01;
    public final /* synthetic */ AppBarLayout A02;

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        AppBarLayout.BaseBehavior.A01(keyEvent, this.A00, this.A02);
        return false;
    }

    public /* synthetic */ C26578D4s(View view, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.A01 = baseBehavior;
        this.A00 = view;
        this.A02 = appBarLayout;
    }
}
