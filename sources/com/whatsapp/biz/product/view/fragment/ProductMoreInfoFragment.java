package com.whatsapp.biz.product.view.fragment;

import X.AnonymousClass1DT;
import X.AnonymousClass1HF;
import X.AnonymousClass1K3;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass86E;
import X.C18000vb;
import X.C18070vi;
import X.C194359rb;
import X.C195469tO;
import X.C20339AGv;
import X.C21452AkJ;
import X.C21535Ali;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.Group;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.biz.product.viewmodel.ComplianceInfoViewModel;
import com.whatsapp.jid.UserJid;

public final class ProductMoreInfoFragment extends Hilt_ProductMoreInfoFragment implements AnonymousClass86E {
    public ProgressBar A00;
    public Group A01;
    public Group A02;
    public Group A03;
    public TextEmojiLabel A04;
    public TextEmojiLabel A05;
    public TextEmojiLabel A06;
    public WaTextView A07;
    public ComplianceInfoViewModel A08;
    public C18000vb A09;
    public AnonymousClass1K3 A0A;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LayoutInflater layoutInflater2 = layoutInflater;
        C18070vi.A0d(layoutInflater2, 0);
        View inflate = layoutInflater2.inflate(2131626624, viewGroup, false);
        View A052 = C18070vi.A05(inflate, 2131429138);
        AnonymousClass3MY.A0w(A14(), A052, 2131898783);
        AnonymousClass3Ma.A1C(A052, this, 46);
        C18070vi.A0b(inflate);
        this.A00 = (ProgressBar) AnonymousClass1HF.A06(inflate, 2131432795);
        this.A04 = AnonymousClass3MX.A0V(inflate, 2131432791);
        this.A06 = AnonymousClass3MX.A0V(inflate, 2131432793);
        this.A05 = AnonymousClass3MX.A0V(inflate, 2131432788);
        this.A02 = (Group) AnonymousClass1HF.A06(inflate, 2131431580);
        this.A03 = (Group) AnonymousClass1HF.A06(inflate, 2131431581);
        this.A01 = (Group) AnonymousClass1HF.A06(inflate, 2131431579);
        this.A07 = AnonymousClass3MW.A0T(inflate, 2131429318);
        UserJid userJid = (UserJid) A15().getParcelable("product_owner_jid");
        String string = A15().getString("product_id");
        if (!(string == null || userJid == null)) {
            ComplianceInfoViewModel complianceInfoViewModel = this.A08;
            if (complianceInfoViewModel != null) {
                AnonymousClass1DT r3 = complianceInfoViewModel.A01;
                r3.A0F(0);
                if (!((CatalogManager) complianceInfoViewModel.A05.get()).A0G(new C195469tO((C194359rb) null, userJid, 0, (Integer) null, string, complianceInfoViewModel.A02.A03, true))) {
                    AnonymousClass3MX.A1J(r3, 3);
                } else {
                    C21452AkJ.A00(complianceInfoViewModel.A03, complianceInfoViewModel, string, 30);
                }
            }
            C18070vi.A11("viewModel");
            throw null;
        }
        ComplianceInfoViewModel complianceInfoViewModel2 = this.A08;
        if (complianceInfoViewModel2 != null) {
            C20339AGv.A00(A1G(), complianceInfoViewModel2.A00, C21535Ali.A00(this, 15), 16);
            ComplianceInfoViewModel complianceInfoViewModel3 = this.A08;
            if (complianceInfoViewModel3 != null) {
                C20339AGv.A00(A1G(), complianceInfoViewModel3.A01, C21535Ali.A00(this, 16), 16);
                return inflate;
            }
        }
        C18070vi.A11("viewModel");
        throw null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A08 = (ComplianceInfoViewModel) AnonymousClass3MW.A0N(this).A00(ComplianceInfoViewModel.class);
    }
}
