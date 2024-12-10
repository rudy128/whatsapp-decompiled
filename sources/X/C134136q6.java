package X;

import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import com.whatsapp.spamreport.ReportSpamDialogFragment;

/* renamed from: X.6q6  reason: invalid class name and case insensitive filesystem */
public final class C134136q6 {
    public int A00 = 1;
    public UserJid A01;
    public AnonymousClass205 A02;
    public C1602987x A03;
    public boolean A04;
    public boolean A05;
    public boolean A06 = true;
    public boolean A07 = true;
    public boolean A08 = true;
    public boolean A09 = true;
    public final C18030ve A0A;
    public final AnonymousClass1BI A0B;
    public final String A0C;
    public final boolean A0D;

    public C134136q6(C18030ve r2, AnonymousClass1BI r3, String str, boolean z) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0k(r3, str);
        this.A0B = r3;
        this.A0C = str;
        this.A0A = r2;
        this.A0D = z;
    }

    public final void A01(C46162Dk r3) {
        C18070vi.A0d(r3, 0);
        this.A09 = false;
        this.A07 = AnonymousClass000.A1Z(r3.A02, C179509Ig.SUBSCRIBED);
        this.A00 = 2;
    }

    public final ReportSpamDialogFragment A00() {
        C18030ve r5 = this.A0A;
        C18040vf r4 = C18040vf.A02;
        if (C18020vd.A05(r4, r5, 6187)) {
            AnonymousClass1BI r1 = this.A0B;
            if (C22971Dz.A0d(r1) || C22971Dz.A0a(r1)) {
                this.A08 = false;
                this.A06 = false;
            }
        }
        if (C18020vd.A05(r4, r5, 6185)) {
            AnonymousClass1BI r12 = this.A0B;
            if (C22971Dz.A0d(r12) || C22971Dz.A0a(r12)) {
                this.A07 = true;
                this.A09 = false;
            }
        }
        AnonymousClass1BI r13 = this.A0B;
        String str = this.A0C;
        boolean z = this.A0D;
        int i = this.A00;
        boolean z2 = this.A09;
        boolean z3 = this.A06;
        boolean z4 = this.A08;
        boolean z5 = this.A07;
        boolean z6 = this.A05;
        AnonymousClass205 r7 = this.A02;
        C1602987x r6 = this.A03;
        boolean z7 = this.A04;
        ReportSpamDialogFragment reportSpamDialogFragment = new ReportSpamDialogFragment();
        Bundle A0D2 = C17880vN.A0D();
        AnonymousClass3MY.A15(A0D2, r13, "jid");
        A0D2.putString("senderJid", C72463Mc.A0n(this.A01));
        A0D2.putString("flow", str);
        A0D2.putBoolean("hasLoggedInPairedDevices", z);
        A0D2.putInt("upsellAction", i);
        A0D2.putBoolean("upsellCheckboxActionDefault", z2);
        A0D2.putBoolean("shouldDeleteChatOnBlock", z3);
        A0D2.putBoolean("shouldOpenHomeScreenAction", z4);
        A0D2.putBoolean("shouldDisplayUpsellCheckbox", z5);
        A0D2.putBoolean("notifyObservableDialogHost", z6);
        A0D2.putBoolean("isUgc", z7);
        if (r7 != null) {
            AnonymousClass4aU.A0A(A0D2, r7);
        }
        reportSpamDialogFragment.A0D = r6;
        reportSpamDialogFragment.A1R(A0D2);
        return reportSpamDialogFragment;
    }
}
