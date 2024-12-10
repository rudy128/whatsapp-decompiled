package com.whatsapp.product.reporttoadmin;

import X.AnonymousClass00H;
import X.AnonymousClass1BI;
import X.AnonymousClass1KB;
import X.AnonymousClass1W2;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass4aU;
import X.C131636lQ;
import X.C18070vi;
import X.C26031Qo;
import X.C80523xJ;
import android.content.DialogInterface;
import android.os.Bundle;

public final class ReportToAdminDialogFragment extends Hilt_ReportToAdminDialogFragment {
    public AnonymousClass1KB A00;
    public C26031Qo A01;
    public AnonymousClass206 A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public boolean A06;

    public void onDismiss(DialogInterface dialogInterface) {
        String rawString;
        String str;
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass206 r0 = this.A02;
        if (r0 == null) {
            str = "selectedMessage";
        } else {
            AnonymousClass1BI r02 = r0.A0v.A00;
            if (r02 != null && (rawString = r02.getRawString()) != null) {
                boolean z = this.A06;
                AnonymousClass00H r03 = this.A04;
                if (r03 != null) {
                    C131636lQ r1 = (C131636lQ) r03.get();
                    int i = 3;
                    if (z) {
                        i = 2;
                    }
                    r1.A00(i, rawString);
                    return;
                }
                str = "rtaLoggingUtils";
            } else {
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        AnonymousClass205 A032 = AnonymousClass4aU.A03(A15(), "");
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            AnonymousClass206 A012 = AnonymousClass1W2.A01(A032, r0);
            if (A012 == null) {
                C26031Qo r2 = this.A01;
                if (r2 != null) {
                    r2.A00(C80523xJ.A01, (String) null);
                } else {
                    C18070vi.A11("crashLogsWrapper");
                    throw null;
                }
            } else {
                this.A02 = A012;
            }
        } else {
            C18070vi.A11("fMessageDatabase");
            throw null;
        }
    }
}
