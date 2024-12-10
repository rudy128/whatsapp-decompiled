package X;

import android.view.KeyEvent;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

public final /* synthetic */ class D57 implements View.OnUnhandledKeyEventListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AppBarLayout.BaseBehavior A01;
    public final /* synthetic */ AppBarLayout A02;

    public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        AppBarLayout.BaseBehavior.A01(keyEvent, this.A00, this.A02);
        return false;
    }

    public /* synthetic */ D57(View view, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.A01 = baseBehavior;
        this.A00 = view;
        this.A02 = appBarLayout;
    }
}
