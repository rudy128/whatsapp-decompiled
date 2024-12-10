package X;

/* renamed from: X.8Qr  reason: invalid class name */
public final class AnonymousClass8Qr extends AnonymousClass3BQ {
    public final AnonymousClass8Qn[] A00;
    public final /* synthetic */ C162498Qt A01;

    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ae, code lost:
        r5.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8Qr(X.C162498Qt r16, X.AnonymousClass1AE r17) {
        /*
            r15 = this;
            r0 = r16
            r15.A01 = r0
            r15.<init>()
            android.content.Context r2 = r0.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "/data/local/tmp/exopackage/"
            r1.append(r0)
            java.lang.String r0 = r2.getPackageName()
            r1.append(r0)
            java.lang.String r0 = "/native-libs/"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.io.File r12 = X.C108945cZ.A17(r0)
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.LinkedHashSet r10 = X.C17880vN.A14()
            java.lang.String[] r11 = X.C62732rs.A02()
            int r9 = r11.length
            r3 = 0
            r8 = 0
        L_0x0032:
            if (r8 >= r9) goto L_0x00de
            r1 = r11[r8]
            java.io.File r6 = X.C17880vN.A0e(r12, r1)
            boolean r0 = r6.isDirectory()
            if (r0 == 0) goto L_0x00b1
            r10.add(r1)
            java.lang.String r0 = "metadata.txt"
            java.io.File r1 = X.C17880vN.A0e(r6, r0)
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L_0x00b1
            java.io.FileReader r5 = new java.io.FileReader
            r5.<init>(r1)
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x00d4 }
            r4.<init>(r5)     // Catch:{ all -> 0x00d4 }
        L_0x0059:
            java.lang.String r2 = r4.readLine()     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x00ab
            int r0 = r2.length()     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x0059
            r0 = 32
            int r14 = r2.indexOf(r0)     // Catch:{ all -> 0x00ca }
            r0 = -1
            if (r14 == r0) goto L_0x00b5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = r2.substring(r3, r14)     // Catch:{ all -> 0x00ca }
            r1.append(r0)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = ".so"
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x00ca }
            int r13 = r7.size()     // Catch:{ all -> 0x00ca }
            r1 = 0
        L_0x0084:
            if (r1 >= r13) goto L_0x0097
            java.lang.Object r0 = r7.get(r1)     // Catch:{ all -> 0x00ca }
            X.8Qn r0 = (X.AnonymousClass8Qn) r0     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x00ca }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x00ca }
            if (r0 != 0) goto L_0x00a9
            int r1 = r1 + 1
            goto L_0x0084
        L_0x0097:
            int r0 = r14 + 1
            java.lang.String r2 = r2.substring(r0)     // Catch:{ all -> 0x00ca }
            java.io.File r1 = X.C17880vN.A0e(r6, r2)     // Catch:{ all -> 0x00ca }
            X.8Qn r0 = new X.8Qn     // Catch:{ all -> 0x00ca }
            r0.<init>(r1, r3, r2)     // Catch:{ all -> 0x00ca }
            r7.add(r0)     // Catch:{ all -> 0x00ca }
        L_0x00a9:
            r3 = 0
            goto L_0x0059
        L_0x00ab:
            r4.close()     // Catch:{ all -> 0x00d4 }
            r5.close()
        L_0x00b1:
            int r8 = r8 + 1
            goto L_0x0032
        L_0x00b5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "illegal line in exopackage metadata: ["
            r1.append(r0)     // Catch:{ all -> 0x00ca }
            r1.append(r2)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = X.AnonymousClass000.A0z(r1)     // Catch:{ all -> 0x00ca }
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x00ca }
            throw r0     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x00cf }
            goto L_0x00d3
        L_0x00cf:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00d4 }
        L_0x00d3:
            throw r1     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00d9 }
            throw r1
        L_0x00d9:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x00de:
            int r0 = r10.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r10.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1 = r17
            r1.A01 = r0
            int r0 = r7.size()
            X.8Qn[] r0 = new X.AnonymousClass8Qn[r0]
            java.lang.Object[] r0 = r7.toArray(r0)
            X.8Qn[] r0 = (X.AnonymousClass8Qn[]) r0
            r15.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8Qr.<init>(X.8Qt, X.1AE):void");
    }

    public C182379Ud A00() {
        return new C182379Ud(this.A00);
    }

    public AnonymousClass3BP A01() {
        return new AnonymousClass8Qp(this);
    }
}
