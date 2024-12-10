package com.whatsapp.calling.callgrid.view;

import X.AnonymousClass000;
import X.AnonymousClass1DC;
import X.AnonymousClass1HF;
import X.AnonymousClass3MX;
import X.AnonymousClass86E;
import X.C17890vO;
import X.C17960vV;
import X.C18140vp;
import X.C72463Mc;
import X.C89874dA;
import X.C91574fu;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;

public class MenuBottomSheet extends Hilt_MenuBottomSheet implements AnonymousClass86E {
    public int A00 = 0;
    public LinearLayout A01;
    public MenuBottomSheetViewModel A02;
    public AnonymousClass1DC A03;
    public C18140vp A04;

    public int A25() {
        if (C72463Mc.A1Z(this.A04)) {
            return 2132083351;
        }
        return 2132083468;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131624429);
    }

    public void A21(Bundle bundle, View view) {
        super.A21(bundle, view);
        LinearLayout linearLayout = (LinearLayout) view;
        this.A01 = linearLayout;
        View A06 = AnonymousClass1HF.A06(linearLayout, 2131429132);
        if (C72463Mc.A1Z(this.A04)) {
            A06.setVisibility(8);
        } else {
            C89874dA.A00(A06, this, 16);
        }
        MenuBottomSheetViewModel menuBottomSheetViewModel = this.A02;
        if (menuBottomSheetViewModel != null) {
            menuBottomSheetViewModel.A03.A0A(A1G(), new C91574fu(this, 11));
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        MenuBottomSheetViewModel menuBottomSheetViewModel = this.A02;
        if (menuBottomSheetViewModel != null) {
            int i = this.A00;
            if (i == 4 || i == 5 || i == 6) {
                C17960vV.A0F(AnonymousClass000.A1W(menuBottomSheetViewModel.A00), "MenuBottomSheetViewModel/onCallLinkShareOptionSelected/ callLinkData is null");
                menuBottomSheetViewModel.A07.A0F(C17890vO.A0E(menuBottomSheetViewModel.A00, i));
                return;
            }
            menuBottomSheetViewModel.A0T(i);
        }
    }
}
