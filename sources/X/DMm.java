package X;

import java.util.AbstractMap;
import java.util.List;

public class DMm implements C27271Vk {
    public final int A00;
    public final Object A01;

    public DMm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Object obj, AbstractMap abstractMap, List list, int[] iArr, int i) {
        abstractMap.put(obj, list.get(iArr[i]));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (android.text.TextUtils.isEmpty(r2) == false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get() {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 2: goto L_0x0008;
                case 3: goto L_0x0005;
                case 4: goto L_0x00d8;
                case 5: goto L_0x00e1;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r11.A01
            return r2
        L_0x0008:
            java.lang.Object r1 = r11.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<X.D9u> r10 = X.C26696D9u.class
            monitor-enter(r10)
            X.D9u r2 = X.C26696D9u.A0A     // Catch:{ all -> 0x00d5 }
            if (r2 != 0) goto L_0x00d3
            if (r1 == 0) goto L_0x0016
            goto L_0x001f
        L_0x0016:
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ all -> 0x00d5 }
            java.lang.String r2 = r0.getCountry()     // Catch:{ all -> 0x00d5 }
            goto L_0x0036
        L_0x001f:
            r1.getApplicationContext()     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ all -> 0x00d5 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x0016
            java.lang.String r2 = r0.getNetworkCountryIso()     // Catch:{ all -> 0x00d5 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x00d5 }
            if (r0 != 0) goto L_0x0016
        L_0x0036:
            int r4 = r2.length()     // Catch:{ all -> 0x00d5 }
            r3 = 0
        L_0x003b:
            if (r3 >= r4) goto L_0x0068
            char r1 = r2.charAt(r3)     // Catch:{ all -> 0x00d5 }
            r0 = 97
            if (r1 < r0) goto L_0x004a
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 > r0) goto L_0x004a
            goto L_0x004d
        L_0x004a:
            int r3 = r3 + 1
            goto L_0x003b
        L_0x004d:
            char[] r2 = r2.toCharArray()     // Catch:{ all -> 0x00d5 }
        L_0x0051:
            if (r3 >= r4) goto L_0x0065
            char r1 = r2[r3]     // Catch:{ all -> 0x00d5 }
            r0 = 97
            if (r1 < r0) goto L_0x0062
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 > r0) goto L_0x0062
            r0 = r1 ^ 32
            char r0 = (char) r0     // Catch:{ all -> 0x00d5 }
            r2[r3] = r0     // Catch:{ all -> 0x00d5 }
        L_0x0062:
            int r3 = r3 + 1
            goto L_0x0051
        L_0x0065:
            java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00d5 }
        L_0x0068:
            r0 = 6
            int[] r6 = new int[r0]     // Catch:{ all -> 0x00d5 }
            r6 = {2, 2, 2, 2, 2, 2} // fill-array     // Catch:{ all -> 0x00d5 }
            r0 = 8
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x00d5 }
            r5.<init>(r0)     // Catch:{ all -> 0x00d5 }
            r4 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00d5 }
            r0 = 1000000(0xf4240, double:4.940656E-318)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00d5 }
            r5.put(r2, r0)     // Catch:{ all -> 0x00d5 }
            r9 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00d5 }
            X.1IX r3 = X.C26696D9u.A0G     // Catch:{ all -> 0x00d5 }
            A00(r0, r5, r3, r6, r4)     // Catch:{ all -> 0x00d5 }
            r8 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00d5 }
            X.1IX r1 = X.C26696D9u.A0B     // Catch:{ all -> 0x00d5 }
            r0 = 1
            A00(r2, r5, r1, r6, r0)     // Catch:{ all -> 0x00d5 }
            r7 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00d5 }
            X.1IX r0 = X.C26696D9u.A0C     // Catch:{ all -> 0x00d5 }
            A00(r1, r5, r0, r6, r9)     // Catch:{ all -> 0x00d5 }
            r2 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00d5 }
            X.1IX r0 = X.C26696D9u.A0D     // Catch:{ all -> 0x00d5 }
            A00(r1, r5, r0, r6, r8)     // Catch:{ all -> 0x00d5 }
            r0 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00d5 }
            X.1IX r0 = X.C26696D9u.A0E     // Catch:{ all -> 0x00d5 }
            A00(r1, r5, r0, r6, r7)     // Catch:{ all -> 0x00d5 }
            r0 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00d5 }
            X.1IX r0 = X.C26696D9u.A0F     // Catch:{ all -> 0x00d5 }
            A00(r1, r5, r0, r6, r2)     // Catch:{ all -> 0x00d5 }
            java.lang.Integer r0 = X.C108955ca.A0e()     // Catch:{ all -> 0x00d5 }
            A00(r0, r5, r3, r6, r4)     // Catch:{ all -> 0x00d5 }
            X.EAp r0 = X.C28617EAp.A00     // Catch:{ all -> 0x00d5 }
            X.D9u r2 = new X.D9u     // Catch:{ all -> 0x00d5 }
            r2.<init>(r0, r5)     // Catch:{ all -> 0x00d5 }
            X.C26696D9u.A0A = r2     // Catch:{ all -> 0x00d5 }
        L_0x00d3:
            monitor-exit(r10)
            return r2
        L_0x00d5:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x00d8:
            java.lang.Object r0 = r11.A01
            X.Cuy r0 = (X.C26216Cuy) r0
            java.lang.Boolean r2 = X.C18070vi.A0d(r0, 0)
            return r2
        L_0x00e1:
            java.lang.Object r0 = r11.A01
            X.Cuy r0 = (X.C26216Cuy) r0
            java.lang.Boolean r2 = X.C18070vi.A0d(r0, 0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DMm.get():java.lang.Object");
    }
}
