package com.whatsapp.waffle.wfac.ui;

import X.AnonymousClass11C;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass78N;
import X.AnonymousClass7RE;
import X.C108975cc;
import X.C18030ve;
import X.C18070vi;
import X.C36401np;
import X.C39401t1;
import X.C72453Mb;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;

public final class WfacBanDecisionFragment extends Hilt_WfacBanDecisionFragment {
    public WfacBanViewModel A00;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        A1Z(false);
        return layoutInflater.inflate(2131627615, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        WfacBanViewModel wfacBanViewModel = (WfacBanViewModel) AnonymousClass3Ma.A0I(this).A00(WfacBanViewModel.class);
        C18070vi.A0d(wfacBanViewModel, 0);
        this.A00 = wfacBanViewModel;
        WfacBanViewModel.A04(A1D());
        WfacBanViewModel wfacBanViewModel2 = this.A00;
        if (wfacBanViewModel2 != null) {
            int A0T = wfacBanViewModel2.A0T();
            WfacBanViewModel wfacBanViewModel3 = this.A00;
            if (wfacBanViewModel3 != null) {
                int i = wfacBanViewModel3.A00;
                AnonymousClass3MX.A1B(A14(), AnonymousClass3Ma.A0C(view, 2131428043), 2131233670);
                AnonymousClass3Ma.A0E(view, 2131431392).setText(2131898538);
                TextEmojiLabel A0c = C72453Mb.A0c(view, 2131435859);
                C36401np r6 = this.A07;
                if (r6 != null) {
                    Runnable[] runnableArr = {new AnonymousClass7RE(this, i, A0T, 12)};
                    SpannableString A04 = r6.A04(A0c.getContext(), A1H(2131898539), runnableArr, new String[]{"terms-of-service-link"}, new String[]{"https://www.whatsapp.com/legal/updates/terms-of-service"});
                    Rect rect = C39401t1.A0A;
                    AnonymousClass11C r0 = this.A01;
                    if (r0 != null) {
                        AnonymousClass3Ma.A1K(A0c, r0);
                        C18030ve r02 = this.A05;
                        if (r02 != null) {
                            AnonymousClass3Ma.A1L(r02, A0c);
                            A0c.setText(A04);
                            TextView A0E = AnonymousClass3Ma.A0E(view, 2131427483);
                            A0E.setText(2131898540);
                            A0E.setOnClickListener(new AnonymousClass78N((Object) this, A0T, i, 0));
                            C108975cc.A0Q(this).A01("show_ban_decision_screen", A0T, i);
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
        str = "viewModel";
        C18070vi.A11(str);
        throw null;
    }
}
