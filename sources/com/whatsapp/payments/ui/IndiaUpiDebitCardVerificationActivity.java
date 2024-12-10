package com.whatsapp.payments.ui;

import X.AF5;
import X.AFO;
import X.AGA;
import X.AGD;
import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1QE;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass78X;
import X.AnonymousClass8BU;
import X.AnonymousClass8BX;
import X.AnonymousClass8pN;
import X.AnonymousClass91M;
import X.AnonymousClass91U;
import X.C003401n;
import X.C108985cd;
import X.C137116uw;
import X.C171858sO;
import X.C17880vN;
import X.C20063A5m;
import X.C20080A6g;
import X.C20112A7u;
import X.C43421zm;
import X.C63662tU;
import X.C63932tv;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.WaEditText;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Calendar;

public class IndiaUpiDebitCardVerificationActivity extends AnonymousClass91M {
    public int A00;
    public int A01;
    public TextView A02;
    public WaEditText A03;
    public WaEditText A04;
    public AnonymousClass8pN A05;
    public WDSButton A06;
    public String A07;
    public String A08;
    public String A09;
    public WaEditText A0A;
    public WaEditText A0B;
    public Integer A0C;
    public boolean A0D;
    public final AnonymousClass1QE A0E;

    public static void A0Q(IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(250);
        indiaUpiDebitCardVerificationActivity.A02.startAnimation(alphaAnimation);
        indiaUpiDebitCardVerificationActivity.A02.setVisibility(0);
    }

    public static int A03(IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity) {
        if (TextUtils.isEmpty(C108985cd.A0h(indiaUpiDebitCardVerificationActivity.A0A)) || C108985cd.A0h(indiaUpiDebitCardVerificationActivity.A0A).length() != 2 || TextUtils.isEmpty(C108985cd.A0h(indiaUpiDebitCardVerificationActivity.A0B)) || C108985cd.A0h(indiaUpiDebitCardVerificationActivity.A0B).length() != 4) {
            return 1;
        }
        return 0;
    }

