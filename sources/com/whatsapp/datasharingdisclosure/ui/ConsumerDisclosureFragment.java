package com.whatsapp.datasharingdisclosure.ui;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1BI;
import X.AnonymousClass1FL;
import X.AnonymousClass3MW;
import X.AnonymousClass4QI;
import X.C18070vi;
import X.C18100vl;
import X.C88654aI;
import X.C99154sM;
import android.content.DialogInterface;
import com.whatsapp.jid.UserJid;

public final class ConsumerDisclosureFragment extends Hilt_ConsumerDisclosureFragment {
    public UserJid A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public final AnonymousClass1BI A05;
    public final Boolean A06;
    public final Integer A07;
    public final Integer A08;
    public final C18100vl A09;
    public final boolean A0A;

    public ConsumerDisclosureFragment() {
        this((AnonymousClass1BI) null, (Boolean) null, (Integer) null, (Integer) null, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1z(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 5
            java.lang.Integer[] r3 = X.AnonymousClass00R.A00(r0)
            android.os.Bundle r2 = r8.A06
            r1 = 0
            if (r2 == 0) goto L_0x0010
            java.lang.String r0 = "blocking_key"
            int r1 = r2.getInt(r0, r1)
        L_0x0010:
            r1 = r3[r1]
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r8.A0C = r1
            android.os.Bundle r3 = r8.A06
            r2 = 0
            if (r3 == 0) goto L_0x002c
            java.lang.String r1 = "jid"
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            java.lang.Object r1 = X.C24141Ja.A00(r3, r0, r1)
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x002c
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r2 = r1
        L_0x002c:
            r8.A00 = r2
            java.lang.Integer r0 = r8.A2K()
            java.lang.Integer r7 = X.AnonymousClass00R.A0C
            if (r0 == r7) goto L_0x0071
            java.lang.Integer r1 = r8.A2K()
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x0071
            X.00H r0 = r8.A02
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r0 = r0.get()
            X.4Zz r0 = (X.C88504Zz) r0
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0071
            r0 = 2131233260(0x7f0809ec, float:1.8082652E38)
            r8.A02 = r0
            r0 = 1118568448(0x42ac0000, float:86.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r8.A09 = r0
            r0 = 0
            r8.A0B = r0
            r0 = 2131889483(0x7f120d4b, float:1.941363E38)
            r8.A01 = r0
            r0 = 2131233270(0x7f0809f6, float:1.8082673E38)
            r8.A00 = r0
            r0 = 2131101304(0x7f060678, float:1.7815014E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A0A = r0
        L_0x0071:
            if (r9 != 0) goto L_0x00c7
            X.00H r0 = r8.A04
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r6 = r0.get()
            X.4QI r6 = (X.AnonymousClass4QI) r6
            java.lang.Integer r5 = r8.A2K()
            java.lang.Integer r4 = r8.A08
            java.lang.Integer r3 = r8.A07
            r2 = 0
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r5 == r0) goto L_0x0093
            X.18K r1 = r6.A00
            X.3zM r0 = r6.A00(r5, r4, r3, r2)
            r1.CC7(r0)
        L_0x0093:
            java.lang.Integer r0 = r8.A2K()
            java.lang.Integer r5 = X.AnonymousClass00R.A00
            if (r0 != r5) goto L_0x00cb
            X.00H r0 = r8.A03
            if (r0 == 0) goto L_0x00ee
            X.4aI r4 = X.AnonymousClass3MW.A0b(r0)
            com.whatsapp.jid.UserJid r3 = r8.A00
            boolean r0 = X.C18020vd.A04(r4)
            if (r0 == 0) goto L_0x00b2
            r2 = 0
            r1 = 29
        L_0x00ae:
            r0 = 1
            X.C88654aI.A03(r4, r3, r2, r1, r0)
        L_0x00b2:
            java.lang.Integer r1 = r8.A2K()
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            if (r1 == r0) goto L_0x00c7
            X.00H r0 = r8.A01
            if (r0 == 0) goto L_0x00e5
            java.lang.Object r0 = r0.get()
            X.6pP r0 = (X.C133736pP) r0
            r0.A00(r5)
        L_0x00c7:
            super.A1z(r9)
            return
        L_0x00cb:
            java.lang.Integer r0 = r8.A2K()
            if (r0 != r7) goto L_0x00b2
            X.00H r0 = r8.A03
            if (r0 == 0) goto L_0x00ee
            X.4aI r4 = X.AnonymousClass3MW.A0b(r0)
            com.whatsapp.jid.UserJid r3 = r8.A00
            boolean r0 = X.C18020vd.A04(r4)
            if (r0 == 0) goto L_0x00b2
            r2 = 0
            r1 = 39
            goto L_0x00ae
        L_0x00e5:
            java.lang.String r0 = "consumerDisclosureCooldownManager"
            goto L_0x00f0
        L_0x00e8:
            java.lang.String r0 = "dataSharingCtwaDisclosureLogger"
            goto L_0x00f0
        L_0x00eb:
            java.lang.String r0 = "consumerDisclosureManager"
            goto L_0x00f0
        L_0x00ee:
            java.lang.String r0 = "ctwaCustomerLoggingController"
        L_0x00f0:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureFragment.A1z(android.os.Bundle):void");
    }

    public boolean A2J() {
        String str;
        if (A2K() != AnonymousClass00R.A0C) {
            return false;
        }
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            AnonymousClass4QI r5 = (AnonymousClass4QI) r0.get();
            r5.A00.CC7(r5.A00(A2K(), this.A08, this.A07, 4));
            if (!this.A0A) {
                return false;
            }
            AnonymousClass1FL A1B = A1B();
            if (A1B != null) {
                A1B.onBackPressed();
            }
            AnonymousClass00H r02 = this.A03;
            if (r02 != null) {
                AnonymousClass3MW.A0b(r02).A05(this.A00);
                return true;
            }
            str = "ctwaCustomerLoggingController";
        } else {
            str = "dataSharingCtwaDisclosureLogger";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onCancel(DialogInterface dialogInterface) {
        String str;
        C18070vi.A0d(dialogInterface, 0);
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            AnonymousClass4QI r5 = (AnonymousClass4QI) r0.get();
            Integer A2K = A2K();
            Integer num = this.A08;
            Integer num2 = this.A07;
            if (A2K != AnonymousClass00R.A01) {
                r5.A00.CC7(r5.A00(A2K, num, num2, 5));
            }
            if (A2K() == AnonymousClass00R.A00) {
                AnonymousClass00H r02 = this.A03;
                if (r02 != null) {
                    C88654aI.A03(AnonymousClass3MW.A0b(r02), this.A00, (String) null, 1, true);
                    return;
                }
            } else if (A2K() == AnonymousClass00R.A0C) {
                AnonymousClass00H r03 = this.A03;
                if (r03 != null) {
                    AnonymousClass3MW.A0b(r03).A05(this.A00);
                    return;
                }
            } else {
                return;
            }
            str = "ctwaCustomerLoggingController";
        } else {
            str = "dataSharingCtwaDisclosureLogger";
        }
        C18070vi.A11(str);
        throw null;
    }

    public ConsumerDisclosureFragment(AnonymousClass1BI r2, Boolean bool, Integer num, Integer num2, boolean z) {
        this.A05 = r2;
        this.A06 = bool;
        this.A08 = num;
        this.A07 = num2;
        this.A0A = z;
        this.A09 = C99154sM.A01(this, 3);
    }
}
