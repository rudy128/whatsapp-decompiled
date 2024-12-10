package X;

import android.app.Activity;
import java.util.List;

/* renamed from: X.721  reason: invalid class name */
public final class AnonymousClass721 {
    public boolean A00;
    public final AnonymousClass1KB A01;
    public final C34991lS A02;
    public final C18030ve A03;
    public final C34951lN A04;
    public final C30321dk A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B = C217517g.A00(16503);
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;

    public static final void A01(AnonymousClass721 r3, boolean z) {
        r3.A00 = true;
        if (!z) {
            r3.A01.A0J(new C146787Qp(r3, 32));
        }
        C18070vi.A0d("WfalLauncherProxy/onLoadingAttemptComplete", 0);
    }

    public final void A03(AnonymousClass01E r21, C1604788q r22, Integer num, String str, String str2, String str3) {
        List list;
        String str4;
        C135566sP r12;
        C131806lh r11;
        String str5;
        AnonymousClass01E r9 = r21;
        C18070vi.A0d(r9, 0);
        String str6 = str3;
        C18070vi.A0d(str6, 3);
        C18030ve r6 = this.A03;
        C18040vf r5 = C18040vf.A02;
        String str7 = str;
        if (C18020vd.A05(r5, r6, 10451) && str7.equals("app_settings")) {
            int A002 = ((C35101le) this.A0C.get()).A00(C35131lh.A02);
            if (A002 == 4) {
                C35051lZ.A00((C35051lZ) this.A08.get()).getInt("pref_number_of_times_privacy_nux_seen", 0);
            } else if (A002 != 3 && num == null) {
                r12 = new C135566sP((long) C18020vd.A00(r5, r6, 11548), true, C18020vd.A05(r5, r6, 11549));
                r11 = null;
                list = null;
                str4 = "com.bloks.www.fx.waffle.main_settings";
                A02(r9, r22, r11, r12, str4, str7, str2, "settings_activity", str6, list, 444794589);
            }
        }
        list = null;
        r12 = new C135566sP(0, false, true);
        if (num != null) {
            r11 = new C131806lh();
            if (1 - num.intValue() != 0) {
                str5 = "cross_posting";
            } else {
                str5 = "wamo_preferences";
            }
            r11.A00.put("deeplink_destination", str5);
        } else {
            r11 = null;
        }
        str4 = "com.bloks.www.fxcal.settings.async";
        A02(r9, r22, r11, r12, str4, str7, str2, "settings_activity", str6, list, 444794589);
    }

    public static final void A00(Activity activity, AnonymousClass721 r4) {
        r4.A01.A0J(new C146787Qp(activity, 31));
        C30321dk r42 = r4.A05;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WaffleClientAndBloksAcFlowLoggerImpl/cancelUserFlowWithPoint: marker=");
        A10.append(C24461Kk.A00(924663622));
        A10.append(", point=");
        C108995ce.A1O(A10, "SEE_AC_LOAD_ERROR");
        r42.A00.BLP(r42.A00, "SEE_AC_LOAD_ERROR");
        r42.A00 = -1;
    }

