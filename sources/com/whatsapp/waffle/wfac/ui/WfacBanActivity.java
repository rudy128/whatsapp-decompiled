package com.whatsapp.waffle.wfac.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MW;
import X.AnonymousClass7AS;
import X.C108945cZ;
import X.C108955ca;
import X.C109005cf;
import X.C132556n0;
import X.C138066wT;
import X.C1423379b;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C31081ez;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public final class WfacBanActivity extends AnonymousClass1FY {
    public WfacBanViewModel A00;
    public boolean A01;

    public void onNewIntent(Intent intent) {
        C18070vi.A0d(intent, 0);
        super.onNewIntent(intent);
        C31081ez.A02("WfacBanActivity/onNewIntent");
        WfacBanViewModel wfacBanViewModel = this.A00;
        if (wfacBanViewModel == null) {
            C18070vi.A11("viewModel");
            throw null;
        } else if (wfacBanViewModel.A00 == 4) {
            wfacBanViewModel.A0U();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0c(A0A, r1, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
        }
    }

    public WfacBanActivity(int i) {
        this.A01 = false;
        C1423379b.A00(this, 22);
    }

    public void onCreate(Bundle bundle) {
        C132556n0 r3;
        String str;
        String str2;
        super.onCreate(bundle);
        setContentView(2131627614);
        this.A00 = (WfacBanViewModel) AnonymousClass3MW.A0N(this).A00(WfacBanViewModel.class);
        int intExtra = getIntent().getIntExtra("ban_violation_type", -1);
        String stringExtra = getIntent().getStringExtra("ban_violation_reason");
        int intExtra2 = getIntent().getIntExtra("ban_violation_source", -1);
        int i = 0;
        if (intExtra2 != 0) {
            i = 1;
            if (intExtra2 != 1) {
                i = 2;
                if (intExtra2 != 2) {
                    i = -1;
                }
            }
        }
        int intExtra3 = getIntent().getIntExtra("launch_source", 0);
        String stringExtra2 = getIntent().getStringExtra("appeal_decision");
        String str3 = "banned";
        String str4 = str3;
        if (!C18070vi.A18(stringExtra2, str3)) {
            str3 = "unbanned";
            if (!C18070vi.A18(stringExtra2, str3)) {
                str3 = "other";
            }
        }
        String stringExtra3 = getIntent().getStringExtra("ban_status_request_token");
        WfacBanViewModel wfacBanViewModel = this.A00;
        if (wfacBanViewModel != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("WfacBanViewModel violation [");
            A10.append(intExtra);
            A10.append("] with reason [");
            A10.append(stringExtra);
            A10.append("], violation source [");
            A10.append(i);
            A10.append("]and appeal decision [");
            A10.append(str3);
            A10.append("] from launch source [");
            A10.append(intExtra3);
            C18070vi.A0d(C17890vO.A0c(A10, ']'), 0);
            if (stringExtra3 != null) {
                C17880vN.A1E(C138066wT.A00(WfacBanViewModel.A03(wfacBanViewModel).A02), "wfac_ban_status_token", stringExtra3);
            }
            if (intExtra >= 0) {
                C132556n0 A03 = WfacBanViewModel.A03(wfacBanViewModel);
                C31081ez.A02(AnonymousClass001.A1I("WfacBanRepository/storeViolationType : ", AnonymousClass000.A10(), intExtra));
                C17880vN.A1C(C138066wT.A00(A03.A02), "wfac_ban_violation_type", intExtra);
            }
            if (stringExtra != null) {
                C132556n0 A032 = WfacBanViewModel.A03(wfacBanViewModel);
                C31081ez.A02(AnonymousClass001.A1H("WfacBanRepository/storeViolationReason : ", stringExtra, AnonymousClass000.A10()));
                C17880vN.A1E(C138066wT.A00(A032.A02), "wfac_ban_violation_reason", stringExtra);
            }
            wfacBanViewModel.A00 = intExtra3;
            if (intExtra3 == 2 || intExtra3 == 3) {
                C132556n0 A033 = WfacBanViewModel.A03(wfacBanViewModel);
                C31081ez.A02(AnonymousClass001.A1I("WfacBanRepository/storeViolationSource : ", AnonymousClass000.A10(), i));
                C17880vN.A1C(C138066wT.A00(A033.A02), "wfac_ban_violation_source", i);
            }
            wfacBanViewModel.A01 = str3;
            WfacBanViewModel wfacBanViewModel2 = this.A00;
            if (wfacBanViewModel2 != null) {
                AnonymousClass7AS.A00(this, wfacBanViewModel2.A03, C108945cZ.A1K(this, 37), 40);
                WfacBanViewModel wfacBanViewModel3 = this.A00;
                if (wfacBanViewModel3 != null) {
                    int i2 = wfacBanViewModel3.A00;
                    if (i2 == 2 || i2 == 3) {
                        r3 = WfacBanViewModel.A03(wfacBanViewModel3);
                        str = "CHECKPOINTED";
                        C31081ez.A02(AnonymousClass001.A1H("WfacBanRepository/storeBanState : ", str, AnonymousClass000.A10()));
                        C17880vN.A1E(C138066wT.A00(r3.A02), "wfac_ban_state", str);
                    } else {
                        if (i2 != 4) {
                            str2 = "WfacBanViewModel/setBanState unknown or main default launch. Using previous state";
                        } else {
                            String str5 = wfacBanViewModel3.A01;
                            if (C18070vi.A18(str5, str4)) {
                                r3 = WfacBanViewModel.A03(wfacBanViewModel3);
                                str = "BANNED";
                            } else if (C18070vi.A18(str5, "unbanned")) {
                                r3 = WfacBanViewModel.A03(wfacBanViewModel3);
                                str = "UNBANNED";
                            } else {
                                str2 = "WfacBanViewModel/setBanState unknown or missing appeal decision. Ignoring";
                            }
                            C31081ez.A02(AnonymousClass001.A1H("WfacBanRepository/storeBanState : ", str, AnonymousClass000.A10()));
                            C17880vN.A1E(C138066wT.A00(r3.A02), "wfac_ban_state", str);
                        }
                        C31081ez.A02(str2);
                    }
                    if (bundle == null) {
                        WfacBanViewModel wfacBanViewModel4 = this.A00;
                        if (wfacBanViewModel4 != null) {
                            wfacBanViewModel4.A0U();
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        C18070vi.A11("viewModel");
        throw null;
    }

    public void onStart() {
        super.onStart();
        WfacBanViewModel wfacBanViewModel = this.A00;
        if (wfacBanViewModel == null) {
            AnonymousClass3MW.A1H();
            throw null;
        } else {
            wfacBanViewModel.A02.BEJ(76, "WfacBanActivity");
        }
    }

    public WfacBanActivity() {
        this(0);
    }
}
