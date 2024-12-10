package X;

import com.whatsapp.util.Log;
import java.util.List;

public final class A7P {
    public static final C189089iU A0K = new Object();
    public Integer A00;
    public Integer A01;
    public String A02;
    public String A03;
    public String A04;
    public final AnonymousClass190 A05;
    public final AnonymousClass19D A06;
    public final C18030ve A07;
    public final AnonymousClass18K A08;
    public final C196129uV A09;
    public final AnonymousClass1Ez A0A;
    public final AnonymousClass10I A0B;
    public final AnonymousClass00H A0C;
    public final List A0D;
    public final C196139uW A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G = C217517g.A00(49460);
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public volatile String A0J;

    public final synchronized void A03() {
        String str = this.A0J;
        if (str != null) {
            A02(this, str, "completed", (String) null);
        }
    }

    public final void A05(int i, int i2, String str, long j) {
        String str2 = str;
        this.A0B.CGF(new C21370Aiz(this, str2, i2, i, j));
    }

    public final synchronized void A06(String str) {
        A03();
        A02(this, str, "started", (String) null);
        this.A0J = str;
    }

    public final synchronized void A07(String str, String str2) {
        A02(this, str, str2, (String) null);
        this.A0J = str;
    }

    public static final C171778sG A00(A7P a7p, int i) {
        long A022;
        long j;
        AnonymousClass00H r4 = a7p.A09.A01;
        String string = C17880vN.A0B(r4).getString("/export/logging/attemptId", (String) null);
        if (string == null) {
            string = C17890vO.A0Q();
            C17880vN.A1E(AnonymousClass8BV.A06(r4), "/export/logging/attemptId", string);
        }
        C18070vi.A0X(string);
        C171778sG r3 = new C171778sG();
        r3.A0A = Integer.valueOf(i);
        r3.A0Q = AnonymousClass8BR.A0q(a7p.A0C).A07();
        r3.A0M = string;
        r3.A04 = a7p.A00;
        r3.A07 = a7p.A01;
        r3.A0K = C17880vN.A0n(C17890vO.A00(C17880vN.A0B(r4), "/export/protocolVersion"));
        synchronized (a7p) {
            A022 = a7p.A0A.A02();
        }
        r3.A0C = Long.valueOf(C17880vN.A04(A022));
        if (i == 0) {
            j = ((AnonymousClass1a6) a7p.A0H.get()).A00(AnonymousClass8BV.A05(a7p.A0I));
        } else if (i != 4 && i != 11 && i != 13 && i != 15) {
            return r3;
        } else {
            AnonymousClass1a6 r2 = (AnonymousClass1a6) a7p.A0H.get();
            if (i == 11) {
                r3.A00 = Double.valueOf((double) r2.A00(a7p.A0E.A00()));
            } else if (i == 15) {
                AnonymousClass00H r42 = a7p.A0G;
                r3.A0G = C17880vN.A0n(C20029A3y.A00((C20029A3y) r42.get(), "import/msg/success"));
                r3.A0F = C17880vN.A0n(C20029A3y.A00((C20029A3y) r42.get(), "import/msg/failed"));
                r3.A0E = C17880vN.A0n(C20029A3y.A00((C20029A3y) r42.get(), "import/msg/file/success"));
                r3.A0D = C17880vN.A0n(C20029A3y.A00((C20029A3y) r42.get(), "import/msg/file/failed"));
            }
            Long A002 = ((C26291Ro) a7p.A0F.get()).A00();
            long A052 = AnonymousClass8BV.A05(a7p.A0I);
            if (A002 != null) {
                r3.A02 = Double.valueOf((double) r2.A00(A002.longValue()));
            }
            j = r2.A00(A052);
        }
        r3.A0L = Long.valueOf(j);
        return r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C171778sG r9, X.A7P r10) {
        /*
            java.lang.Integer r2 = r9.A0A
            java.lang.Integer r1 = X.AnonymousClass3MY.A0f()
            java.lang.Integer r0 = r9.A04
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01be
            if (r2 == 0) goto L_0x01be
            int r1 = r2.intValue()
            r0 = 5
            if (r1 < r0) goto L_0x01be
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "p2p/fpm/LoggingManager/event saved to be transferred and logged from receiver, value: "
            X.C17900vP.A0Y(r9, r0, r1)
            java.util.List r0 = r10.A0D
            r0.add(r9)
        L_0x0025:
            X.0ve r2 = r10.A07
            r1 = 11638(0x2d76, float:1.6308E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00fa
            java.lang.Integer r0 = r10.A00
            if (r0 == 0) goto L_0x00fa
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x00fa
            java.lang.Integer r1 = r9.A0A
            java.lang.Integer r7 = r9.A08
            java.lang.Integer r6 = r9.A03
            if (r1 == 0) goto L_0x00fa
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r0 = "chat-transfer-"
            r4.append(r0)
            X.9iU r5 = A0K
            int r3 = r1.intValue()
            switch(r3) {
                case 0: goto L_0x0172;
                case 1: goto L_0x0176;
                case 2: goto L_0x017a;
                case 3: goto L_0x017e;
                case 4: goto L_0x0182;
                case 5: goto L_0x0186;
                case 6: goto L_0x018a;
                case 7: goto L_0x018e;
                case 8: goto L_0x0192;
                case 9: goto L_0x0196;
                case 10: goto L_0x019a;
                case 11: goto L_0x019e;
                case 12: goto L_0x01a2;
                case 13: goto L_0x01a6;
                case 14: goto L_0x01aa;
                case 15: goto L_0x01ae;
                case 16: goto L_0x01b2;
                case 17: goto L_0x01b6;
                case 18: goto L_0x01ba;
                default: goto L_0x0055;
            }
        L_0x0055:
            java.lang.String r2 = "FpmEventType"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "p2p/fpm/LoggingManager/Unknown enum value for "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ": "
            X.C17900vP.A0i(r0, r1, r3)
            java.lang.String r0 = "unknown"
        L_0x006a:
            java.lang.String r4 = X.AnonymousClass000.A0y(r0, r4)
            if (r7 == 0) goto L_0x0117
            int r0 = r7.intValue()
            java.lang.String r7 = r5.A00(r0)
        L_0x0078:
            X.00H r0 = r10.A0C
            X.A8V r3 = X.AnonymousClass8BR.A0q(r0)
            java.lang.String r8 = r9.A0M
            java.lang.String r6 = r10.A03
            java.lang.Integer r2 = r9.A05
            java.lang.Integer r0 = r9.A09
            if (r0 == 0) goto L_0x0114
            int r1 = r0.intValue()
            if (r1 != 0) goto L_0x00fb
            java.lang.String r9 = "pre_connection"
        L_0x0090:
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.0vl r0 = r3.A07
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x00fa
            X.9np r5 = new X.9np
            r5.<init>()
            java.lang.String r0 = "event_name"
            r5.A01(r0, r4)
            java.lang.String r1 = "funnel_id"
            java.lang.String r0 = r3.A07()
            r5.A01(r1, r0)
            java.lang.String r1 = "rc"
            X.0vl r0 = r3.A08
            java.lang.String r0 = X.AnonymousClass3MW.A0y(r0)
            r5.A01(r1, r0)
            if (r8 == 0) goto L_0x00c1
            java.lang.String r0 = "ios_attempt_id"
            r5.A01(r0, r8)
        L_0x00c1:
            if (r7 == 0) goto L_0x00c8
            java.lang.String r0 = "client_error_type"
            r5.A01(r0, r7)
        L_0x00c8:
            if (r6 == 0) goto L_0x00cf
            java.lang.String r0 = "fpm_entry_point"
            r5.A01(r0, r6)
        L_0x00cf:
            if (r9 == 0) goto L_0x00d6
            java.lang.String r0 = "fpm_error_phase"
            r5.A01(r0, r9)
        L_0x00d6:
            if (r2 == 0) goto L_0x00e1
            int r1 = r2.intValue()
            java.lang.String r0 = "sim_state"
            r5.A00(r0, r1)
        L_0x00e1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FunnelLogger/event-name: "
            X.C17900vP.A0f(r0, r4, r1)
            X.00H r0 = r3.A05
            X.10I r2 = X.AnonymousClass3MX.A0x(r0)
            r1 = 43
            X.7Pk r0 = new X.7Pk
            r0.<init>(r3, r5, r1)
            r2.CGF(r0)
        L_0x00fa:
            return
        L_0x00fb:
            r0 = 1
            if (r1 != r0) goto L_0x0101
            java.lang.String r9 = "connection"
            goto L_0x0090
        L_0x0101:
            r0 = 2
            if (r1 != r0) goto L_0x0107
            java.lang.String r9 = "export"
            goto L_0x0090
        L_0x0107:
            r0 = 3
            if (r1 != r0) goto L_0x010d
            java.lang.String r9 = "transfer"
            goto L_0x0090
        L_0x010d:
            r0 = 4
            if (r1 != r0) goto L_0x0114
            java.lang.String r9 = "import"
            goto L_0x0090
        L_0x0114:
            r9 = 0
            goto L_0x0090
        L_0x0117:
            if (r6 == 0) goto L_0x016f
            int r3 = r6.intValue()
            switch(r3) {
                case 0: goto L_0x0137;
                case 1: goto L_0x013b;
                case 2: goto L_0x013f;
                case 3: goto L_0x0143;
                case 4: goto L_0x0147;
                case 5: goto L_0x014b;
                case 6: goto L_0x014f;
                case 7: goto L_0x0153;
                case 8: goto L_0x0157;
                case 9: goto L_0x015b;
                case 10: goto L_0x015f;
                case 11: goto L_0x0163;
                case 12: goto L_0x0167;
                case 13: goto L_0x016b;
                default: goto L_0x0120;
            }
        L_0x0120:
            java.lang.String r2 = "FpmCancellationReasonType"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "p2p/fpm/LoggingManager/Unknown enum value for "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ": "
            X.C17900vP.A0i(r0, r1, r3)
            java.lang.String r7 = "unknown"
            goto L_0x0078
        L_0x0137:
            java.lang.String r7 = "cancel_on_landing_screen"
            goto L_0x0078
        L_0x013b:
            java.lang.String r7 = "cancel_on_qr_code_scan_screen"
            goto L_0x0078
        L_0x013f:
            java.lang.String r7 = "cancel_on_qr_code_display_screen"
            goto L_0x0078
        L_0x0143:
            java.lang.String r7 = "cancel_during_pairing"
            goto L_0x0078
        L_0x0147:
            java.lang.String r7 = "cancel_during_export"
            goto L_0x0078
        L_0x014b:
            java.lang.String r7 = "cancel_during_transfer"
            goto L_0x0078
        L_0x014f:
            java.lang.String r7 = "cancel_during_import"
            goto L_0x0078
        L_0x0153:
            java.lang.String r7 = "permissions_needed_not_granted"
            goto L_0x0078
        L_0x0157:
            java.lang.String r7 = "wifi_off"
            goto L_0x0078
        L_0x015b:
            java.lang.String r7 = "location_off"
            goto L_0x0078
        L_0x015f:
            java.lang.String r7 = "local_network_not_granted"
            goto L_0x0078
        L_0x0163:
            java.lang.String r7 = "network_not_connected"
            goto L_0x0078
        L_0x0167:
            java.lang.String r7 = "cancellation_on_other_device"
            goto L_0x0078
        L_0x016b:
            java.lang.String r7 = "hotspot_on"
            goto L_0x0078
        L_0x016f:
            r7 = 0
            goto L_0x0078
        L_0x0172:
            java.lang.String r0 = "canceled"
            goto L_0x006a
        L_0x0176:
            java.lang.String r0 = "failed"
            goto L_0x006a
        L_0x017a:
            java.lang.String r0 = "attempt_to_open_landing_screen"
            goto L_0x006a
        L_0x017e:
            java.lang.String r0 = "open_landing_screen"
            goto L_0x006a
        L_0x0182:
            java.lang.String r0 = "started"
            goto L_0x006a
        L_0x0186:
            java.lang.String r0 = "open_qr_code_screen"
            goto L_0x006a
        L_0x018a:
            java.lang.String r0 = "qr_code_generated"
            goto L_0x006a
        L_0x018e:
            java.lang.String r0 = "qr_code_scanned"
            goto L_0x006a
        L_0x0192:
            java.lang.String r0 = "new_device_found"
            goto L_0x006a
        L_0x0196:
            java.lang.String r0 = "connected_to_peer"
            goto L_0x006a
        L_0x019a:
            java.lang.String r0 = "export_started"
            goto L_0x006a
        L_0x019e:
            java.lang.String r0 = "export_completed"
            goto L_0x006a
        L_0x01a2:
            java.lang.String r0 = "transfer_started"
            goto L_0x006a
        L_0x01a6:
            java.lang.String r0 = "transfer_completed"
            goto L_0x006a
        L_0x01aa:
            java.lang.String r0 = "import_started"
            goto L_0x006a
        L_0x01ae:
            java.lang.String r0 = "import_completed"
            goto L_0x006a
        L_0x01b2:
            java.lang.String r0 = "searching_for_peer"
            goto L_0x006a
        L_0x01b6:
            java.lang.String r0 = "dialog_positive_click"
            goto L_0x006a
        L_0x01ba:
            java.lang.String r0 = "dialog_negative_click"
            goto L_0x006a
        L_0x01be:
            X.18K r0 = r10.A08
            r0.CC7(r9)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7P.A01(X.8sG, X.A7P):void");
    }

    public static final void A02(A7P a7p, String str, String str2, String str3) {
        StringBuilder A10;
        String str4;
        C18020vd r2;
        int i;
        if (str == null) {
            Log.e("p2p/fpm/LoggingManager/v2/chat-transfer-event: stage should not be null");
            return;
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append(a7p.A02);
        A102.append("_chat_transfer_");
        A102.append(str);
        String A0Z = C17890vO.A0Z(str2, A102, '_');
        if (!str2.equals("started")) {
            Integer num = a7p.A00;
            if (num == null || num.intValue() != 0) {
                r2 = a7p.A06;
                i = 11640;
            } else {
                r2 = a7p.A07;
                i = 11639;
            }
            if (C18020vd.A05(C18040vf.A02, r2, i)) {
                A8V A0q = AnonymousClass8BR.A0q(a7p.A0C);
                String A0r = C17880vN.A0r(C17880vN.A0B(a7p.A09.A01), "/export/logging/attemptId");
                String str5 = a7p.A04;
                String str6 = a7p.A03;
                String str7 = a7p.A02;
                C18070vi.A0d(A0Z, 0);
                if (C72453Mb.A1a(A0q.A07)) {
                    C192119np r3 = new C192119np();
                    r3.A01("event_name", A0Z);
                    r3.A01("fpm_stage", str);
                    r3.A01("fpm_stage_result", str2);
                    r3.A01("funnel_id", A0q.A07());
                    r3.A01("rc", AnonymousClass3MW.A0y(A0q.A08));
                    if (A0r != null) {
                        r3.A01("ios_attempt_id", A0r);
                    }
                    if (str3 != null) {
                        r3.A01("client_error_type", str3);
                    }
                    if (str5 != null) {
                        r3.A01("client_error_context", str5);
                    }
                    if (str6 != null) {
                        r3.A01("fpm_entry_point", str6);
                    }
                    if (str7 != null) {
                        r3.A01("fpm_device_role", str7);
                    }
                    AnonymousClass3MX.A0x(A0q.A05).CGF(new C146517Pk(A0q, r3, 44));
                }
                A10 = AnonymousClass000.A10();
                str4 = "p2p/fpm/LoggingManager/v2/enabled/eventName: ";
                C17900vP.A0f(str4, A0Z, A10);
                C17880vN.A0B(a7p.A09.A01).getString("/export/logging/attemptId", (String) null);
            }
        }
        A10 = AnonymousClass000.A10();
        str4 = "p2p/fpm/LoggingManager/v2/disabled/skipping/eventName: ";
        C17900vP.A0f(str4, A0Z, A10);
        C17880vN.A0B(a7p.A09.A01).getString("/export/logging/attemptId", (String) null);
    }

    public final void A04(int i) {
        this.A0B.CGF(new AnonymousClass7RM((Object) this, i, 23));
    }

    public A7P(AnonymousClass190 r3, AnonymousClass19D r4, C18030ve r5, AnonymousClass18K r6, C196129uV r7, C196139uW r8, AnonymousClass10I r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        C18070vi.A0w(r5, r3, r9, r6, r10);
        C18070vi.A0x(r4, r11, r8, r7, r12);
        C18070vi.A0d(r13, 11);
        this.A07 = r5;
        this.A05 = r3;
        this.A0B = r9;
        this.A08 = r6;
        this.A0C = r10;
        this.A06 = r4;
        this.A0I = r11;
        this.A0E = r8;
        this.A09 = r7;
        this.A0H = r12;
        this.A0F = r13;
        AnonymousClass1Ez r0 = new AnonymousClass1Ez("p2p/fpm/LoggingManager/duration");
        this.A0A = r0;
        r0.A02();
        this.A0D = AnonymousClass000.A13();
    }
}
