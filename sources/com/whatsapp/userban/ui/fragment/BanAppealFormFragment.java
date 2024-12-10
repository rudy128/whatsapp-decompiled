package com.whatsapp.userban.ui.fragment;

import X.AnonymousClass11C;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L4;
import X.AnonymousClass1LC;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass71O;
import X.AnonymousClass78L;
import X.C108965cb;
import X.C17880vN;
import X.C17890vO;
import X.C18030ve;
import X.C19830z4;
import X.C36361nl;
import X.C73173Rg;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;
import com.whatsapp.util.Log;

public class BanAppealFormFragment extends Hilt_BanAppealFormFragment {
    public EditText A00;
    public AnonymousClass1KB A01;
    public C36361nl A02;
    public AnonymousClass1LC A03;
    public AnonymousClass11C A04;
    public C18030ve A05;
    public BanAppealViewModel A06;
    public AnonymousClass1L4 A07;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        A1Z(true);
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131624260);
    }

    public void A1t() {
        super.A1t();
        String A12 = AnonymousClass3Ma.A12(this.A00);
        AnonymousClass71O r1 = this.A06.A08;
        Log.i("BanAppealRepository/storeFormReviewDraft");
        C17880vN.A1E(C19830z4.A00(r1.A06), "support_ban_appeal_form_review_draft", A12);
    }

    public void A1u() {
        super.A1u();
        AnonymousClass71O r1 = this.A06.A08;
        Log.i("BanAppealRepository/getFormReviewDraft");
        String A0r = C17880vN.A0r(C17890vO.A0B(r1.A06), "support_ban_appeal_form_review_draft");
        if (A0r != null) {
            this.A00.setText(A0r);
        }
    }

    public void A21(Bundle bundle, View view) {
        this.A06 = (BanAppealViewModel) AnonymousClass3Ma.A0I(this).A00(BanAppealViewModel.class);
        BanAppealViewModel.A03(A1D(), true);
        this.A00 = (EditText) AnonymousClass1HF.A06(view, 2131430975);
        AnonymousClass78L.A00(AnonymousClass1HF.A06(view, 2131435883), this, 10);
        C108965cb.A13(A1D(), this.A06.A02, this, 35);
        TextEmojiLabel A0V = AnonymousClass3MX.A0V(view, 2131431392);
        AnonymousClass3Ma.A1L(this.A05, A0V);
        AnonymousClass3Ma.A1K(A0V, this.A04);
        A0V.setText(this.A06.A0T(A14(), this.A01, this.A02, this.A04));
        A1D().BVe().A09(new C73173Rg(this, 7), A1G());
    }

    public boolean A24(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        this.A06.A0V();
        return true;
    }
}
