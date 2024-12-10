package com.whatsapp.lists;

import X.AnonymousClass00H;
import X.AnonymousClass1KB;
import X.AnonymousClass3MX;
import X.AnonymousClass4H1;
import X.AnonymousClass4KB;
import X.C139436yq;
import X.C17880vN;
import X.C18070vi;
import X.C18600wl;
import X.C24141Ja;
import X.C34001jj;
import X.C41761x1;
import X.C72043Kk;
import X.C72453Mb;
import X.C72483Me;
import X.C89954dI;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public final class ListsManagerBottomSheetFragment extends Hilt_ListsManagerBottomSheetFragment {
    public AnonymousClass4KB A00;
    public AnonymousClass1KB A01;
    public C72043Kk A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public C18600wl A08;
    public C41761x1 A09;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Window window;
        C18070vi.A0d(layoutInflater, 0);
        Dialog dialog = this.A03;
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setSoftInputMode(16);
        }
        return layoutInflater.inflate(2131625867, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        ListsManagerFragment A002;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        View findViewById = view.findViewById(2131428348);
        int i = A15().getInt("arg_entry_point", -1);
        Integer valueOf = Integer.valueOf(i);
        if (i == -1) {
            valueOf = null;
        }
        C41761x1 r8 = this.A09;
        if (r8 != null) {
            A002 = new ListsManagerFragment();
            Bundle A0D = C17880vN.A0D();
            A0D.putParcelable("labelInfo", r8);
            A0D.putBoolean("is_edit", true);
            if (valueOf != null) {
                A0D.putInt("arg_entry_point", valueOf.intValue());
            }
            A002.A1R(A0D);
            if (r8.A02 == 4) {
                C17880vN.A0E(view, 2131428372).setText(AnonymousClass3MX.A16(this, r8.A06, new Object[1], 0, 2131890369));
            }
            C89954dI.A00(findViewById, this, 46);
        } else {
            A002 = AnonymousClass4H1.A00(valueOf, false);
            C17880vN.A0E(view, 2131428372).setText(A1H(2131892484));
            C18070vi.A0b(findViewById);
            findViewById.setVisibility(8);
        }
        C34001jj A0Y = C72453Mb.A0Y(this);
        A0Y.A09(A002, 2131430999);
        A0Y.A0H((String) null);
        A0Y.A01();
        C89954dI.A00(view.findViewById(2131428346), this, 47);
    }

    public void A1z(Bundle bundle) {
        C41761x1 r0;
        super.A1z(bundle);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            r0 = (C41761x1) C24141Ja.A00(bundle2, C41761x1.class, "labelInfo");
        } else {
            r0 = null;
        }
        this.A09 = r0;
    }

    public void A2I(C139436yq r1) {
        C72483Me.A13(r1);
    }
}
