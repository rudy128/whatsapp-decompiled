package com.whatsapp.flows.webview;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1GP;
import X.AnonymousClass3MX;
import X.AnonymousClass79Z;
import X.C108955ca;
import X.C108965cb;
import X.C109005cf;
import X.C146747Ql;
import X.C17880vN;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer;

public final class WaFlowsWebViewBottomsheetModalActivity extends AnonymousClass1FY {
    public AnonymousClass00H A00;
    public boolean A01;

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0c(A0A, r1, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            this.A00 = AnonymousClass3MX.A11(A0A);
        }
    }

    public void A3K() {
        if (C18020vd.A05(C18040vf.A02, this.A0E, 6715)) {
            AnonymousClass00H r0 = this.A00;
            if (r0 != null) {
                AnonymousClass3MX.A0u(r0).A02(C108965cb.A0Q(getIntent(), AnonymousClass1BI.A00, "chat_id"), 63);
                return;
            }
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        }
    }

    public void onDestroy() {
        this.A05.CGF(C146747Ql.A00(this, 33));
        super.onDestroy();
    }

    public WaFlowsWebViewBottomsheetModalActivity(int i) {
        this.A01 = false;
        AnonymousClass79Z.A00(this, 47);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        setContentView(2131627526);
        getWindow().setStatusBarColor(C108955ca.A01(this));
        int i = 1;
        if (Build.VERSION.SDK_INT == 26) {
            i = -1;
        }
        setRequestedOrientation(i);
        Intent intent = getIntent();
        C18070vi.A0X(intent);
        FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = new FlowsWebBottomSheetContainer();
        Bundle A0D = C17880vN.A0D();
        A0D.putString("screen_params", intent.getStringExtra("screen_params"));
        A0D.putString("chat_id", intent.getStringExtra("chat_id"));
        A0D.putString("flow_id", intent.getStringExtra("flow_id"));
        A0D.putAll(intent.getExtras());
        flowsWebBottomSheetContainer.A1R(A0D);
        AnonymousClass1GP supportFragmentManager = getSupportFragmentManager();
        C17960vV.A07(supportFragmentManager);
        flowsWebBottomSheetContainer.A2C(supportFragmentManager, "flows_bottom_sheet_container");
    }

    public WaFlowsWebViewBottomsheetModalActivity() {
        this(0);
    }
}
