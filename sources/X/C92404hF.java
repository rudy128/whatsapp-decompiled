package X;

/* renamed from: X.4hF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C92404hF implements E6U {
    public final /* synthetic */ C86094Qd A00;

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d8 A[Catch:{ JSONException -> 0x0105 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d9 A[Catch:{ JSONException -> 0x0105 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BtR(org.json.JSONObject r9) {
        /*
            r8 = this;
            X.4Qd r7 = r8.A00
            r6 = 0
            X.C18070vi.A0d(r7, r6)
            java.lang.String r0 = "event"
            java.lang.String r4 = r9.getString(r0)     // Catch:{ JSONException -> 0x0105 }
            X.C18070vi.A0b(r4)     // Catch:{ JSONException -> 0x0105 }
            X.C18070vi.A0d(r4, r6)     // Catch:{ JSONException -> 0x0105 }
            r0 = 3
            java.lang.Integer[] r3 = X.AnonymousClass00R.A00(r0)     // Catch:{ JSONException -> 0x0105 }
            int r2 = r3.length     // Catch:{ JSONException -> 0x0105 }
        L_0x0018:
            if (r6 >= r2) goto L_0x003e
            r5 = r3[r6]     // Catch:{ JSONException -> 0x0105 }
            int r0 = r5.intValue()     // Catch:{ JSONException -> 0x0105 }
            switch(r0) {
                case 1: goto L_0x0036;
                case 2: goto L_0x0033;
                default: goto L_0x0023;
            }     // Catch:{ JSONException -> 0x0105 }
        L_0x0023:
            java.lang.String r1 = "MEMU_EFFECT_READY"
        L_0x0025:
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch:{ JSONException -> 0x0105 }
            java.lang.String r0 = r4.toUpperCase(r0)     // Catch:{ JSONException -> 0x0105 }
            X.C18070vi.A0X(r0)     // Catch:{ JSONException -> 0x0105 }
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0105 }
            goto L_0x0039
        L_0x0033:
            java.lang.String r1 = "MEMU_DETECTION_RESULT"
            goto L_0x0025
        L_0x0036:
            java.lang.String r1 = "MEMU_FACE_CT_CHANGE"
            goto L_0x0025
        L_0x0039:
            if (r0 != 0) goto L_0x003f
            int r6 = r6 + 1
            goto L_0x0018
        L_0x003e:
            r5 = 0
        L_0x003f:
            com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel r2 = r7.A01     // Catch:{ JSONException -> 0x0105 }
            X.1G1 r4 = r2.A0N     // Catch:{ JSONException -> 0x0105 }
            java.lang.Object r0 = r4.getValue()     // Catch:{ JSONException -> 0x0105 }
            X.4DH r3 = X.AnonymousClass4DH.PRE_CAPTURE     // Catch:{ JSONException -> 0x0105 }
            boolean r1 = X.AnonymousClass3Ma.A1Z(r0, r3)
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ JSONException -> 0x0105 }
            if (r5 != r0) goto L_0x006f
            java.lang.Object r0 = r4.getValue()     // Catch:{ JSONException -> 0x0105 }
            if (r0 == r3) goto L_0x005c
            X.4Ch r0 = X.C82844Ch.BACK_TO_DETECTOR_READY     // Catch:{ JSONException -> 0x0105 }
            r2.A0T(r0)     // Catch:{ JSONException -> 0x0105 }
        L_0x005c:
            X.5Ve r4 = X.C106265Ve.A00     // Catch:{ JSONException -> 0x0105 }
        L_0x005e:
            X.1G4 r2 = r2.A0J     // Catch:{ JSONException -> 0x0105 }
        L_0x0060:
            java.lang.Object r1 = r2.getValue()     // Catch:{ JSONException -> 0x0105 }
            java.lang.Object r0 = r4.invoke(r1)     // Catch:{ JSONException -> 0x0105 }
            boolean r0 = r2.BFK(r1, r0)     // Catch:{ JSONException -> 0x0105 }
            if (r0 == 0) goto L_0x0060
            goto L_0x00be
        L_0x006f:
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ JSONException -> 0x0105 }
            if (r5 != r0) goto L_0x007d
            java.lang.String r1 = "data"
            boolean r0 = r9.has(r1)     // Catch:{ JSONException -> 0x0105 }
            r6 = 0
            if (r0 == 0) goto L_0x00ce
            goto L_0x00bf
        L_0x007d:
            if (r1 == 0) goto L_0x010b
            java.lang.Integer r0 = X.AnonymousClass00R.A0C     // Catch:{ JSONException -> 0x0105 }
            if (r5 != r0) goto L_0x010b
            java.lang.String r1 = "data"
            boolean r0 = r9.has(r1)     // Catch:{ JSONException -> 0x0105 }
            if (r0 == 0) goto L_0x00b2
            java.lang.String r7 = X.C18070vi.A0J(r1, r9)     // Catch:{ JSONException -> 0x0105 }
            X.4DA[] r6 = X.AnonymousClass4DA.values()     // Catch:{ JSONException -> 0x0105 }
            int r5 = r6.length     // Catch:{ JSONException -> 0x0105 }
            r4 = 0
            goto L_0x0098
        L_0x0096:
            int r4 = r4 + 1
        L_0x0098:
            if (r4 >= r5) goto L_0x00b0
            r3 = r6[r4]     // Catch:{ JSONException -> 0x0105 }
            java.lang.String r1 = r3.name()     // Catch:{ JSONException -> 0x0105 }
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch:{ JSONException -> 0x0105 }
            java.lang.String r0 = r7.toUpperCase(r0)     // Catch:{ JSONException -> 0x0105 }
            X.C18070vi.A0X(r0)     // Catch:{ JSONException -> 0x0105 }
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ JSONException -> 0x0105 }
            if (r0 != 0) goto L_0x00b4
            goto L_0x0096
        L_0x00b0:
            r3 = 0
            goto L_0x00b4
        L_0x00b2:
            X.4DA r3 = X.AnonymousClass4DA.NONE     // Catch:{ JSONException -> 0x0105 }
        L_0x00b4:
            X.4DA r0 = X.AnonymousClass4DA.NONE     // Catch:{ JSONException -> 0x0105 }
            if (r3 == r0) goto L_0x010b
            X.5Qf r4 = new X.5Qf     // Catch:{ JSONException -> 0x0105 }
            r4.<init>(r3)     // Catch:{ JSONException -> 0x0105 }
            goto L_0x005e
        L_0x00be:
            return
        L_0x00bf:
            java.lang.String r0 = X.C18070vi.A0J(r1, r9)     // Catch:{ NumberFormatException -> 0x00c8 }
            int r5 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00c8 }
            goto L_0x00cf
        L_0x00c8:
            r1 = move-exception
            java.lang.String r0 = "failed to parse data"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ JSONException -> 0x0105 }
        L_0x00ce:
            r5 = 0
        L_0x00cf:
            boolean r0 = r7.A00     // Catch:{ JSONException -> 0x0105 }
            r4 = 1
            if (r0 != 0) goto L_0x00d6
            if (r5 == r4) goto L_0x00e6
        L_0x00d6:
            if (r5 != 0) goto L_0x00d9
            goto L_0x00e1
        L_0x00d9:
            if (r5 <= r4) goto L_0x00de
            X.4Ch r0 = X.C82844Ch.MULTIPLE_FACES     // Catch:{ JSONException -> 0x0105 }
            goto L_0x00e3
        L_0x00de:
            X.4Ch r0 = X.C82844Ch.BACK_TO_DETECTOR_READY     // Catch:{ JSONException -> 0x0105 }
            goto L_0x00e3
        L_0x00e1:
            X.4Ch r0 = X.C82844Ch.LOST_FACE     // Catch:{ JSONException -> 0x0105 }
        L_0x00e3:
            r2.A0T(r0)     // Catch:{ JSONException -> 0x0105 }
        L_0x00e6:
            X.5UY r3 = new X.5UY     // Catch:{ JSONException -> 0x0105 }
            r3.<init>(r7, r5)     // Catch:{ JSONException -> 0x0105 }
            X.1G4 r2 = r2.A0J     // Catch:{ JSONException -> 0x0105 }
        L_0x00ed:
            java.lang.Object r1 = r2.getValue()     // Catch:{ JSONException -> 0x0105 }
            java.lang.Object r0 = r3.invoke(r1)     // Catch:{ JSONException -> 0x0105 }
            boolean r0 = r2.BFK(r1, r0)     // Catch:{ JSONException -> 0x0105 }
            if (r0 == 0) goto L_0x00ed
            boolean r0 = r7.A00     // Catch:{ JSONException -> 0x0105 }
            if (r0 != 0) goto L_0x0102
            if (r5 != r4) goto L_0x0102
            r6 = 1
        L_0x0102:
            r7.A00 = r6     // Catch:{ JSONException -> 0x0105 }
            return
        L_0x0105:
            r1 = move-exception
            java.lang.String r0 = "failed to parse json to process ImagineMe AR platform events"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92404hF.BtR(org.json.JSONObject):void");
    }

    public /* synthetic */ C92404hF(C86094Qd r1) {
        this.A00 = r1;
    }
}
