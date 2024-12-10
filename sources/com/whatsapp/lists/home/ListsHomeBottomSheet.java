package com.whatsapp.lists.home;

import X.AnonymousClass1DF;
import X.AnonymousClass1DS;
import X.AnonymousClass5QH;
import X.C139436yq;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C34001jj;
import X.C72453Mb;
import X.C72463Mc;
import X.C72483Me;
import X.C89954dI;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.lists.home.ui.main.ListsHomeFragment;

public final class ListsHomeBottomSheet extends Hilt_ListsHomeBottomSheet {
    public C18600wl A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(AnonymousClass5QH.A00);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625869, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        boolean z = A15().getBoolean("is_reorder_bottom_sheet");
        TextView A0E = C17880vN.A0E(view, 2131428372);
        int i = 2131889629;
        if (z) {
            i = 2131895156;
        }
        A0E.setText(A1H(i));
        C89954dI.A00(view.findViewById(2131428348), this, 48);
        C89954dI.A00(view.findViewById(2131428346), this, 49);
        if (bundle == null) {
            C34001jj A0Y = C72453Mb.A0Y(this);
            A0Y.A0G = true;
            int i2 = A15().getInt("arg_entry_point", -1);
            Integer valueOf = Integer.valueOf(i2);
            if (i2 == -1) {
                valueOf = null;
            }
            ListsHomeFragment listsHomeFragment = new ListsHomeFragment();
            Bundle A0D = C17880vN.A0D();
            A0D.putBoolean("is_edit", true);
            A0D.putBoolean("is_reorder_bottom_sheet", z);
            if (valueOf != null) {
                A0D.putInt("arg_entry_point", valueOf.intValue());
            }
            listsHomeFragment.A1R(A0D);
            A0Y.A09(listsHomeFragment, 2131430999);
            A0Y.A01();
        }
    }

    public void A1r() {
        super.A1r();
        C72463Mc.A1B((AnonymousClass1DS) this.A01.getValue());
    }

    public void A2I(C139436yq r1) {
        C72483Me.A13(r1);
    }
}
