package com.whatsapp.flows.phoenix;

import X.A2V;
import X.A2X;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass3MX;
import X.AnonymousClass79Z;
import X.AnonymousClass7NI;
import X.AnonymousClass7NM;
import X.C000200d;
import X.C108955ca;
import X.C109005cf;
import X.C146747Ql;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C21106Aea;
import X.C22931Dv;
import X.C30361do;
import X.C56382hN;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.flows.phoenix.view.FlowsInitialLoadingView;
import com.whatsapp.flows.phoenix.view.PhoenixFlowsBottomSheetContainer;
import com.whatsapp.jid.Jid;
import com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer;
import com.whatsapp.wabloks.ui.WaFcsBottomSheetModalActivity;

public final class PhoenixFlowsBottomSheetActivity extends WaFcsBottomSheetModalActivity {
    public AnonymousClass00H A00;
    public boolean A01;
    public boolean A02;

    public void onNewIntent(Intent intent) {
        C18070vi.A0d(intent, 0);
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            this.A01 = r1.A2Q();
            this.A00 = (C56382hN) A0K.A64.get();
            this.A03 = C000200d.A00(A0A.AB2);
            this.A04 = AnonymousClass1K1.A01(A0K);
            this.A00 = AnonymousClass3MX.A11(A0A);
        }
    }

    public void A3K() {
        if (C18020vd.A05(C18040vf.A02, this.A0E, 6715)) {
            AnonymousClass00H r0 = this.A00;
            if (r0 != null) {
                C30361do A0u = AnonymousClass3MX.A0u(r0);
                C22931Dv r02 = AnonymousClass1BI.A00;
                A0u.A02(C22931Dv.A00(Jid.Companion.A02(getIntent().getStringExtra("extra_business_jid"))), 63);
                return;
            }
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        }
    }

    public FcsBottomSheetBaseContainer A4b() {
        C18030ve r8 = this.A0E;
        C18070vi.A0W(r8);
        String stringExtra = getIntent().getStringExtra("fds_observer_id");
        String stringExtra2 = getIntent().getStringExtra("extra_business_jid");
        String stringExtra3 = getIntent().getStringExtra("flow_id");
        PhoenixFlowsBottomSheetContainer phoenixFlowsBottomSheetContainer = new PhoenixFlowsBottomSheetContainer();
        Bundle A0D = C17880vN.A0D();
        A0D.putString("fds_observer_id", stringExtra);
        A0D.putString("business_jid", stringExtra2);
        A0D.putString("flow_id", stringExtra3);
        A0D.putInt("fcs_bottom_sheet_max_height_percentage", C18020vd.A00(C18040vf.A02, r8, 3319));
        A0D.putBoolean("fcs_show_divider_under_nav_bar", true);
        phoenixFlowsBottomSheetContainer.A1R(A0D);
        return phoenixFlowsBottomSheetContainer;
    }

    public PhoenixFlowsBottomSheetActivity(int i) {
        this.A02 = false;
        AnonymousClass79Z.A00(this, 46);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A2X a2x = this.A05;
        if (a2x != null) {
            a2x.A01(new AnonymousClass7NI(this, 0), AnonymousClass7NM.class, a2x);
            a2x.A01(new AnonymousClass7NI(this, 1), C21106Aea.class, a2x);
        }
    }

    public void onDestroy() {
        String stringExtra = getIntent().getStringExtra("fds_observer_id");
        if (stringExtra != null) {
            ((A2V) this.A03.get()).A03(stringExtra);
        }
        this.A05.CGF(C146747Ql.A00(this, 31));
        super.onDestroy();
    }

    public void onResume() {
        PhoenixFlowsBottomSheetContainer phoenixFlowsBottomSheetContainer;
        super.onResume();
        FcsBottomSheetBaseContainer fcsBottomSheetBaseContainer = this.A02;
        if (fcsBottomSheetBaseContainer instanceof PhoenixFlowsBottomSheetContainer) {
            phoenixFlowsBottomSheetContainer = (PhoenixFlowsBottomSheetContainer) fcsBottomSheetBaseContainer;
        } else {
            phoenixFlowsBottomSheetContainer = null;
        }
        String stringExtra = getIntent().getStringExtra("extra_error_message");
        if (phoenixFlowsBottomSheetContainer != null) {
            FlowsInitialLoadingView flowsInitialLoadingView = phoenixFlowsBottomSheetContainer.A02;
            if (flowsInitialLoadingView != null) {
                flowsInitialLoadingView.setErrorMessage(stringExtra);
            }
            phoenixFlowsBottomSheetContainer.A2K();
        }
    }

    public PhoenixFlowsBottomSheetActivity() {
        this(0);
    }
}
