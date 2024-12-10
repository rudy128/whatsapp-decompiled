package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1ie  reason: invalid class name and case insensitive filesystem */
public class C33331ie {
    public final AnonymousClass118 A00;
    public final AnonymousClass1QO A01;
    public final AnonymousClass10I A02;
    public final C27301Vn A03;
    public final AnonymousClass1KH A04;
    public final AnonymousClass1QG A05;
    public final AnonymousClass1QD A06;
    public final AnonymousClass1QS A07;
    public final AnonymousClass1Nb A08;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074 A[Catch:{ JSONException -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075 A[Catch:{ JSONException -> 0x0081 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C33331ie r11) {
        /*
            X.1QO r1 = r11.A01
            r0 = 0
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x00da
            X.1QD r7 = r11.A06
            android.content.SharedPreferences r1 = r7.A03()
            java.lang.String r0 = "payment_kyc_info"
            r3 = 0
            java.lang.String r2 = r1.getString(r0, r3)
            if (r2 == 0) goto L_0x0088
            boolean r0 = X.AnonymousClass1YF.A0T(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0086
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0081 }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x0081 }
            java.lang.String r0 = "state"
            java.lang.String r8 = r1.getString(r0)     // Catch:{ JSONException -> 0x0081 }
            java.lang.String r0 = "rejection-code"
            r10 = -1
            int r9 = r1.optInt(r0, r10)     // Catch:{ JSONException -> 0x0081 }
            java.lang.String r0 = "actions-requested"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch:{ JSONException -> 0x0081 }
            if (r1 == 0) goto L_0x006e
            java.lang.String r0 = "obligation"
            java.lang.String r6 = r1.getString(r0)     // Catch:{ JSONException -> 0x0069 }
            java.lang.String r0 = "actions"
            org.json.JSONArray r5 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x0069 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0069 }
            r4.<init>()     // Catch:{ JSONException -> 0x0069 }
            int r2 = r5.length()     // Catch:{ JSONException -> 0x0069 }
            r1 = 0
        L_0x0051:
            if (r1 >= r2) goto L_0x0060
            java.lang.String r0 = r5.getString(r1)     // Catch:{ JSONException -> 0x0069 }
            X.C18070vi.A0X(r0)     // Catch:{ JSONException -> 0x0069 }
            r4.add(r0)     // Catch:{ JSONException -> 0x0069 }
            int r1 = r1 + 1
            goto L_0x0051
        L_0x0060:
            X.C18070vi.A0b(r6)     // Catch:{ JSONException -> 0x0069 }
            X.2uy r1 = new X.2uy     // Catch:{ JSONException -> 0x0069 }
            r1.<init>(r6, r4)     // Catch:{ JSONException -> 0x0069 }
            goto L_0x006f
        L_0x0069:
            java.lang.String r0 = "PAY: PaymentKycActionsRequested fromJsonString threw exception"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x0081 }
        L_0x006e:
            r1 = 0
        L_0x006f:
            X.C18070vi.A0b(r8)     // Catch:{ JSONException -> 0x0081 }
            if (r9 == r10) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r0 = r3
            goto L_0x007b
        L_0x0077:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ JSONException -> 0x0081 }
        L_0x007b:
            X.2uv r4 = new X.2uv     // Catch:{ JSONException -> 0x0081 }
            r4.<init>(r1, r0, r8)     // Catch:{ JSONException -> 0x0081 }
            goto L_0x0089
        L_0x0081:
            java.lang.String r0 = "PAY: PaymentKycInfo fromJsonString threw exception"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0086:
            r4 = r3
            goto L_0x0089
        L_0x0088:
            r4 = r3
        L_0x0089:
            android.content.SharedPreferences r2 = r7.A03()
            java.lang.String r1 = "payment_kyc_update_ack"
            r0 = 1
            boolean r0 = r2.getBoolean(r1, r0)
            if (r4 == 0) goto L_0x00d1
            if (r0 != 0) goto L_0x00d1
            java.lang.String r0 = "PENDING"
            java.lang.String r1 = r4.A02
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ba
            X.118 r0 = r11.A00
            android.content.Context r1 = r0.A00
            r0 = 2131893042(0x7f121b32, float:1.942085E38)
            java.lang.String r2 = r1.getString(r0)
            r0 = 2131893041(0x7f121b31, float:1.9420847E38)
        L_0x00b0:
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "KYC"
            A02(r11, r2, r1, r0, r3)
            return
        L_0x00ba:
            java.lang.String r0 = "COMPLETED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00da
            X.118 r0 = r11.A00
            android.content.Context r1 = r0.A00
            r0 = 2131893040(0x7f121b30, float:1.9420845E38)
            java.lang.String r2 = r1.getString(r0)
            r0 = 2131893039(0x7f121b2f, float:1.9420843E38)
            goto L_0x00b0
        L_0x00d1:
            X.1Vn r2 = r11.A03
            r1 = 26
            java.lang.String r0 = "PAYMENTS_KYC_UPDATE"
            r2.BEJ(r1, r0)
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33331ie.A00(X.1ie):void");
    }

    public static void A01(C33331ie r8, String str) {
        if (r8.A01.A04(0)) {
            ArrayList arrayList = new ArrayList();
            AnonymousClass1QG r0 = r8.A05;
            if (str != null) {
                C70513Bj A032 = r0.A03(str);
                if (A032 != null) {
                    arrayList.add(A032);
                } else {
                    r8.A03.BEK(28, str, "PAYMENTS_STEP_UP_UPDATE");
                }
            } else {
                arrayList.addAll(r0.A04());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C70513Bj r6 = (C70513Bj) it.next();
                ADT adt = r6.A03;
                boolean z = r8.A06.A03().getBoolean("payment_step_up_update_ack", true);
                if (adt == null || z) {
                    r8.A03.BEK(28, str, "PAYMENTS_STEP_UP_UPDATE");
                    return;
                }
                A02(r8, r6.A08, r6.A05, "STEP_UP", r6.A06);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.72G, androidx.core.app.NotificationCompat$BigTextStyle] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0072, code lost:
        r2 = new android.content.Intent(r5, r0);
        r2.addFlags(335544320);
        r2.putExtra("notification-type", "ALIAS_DEREGISTER");
        r1 = r14.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0083, code lost:
        if (r1.A07() == null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008b, code lost:
        if (r1.A07().A08 == null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008d, code lost:
        r2.putExtra("extra_payment_name", r1.A07().A08.A09());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009c, code lost:
        r4.A0A = X.C1408573i.A00(r5, 0, r2, 134217728);
        r14.A03.BkR(47, r4.A05());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ad, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ae, code lost:
        r0 = r14.A07.A06().BWu();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b8, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ba, code lost:
        r1 = new android.content.Intent(r5, r0);
        r1.addFlags(335544320);
        r1.putExtra("notification-type", "STEP_UP");
        r7 = r18;
        r1.putExtra("step-up-id", r7);
        r4.A0A = X.C1408573i.A00(r5, 0, r1, 134217728);
        r14.A03.BkS(r7, 28, r4.A05());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00df, code lost:
        r1 = r14.A07.A06().BWu();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e9, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00eb, code lost:
        r0 = new android.content.Intent(r5, r1);
        r0.addFlags(335544320);
        r0.putExtra("notification-type", "DOC_VERIF_SUCCESS");
        r0 = X.C1408573i.A00(r5, 0, r0, 134217728);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0119, code lost:
        if (r0 == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x011d, code lost:
        r0 = new android.content.Intent(r5, r14.A07.A06().BWu());
        r0.addFlags(335544320);
        r4.A0A = X.C1408573i.A00(r5, 0, r0, 0);
        r14.A03.BkR(26, r4.A05());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x013e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x013f, code lost:
        r1 = new android.content.Intent("android.intent.action.VIEW");
        r1.addFlags(335544320);
        r1.putExtra("notification-type", "DOC_VERIF_FAILURE");
        r1.setData(android.net.Uri.parse("https://faq.whatsapp.com/general/payments/learn-more-about-identity-documents-br"));
        r0 = X.C1408573i.A00(r5, 0, r1, 134217728);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0159, code lost:
        r4.A0A = r0;
        r14.A03.BkR(37, r4.A05());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0164, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0062, code lost:
        switch(r13) {
            case 0: goto L_0x0066;
            case 1: goto L_0x00ae;
            case 2: goto L_0x00df;
            case 3: goto L_0x013f;
            case 4: goto L_0x011d;
            default: goto L_0x0065;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0066, code lost:
        r0 = r14.A07.A06().BWq();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0070, code lost:
        if (r0 == null) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C33331ie r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            X.118 r0 = r14.A00
            android.content.Context r5 = r0.A00
            X.73t r4 = X.C217217d.A03(r5)
            java.lang.String r0 = "status"
            r4.A0L = r0
            r13 = 1
            r4.A03 = r13
            r4.A0G(r13)
            r0 = 4
            r4.A06(r0)
            r3 = 0
            r4.A06 = r3
            r1 = 2131231578(0x7f08035a, float:1.807924E38)
            android.app.Notification r0 = r4.A08
            r0.icon = r1
            r4.A0E(r15)
            r1 = r16
            r4.A0D(r1)
            androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
            r0.<init>()
            r0.A07(r1)
            r4.A0B(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r12 = 26
            if (r0 < r12) goto L_0x0048
            X.1Nb r0 = r14.A08
            X.1yM r0 = r0.A0W()
            X.1zz r0 = (X.C43551zz) r0
            java.lang.String r0 = r0.A0E()
            r4.A0M = r0
        L_0x0048:
            r2 = r17
            int r0 = r2.hashCode()
            java.lang.String r11 = "DOC_VERIF_FAILURE"
            java.lang.String r10 = "DOC_VERIF_SUCCESS"
            java.lang.String r9 = "STEP_UP"
            java.lang.String r1 = "ALIAS_DEREGISTER"
            switch(r0) {
                case -1986195565: goto L_0x00fb;
                case -1175556882: goto L_0x0101;
                case -1094966371: goto L_0x0106;
                case -314370780: goto L_0x010c;
                case 74901: goto L_0x0112;
                default: goto L_0x0059;
            }
        L_0x0059:
            r13 = -1
        L_0x005a:
            r2 = 37
            r6 = 134217728(0x8000000, float:3.85186E-34)
            java.lang.String r8 = "notification-type"
            r7 = 335544320(0x14000000, float:6.4623485E-27)
            switch(r13) {
                case 0: goto L_0x0066;
                case 1: goto L_0x00ae;
                case 2: goto L_0x00df;
                case 3: goto L_0x013f;
                case 4: goto L_0x011d;
                default: goto L_0x0065;
            }
        L_0x0065:
            return
        L_0x0066:
            X.1QS r0 = r14.A07
            X.BD1 r0 = r0.A06()
            java.lang.Class r0 = r0.BWq()
            if (r0 == 0) goto L_0x0065
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r5, r0)
            r2.addFlags(r7)
            r2.putExtra(r8, r1)
            X.1KH r1 = r14.A04
            X.AEs r0 = r1.A07()
            if (r0 == 0) goto L_0x009c
            X.AEs r0 = r1.A07()
            X.8pb r0 = r0.A08
            if (r0 == 0) goto L_0x009c
            X.AEs r0 = r1.A07()
            X.8pb r0 = r0.A08
            X.77e r1 = r0.A09()
            java.lang.String r0 = "extra_payment_name"
            r2.putExtra(r0, r1)
        L_0x009c:
            android.app.PendingIntent r0 = X.C1408573i.A00(r5, r3, r2, r6)
            r4.A0A = r0
            android.app.Notification r2 = r4.A05()
            X.1Vn r1 = r14.A03
            r0 = 47
            r1.BkR(r0, r2)
            return
        L_0x00ae:
            X.1QS r0 = r14.A07
            X.BD1 r0 = r0.A06()
            java.lang.Class r0 = r0.BWu()
            if (r0 == 0) goto L_0x0065
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r5, r0)
            r1.addFlags(r7)
            r1.putExtra(r8, r9)
            java.lang.String r0 = "step-up-id"
            r7 = r18
            r1.putExtra(r0, r7)
            android.app.PendingIntent r0 = X.C1408573i.A00(r5, r3, r1, r6)
            r4.A0A = r0
            android.app.Notification r2 = r4.A05()
            X.1Vn r1 = r14.A03
            r0 = 28
            r1.BkS(r7, r0, r2)
            return
        L_0x00df:
            X.1QS r0 = r14.A07
            X.BD1 r0 = r0.A06()
            java.lang.Class r1 = r0.BWu()
            if (r1 == 0) goto L_0x0065
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r5, r1)
            r0.addFlags(r7)
            r0.putExtra(r8, r10)
            android.app.PendingIntent r0 = X.C1408573i.A00(r5, r3, r0, r6)
            goto L_0x0159
        L_0x00fb:
            boolean r0 = r2.equals(r1)
            r13 = 0
            goto L_0x0119
        L_0x0101:
            boolean r0 = r2.equals(r9)
            goto L_0x0119
        L_0x0106:
            boolean r0 = r2.equals(r10)
            r13 = 2
            goto L_0x0119
        L_0x010c:
            boolean r0 = r2.equals(r11)
            r13 = 3
            goto L_0x0119
        L_0x0112:
            java.lang.String r0 = "KYC"
            boolean r0 = r2.equals(r0)
            r13 = 4
        L_0x0119:
            if (r0 != 0) goto L_0x005a
            goto L_0x0059
        L_0x011d:
            X.1QS r0 = r14.A07
            X.BD1 r0 = r0.A06()
            java.lang.Class r1 = r0.BWu()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r5, r1)
            r0.addFlags(r7)
            android.app.PendingIntent r0 = X.C1408573i.A00(r5, r3, r0, r3)
            r4.A0A = r0
            android.app.Notification r1 = r4.A05()
            X.1Vn r0 = r14.A03
            r0.BkR(r12, r1)
            return
        L_0x013f:
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            r1.addFlags(r7)
            r1.putExtra(r8, r11)
            java.lang.String r0 = "https://faq.whatsapp.com/general/payments/learn-more-about-identity-documents-br"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.setData(r0)
            android.app.PendingIntent r0 = X.C1408573i.A00(r5, r3, r1, r6)
        L_0x0159:
            r4.A0A = r0
            android.app.Notification r1 = r4.A05()
            X.1Vn r0 = r14.A03
            r0.BkR(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33331ie.A02(X.1ie, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void A03(String str) {
        this.A02.CGF(new C146817Qs(40, str, this));
    }

    public C33331ie(AnonymousClass118 r1, C27301Vn r2, AnonymousClass1KH r3, AnonymousClass1QG r4, AnonymousClass1QD r5, AnonymousClass1QO r6, AnonymousClass1QS r7, AnonymousClass1Nb r8, AnonymousClass10I r9) {
        this.A00 = r1;
        this.A02 = r9;
        this.A05 = r4;
        this.A07 = r7;
        this.A08 = r8;
        this.A06 = r5;
        this.A01 = r6;
        this.A03 = r2;
        this.A04 = r3;
    }
}
