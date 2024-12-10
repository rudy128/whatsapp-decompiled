package com.whatsapp.payments.ui;

import X.A0B;
import X.A0S;
import X.A27;
import X.A7B;
import X.A7U;
import X.A8e;
import X.AFO;
import X.AGC;
import X.AXS;
import X.AZ6;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1KI;
import X.AnonymousClass1L9;
import X.AnonymousClass1OZ;
import X.AnonymousClass1QE;
import X.AnonymousClass1QL;
import X.AnonymousClass1QS;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4VT;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass8Hc;
import X.AnonymousClass8pN;
import X.AnonymousClass8pS;
import X.AnonymousClass91T;
import X.AnonymousClass91U;
import X.AnonymousClass9RP;
import X.AnonymousClass9YO;
import X.BBB;
import X.C000200d;
import X.C003401n;
import X.C137116uw;
import X.C171858sO;
import X.C175778zG;
import X.C176018ze;
import X.C1764594h;
import X.C17880vN;
import X.C17900vP;
import X.C17960vV;
import X.C18030ve;
import X.C186089dd;
import X.C188089gr;
import X.C189689je;
import X.C190239kb;
import X.C196259ui;
import X.C19967A1c;
import X.C19997A2l;
import X.C20112A7u;
import X.C20752AXh;
import X.C20840AaI;
import X.C221618v;
import X.C22454B8m;
import X.C26302CxJ;
import X.C30931ek;
import X.C31061ex;
import X.C33391ik;
import X.C33661jB;
import X.C33711jG;
import X.C40501uo;
import X.C63662tU;
import X.C63932tv;
import X.C86284Ra;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class IndiaUpiBankAccountPickerActivity extends AnonymousClass91T implements C33661jB, BBB, C22454B8m {
    public int A00;
    public int A01;
    public RecyclerView A02;
    public AnonymousClass1KI A03;
    public C20752AXh A04;
    public AnonymousClass8pS A05;
    public C33391ik A06;
    public C196259ui A07;
    public A27 A08;
    public A0B A09;
    public C1764594h A0A;
    public C189689je A0B;
    public C19997A2l A0C;
    public C30931ek A0D;
    public AnonymousClass4VT A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public String A0H;
    public List A0I;
    public boolean A0J;
    public View A0K;
    public View A0L;
    public View A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public ImageView A0Q;
    public TextView A0R;
    public TextView A0S;
    public A0S A0T;
    public C175778zG A0U;
    public ArrayList A0V;
    public boolean A0W;
    public boolean A0X;
    public final AnonymousClass1QE A0Y;
    public final C171858sO A0Z;

    public void BrM(A7B a7b) {
    }

    private void A03(AnonymousClass8pN r4) {
        AnonymousClass1QE r2 = this.A0Y;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("showSuccessAndFinish: ");
        AnonymousClass8BV.A1E(r2, this.A07.toString(), A10);
        A4p();
        this.A0A = r4;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("Is first payment method:");
        A102.append(this.A0m);
        A102.append(", entry point:");
        C17900vP.A0o(A102, this.A02);
        A4x("nav_select_account");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r1 != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0Q(com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity r9) {
        /*
            int r0 = r9.A01
            if (r0 >= 0) goto L_0x000a
            java.lang.String r0 = "selected account position is invalid"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x000a:
            X.94h r0 = r9.A0A
            java.lang.String r1 = "bankAccountAddClicked"
            X.19a r0 = r0.A00
            r0.A08(r1)
            android.view.View r1 = r9.A0K
            r0 = 8
            r1.setVisibility(r0)
            r2 = 1
            r9.A0J = r2
            androidx.recyclerview.widget.RecyclerView r0 = r9.A02
            X.1rD r0 = r0.A0B
            if (r0 == 0) goto L_0x0026
            r0.notifyDataSetChanged()
        L_0x0026:
            X.A6g r1 = r9.A0O
            java.util.List r0 = r9.A0j
            boolean r4 = r1.A0B(r0)
            X.A6g r0 = r9.A0O
            java.lang.String r3 = r9.A0b
            boolean r1 = X.AnonymousClass8BR.A1P(r9)
            if (r3 == 0) goto L_0x0040
            java.util.Set r0 = r0.A04
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0092
        L_0x0040:
            if (r1 == 0) goto L_0x0044
            if (r4 != 0) goto L_0x0092
        L_0x0044:
            r6 = 1
        L_0x0045:
            java.lang.String r0 = r9.A0b
            boolean r1 = X.AnonymousClass8BR.A1P(r9)
            boolean r0 = X.C20063A5m.A03(r0)
            if (r0 == 0) goto L_0x0054
            r8 = 1
            if (r1 == 0) goto L_0x0055
        L_0x0054:
            r8 = 0
        L_0x0055:
            X.8zG r3 = r9.A0U
            java.util.ArrayList r1 = r9.A0V
            int r0 = r9.A01
            java.lang.Object r4 = r1.get(r0)
            X.8pS r4 = (X.AnonymousClass8pS) r4
            r0 = 0
            X.AZb r5 = new X.AZb
            r5.<init>(r9, r0)
            r7 = r6
            r3.A00(r4, r5, r6, r7, r8)
            X.AZ6 r0 = r9.A0S
            r0.COK()
            X.8sO r1 = r9.A0Z
            int r0 = r9.A01
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r1.A0G = r0
            java.lang.Integer r0 = X.C17880vN.A0l()
            r1.A07 = r0
            java.lang.String r0 = "nav_select_account"
            r1.A0b = r0
            java.lang.String r0 = r9.A0c
            r1.A0Y = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A08 = r0
            X.AZ6.A02(r1, r9)
            return
        L_0x0092:
            r6 = 0
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity.A0Q(com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity):void");
    }

    public static void A0V(IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity, C19967A1c a1c, boolean z) {
        int i = a1c.A00;
        indiaUpiBankAccountPickerActivity.A0Y.A06(AnonymousClass001.A1I("showSuccessAndFinish: resId ", AnonymousClass000.A10(), i));
        indiaUpiBankAccountPickerActivity.A4p();
        if (i == 0) {
            i = 2131894057;
            String str = indiaUpiBankAccountPickerActivity.A07.A04;
            if ("upi-register-vpa".equalsIgnoreCase(str)) {
                i = 2131893860;
            }
            if ("upi-get-accounts".equalsIgnoreCase(str)) {
                i = 2131890762;
            }
        }
        if (indiaUpiBankAccountPickerActivity.A0l || z) {
            indiaUpiBankAccountPickerActivity.A4o();
            Intent A1H = AnonymousClass91U.A1H(indiaUpiBankAccountPickerActivity, a1c);
            A1H.putExtra("error", i);
            A1H.putExtra("error_type", indiaUpiBankAccountPickerActivity.A00);
            int i2 = indiaUpiBankAccountPickerActivity.A00;
            if (i2 >= 1 && i2 <= 6) {
                A1H.putExtra("extra_bank_account", indiaUpiBankAccountPickerActivity.A05);
            }
            if (!indiaUpiBankAccountPickerActivity.A0l) {
                A1H.putExtra("try_again", 1);
            }
            if (indiaUpiBankAccountPickerActivity.A00 == 1) {
                A1H.putExtra("extra_error_screen_name", "bank_account_not_found");
                A1H.putExtra("extra_referral_screen", "device_binding");
            }
            A1H.addFlags(335544320);
            indiaUpiBankAccountPickerActivity.A4v(A1H);
            A1H.putExtra("extra_previous_screen", "nav_select_account");
            indiaUpiBankAccountPickerActivity.A3q(A1H, true);
        } else {
            indiaUpiBankAccountPickerActivity.BhQ(i);
        }
        indiaUpiBankAccountPickerActivity.A0A.A00.A0C(3);
    }

    public static void A0c(IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity, Integer num) {
        C171858sO r1 = indiaUpiBankAccountPickerActivity.A0Z;
        r1.A0b = "nav_select_account";
        r1.A0Y = indiaUpiBankAccountPickerActivity.A0c;
        r1.A08 = C17880vN.A0h();
        r1.A07 = num;
        AZ6.A02(r1, indiaUpiBankAccountPickerActivity);
    }

    public void A2y() {
        if (!this.A0W) {
            this.A0W = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r3 = A002.AAQ;
            C63932tv.A02(r3, this);
            AnonymousClass10G r1 = r3.A00;
            C63932tv.A01(r3, r1, this);
            C63662tU.A00(r3, r1, this, r1.A5A);
            AnonymousClass91U.A1V(r3, r1, this);
            AnonymousClass91U.A1Q(A002, r3, r1, this, r3.A7z);
            AnonymousClass91U.A1P(A002, r3, r1, AnonymousClass8BU.A0E(r3), this);
            AnonymousClass91U.A1Y(r3, this);
            AnonymousClass91U.A1W(r3, r1, this);
            this.A0D = AnonymousClass8BT.A0V(r3);
            this.A09 = r3.AGY();
            this.A04 = AnonymousClass8BU.A0M(r1);
            this.A03 = AnonymousClass8BT.A0I(r3);
            this.A08 = AnonymousClass8BU.A0S(r3);
            this.A06 = (C33391ik) r3.Acb.get();
            this.A0C = r3.AHJ();
            this.A0A = (C1764594h) r1.ACM.get();
            this.A0G = C000200d.A00(A002.A5G);
        }
    }

    public void A50() {
        ArrayList arrayList = this.A0V;
        if (arrayList == null || arrayList.size() == 0) {
            this.A0Q.setVisibility(0);
            this.A0R.setVisibility(8);
            this.A0M.setVisibility(4);
            this.A0O.setVisibility(0);
            this.A02.setVisibility(8);
            this.A0K.setVisibility(8);
            this.A0L.setVisibility(8);
            this.A0P.setVisibility(0);
            this.A0N.setVisibility(8);
            this.A0Q.setImageDrawable(getResources().getDrawable(2131233650));
            this.A0S.setText(2131886362);
            this.A0T.A00(this.A05, this.A09.A01(), this.A0O.A07(this.A0b));
        } else {
            this.A0Z.A0H = C17880vN.A0n(arrayList.size());
            this.A0I = AnonymousClass000.A13();
            this.A01 = -1;
            this.A0J = false;
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.A0V;
                if (i >= arrayList2.size()) {
                    break;
                }
                AnonymousClass8pS r7 = (AnonymousClass8pS) arrayList2.get(i);
                String A042 = A8e.A04((String) AnonymousClass8BT.A0q(r7.A02));
                this.A0I.add(new C188089gr((String) AnonymousClass8BT.A0q(r7.A02), A042, (String) AnonymousClass8BT.A0q(r7.A01), getString(r7.A0C()), r7.A0A, r7.A0I));
                i++;
            }
            this.A0M.setVisibility(0);
            this.A0O.setVisibility(8);
            this.A02.setVisibility(0);
            int i2 = 0;
            while (true) {
                if (i2 >= this.A0I.size()) {
                    break;
                }
                C188089gr r1 = (C188089gr) this.A0I.get(i2);
                if (this.A01 == -1 && !r1.A06) {
                    this.A01 = i2;
                    r1.A00 = true;
                    break;
                }
                i2++;
            }
            this.A0Q.setVisibility(0);
            this.A0P.setVisibility(0);
            this.A0K.setVisibility(0);
            this.A0L.setVisibility(0);
            this.A0N.setVisibility(0);
            this.A0Q.setImageDrawable(C40501uo.A00((Resources.Theme) null, getResources(), 2131233637));
            int size = this.A0V.size();
            TextView textView = this.A0S;
            if (size == 1) {
                textView.setText(2131893797);
                this.A0R.setVisibility(8);
            } else {
                textView.setText(2131893794);
                this.A0R.setText(2131893793);
                this.A0R.setVisibility(0);
            }
            if (this.A01 == -1) {
                this.A0K.setEnabled(false);
                this.A0L.setVisibility(4);
            } else {
                this.A0L.setVisibility(0);
                this.A0K.setEnabled(true);
                AFO.A00(this.A0K, this, 42);
            }
            List list = this.A0I;
            if (list != null) {
                this.A02.setAdapter(new AnonymousClass8Hc(new AnonymousClass9YO(this), this, list));
                this.A0A.A00.A08("bankAccountPickerShown");
            }
        }
        invalidateOptionsMenu();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ad, code lost:
        if (r1 != false) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BmP(X.A7B r10, java.util.ArrayList r11) {
        /*
            r9 = this;
            X.1QE r4 = r9.A0Y
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "onBankAccountsList: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " error: "
            X.AnonymousClass8BX.A1D(r4, r10, r0, r1)
            java.lang.String r0 = X.AXS.A02(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x018c
            java.lang.String r0 = X.AXS.A02(r9)
        L_0x0021:
            X.AZ6 r1 = r9.A0S
            r1.A0D(r0)
            r0 = 18
            X.8sO r2 = r1.A05(r10, r0)
            X.8pS r0 = r9.A05
            java.lang.String r0 = r0.A0B
            r2.A0O = r0
            if (r11 != 0) goto L_0x0180
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            r2.A01 = r0
            r0 = 0
        L_0x003c:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0H = r0
            java.lang.String r0 = "nav_select_account"
            r2.A0b = r0
            java.lang.String r0 = r9.A0c
            r2.A0Y = r0
            X.AZ6.A02(r2, r9)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "logGetAccounts: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
            r4.A04(r0)
            r2 = 0
            r3 = 1
            if (r11 == 0) goto L_0x00c5
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x00c5
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "extra_accounts_list"
            r1.putParcelableArrayListExtra(r0, r11)
            r9.A0V = r11
            int r0 = r11.size()
            if (r0 != r3) goto L_0x0196
            java.lang.Object r0 = r11.get(r2)
            X.8pS r0 = (X.AnonymousClass8pS) r0
            boolean r0 = r0.A0I
            if (r0 != 0) goto L_0x0196
            r9.A0X = r3
            X.A6g r1 = r9.A0O
            java.util.List r0 = r9.A0j
            boolean r4 = r1.A0B(r0)
            X.A6g r0 = r9.A0O
            java.lang.String r3 = r9.A0b
            boolean r1 = X.AnonymousClass8BR.A1P(r9)
            if (r3 == 0) goto L_0x009b
            java.util.Set r0 = r0.A04
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x00c3
        L_0x009b:
            if (r1 == 0) goto L_0x009f
            if (r4 != 0) goto L_0x00c3
        L_0x009f:
            r4 = 1
        L_0x00a0:
            java.lang.String r0 = r9.A0b
            boolean r1 = X.AnonymousClass8BR.A1P(r9)
            boolean r0 = X.C20063A5m.A03(r0)
            if (r0 == 0) goto L_0x00af
            r6 = 1
            if (r1 == 0) goto L_0x00b0
        L_0x00af:
            r6 = 0
        L_0x00b0:
            X.8zG r1 = r9.A0U
            java.lang.Object r2 = r11.get(r2)
            X.8pS r2 = (X.AnonymousClass8pS) r2
            r0 = 1
            X.AZb r3 = new X.AZb
            r3.<init>(r9, r0)
            r5 = r4
            r1.A00(r2, r3, r4, r5, r6)
        L_0x00c2:
            return
        L_0x00c3:
            r4 = 0
            goto L_0x00a0
        L_0x00c5:
            r8 = 11473(0x2cd1, float:1.6077E-41)
            if (r11 == 0) goto L_0x00eb
            r9.A00 = r3
            X.A7B r4 = new X.A7B
            r4.<init>((int) r8)
            r0 = 2131890762(0x7f12124a, float:1.9416225E38)
            r2 = 2131890762(0x7f12124a, float:1.9416225E38)
            java.lang.String r1 = r9.getString(r0)
            X.8pS r0 = r9.A05
            boolean r0 = r9.A4z(r0, r4, r1)
            if (r0 != 0) goto L_0x00c2
            X.A1c r5 = new X.A1c
            r5.<init>(r2)
        L_0x00e7:
            A0V(r9, r5, r3)
            return
        L_0x00eb:
            if (r10 == 0) goto L_0x00c2
            int r0 = r10.A00
            java.lang.String r6 = "upi-get-accounts"
            boolean r0 = X.C20752AXh.A01(r9, r6, r0, r3)
            if (r0 != 0) goto L_0x00c2
            X.A27 r1 = r9.A08
            int r0 = r10.A00
            java.lang.String r7 = r1.A01(r0)
            int r5 = r10.A00
            r0 = 11467(0x2ccb, float:1.6069E-41)
            if (r5 == r0) goto L_0x01a0
            r0 = 11543(0x2d17, float:1.6175E-41)
            if (r5 == r0) goto L_0x01a0
            if (r7 == 0) goto L_0x0121
            r9.A4p()
            X.8pS r0 = r9.A05
            boolean r0 = r9.A4z(r0, r10, r7)
            if (r0 != 0) goto L_0x00c2
            int r1 = r10.A00
            X.A1c r0 = new X.A1c
            r0.<init>(r1, r7)
            A0V(r9, r0, r3)
            return
        L_0x0121:
            if (r5 != r8) goto L_0x012f
            r9.A4p()
            r0 = 2131893803(0x7f121e2b, float:1.9422393E38)
        L_0x0129:
            X.A1c r5 = new X.A1c
            r5.<init>(r0)
            goto L_0x00e7
        L_0x012f:
            r0 = 11485(0x2cdd, float:1.6094E-41)
            if (r5 != r0) goto L_0x013d
            r9.A4p()
            r0 = 5
            r9.A00 = r0
            r0 = 2131893785(0x7f121e19, float:1.9422356E38)
            goto L_0x0129
        L_0x013d:
            r0 = 11487(0x2cdf, float:1.6097E-41)
            if (r5 != r0) goto L_0x014b
            r9.A4p()
            r0 = 6
            r9.A00 = r0
            r0 = 2131893784(0x7f121e18, float:1.9422354E38)
            goto L_0x0129
        L_0x014b:
            X.AXh r1 = r9.A04
            X.9ui r0 = r9.A07
            X.A1c r5 = r1.A02(r0, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "onBankAccountsList failure. showErrorAndFinish: "
            r1.append(r0)
            X.9ui r0 = r9.A07
            java.util.HashMap r0 = r0.A06
            java.lang.Number r0 = X.C108945cZ.A1D(r6, r0)
            int r0 = X.C72463Mc.A0B(r0)
            X.AnonymousClass8BV.A1F(r4, r1, r0)
            int r1 = r5.A00
            r0 = 2131893805(0x7f121e2d, float:1.9422397E38)
            if (r1 == r0) goto L_0x019a
            r0 = 2131893867(0x7f121e6b, float:1.9422523E38)
            if (r1 == r0) goto L_0x019a
            r0 = 2131892931(0x7f121ac3, float:1.9420624E38)
            if (r1 == r0) goto L_0x019a
            r9.A00 = r3
            goto L_0x00e7
        L_0x0180:
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r2.A01 = r0
            long r0 = X.AnonymousClass8BR.A06(r11)
            goto L_0x003c
        L_0x018c:
            X.A7U r1 = r9.A0M
            X.8pS r0 = r9.A05
            java.lang.String r0 = r1.A05(r0)
            goto L_0x0021
        L_0x0196:
            r9.A50()
            return
        L_0x019a:
            r9.A0l = r2
            A0V(r9, r5, r2)
            return
        L_0x01a0:
            r9.A4p()
            X.AXS r2 = r9.A0N
            X.A7U r1 = r9.A0M
            X.8pS r0 = r9.A05
            java.lang.String r0 = r1.A05(r0)
            r2.BIG(r0, r3)
            r1 = 2131893805(0x7f121e2d, float:1.9422397E38)
            X.A1c r0 = new X.A1c
            r0.<init>(r1)
            A0V(r9, r0, r3)
            X.A7U r0 = r9.A0M
            r0.A09()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity.BmP(X.A7B, java.util.ArrayList):void");
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [X.20i, X.2ME] */
    /* JADX WARNING: type inference failed for: r2v8, types: [X.20i, X.2ME] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        if (X.C170278pb.A03((X.AnonymousClass8pS) r0) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r13.A00 != 1383026) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C2m(X.AnonymousClass8pN r12, X.A7B r13) {
        /*
            r11 = this;
            X.1QE r2 = r11.A0Y
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "onRegisterVpa registered: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r12, r0, r1)
            r2.A04(r0)
            X.94h r0 = r11.A0A
            r1 = 3
            if (r13 != 0) goto L_0x0015
            r1 = 2
        L_0x0015:
            X.19a r0 = r0.A00
            r0.A0C(r1)
            r5 = 1383026(0x151a72, float:1.938032E-39)
            r2 = 0
            if (r13 == 0) goto L_0x0025
            int r0 = r13.A00
            r1 = 1
            if (r0 == r5) goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            boolean r0 = r11.A0X
            if (r0 == 0) goto L_0x0039
            if (r12 != 0) goto L_0x0039
            if (r1 != 0) goto L_0x0039
            r11.A0X = r2
            r11.A50()
            java.lang.String r0 = "Auto Add single account failed, falling back to default"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0039:
            X.1QD r0 = r11.A0Q
            android.content.SharedPreferences r0 = r0.A03()
            java.lang.String r4 = "payment_usync_triggered"
            boolean r0 = r0.getBoolean(r4, r2)
            if (r0 != 0) goto L_0x005c
            X.10I r3 = r11.A05
            X.12E r1 = r11.A04
            r1.getClass()
            r0 = 3
            X.C21447AkE.A01(r3, r1, r0)
            X.1QD r0 = r11.A0Q
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r0)
            r0 = 1
            X.C17880vN.A1F(r1, r4, r0)
        L_0x005c:
            if (r12 == 0) goto L_0x00d1
            X.8pb r0 = r12.A08
            if (r0 == 0) goto L_0x006b
            X.8pS r0 = (X.AnonymousClass8pS) r0
            boolean r0 = X.C170278pb.A03(r0)
            r10 = 1
            if (r0 != 0) goto L_0x006c
        L_0x006b:
            r10 = 0
        L_0x006c:
            X.1ik r8 = r11.A06
            com.whatsapp.jid.UserJid r7 = r11.A0I
            r6 = 3
            X.1QD r3 = r8.A03
            android.content.SharedPreferences r2 = r3.A03()
            java.lang.String r1 = "payments_inviter_jids_with_expiry"
            java.lang.String r0 = ""
            java.lang.String r0 = r2.getString(r1, r0)
            java.util.HashMap r0 = X.AnonymousClass1QD.A02(r3, r0)
            java.util.Iterator r9 = X.C17890vO.A0k(r0)
        L_0x0087:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r2 = r9.next()
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            boolean r0 = r2.equals(r7)
            X.C33391ik.A00(r2, r8, r6, r0)
            X.1ij r1 = r8.A07
            X.11P r0 = r8.A00
            long r3 = X.AnonymousClass11P.A01(r0)
            boolean r5 = r2.equals(r7)
            X.1PP r0 = r1.A00
            X.205 r1 = X.C17880vN.A0Z(r2, r0)
            if (r10 == 0) goto L_0x00c1
            r0 = 66
            X.98I r2 = new X.98I
            r2.<init>(r1, r0, r3)
            r2.A00 = r6
            r2.A01 = r5
        L_0x00b9:
            X.121 r1 = r8.A01
            r0 = 16
            r1.BBN(r2, r0)
            goto L_0x0087
        L_0x00c1:
            r0 = 65
            X.98H r2 = new X.98H
            r2.<init>(r1, r0, r3)
            r2.A00 = r6
            r2.A01 = r5
            goto L_0x00b9
        L_0x00cd:
            r11.A03(r12)
            return
        L_0x00d1:
            if (r13 == 0) goto L_0x010b
            int r1 = r13.A00
            r0 = 11472(0x2cd0, float:1.6076E-41)
            if (r1 != r0) goto L_0x00df
            X.1ex r0 = r11.A0N
            r0.A0A(r11)
            return
        L_0x00df:
            r0 = 10756(0x2a04, float:1.5072E-41)
            if (r1 != r0) goto L_0x0100
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiDobPickerActivity> r0 = com.whatsapp.payments.ui.IndiaUpiDobPickerActivity.class
            android.content.Intent r2 = X.AnonymousClass8BR.A07(r11, r0)
            java.util.ArrayList r1 = r11.A0V
            int r0 = r11.A01
            java.lang.Object r0 = r1.get(r0)
            X.8pW r0 = (X.AnonymousClass8pW) r0
            X.77e r1 = r0.A02
            java.lang.String r0 = "bank_account"
            r2.putExtra(r0, r1)
            r0 = 1023(0x3ff, float:1.434E-42)
            r11.CNh(r2, r0)
            return
        L_0x0100:
            if (r1 != r5) goto L_0x010b
            r0 = 2131897411(0x7f122c43, float:1.942971E38)
            X.A1c r1 = new X.A1c
            r1.<init>(r0)
            goto L_0x0113
        L_0x010b:
            X.AXh r1 = r11.A04
            X.9ui r0 = r11.A07
            X.A1c r1 = r1.A02(r0, r2)
        L_0x0113:
            A0V(r11, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity.C2m(X.8pN, X.A7B):void");
    }

    public void C3L(A7B a7b) {
        AnonymousClass8BX.A1D(this.A0Y, a7b, "getPaymentMethods. paymentNetworkError: ", AnonymousClass000.A10());
        A0V(this, this.A04.A02(this.A07, a7b.A00), false);
    }

    public void C3X(A7B a7b) {
        AnonymousClass8BX.A1D(this.A0Y, a7b, "getPaymentMethods. paymentNetworkError: ", AnonymousClass000.A10());
        if (!C20752AXh.A01(this, "upi-register-vpa", a7b.A00, true)) {
            A0V(this, this.A04.A02(this.A07, a7b.A00), false);
        }
    }

    public void C3Y(C186089dd r4) {
        AnonymousClass1QE r2 = this.A0Y;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("getPaymentMethods. onResponseSuccess: ");
        AnonymousClass8BW.A1D(r2, A10, r4.A02);
        List list = ((C176018ze) r4).A00;
        if (list == null || list.isEmpty()) {
            A0V(this, this.A04.A02(this.A07, 0), false);
            return;
        }
        this.A0K.A0A(this.A0K.A04("add_bank"));
        A03((AnonymousClass8pN) null);
    }

    public void onBackPressed() {
        this.A0Y.A06("onBackPressed");
        A0c(this, C17880vN.A0h());
        A4q();
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass8BW.A0y(this);
        super.onCreate(bundle);
        AnonymousClass8BX.A0u(this);
        this.A0B = new C189689je(this.A0K);
        C17960vV.A07(AnonymousClass3MY.A09(this));
        this.A0V = AnonymousClass3MY.A09(this).getParcelableArrayList("extra_accounts_list");
        this.A0H = AnonymousClass3MY.A09(this).getString("extra_selected_account_bank_logo");
        this.A05 = (AnonymousClass8pS) getIntent().getParcelableExtra("extra_selected_bank");
        C196259ui r2 = this.A0M.A04;
        this.A07 = r2;
        r2.A00("upi-bank-account-picker");
        C18030ve r10 = this.A0E;
        AnonymousClass1KB r13 = this.A05;
        AnonymousClass1OZ A0M2 = AnonymousClass8BT.A0M(this);
        C30931ek r9 = this.A0D;
        AnonymousClass1QS r8 = this.A0Q;
        AnonymousClass1QL r7 = this.A0K;
        AnonymousClass1KI r6 = this.A03;
        A7U a7u = this.A0M;
        C31061ex r4 = this.A0N;
        C33711jG A0S2 = AnonymousClass8BT.A0S(this);
        AnonymousClass1KI r14 = r6;
        this.A0U = new C175778zG(this, r13, r14, r10, A0M2, a7u, this.A0N, r7, A0S2, r4, r8, this, this.A0S, this.A0V, r9);
        C18030ve r15 = this.A0E;
        AnonymousClass118 r142 = this.A05;
        AnonymousClass10I r132 = this.A05;
        AnonymousClass1OZ A0M3 = AnonymousClass8BT.A0M(this);
        C30931ek r12 = this.A0D;
        AnonymousClass1QS r11 = this.A0Q;
        A0B a0b = this.A09;
        A7U a7u2 = this.A0M;
        AnonymousClass1KI r82 = this.A03;
        C33711jG A0S3 = AnonymousClass8BT.A0S(this);
        AXS axs = this.A0N;
        C19997A2l a2l = this.A0C;
        AnonymousClass8pS r5 = this.A05;
        AZ6 az6 = this.A0S;
        AnonymousClass1QS r22 = r11;
        AZ6 az62 = az6;
        A7U a7u3 = a7u2;
        AXS axs2 = axs;
        AnonymousClass8pS r18 = r5;
        C18030ve r16 = r15;
        AnonymousClass1KI r152 = r82;
        AnonymousClass1KB r133 = this.A05;
        this.A0T = new A0S(r133, r142, r152, r16, A0M3, r18, a7u3, axs2, A0S3, r22, this, az62, a0b, this.A0V, a2l, r12, r132, this.A0F);
        File A0e = C17880vN.A0e(getCacheDir(), "BankLogos");
        if (!A0e.mkdirs() && !A0e.isDirectory()) {
            this.A0Y.A06("BankAccountPickerUI/create unable to create bank logos cache directory");
        }
        C86284Ra r3 = new C86284Ra(this.A05, this.A05, this.A0D, this.A05, A0e, "india-upi-bank-account-picker");
        r3.A00 = getResources().getDimensionPixelSize(2131167069);
        this.A0E = r3.A00();
        setContentView(2131625610);
        this.A0K = findViewById(2131427582);
        this.A0L = findViewById(2131434180);
        this.A0P = findViewById(2131436568);
        this.A0O = findViewById(2131435414);
        this.A02 = (RecyclerView) findViewById(2131434428);
        this.A0M = findViewById(2131431369);
        this.A0S = AnonymousClass3MX.A0L(this, 2131428047);
        this.A0R = AnonymousClass3MX.A0L(this, 2131428046);
        this.A0Q = AnonymousClass3MX.A0I(this, 2131431412);
        this.A0N = findViewById(2131433194);
        C003401n A1J = AnonymousClass91U.A1J(this);
        if (A1J != null) {
            A1J.A0W(true);
            A1J.A0M(2131893802);
        }
        C18030ve r83 = this.A0E;
        AnonymousClass1KB r72 = this.A05;
        AnonymousClass1L9 r62 = this.A01;
        AnonymousClass11C r52 = this.A08;
        AnonymousClass1L9 r102 = r62;
        AnonymousClass1KB r112 = r72;
        C26302CxJ.A0K(this, Uri.parse("https://faq.whatsapp.com/general/payments/learn-more-about-sharing-the-legal-name-on-your-bank-account"), r102, r112, AnonymousClass3MX.A0V(this.A0N, 2131433195), r52, r83, C17880vN.A0q(this, "learn-more", new Object[1], 0, 2131893922), "learn-more");
        A50();
        this.A0S.A0B((C20112A7u) null, 0, (Integer) null, this.A0c, "nav_select_account", this.A0f);
    }

    public IndiaUpiBankAccountPickerActivity(int i) {
        this.A0W = false;
        AGC.A00(this, 43);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1023) {
            return;
        }
        if (i2 == -1) {
            ((C190239kb) this.A0G.get()).A00(intent, this, new C20840AaI(this, 0));
        } else {
            finish();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        A4w(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0U.A01 = null;
        this.A0Q.A08(this);
        this.A0E.A02.A04(false);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131432589 && !this.A0J && this.A0O.getVisibility() != 0) {
            A4u(2131888958, "nav_select_account", "payments:account-select");
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.A0Y.A06("action bar home");
            A0c(this, 1);
            A4q();
            return true;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        if (menu.findItem(2131432589) != null) {
            menu.findItem(2131432589).setVisible(AnonymousClass000.A1O(this.A0O.getVisibility()));
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public IndiaUpiBankAccountPickerActivity() {
        this(0);
        this.A0F = C221618v.A00(AnonymousClass9RP.class);
        this.A0Y = AnonymousClass1QE.A00("IndiaUpiBankAccountPickerActivity", "onboarding", "IN");
        this.A01 = -1;
        this.A0Z = new C171858sO();
        this.A0X = false;
    }
}