    public AnonymousClass721(AnonymousClass1KB r2, C34991lS r3, C18030ve r4, C34951lN r5, C30321dk r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        C18070vi.A0w(r4, r2, r5, r7, r3);
        C18070vi.A0x(r6, r8, r9, r10, r11);
        C72473Md.A1L(r12, r13);
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A09 = r7;
        this.A02 = r3;
        this.A05 = r6;
        this.A06 = r8;
        this.A0D = r9;
        this.A0C = r10;
        this.A0A = r11;
        this.A08 = r12;
        this.A07 = r13;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0232, code lost:
        r11 = "UNSUPPORTED_FLOW";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x023c, code lost:
        if (r12 == false) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x023e, code lost:
        r11 = "STATUS_PRIVACY_SETTINGS_FLOW";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x025a, code lost:
        if (r4.equals(r0) != false) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0263, code lost:
        if (r4.equals("wa_wamo") != false) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0265, code lost:
        r11 = "AL_ENTRY_FLOW";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x026f, code lost:
        if (r4.equals("wa_crosspost_new_status") == false) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0056, code lost:
        if (X.AnonymousClass732.A00(r0) == null) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass01E r27, X.C1604788q r28, X.C131806lh r29, X.C135566sP r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.util.List r36, int r37) {
        /*
            r26 = this;
            r8 = 0
            java.lang.String r1 = "flow"
            r12 = r29
            r4 = r32
            if (r29 == 0) goto L_0x0279
            r5 = 1
            java.util.Map r0 = r12.A00
            r0.put(r1, r4)
            r19 = r12
        L_0x0011:
            java.lang.String r13 = "entrypoint"
            r0 = r19
            java.util.Map r2 = r0.A00
            r2.put(r13, r4)
            java.lang.String r1 = "marker_id"
            r3 = r37
            java.lang.String r0 = java.lang.String.valueOf(r3)
            X.C18070vi.A0d(r0, r5)
            r2.put(r1, r0)
            X.7C2 r18 = new X.7C2
            r5 = r26
            r2 = r28
            r25 = r30
            r1 = r18
            r0 = r25
            r1.<init>(r2, r5, r0)
            java.lang.String r0 = "WfalLauncherProxy/launch Start Launching"
            X.C31081ez.A02(r0)
            r0 = r25
            boolean r0 = r0.A02
            r17 = r0
            X.1lS r0 = r5.A02
            r24 = r0
            X.1lW r16 = X.C35011lV.A00
            r1 = r0
            r0 = r16
            X.732 r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = X.AnonymousClass732.A00(r0)
            r14 = 1
            if (r0 != 0) goto L_0x0059
        L_0x0058:
            r14 = 0
        L_0x0059:
            X.1lN r0 = r5.A04
            r23 = r0
            java.lang.Boolean r0 = r23.A05()
            boolean r2 = X.C72453Mb.A1Y(r0)
            X.00H r0 = r5.A09
            java.lang.Object r11 = r0.get()
            X.6hm r11 = (X.C129426hm) r11
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x0092
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AlLoadLatencyLogger/endDanglingMarker for "
            r1.append(r0)
            int r0 = r11.A00
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)
            X.C18070vi.A0d(r0, r8)
            X.19T r9 = r11.A03
            int r7 = r11.A00
            int r6 = r11.A01
            r1 = 87
            java.lang.String r0 = "MARKER_STARTED_BEFORE_PREVIOUS_ENDED"
            r9.Biv(r7, r6, r1, r0)
            r11.A02 = r8
        L_0x0092:
            r11.A00 = r3
            r11.A01 = r3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AlLoadLatencyLogger/startQPLLogging for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r10 = " (instance key): "
            r1.append(r10)
            r1.append(r3)
            java.lang.String r0 = ", entrypoint: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", bloksAppId: "
            r1.append(r0)
            r6 = r31
            r1.append(r6)
            java.lang.String r0 = ", isPostConsent: "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = ", isPaused: "
            java.lang.String r0 = X.C17900vP.A0D(r0, r1, r2)
            X.C18070vi.A0d(r0, r8)
            X.19T r9 = r11.A03
            int r1 = r11.A00
            int r0 = r11.A01
            r9.markerStart(r1, r0)
            java.lang.String r7 = "TRIGGER_OPEN"
            if (r17 != 0) goto L_0x00e1
            int r1 = r11.A00
            int r0 = r11.A01
            r9.markerPoint((int) r1, (int) r0, (java.lang.String) r7)
        L_0x00e1:
            int r1 = r11.A00
            int r0 = r11.A01
            r9.markerAnnotate((int) r1, (int) r0, (java.lang.String) r13, (java.lang.String) r4)
            int r1 = r11.A00
            int r0 = r11.A01
            java.lang.String r3 = "is_post_consent"
            r9.markerAnnotate((int) r1, (int) r0, (java.lang.String) r3, (boolean) r14)
            int r0 = r11.A00
            r15 = r0
            int r0 = r11.A01
            r1 = r0
            java.lang.String r0 = "is_paused"
            r9.markerAnnotate((int) r15, (int) r1, (java.lang.String) r0, (boolean) r2)
            int r1 = r11.A00
            int r0 = r11.A01
            java.lang.String r2 = "bloks_app_id"
            r9.markerAnnotate((int) r1, (int) r0, (java.lang.String) r2, (java.lang.String) r6)
            int r1 = r11.A00
            r0 = 444794589(0x1a8306dd, float:5.419142E-23)
            if (r1 != r0) goto L_0x0138
            java.lang.String r0 = "app_settings"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0138
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AlLoadLatencyLogger/startQPLLogging: Starting duplicate logger for "
            r11.append(r0)
            r1 = 857808852(0x33211fd4, float:3.751468E-8)
            r11.append(r1)
            java.lang.String r0 = X.AnonymousClass001.A1I(r10, r11, r1)
            X.C18070vi.A0d(r0, r8)
            r9.markerStart(r1, r1)
            if (r17 != 0) goto L_0x0132
            r9.markerPoint((int) r1, (int) r1, (java.lang.String) r7)
        L_0x0132:
            r9.markerAnnotate((int) r1, (int) r1, (java.lang.String) r13, (java.lang.String) r4)
            r9.markerAnnotate((int) r1, (int) r1, (java.lang.String) r3, (boolean) r14)
        L_0x0138:
            if (r29 == 0) goto L_0x0276
            java.lang.String r1 = "target_account_type"
            java.util.Map r0 = r12.A00
            java.lang.Object r7 = r0.get(r1)
        L_0x0142:
            X.1dk r3 = r5.A05
            java.lang.String r0 = "com.bloks.www.fxcal.waffle.router.async"
            boolean r13 = r6.equals(r0)
            if (r13 == 0) goto L_0x0272
            java.lang.String r11 = "TAP_XPOST_UPSELL"
        L_0x014e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WaffleClientAndBloksAcFlowLoggerImpl/startUserFlowWithPoint: marker="
            r1.append(r0)
            r0 = 924663622(0x371d3f46, float:9.372661E-6)
            java.lang.String r0 = X.C24461Kk.A00(r0)
            r1.append(r0)
            java.lang.String r0 = ", point="
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r11, r1)
            X.C18070vi.A0d(r0, r8)
            r3.A01()
            X.1dL r12 = r3.A00
            r9 = 0
            r0 = 32
            long r9 = r9 << r0
            r0 = 924663622(0x371d3f46, double:4.568445296E-315)
            long r0 = r0 | r9
            r3.A00 = r0
            X.2kh r10 = new X.2kh
            r9 = r33
            r10.<init>(r9, r8)
            r12.BLQ(r10, r0)
            X.1dL r10 = r3.A00
            long r0 = r3.A00
            r10.flowMarkPoint(r0, r11)
            X.0ve r10 = r3.A02
            r1 = 6084(0x17c4, float:8.525E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r10, r1)
            if (r0 == 0) goto L_0x01a5
            X.0z4 r0 = r3.A01
            java.lang.String r1 = r0.A0d()
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "encrypted_rid"
            r3.A05(r0, r1)
        L_0x01a5:
            java.lang.String r10 = "flow_type"
            java.lang.String r1 = "wa_crosspost_status_privacy_settings"
            boolean r12 = r4.equals(r1)
            java.lang.String r11 = "LINKING_FLOW"
            if (r12 == 0) goto L_0x022b
            if (r13 == 0) goto L_0x022b
        L_0x01b3:
            r3.A05(r10, r11)
            java.lang.String r0 = "ui_entrypoint"
            r3.A05(r0, r9)
            r3.A05(r2, r6)
            if (r4 != r1) goto L_0x01d7
            X.00H r0 = r5.A0A
            java.lang.Object r0 = r0.get()
            X.2mM r0 = (X.C59472mM) r0
            X.6zR r0 = r0.A00()
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0228
            java.lang.String r1 = "on"
        L_0x01d2:
            java.lang.String r0 = "init_autoshare_state"
            r3.A05(r0, r1)
        L_0x01d7:
            if (r7 == 0) goto L_0x01de
            java.lang.String r0 = "init_linking_target_account_type"
            r3.A05(r0, r7)
        L_0x01de:
            r5.A00 = r8
            X.1KB r3 = r5.A01
            r0 = 33
            X.7Qp r2 = new X.7Qp
            r2.<init>(r5, r0)
            r0 = 400(0x190, double:1.976E-321)
            r3.A0K(r2, r0)
            r2 = 1
            java.lang.String r0 = "com.bloks.www.fxcal.playground.whatsapp_link"
            boolean r0 = r0.equals(r6)
            r13 = r27
            r20 = r34
            r21 = r35
            r22 = r36
            if (r0 != 0) goto L_0x0288
            r1 = r24
            r0 = r16
            X.732 r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0213
            java.lang.Boolean r1 = r23.A05()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            if (r1 != r0) goto L_0x0288
        L_0x0213:
            X.7QW r12 = new X.7QW
            r14 = r18
            r15 = r19
            r16 = r5
            r17 = r25
            r18 = r6
            r19 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3.CGP(r12)
            return
        L_0x0228:
            java.lang.String r1 = "off"
            goto L_0x01d2
        L_0x022b:
            int r0 = r4.hashCode()
            switch(r0) {
                case -172475824: goto L_0x0236;
                case -56483: goto L_0x0242;
                case 329595890: goto L_0x0245;
                case 949197458: goto L_0x0248;
                case 975802643: goto L_0x023c;
                case 1107159617: goto L_0x025d;
                case 1231505537: goto L_0x0254;
                case 1709381253: goto L_0x0269;
                default: goto L_0x0232;
            }
        L_0x0232:
            java.lang.String r11 = "UNSUPPORTED_FLOW"
            goto L_0x01b3
        L_0x0236:
            java.lang.String r0 = "wa_status_privacy"
            boolean r12 = r4.equals(r0)
        L_0x023c:
            if (r12 == 0) goto L_0x0232
            java.lang.String r11 = "STATUS_PRIVACY_SETTINGS_FLOW"
            goto L_0x01b3
        L_0x0242:
            java.lang.String r0 = "wa_crosspost_error_unlinked"
            goto L_0x0256
        L_0x0245:
            java.lang.String r0 = "wa_auto_crosspost_notice"
            goto L_0x0256
        L_0x0248:
            java.lang.String r0 = "wa_crosspost_existing_status"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0232
            java.lang.String r11 = "CAL_FLOW"
            goto L_0x01b3
        L_0x0254:
            java.lang.String r0 = "app_settings"
        L_0x0256:
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0265
            goto L_0x0232
        L_0x025d:
            java.lang.String r0 = "wa_wamo"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0232
        L_0x0265:
            java.lang.String r11 = "AL_ENTRY_FLOW"
            goto L_0x01b3
        L_0x0269:
            java.lang.String r0 = "wa_crosspost_new_status"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x01b3
            goto L_0x0232
        L_0x0272:
            java.lang.String r11 = "TAP_AL_ENTRY_POINT"
            goto L_0x014e
        L_0x0276:
            r7 = 0
            goto L_0x0142
        L_0x0279:
            X.6lh r19 = new X.6lh
            r19.<init>()
            r5 = 1
            r0 = r19
            java.util.Map r0 = r0.A00
            r0.put(r1, r4)
            goto L_0x0011
        L_0x0288:
            X.00H r0 = r5.A0D
            java.lang.Object r0 = r0.get()
            X.6mL r0 = (X.C132186mL) r0
            X.7Gb r12 = new X.7Gb
            r14 = r18
            r15 = r19
            r16 = r5
            r17 = r25
            r18 = r6
            r19 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0.A00(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass721.A02(X.01E, X.88q, X.6lh, X.6sP, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int):void");
    }
}
