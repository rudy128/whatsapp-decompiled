package X;

import android.content.DialogInterface;

/* renamed from: X.A9n  reason: case insensitive filesystem */
public class C20151A9n implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public C20151A9n(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C73203Rj r1, Object obj, int i, int i2) {
        r1.A0Z(new C20151A9n(obj, i), i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0401, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0440, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x044f, code lost:
        X.AnonymousClass4Yv.A01(r1, 106);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0454, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0460, code lost:
        r2.A00 = true;
        r2.CGQ(true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0467, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0473, code lost:
        r2.A00 = false;
        r2.CGQ(false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0479, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0480, code lost:
        X.AnonymousClass4Yv.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0483, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04d4, code lost:
        r3.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x04d7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0200, code lost:
        X.AnonymousClass4Yv.A00(r2, r0);
        X.C24211Jh.A03(r2, false);
        com.whatsapp.util.Log.i("PAY: IndiaUpiPayIntentReceiverActivity.finishAndDisableAction result canceled");
        r2.setResult(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0231, code lost:
        X.AnonymousClass4Yv.A00(r4, r0);
        r4.A00.A00(r4, X.AnonymousClass8BT.A06(r4), (java.lang.Integer) null, r4.getIntent().getStringExtra("sms_body"));
        r4.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x024b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x025e, code lost:
        r2.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0261, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0267, code lost:
        X.AnonymousClass4Yv.A00(r6, r0);
        r6.A00.A00(r6, X.AnonymousClass8BT.A06(r6), 17, X.C17880vN.A0q(r6, "https://whatsapp.com/dl/", X.AnonymousClass3MW.A1a(), 0, 2131896797));
        r6.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x028a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.content.DialogInterface r18, int r19) {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.A00
            r3 = r18
            r2 = r19
            switch(r0) {
                case 0: goto L_0x04ca;
                case 1: goto L_0x04a7;
                case 2: goto L_0x0484;
                case 3: goto L_0x047a;
                case 4: goto L_0x00b7;
                case 5: goto L_0x00a2;
                case 6: goto L_0x0468;
                case 7: goto L_0x0455;
                case 8: goto L_0x0444;
                case 9: goto L_0x0433;
                case 10: goto L_0x0422;
                case 11: goto L_0x0411;
                case 12: goto L_0x0403;
                case 13: goto L_0x03fd;
                case 14: goto L_0x03f6;
                case 15: goto L_0x0032;
                case 16: goto L_0x002a;
                case 17: goto L_0x03e8;
                case 18: goto L_0x03de;
                case 19: goto L_0x03d6;
                case 20: goto L_0x000b;
                case 21: goto L_0x000b;
                case 22: goto L_0x03cf;
                case 23: goto L_0x03a6;
                case 24: goto L_0x039e;
                case 25: goto L_0x0392;
                case 26: goto L_0x0381;
                case 27: goto L_0x036d;
                case 28: goto L_0x0335;
                case 29: goto L_0x0324;
                case 30: goto L_0x028b;
                case 31: goto L_0x0262;
                case 32: goto L_0x024c;
                case 33: goto L_0x022c;
                case 34: goto L_0x0226;
                case 35: goto L_0x0220;
                case 36: goto L_0x000b;
                case 37: goto L_0x000b;
                case 38: goto L_0x0020;
                case 39: goto L_0x0013;
                case 40: goto L_0x0218;
                case 41: goto L_0x0210;
                case 42: goto L_0x01fa;
                case 43: goto L_0x01f3;
                case 44: goto L_0x000b;
                case 45: goto L_0x014b;
                case 46: goto L_0x0141;
                case 47: goto L_0x00e4;
                case 48: goto L_0x00cd;
                case 49: goto L_0x00bf;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r0 = r1.A01
            android.app.Activity r0 = (android.app.Activity) r0
        L_0x000f:
            r0.finish()
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r0 = r1.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r3.dismiss()
            if (r0 == 0) goto L_0x0012
            r0.run()
            return
        L_0x0020:
            java.lang.Object r0 = r1.A01
            X.BB3 r0 = (X.BB3) r0
            if (r0 == 0) goto L_0x0012
            r0.C4N()
            return
        L_0x002a:
            java.lang.Object r0 = r1.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r3.dismiss()
            goto L_0x000f
        L_0x0032:
            java.lang.Object r6 = r1.A01
            com.whatsapp.account.remove.RemoveAccountActivity r6 = (com.whatsapp.account.remove.RemoveAccountActivity) r6
            r0 = 1
            X.AnonymousClass4Yv.A00(r6, r0)
            X.00H r0 = r6.A06
            if (r0 == 0) goto L_0x05c2
            java.lang.Object r0 = r0.get()
            X.739 r0 = (X.AnonymousClass739) r0
            r4 = 0
            r2 = 14
            r3 = 9
            r0.A04(r4, r2, r3)
            X.1cM r0 = r6.A00
            if (r0 == 0) goto L_0x05bc
            int r5 = r0.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RemoveAccountActivity/maybeRemoveAccount shouldAllowAccountSwitching:"
            X.C17900vP.A0j(r0, r1, r5)
            if (r5 == 0) goto L_0x04f0
            r0 = 2
            if (r5 == r0) goto L_0x0085
            r0 = 3
            if (r5 != r0) goto L_0x0012
            X.00H r0 = r6.A05
            if (r0 == 0) goto L_0x04de
            r0.get()
            r1 = 2131886368(0x7f120120, float:1.9407313E38)
            r0 = 2131895094(0x7f122336, float:1.9425011E38)
            X.C29491cN.A01(r6, r4, r1, r0)
            X.00H r0 = r6.A06
            if (r0 == 0) goto L_0x04d8
            java.lang.Object r1 = r0.get()
            X.739 r1 = (X.AnonymousClass739) r1
            r0 = 24
        L_0x0081:
            r1.A04(r4, r2, r0)
            return
        L_0x0085:
            X.00H r0 = r6.A05
            if (r0 == 0) goto L_0x04ea
            r0.get()
            r1 = 2131886369(0x7f120121, float:1.9407315E38)
            r0 = 2131895095(0x7f122337, float:1.9425013E38)
            X.C29491cN.A01(r6, r4, r1, r0)
            X.00H r0 = r6.A06
            if (r0 == 0) goto L_0x04e4
            java.lang.Object r1 = r0.get()
            X.739 r1 = (X.AnonymousClass739) r1
            r0 = 23
            goto L_0x0081
        L_0x00a2:
            java.lang.Object r2 = r1.A01
            X.99j r2 = (X.C1775899j) r2
            android.app.Activity r1 = r2.A01
            r0 = 107(0x6b, float:1.5E-43)
            X.AnonymousClass4Yv.A00(r1, r0)
            boolean r0 = r2.BEi()
            if (r0 == 0) goto L_0x0012
            r2.CRb()
            return
        L_0x00b7:
            java.lang.Object r0 = r1.A01
            X.99j r0 = (X.C1775899j) r0
            android.app.Activity r0 = r0.A01
            goto L_0x000f
        L_0x00bf:
            java.lang.Object r1 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r1 = (com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity) r1
            r0 = 100
            X.AnonymousClass4Yv.A00(r1, r0)
            r0 = 1
            r1.A4f(r0)
            return
        L_0x00cd:
            java.lang.Object r0 = r1.A01
            X.9Ab r0 = (X.C177659Ab) r0
            java.lang.Object r0 = r0.A01
            X.91E r0 = (X.AnonymousClass91E) r0
            X.96M r2 = r0.A0K
            java.lang.String r0 = "DyiViewModel/export-report"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.10I r1 = r2.A07
            r0 = 40
            X.C21427Aju.A00(r1, r2, r0)
            return
        L_0x00e4:
            java.lang.Object r0 = r1.A01
            X.9Ab r0 = (X.C177659Ab) r0
            java.lang.Object r2 = r0.A01
            X.91E r2 = (X.AnonymousClass91E) r2
            X.11P r1 = r2.A05
            X.11S r0 = r2.A02
            r6 = 0
            java.lang.String r5 = X.AnonymousClass1PP.A00(r0, r1, r6)
            X.96M r1 = r2.A0K
            java.lang.String r0 = "DyiViewModel/delete-report"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            X.AnonymousClass96M.A03(r1, r0)
            X.9p4 r8 = r1.A04
            r0 = 10
            X.AXN r7 = new X.AXN
            r7.<init>(r1, r0)
            java.lang.String r4 = r1.A08
            X.1ex r2 = r8.A05
            r0 = 4
            X.1MD[] r3 = new X.AnonymousClass1MD[r0]
            java.lang.String r1 = "action"
            java.lang.String r0 = "delete-payments-dyi-report"
            X.C17880vN.A1Q(r1, r0, r3, r6)
            java.lang.String r1 = "version"
            java.lang.String r0 = "1"
            X.AnonymousClass8BV.A1N(r1, r0, r3)
            java.lang.String r0 = "nonce"
            X.C17890vO.A12(r0, r5, r3)
            java.lang.String r0 = "type"
            X.AnonymousClass8BV.A1O(r0, r4, r3)
            java.lang.String r0 = "account"
            X.1ca r1 = X.AnonymousClass8BR.A0k(r0, r3)
            android.content.Context r4 = r8.A00
            X.1KB r6 = r8.A01
            X.1jG r5 = r8.A03
            r9 = 14
            X.8yh r3 = new X.8yh
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = "set"
            r2.A0G(r3, r1, r0)
            return
        L_0x0141:
            java.lang.Object r1 = r1.A01
            X.9sN r1 = (X.C194839sN) r1
            java.lang.String r0 = "on_failure"
            r1.A00(r0)
            return
        L_0x014b:
            java.lang.Object r3 = r1.A01
            X.1FU r3 = (X.AnonymousClass1FU) r3
            java.util.AbstractMap r1 = X.AnonymousClass8BW.A0p(r3)
            if (r1 == 0) goto L_0x01d6
            java.lang.String r0 = "credential_push_data"
            java.lang.String r4 = X.C108945cZ.A1G(r0, r1)
            if (r4 == 0) goto L_0x01e6
            r6 = 1
            java.lang.String[] r1 = new java.lang.String[r6]
            java.lang.String r0 = "."
            r2 = 0
            r1[r2] = r0
            java.util.List r0 = X.AnonymousClass1YF.A0S(r4, r1, r2)
            java.lang.String[] r1 = X.C108955ca.A1b(r0)
            int r0 = r1.length
            if (r0 <= r6) goto L_0x01e6
            r0 = r1[r6]
            byte[] r2 = android.util.Base64.decode(r0, r2)
            X.C18070vi.A0b(r2)     // Catch:{ UnsupportedEncodingException -> 0x01d3 }
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ UnsupportedEncodingException -> 0x01d3 }
            X.C18070vi.A0Z(r1)     // Catch:{ UnsupportedEncodingException -> 0x01d3 }
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x01d3 }
            r0.<init>(r2, r1)     // Catch:{ UnsupportedEncodingException -> 0x01d3 }
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x01d8 }
            java.lang.String r0 = "callbackURL"
            java.lang.String r2 = r1.getString(r0)     // Catch:{ JSONException -> 0x01d8 }
            java.lang.String r0 = "pushAccountReceipts"
            org.json.JSONArray r1 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x01d8 }
            r0 = 0
            java.lang.String r5 = r1.getString(r0)     // Catch:{ JSONException -> 0x01d8 }
            if (r2 == 0) goto L_0x01e6
            int r0 = r2.length()     // Catch:{ JSONException -> 0x01d8 }
            if (r0 == 0) goto L_0x01e6
            android.net.Uri r0 = android.net.Uri.parse(r2)     // Catch:{ JSONException -> 0x01d8 }
            android.net.Uri$Builder r2 = r0.buildUpon()     // Catch:{ JSONException -> 0x01d8 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x01d8 }
            java.lang.String r0 = "results["
            r1.append(r0)     // Catch:{ JSONException -> 0x01d8 }
            r1.append(r5)     // Catch:{ JSONException -> 0x01d8 }
            r0 = 93
            java.lang.String r1 = X.C17890vO.A0c(r1, r0)     // Catch:{ JSONException -> 0x01d8 }
            java.lang.String r0 = "CANCELLED"
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r1, r0)     // Catch:{ JSONException -> 0x01d8 }
            android.net.Uri r1 = r0.build()     // Catch:{ JSONException -> 0x01d8 }
            if (r1 == 0) goto L_0x01e6
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r0 = X.C108945cZ.A0G(r0)
            r0.setData(r1)
            r3.A3q(r0, r6)
            return
        L_0x01d3:
            java.lang.String r0 = "UnsupportedEncodingException: Credential Push data cannot be decoded"
            goto L_0x01e3
        L_0x01d6:
            r4 = 0
            goto L_0x01e6
        L_0x01d8:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "JSONException: cannot parse callback url from json, "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)
        L_0x01e3:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x01e6:
            r3.finish()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Credential Push data is invalid. "
            X.C17900vP.A0e(r0, r4, r1)
            return
        L_0x01f3:
            java.lang.Object r2 = r1.A01
            android.app.Activity r2 = (android.app.Activity) r2
            r0 = 10001(0x2711, float:1.4014E-41)
            goto L_0x0200
        L_0x01fa:
            java.lang.Object r2 = r1.A01
            android.app.Activity r2 = (android.app.Activity) r2
            r0 = 10000(0x2710, float:1.4013E-41)
        L_0x0200:
            X.AnonymousClass4Yv.A00(r2, r0)
            r1 = 0
            X.C24211Jh.A03(r2, r1)
            java.lang.String r0 = "PAY: IndiaUpiPayIntentReceiverActivity.finishAndDisableAction result canceled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.setResult(r1)
            goto L_0x025e
        L_0x0210:
            java.lang.Object r0 = r1.A01
            X.AMI r0 = (X.AMI) r0
            r0.A00()
            return
        L_0x0218:
            java.lang.Object r0 = r1.A01
            X.AMJ r0 = (X.AMJ) r0
            r0.A01()
            return
        L_0x0220:
            java.lang.Object r4 = r1.A01
            com.whatsapp.conversationslist.SmsDefaultAppWarning r4 = (com.whatsapp.conversationslist.SmsDefaultAppWarning) r4
            r0 = 1
            goto L_0x0231
        L_0x0226:
            java.lang.Object r6 = r1.A01
            com.whatsapp.conversationslist.SmsDefaultAppWarning r6 = (com.whatsapp.conversationslist.SmsDefaultAppWarning) r6
            r0 = 1
            goto L_0x0267
        L_0x022c:
            java.lang.Object r4 = r1.A01
            com.whatsapp.conversationslist.SmsDefaultAppWarning r4 = (com.whatsapp.conversationslist.SmsDefaultAppWarning) r4
            r0 = 0
        L_0x0231:
            X.AnonymousClass4Yv.A00(r4, r0)
            X.1nc r3 = r4.A00
            android.net.Uri r2 = X.AnonymousClass8BT.A06(r4)
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "sms_body"
            java.lang.String r1 = r1.getStringExtra(r0)
            r0 = 0
            r3.A00(r4, r2, r0, r1)
            r4.finish()
            return
        L_0x024c:
            java.lang.Object r2 = r1.A01
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.String r0 = "smsdefaultappwarning/reset"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            java.lang.String r0 = "com.whatsapp"
            r1.clearPackagePreferredActivities(r0)
        L_0x025e:
            r2.finish()
            return
        L_0x0262:
            java.lang.Object r6 = r1.A01
            com.whatsapp.conversationslist.SmsDefaultAppWarning r6 = (com.whatsapp.conversationslist.SmsDefaultAppWarning) r6
            r0 = 0
        L_0x0267:
            X.AnonymousClass4Yv.A00(r6, r0)
            X.1nc r5 = r6.A00
            android.net.Uri r4 = X.AnonymousClass8BT.A06(r6)
            r3 = 2131896797(0x7f1229dd, float:1.9428465E38)
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            r1 = 0
            java.lang.String r0 = "https://whatsapp.com/dl/"
            java.lang.String r1 = X.C17880vN.A0q(r6, r0, r2, r1, r3)
            r0 = 17
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A00(r6, r4, r0, r1)
            r6.finish()
            return
        L_0x028b:
            java.lang.Object r1 = r1.A01
            X.8J6 r1 = (X.AnonymousClass8J6) r1
            X.11P r2 = r1.A07
            X.0ve r8 = r1.A0E
            X.1E7 r0 = r1.A01
            X.1BI r4 = r0.A0J
            X.C17960vV.A07(r4)
            X.11S r3 = r1.A04
            X.10I r5 = r1.A0H
            X.2mw r12 = r1.A00
            X.1hG r10 = r1.A0A
            X.1W6 r9 = r1.A0G
            X.1PP r6 = r1.A0F
            X.121 r13 = r1.A09
            X.1iU r1 = r1.A0D
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r0 = "scheduled-call/sendScheduledCallCancelMessage chatJid="
            X.C17900vP.A0Y(r4, r0, r7)
            r7 = 4164(0x1044, float:5.835E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r7)
            if (r0 == 0) goto L_0x02e1
            X.1BI r5 = r12.A04
            boolean r4 = r12.A08
            java.lang.String r0 = r12.A07
            X.205 r3 = X.AnonymousClass205.A01(r5, r0, r4)
            com.whatsapp.jid.UserJid r0 = r12.A05
            X.A51 r7 = new X.A51
            r7.<init>(r0, r3)
            long r10 = r12.A02
            X.205 r6 = r6.A01(r5, r4)
            long r8 = X.AnonymousClass11P.A01(r2)
            X.23q r5 = new X.23q
            r5.<init>(r6, r7, r8, r10)
            r1.A01(r5)
            return
        L_0x02e1:
            com.whatsapp.jid.UserJid r6 = r12.A05
            boolean r1 = r3.A0O(r6)
            r14 = 0
            java.lang.String r0 = X.AnonymousClass1PP.A00(r3, r2, r14)
            X.205 r7 = X.AnonymousClass205.A01(r4, r0, r1)
            long r15 = r12.A02
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = r12.A07
            boolean r2 = X.C22971Dz.A0T(r6)
            com.whatsapp.jid.UserJid r3 = X.C40811vJ.A01(r3, r2)
            X.C17960vV.A07(r3)
            r2 = 1
            X.23o r11 = new X.23o
            r11.<init>(r7, r0)
            boolean r1 = r7.A02
            r0 = 8
            if (r1 == 0) goto L_0x0310
            r0 = 7
        L_0x0310:
            r11.A01 = r0
            r11.A0d(r3)
            r11.A00 = r2
            r11.A02 = r4
            r11.A01 = r6
            X.3CM r8 = new X.3CM
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r5.CGN(r8)
            return
        L_0x0324:
            java.lang.Object r0 = r1.A01
            X.APB r0 = (X.APB) r0
            X.02n r2 = r0.A01
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            android.content.Intent r1 = X.C108945cZ.A0G(r0)
            r0 = 0
            r2.A02(r0, r1)
            return
        L_0x0335:
            java.lang.Object r0 = r1.A01
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment r0 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment) r0
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r0 = r0.A07
            X.AM7 r1 = com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A03(r0)
            java.lang.Integer r2 = X.A5L.A00(r0)
            r5 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4 = 0
            r6 = 37
            r7 = r5
            r1.A08(r2, r3, r4, r5, r6, r7)
            X.A2L r5 = r0.A0Q
            X.9oJ r4 = r5.A03
            java.util.List r3 = r4.A00()
            r3.clear()
            X.A08 r2 = r4.A00
            X.10I r1 = r2.A03
            r0 = 42
            X.C21451AkI.A01(r1, r2, r3, r0)
            java.util.List r1 = r4.A00()
            X.1DT r0 = r5.A00
            r0.A0F(r1)
            return
        L_0x036d:
            java.lang.Object r3 = r1.A01
            X.AA9 r3 = (X.AA9) r3
            X.1FY r2 = r3.A07
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            android.content.Intent r1 = X.C108945cZ.A0G(r0)
            r0 = 0
            r2.startActivityForResult(r1, r0)
            X.1FY r1 = r3.A07
            goto L_0x0401
        L_0x0381:
            java.lang.Object r2 = r1.A01
            X.1FP r2 = (X.AnonymousClass1FP) r2
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            android.content.Intent r1 = X.C108945cZ.A0G(r0)
            r0 = 35
            r2.startActivityForResult(r1, r0)
            goto L_0x04d4
        L_0x0392:
            java.lang.Object r0 = r1.A01
            X.AP8 r0 = (X.AP8) r0
            java.lang.Object r0 = r0.A01
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r0 = (com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r0
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity.A0r(r0)
            return
        L_0x039e:
            java.lang.Object r0 = r1.A01
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r0 = (com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r0
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity.A0Q(r0)
            return
        L_0x03a6:
            java.lang.Object r3 = r1.A01
            com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment r3 = (com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment) r3
            com.whatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment r2 = new com.whatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment
            r2.<init>()
            X.B7R r0 = r3.A00
            r2.A02 = r0
            boolean r0 = r3.A1b()
            if (r0 == 0) goto L_0x03cb
            X.1GP r0 = r3.A1F()
            X.1jj r1 = new X.1jj
            r1.<init>(r0)
            java.lang.String r0 = "ProductReportReasonDialogFragment"
            r1.A0B(r2, r0)
            r0 = 0
            r1.A00(r0)
        L_0x03cb:
            r3.A29()
            return
        L_0x03cf:
            java.lang.Object r0 = r1.A01
            com.whatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment r0 = (com.whatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment) r0
            r0.A00 = r2
            return
        L_0x03d6:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 106(0x6a, float:1.49E-43)
            goto L_0x0480
        L_0x03de:
            java.lang.Object r1 = r1.A01
            android.content.DialogInterface$OnCancelListener r1 = (android.content.DialogInterface.OnCancelListener) r1
            X.00H r0 = X.C20134A8u.A00
            r1.onCancel(r3)
            return
        L_0x03e8:
            java.lang.Object r1 = r1.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "android.settings.INTERNAL_STORAGE_SETTINGS"
            android.content.Intent r0 = X.C108945cZ.A0G(r0)
            r1.startActivity(r0)
            return
        L_0x03f6:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 3
            goto L_0x0480
        L_0x03fd:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
        L_0x0401:
            r0 = 2
            goto L_0x0480
        L_0x0403:
            java.lang.Object r2 = r1.A01
            X.99j r2 = (X.C1775899j) r2
            android.app.Activity r1 = r2.A01
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass4Yv.A00(r1, r0)
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/dialog/checknorestore/restore"
            goto L_0x0440
        L_0x0411:
            java.lang.Object r2 = r1.A01
            X.99j r2 = (X.C1775899j) r2
            android.app.Activity r1 = r2.A01
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass4Yv.A00(r1, r0)
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/dialog/checknorestore/skiprestore"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0473
        L_0x0422:
            java.lang.Object r0 = r1.A01
            X.99j r0 = (X.C1775899j) r0
            android.app.Activity r1 = r0.A01
            r0 = 105(0x69, float:1.47E-43)
            X.AnonymousClass4Yv.A00(r1, r0)
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/dialog/restoreduetoerror/skiprestore"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x044f
        L_0x0433:
            java.lang.Object r2 = r1.A01
            X.99j r2 = (X.C1775899j) r2
            android.app.Activity r1 = r2.A01
            r0 = 105(0x69, float:1.47E-43)
            X.AnonymousClass4Yv.A00(r1, r0)
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/dialog/restoreduetoerror/restore"
        L_0x0440:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0460
        L_0x0444:
            java.lang.Object r0 = r1.A01
            X.99j r0 = (X.C1775899j) r0
            android.app.Activity r1 = r0.A01
            r0 = 103(0x67, float:1.44E-43)
            X.AnonymousClass4Yv.A00(r1, r0)
        L_0x044f:
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass4Yv.A01(r1, r0)
            return
        L_0x0455:
            java.lang.Object r2 = r1.A01
            X.99j r2 = (X.C1775899j) r2
            android.app.Activity r1 = r2.A01
            r0 = 103(0x67, float:1.44E-43)
            X.AnonymousClass4Yv.A00(r1, r0)
        L_0x0460:
            r1 = 1
            r2.A00 = r1
            r0 = 0
            r2.CGQ(r1, r0)
            return
        L_0x0468:
            java.lang.Object r2 = r1.A01
            X.99j r2 = (X.C1775899j) r2
            android.app.Activity r1 = r2.A01
            r0 = 107(0x6b, float:1.5E-43)
            X.AnonymousClass4Yv.A00(r1, r0)
        L_0x0473:
            r0 = 0
            r2.A00 = r0
            r2.CGQ(r0, r0)
            return
        L_0x047a:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 500(0x1f4, float:7.0E-43)
        L_0x0480:
            X.AnonymousClass4Yv.A00(r1, r0)
            return
        L_0x0484:
            java.lang.Object r5 = r1.A01
            com.facebook.smartcapture.camera.PhotoCameraFragment r5 = (com.facebook.smartcapture.camera.PhotoCameraFragment) r5
            r4 = 0
            java.lang.String r0 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            android.content.Intent r3 = X.C108945cZ.A0G(r0)
            android.content.Context r0 = r5.A14()
            java.lang.String r2 = r0.getPackageName()
            r1 = 0
            java.lang.String r0 = "package"
            android.net.Uri r0 = android.net.Uri.fromParts(r0, r2, r1)
            r3.setData(r0)
            r5.A1k(r3)
            r5.A04 = r4
            return
        L_0x04a7:
            java.lang.Object r5 = r1.A01
            com.facebook.smartcapture.camera.CameraFragment r5 = (com.facebook.smartcapture.camera.CameraFragment) r5
            r4 = 0
            java.lang.String r0 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            android.content.Intent r3 = X.C108945cZ.A0G(r0)
            android.content.Context r0 = r5.A14()
            java.lang.String r2 = r0.getPackageName()
            r1 = 0
            java.lang.String r0 = "package"
            android.net.Uri r0 = android.net.Uri.fromParts(r0, r2, r1)
            r3.setData(r0)
            r5.A1k(r3)
            r5.A02 = r4
            return
        L_0x04ca:
            java.lang.Object r1 = r1.A01
            androidx.preference.ListPreferenceDialogFragmentCompat r1 = (androidx.preference.ListPreferenceDialogFragmentCompat) r1
            r1.A00 = r2
            r0 = -1
            r1.onClick(r3, r0)
        L_0x04d4:
            r3.dismiss()
            return
        L_0x04d8:
            java.lang.String r0 = "accountSwitchingLogger"
            X.C18070vi.A11(r0)
            throw r4
        L_0x04de:
            java.lang.String r0 = "accountSwitcher"
            X.C18070vi.A11(r0)
            throw r4
        L_0x04e4:
            java.lang.String r0 = "accountSwitchingLogger"
            X.C18070vi.A11(r0)
            throw r4
        L_0x04ea:
            java.lang.String r0 = "accountSwitcher"
            X.C18070vi.A11(r0)
            throw r4
        L_0x04f0:
            X.0ve r2 = r6.A0E
            r1 = 12580(0x3124, float:1.7628E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 0
            if (r1 == 0) goto L_0x0523
            X.AnonymousClass4Yv.A01(r6, r0)
            X.A7K r2 = X.A7K.A00()
            java.lang.Class<com.whatsapp.infra.graphql.generated.multi_account.MultiAccountRevokeAccountResponseImpl> r1 = com.whatsapp.infra.graphql.generated.multi_account.MultiAccountRevokeAccountResponseImpl.class
            java.lang.String r0 = "MultiAccountRevokeAccount"
            X.AIj r1 = X.AIj.A00(r2, r1, r0)
            X.1PY r0 = r6.A01
            if (r0 == 0) goto L_0x051d
            X.A2g r1 = r0.A01(r1)
            r0 = 0
            X.Ali r0 = X.C21535Ali.A00(r6, r0)
            r1.A04(r0)
            return
        L_0x051d:
            java.lang.String r0 = "mexGraphQlClient"
            X.C18070vi.A11(r0)
            throw r4
        L_0x0523:
            X.AnonymousClass4Yv.A01(r6, r0)
            X.00H r0 = r6.A08
            if (r0 == 0) goto L_0x05b6
            java.lang.Object r0 = r0.get()
            X.9m7 r0 = (X.C191159m7) r0
            X.Acx r5 = new X.Acx
            r5.<init>(r6)
            java.lang.String r7 = "gcm"
            r1 = 0
            r9 = 1
            X.00H r4 = r0.A02
            java.lang.String r8 = X.C17890vO.A0T(r4)
            r0 = 11
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.String r0 = "apple"
            r2[r1] = r0
            java.lang.String r0 = "apple_dev"
            r2[r9] = r0
            r1 = 2
            java.lang.String r0 = "ent"
            r2[r1] = r0
            r1 = 3
            java.lang.String r0 = "fb"
            r2[r1] = r0
            r1 = 4
            java.lang.String r0 = "fbns"
            r2[r1] = r0
            r0 = 5
            r2[r0] = r7
            r1 = 6
            java.lang.String r0 = "kaios"
            r2[r1] = r0
            r1 = 7
            java.lang.String r0 = "smbi"
            r2[r1] = r0
            r1 = 8
            java.lang.String r0 = "smbi_dev"
            r2[r1] = r0
            java.lang.String r0 = "web"
            r2[r3] = r0
            r1 = 10
            java.lang.String r0 = "wns"
            java.util.List r6 = X.C18070vi.A0O(r0, r2, r1)
            java.lang.String r3 = "iq"
            X.1cX r2 = X.C108945cZ.A0t(r3)
            java.lang.String r0 = "clear"
            X.1cX r1 = X.C108945cZ.A0t(r0)
            java.lang.String r0 = "platform"
            r1.A08(r7, r0, r6)
            X.1ca r2 = X.C29591cX.A00(r1, r2)
            X.1cX r1 = X.C108945cZ.A0t(r3)
            X.C108995ce.A1E(r1)
            java.lang.String r0 = "urn:xmpp:whatsapp:push"
            X.AnonymousClass8BY.A17(r1, r0)
            X.AnonymousClass8BY.A15(r1, r8)
            java.lang.Boolean r0 = X.C17960vV.A01
            r1.A06(r2)
            X.1ca r7 = r1.A03()
            r0 = 7
            X.Ach r6 = new X.Ach
            r6.<init>(r5, r0)
            X.1OZ r5 = X.C17880vN.A0U(r4)
            r10 = 32000(0x7d00, double:1.581E-319)
            r5.A0N(r6, r7, r8, r9, r10)
            return
        L_0x05b6:
            java.lang.String r0 = "pushXmppMethods"
            X.C18070vi.A11(r0)
            throw r4
        L_0x05bc:
            java.lang.String r0 = "accountSwitcherBridge"
            X.C18070vi.A11(r0)
            throw r4
        L_0x05c2:
            java.lang.String r0 = "accountSwitchingLogger"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20151A9n.onClick(android.content.DialogInterface, int):void");
    }
}
