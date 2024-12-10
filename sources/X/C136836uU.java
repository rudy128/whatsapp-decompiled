package X;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.6uU  reason: invalid class name and case insensitive filesystem */
public class C136836uU {
    public int A00 = -1;
    public View A01;
    public C110595gJ A02;
    public TabLayout A03;
    public CharSequence A04;
    public CharSequence A05;
    public Object A06;

    public void A00() {
        TabLayout tabLayout = this.A03;
        if (tabLayout != null) {
            tabLayout.A0G(this);
            return;
        }
        throw AnonymousClass000.A0k("Tab not attached to a TabLayout");
    }

    public void A01(int i) {
        TabLayout tabLayout = this.A03;
        if (tabLayout != null) {
            A02(tabLayout.getResources().getText(i));
            return;
        }
        throw AnonymousClass000.A0k("Tab not attached to a TabLayout");
    }

    public void A02(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.A04) && !TextUtils.isEmpty(charSequence)) {
            this.A02.setContentDescription(charSequence);
        }
        this.A05 = charSequence;
        C110595gJ r0 = this.A02;
        if (r0 != null) {
            r0.A04();
        }
    }

    public boolean A03() {
        TabLayout tabLayout = this.A03;
        if (tabLayout != null) {
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            if (selectedTabPosition == -1 || selectedTabPosition != this.A00) {
                return false;
            }
            return true;
        }
        throw AnonymousClass000.A0k("Tab not attached to a TabLayout");
    }
}
