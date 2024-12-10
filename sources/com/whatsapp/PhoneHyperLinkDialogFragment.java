package com.whatsapp;

import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass12E;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1VP;
import X.AnonymousClass733;
import X.C131906lr;
import X.C17880vN;
import X.C194859sP;
import X.C36361nl;
import X.C36451nu;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;

public class PhoneHyperLinkDialogFragment extends Hilt_PhoneHyperLinkDialogFragment {
    public AnonymousClass1L9 A00;
    public AnonymousClass1KB A01;
    public C36361nl A02;
    public AnonymousClass11S A03;
    public AnonymousClass1VP A04;
    public AnonymousClass1M9 A05;
    public AnonymousClass733 A06;
    public AnonymousClass12E A07;
    public C131906lr A08;
    public AnonymousClass1LU A09;
    public UserJid A0A;
    public C36451nu A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.PhoneHyperLinkDialogFragment, androidx.fragment.app.Fragment, com.whatsapp.Hilt_PhoneHyperLinkDialogFragment] */
    public static PhoneHyperLinkDialogFragment A00(UserJid userJid, String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        ? hilt_PhoneHyperLinkDialogFragment = new Hilt_PhoneHyperLinkDialogFragment();
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putBoolean("isSyncFailure", z);
        A0D2.putBoolean("isWAAccount", z2);
        A0D2.putBoolean("isPhoneNumberOwner", z3);
        A0D2.putBoolean("isCallAllowed", z4);
        A0D2.putString("phoneNumber", str);
        A0D2.putParcelable("jid", userJid);
        A0D2.putString("url", str2);
        A0D2.putInt("groupSize", i);
        hilt_PhoneHyperLinkDialogFragment.A1R(A0D2);
        return hilt_PhoneHyperLinkDialogFragment;
    }

    public void A1w(int i, int i2, Intent intent) {
        if (i == 1000) {
            this.A07.A0D((Integer) null);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        ((C194859sP) this.A0C.get()).A02(16, (Integer) null, 8);
        this.A08.A00(Boolean.valueOf(this.A0H), Boolean.valueOf(this.A0I), 8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A27(android.os.Bundle r9) {
        /*
            r8 = this;
            android.os.Bundle r2 = r8.A15()
            java.lang.String r0 = "isSyncFailure"
            boolean r0 = r2.getBoolean(r0)
            r8.A0J = r0
            java.lang.String r0 = "isWAAccount"
            boolean r0 = r2.getBoolean(r0)
            r8.A0I = r0
            java.lang.String r0 = "isCallAllowed"
            boolean r0 = r2.getBoolean(r0)
            r8.A0G = r0
            java.lang.String r0 = "isPhoneNumberOwner"
            boolean r0 = r2.getBoolean(r0)
            r8.A0H = r0
            X.0vb r1 = r8.A01
            java.lang.String r0 = "phoneNumber"
            java.lang.String r0 = X.C108955ca.A0s(r2, r0)
            java.lang.String r0 = r1.A0G(r0)
            r8.A0E = r0
            java.lang.String r0 = "jid"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r8.A0A = r0
            java.lang.String r0 = "groupSize"
            int r6 = r2.getInt(r0)
            java.lang.String r0 = "url"
            java.lang.String r0 = X.C108955ca.A0s(r2, r0)
            r8.A0F = r0
            X.00H r0 = r8.A0C
            java.lang.Object r3 = r0.get()
            X.9sP r3 = (X.C194859sP) r3
            r3.A00()
            r1 = 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2 = 0
            r3.A02(r2, r0, r1)
            X.3Rj r5 = X.AnonymousClass4a6.A03(r8)
            android.view.LayoutInflater r1 = r8.A16()
            r0 = 2131626452(0x7f0e09d4, float:1.888014E38)
            android.view.View r2 = r1.inflate(r0, r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            boolean r0 = r8.A0J
            if (r0 != 0) goto L_0x0083
            boolean r1 = r8.A0I
            r0 = 2131894515(0x7f1220f3, float:1.9423837E38)
            if (r1 == 0) goto L_0x007d
            r0 = 2131894516(0x7f1220f4, float:1.9423839E38)
        L_0x007d:
            r2.setText(r0)
            r5.A0R(r2)
        L_0x0083:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            boolean r0 = r8.A0I
            r3 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0111
            r2 = 2131888253(0x7f12087d, float:1.9411136E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = r8.A0E
            java.lang.String r1 = X.AnonymousClass3MX.A16(r8, r0, r1, r3, r2)
            X.9jx r0 = new X.9jx
            r0.<init>(r1, r7)
            r4.add(r0)
            X.11S r1 = r8.A03
            com.whatsapp.jid.UserJid r0 = r8.A0A
            boolean r0 = r1.A0O(r0)
            if (r0 != 0) goto L_0x00ba
            r0 = 2131887812(0x7f1206c4, float:1.9410242E38)
            java.lang.String r2 = r8.A1H(r0)
            r1 = 4
        L_0x00b2:
            X.9jx r0 = new X.9jx
            r0.<init>(r2, r1)
            r4.add(r0)
        L_0x00ba:
            X.11S r0 = r8.A03
            boolean r0 = r0.A0N()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00d4
            r0 = 2131886515(0x7f1201b3, float:1.9407611E38)
            java.lang.String r2 = r8.A1H(r0)
            r1 = 3
            X.9jx r0 = new X.9jx
            r0.<init>(r2, r1)
            r4.add(r0)
        L_0x00d4:
            boolean r0 = r8.A0J
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r8.A0I
            if (r0 != 0) goto L_0x00f8
            X.0ve r2 = r8.A02
            r1 = 11612(0x2d5c, float:1.6272E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            if (r0 != r7) goto L_0x00f8
            r0 = 2131888815(0x7f120aaf, float:1.9412276E38)
            java.lang.String r2 = r8.A1H(r0)
            r1 = 5
            X.9jx r0 = new X.9jx
            r0.<init>(r2, r1)
            r4.add(r0)
        L_0x00f8:
            android.content.Context r2 = r8.A14()
            r0 = 2131626451(0x7f0e09d3, float:1.8880139E38)
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r1.<init>(r2, r0, r4)
            X.A9a r0 = new X.A9a
            r0.<init>(r8, r6, r3, r4)
            r5.A0H(r0, r1)
            X.05w r0 = r5.create()
            return r0
        L_0x0111:
            r2 = 2131889402(0x7f120cfa, float:1.9413467E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = r8.A0E
            java.lang.String r2 = X.AnonymousClass3MX.A16(r8, r0, r1, r3, r2)
            r1 = 2
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.PhoneHyperLinkDialogFragment.A27(android.os.Bundle):android.app.Dialog");
    }
}
