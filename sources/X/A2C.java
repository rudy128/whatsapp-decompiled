package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

public class A2C {
    public String A00 = "PENDING";
    public final AnonymousClass1KB A01;
    public final AnonymousClass118 A02;
    public final C31061ex A03;
    public final C190699lN A04;
    public final AnonymousClass1QE A05 = AnonymousClass1QE.A00("PaymentsComplianceManager", "infra", "COMMON");
    public final AnonymousClass00H A06;

    public static C187749gJ A00(A2C a2c) {
        Context context = a2c.A02.A00;
        AnonymousClass1KB r2 = a2c.A01;
        C190699lN r5 = a2c.A04;
        return new C187749gJ(context, r2, (C33711jG) a2c.A06.get(), a2c.A03, r5);
    }

    public void A01(BBI bbi) {
        this.A00 = "PENDING";
        C187749gJ A002 = A00(this);
        C190179kV r6 = new C190179kV(bbi, this);
        AnonymousClass1MD[] r2 = new AnonymousClass1MD[1];
        AnonymousClass8BV.A1M("action", "get-account-eligibility-state", r2);
        C29621ca A0k = AnonymousClass8BR.A0k("account", r2);
        AnonymousClass8BW.A1C(A002.A03, new C175428yh(A002.A00, A002.A02, A002.A01, r6, A002, 15), A0k);
    }

    public void A02(BBJ bbj, String str, String str2, int i, int i2, int i3) {
        String str3;
        C29621ca A0k;
        if (this.A00.equals("UNSUPPORTED")) {
            bbj.Bs2();
            return;
        }
        C187749gJ A002 = A00(this);
        C184759bT r11 = new C184759bT(bbj, this);
        ArrayList A13 = AnonymousClass000.A13();
        C17890vO.A11("action", "check-account-eligibility", A13);
        C17890vO.A11("action-type", str, A13);
        String str4 = str2;
        if (!TextUtils.isEmpty(str4)) {
            C17890vO.A11("credential_id", str4, A13);
        }
        AnonymousClass1MD[] A1b = AnonymousClass8BT.A1b(A13, 0);
        C190699lN r4 = A002.A04;
        int i4 = i;
        int i5 = i3;
        int A003 = r4.A00.A00(AnonymousClass7x0.A00, i4, i2, i5);
        int i6 = 13;
        if (r4.A01.A04()) {
            i6 = 16;
        }
        if (A003 < i6) {
            str3 = "2";
        } else if (A003 < 18) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        if (str3.equals("0")) {
            AnonymousClass1MD[] r42 = new AnonymousClass1MD[4];
            C17880vN.A1Q("state", "0", r42, 0);
            r42[1] = new AnonymousClass1MD("day", i5);
            r42[2] = new AnonymousClass1MD("month", i2 + 1);
            r42[3] = new AnonymousClass1MD("year", i4);
            A0k = AnonymousClass8BR.A0k("dob", r42);
        } else {
            AnonymousClass1MD[] r0 = new AnonymousClass1MD[1];
            C17880vN.A1Q("state", str3, r0, 0);
            A0k = AnonymousClass8BR.A0k("dob", r0);
        }
        C29621ca r2 = new C29621ca(A0k, "account", A1b);
        A002.A03.A0I(new C175428yh(A002.A00, A002.A02, A002.A01, r11, A002, 17), r2, "get", 0);
    }

    public void A03(BBK bbk, String str, String str2) {
        if (this.A00.equals("UNSUPPORTED")) {
            bbk.Byv();
            return;
        }
        C187749gJ A002 = A00(this);
        C184749bS r6 = new C184749bS(bbk, this);
        C17960vV.A06(str);
        AnonymousClass1MD[] r3 = new AnonymousClass1MD[2];
        boolean A1W = C17890vO.A1W("action", "check-account-eligibility", r3);
        r3[1] = AnonymousClass8BR.A0h("action-type", str2);
        AnonymousClass1MD[] r1 = new AnonymousClass1MD[1];
        C17880vN.A1Q("full", str, r1, A1W ? 1 : 0);
        C29621ca r12 = new C29621ca(AnonymousClass8BR.A0k(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r1), "account", r3);
        AnonymousClass8BW.A1C(A002.A03, new C175428yh(A002.A00, A002.A02, A002.A01, r6, A002, 16), r12);
    }

    public A2C(AnonymousClass1KB r4, AnonymousClass118 r5, C31061ex r6, C190699lN r7, AnonymousClass00H r8) {
        this.A02 = r5;
        this.A01 = r4;
        this.A04 = r7;
        this.A03 = r6;
        this.A06 = r8;
    }
}
