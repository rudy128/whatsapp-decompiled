package X;

/* renamed from: X.2Qa  reason: invalid class name and case insensitive filesystem */
public enum C49322Qa {
    ;

    /* access modifiers changed from: public */
    static {
        new AnonymousClass2AS(0);
        A00 = new AnonymousClass2AS(1);
        A01 = new AnonymousClass2AS(2);
        new AnonymousClass2AS(3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00(X.C42771yi r11, X.C42811ym r12, java.lang.String r13) {
        /*
            r10 = this;
            r0 = r10
            X.2AS r0 = (X.AnonymousClass2AS) r0
            int r0 = r0.A00
            switch(r0) {
                case 0: goto L_0x0191;
                case 1: goto L_0x00d5;
                case 2: goto L_0x00e6;
                default: goto L_0x0008;
            }
        L_0x0008:
            boolean r0 = r11.A0N(r12)
            if (r0 == 0) goto L_0x002a
            boolean r0 = X.AnonymousClass3D6.A05(r11, r12, r13)
            if (r0 == 0) goto L_0x002a
            r0 = 47
            int r0 = r13.indexOf(r0)
            if (r0 <= 0) goto L_0x002c
            int r0 = r0 + 1
            java.lang.String r1 = r13.substring(r0)
            java.lang.String r0 = "/"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x002c
        L_0x002a:
            r0 = 0
            return r0
        L_0x002c:
            boolean r0 = X.AnonymousClass3D6.A04(r11, r12)
            if (r0 == 0) goto L_0x002a
            r0 = 1
            java.lang.StringBuilder r5 = X.C42771yi.A05(r13, r0)
            java.lang.String r4 = "-"
            java.lang.Integer r3 = X.AnonymousClass00R.A0N
            java.lang.String r2 = r11.A0J(r12, r3)
            r0 = 59
            int r1 = r2.indexOf(r0)
            if (r1 >= 0) goto L_0x004b
            int r1 = r2.length()
        L_0x004b:
            r0 = 45
            int r0 = r2.indexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r2.substring(r0, r1)
            java.lang.String[] r0 = r0.split(r4)
            boolean r0 = X.AnonymousClass3D6.A06(r12, r5, r0)
            if (r0 != 0) goto L_0x017b
            int r8 = r12.countryCode_
            java.util.Set r0 = X.C62962sH.A01
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x002a
            java.util.Map r6 = X.C62962sH.A00
            monitor-enter(r6)
            boolean r0 = r6.containsKey(r7)     // Catch:{ all -> 0x018e }
            if (r0 != 0) goto L_0x00d3
            java.lang.Class<X.3D6> r2 = X.AnonymousClass3D6.class
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x018e }
            java.lang.String r0 = "/com/google/i18n/phonenumbers/data/PhoneNumberAlternateFormatsProto_"
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r8)     // Catch:{ all -> 0x018e }
            java.io.InputStream r0 = r2.getResourceAsStream(r0)     // Catch:{ all -> 0x018e }
            r9 = 0
            java.io.ObjectInputStream r8 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x00c0 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x00c0 }
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ IOException -> 0x00bd, all -> 0x0186 }
            int r2 = r8.readInt()     // Catch:{ IOException -> 0x00bd, all -> 0x0186 }
            r1 = 0
        L_0x0097:
            if (r1 >= r2) goto L_0x00a7
            X.1yo r0 = new X.1yo     // Catch:{ IOException -> 0x00bd, all -> 0x0186 }
            r0.<init>()     // Catch:{ IOException -> 0x00bd, all -> 0x0186 }
            r0.readExternal(r8)     // Catch:{ IOException -> 0x00bd, all -> 0x0186 }
            r9.add(r0)     // Catch:{ IOException -> 0x00bd, all -> 0x0186 }
            int r1 = r1 + 1
            goto L_0x0097
        L_0x00a7:
            java.util.Iterator r2 = r9.iterator()     // Catch:{ IOException -> 0x00bd, all -> 0x0186 }
        L_0x00ab:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x00bd, all -> 0x0186 }
            if (r0 == 0) goto L_0x00d0
            java.lang.Object r1 = r2.next()     // Catch:{ IOException -> 0x00bd, all -> 0x0186 }
            X.1yo r1 = (X.C42831yo) r1     // Catch:{ IOException -> 0x00bd, all -> 0x0186 }
            int r0 = r1.countryCode_     // Catch:{ IOException -> 0x00bd, all -> 0x0186 }
            X.C17880vN.A1O(r1, r6, r0)     // Catch:{ IOException -> 0x00bd, all -> 0x0186 }
            goto L_0x00ab
        L_0x00bd:
            r0 = move-exception
            r9 = r8
            goto L_0x00c1
        L_0x00c0:
            r0 = move-exception
        L_0x00c1:
            java.util.logging.Logger r2 = X.C62962sH.A02     // Catch:{ all -> 0x0189 }
            java.util.logging.Level r1 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0189 }
            r2.log(r1, r0)     // Catch:{ all -> 0x0189 }
            X.C62962sH.A00(r9)     // Catch:{ all -> 0x018e }
            goto L_0x00d3
        L_0x00d0:
            X.C62962sH.A00(r8)     // Catch:{ all -> 0x018e }
        L_0x00d3:
            monitor-exit(r6)     // Catch:{ all -> 0x018e }
            goto L_0x0139
        L_0x00d5:
            boolean r0 = r11.A0N(r12)
            if (r0 == 0) goto L_0x002a
            boolean r0 = X.AnonymousClass3D6.A05(r11, r12, r13)
            if (r0 == 0) goto L_0x002a
            boolean r0 = X.AnonymousClass3D6.A04(r11, r12)
            return r0
        L_0x00e6:
            X.2Qa r2 = A00
            boolean r0 = r2.A00(r11, r12, r13)
            r3 = 1
            if (r0 != 0) goto L_0x017b
            boolean r0 = r12.hasNationalNumber
            if (r0 == 0) goto L_0x012b
            long r0 = r12.nationalNumber_
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "8"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x012b
            boolean r0 = r12.hasCountryCode
            if (r0 == 0) goto L_0x012b
            int r1 = r12.countryCode_
            r0 = 7
            if (r1 != r0) goto L_0x012b
            boolean r0 = r12.hasCountryCodeSource
            if (r0 == 0) goto L_0x012b
            X.1yn r1 = r12.countryCodeSource_
            X.1yn r0 = X.C42821yn.FROM_DEFAULT_COUNTRY
            if (r1 != r0) goto L_0x012b
            java.lang.String r0 = r4.substring(r3)
            long r0 = java.lang.Long.parseLong(r0)
            r12.hasNationalNumber = r3
            r12.nationalNumber_ = r0
            X.1yn r0 = X.C42821yn.FROM_NUMBER_WITHOUT_PLUS_SIGN
            r12.hasCountryCodeSource = r3
            r12.countryCodeSource_ = r0
        L_0x0126:
            boolean r0 = r2.A00(r11, r12, r13)
            return r0
        L_0x012b:
            boolean r0 = r12.hasItalianLeadingZero
            if (r0 == 0) goto L_0x002a
            boolean r0 = r12.italianLeadingZero_
            if (r0 == 0) goto L_0x002a
            r0 = 0
            r12.hasItalianLeadingZero = r0
            r12.italianLeadingZero_ = r0
            goto L_0x0126
        L_0x0139:
            java.lang.Object r0 = r6.get(r7)
            X.1yo r0 = (X.C42831yo) r0
            if (r0 == 0) goto L_0x002a
            java.util.List r0 = r0.numberFormat_
            java.util.Iterator r6 = r0.iterator()
        L_0x0147:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = r6.next()
            X.1yv r1 = (X.C42901yv) r1
            if (r1 != 0) goto L_0x017d
            java.lang.String r2 = r11.A0J(r12, r3)
            r0 = 59
            int r1 = r2.indexOf(r0)
            if (r1 >= 0) goto L_0x0165
            int r1 = r2.length()
        L_0x0165:
            r0 = 45
            int r0 = r2.indexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r2.substring(r0, r1)
        L_0x0171:
            java.lang.String[] r0 = r0.split(r4)
            boolean r0 = X.AnonymousClass3D6.A06(r12, r5, r0)
            if (r0 == 0) goto L_0x0147
        L_0x017b:
            r0 = 1
            return r0
        L_0x017d:
            java.lang.String r0 = X.C42771yi.A03(r12)
            java.lang.String r0 = X.C42771yi.A02(r11, r1, r3, r0)
            goto L_0x0171
        L_0x0186:
            r0 = move-exception
            r9 = r8
            goto L_0x018a
        L_0x0189:
            r0 = move-exception
        L_0x018a:
            X.C62962sH.A00(r9)     // Catch:{ all -> 0x018e }
            throw r0     // Catch:{ all -> 0x018e }
        L_0x018e:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x018e }
            throw r0
        L_0x0191:
            boolean r0 = r11.A0M(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49322Qa.A00(X.1yi, X.1ym, java.lang.String):boolean");
    }
}
