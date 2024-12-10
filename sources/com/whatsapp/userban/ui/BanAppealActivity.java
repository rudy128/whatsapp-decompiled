package com.whatsapp.userban.ui;

import X.A9B;
import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MW;
import X.AnonymousClass71O;
import X.AnonymousClass7AP;
import X.AnonymousClass7RC;
import X.C108955ca;
import X.C109005cf;
import X.C1423379b;
import X.C17880vN;
import X.C17900vP;
import X.C19830z4;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;
import com.whatsapp.util.Log;

public class BanAppealActivity extends AnonymousClass1FY {
    public BanAppealViewModel A00;
    public String A01;
    public boolean A02;

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0c(A0A, r1, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
        }
    }

    public Dialog onCreateDialog(int i) {
        if (i == 128) {
            return A9B.A0A(this, (Runnable) null, AnonymousClass7RC.A00(this, 44), AnonymousClass7RC.A00(this, 45));
        }
        return super.onCreateDialog(i);
    }

    public BanAppealActivity(int i) {
        this.A02 = false;
        C1423379b.A00(this, 10);
    }

    public void onCreate(Bundle bundle) {
        Boolean bool;
        super.onCreate(bundle);
        setContentView(2131624259);
        this.A00 = (BanAppealViewModel) AnonymousClass3MW.A0N(this).A00(BanAppealViewModel.class);
        if (getIntent().hasExtra("is_eu_smb")) {
            bool = Boolean.valueOf(getIntent().getBooleanExtra("is_eu_smb", false));
        } else {
            bool = null;
        }
        String stringExtra = getIntent().getStringExtra("appeal_request_token");
        int intExtra = getIntent().getIntExtra("ban_violation_type", -1);
        String stringExtra2 = getIntent().getStringExtra("ban_violation_reason");
        int intExtra2 = getIntent().getIntExtra("launch_source", 0);
        BanAppealViewModel banAppealViewModel = this.A00;
        if (stringExtra != null) {
            C17880vN.A1E(C19830z4.A00(banAppealViewModel.A08.A06), "support_ban_appeal_token", stringExtra);
        }
        if (intExtra >= 0) {
            AnonymousClass71O r2 = banAppealViewModel.A08;
            C17900vP.A0j("BanAppealRepository/storeBanViolationType ", AnonymousClass000.A10(), intExtra);
            C17880vN.A1C(C19830z4.A00(r2.A06), "support_ban_appeal_violation_type", intExtra);
        }
        if (stringExtra2 != null) {
            AnonymousClass71O r22 = banAppealViewModel.A08;
            C17900vP.A0f("BanAppealRepository/storeBanViolationReason ", stringExtra2, AnonymousClass000.A10());
            C17880vN.A1E(C19830z4.A00(r22.A06), "support_ban_appeal_violation_reason", stringExtra2);
        }
        if (bool != null) {
            AnonymousClass71O r3 = banAppealViewModel.A08;
            boolean booleanValue = bool.booleanValue();
            C17900vP.A0n("BanAppealRepository/storeBanIsEuSmbUser ", AnonymousClass000.A10(), booleanValue);
            C17880vN.A1F(C19830z4.A00(r3.A06), "support_ban_appeal_is_eu_smb_user", booleanValue);
        }
        banAppealViewModel.A00 = intExtra2;
        if (bundle == null) {
            this.A00.A0U();
        } else {
            this.A01 = bundle.getString("first_fragment_tag_save_instance_state");
        }
        AnonymousClass7AP.A00(this, this.A00.A0A, 24);
        AnonymousClass7AP.A00(this, this.A00.A01, 25);
        AnonymousClass7AP.A00(this, this.A00.A09, 26);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("BanAppealActivity/onNewIntent");
        if (intent.getIntExtra("launch_source", 0) == 4) {
            this.A00.A0U();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("first_fragment_tag_save_instance_state", this.A01);
    }

    public void onStart() {
        super.onStart();
        this.A00.A05.BEJ(42, "BanAppealActivity");
    }

    public BanAppealActivity() {
        this(0);
    }
}
