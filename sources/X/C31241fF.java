package X;

/* renamed from: X.1fF  reason: invalid class name and case insensitive filesystem */
public final class C31241fF {
    public final AnonymousClass190 A00;
    public final C19830z4 A01;
    public final C30961en A02 = new Object();
    public final AnonymousClass00H A03;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.1en, java.lang.Object] */
    public C31241fF(AnonymousClass190 r2, C19830z4 r3, AnonymousClass00H r4) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r3, 3);
        this.A00 = r2;
        this.A03 = r4;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.C31241fF r5) {
        /*
            monitor-enter(r5)
            X.0z4 r4 = r5.A01     // Catch:{ all -> 0x0052 }
            X.00H r0 = r4.A00     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0052 }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x0052 }
            java.lang.String r3 = "wa_dictionary_version"
            r0 = 0
            int r2 = r1.getInt(r3, r0)     // Catch:{ all -> 0x0052 }
            r1 = 3
            if (r2 == r1) goto L_0x0021
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r4)     // Catch:{ all -> 0x0052 }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r3, r1)     // Catch:{ all -> 0x0052 }
            r0.apply()     // Catch:{ all -> 0x0052 }
        L_0x0021:
            monitor-exit(r5)
            if (r2 == 0) goto L_0x0050
            if (r2 == r1) goto L_0x0050
            java.lang.String r0 = "PreacksStore/deleteAll preacks"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r5.A03
            java.lang.Object r0 = r0.get()
            X.1Ls r0 = (X.C24801Ls) r0
            X.1au r4 = r0.A06()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0049 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "preacks"
            java.lang.String r1 = "PreacksStore/DELETE_ALL"
            r0 = 0
            r3.A04(r2, r0, r1, r0)     // Catch:{ all -> 0x0049 }
            r4.close()
            r0 = 1
            return r0
        L_0x0049:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x0050:
            r0 = 0
            return r0
        L_0x0052:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31241fF.A00(X.1fF):boolean");
    }
}
