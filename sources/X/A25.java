package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public final class A25 {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass190 A02;
    public final C196109uT A03;
    public final C30801eX A04;
    public final AnonymousClass00H A05;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r0 == 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(java.lang.String r5) {
        /*
            r4 = 0
            if (r5 == 0) goto L_0x0036
            org.json.JSONObject r1 = X.C17880vN.A16(r5)     // Catch:{ all -> 0x0017 }
            java.lang.String r0 = "error_msg"
            java.lang.String r3 = r1.optString(r0)     // Catch:{ all -> 0x0017 }
            if (r3 == 0) goto L_0x0015
            int r0 = r3.length()     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x001c
        L_0x0015:
            r3 = r4
            goto L_0x001c
        L_0x0017:
            r0 = move-exception
            X.1IU r3 = X.C108945cZ.A1J(r0)
        L_0x001c:
            java.lang.Throwable r2 = X.C30671eK.A00(r3)
            if (r2 == 0) goto L_0x002f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FlowsLogger/FlowsDataUtil/processErrorPayload() - null payload "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x002f:
            boolean r0 = r3 instanceof X.AnonymousClass1IU
            if (r0 != 0) goto L_0x0034
            r4 = r3
        L_0x0034:
            java.lang.String r4 = (java.lang.String) r4
        L_0x0036:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A25.A00(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        if (r12 != null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0076, code lost:
        if (r12 != null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007a, code lost:
        if (r12 != null) goto L_0x002d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.app.Activity r12, X.AnonymousClass1PM r13, X.A0M r14, java.lang.String r15) {
        /*
            r11 = this;
            r4 = 0
            r0 = 4
            r2 = r14
            X.C18070vi.A0d(r14, r0)
            r8 = 0
            if (r12 == 0) goto L_0x0075
            android.content.Intent r0 = r12.getIntent()
            if (r0 == 0) goto L_0x0075
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x0075
            java.lang.String r0 = "action_name"
            java.lang.String r5 = r1.getString(r0)
        L_0x001b:
            android.content.Intent r0 = r12.getIntent()
            if (r0 == 0) goto L_0x0079
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x0079
            java.lang.String r0 = "flow_id"
            java.lang.String r6 = r1.getString(r0)
        L_0x002d:
            android.content.Intent r0 = r12.getIntent()
            if (r0 == 0) goto L_0x007d
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x007d
            java.lang.String r0 = "chat_id"
            java.lang.String r0 = r1.getString(r0)
        L_0x003f:
            X.1BI r3 = X.AnonymousClass3MX.A0l(r0)
            if (r12 == 0) goto L_0x0071
            android.content.Intent r0 = r12.getIntent()
            if (r0 == 0) goto L_0x0071
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x0071
            java.lang.String r0 = "message_id"
            java.lang.String r7 = r1.getString(r0)
        L_0x0057:
            android.content.Intent r0 = r12.getIntent()
            if (r0 == 0) goto L_0x0069
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x0069
            java.lang.String r0 = "session_id"
            java.lang.String r8 = r1.getString(r0)
        L_0x0069:
            r0 = r11
            r1 = r13
            r9 = r15
            r10 = r4
            r0.A03(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0071:
            r7 = r4
            if (r12 == 0) goto L_0x0069
            goto L_0x0057
        L_0x0075:
            r5 = r4
            if (r12 == 0) goto L_0x0079
            goto L_0x001b
        L_0x0079:
            r6 = r4
            if (r12 == 0) goto L_0x007d
            goto L_0x002d
        L_0x007d:
            r0 = r4
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A25.A01(android.app.Activity, X.1PM, X.A0M, java.lang.String):void");
    }

    public final void A02(AnonymousClass1PM r16, A0M a0m, C195719tn r18, int i) {
        String str;
        A0M a0m2 = a0m;
        C18070vi.A0d(a0m2, 3);
        C195719tn r4 = r18;
        UserJid userJid = r4.A02;
        String str2 = r4.A07;
        AnonymousClass206 A022 = AnonymousClass8BR.A0N(this.A05).A02(AnonymousClass205.A01(userJid, str2, false));
        JSONObject A15 = C17880vN.A15();
        String A012 = A4O.A00.A01(this.A03, str2, false);
        String A0Y = AnonymousClass8BY.A0Y(r4.A08);
        C18070vi.A0X(A0Y);
        try {
            A15.put("cta", "galaxy_message");
            A15.put("flow_id", r4.A04);
            A15.put("extensions_message_id", A012);
            A15.put("session_id", A0Y);
            A15.put("data_channel_navigation", r4.A09);
            int i2 = r4.A00;
            if (i2 != -1) {
                if (C18020vd.A05(C18040vf.A02, this.A00, 11785)) {
                    A15.put("carousel_card_index", i2);
                }
            }
        } catch (JSONException e) {
            Log.w(C17900vP.A0C("SFlowsLogger/PhoenixFlowsMessage/reportWamEvent()/Error - ", AnonymousClass000.A10(), e));
        }
        int A002 = AnonymousClass9Q5.A00(r16.A01(userJid));
        C60082nM A032 = this.A04.A03(userJid);
        if (A022 != null) {
            ((C62242r5) this.A01.get()).A01(A022);
        }
        String A0H = C18070vi.A0H(A15);
        Integer valueOf = Integer.valueOf(A002);
        String str3 = null;
        if (A032 != null) {
            str3 = A032.A08;
            str = A032.A05;
        } else {
            str = null;
        }
        a0m2.A01(userJid, A022, valueOf, A0H, str3, str, str2, i);
    }

    public final void A03(AnonymousClass1PM r15, A0M a0m, AnonymousClass1BI r17, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass206 r7;
        String str7;
        UserJid userJid;
        Integer num;
        C60082nM r0;
        String str8;
        String str9 = str3;
        AnonymousClass1BI r6 = r17;
        A0M a0m2 = a0m;
        C18070vi.A0d(a0m2, 8);
        JSONObject A15 = C17880vN.A15();
        String str10 = null;
        if (str3 != null) {
            r7 = AnonymousClass8BR.A0N(this.A05).A02(AnonymousClass205.A01(r6, str9, false));
            A15.put("extensions_message_id", A4O.A00.A01(this.A03, str9, false));
        } else {
            r7 = null;
        }
        A15.put("cta", str);
        A15.put("flow_id", str2);
        String str11 = str5;
        A15.put("error_type", str11);
        if (str4 != null) {
            str7 = AnonymousClass8BY.A0Y(str4);
            C18070vi.A0X(str7);
        } else {
            str7 = null;
        }
        A15.put("session_id", str7);
        if (bool != null) {
            A15.put("extension_restored_from_cache", bool.booleanValue() ? 1 : 0);
        }
        if (r6 instanceof UserJid) {
            userJid = (UserJid) r6;
            if (userJid != null) {
                num = Integer.valueOf(AnonymousClass9Q5.A00(r15.A01(userJid)));
            }
            num = null;
        } else {
            userJid = null;
            num = null;
        }
        if (r7 != null) {
            ((C62242r5) this.A01.get()).A01(r7);
        }
        if (userJid != null) {
            r0 = this.A04.A03(userJid);
        } else {
            r0 = null;
        }
        String A0H = C18070vi.A0H(A15);
        if (r0 != null) {
            str8 = r0.A08;
            str10 = r0.A05;
        } else {
            str8 = null;
        }
        if (str3 == null) {
            str9 = "";
        }
        a0m2.A01(userJid, r7, num, A0H, str8, str10, str9, 3);
        if (C18020vd.A05(C18040vf.A02, this.A00, 3178)) {
            this.A02.A0G(str11, str6, false);
        }
    }

    public A25(AnonymousClass190 r2, C196109uT r3, C30801eX r4, C18030ve r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r5, r6, r4, r3);
        C18070vi.A0d(r7, 6);
        this.A02 = r2;
        this.A00 = r5;
        this.A05 = r6;
        this.A04 = r4;
        this.A03 = r3;
        this.A01 = r7;
    }
}
