package X;

import android.view.View;
import com.google.android.material.navigationrail.NavigationRailView;

/* renamed from: X.2wY  reason: invalid class name and case insensitive filesystem */
public class C65472wY implements C29151bh {
    public final /* synthetic */ NavigationRailView A00;

    public C65472wY(NavigationRailView navigationRailView) {
        this.A00 = navigationRailView;
    }

    public void BlY(View view, AnonymousClass1HO r6, C29171bj r7) {
        boolean fitsSystemWindows;
        boolean fitsSystemWindows2;
        NavigationRailView navigationRailView = this.A00;
        Boolean bool = navigationRailView.A02;
        if (bool != null) {
            fitsSystemWindows = bool.booleanValue();
        } else {
            fitsSystemWindows = navigationRailView.getFitsSystemWindows();
        }
        if (fitsSystemWindows) {
            r7.A03 += r6.A00.A05(7).A03;
        }
        Boolean bool2 = navigationRailView.A01;
        if (bool2 != null) {
            fitsSystemWindows2 = bool2.booleanValue();
        } else {
            fitsSystemWindows2 = navigationRailView.getFitsSystemWindows();
        }
        if (fitsSystemWindows2) {
            r7.A00 += r6.A00.A05(7).A00;
        }
        boolean A1R = C17890vO.A1R(view.getLayoutDirection());
        int A03 = r6.A03();
        int A04 = r6.A04();
        int i = r7.A02;
        if (A1R) {
            A03 = A04;
        }
        int i2 = i + A03;
        r7.A02 = i2;
        view.setPaddingRelative(i2, r7.A03, r7.A01, r7.A00);
    }
}
