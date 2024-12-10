package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.CeX  reason: case insensitive filesystem */
public abstract class C25372CeX {
    public static final ConcurrentHashMap A00 = AnonymousClass8BR.A17();

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C26235CvV A00(android.content.Context r7, java.lang.Integer r8) {
        /*
            int r4 = X.C72463Mc.A0B(r8)
            java.util.concurrent.ConcurrentHashMap r6 = A00
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r6.get(r5)
            if (r1 != 0) goto L_0x008c
            if (r4 == 0) goto L_0x0025
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Expected a valid screen template for implementation key: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ". Please ensure that your app provides one"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r0, r1)
            throw r0
        L_0x0025:
            r3 = 0
            android.content.res.AssetManager r1 = r7.getAssets()     // Catch:{ IOException -> 0x0055 }
            java.lang.String r0 = "json/bloks_screen_template.json"
            java.io.InputStream r1 = r1.open(r0)     // Catch:{ IOException -> 0x0055 }
            X.C18070vi.A0X(r1)     // Catch:{ IOException -> 0x0055 }
            java.nio.charset.Charset r0 = X.C26571Sq.A05     // Catch:{ IOException -> 0x0055 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0055 }
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x0055 }
            boolean r0 = r2 instanceof java.io.BufferedReader     // Catch:{ IOException -> 0x0055 }
            if (r0 != 0) goto L_0x0046
            r1 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0055 }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0055 }
            r2 = r0
        L_0x0046:
            java.lang.String r0 = X.C181849Sb.A00(r2)     // Catch:{ all -> 0x004e }
            r2.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x006e
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x0055 }
            throw r0     // Catch:{ IOException -> 0x0055 }
        L_0x0055:
            r1 = move-exception
            java.lang.String r0 = "WaBloksScreenTemplateProvider"
            X.C25913CoX.A02(r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Got null screen template for implementation key: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ". Please make sure to provide a valid screen template!"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r0, r1)
            throw r0
        L_0x006e:
            X.ALN r0 = X.BEA.A0V(r0)
            X.ChR r0 = X.C25529ChR.A00(r0)
            X.C18070vi.A0X(r0)
            X.CLb r0 = r0.A00
            if (r0 == 0) goto L_0x008f
            X.CUK r0 = r0.A00
            if (r0 == 0) goto L_0x008f
            X.CvV r1 = X.C26235CvV.A02(r0, r3)
            java.lang.Object r0 = r6.putIfAbsent(r5, r1)
            if (r0 == 0) goto L_0x008c
            r1 = r0
        L_0x008c:
            X.CvV r1 = (X.C26235CvV) r1
            return r1
        L_0x008f:
            java.lang.String r0 = "Screen template must contain a valid BloksResponse"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25372CeX.A00(android.content.Context, java.lang.Integer):X.CvV");
    }
}
