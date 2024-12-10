package X;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* renamed from: X.19I  reason: invalid class name */
public class AnonymousClass19I {
    public static final AnonymousClass19J A06 = new AnonymousClass19J(0, 0, false, false);
    public final C18030ve A00;
    public final AnonymousClass19A A01;
    public volatile Boolean A02;
    public volatile Boolean A03;
    public volatile Long A04;
    public volatile ConcurrentHashMap A05;

    public boolean A03() {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    boolean z = false;
                    if (C18020vd.A05(C18040vf.A02, this.A00, 212)) {
                        z = true;
                    }
                    this.A02 = Boolean.valueOf(z);
                }
            }
        }
        return this.A02.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r11 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011d, code lost:
        if (r11.hasNext() == false) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011f, code lost:
        r8 = (long[]) r11.next();
        r10 = (int) r8[0];
        r9 = (int) r8[1];
        r13 = java.lang.Math.max(r8[2], 0);
        r15 = r8[3];
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013a, code lost:
        if (3 != r9) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013c, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013d, code lost:
        r9 = java.lang.Integer.valueOf(r10);
        r4 = (X.AnonymousClass19J) r7.get(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0147, code lost:
        if (r4 == null) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0149, code lost:
        r3 = r4.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014b, code lost:
        if (r3 == r8) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014d, code lost:
        r4 = r0.A01;
        r2 = new java.lang.StringBuilder();
        r2.append("Failed to overwrite sampling for eventId:");
        r2.append(r10);
        r2.append(" base config sampling type: ");
        r2.append(r3);
        r2.append(" overwrite sampling type: ");
        r2.append(r8);
        r4.BKX(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0174, code lost:
        r1 = r4.A01;
        r13 = java.lang.Math.min(r13, r1);
        r3 = r4.A00;
        r15 = r15 | r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x017f, code lost:
        if (r13 != r1) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0181, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0185, code lost:
        if (r15 == r3) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0188, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x018a, code lost:
        r7.put(r9, new X.AnonymousClass19J(r13, r15, r8, r18));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass19J A00(X.AnonymousClass19I r18, int r19) {
        /*
            r0 = r18
            java.util.concurrent.ConcurrentHashMap r1 = r0.A05
            if (r1 != 0) goto L_0x01fd
            monitor-enter(r0)
            java.util.concurrent.ConcurrentHashMap r1 = r0.A05     // Catch:{ all -> 0x01fa }
            if (r1 != 0) goto L_0x01f8
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x01fa }
            r7.<init>()     // Catch:{ all -> 0x01fa }
            X.0ve r6 = r0.A00     // Catch:{ Exception -> 0x01e9 }
            r1 = 226(0xe2, float:3.17E-43)
            X.0vf r5 = X.C18040vf.A02     // Catch:{ Exception -> 0x01e9 }
            org.json.JSONObject r1 = X.C18020vd.A02(r5, r6, r1)     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r4 = "sampling"
            org.json.JSONArray r2 = r1.getJSONArray(r4)     // Catch:{ Exception -> 0x01e9 }
            int r1 = r2.length()     // Catch:{ Exception -> 0x01e9 }
            if (r1 != 0) goto L_0x0060
            r1 = 1716(0x6b4, float:2.405E-42)
            org.json.JSONObject r3 = X.C18020vd.A02(r5, r6, r1)     // Catch:{ Exception -> 0x01e9 }
            r1 = 1717(0x6b5, float:2.406E-42)
            org.json.JSONObject r2 = X.C18020vd.A02(r5, r6, r1)     // Catch:{ Exception -> 0x01e9 }
            org.json.JSONArray r1 = r3.getJSONArray(r4)     // Catch:{ Exception -> 0x01e9 }
            A02(r7, r1)     // Catch:{ Exception -> 0x01e9 }
            org.json.JSONArray r1 = r2.getJSONArray(r4)     // Catch:{ Exception -> 0x01e9 }
            A02(r7, r1)     // Catch:{ Exception -> 0x01e9 }
        L_0x0040:
            r1 = 3035(0xbdb, float:4.253E-42)
            boolean r1 = X.C18020vd.A05(r5, r6, r1)     // Catch:{ Exception -> 0x01e9 }
            if (r1 == 0) goto L_0x01b0
            r1 = 1199(0x4af, float:1.68E-42)
            java.lang.String r11 = X.C18020vd.A01(r5, r6, r1)     // Catch:{ Exception -> 0x01e9 }
            if (r11 == 0) goto L_0x01b0
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ Exception -> 0x01e9 }
            r13.<init>()     // Catch:{ Exception -> 0x01e9 }
            r1 = 4
            long[] r10 = new long[r1]     // Catch:{ Exception -> 0x01e9 }
            r12 = 0
            r9 = 0
            r8 = 0
            r18 = 0
            r17 = 0
            goto L_0x0064
        L_0x0060:
            A02(r7, r2)     // Catch:{ Exception -> 0x01e9 }
            goto L_0x0040
        L_0x0064:
            int r3 = r11.length()     // Catch:{ Exception -> 0x0195 }
            if (r9 >= r3) goto L_0x0115
            char r14 = r11.charAt(r9)     // Catch:{ Exception -> 0x0195 }
            r4 = 91
            r1 = 0
            if (r14 != r4) goto L_0x0078
            java.util.Arrays.fill(r10, r1)     // Catch:{ Exception -> 0x0195 }
            goto L_0x00ac
        L_0x0078:
            r4 = 93
            if (r14 != r4) goto L_0x008a
            r1 = 2
            if (r8 >= r1) goto L_0x0080
            goto L_0x00cd
        L_0x0080:
            java.lang.Object r1 = r10.clone()     // Catch:{ Exception -> 0x0195 }
            long[] r1 = (long[]) r1     // Catch:{ Exception -> 0x0195 }
            r13.add(r1)     // Catch:{ Exception -> 0x0195 }
            goto L_0x00c8
        L_0x008a:
            r3 = 44
            if (r14 != r3) goto L_0x0091
            int r8 = r8 + 1
            goto L_0x00ca
        L_0x0091:
            boolean r3 = java.lang.Character.isDigit(r14)     // Catch:{ Exception -> 0x0195 }
            if (r3 == 0) goto L_0x00b2
            r3 = r10[r8]     // Catch:{ Exception -> 0x0195 }
            r1 = 10
            long r3 = r3 * r1
            r10[r8] = r3     // Catch:{ Exception -> 0x0195 }
            int r1 = java.lang.Character.getNumericValue(r14)     // Catch:{ Exception -> 0x0195 }
            long r1 = (long) r1     // Catch:{ Exception -> 0x0195 }
            long r3 = r3 + r1
            r10[r8] = r3     // Catch:{ Exception -> 0x0195 }
            if (r17 == 0) goto L_0x00ca
            long r1 = -r3
            r10[r8] = r1     // Catch:{ Exception -> 0x0195 }
            goto L_0x00af
        L_0x00ac:
            r8 = 0
            r18 = 1
        L_0x00af:
            r17 = 0
            goto L_0x00ca
        L_0x00b2:
            r3 = 45
            if (r14 != r3) goto L_0x00bf
            r15 = r10[r8]     // Catch:{ Exception -> 0x0195 }
            int r3 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x00bf
            r17 = 1
            goto L_0x00ca
        L_0x00bf:
            boolean r1 = java.lang.Character.isWhitespace(r14)     // Catch:{ Exception -> 0x0195 }
            if (r1 != 0) goto L_0x00ca
            if (r18 == 0) goto L_0x00ca
            goto L_0x00f5
        L_0x00c8:
            r18 = 0
        L_0x00ca:
            int r9 = r9 + 1
            goto L_0x0064
        L_0x00cd:
            int r1 = r9 + -20
            int r8 = java.lang.Math.max(r12, r1)     // Catch:{ Exception -> 0x0195 }
            int r1 = r9 + 20
            int r4 = java.lang.Math.min(r3, r1)     // Catch:{ Exception -> 0x0195 }
            X.19A r3 = r0.A01     // Catch:{ Exception -> 0x0195 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0195 }
            r2.<init>()     // Catch:{ Exception -> 0x0195 }
            java.lang.String r1 = "Failed to parse config, not enough argumentscheck config around: "
            r2.append(r1)     // Catch:{ Exception -> 0x0195 }
            java.lang.String r1 = r11.substring(r8, r4)     // Catch:{ Exception -> 0x0195 }
            r2.append(r1)     // Catch:{ Exception -> 0x0195 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0195 }
            r3.BKX(r1)     // Catch:{ Exception -> 0x0195 }
            goto L_0x01b0
        L_0x00f5:
            X.19A r3 = r0.A01     // Catch:{ Exception -> 0x0195 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0195 }
            r2.<init>()     // Catch:{ Exception -> 0x0195 }
            java.lang.String r1 = "Failed to parse overwrite config, wrong symbol: '"
            r2.append(r1)     // Catch:{ Exception -> 0x0195 }
            r2.append(r14)     // Catch:{ Exception -> 0x0195 }
            java.lang.String r1 = "' at position: "
            r2.append(r1)     // Catch:{ Exception -> 0x0195 }
            r2.append(r9)     // Catch:{ Exception -> 0x0195 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0195 }
            r3.BKX(r1)     // Catch:{ Exception -> 0x0195 }
            goto L_0x01b0
        L_0x0115:
            java.util.Iterator r11 = r13.iterator()     // Catch:{ Exception -> 0x01e9 }
        L_0x0119:
            boolean r1 = r11.hasNext()     // Catch:{ Exception -> 0x01e9 }
            if (r1 == 0) goto L_0x01b0
            java.lang.Object r8 = r11.next()     // Catch:{ Exception -> 0x01e9 }
            long[] r8 = (long[]) r8     // Catch:{ Exception -> 0x01e9 }
            r1 = 0
            r1 = r8[r1]     // Catch:{ Exception -> 0x01e9 }
            int r10 = (int) r1     // Catch:{ Exception -> 0x01e9 }
            r1 = 1
            r1 = r8[r1]     // Catch:{ Exception -> 0x01e9 }
            int r9 = (int) r1     // Catch:{ Exception -> 0x01e9 }
            r1 = 2
            r3 = r8[r1]     // Catch:{ Exception -> 0x01e9 }
            r1 = 0
            long r13 = java.lang.Math.max(r3, r1)     // Catch:{ Exception -> 0x01e9 }
            r1 = 3
            r15 = r8[r1]     // Catch:{ Exception -> 0x01e9 }
            r8 = 0
            if (r1 != r9) goto L_0x013d
            r8 = 1
        L_0x013d:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x01e9 }
            java.lang.Object r4 = r7.get(r9)     // Catch:{ Exception -> 0x01e9 }
            X.19J r4 = (X.AnonymousClass19J) r4     // Catch:{ Exception -> 0x01e9 }
            if (r4 == 0) goto L_0x0188
            boolean r3 = r4.A03     // Catch:{ Exception -> 0x01e9 }
            if (r3 == r8) goto L_0x0174
            X.19A r4 = r0.A01     // Catch:{ Exception -> 0x01e9 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e9 }
            r2.<init>()     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r1 = "Failed to overwrite sampling for eventId:"
            r2.append(r1)     // Catch:{ Exception -> 0x01e9 }
            r2.append(r10)     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r1 = " base config sampling type: "
            r2.append(r1)     // Catch:{ Exception -> 0x01e9 }
            r2.append(r3)     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r1 = " overwrite sampling type: "
            r2.append(r1)     // Catch:{ Exception -> 0x01e9 }
            r2.append(r8)     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x01e9 }
            r4.BKX(r1)     // Catch:{ Exception -> 0x01e9 }
            goto L_0x0119
        L_0x0174:
            long r1 = r4.A01     // Catch:{ Exception -> 0x01e9 }
            long r13 = java.lang.Math.min(r13, r1)     // Catch:{ Exception -> 0x01e9 }
            long r3 = r4.A00     // Catch:{ Exception -> 0x01e9 }
            long r15 = r15 | r3
            int r10 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r10 != 0) goto L_0x0188
            r18 = 0
            int r1 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0119
            goto L_0x018a
        L_0x0188:
            r18 = 1
        L_0x018a:
            X.19J r12 = new X.19J     // Catch:{ Exception -> 0x01e9 }
            r17 = r8
            r12.<init>(r13, r15, r17, r18)     // Catch:{ Exception -> 0x01e9 }
            r7.put(r9, r12)     // Catch:{ Exception -> 0x01e9 }
            goto L_0x0119
        L_0x0195:
            r4 = move-exception
            X.19A r3 = r0.A01     // Catch:{ Exception -> 0x01e9 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e9 }
            r2.<init>()     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r1 = "Failed to parse overwrite config exception: "
            r2.append(r1)     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r1 = r4.getMessage()     // Catch:{ Exception -> 0x01e9 }
            r2.append(r1)     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x01e9 }
            r3.BKX(r1)     // Catch:{ Exception -> 0x01e9 }
        L_0x01b0:
            r1 = 12183(0x2f97, float:1.7072E-41)
            int r1 = X.C18020vd.A00(r5, r6, r1)     // Catch:{ Exception -> 0x01e9 }
            long r9 = (long) r1     // Catch:{ Exception -> 0x01e9 }
            r2 = 0
            int r1 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x01f6
            r1 = 726214113(0x2b4925e1, float:7.146211E-13)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x01e9 }
            java.lang.Object r4 = r7.get(r5)     // Catch:{ Exception -> 0x01e9 }
            X.19J r4 = (X.AnonymousClass19J) r4     // Catch:{ Exception -> 0x01e9 }
            if (r4 == 0) goto L_0x01e4
            long r1 = r4.A01     // Catch:{ Exception -> 0x01e9 }
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x01f6
            long r9 = java.lang.Math.min(r9, r1)     // Catch:{ Exception -> 0x01e9 }
            boolean r13 = r4.A03     // Catch:{ Exception -> 0x01e9 }
            long r11 = r4.A00     // Catch:{ Exception -> 0x01e9 }
            r14 = 1
        L_0x01db:
            X.19J r8 = new X.19J     // Catch:{ Exception -> 0x01e9 }
            r8.<init>(r9, r11, r13, r14)     // Catch:{ Exception -> 0x01e9 }
            r7.put(r5, r8)     // Catch:{ Exception -> 0x01e9 }
            goto L_0x01f6
        L_0x01e4:
            r13 = 0
            r14 = 1
            r11 = 0
            goto L_0x01db
        L_0x01e9:
            r1 = move-exception
            X.19A r2 = r0.A01     // Catch:{ all -> 0x01fa }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x01fa }
            r2.BKX(r1)     // Catch:{ all -> 0x01fa }
            r7.clear()     // Catch:{ all -> 0x01fa }
        L_0x01f6:
            r0.A05 = r7     // Catch:{ all -> 0x01fa }
        L_0x01f8:
            monitor-exit(r0)     // Catch:{ all -> 0x01fa }
            goto L_0x01fd
        L_0x01fa:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01fa }
            throw r1
        L_0x01fd:
            java.util.concurrent.ConcurrentHashMap r1 = r0.A05
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            java.lang.Object r1 = r1.get(r3)
            X.19J r1 = (X.AnonymousClass19J) r1
            if (r1 != 0) goto L_0x0222
            int r1 = r19 >> 16
            java.util.concurrent.ConcurrentHashMap r2 = r0.A05
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r2.get(r1)
            X.19J r1 = (X.AnonymousClass19J) r1
            if (r1 != 0) goto L_0x021d
            X.19J r1 = A06
        L_0x021d:
            java.util.concurrent.ConcurrentHashMap r0 = r0.A05
            r0.put(r3, r1)
        L_0x0222:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19I.A00(X.19I, int):X.19J");
    }

    public static void A01(AnonymousClass19I r3) {
        if (r3.A03 == null || r3.A04 == null) {
            synchronized (r3) {
                if (r3.A03 == null || r3.A04 == null) {
                    C18030ve r2 = r3.A00;
                    C18040vf r1 = C18040vf.A02;
                    r3.A03 = Boolean.valueOf(C18020vd.A05(r1, r2, 397));
                    r3.A04 = Long.valueOf((long) C18020vd.A00(r1, r2, 398));
                }
            }
        }
    }

    public static void A02(ConcurrentHashMap concurrentHashMap, JSONArray jSONArray) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                int i2 = jSONArray2.getInt(0);
                int i3 = jSONArray2.getInt(1);
                long max = Math.max(jSONArray2.getLong(2), 0);
                long optLong = jSONArray2.optLong(3);
                boolean z = false;
                if (3 == i3) {
                    z = true;
                }
                concurrentHashMap.put(Integer.valueOf(i2), new AnonymousClass19J(max, optLong, z, false));
            }
        }
    }

    public AnonymousClass19I(C18030ve r1, AnonymousClass19A r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