    public static void A0V(IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity) {
        if (A0c(indiaUpiDebitCardVerificationActivity, indiaUpiDebitCardVerificationActivity.A00, indiaUpiDebitCardVerificationActivity.A01, true)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(C108985cd.A0h(indiaUpiDebitCardVerificationActivity.A0A));
            indiaUpiDebitCardVerificationActivity.A09 = AnonymousClass000.A0y(C108985cd.A0h(indiaUpiDebitCardVerificationActivity.A0B), A10);
            indiaUpiDebitCardVerificationActivity.A07 = C108985cd.A0h(indiaUpiDebitCardVerificationActivity.A03);
            indiaUpiDebitCardVerificationActivity.A08 = C108985cd.A0h(indiaUpiDebitCardVerificationActivity.A04);
            indiaUpiDebitCardVerificationActivity.A5G(indiaUpiDebitCardVerificationActivity.A05);
        }
        C171858sO A072 = indiaUpiDebitCardVerificationActivity.A0S.A07(1, C17880vN.A0l(), "enter_debit_card", indiaUpiDebitCardVerificationActivity.A0f);
        A072.A0Y = indiaUpiDebitCardVerificationActivity.A0c;
        A072.A0E = indiaUpiDebitCardVerificationActivity.A0C;
        indiaUpiDebitCardVerificationActivity.A0C.CC7(A072);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0112, code lost:
        if (r5 >= r10) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0118, code lost:
        if (r7 > 12) goto L_0x011a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0c(com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity r8, int r9, int r10, boolean r11) {
        /*
            com.whatsapp.WaEditText r2 = r8.A03
            com.whatsapp.WaEditText r1 = r8.A04
            r6 = -1
            java.lang.String r0 = X.C108985cd.A0h(r1)     // Catch:{ NumberFormatException -> 0x002e }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NumberFormatException -> 0x002e }
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = X.C108985cd.A0h(r1)     // Catch:{ NumberFormatException -> 0x002e }
            int r5 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x002e }
            goto L_0x0019
        L_0x0018:
            r5 = -1
        L_0x0019:
            java.lang.String r0 = X.C108985cd.A0h(r2)     // Catch:{ NumberFormatException -> 0x002c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NumberFormatException -> 0x002c }
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = X.C108985cd.A0h(r2)     // Catch:{ NumberFormatException -> 0x002c }
            int r7 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x002c }
            goto L_0x0038
        L_0x002c:
            r2 = move-exception
            goto L_0x0030
        L_0x002e:
            r2 = move-exception
            r5 = -1
        L_0x0030:
            X.1QE r1 = r8.A0E
            java.lang.String r0 = "IndiaUpiDebitCardVerifActivity checkMonthYear threw: "
            r1.A0A(r0, r2)
        L_0x0037:
            r7 = -1
        L_0x0038:
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r4 = 1
            int r0 = r0.get(r4)
            int r0 = r0 + 50
            int r3 = r0 % 100
            r1 = 12
            r2 = 0
            if (r5 == r6) goto L_0x010b
            if (r7 == r6) goto L_0x010b
            r0 = 3
            if (r5 < r10) goto L_0x0135
            if (r5 != r10) goto L_0x0115
            if (r7 < r9) goto L_0x0056
            if (r7 > r1) goto L_0x0056
            r0 = 0
        L_0x0056:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x005e:
            android.util.Pair r3 = X.C108945cZ.A0N(r1, r0)
        L_0x0062:
            int r0 = A03(r8)
            r2 = 3
            r4 = 0
            if (r0 == 0) goto L_0x007c
            android.widget.TextView r1 = r8.A02
            r0 = 2131889218(0x7f120c42, float:1.9413093E38)
            r1.setText(r0)
            A0Q(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x0079:
            r8.A0C = r0
            return r4
        L_0x007c:
            int r1 = X.C108965cb.A01(r3)
            if (r1 == r2) goto L_0x00fe
            java.lang.Object r0 = r3.second
            int r3 = X.AnonymousClass000.A0M(r0)
            if (r3 == r2) goto L_0x00fe
            r0 = 2
            if (r1 != r0) goto L_0x00a0
            if (r3 != r0) goto L_0x00a0
            android.widget.TextView r1 = r8.A02
            r0 = 2131889213(0x7f120c3d, float:1.9413083E38)
            r1.setText(r0)
            A0Q(r8)
            r0 = 5
        L_0x009b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0079
        L_0x00a0:
            r2 = 0
            if (r1 == 0) goto L_0x00da
            android.widget.TextView r1 = r8.A02
            if (r3 == 0) goto L_0x00c3
            r0 = 2131889215(0x7f120c3f, float:1.9413087E38)
            r1.setText(r0)
            A0Q(r8)
            if (r11 == 0) goto L_0x00c1
            com.whatsapp.WaEditText r0 = r8.A03
            r0.setText(r2)
            com.whatsapp.WaEditText r0 = r8.A04
            r0.setText(r2)
            com.whatsapp.WaEditText r0 = r8.A03
            r0.requestFocus()
        L_0x00c1:
            r0 = 6
            goto L_0x009b
        L_0x00c3:
            r0 = 2131889216(0x7f120c40, float:1.941309E38)
            r1.setText(r0)
            A0Q(r8)
            if (r11 == 0) goto L_0x00d8
            com.whatsapp.WaEditText r0 = r8.A03
            r0.setText(r2)
            com.whatsapp.WaEditText r0 = r8.A03
            r0.requestFocus()
        L_0x00d8:
            r0 = 7
            goto L_0x009b
        L_0x00da:
            if (r3 != 0) goto L_0x00e4
            r1 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r8.A0C = r0
            return r1
        L_0x00e4:
            android.widget.TextView r1 = r8.A02
            r0 = 2131889217(0x7f120c41, float:1.9413091E38)
            r1.setText(r0)
            A0Q(r8)
            if (r11 == 0) goto L_0x00fb
            com.whatsapp.WaEditText r0 = r8.A04
            r0.setText(r2)
            com.whatsapp.WaEditText r0 = r8.A04
            r0.requestFocus()
        L_0x00fb:
            r0 = 8
            goto L_0x009b
        L_0x00fe:
            android.widget.TextView r1 = r8.A02
            r0 = 2131889214(0x7f120c3e, float:1.9413085E38)
            r1.setText(r0)
            A0Q(r8)
            r0 = 4
            goto L_0x009b
        L_0x010b:
            r0 = 2
            if (r5 == r6) goto L_0x0128
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r5 < r10) goto L_0x0122
            goto L_0x011f
        L_0x0115:
            if (r7 < r4) goto L_0x011a
            r0 = 0
            if (r7 <= r1) goto L_0x011b
        L_0x011a:
            r0 = 1
        L_0x011b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x011f:
            if (r5 > r3) goto L_0x0122
            r4 = 0
        L_0x0122:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x005e
        L_0x0128:
            if (r7 != r6) goto L_0x0135
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r0, r0)
            goto L_0x0062
        L_0x0135:
            if (r7 < r4) goto L_0x013a
            if (r7 > r1) goto L_0x013a
            r4 = 0
        L_0x013a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity.A0c(com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity, int, int, boolean):boolean");
    }

    public void A2y() {
        if (!this.A0D) {
            this.A0D = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            AnonymousClass91U.A1V(r2, r1, this);
            AnonymousClass91U.A1Q(A002, r2, r1, this, r2.A7z);
            AnonymousClass91U.A1P(A002, r2, r1, AnonymousClass8BU.A0E(r2), this);
            AnonymousClass91U.A1Y(r2, this);
            AnonymousClass91U.A1W(r2, r1, this);
            AnonymousClass91U.A1T(A002, r2, r1, this);
        }
    }

    public IndiaUpiDebitCardVerificationActivity(int i) {
        this.A0D = false;
        AGD.A00(this, 1);
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.A0S.A0B((C20112A7u) null, C17880vN.A0h(), C17880vN.A0j(), this.A0c, "enter_debit_card", this.A0f);
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        AnonymousClass8BX.A0u(this);
        setContentView(2131625646);
        C003401n A1J = AnonymousClass91U.A1J(this);
        if (A1J != null) {
            A1J.A0M(2131893788);
            A1J.A0W(true);
        }
        AnonymousClass8pN r0 = (AnonymousClass8pN) AnonymousClass91U.A1I(this);
        if (r0 == null) {
            this.A0E.A05("Bank account info is null, finishing");
            finish();
            return;
        }
        this.A05 = r0;
        TextView A0L = AnonymousClass3MX.A0L(this, 2131427587);
        TextView A0L2 = AnonymousClass3MX.A0L(this, 2131436713);
        TextView A0L3 = AnonymousClass3MX.A0L(this, 2131428853);
        TextView A0L4 = AnonymousClass3MX.A0L(this, 2131427588);
        String A012 = C20080A6g.A01(this.A05);
        if ("CREDIT".equals(this.A0b)) {
            A0L2.setText(2131897655);
            AnonymousClass3MY.A0y(this, A0L, new Object[]{A012}, 2131897438);
            A0L3.setText(2131897437);
            i = 2131897439;
        } else {
            A0L2.setText(2131894243);
            AnonymousClass3MY.A0y(this, A0L, new Object[]{A012}, 2131893835);
            A0L3.setText(2131893836);
            i = 2131893625;
        }
        A0L4.setText(i);
        ImageView A0I = AnonymousClass3MX.A0I(this, 2131431828);
        Bitmap A062 = this.A05.A06();
        if (A062 != null) {
            A0I.setImageBitmap(A062);
        } else {
            A0I.setImageResource(2131231615);
        }
        WDSButton wDSButton = (WDSButton) findViewById(2131429338);
        this.A06 = wDSButton;
        wDSButton.setEnabled(false);
        AFO.A00(this.A06, this, 45);
        this.A0A = (WaEditText) findViewById(2131427585);
        this.A0B = (WaEditText) findViewById(2131427586);
        this.A03 = (WaEditText) findViewById(2131427584);
        this.A04 = (WaEditText) findViewById(2131427589);
        C43421zm.A04(this.A0A);
        C43421zm.A04(this.A0B);
        C43421zm.A04(this.A03);
        C43421zm.A04(this.A04);
        this.A02 = AnonymousClass3MX.A0L(this, 2131433696);
        Calendar instance = Calendar.getInstance();
        this.A00 = instance.get(2) + 1;
        this.A01 = instance.get(1) % 100;
        this.A0A.addTextChangedListener(new AF5(this.A0B, this, 2));
        this.A0A.setOnKeyListener(new AnonymousClass78X((EditText) null, this.A0B));
        this.A0B.addTextChangedListener(new AF5(this.A03, this, 4));
        this.A0B.setOnKeyListener(new AnonymousClass78X(this.A0A, this.A03));
        this.A03.addTextChangedListener(new AF5(this.A04, this, 2));
        this.A03.setOnKeyListener(new AnonymousClass78X(this.A0B, this.A04));
        this.A04.addTextChangedListener(new AF5((EditText) null, this, 2));
        this.A04.setOnKeyListener(new AnonymousClass78X(this.A03, (EditText) null));
        this.A04.setOnEditorActionListener(new AGA(this, 1));
        this.A0A.requestFocus();
        this.A0S.A0B((C20112A7u) null, 0, (Integer) null, this.A0c, "enter_debit_card", this.A0f);
        boolean A022 = C20063A5m.A02(this.A05);
        View findViewById = findViewById(2131436568);
        if (A022) {
            findViewById.setVisibility(8);
            AnonymousClass8BU.A18(this, 2131434767);
            return;
        }
        findViewById.setVisibility(0);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        A4w(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131432589) {
            A4u(2131888961, "enter_debit_card", "payments:enter-card");
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            this.A0S.A0B((C20112A7u) null, 1, C17880vN.A0j(), this.A0c, "enter_debit_card", this.A0f);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        super.onPause();
        this.A09.A01(findViewById(2131427589));
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.containsKey("debitLast6SavedInst")) {
            this.A09 = bundle.getString("debitLast6SavedInst");
        }
        if (bundle.containsKey("debitExpiryMonthSavedInst")) {
            this.A07 = bundle.getString("debitExpiryMonthSavedInst");
        }
        if (bundle.containsKey("debitExpiryYearSavedInst")) {
            this.A08 = bundle.getString("debitExpiryYearSavedInst");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.A09;
        if (str != null) {
            bundle.putString("debitLast6SavedInst", str);
        }
        String str2 = this.A07;
        if (str2 != null) {
            bundle.putString("debitExpiryMonthSavedInst", str2);
        }
        String str3 = this.A08;
        if (str3 != null) {
            bundle.putString("debitExpiryYearSavedInst", str3);
        }
    }

    public IndiaUpiDebitCardVerificationActivity() {
        this(0);
        this.A0E = AnonymousClass1QE.A00("IndiaUpiDebitCardVerificationActivity", "onboarding", "IN");
    }
}
