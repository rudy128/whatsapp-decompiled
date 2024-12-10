package X;

/* renamed from: X.9m2  reason: invalid class name and case insensitive filesystem */
public class C191109m2 {
    public AnonymousClass118 A00;
    public AnonymousClass1QD A01;
    public AnonymousClass1QE A02 = AnonymousClass1QE.A00("PaymentCommonDeviceIdManager", "infra", "COMMON");
    public AnonymousClass11C A03;

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00() {
        /*
            r7 = this;
            X.1QE r2 = r7.A02
            java.lang.String r0 = "PaymentDeviceId: getid_v2()"
            r2.A04(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x001d
            java.lang.String r0 = "PaymentDeviceId: still fallback to v1"
            r2.A04(r0)
            X.11C r0 = r7.A03
            X.11B r0 = r0.A0O()
            java.lang.String r0 = X.C17970vW.A01(r0)
        L_0x001c:
            return r0
        L_0x001d:
            java.lang.String r0 = "PaymentDeviceId: generate id for v2"
            r2.A04(r0)
            X.11C r0 = r7.A03
            X.11B r0 = r0.A0O()
            java.lang.String r3 = X.C17970vW.A01(r0)
            X.118 r0 = r7.A00
            android.content.Context r0 = r0.A00
            if (r3 != 0) goto L_0x0034
            java.lang.String r3 = ""
        L_0x0034:
            r4 = 0
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch:{ NameNotFoundException | NullPointerException -> 0x0071 }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ NameNotFoundException | NullPointerException -> 0x0071 }
            r0 = 64
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException | NullPointerException -> 0x0071 }
            android.content.pm.Signature[] r1 = r0.signatures     // Catch:{ NameNotFoundException | NullPointerException -> 0x0071 }
            r0 = 0
            r0 = r1[r0]     // Catch:{ NameNotFoundException | NullPointerException -> 0x0071 }
            java.lang.String r2 = r0.toCharsString()     // Catch:{ NameNotFoundException | NullPointerException -> 0x0071 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ NameNotFoundException | NullPointerException -> 0x0071 }
            if (r0 != 0) goto L_0x0062
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r3)     // Catch:{ NameNotFoundException | NullPointerException -> 0x0071 }
            java.lang.String r0 = "-"
            r1.append(r0)     // Catch:{ NameNotFoundException | NullPointerException -> 0x0071 }
            r1.append(r2)     // Catch:{ NameNotFoundException | NullPointerException -> 0x0071 }
            java.lang.String r3 = r1.toString()     // Catch:{ NameNotFoundException | NullPointerException -> 0x0071 }
        L_0x0062:
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)     // Catch:{  }
            byte[] r0 = X.AnonymousClass8BR.A1Z(r3)     // Catch:{  }
            byte[] r0 = r1.digest(r0)     // Catch:{  }
            goto L_0x0076
        L_0x0071:
            android.util.Pair r1 = X.C108945cZ.A0N(r3, r4)
            goto L_0x007a
        L_0x0076:
            android.util.Pair r1 = X.C108945cZ.A0N(r3, r0)
        L_0x007a:
            java.lang.Object r0 = r1.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r6 = r1.second
            byte[] r6 = (byte[]) r6
            if (r6 == 0) goto L_0x001c
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            int r4 = r6.length
            r3 = 0
            r2 = 0
        L_0x008b:
            if (r2 >= r4) goto L_0x00a5
            byte r0 = r6[r2]
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r1[r3] = r0
            java.lang.String r0 = "%02X"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r5.append(r0)
            int r2 = r2 + 1
            goto L_0x008b
        L_0x00a5:
            java.lang.String r0 = r5.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191109m2.A00():java.lang.String");
    }

    public C191109m2(AnonymousClass11C r4, AnonymousClass118 r5, AnonymousClass1QD r6) {
        this.A00 = r5;
        this.A03 = r4;
        this.A01 = r6;
    }
}
