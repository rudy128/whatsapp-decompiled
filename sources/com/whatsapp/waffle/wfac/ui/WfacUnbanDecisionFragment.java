package com.whatsapp.waffle.wfac.ui;

import X.AnonymousClass11C;
import X.AnonymousClass129;
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
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;

public final class WfacUnbanDecisionFragment extends Hilt_WfacUnbanDecisionFragment {
    public AnonymousClass129 A00;
    public WfacBanViewModel A01;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        A1Z(true);
        return layoutInflater.inflate(2131627615, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        super.A21(bundle, view2);
        WfacBanViewModel wfacBanViewModel = (WfacBanViewModel) AnonymousClass3Ma.A0I(this).A00(WfacBanViewModel.class);
        this.A01 = wfacBanViewModel;
        if (wfacBanViewModel != null) {
            WfacBanViewModel.A04(A1D());
            WfacBanViewModel wfacBanViewModel2 = this.A01;
            if (wfacBanViewModel2 != null) {
                int A0T = wfacBanViewModel2.A0T();
                WfacBanViewModel wfacBanViewModel3 = this.A01;
                if (wfacBanViewModel3 != null) {
                    int i = wfacBanViewModel3.A00;
                    AnonymousClass3MX.A1B(A14(), AnonymousClass3Ma.A0C(view2, 2131428043), 2131233673);
                    AnonymousClass3Ma.A0E(view2, 2131431392).setText(2131898551);
                    TextEmojiLabel A0c = C72453Mb.A0c(view2, 2131435859);
                    C36401np r9 = this.A07;
                    if (r9 != null) {
                        Context context = A0c.getContext();
                        String A1H = A1H(2131898552);
                        String[] strArr = {"using-whatsapp-responsibly-link"};
                        String[] strArr2 = new String[1];
                        AnonymousClass129 r8 = this.A00;
                        if (r8 != null) {
                            strArr2[0] = r8.A05("security-and-privacy", "how-to-use-whatsapp-responsibly").toString();
                            SpannableString A04 = r9.A04(context, A1H, new Runnable[]{new AnonymousClass7RE(this, i, A0T, 14)}, strArr, strArr2);
                            Rect rect = C39401t1.A0A;
                            AnonymousClass11C r0 = this.A01;
                            if (r0 != null) {
                                AnonymousClass3Ma.A1K(A0c, r0);
                                C18030ve r02 = this.A05;
                                if (r02 != null) {
                                    AnonymousClass3Ma.A1L(r02, A0c);
                                    A0c.setText(A04);
                                    C18070vi.A05(view2, 2131427483).setVisibility(8);
                                    TextView A0E = AnonymousClass3Ma.A0E(view2, 2131427484);
                                    A0E.setVisibility(0);
                                    A0E.setText(2131898553);
                                    A0E.setOnClickListener(new AnonymousClass78N((Object) this, A0T, i, 3));
                                    C108975cc.A0Q(this).A01("show_ban_decision_screen", A0T, i);
                                    return;
                                }
                                str = "abProps";
                            } else {
                                str = "systemServices";
                            }
                        } else {
                            str = "faqLinkFactory";
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
}
