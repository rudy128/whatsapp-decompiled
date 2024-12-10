package X;

/* renamed from: X.683  reason: invalid class name */
public class AnonymousClass683 extends C37061ou implements C72203La {
    public A99 A00;
    public Runnable A01;
    public final AnonymousClass1V7 A02;
    public final AnonymousClass10I A03;
    public final AnonymousClass11S A04;
    public final AnonymousClass1M9 A05;
    public final C24921Me A06;
    public final AnonymousClass1TM A07;
    public final C19959A0q A08;
    public final C20047A4q A09;
    public final AnonymousClass19T A0A;

    public void C5G() {
        this.A00 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a2 A[Catch:{ all -> 0x00ae }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C127316e9 A00(X.C60012nF r16, com.whatsapp.voipcalling.CallInfo r17) {
        /*
            r15 = this;
            X.19T r11 = r15.A0A
            java.lang.String r1 = "trigger_type"
            java.lang.String r0 = "event"
            r2 = 494341755(0x1d770e7b, float:3.2697664E-21)
            r11.markerStart(r2, r1, r0)
            java.lang.String r3 = "fail_reason"
            r4 = 0
            r13 = r17
            if (r17 == 0) goto L_0x00b3
            com.whatsapp.voipcalling.CallState r14 = r13.callState
            X.1TM r8 = r15.A07
            X.0ve r5 = r8.A01
            r1 = 6408(0x1908, float:8.98E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            if (r0 == 0) goto L_0x0064
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r14 != r0) goto L_0x0039
            java.lang.String r0 = "unbind_voice_service_start"
            r11.markerPoint(r2, r0)
            X.1V7 r0 = r15.A02
            r0.A02(r15)
            r15.A00 = r4
            java.lang.String r0 = "unbind_voice_service_end"
            r11.markerPoint(r2, r0)
            goto L_0x0064
        L_0x0039:
            X.A99 r0 = r15.A00
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "bind_voice_service_start"
            r11.markerPoint(r2, r0)
            X.1V7 r0 = r15.A02
            r0.A01(r15)
            java.lang.Runnable r1 = r15.A01
            if (r1 == 0) goto L_0x0052
            X.10I r0 = r15.A03
            r0.CEz(r1)
            r15.A01 = r4
        L_0x0052:
            X.10I r5 = r15.A03
            r0 = 22
            X.7Pd r4 = new X.7Pd
            r4.<init>(r15, r0)
            r0 = 60000(0xea60, double:2.9644E-319)
            X.25d r0 = r5.CGv(r4, r0)
            r15.A01 = r0
        L_0x0064:
            X.11S r4 = r15.A04     // Catch:{ JSONException -> 0x008d, all -> 0x008a }
            X.A99 r5 = r15.A00     // Catch:{ JSONException -> 0x008d, all -> 0x008a }
            X.1M9 r6 = r15.A05     // Catch:{ JSONException -> 0x008d, all -> 0x008a }
            X.1Me r7 = r15.A06     // Catch:{ JSONException -> 0x008d, all -> 0x008a }
            X.A4q r10 = r15.A09     // Catch:{ JSONException -> 0x008d, all -> 0x008a }
            X.A0q r9 = r15.A08     // Catch:{ JSONException -> 0x008d, all -> 0x008a }
            r1 = 3
            r12 = r16
            org.json.JSONObject r5 = X.C173398v0.A01(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x0088 }
            java.lang.String r0 = "create_stella_event_start"
            r11.markerPoint(r2, r0)     // Catch:{ JSONException -> 0x0088 }
            java.lang.String r0 = "call_state_changed"
            X.6e9 r4 = new X.6e9     // Catch:{ JSONException -> 0x0088 }
            r4.<init>(r0, r5)     // Catch:{ JSONException -> 0x0088 }
            r0 = 2
            r11.markerEnd(r2, r0)
            return r4
        L_0x0088:
            r4 = move-exception
            goto L_0x008f
        L_0x008a:
            r0 = move-exception
            r1 = 3
            goto L_0x00af
        L_0x008d:
            r4 = move-exception
            r1 = 3
        L_0x008f:
            java.lang.String r0 = "CallStateChangedEventFactory/createEvent"
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ all -> 0x00ae }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "JSONException:"
            java.lang.String r4 = X.C108955ca.A10(r0, r5, r4)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = ""
            if (r4 == 0) goto L_0x00a6
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x00ae }
        L_0x00a6:
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r5)     // Catch:{ all -> 0x00ae }
            r11.markerAnnotate((int) r2, (java.lang.String) r3, (java.lang.String) r0)     // Catch:{ all -> 0x00ae }
            goto L_0x00b9
        L_0x00ae:
            r0 = move-exception
        L_0x00af:
            r11.markerEnd(r2, r1)
            throw r0
        L_0x00b3:
            java.lang.String r0 = "null_input"
            r11.markerAnnotate((int) r2, (java.lang.String) r3, (java.lang.String) r0)
            goto L_0x00bc
        L_0x00b9:
            r11.markerEnd(r2, r1)
        L_0x00bc:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass683.A00(X.2nF, com.whatsapp.voipcalling.CallInfo):X.6e9");
    }

    public AnonymousClass683(AnonymousClass11S r1, AnonymousClass1V7 r2, AnonymousClass1M9 r3, C24921Me r4, AnonymousClass1TM r5, C19959A0q a0q, C20047A4q a4q, AnonymousClass19T r8, AnonymousClass10I r9) {
        this.A0A = r8;
        this.A04 = r1;
        this.A03 = r9;
        this.A05 = r3;
        this.A06 = r4;
        this.A02 = r2;
        this.A07 = r5;
        this.A09 = a4q;
        this.A08 = a0q;
    }

    public void C5F(A99 a99) {
        this.A00 = a99;
    }
}
