package com.whatsapp;

import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass86E;
import X.C177649Aa;
import X.C80613xU;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public class WAChatIntroBottomSheet extends WDSBottomSheetDialogFragment implements AnonymousClass86E {
    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A09 = AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131627519);
        C177649Aa r1 = new C177649Aa(this, 2);
        AnonymousClass1HF.A06(A09, 2131429138).setOnClickListener(r1);
        AnonymousClass1HF.A06(A09, 2131429535).setOnClickListener(r1);
        AnonymousClass3MW.A0J(A09, 2131431358).setText(C80613xU.A04(A1n(), 2131898336));
        AnonymousClass3MW.A0J(A09, 2131428272).setText(C80613xU.A04(A1n(), 2131898334));
        return A09;
    }

    public int A25() {
        return 2132084365;
    }
}
