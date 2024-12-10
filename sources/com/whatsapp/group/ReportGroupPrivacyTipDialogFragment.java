package com.whatsapp.group;

import X.AnonymousClass18K;
import X.AnonymousClass1EG;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass4bB;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C72453Mb;
import X.C73203Rj;
import X.C81073ye;
import X.C88414Zp;
import X.C90044dR;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;

public final class ReportGroupPrivacyTipDialogFragment extends Hilt_ReportGroupPrivacyTipDialogFragment {
    public int A00 = 4;
    public AnonymousClass18K A01;
    public AnonymousClass1LU A02;
    public final C18100vl A03 = C88414Zp.A00(this, "exit_group");

    public Dialog A27(Bundle bundle) {
        AnonymousClass18K r2 = this.A01;
        if (r2 != null) {
            C81073ye r1 = new C81073ye();
            r1.A00 = 1;
            r2.CC4(r1);
            View A0D = AnonymousClass3MY.A0D(A16(), 2131625097);
            C18070vi.A0X(A0D);
            Context A14 = A14();
            Object[] A1a = AnonymousClass3MW.A1a();
            A1a[0] = AnonymousClass1EG.A03(A14(), 2131102239);
            Spanned A012 = AnonymousClass1EG.A01(A14, A1a, 2131891128);
            C18070vi.A0X(A012);
            C72453Mb.A1F(A0D, A012, 2131431286);
            C90044dR.A00(A0D.findViewById(2131431284), this, 15);
            if (C72453Mb.A1a(this.A03)) {
                C17880vN.A0E(A0D, 2131434550).setText(2131895167);
            }
            C73203Rj A04 = AnonymousClass4a6.A04(this);
            A04.A0c(A0D);
            AnonymousClass4bB.A00(A04, this, 14, 2131895211);
            return AnonymousClass3MY.A0L(A04);
        }
        AnonymousClass3MW.A1J();
        throw null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        int i = this.A00;
        AnonymousClass18K r2 = this.A01;
        if (r2 != null) {
            C81073ye r1 = new C81073ye();
            r1.A00 = Integer.valueOf(i);
            r2.CC4(r1);
            return;
        }
        AnonymousClass3MW.A1J();
        throw null;
    }
}
