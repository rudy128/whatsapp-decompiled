package X;

import android.content.SharedPreferences;

/* renamed from: X.7Ev  reason: invalid class name and case insensitive filesystem */
public final class C143797Ev implements AnonymousClass1L0 {
    public final AnonymousClass118 A00;
    public final AnonymousClass18K A01;
    public final AnonymousClass1L1 A02;
    public final C131006kM A03;
    public final C88534a3 A04;

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqi() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x035e, code lost:
        if (android.speech.SpeechRecognizer.isOnDeviceRecognitionAvailable(r13.A00.A00) == false) goto L_0x0360;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqh() {
        /*
            r43 = this;
            X.64T r15 = new X.64T
            r15.<init>()
            r13 = r43
            X.1L1 r12 = r13.A02
            X.0z4 r11 = r12.A01
            r12.A00(r11)
            android.content.SharedPreferences r10 = r12.A00
            java.lang.String r41 = "ptt_cancel_broadcast"
            r0 = 0
            r2 = r41
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A00 = r2
            r12.A00(r11)
            java.lang.String r40 = "ptt_cancel_group"
            r2 = r40
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A01 = r2
            r12.A00(r11)
            java.lang.String r39 = "ptt_cancel_individual"
            r2 = r39
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A02 = r2
            r12.A00(r11)
            java.lang.String r38 = "ptt_cancel_interop"
            r2 = r38
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A03 = r2
            r12.A00(r11)
            java.lang.String r37 = "ptt_draft_review_broadcast"
            r2 = r37
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A04 = r2
            r12.A00(r11)
            java.lang.String r36 = "ptt_draft_review_group"
            r2 = r36
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A05 = r2
            r12.A00(r11)
            java.lang.String r35 = "ptt_draft_review_individual"
            r2 = r35
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A06 = r2
            r12.A00(r11)
            java.lang.String r34 = "ptt_draft_review_interop"
            r2 = r34
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A07 = r2
            r12.A00(r11)
            java.lang.String r33 = "ptt_fast_playback_broadcast"
            r2 = r33
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A08 = r2
            r12.A00(r11)
            java.lang.String r32 = "ptt_fast_playback_group"
            r2 = r32
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A09 = r2
            r12.A00(r11)
            java.lang.String r31 = "ptt_fast_playback_individual"
            r2 = r31
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A0A = r2
            r12.A00(r11)
            java.lang.String r14 = "ptt_playback_interop"
            java.lang.Long r2 = X.C108965cb.A0l(r10, r14, r0)
            r15.A0B = r2
            r12.A00(r11)
            java.lang.String r30 = "ptt_lock_broadcast"
            r2 = r30
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A0C = r2
            r12.A00(r11)
            java.lang.String r29 = "ptt_lock_group"
            r2 = r29
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A0D = r2
            r12.A00(r11)
            java.lang.String r28 = "ptt_lock_individual"
            r2 = r28
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A0E = r2
            r12.A00(r11)
            java.lang.String r27 = "ptt_lock_interop"
            r2 = r27
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A0F = r2
            r12.A00(r11)
            java.lang.String r26 = "ptt_playback_broadcast"
            r2 = r26
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A0O = r2
            r12.A00(r11)
            java.lang.String r25 = "ptt_playback_group"
            r2 = r25
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A0P = r2
            r12.A00(r11)
            java.lang.String r24 = "ptt_playback_individual"
            r2 = r24
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A0Q = r2
            r12.A00(r11)
            java.lang.Long r2 = X.C108965cb.A0l(r10, r14, r0)
            r15.A0R = r2
            r12.A00(r11)
            java.lang.String r23 = "ptt_record_broadcast"
            r2 = r23
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A0S = r2
            r12.A00(r11)
            java.lang.String r22 = "ptt_record_group"
            r2 = r22
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A0T = r2
            r12.A00(r11)
            java.lang.String r21 = "ptt_record_individual"
            r2 = r21
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A0U = r2
            r12.A00(r11)
            java.lang.String r20 = "ptt_record_interop"
            r2 = r20
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A0V = r2
            r12.A00(r11)
            java.lang.String r19 = "ptt_send_broadcast"
            r2 = r19
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A0W = r2
            r12.A00(r11)
            java.lang.String r18 = "ptt_send_group"
            r2 = r18
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A0X = r2
            r12.A00(r11)
            java.lang.String r17 = "ptt_send_individual"
            r2 = r17
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A0Y = r2
            r12.A00(r11)
            java.lang.String r16 = "ptt_send_interop"
            r2 = r16
            java.lang.Long r2 = X.C108965cb.A0l(r10, r2, r0)
            r15.A0Z = r2
            r12.A00(r11)
            java.lang.String r9 = "ptt_pause_tap_broadcast"
            java.lang.Long r2 = X.C108965cb.A0l(r10, r9, r0)
            r15.A0K = r2
            r12.A00(r11)
            java.lang.String r8 = "ptt_pause_tap_group"
            java.lang.Long r2 = X.C108965cb.A0l(r10, r8, r0)
            r15.A0L = r2
            r12.A00(r11)
            java.lang.String r7 = "ptt_pause_tap_individual"
            java.lang.Long r2 = X.C108965cb.A0l(r10, r7, r0)
            r15.A0M = r2
            r12.A00(r11)
            java.lang.String r6 = "ptt_pause_tap_interop"
            java.lang.Long r2 = X.C108965cb.A0l(r10, r6, r0)
            r15.A0N = r2
            r12.A00(r11)
            java.lang.String r5 = "ptt_out_of_chat_individual"
            java.lang.Long r2 = X.C108965cb.A0l(r10, r5, r0)
            r15.A0I = r2
            r12.A00(r11)
            java.lang.String r4 = "ptt_out_of_chat_broadcast"
            java.lang.Long r2 = X.C108965cb.A0l(r10, r4, r0)
            r15.A0G = r2
            r12.A00(r11)
            java.lang.String r3 = "ptt_out_of_chat_group"
            java.lang.Long r2 = X.C108965cb.A0l(r10, r3, r0)
            r15.A0H = r2
            r12.A00(r11)
            java.lang.String r2 = "ptt_out_of_chat_interop"
            java.lang.Long r0 = X.C108965cb.A0l(r10, r2, r0)
            r15.A0J = r0
            X.18K r0 = r13.A01
            r42 = r0
            r0.CC4(r15)
            r1 = r41
            r0 = r40
            A00(r10, r11, r12, r1, r0)
            r1 = r39
            r0 = r38
            A00(r10, r11, r12, r1, r0)
            r1 = r37
            r0 = r36
            A00(r10, r11, r12, r1, r0)
            r1 = r35
            r0 = r34
            A00(r10, r11, r12, r1, r0)
            r1 = r26
            r0 = r25
            A00(r10, r11, r12, r1, r0)
            r0 = r24
            A00(r10, r11, r12, r0, r14)
            r1 = r30
            r0 = r29
            A00(r10, r11, r12, r1, r0)
            r1 = r28
            r0 = r27
            A00(r10, r11, r12, r1, r0)
            r1 = r33
            r0 = r32
            A00(r10, r11, r12, r1, r0)
            r12.A00(r11)
            android.content.SharedPreferences$Editor r1 = r10.edit()
            X.C18070vi.A0X(r1)
            r0 = r31
            X.C17880vN.A1B(r1, r0)
            r12.A00(r11)
            android.content.SharedPreferences$Editor r1 = r10.edit()
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "ptt_fast_playback_interop"
            X.C17880vN.A1B(r1, r0)
            r1 = r23
            r0 = r22
            A00(r10, r11, r12, r1, r0)
            r1 = r21
            r0 = r20
            A00(r10, r11, r12, r1, r0)
            r1 = r19
            r0 = r18
            A00(r10, r11, r12, r1, r0)
            r1 = r17
            r0 = r16
            A00(r10, r11, r12, r1, r0)
            A00(r10, r11, r12, r9, r8)
            A00(r10, r11, r12, r7, r6)
            A00(r10, r11, r12, r5, r4)
            A00(r10, r11, r12, r3, r2)
            X.4a3 r10 = r13.A04
            X.0ve r2 = r10.A01
            r1 = 2890(0xb4a, float:4.05E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x03bf
            X.6kM r9 = r13.A03
            X.64N r8 = new X.64N
            r8.<init>()
            X.6mJ r0 = r9.A02
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = r0.A01
            long r0 = X.C17890vO.A05(r1, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A03 = r0
            X.0vl r11 = r9.A0B
            java.util.Map r0 = X.AnonymousClass3MW.A12(r11)
            java.util.Iterator r12 = X.AnonymousClass000.A15(r0)
            boolean r0 = r12.hasNext()
            r7 = 0
            if (r0 != 0) goto L_0x03e6
            r6 = r7
        L_0x028e:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            if (r6 == 0) goto L_0x0296
            java.lang.String r7 = X.C17880vN.A0x(r6)
        L_0x0296:
            r8.A0C = r7
            java.util.Map r0 = X.AnonymousClass3MW.A12(r11)
            java.util.Set r1 = r0.entrySet()
            r0 = 49
            java.util.List r1 = X.C147027Rn.A00(r1, r0)
            r0 = 1
            java.lang.Object r0 = X.C29431cG.A0f(r1, r0)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto L_0x03e3
            java.lang.String r0 = X.C17880vN.A0x(r0)
        L_0x02b3:
            r8.A0D = r0
            java.util.Map r0 = X.AnonymousClass3MW.A12(r11)
            java.util.Set r1 = r0.entrySet()
            X.7RZ r0 = new X.7RZ
            r0.<init>()
            java.util.List r1 = X.C29431cG.A0y(r1, r0)
            r0 = 2
            java.lang.Object r0 = X.C29431cG.A0f(r1, r0)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto L_0x03e0
            java.lang.String r0 = X.C17880vN.A0x(r0)
        L_0x02d3:
            r8.A0E = r0
            X.6mJ r0 = r9.A09
            android.content.SharedPreferences r12 = r0.A00
            java.lang.String r11 = r0.A01
            r4 = 0
            long r6 = r12.getLong(r11, r4)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x03d1
            r2 = 0
        L_0x02e7:
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r8.A02 = r0
            X.6mJ r0 = r9.A03
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = r0.A01
            java.lang.Long r0 = X.C108965cb.A0l(r1, r0, r4)
            r8.A04 = r0
            X.6mJ r0 = r9.A04
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = r0.A01
            java.lang.Long r0 = X.C108965cb.A0l(r1, r0, r4)
            r8.A05 = r0
            X.6mJ r0 = r9.A05
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = r0.A01
            java.lang.Long r0 = X.C108965cb.A0l(r1, r0, r4)
            r8.A06 = r0
            X.6mJ r0 = r9.A06
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = r0.A01
            java.lang.Long r0 = X.C108965cb.A0l(r1, r0, r4)
            r8.A07 = r0
            X.6mJ r0 = r9.A07
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = r0.A01
            java.lang.Long r0 = X.C108965cb.A0l(r1, r0, r4)
            r8.A08 = r0
            X.6mJ r0 = r9.A08
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = r0.A01
            java.lang.Long r0 = X.C108965cb.A0l(r1, r0, r4)
            r8.A09 = r0
            X.1G4 r0 = r10.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r8.A0F = r0
            boolean r0 = r10.A09()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A00 = r0
            java.lang.Long r0 = X.C108965cb.A0l(r12, r11, r4)
            r8.A0A = r0
            boolean r0 = X.AnonymousClass112.A08()
            if (r0 == 0) goto L_0x0360
            X.118 r0 = r13.A00
            android.content.Context r0 = r0.A00
            boolean r1 = android.speech.SpeechRecognizer.isOnDeviceRecognitionAvailable(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0361
        L_0x0360:
            r0 = 0
        L_0x0361:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A01 = r0
            X.6mJ r0 = r9.A0A
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = r0.A01
            java.lang.Long r0 = X.C108965cb.A0l(r1, r0, r4)
            r8.A0B = r0
            boolean r1 = X.AnonymousClass112.A02()
            r3 = 0
            X.118 r0 = r13.A00
            android.content.res.Resources r0 = X.AnonymousClass3MW.A05(r0)
            android.content.res.Configuration r0 = r0.getConfiguration()
            if (r1 == 0) goto L_0x03c2
            android.os.LocaleList r2 = r0.getLocales()
            X.C18070vi.A0X(r2)
            r0 = 0
            java.util.Locale r0 = r2.get(r0)
            if (r0 == 0) goto L_0x03c0
            java.lang.String r1 = r0.toString()
        L_0x0396:
            r0 = 1
            java.util.Locale r0 = r2.get(r0)
            if (r0 == 0) goto L_0x03a1
            java.lang.String r3 = r0.toString()
        L_0x03a1:
            X.1D6 r1 = X.AnonymousClass1D6.A01(r1, r3)
        L_0x03a5:
            java.lang.Object r0 = r1.first
            java.lang.String r0 = (java.lang.String) r0
            r8.A0G = r0
            java.lang.Object r0 = r1.second
            java.lang.String r0 = (java.lang.String) r0
            r8.A0H = r0
            r0 = r42
            r0.CC4(r8)
            X.0vl r0 = r9.A0C
            android.content.SharedPreferences r0 = X.C17880vN.A0C(r0)
            X.C17900vP.A0J(r0)
        L_0x03bf:
            return
        L_0x03c0:
            r1 = r3
            goto L_0x0396
        L_0x03c2:
            java.util.Locale r0 = r0.locale
            if (r0 == 0) goto L_0x03ca
            java.lang.String r3 = r0.toString()
        L_0x03ca:
            java.lang.String r0 = "x-unknown"
            X.1D6 r1 = X.AnonymousClass1D6.A01(r3, r0)
            goto L_0x03a5
        L_0x03d1:
            X.6mJ r0 = r9.A00
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = r0.A01
            long r0 = r1.getLong(r0, r4)
            double r2 = (double) r0
            double r0 = (double) r6
            double r2 = r2 / r0
            goto L_0x02e7
        L_0x03e0:
            r0 = 0
            goto L_0x02d3
        L_0x03e3:
            r0 = 0
            goto L_0x02b3
        L_0x03e6:
            java.lang.Object r6 = r12.next()
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x028e
            r0 = r6
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            long r4 = X.C17880vN.A05(r0)
        L_0x03fb:
            java.lang.Object r3 = r12.next()
            r0 = r3
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            long r1 = X.C17880vN.A05(r0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0410
            r6 = r3
            r4 = r1
        L_0x0410:
            boolean r0 = r12.hasNext()
            if (r0 != 0) goto L_0x03fb
            goto L_0x028e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143797Ev.Bqh():void");
    }

    public C143797Ev(AnonymousClass118 r1, AnonymousClass18K r2, AnonymousClass1L1 r3, C131006kM r4, C88534a3 r5) {
        C18070vi.A0w(r1, r2, r3, r5, r4);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
    }

    public static void A00(SharedPreferences sharedPreferences, C19830z4 r2, AnonymousClass1L1 r3, String str, String str2) {
        r3.A00(r2);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C18070vi.A0X(edit);
        edit.remove(str).apply();
        r3.A00(r2);
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        C18070vi.A0X(edit2);
        edit2.remove(str2).apply();
    }
}
