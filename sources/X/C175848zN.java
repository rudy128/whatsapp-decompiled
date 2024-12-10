package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.8zN  reason: invalid class name and case insensitive filesystem */
public class C175848zN extends C197889xR {
    public final Context A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass1OZ A03;
    public final A7U A04;
    public final AXS A05;
    public final C33711jG A06;
    public final C175758zE A07;
    public final C30931ek A08;

    public static void A01(AW0 aw0, C175848zN r3, List list) {
        AnonymousClass8BT.A1S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, aw0.A0K, list);
        AnonymousClass8BT.A1S("device-id", r3.A08.A01(), list);
        C170318pf A0C = AnonymousClass8BS.A0C(aw0);
        C196219ue r2 = A0C.A0H;
        C17960vV.A07(r2);
        AnonymousClass8BT.A1S("sender-vpa", A0C.A0T, list);
        if (!TextUtils.isEmpty(A0C.A0U)) {
            AnonymousClass8BT.A1S("sender-vpa-id", A0C.A0U, list);
        }
        AnonymousClass8BT.A1S("receiver-vpa", A0C.A0R, list);
        if (!TextUtils.isEmpty(A0C.A0S)) {
            AnonymousClass8BT.A1S("receiver-vpa-id", A0C.A0S, list);
        }
        if (!C20061A5k.A02(r2.A08)) {
            AnonymousClass8BT.A1S("mandate-no", (String) AnonymousClass8BT.A0q(r2.A08), list);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.AnonymousClass9O4 r9, X.C170318pf r10, java.lang.String r11, java.util.List r12, boolean r13) {
        /*
            X.9ue r2 = r10.A0H
            if (r2 == 0) goto L_0x00c4
            long r0 = r2.A02
            r7 = 1000(0x3e8, double:4.94E-321)
            r5 = 0
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0019
            long r0 = r0 / r7
            java.lang.String r4 = "start-ts"
            X.1MD r3 = new X.1MD
            r3.<init>((java.lang.String) r4, (long) r0)
            r12.add(r3)
        L_0x0019:
            long r0 = r2.A01
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x002a
            long r0 = r0 / r7
            java.lang.String r4 = "end-ts"
            X.1MD r3 = new X.1MD
            r3.<init>((java.lang.String) r4, (long) r0)
            r12.add(r3)
        L_0x002a:
            java.lang.String r1 = r2.A0G
            if (r1 == 0) goto L_0x0033
            java.lang.String r0 = "amount-rule"
            X.AnonymousClass8BT.A1S(r0, r1, r12)
        L_0x0033:
            java.lang.String r1 = r2.A0E
            if (r1 == 0) goto L_0x003c
            java.lang.String r0 = "frequency-rule"
            X.AnonymousClass8BT.A1S(r0, r1, r12)
        L_0x003c:
            X.77e r1 = r2.A07
            boolean r0 = X.C20061A5k.A03(r1)
            if (r0 != 0) goto L_0x004f
            java.lang.Object r1 = X.AnonymousClass8BT.A0q(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "mandate-name"
            X.AnonymousClass8BT.A1S(r0, r1, r12)
        L_0x004f:
            boolean r0 = r2.A0N
            java.lang.String r1 = X.AnonymousClass8BS.A0b(r0)
            java.lang.String r0 = "is-revocable"
            X.AnonymousClass8BT.A1S(r0, r1, r12)
            java.lang.String r1 = "seq-no"
            if (r11 == 0) goto L_0x00c5
            X.1MD r0 = X.AnonymousClass8BR.A0h(r1, r11)
        L_0x0062:
            r12.add(r0)
        L_0x0065:
            if (r9 == 0) goto L_0x0080
            boolean r0 = r9.A01()
            if (r0 == 0) goto L_0x0080
            X.77e r1 = r9.A02
            boolean r0 = X.C20061A5k.A02(r1)
            if (r0 != 0) goto L_0x0080
            java.lang.Object r1 = X.AnonymousClass8BT.A0q(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "mandate-update-info"
            X.AnonymousClass8BT.A1S(r0, r1, r12)
        L_0x0080:
            if (r13 == 0) goto L_0x00c4
            java.lang.String r0 = r2.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0091
            java.lang.String r1 = "recurrence-rule"
            java.lang.String r0 = r2.A0K
            X.AnonymousClass8BT.A1S(r1, r0, r12)
        L_0x0091:
            java.lang.String r0 = r2.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a0
            java.lang.String r1 = "recurrence-day"
            java.lang.String r0 = r2.A0J
            X.AnonymousClass8BT.A1S(r1, r0, r12)
        L_0x00a0:
            X.77e r0 = r2.A0A
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r0 = r0.A00
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00bb
            X.77e r0 = r2.A0A
            java.lang.Object r1 = X.AnonymousClass8BT.A0q(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "purpose-code"
            X.AnonymousClass8BT.A1S(r0, r1, r12)
        L_0x00bb:
            java.lang.String r1 = r10.A0O
            if (r1 == 0) goto L_0x00c4
            java.lang.String r0 = "mcc"
            X.AnonymousClass8BT.A1S(r0, r1, r12)
        L_0x00c4:
            return
        L_0x00c5:
            java.lang.String r0 = r10.A0V
            if (r0 == 0) goto L_0x0065
            X.1MD r0 = X.AnonymousClass8BR.A0h(r1, r0)
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175848zN.A02(X.9O4, X.8pf, java.lang.String, java.util.List, boolean):void");
    }

    public C175848zN(Context context, AnonymousClass190 r2, AnonymousClass1KB r3, AnonymousClass1OZ r4, A7U a7u, AXS axs, C33711jG r7, C196259ui r8, C31061ex r9, C175758zE r10, C30931ek r11) {
        super(r8, r9);
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A08 = r11;
        this.A07 = r10;
        this.A06 = r7;
        this.A05 = axs;
        this.A04 = a7u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        r1 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (X.C20061A5k.A03(r1) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        X.AnonymousClass8BT.A1S("upi-bank-info", (java.lang.String) X.AnonymousClass8BT.A0q(r1), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r6 == null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r1 = r4.A04.A07("MPIN", r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1 == null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        X.AnonymousClass8BT.A1S("mpin", r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        X.AnonymousClass8BT.A1S("credential-id", r3.A0A, r7);
        r0 = (X.AnonymousClass8pS) r3.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r0 == null) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C20284AEs r3, X.C175848zN r4, java.lang.String r5, java.util.HashMap r6, java.util.List r7) {
        /*
            int r0 = r5.hashCode()
            switch(r0) {
                case -1747997465: goto L_0x0060;
                case -1206140285: goto L_0x0057;
                case 417679030: goto L_0x004e;
                case 485726418: goto L_0x0045;
                case 1224051264: goto L_0x003c;
                default: goto L_0x0007;
            }
        L_0x0007:
            r2 = 7
        L_0x0008:
            if (r6 == 0) goto L_0x0019
            X.A7U r1 = r4.A04
            java.lang.String r0 = "MPIN"
            java.lang.String r1 = r1.A07(r0, r6, r2)
            if (r1 == 0) goto L_0x0019
            java.lang.String r0 = "mpin"
            X.AnonymousClass8BT.A1S(r0, r1, r7)
        L_0x0019:
            if (r3 == 0) goto L_0x003b
            java.lang.String r1 = "credential-id"
            java.lang.String r0 = r3.A0A
            X.AnonymousClass8BT.A1S(r1, r0, r7)
            X.8pb r0 = r3.A08
            X.8pS r0 = (X.AnonymousClass8pS) r0
            if (r0 == 0) goto L_0x003b
            X.77e r1 = r0.A05
            boolean r0 = X.C20061A5k.A03(r1)
            if (r0 != 0) goto L_0x003b
            java.lang.Object r1 = X.AnonymousClass8BT.A0q(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "upi-bank-info"
            X.AnonymousClass8BT.A1S(r0, r1, r7)
        L_0x003b:
            return
        L_0x003c:
            java.lang.String r0 = "upi-revoke-mandate"
            boolean r0 = r5.equals(r0)
            r2 = 10
            goto L_0x0068
        L_0x0045:
            java.lang.String r0 = "upi-pause-mandate"
            boolean r0 = r5.equals(r0)
            r2 = 11
            goto L_0x0068
        L_0x004e:
            java.lang.String r0 = "upi-create-mandate"
            boolean r0 = r5.equals(r0)
            r2 = 8
            goto L_0x0068
        L_0x0057:
            java.lang.String r0 = "upi-update-mandate-by-url"
            boolean r0 = r5.equals(r0)
            r2 = 9
            goto L_0x0068
        L_0x0060:
            java.lang.String r0 = "upi-resume-mandate"
            boolean r0 = r5.equals(r0)
            r2 = 12
        L_0x0068:
            if (r0 != 0) goto L_0x0008
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175848zN.A00(X.AEs, X.8zN, java.lang.String, java.util.HashMap, java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C29621ca[] A03(X.AW0 r9, X.C175848zN r10) {
        /*
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            X.8pG r0 = r9.A0A
            if (r0 == 0) goto L_0x0070
            X.BDa r2 = r0.A00
            if (r2 == 0) goto L_0x0070
            X.1ex r3 = r10.A01
            int r0 = r2.getValue()
            long r7 = (long) r0
            X.ARR r2 = (X.ARR) r2
            int r6 = r2.A00
            X.1KJ r4 = r2.A01
            java.lang.String r5 = "amount"
            X.1ca r0 = r3.A05(r4, r5, r6, r7)
        L_0x001f:
            r1.add(r0)
        L_0x0022:
            X.8pG r0 = r9.A0A
            X.8pf r0 = (X.C170318pf) r0
            X.9ue r2 = r0.A0H
            X.C17960vV.A07(r2)
            X.BDa r0 = r2.A05
            if (r0 == 0) goto L_0x0050
            X.1ex r3 = r10.A01
            int r0 = r0.getValue()
            long r7 = (long) r0
            X.BDa r0 = r2.A05
            X.ARR r0 = (X.ARR) r0
            int r6 = r0.A00
            X.1KJ r4 = r0.A01
            java.lang.String r5 = "original-amount"
            X.1ca r0 = r3.A05(r4, r5, r6, r7)
        L_0x0044:
            r1.add(r0)
        L_0x0047:
            int r0 = r1.size()
            X.1ca[] r0 = X.C17890vO.A1Y(r1, r0)
            return r0
        L_0x0050:
            X.77e r2 = r2.A09
            boolean r0 = X.C20061A5k.A03(r2)
            if (r0 != 0) goto L_0x0047
            java.lang.Object r2 = r2.A00
            java.lang.String r2 = (java.lang.String) r2
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r2)
            X.1KJ r4 = X.AnonymousClass1KL.A0B
            X.1KN r3 = X.AnonymousClass8BU.A0H(r4, r0)
            X.1ex r2 = r10.A01
            java.lang.String r0 = "original-amount"
            X.1ca r0 = r2.A04(r4, r3, r0)
            goto L_0x0044
        L_0x0070:
            X.1KN r4 = r9.A09
            if (r4 == 0) goto L_0x0022
            X.1ex r3 = r10.A01
            X.1KJ r2 = X.AnonymousClass1KL.A0B
            java.lang.String r0 = "amount"
            X.1ca r0 = r3.A04(r2, r4, r0)
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175848zN.A03(X.AW0, X.8zN):X.1ca[]");
    }
}
