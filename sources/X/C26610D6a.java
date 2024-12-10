package X;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: X.D6a  reason: case insensitive filesystem */
public class C26610D6a implements E3b {
    public final /* synthetic */ AppBarLayout.BaseBehavior A00;
    public final /* synthetic */ AppBarLayout A01;
    public final /* synthetic */ boolean A02;

    public C26610D6a(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
        this.A00 = baseBehavior;
        this.A01 = appBarLayout;
        this.A02 = z;
    }

    public boolean CBT(View view) {
        this.A01.setExpanded(this.A02);
        return true;
    }
}
