package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.Cot  reason: case insensitive filesystem */
public abstract class C25929Cot {
    @Deprecated
    public static final C24924CPx A00 = new C24924CPx(CHF.A00, CHF.A01, "Nearby.CONNECTIONS_API");
    @Deprecated
    public static final C24924CPx A01 = new C24924CPx(DKU.A00, DKU.A01, "Nearby.MESSAGES_API");
    @Deprecated
    public static final C24924CPx A02 = new C24924CPx(CHG.A00, CHG.A01, "Nearby.BOOTSTRAP_API");
    @Deprecated
    public static final E2J A03 = DKU.A02;

    /* JADX WARNING: type inference failed for: r4v0, types: [X.BZ9, X.Cso] */
    public static final BZ9 A00(Context context) {
        C25829Cmg cmg;
        C18210vx.A02(context, "Context must not be null");
        ? cso = new C26126Cso(context, (C28622EAu) null, BZ9.A01, C25540Chd.A02);
        synchronized (C25829Cmg.class) {
            C25104CXx cXx = new C25104CXx(cso);
            Map map = C25829Cmg.A03;
            if (!map.containsKey(cXx)) {
                map.put(cXx, new C25829Cmg());
            }
            cmg = (C25829Cmg) map.get(cXx);
        }
        cso.A00 = cmg;
        return cso;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:64|65) */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c1, code lost:
        if (r7 == null) goto L_0x00d7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x00c0 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(android.content.Context r20) {
        /*
            X.1wL r0 = X.C41401wK.A00(r20)
            java.lang.String r1 = "com.google.android.providers.gsf.permission.READ_GSERVICES"
            android.content.Context r0 = r0.A00
            int r0 = r0.checkCallingOrSelfPermission(r1)
            r11 = 1
            if (r0 != 0) goto L_0x011d
            android.content.ContentResolver r14 = r20.getContentResolver()
            java.lang.String r5 = "gms:nearby:requires_gms_check"
            X.E26 r4 = X.C24721CHi.A02
            X.DJt r4 = (X.C26938DJt) r4
            if (r14 == 0) goto L_0x0116
            monitor-enter(r4)
            X.C26938DJt.A00(r14, r4)     // Catch:{ all -> 0x0113 }
            java.lang.Object r6 = r4.A00     // Catch:{ all -> 0x0113 }
            java.util.HashMap r3 = r4.A02     // Catch:{ all -> 0x0113 }
            r13 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x0113 }
            r20 = r2
            boolean r0 = r3.containsKey(r5)     // Catch:{ all -> 0x0113 }
            r7 = 0
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r3.get(r5)     // Catch:{ all -> 0x0113 }
            if (r0 == 0) goto L_0x003a
            r2 = r0
            goto L_0x003a
        L_0x0039:
            r2 = r7
        L_0x003a:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0113 }
            monitor-exit(r4)     // Catch:{ all -> 0x0113 }
            if (r2 == 0) goto L_0x0044
            boolean r13 = r2.booleanValue()
            return r13
        L_0x0044:
            monitor-enter(r4)
            X.C26938DJt.A00(r14, r4)     // Catch:{ all -> 0x0110 }
            java.lang.Object r9 = r4.A00     // Catch:{ all -> 0x0110 }
            java.util.HashMap r0 = r4.A01     // Catch:{ all -> 0x0110 }
            boolean r0 = r0.containsKey(r5)     // Catch:{ all -> 0x0110 }
            r12 = 0
            if (r0 == 0) goto L_0x005e
            java.util.HashMap r0 = r4.A01     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = X.C108945cZ.A1G(r5, r0)     // Catch:{ all -> 0x0110 }
            if (r0 == 0) goto L_0x005c
            r7 = r0
        L_0x005c:
            monitor-exit(r4)     // Catch:{ all -> 0x0110 }
            goto L_0x00c1
        L_0x005e:
            monitor-exit(r4)     // Catch:{ all -> 0x0110 }
            android.net.Uri r15 = X.C24732CHu.A00     // Catch:{ C2G -> 0x00c1 }
            java.lang.String[] r0 = new java.lang.String[r11]     // Catch:{ C2G -> 0x00c1 }
            r0[r12] = r5     // Catch:{ C2G -> 0x00c1 }
            r16 = 0
            r19 = r16
            r17 = r16
            r18 = r0
            android.database.Cursor r8 = r14.query(r15, r16, r17, r18, r19)     // Catch:{ C2G -> 0x00c1 }
            if (r8 == 0) goto L_0x009d
            boolean r0 = r8.moveToFirst()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x008a
            java.lang.String r1 = r8.getString(r11)     // Catch:{ all -> 0x00a5 }
            r8.close()     // Catch:{ C2G -> 0x00c1 }
            if (r1 == 0) goto L_0x008e
            boolean r0 = r1.equals(r7)
            if (r0 == 0) goto L_0x008e
            r1 = r7
            goto L_0x008e
        L_0x008a:
            r8.close()     // Catch:{ C2G -> 0x00c1 }
            r1 = r7
        L_0x008e:
            monitor-enter(r4)
            java.lang.Object r0 = r4.A00     // Catch:{ all -> 0x009a }
            if (r9 != r0) goto L_0x0098
            java.util.HashMap r0 = r4.A01     // Catch:{ all -> 0x009a }
            r0.put(r5, r1)     // Catch:{ all -> 0x009a }
        L_0x0098:
            monitor-exit(r4)     // Catch:{ all -> 0x009a }
            goto L_0x00c4
        L_0x009a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x009a }
            throw r0
        L_0x009d:
            java.lang.String r1 = "Failed to connect to GservicesProvider"
            X.C2G r0 = new X.C2G     // Catch:{ all -> 0x00a5 }
            r0.<init>(r1)     // Catch:{ all -> 0x00a5 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r10 = move-exception
            if (r8 == 0) goto L_0x00c0
            r8.close()     // Catch:{ all -> 0x00ac }
            goto L_0x00c0
        L_0x00ac:
            r9 = move-exception
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            java.lang.String r1 = "addSuppressed"
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x00c0 }
            r0[r12] = r8     // Catch:{ Exception -> 0x00c0 }
            java.lang.reflect.Method r1 = r8.getDeclaredMethod(r1, r0)     // Catch:{ Exception -> 0x00c0 }
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x00c0 }
            r0[r12] = r9     // Catch:{ Exception -> 0x00c0 }
            r1.invoke(r10, r0)     // Catch:{ Exception -> 0x00c0 }
        L_0x00c0:
            throw r10     // Catch:{ C2G -> 0x00c1 }
        L_0x00c1:
            if (r7 == 0) goto L_0x00d7
            goto L_0x00c7
        L_0x00c4:
            if (r1 == 0) goto L_0x00d7
            r7 = r1
        L_0x00c7:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00d7
            java.util.regex.Pattern r0 = X.C24732CHu.A02
            boolean r0 = X.AnonymousClass8BU.A1V(r7, r0)
            if (r0 == 0) goto L_0x00d9
            r2 = r20
        L_0x00d7:
            monitor-enter(r4)
            goto L_0x00ff
        L_0x00d9:
            java.util.regex.Pattern r0 = X.C24732CHu.A03
            boolean r0 = X.AnonymousClass8BU.A1V(r7, r0)
            if (r0 == 0) goto L_0x00e7
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
            r13 = 0
            goto L_0x00d7
        L_0x00e7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "attempt to read Gservices key gms:nearby:requires_gms_check (value \""
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "\") as boolean"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = "Gservices"
            android.util.Log.w(r0, r1)
            goto L_0x00d7
        L_0x00ff:
            java.lang.Object r0 = r4.A00     // Catch:{ all -> 0x010d }
            if (r6 != r0) goto L_0x010b
            r3.put(r5, r2)     // Catch:{ all -> 0x010d }
            java.util.HashMap r0 = r4.A01     // Catch:{ all -> 0x010d }
            r0.remove(r5)     // Catch:{ all -> 0x010d }
        L_0x010b:
            monitor-exit(r4)     // Catch:{ all -> 0x010d }
            return r13
        L_0x010d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x010d }
            throw r0
        L_0x0110:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0110 }
            throw r0
        L_0x0113:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0113 }
            throw r0
        L_0x0116:
            java.lang.String r0 = "ContentResolver needed with GservicesDelegateSupplier.init()"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x011d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25929Cot.A01(android.content.Context):boolean");
    }
}
