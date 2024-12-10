package com.whatsapp.waffle.wfac.ui;

import X.AnonymousClass11C;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass78N;
import X.AnonymousClass7RE;
import X.C108955ca;
import X.C108975cc;
import X.C108985cd;
import X.C18030ve;
import X.C18070vi;
import X.C36401np;
import X.C39401t1;
import X.C72453Mb;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;

public final class WfacBanInfoFragment extends Hilt_WfacBanInfoFragment {
    public WfacBanViewModel A00;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        A1Z(true);
        return layoutInflater.inflate(2131627615, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        int i;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        WfacBanViewModel wfacBanViewModel = (WfacBanViewModel) AnonymousClass3Ma.A0I(this).A00(WfacBanViewModel.class);
        this.A00 = wfacBanViewModel;
        if (wfacBanViewModel != null) {
            WfacBanViewModel.A04(A1D());
            WfacBanViewModel wfacBanViewModel2 = this.A00;
            if (wfacBanViewModel2 != null) {
                int A0T = wfacBanViewModel2.A0T();
                WfacBanViewModel wfacBanViewModel3 = this.A00;
                if (wfacBanViewModel3 != null) {
                    int i2 = wfacBanViewModel3.A00;
                    AnonymousClass3MX.A1B(A14(), AnonymousClass3Ma.A0C(view, 2131428043), 2131233670);
                    AnonymousClass3Ma.A0E(view, 2131431392).setText(2131898544);
                    TextEmojiLabel A0c = C72453Mb.A0c(view, 2131435859);
                    TextView A0E = AnonymousClass3Ma.A0E(view, 2131435860);
                    A0E.setVisibility(0);
                    A0E.setText(2131898543);
                    int i3 = 2131898545;
                    if (A0T == 1) {
                        i3 = 2131898546;
                    }
                    C36401np r6 = this.A07;
                    if (r6 != null) {
                        Runnable[] runnableArr = {new AnonymousClass7RE(this, i2, A0T, 13)};
                        SpannableString A04 = r6.A04(A0c.getContext(), A1H(i3), runnableArr, new String[]{"terms-of-service-link"}, new String[]{"https://www.whatsapp.com/legal/updates/terms-of-service"});
                        Rect rect = C39401t1.A0A;
                        AnonymousClass11C r0 = this.A01;
                        if (r0 != null) {
                            AnonymousClass3Ma.A1K(A0c, r0);
                            C18030ve r02 = this.A05;
                            if (r02 != null) {
                                AnonymousClass3Ma.A1L(r02, A0c);
                                A0c.setText(A04);
                                TextView A0E2 = AnonymousClass3Ma.A0E(view, 2131427483);
                                if (A0T == 1) {
                                    A0E2.setText(2131898542);
                                    i = 1;
                                } else {
                                    A0E2.setText(2131898541);
                                    i = 2;
                                }
                                A0E2.setOnClickListener(new AnonymousClass78N(this, A0T, i2, i));
                                C108975cc.A0Q(this).A01("show_ban_info_screen", A0T, i2);
                                return;
                            }
                            str = "abProps";
                        } else {
                            str = "systemServices";
                        }
                    } else {
                        str = "linkifier";
                    }
                    C18070vi.A11(str);
                    throw null;
                }
            }
        }
        C18070vi.A11("viewModel");
        throw null;
    }

    public void A22(Menu menu, MenuInflater menuInflater) {
        boolean A15 = C18070vi.A15(menu, menuInflater);
        if (!C108985cd.A0P(this).A0F()) {
            C108955ca.A1G(menu, A15 ? 1 : 0, 104, 2131898550);
        }
        super.A22(menu, menuInflater);
    }

    public boolean A24(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) != 104) {
            return super.A24(menuItem);
        }
        WfacBanViewModel wfacBanViewModel = this.A00;
        if (wfacBanViewModel == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        wfacBanViewModel.A0V(A1D());
        return true;
    }
}
