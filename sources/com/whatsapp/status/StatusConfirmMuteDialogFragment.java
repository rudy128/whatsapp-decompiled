package com.whatsapp.status;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1FL;
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
import X.C34611km;
import X.C55092fC;
import X.C58772lE;
import X.C70753Cj;
import X.C73203Rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.whatsapp.jid.UserJid;

public final class StatusConfirmMuteDialogFragment extends Hilt_StatusConfirmMuteDialogFragment {
    public AnonymousClass1M9 A00;
    public C24921Me A01;
    public C32741hg A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public C34611km A05;

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C34611km r0 = this.A05;
        if (r0 != null) {
            r0.BrY(false);
        }
    }

    public Dialog A27(Bundle bundle) {
        String str;
        C34611km r0 = this.A05;
        if (r0 != null) {
            r0.BrY(true);
        }
        UserJid A042 = UserJid.Companion.A04(C108985cd.A0i(this));
        C17960vV.A07(A042);
        C18070vi.A0X(A042);
        C24921Me r1 = this.A01;
        if (r1 != null) {
            AnonymousClass1M9 r02 = this.A00;
            if (r02 != null) {
                String A0p = AnonymousClass3MY.A0p(r02, r1, A042);
                String A16 = AnonymousClass3MX.A16(this, A0p, new Object[1], 0, 2131892369);
                C18070vi.A0X(A16);
                C73203Rj A032 = AnonymousClass4a6.A03(this);
                A032.A0k(AnonymousClass3MY.A0o(this, A0p, 0, 2131892371));
                A032.A0S(A16);
                AnonymousClass758.A00(A032, this, 16, 2131898766);
                A032.A0Z(new C1412374v(this, A042, 6), 2131892368);
                return AnonymousClass3MY.A0L(A032);
            }
            str = "contactManager";
        } else {
            str = "waContactNames";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A00(UserJid userJid, StatusConfirmMuteDialogFragment statusConfirmMuteDialogFragment) {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("statusesfragment/mute status for ");
        UserJid userJid2 = userJid;
        C17900vP.A0b(userJid, A10);
        StatusConfirmMuteDialogFragment statusConfirmMuteDialogFragment2 = statusConfirmMuteDialogFragment;
        AnonymousClass00H r0 = statusConfirmMuteDialogFragment.A04;
        if (r0 != null) {
            C55092fC r4 = (C55092fC) ((C58772lE) r0.get()).A08.get();
            r4.A03.CGF(new C70753Cj(r4, userJid2, 8, C18020vd.A05(C18040vf.A02, r4.A01, 2070), true));
            Bundle A15 = statusConfirmMuteDialogFragment.A15();
            C32741hg r6 = statusConfirmMuteDialogFragment.A02;
            if (r6 != null) {
                String string = A15.getString("message_id");
                Long valueOf = Long.valueOf(A15.getLong("status_item_index"));
                String string2 = A15.getString("psa_campaign_id");
                r6.A0F.CGF(new AnonymousClass7QR(userJid2, r6, valueOf, A15.getString("psa_campaign_ids"), string2, string, 1, A15.getBoolean("is_message_sampled")));
                statusConfirmMuteDialogFragment2.A28();
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
        C34611km r1;
        super.A1z(bundle);
        try {
            AnonymousClass1FL A1B = A1B();
            if (!(A1B instanceof C34611km) || (r1 = (C34611km) A1B) == null) {
                Fragment A19 = A19();
                C18070vi.A0z(A19, "null cannot be cast to non-null type com.whatsapp.status.StatusConfirmMuteDialogFragment.Host");
                r1 = (C34611km) A19;
            }
            this.A05 = r1;
        } catch (ClassCastException unused) {
            throw new ClassCastException("Calling fragment must implement Host interface");
        }
    }
}
