package X;

/* renamed from: X.1Eg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C23031Eg {
    public final /* synthetic */ C23021Ef A00;

    /* JADX WARNING: Removed duplicated region for block: B:101:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x036f A[LOOP:1: B:91:0x0369->B:93:0x036f, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass188 r20) {
        /*
            r19 = this;
            r0 = r19
            X.1Ef r7 = r0.A00
            X.00H r0 = r7.A02
            r18 = r0
            java.lang.Object r6 = r18.get()
            X.1Hb r6 = (X.C23641Hb) r6
            X.0ve r5 = r7.A00
            long r0 = android.os.SystemClock.uptimeMillis()
            r6.A00 = r0
            X.11C r12 = r6.A04
            android.telephony.TelephonyManager r1 = r12.A0K()
            r4 = 1
            r3 = 3
            r2 = 0
            r8 = r20
            if (r1 == 0) goto L_0x007e
            int r0 = r1.getPhoneType()
            if (r0 != r4) goto L_0x007e
            java.lang.String r9 = r1.getNetworkOperator()
            if (r9 == 0) goto L_0x007e
            int r1 = r9.length()
            r0 = 5
            if (r1 < r0) goto L_0x007e
            r0 = 6
            if (r1 > r0) goto L_0x007e
            r0 = 0
            java.lang.String r0 = r9.substring(r0, r3)
            java.lang.String r1 = r9.substring(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x004d }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x004d }
            if (r0 == 0) goto L_0x0054
            goto L_0x0056
        L_0x004d:
            r1 = move-exception
            java.lang.String r0 = "error parsing mcc/mnc"
            com.whatsapp.util.Log.w(r0, r1)
            r11 = r2
        L_0x0054:
            r10 = r2
            goto L_0x005f
        L_0x0056:
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
        L_0x005f:
            r9 = 0
            r1 = 5
            r8.CHx(r10, r1, r9)
            r8.CHx(r10, r1, r4)
            r8.CHx(r10, r1, r3)
            r0 = 2
            r8.CHx(r10, r1, r0)
            if (r11 != 0) goto L_0x01c8
            r1 = r2
        L_0x0071:
            r8.CHx(r1, r3, r9)
            r8.CHx(r1, r3, r4)
            r8.CHx(r1, r3, r3)
            r0 = 2
            r8.CHx(r1, r3, r0)
        L_0x007e:
            r11 = 2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r13 = 0
            r0 = 11
            r8.CHx(r10, r0, r13)
            r8.CHx(r10, r0, r4)
            r8.CHx(r10, r0, r3)
            r8.CHx(r10, r0, r11)
            java.lang.String r1 = "2.24.24.78"
            r0 = 17
            r8.CHx(r1, r0, r13)
            r8.CHx(r1, r0, r4)
            r8.CHx(r1, r0, r3)
            r8.CHx(r1, r0, r11)
            r0 = 12637(0x315d, float:1.7708E-41)
            X.0vf r9 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r9, r5, r0)
            if (r0 != 0) goto L_0x00ea
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            r0 = 15
            r8.CHx(r1, r0, r13)
            r8.CHx(r1, r0, r4)
            r8.CHx(r1, r0, r3)
            r8.CHx(r1, r0, r11)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            r0 = 287(0x11f, float:4.02E-43)
            r8.CHx(r1, r0, r13)
            r8.CHx(r1, r0, r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            r0 = 21
            r8.CHx(r1, r0, r13)
            r8.CHx(r1, r0, r4)
            r8.CHx(r1, r0, r3)
            r8.CHx(r1, r0, r11)
            X.11S r0 = r6.A03
            boolean r0 = r0.A0N()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 12027(0x2efb, float:1.6853E-41)
            r8.CHx(r1, r0, r13)
            r8.CHx(r1, r0, r4)
        L_0x00ea:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r1.append(r0)
            java.lang.String r0 = "-"
            r1.append(r0)
            java.lang.String r0 = android.os.Build.MODEL
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = 13
            r8.CHx(r1, r0, r13)
            r8.CHx(r1, r0, r4)
            r8.CHx(r1, r0, r3)
            r8.CHx(r1, r0, r11)
            X.00H r0 = r6.A0A
            java.lang.Object r0 = r0.get()
            X.1Hf r0 = (X.C23681Hf) r0
            java.lang.Integer r0 = r0.A00()
            int r14 = r0.intValue()
            r1 = 4
            if (r14 == r3) goto L_0x012c
            if (r14 == r11) goto L_0x01c5
            if (r14 == r4) goto L_0x01c2
            r0 = 4
            r1 = 5
            if (r14 == r0) goto L_0x012c
            r1 = 0
        L_0x012c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0 = 14507(0x38ab, float:2.0329E-41)
            r8.CHx(r1, r0, r13)
            r8.CHx(r1, r0, r4)
            int r0 = X.C24161Jc.A00(r12)
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 655(0x28f, float:9.18E-43)
            r8.CHx(r1, r0, r13)
            r8.CHx(r1, r0, r4)
            r8.CHx(r1, r0, r3)
            r8.CHx(r1, r0, r11)
            long r13 = X.C24171Jd.A02(r12)
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r13 = r13 / r0
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r13 = 0
            r0 = 689(0x2b1, float:9.65E-43)
            r8.CHx(r1, r0, r13)
            r8.CHx(r1, r0, r4)
            r8.CHx(r1, r0, r3)
            r8.CHx(r1, r0, r11)
            X.0vc r0 = r6.A09
            int r0 = X.C24191Jf.A02(r12, r0)
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 2617(0xa39, float:3.667E-42)
            r8.CHx(r1, r0, r13)
            r8.CHx(r1, r0, r4)
            r8.CHx(r1, r0, r3)
            r8.CHx(r1, r0, r11)
            java.lang.String r1 = android.os.Build.DEVICE
            r0 = 495(0x1ef, float:6.94E-43)
            r8.CHx(r1, r0, r13)
            r8.CHx(r1, r0, r4)
            java.lang.String r1 = android.os.Build.MODEL
            r0 = 289(0x121, float:4.05E-43)
            r8.CHx(r1, r0, r13)
            r8.CHx(r1, r0, r4)
            r0 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1657(0x679, float:2.322E-42)
            r8.CHx(r1, r0, r13)
            r8.CHx(r1, r0, r4)
            r8.CHx(r1, r0, r3)
            r8.CHx(r1, r0, r11)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0 = 1659(0x67b, float:2.325E-42)
            r8.CHx(r1, r0, r13)
            r8.CHx(r1, r0, r4)
            r0 = 12390(0x3066, float:1.7362E-41)
            boolean r0 = X.C18020vd.A05(r9, r5, r0)
            if (r0 != 0) goto L_0x01e8
            X.19F r12 = r6.A07
            monitor-enter(r12)
            goto L_0x01d3
        L_0x01c2:
            r1 = 1
            goto L_0x012c
        L_0x01c5:
            r1 = 3
            goto L_0x012c
        L_0x01c8:
            int r0 = r11.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L_0x0071
        L_0x01d3:
            android.content.SharedPreferences r1 = r12.A00     // Catch:{ all -> 0x01dc }
            java.lang.String r0 = "ab_props:sys:config_key"
            java.lang.String r1 = r1.getString(r0, r2)     // Catch:{ all -> 0x01dc }
            goto L_0x01df
        L_0x01dc:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x01df:
            monitor-exit(r12)
            r0 = 4473(0x1179, float:6.268E-42)
            r8.CHx(r1, r0, r13)
            r8.CHx(r1, r0, r4)
        L_0x01e8:
            X.118 r0 = r6.A05
            android.content.Context r13 = r0.A00
            long r16 = X.C24201Jg.A00(r13)
            r14 = 1
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x021e
            java.lang.String r14 = r13.getPackageName()     // Catch:{ Exception -> 0x0217 }
            android.content.pm.PackageManager r0 = r13.getPackageManager()     // Catch:{ Exception -> 0x0217 }
            android.content.pm.Signature r12 = X.C20070A5v.A00(r0, r14)     // Catch:{ Exception -> 0x0217 }
            X.00H r0 = r6.A0B     // Catch:{ Exception -> 0x0217 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0217 }
            X.2qV r1 = (X.C61922qV) r1     // Catch:{ Exception -> 0x0217 }
            byte[] r0 = r12.toByteArray()     // Catch:{ Exception -> 0x0217 }
            boolean r0 = r1.A00(r14, r0)     // Catch:{ Exception -> 0x0217 }
            if (r0 == 0) goto L_0x021c
            r16 = 0
            goto L_0x021e
        L_0x0217:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            goto L_0x021e
        L_0x021c:
            r16 = 1
        L_0x021e:
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            r12 = 0
            r0 = 6251(0x186b, float:8.76E-42)
            r8.CHx(r1, r0, r12)
            r8.CHx(r1, r0, r4)
            r8.CHx(r1, r0, r3)
            r8.CHx(r1, r0, r11)
            android.content.pm.PackageManager r1 = r13.getPackageManager()
            java.lang.String r0 = r13.getPackageName()
            java.lang.String r1 = r1.getInstallerPackageName(r0)
            if (r1 != 0) goto L_0x0301
            r1 = 0
        L_0x0240:
            r0 = 10255(0x280f, float:1.437E-41)
            r8.CHx(r1, r0, r12)
            r8.CHx(r1, r0, r4)
            r0 = 12391(0x3067, float:1.7363E-41)
            boolean r0 = X.C18020vd.A05(r9, r5, r0)
            if (r0 != 0) goto L_0x0264
            X.19F r0 = r6.A07
            java.lang.String r1 = r0.A03()
            r0 = 5029(0x13a5, float:7.047E-42)
            r8.CHx(r1, r0, r12)
            r8.CHx(r1, r0, r4)
            r8.CHx(r1, r0, r3)
            r8.CHx(r1, r0, r11)
        L_0x0264:
            X.1Jq r0 = X.AnonymousClass1IP.A02(r13)
            if (r0 == 0) goto L_0x0279
            int r0 = r0.A00
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 12017(0x2ef1, float:1.684E-41)
            r8.CHx(r1, r0, r12)
            r8.CHx(r1, r0, r4)
        L_0x0279:
            X.0z4 r14 = r6.A06
            int r0 = r14.A0E()
            long r0 = (long) r0
            r15 = 1
            long r0 = r0 + r15
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 15265(0x3ba1, float:2.1391E-41)
            r8.CHx(r1, r0, r12)
            r8.CHx(r1, r0, r4)
            r0 = 3664(0xe50, float:5.134E-42)
            boolean r0 = X.C18020vd.A05(r9, r5, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r13 = 0
            r0 = 13293(0x33ed, float:1.8627E-41)
            r8.CHx(r1, r0, r12)
            r8.CHx(r1, r0, r4)
            r8.CHx(r1, r0, r3)
            r8.CHx(r1, r0, r11)
            X.00H r0 = r14.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "voip_call_ab_test_bucket"
            java.lang.String r0 = r1.getString(r0, r2)
            X.C24311Jr.A01(r8, r0)
            X.0zA r1 = r6.A02
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x032d
            java.lang.Object r12 = r1.A03()
            X.1HZ r12 = (X.AnonymousClass1HZ) r12
            X.0ve r1 = r12.A00
            r0 = 11288(0x2c18, float:1.5818E-41)
            boolean r0 = X.C18020vd.A05(r9, r1, r0)
            if (r0 == 0) goto L_0x0390
            X.1HY r14 = r12.A01
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            java.util.HashSet r0 = X.AnonymousClass1HY.A02(r14)
            java.util.Iterator r16 = r0.iterator()
        L_0x02e1:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x030d
            java.lang.Object r1 = r16.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "auth/token"
            java.lang.String r15 = X.AnonymousClass1HY.A01(r1, r0)
            android.content.SharedPreferences r0 = X.AnonymousClass1HY.A00(r14)
            java.lang.String r0 = r0.getString(r15, r2)
            if (r0 == 0) goto L_0x02e1
            r12.add(r1)
            goto L_0x02e1
        L_0x0301:
            java.lang.String r0 = "com.android.vending"
            boolean r0 = r0.equals(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            goto L_0x0240
        L_0x030d:
            boolean r0 = r12.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0390
            java.util.List r10 = java.util.Collections.singletonList(r10)
            X.C18070vi.A0X(r10)
            java.lang.String r1 = ","
            java.lang.String r0 = ""
            java.lang.String r1 = X.C29431cG.A0g(r1, r0, r0, r10, r2)
        L_0x0324:
            r12 = 0
            r0 = 23043(0x5a03, float:3.229E-41)
            r8.CHx(r1, r0, r13)
            r8.CHx(r1, r0, r4)
        L_0x032d:
            r0 = 5120(0x1400, float:7.175E-42)
            int r1 = X.C18020vd.A00(r9, r5, r0)
            if (r1 == r4) goto L_0x037c
            if (r1 == r11) goto L_0x037f
            if (r1 == r3) goto L_0x0379
            r0 = 4
            if (r1 == r0) goto L_0x037c
            r0 = 15881(0x3e09, float:2.2254E-41)
            r8.CHx(r2, r0, r12)
            r8.CHx(r2, r0, r4)
            r8.CHx(r2, r0, r3)
            r8.CHx(r2, r0, r11)
        L_0x034a:
            X.11S r0 = r6.A03
            r0.A0I()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x0363
            java.lang.String r1 = r0.cc
            java.lang.String r0 = r0.number
            java.lang.String r1 = X.AnonymousClass1K3.A01(r1, r0)
            r0 = 6833(0x1ab1, float:9.575E-42)
            r8.CHx(r1, r0, r3)
            r8.CHx(r1, r0, r11)
        L_0x0363:
            java.util.Set r0 = r6.A0C
            java.util.Iterator r1 = r0.iterator()
        L_0x0369:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0392
            java.lang.Object r0 = r1.next()
            X.18N r0 = (X.AnonymousClass18N) r0
            r0.BuU(r8)
            goto L_0x0369
        L_0x0379:
            java.lang.String r1 = "androidwametatest-ps"
            goto L_0x0381
        L_0x037c:
            java.lang.String r1 = "androidwametatest"
            goto L_0x0381
        L_0x037f:
            java.lang.String r1 = "androidwametatest-fs"
        L_0x0381:
            r0 = 15881(0x3e09, float:2.2254E-41)
            r8.CHx(r1, r0, r12)
            r8.CHx(r1, r0, r4)
            r8.CHx(r1, r0, r3)
            r8.CHx(r1, r0, r11)
            goto L_0x034a
        L_0x0390:
            r1 = r2
            goto L_0x0324
        L_0x0392:
            X.00H r0 = r7.A03
            java.lang.Object r0 = r0.get()
            X.1Kh r0 = (X.C24431Kh) r0
            android.net.NetworkInfo r0 = r0.A01()
            X.1LR r2 = X.AnonymousClass1LQ.A00(r0)
            if (r2 == 0) goto L_0x03c5
            r18.get()
            boolean r1 = r2.A06
            r0 = 0
            if (r1 == 0) goto L_0x03ad
            r0 = 1
        L_0x03ad:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 23
            r8.CHx(r1, r0, r12)
            r8.CHx(r1, r0, r4)
            java.lang.Integer r1 = X.AnonymousClass1LS.A00(r2)
            r0 = 105(0x69, float:1.47E-43)
            r8.CHx(r1, r0, r12)
            r8.CHx(r1, r0, r4)
        L_0x03c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23031Eg.A00(X.188):void");
    }

    public /* synthetic */ C23031Eg(C23021Ef r1) {
        this.A00 = r1;
    }
}
