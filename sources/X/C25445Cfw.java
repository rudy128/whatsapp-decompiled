package X;

/* renamed from: X.Cfw  reason: case insensitive filesystem */
public abstract class C25445Cfw {
    public static C7Y A00;
    public static final BJL A01 = new Object();
    public static final Object A02 = C17880vN.A0p();

    /* JADX WARNING: type inference failed for: r1v1, types: [X.C7Y, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.C7Y, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v6, types: [X.C7Y, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v8, types: [X.C7Y, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r11 <= 0) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (r21 <= 0) goto L_0x005d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00b8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0135 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r22, boolean r23) {
        /*
            if (r23 != 0) goto L_0x0007
            X.C7Y r0 = A00
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.Object r13 = A02
            monitor-enter(r13)
            if (r23 != 0) goto L_0x000e
            goto L_0x015c
        L_0x000e:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0162 }
            r0 = 28
            r2 = 0
            if (r1 < r0) goto L_0x014f
            r0 = 30
            if (r1 == r0) goto L_0x014f
            java.lang.String r3 = "/data/misc/profiles/ref/"
            r5 = r22
            java.lang.String r1 = r5.getPackageName()     // Catch:{ all -> 0x0162 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0162 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0162 }
            java.lang.String r8 = "primary.prof"
            java.io.File r0 = X.C17880vN.A0e(r0, r8)     // Catch:{ all -> 0x0162 }
            long r11 = r0.length()     // Catch:{ all -> 0x0162 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0162 }
            r6 = 0
            r3 = 1
            if (r0 == 0) goto L_0x003e
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            r10 = 1
            if (r0 > 0) goto L_0x003f
        L_0x003e:
            r10 = 0
        L_0x003f:
            java.lang.String r4 = "/data/misc/profiles/cur/0/"
            java.lang.String r1 = r5.getPackageName()     // Catch:{ all -> 0x0162 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0162 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0162 }
            java.io.File r0 = X.C17880vN.A0e(r0, r8)     // Catch:{ all -> 0x0162 }
            long r21 = r0.length()     // Catch:{ all -> 0x0162 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x005d
            int r0 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            r9 = 1
            if (r0 > 0) goto L_0x005e
        L_0x005d:
            r9 = 0
        L_0x005e:
            android.content.Context r0 = r5.getApplicationContext()     // Catch:{ NameNotFoundException -> 0x0142 }
            android.content.pm.PackageManager r4 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0142 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x0142 }
            r0 = 33
            if (r1 < r0) goto L_0x0073
            android.content.pm.PackageInfo r0 = X.C7X.A00(r5, r4)     // Catch:{ NameNotFoundException -> 0x0142 }
        L_0x0070:
            long r0 = r0.lastUpdateTime     // Catch:{ NameNotFoundException -> 0x0142 }
            goto L_0x007c
        L_0x0073:
            java.lang.String r0 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0142 }
            android.content.pm.PackageInfo r0 = r4.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0142 }
            goto L_0x0070
        L_0x007c:
            java.io.File r5 = r5.getFilesDir()     // Catch:{ all -> 0x0162 }
            java.lang.String r4 = "profileInstalled"
            java.io.File r8 = X.C17880vN.A0e(r5, r4)     // Catch:{ all -> 0x0162 }
            boolean r4 = r8.exists()     // Catch:{ all -> 0x0162 }
            if (r4 == 0) goto L_0x00c6
            java.io.FileInputStream r5 = X.C108945cZ.A18(r8)     // Catch:{ IOException -> 0x00b8 }
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ IOException -> 0x00b8 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x00b8 }
            int r15 = r4.readInt()     // Catch:{ all -> 0x00ae }
            int r16 = r4.readInt()     // Catch:{ all -> 0x00ae }
            long r17 = r4.readLong()     // Catch:{ all -> 0x00ae }
            long r19 = r4.readLong()     // Catch:{ all -> 0x00ae }
            X.CYl r14 = new X.CYl     // Catch:{ all -> 0x00ae }
            r14.<init>(r15, r16, r17, r19)     // Catch:{ all -> 0x00ae }
            r4.close()     // Catch:{ IOException -> 0x00b8 }
            goto L_0x00c7
        L_0x00ae:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x00b3 }
            goto L_0x00b7
        L_0x00b3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x00b8 }
        L_0x00b7:
            throw r1     // Catch:{ IOException -> 0x00b8 }
        L_0x00b8:
            X.C7Y r1 = new X.C7Y     // Catch:{ all -> 0x0162 }
            r1.<init>()     // Catch:{ all -> 0x0162 }
            A00 = r1     // Catch:{ all -> 0x0162 }
            X.BJL r0 = A01     // Catch:{ all -> 0x0162 }
            r0.A04(r1)     // Catch:{ all -> 0x0162 }
            goto L_0x0160
        L_0x00c6:
            r14 = 0
        L_0x00c7:
            r7 = 2
            if (r14 == 0) goto L_0x00d5
            long r4 = r14.A03     // Catch:{ all -> 0x0162 }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x00d5
            int r4 = r14.A00     // Catch:{ all -> 0x0162 }
            if (r4 == r7) goto L_0x00d5
            goto L_0x00dd
        L_0x00d5:
            if (r10 == 0) goto L_0x00d9
            r2 = 1
            goto L_0x00de
        L_0x00d9:
            if (r9 == 0) goto L_0x00de
            r2 = 2
            goto L_0x00de
        L_0x00dd:
            r2 = r4
        L_0x00de:
            if (r23 == 0) goto L_0x00e5
            if (r9 == 0) goto L_0x00e5
            if (r2 == r3) goto L_0x00e5
            r2 = 2
        L_0x00e5:
            if (r14 == 0) goto L_0x00f4
            int r4 = r14.A00     // Catch:{ all -> 0x0162 }
            if (r4 != r7) goto L_0x00f4
            if (r2 != r3) goto L_0x00f4
            long r4 = r14.A02     // Catch:{ all -> 0x0162 }
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x00f4
            r2 = 3
        L_0x00f4:
            X.CYl r4 = new X.CYl     // Catch:{ all -> 0x0162 }
            r16 = r4
            r17 = r3
            r18 = r2
            r19 = r0
            r16.<init>(r17, r18, r19, r21)     // Catch:{ all -> 0x0162 }
            if (r14 == 0) goto L_0x0109
            boolean r0 = r14.equals(r4)     // Catch:{ all -> 0x0162 }
            if (r0 != 0) goto L_0x0135
        L_0x0109:
            r8.delete()     // Catch:{ IOException -> 0x0135 }
            java.io.FileOutputStream r0 = X.C108945cZ.A19(r8)     // Catch:{ IOException -> 0x0135 }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0135 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0135 }
            r2.writeInt(r3)     // Catch:{ all -> 0x012b }
            int r0 = r4.A00     // Catch:{ all -> 0x012b }
            r2.writeInt(r0)     // Catch:{ all -> 0x012b }
            long r0 = r4.A03     // Catch:{ all -> 0x012b }
            r2.writeLong(r0)     // Catch:{ all -> 0x012b }
            long r0 = r4.A02     // Catch:{ all -> 0x012b }
            r2.writeLong(r0)     // Catch:{ all -> 0x012b }
            r2.close()     // Catch:{ IOException -> 0x0135 }
            goto L_0x0135
        L_0x012b:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0130 }
            goto L_0x0134
        L_0x0130:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0135 }
        L_0x0134:
            throw r1     // Catch:{ IOException -> 0x0135 }
        L_0x0135:
            X.C7Y r1 = new X.C7Y     // Catch:{ all -> 0x0162 }
            r1.<init>()     // Catch:{ all -> 0x0162 }
            A00 = r1     // Catch:{ all -> 0x0162 }
            X.BJL r0 = A01     // Catch:{ all -> 0x0162 }
            r0.A04(r1)     // Catch:{ all -> 0x0162 }
            goto L_0x0160
        L_0x0142:
            X.C7Y r1 = new X.C7Y     // Catch:{ all -> 0x0162 }
            r1.<init>()     // Catch:{ all -> 0x0162 }
            A00 = r1     // Catch:{ all -> 0x0162 }
            X.BJL r0 = A01     // Catch:{ all -> 0x0162 }
            r0.A04(r1)     // Catch:{ all -> 0x0162 }
            goto L_0x0160
        L_0x014f:
            X.C7Y r1 = new X.C7Y     // Catch:{ all -> 0x0162 }
            r1.<init>()     // Catch:{ all -> 0x0162 }
            A00 = r1     // Catch:{ all -> 0x0162 }
            X.BJL r0 = A01     // Catch:{ all -> 0x0162 }
            r0.A04(r1)     // Catch:{ all -> 0x0162 }
            goto L_0x0160
        L_0x015c:
            X.C7Y r0 = A00     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x000e
        L_0x0160:
            monitor-exit(r13)     // Catch:{ all -> 0x0162 }
            return
        L_0x0162:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0162 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25445Cfw.A00(android.content.Context, boolean):void");
    }
}
