package com.whatsapp.product.newsletterenforcements.disputesettlement;

import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4CG;
import X.C18070vi;
import X.C82824Cf;
import X.C89964dJ;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.base.WaFragment;
import com.whatsapp.wds.components.list.listitem.WDSListItem;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public final class DisputeSettlementBodySubmitFragment extends WaFragment {
    public NewsletterEnforcementSelectActionViewModel A00;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625123, viewGroup, false);
        View inflate2 = layoutInflater.inflate(2131625124, viewGroup, false);
        WDSListItem wDSListItem = (WDSListItem) inflate2.findViewById(2131429105);
        wDSListItem.setText(2131892567);
        wDSListItem.setSubText(2131892566);
        WDSListItem wDSListItem2 = (WDSListItem) inflate2.findViewById(2131434212);
        wDSListItem2.setText(2131892579);
        wDSListItem2.setSubText(2131892578);
        WDSListItem wDSListItem3 = (WDSListItem) inflate2.findViewById(2131434095);
        wDSListItem3.setText(2131892577);
        wDSListItem3.setSubText(2131892576);
        WDSTextLayout wDSTextLayout = (WDSTextLayout) inflate.findViewById(2131430071);
        AnonymousClass3MY.A1J(this, wDSTextLayout, 2131892575);
        AnonymousClass3MY.A1I(this, wDSTextLayout, 2131890768);
        wDSTextLayout.setPrimaryButtonClickListener(new C89964dJ(this, 19));
        AnonymousClass4CG.A00(inflate2, wDSTextLayout);
        wDSTextLayout.setFootnoteText(A1H(2131892572));
        wDSTextLayout.setFootnotePosition(C82824Cf.FOOTER);
        return inflate;
    }

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        this.A00 = (NewsletterEnforcementSelectActionViewModel) AnonymousClass3Ma.A0I(this).A00(NewsletterEnforcementSelectActionViewModel.class);
    }

    public void A1u() {
        super.A1u();
        A1D().setTitle(2131892584);
    }
}
