package com.whatsapp.contact.picker;

import X.AnonymousClass1HF;
import X.AnonymousClass78W;
import X.C108965cb;
import X.C114255qP;
import X.C1422478s;
import X.C1422678u;
import X.C18070vi;
import X.C37891qK;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.wds.components.search.WDSSearchBar;
import com.whatsapp.wds.components.search.WDSSearchView;

public final class ContactPickerBottomSheetActivity extends ContactPicker {
    public ViewGroup A00;
    public boolean A01 = true;
    public final BottomSheetBehavior A02;

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        C108965cb.A19(this.A05, this, 0);
    }

    public void onBackPressed() {
        BottomSheetBehavior bottomSheetBehavior = this.A02;
        if (bottomSheetBehavior.A0J == 3) {
            bottomSheetBehavior.A0W(6);
        } else {
            super.onBackPressed();
        }
    }

    public ContactPickerBottomSheetActivity() {
        BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
        bottomSheetBehavior.A0Z(new C114255qP(bottomSheetBehavior, this, 1));
        bottomSheetBehavior.A0d(true);
        bottomSheetBehavior.A0h = false;
        bottomSheetBehavior.A0c(false);
        bottomSheetBehavior.A0T(0.75f);
        this.A02 = bottomSheetBehavior;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 2130772007);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) C18070vi.A05(this.A00, 2131429443);
        this.A00 = viewGroup;
        if (viewGroup == null) {
            C18070vi.A11("contactPickerLayout");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        C18070vi.A0z(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        ((C37891qK) layoutParams).A00(this.A02);
        C1422478s.A00(findViewById(2131429443), 1);
        C1422678u.A00(findViewById(2131434744), this, 10);
        C108965cb.A19(this.A05, this, 0);
    }

    public void onStart() {
        super.onStart();
        WDSSearchView wDSSearchView = ((WDSSearchBar) AnonymousClass1HF.A06(this.A00, 2131437029)).A08;
        wDSSearchView.A09.setOnFocusChangeListener(new AnonymousClass78W(this, wDSSearchView, 1));
    }
}
