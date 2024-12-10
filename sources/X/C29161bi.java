package X;

import android.view.View;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/* renamed from: X.1bi  reason: invalid class name and case insensitive filesystem */
public class C29161bi implements C29151bh {
    public final /* synthetic */ BottomNavigationView A00;

    public C29161bi(BottomNavigationView bottomNavigationView) {
        this.A00 = bottomNavigationView;
    }

    public void BlY(View view, AnonymousClass1HO r8, C29171bj r9) {
        r9.A00 += r8.A02();
        boolean z = true;
        if (view.getLayoutDirection() != 1) {
            z = false;
        }
        int A03 = r8.A03();
        int A04 = r8.A04();
        int i = r9.A02;
        int i2 = A03;
        if (z) {
            i2 = A04;
        }
        int i3 = i + i2;
        r9.A02 = i3;
        int i4 = r9.A01;
        if (!z) {
            A03 = A04;
        }
        int i5 = i4 + A03;
        r9.A01 = i5;
        view.setPaddingRelative(i3, r9.A03, i5, r9.A00);
    }
}
