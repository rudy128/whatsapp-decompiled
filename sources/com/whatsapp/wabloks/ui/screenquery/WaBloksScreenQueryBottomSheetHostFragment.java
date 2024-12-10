package com.whatsapp.wabloks.ui.screenquery;

import X.AHz;
import X.AI2;
import X.AnonymousClass000;
import X.AnonymousClass1GP;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass4Z9;
import X.AnonymousClass785;
import X.AnonymousClass8BU;
import X.C133986pp;
import X.C179979Kq;
import X.C18000vb;
import X.C18070vi;
import X.C20161A9x;
import X.C20318AGa;
import X.C22403B6g;
import X.C25913CoX;
import X.C29431cG;
import X.C34001jj;
import X.C72453Mb;
import X.C72463Mc;
import X.C74743cP;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.whatsapp.wds.components.topbar.WDSToolbar;
import java.util.List;

public final class WaBloksScreenQueryBottomSheetHostFragment extends Hilt_WaBloksScreenQueryBottomSheetHostFragment {
    public C18000vb A00;
    public C133986pp A01;
    public WDSToolbar A02;
    public AHz A03;
    public AI2 A04;
    public boolean A05;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        if (this.A05) {
            return new View(A14());
        }
        View A0B = AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131624281, false);
        this.A02 = (WDSToolbar) A0B.findViewById(2131428143);
        return A0B;
    }

    public void A21(Bundle bundle, View view) {
        Context context;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        if (!this.A05) {
            WDSToolbar wDSToolbar = this.A02;
            if (wDSToolbar != null) {
                C18000vb r2 = this.A00;
                if (r2 != null) {
                    C74743cP A002 = AnonymousClass3NL.A00(A14(), r2, 2131231675);
                    A002.setColorFilter(AnonymousClass3Ma.A01(A14(), AnonymousClass3MZ.A09(this), 2130971791, 2131102909), PorterDuff.Mode.SRC_ATOP);
                    wDSToolbar.setNavigationIcon((Drawable) A002);
                } else {
                    AnonymousClass3MW.A1M();
                    throw null;
                }
            }
            WDSToolbar wDSToolbar2 = this.A02;
            if (wDSToolbar2 != null) {
                wDSToolbar2.setTitleTextColor(AnonymousClass3MZ.A02(A14(), A14(), 2130971068, 2131102412));
            }
            WDSToolbar wDSToolbar3 = this.A02;
            if (wDSToolbar3 != null) {
                AnonymousClass3MX.A1A(A14(), wDSToolbar3, AnonymousClass4Z9.A01(A14(), false));
            }
            WDSToolbar wDSToolbar4 = this.A02;
            if (wDSToolbar4 != null) {
                Resources A09 = AnonymousClass3MZ.A09(this);
                WDSToolbar wDSToolbar5 = this.A02;
                if (wDSToolbar5 != null) {
                    context = wDSToolbar5.getContext();
                } else {
                    context = null;
                }
                C72463Mc.A0x(context, A09, wDSToolbar4, 2130971792, 2131102910);
            }
            WDSToolbar wDSToolbar6 = this.A02;
            if (wDSToolbar6 != null) {
                wDSToolbar6.setNavigationOnClickListener(new AnonymousClass785(this, 7));
            }
            if (A1E().A0K() == 0) {
                Bundle A15 = A15();
                Fragment fragment = new Fragment();
                fragment.A1R(A15);
                C34001jj A0Y = C72453Mb.A0Y(this);
                A0Y.A0C(fragment, "bloks_fragment", 2131428238);
                AnonymousClass8BU.A19(A0Y, "bloks_fragment");
            }
        }
    }

    public void A1z(Bundle bundle) {
        Bundle bundle2;
        if (bundle == null) {
            bundle2 = A15();
        } else {
            bundle2 = bundle;
        }
        try {
            AHz A002 = AHz.A0A.A00(bundle2);
            this.A03 = A002;
            C22403B6g b6g = A002.A01;
            C18070vi.A0z(b6g, "null cannot be cast to non-null type com.whatsapp.wabloks.screenquery.bottomsheetcontainerconfig.WaBloksBottomSheetContainerConfig");
            this.A04 = (AI2) b6g;
            if (bundle == null || A1E().A0K() != 0) {
                super.A1z(bundle);
                AnonymousClass1GP A1E = A1E();
                A1E.A0E.add(new C20318AGa(this));
                return;
            }
            this.A05 = true;
            A28();
        } catch (C179979Kq e) {
            C25913CoX.A02("WaBloksScreenQueryFragment", e);
            this.A05 = true;
        }
    }

    public Dialog A27(Bundle bundle) {
        Dialog A27 = super.A27(bundle);
        A27.setOnKeyListener(new C20161A9x(this, 2));
        return A27;
    }

    public int A2F() {
        return 2131624281;
    }

    public final WaBloksScreenQueryBottomSheetFragment A2K() {
        AnonymousClass1GP A1E = A1E();
        C18070vi.A0X(A1E);
        List A042 = A1E.A0U.A04();
        C18070vi.A0X(A042);
        if (!AnonymousClass000.A1a(A042)) {
            return null;
        }
        Object A0d = C29431cG.A0d(A042);
        if (A0d instanceof WaBloksScreenQueryBottomSheetFragment) {
            return (WaBloksScreenQueryBottomSheetFragment) A0d;
        }
        return null;
    }
}
