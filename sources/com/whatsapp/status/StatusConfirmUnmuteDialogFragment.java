package com.whatsapp.status;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1E7;
import X.AnonymousClass1M9;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass758;
import X.AnonymousClass7QR;
import X.C108985cd;
import X.C1412374v;
import X.C17900vP;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C24921Me;
import X.C32741hg;
import X.C34621kn;
import X.C55092fC;
import X.C58772lE;
import X.C70753Cj;
import X.C73203Rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;

public final class StatusConfirmUnmuteDialogFragment extends Hilt_StatusConfirmUnmuteDialogFragment {
    public AnonymousClass1M9 A00;
    public C24921Me A01;
    public C32741hg A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public C34621kn A05;

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C34621kn r0 = this.A05;
        if (r0 != null) {
            r0.BrY(false);
        }
    }

    public Dialog A27(Bundle bundle) {
        String str;
        C34621kn r0 = this.A05;
        if (r0 != null) {
            r0.BrY(true);
        }
        UserJid A042 = UserJid.Companion.A04(C108985cd.A0i(this));
        C17960vV.A07(A042);
        C18070vi.A0X(A042);
        AnonymousClass1M9 r02 = this.A00;
        if (r02 != null) {
            AnonymousClass1E7 A0H = r02.A0H(A042);
            Object[] objArr = new Object[1];
            C24921Me r03 = this.A01;
            if (r03 != null) {
                String A16 = AnonymousClass3MX.A16(this, r03.A0I(A0H), objArr, 0, 2131897329);
                C18070vi.A0X(A16);
                C73203Rj A032 = AnonymousClass4a6.A03(this);
                Object[] objArr2 = new Object[1];
                C24921Me r04 = this.A01;
                if (r04 != null) {
                    A032.A0k(AnonymousClass3MX.A16(this, AnonymousClass3MY.A0q(r04, A0H), objArr2, 0, 2131897331));
                    A032.A0S(A16);
                    AnonymousClass758.A00(A032, this, 17, 2131898766);
                    A032.A0Z(new C1412374v(this, A042, 7), 2131897328);
                    return AnonymousClass3MY.A0L(A032);
                }
            }
            str = "waContactNames";
        } else {
            str = "contactManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A00(UserJid userJid, StatusConfirmUnmuteDialogFragment statusConfirmUnmuteDialogFragment) {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("statusesfragment/unmute status for ");
        UserJid userJid2 = userJid;
        C17900vP.A0b(userJid, A10);
        StatusConfirmUnmuteDialogFragment statusConfirmUnmuteDialogFragment2 = statusConfirmUnmuteDialogFragment;
        AnonymousClass00H r0 = statusConfirmUnmuteDialogFragment.A04;
        if (r0 != null) {
            C55092fC r4 = (C55092fC) ((C58772lE) r0.get()).A08.get();
            r4.A03.CGF(new C70753Cj(r4, userJid2, 8, C18020vd.A05(C18040vf.A02, r4.A01, 2070), false));
            Bundle A15 = statusConfirmUnmuteDialogFragment.A15();
            C32741hg r6 = statusConfirmUnmuteDialogFragment.A02;
            if (r6 != null) {
                String string = A15.getString("message_id");
                Long valueOf = Long.valueOf(A15.getLong("status_item_index"));
                String string2 = A15.getString("psa_campaign_id");
                r6.A0F.CGF(new AnonymousClass7QR(userJid2, r6, valueOf, A15.getString("psa_campaign_ids"), string2, string, 2, A15.getBoolean("is_message_sampled")));
                statusConfirmUnmuteDialogFragment2.A28();
                return;
            }
            str = "statusesStatsManager";
        } else {
            str = "statusManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A1r() {
        super.A1r();
        this.A05 = null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        try {
            Object A1B = A1B();
            if (!(A1B instanceof C34621kn)) {
                A1B = A19();
                C18070vi.A0z(A1B, "null cannot be cast to non-null type com.whatsapp.status.StatusConfirmUnmuteDialogFragment.Host");
            }
            this.A05 = (C34621kn) A1B;
        } catch (ClassCastException unused) {
            throw new ClassCastException("Calling fragment must implement Host interface");
        }
    }
}
