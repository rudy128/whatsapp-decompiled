package com.whatsapp.userban.ui.fragment;

import X.AnonymousClass11C;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass78L;
import X.C21423Ajq;
import X.C36401np;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;

public class BanAppealBannedDecisionFragment extends Hilt_BanAppealBannedDecisionFragment {
    public AnonymousClass11C A00;
    public BanAppealViewModel A01;
    public C36401np A02;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super.A1q(bundle, layoutInflater, viewGroup);
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131624262);
    }

    public void A21(Bundle bundle, View view) {
        super.A21(bundle, view);
        this.A01 = (BanAppealViewModel) AnonymousClass3Ma.A0I(this).A00(BanAppealViewModel.class);
        BanAppealViewModel.A03(A1D(), false);
        AnonymousClass3MW.A0G(view, 2131428043).setImageDrawable(AnonymousClass3MZ.A09(this).getDrawable(2131233670));
        String[] strArr = {"terms-of-service-link"};
        AnonymousClass3MW.A0J(view, 2131431392).setText(2131886930);
        TextEmojiLabel A0V = AnonymousClass3MX.A0V(view, 2131435859);
        C36401np r5 = this.A02;
        Context context = A0V.getContext();
        String A1H = A1H(2131886931);
        Runnable[] runnableArr = {new C21423Ajq(21), new C21423Ajq(22)};
        SpannableString A04 = r5.A04(context, A1H, runnableArr, strArr, new String[]{"https://www.whatsapp.com/legal/updates/terms-of-service"});
        AnonymousClass3Ma.A1K(A0V, this.A00);
        AnonymousClass3Ma.A1L(this.A04, A0V);
        A0V.setText(A04);
        TextView A0J = AnonymousClass3MW.A0J(view, 2131427483);
        A0J.setText(2131886932);
        AnonymousClass78L.A00(A0J, this, 9);
    }
}
