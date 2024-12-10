package com.whatsapp.flows.downloadresponse.view;

import X.AnonymousClass01E;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass5SP;
import X.AnonymousClass5SQ;
import X.C003401n;
import X.C18000vb;
import X.C18070vi;
import X.C30391dr;
import X.C41561wd;
import X.C72463Mc;
import X.C89944dH;
import X.C91644g1;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import com.whatsapp.flows.downloadresponse.viewmodel.FlowsDownloadResponseViewModel;
import com.whatsapp.flows.downloadresponse.viewmodel.FlowsDownloadResponseViewModel$fetchFlowNameForMessageRowId$1;
import com.whatsapp.wds.components.topbar.WDSToolbar;

public final class FlowsDownloadResponseBottomSheet extends Hilt_FlowsDownloadResponseBottomSheet {
    public Button A00;
    public RadioButton A01;
    public RadioButton A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public WaTextView A06;
    public C18000vb A07;
    public FlowsDownloadResponseViewModel A08;
    public WDSToolbar A09;
    public boolean A0A;
    public final View.OnClickListener A0B = new C89944dH(this, 9);
    public final View.OnClickListener A0C = new C89944dH(this, 10);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        WDSToolbar wDSToolbar;
        C18070vi.A0d(layoutInflater, 0);
        View A0B2 = AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131625332, false);
        this.A00 = (Button) AnonymousClass1HF.A06(A0B2, 2131428601);
        this.A02 = (RadioButton) AnonymousClass1HF.A06(A0B2, 2131430160);
        this.A01 = (RadioButton) AnonymousClass1HF.A06(A0B2, 2131430159);
        this.A06 = AnonymousClass3MW.A0T(A0B2, 2131436279);
        this.A05 = AnonymousClass3MW.A0J(A0B2, 2131434322);
        this.A04 = AnonymousClass3MW.A0J(A0B2, 2131434321);
        this.A03 = AnonymousClass3MW.A0J(A0B2, 2131434320);
        this.A09 = (WDSToolbar) AnonymousClass1HF.A06(A0B2, 2131430922);
        AnonymousClass1FL A1B = A1B();
        C18070vi.A0z(A1B, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        C003401n A0K = AnonymousClass3MY.A0K((AnonymousClass01E) A1B, this.A09);
        if (A0K != null) {
            A0K.A0Y(false);
        }
        WDSToolbar wDSToolbar2 = this.A09;
        if (wDSToolbar2 != null) {
            C18000vb r3 = this.A07;
            if (r3 != null) {
                AnonymousClass3NL.A02(A14(), wDSToolbar2, r3, 2131233200);
            } else {
                AnonymousClass3MW.A1M();
                throw null;
            }
        }
        Resources A092 = AnonymousClass3MZ.A09(this);
        if (!(A092 == null || (wDSToolbar = this.A09) == null)) {
            C72463Mc.A0x(A14(), A092, wDSToolbar, 2130971792, 2131102910);
        }
        WDSToolbar wDSToolbar3 = this.A09;
        if (wDSToolbar3 != null) {
            wDSToolbar3.setNavigationOnClickListener(new C89944dH(this, 11));
        }
        WDSToolbar wDSToolbar4 = this.A09;
        if (wDSToolbar4 != null) {
            C72463Mc.A0v(A1n(), A14(), wDSToolbar4, 2130971986, 2131103168);
        }
        FlowsDownloadResponseViewModel flowsDownloadResponseViewModel = this.A08;
        if (flowsDownloadResponseViewModel != null) {
            C91644g1.A00(A1G(), flowsDownloadResponseViewModel.A02, new AnonymousClass5SP(this), 31);
            FlowsDownloadResponseViewModel flowsDownloadResponseViewModel2 = this.A08;
            if (flowsDownloadResponseViewModel2 != null) {
                C91644g1.A00(A1G(), flowsDownloadResponseViewModel2.A00, new AnonymousClass5SQ(this), 31);
                RadioButton radioButton = this.A02;
                if (radioButton != null) {
                    radioButton.setChecked(!this.A0A);
                }
                RadioButton radioButton2 = this.A01;
                if (radioButton2 != null) {
                    radioButton2.setChecked(this.A0A);
                }
                RadioButton radioButton3 = this.A02;
                if (radioButton3 != null) {
                    radioButton3.setOnClickListener(this.A0C);
                }
                TextView textView = this.A05;
                if (textView != null) {
                    textView.setOnClickListener(this.A0C);
                }
                RadioButton radioButton4 = this.A01;
                if (radioButton4 != null) {
                    radioButton4.setOnClickListener(this.A0B);
                }
                TextView textView2 = this.A04;
                if (textView2 != null) {
                    textView2.setOnClickListener(this.A0B);
                }
                TextView textView3 = this.A03;
                if (textView3 != null) {
                    textView3.setOnClickListener(this.A0B);
                }
                Button button = this.A00;
                if (button != null) {
                    C89944dH.A00(button, this, 8);
                }
                return A0B2;
            }
        }
        C18070vi.A11("flowsDownloadResponseViewModel");
        throw null;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        Bundle bundle2 = this.A06;
        if (bundle2 == null || bundle2.getString("flow_id") == null) {
            A28();
            return;
        }
        Bundle bundle3 = this.A06;
        long j = -1;
        if (bundle3 != null) {
            j = bundle3.getLong("message_row_id", -1);
        }
        FlowsDownloadResponseViewModel flowsDownloadResponseViewModel = this.A08;
        if (flowsDownloadResponseViewModel == null) {
            C18070vi.A11("flowsDownloadResponseViewModel");
            throw null;
        }
        AnonymousClass3MW.A1X(flowsDownloadResponseViewModel.A03, new FlowsDownloadResponseViewModel$fetchFlowNameForMessageRowId$1(flowsDownloadResponseViewModel, (C30391dr) null, j), C41561wd.A00(flowsDownloadResponseViewModel));
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A08 = (FlowsDownloadResponseViewModel) AnonymousClass3Ma.A0I(this).A00(FlowsDownloadResponseViewModel.class);
    }
}
