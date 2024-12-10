package com.whatsapp.community;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1FU;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass4b4;
import X.C010105w;
import X.C136876uY;
import X.C17960vV;
import X.C18070vi;
import X.C61562pt;
import X.C72463Mc;
import X.C72473Md;
import X.C73203Rj;
import X.C88874ay;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class CommunitySpamReportDialogFragment extends Hilt_CommunitySpamReportDialogFragment {
    public AnonymousClass1KB A00;
    public AnonymousClass1M9 A01;
    public C136876uY A02;
    public AnonymousClass10I A03;
    public AnonymousClass00H A04;

    public Dialog A27(Bundle bundle) {
        AnonymousClass1FU r8 = (AnonymousClass1FU) A1B();
        AnonymousClass1BI A0f = C72463Mc.A0f(A15(), "jid");
        C17960vV.A07(A0f);
        String string = A15().getString("spamFlow");
        AnonymousClass1E7 A0H = this.A01.A0H(A0f);
        boolean A17 = C18070vi.A17(string, A0f);
        C61562pt.A00((C61562pt) this.A04.get(), A0f, string, 0);
        View A0D = AnonymousClass3MY.A0D(LayoutInflater.from(A1n()), 2131625098);
        TextView A0J = AnonymousClass3MW.A0J(A0D, 2131434556);
        CheckBox checkBox = (CheckBox) AnonymousClass1HF.A06(A0D, 2131428208);
        C17960vV.A07(r8);
        C73203Rj A002 = AnonymousClass4a6.A00(r8);
        A002.A0c(A0D);
        A002.A0E(2131895180);
        A0J.setText(2131895239);
        boolean z = A15().getBoolean("shouldUpsellExit");
        if (z) {
            View findViewById = A0D.findViewById(2131428209);
            C17960vV.A05(findViewById);
            ((TextView) findViewById).setText(2131895240);
        } else {
            C72463Mc.A13(A0D, 2131428217);
        }
        A002.setPositiveButton(2131895214, new AnonymousClass4b4(checkBox, r8, this, A0H, string, z));
        C010105w A0N = AnonymousClass3MX.A0N(new C88874ay(this, A0f, string, 0), A002, 2131898766);
        A0N.setCanceledOnTouchOutside(A17);
        return A0N;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.whatsapp.community.CommunitySpamReportDialogFragment, androidx.fragment.app.Fragment, com.whatsapp.community.Hilt_CommunitySpamReportDialogFragment] */
    public static CommunitySpamReportDialogFragment A00(AnonymousClass1EC r3, boolean z) {
        Bundle A0H = C72473Md.A0H(r3);
        A0H.putString("spamFlow", "community_home");
        A0H.putBoolean("shouldUpsellExit", z);
        ? hilt_CommunitySpamReportDialogFragment = new Hilt_CommunitySpamReportDialogFragment();
        hilt_CommunitySpamReportDialogFragment.A1R(A0H);
        return hilt_CommunitySpamReportDialogFragment;
    }

    public void onCancel(DialogInterface dialogInterface) {
        String string = A15().getString("spamFlow");
        AnonymousClass1BI A0f = C72463Mc.A0f(A15(), "jid");
        C17960vV.A07(A0f);
        C18070vi.A0h(string, A0f);
        C61562pt.A00((C61562pt) this.A04.get(), A0f, string, 2);
    }
}
