package X;

import java.util.List;
import java.util.Map;

public final class A0L {
    public final AMX A00;
    public final C199349zq A01;
    public final C192009nb A02;
    public final C186439eC A03;
    public final C58222kL A04;
    public final C199119zT A05;
    public final AnonymousClass1L7 A06;
    public final AnonymousClass2Dj A07;
    public final C18030ve A08;
    public final AnonymousClass11P A09;

    public static void A00(C19990A2d a2d, List list, Map map) {
        C18070vi.A0d(a2d, 0);
        String A012 = a2d.A01();
        C18070vi.A0X(A012);
        C19990A2d a2d2 = (C19990A2d) map.put(A012, a2d);
        if (a2d2 == null) {
            return;
        }
        if (A012.equals(a2d.A06)) {
            list.add(a2d);
            String A013 = a2d2.A01();
            C18070vi.A0X(A013);
            map.put(A013, a2d2);
            return;
        }
        list.add(a2d2);
    }

    public A0L(AMX amx, C199349zq r2, C192009nb r3, C186439eC r4, C58222kL r5, C199119zT r6, AnonymousClass1L7 r7, AnonymousClass11P r8, AnonymousClass2Dj r9, C18030ve r10) {
        C18070vi.A0w(r8, r10, r5, r3, r7);
        C18070vi.A0x(r9, r4, r6, amx, r2);
        this.A09 = r8;
        this.A08 = r10;
        this.A04 = r5;
        this.A02 = r3;
        this.A06 = r7;
        this.A07 = r9;
        this.A03 = r4;
        this.A05 = r6;
        this.A00 = amx;
        this.A01 = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: X.1au} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.1at} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: X.1av} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: X.1au} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: X.1au} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: X.1au} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: X.1au} */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a9, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        X.CDX.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b0, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        X.CDX.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b4, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0163, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0164, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0167, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap A01(X.C36821oW r11, X.C20007A2x r12, java.util.List r13, boolean r14) {
        /*
            r10 = this;
            boolean r4 = X.C108975cc.A1J(r13)
            if (r14 == 0) goto L_0x00c4
            X.0ve r2 = r10.A08
            r1 = 10226(0x27f2, float:1.433E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00c4
            X.9nb r5 = r10.A02
            X.A7X r0 = r12.A06
            java.lang.String r1 = r0.A0C
            java.lang.String r0 = r12.A09
            X.9sJ r7 = r5.A01(r1, r0)
            r6 = 0
            if (r7 == 0) goto L_0x00bb
            long r2 = r7.A01
            long r0 = r12.A05
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x00bb
            X.2kL r3 = r10.A04
            java.lang.String r2 = "backup_files_caching_timestamp"
            long r8 = r3.A00(r2)
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x00bb
            r0 = 1000(0x3e8, float:1.401E-42)
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Exception -> 0x00b5 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x00b5 }
            long r0 = r7.A00     // Catch:{ Exception -> 0x00b5 }
            X.2Dj r2 = r5.A00     // Catch:{ Exception -> 0x00b5 }
            X.1au r2 = r2.A06()     // Catch:{ Exception -> 0x00b5 }
            r5 = r2
            X.1av r5 = (X.C28801av) r5     // Catch:{ all -> 0x00ae }
            X.1Ev r9 = r5.A02     // Catch:{ all -> 0x00ae }
            java.lang.String r8 = "backups"
            java.lang.String r7 = "id != ?"
            java.lang.String[] r5 = X.C17880vN.A1Y()     // Catch:{ all -> 0x00ae }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00ae }
            r5[r4] = r1     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "BACKUP_STORE_CLEAR"
            r9.A04(r8, r7, r0, r5)     // Catch:{ all -> 0x00ae }
            r2.close()     // Catch:{ Exception -> 0x00b5 }
            X.9zT r5 = r10.A05     // Catch:{ Exception -> 0x00b5 }
            X.2Dj r0 = r5.A01     // Catch:{ Exception -> 0x00b5 }
            X.1at r2 = r0.get()     // Catch:{ Exception -> 0x00b5 }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00ae }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = X.C182289Tu.A01     // Catch:{ all -> 0x00ae }
            java.lang.String r7 = "SELECT\n  id,\n  backup_id,\n  name,\n  upload_title,\n  mime_type,\n  md5_hash,\n  size_bytes,\n  upload_time,\n  state,\n  transaction_id,\n  metadata\nFROM remote_files\nWHERE backup_id = ?"
            java.lang.String[] r1 = X.C17880vN.A1a(r1, r4)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "REMOTE_FILE_STORE_SELECT_FILE_FOR_BACKUP"
            android.database.Cursor r7 = r8.A0A(r7, r0, r1)     // Catch:{ all -> 0x00ae }
            r1 = 1
            X.ARn r0 = new X.ARn     // Catch:{ all -> 0x00ae }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x00ae }
            X.Akw r5 = new X.Akw     // Catch:{ all -> 0x00ae }
            r5.<init>(r7, r0)     // Catch:{ all -> 0x00ae }
            r2.close()     // Catch:{ Exception -> 0x00b5 }
        L_0x0088:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x00a7 }
            X.9sI r2 = (X.C194789sI) r2     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x0088
            X.9Ii r1 = r2.A01     // Catch:{ all -> 0x00a7 }
            X.9Ii r0 = X.C179529Ii.UPLOADED     // Catch:{ all -> 0x00a7 }
            if (r1 == r0) goto L_0x0088
            X.A2d r0 = r2.A00     // Catch:{ all -> 0x00a7 }
            A00(r0, r13, r3)     // Catch:{ all -> 0x00a7 }
            goto L_0x0088
        L_0x00a2:
            r5.close()     // Catch:{ Exception -> 0x00b5 }
            r6 = r3
            goto L_0x00bb
        L_0x00a7:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r1 = move-exception
            X.CDX.A00(r5, r0)     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00b4
        L_0x00ae:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r1 = move-exception
            X.CDX.A00(r2, r0)     // Catch:{ Exception -> 0x00b5 }
        L_0x00b4:
            throw r1     // Catch:{ Exception -> 0x00b5 }
        L_0x00b5:
            r1 = move-exception
            java.lang.String r0 = "gdrive/backup-file-list-manager/load-files cache error"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00bb:
            if (r6 == 0) goto L_0x00c4
            r6.size()
            r13.size()
            return r6
        L_0x00c4:
            r0 = 1000(0x3e8, float:1.401E-42)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>(r0)
            r2 = 0
        L_0x00cc:
            X.8gE r1 = new X.8gE
            r1.<init>(r12, r2, r4)
            java.lang.String r0 = "gdrive/backup-file-list-manager/load-files"
            java.lang.Object r0 = X.A84.A00(r1, r11, r0)
            android.util.Pair r0 = (android.util.Pair) r0
            if (r0 == 0) goto L_0x017c
            java.lang.Object r2 = r0.second
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.first
            X.C18070vi.A0W(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x00ea:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f8
            X.A2d r0 = X.AnonymousClass8BR.A0I(r1)
            A00(r0, r13, r6)
            goto L_0x00ea
        L_0x00f8:
            if (r2 != 0) goto L_0x00cc
            if (r14 == 0) goto L_0x016b
            X.0ve r2 = r10.A08
            r1 = 10226(0x27f2, float:1.433E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x016b
            X.9nb r7 = r10.A02
            X.2Dj r0 = r7.A00
            X.1au r4 = r0.A06()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0161 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "backups"
            java.lang.String r1 = "BACKUP_STORE_CLEAR_ALL"
            r0 = 0
            r3.A04(r2, r0, r1, r0)     // Catch:{ all -> 0x0161 }
            r4.close()
            X.A7X r0 = r12.A06
            java.lang.String r1 = r0.A0C
            java.lang.String r0 = r12.A09
            long r4 = r12.A05
            long r2 = r7.A00(r1, r0, r4)
            r0 = 0
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x016b
            X.2kL r9 = r10.A04
            java.lang.String r8 = "backup_files_caching_timestamp"
            r9.A01(r8, r0)
            java.util.Iterator r7 = X.C17890vO.A0j(r6)
        L_0x013d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x014d
            X.A2d r1 = X.AnonymousClass8BR.A0I(r7)
            X.9zT r0 = r10.A05
            r0.A01(r1, r2)
            goto L_0x013d
        L_0x014d:
            java.util.Iterator r7 = r13.iterator()
        L_0x0151:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0168
            X.A2d r1 = X.AnonymousClass8BR.A0I(r7)
            X.9zT r0 = r10.A05
            r0.A01(r1, r2)
            goto L_0x0151
        L_0x0161:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0163 }
        L_0x0163:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x0168:
            r9.A01(r8, r4)
        L_0x016b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "gdrive/backup-file-list-manager/load-files result "
            r1.append(r0)
            int r0 = r6.size()
            X.C17900vP.A0o(r1, r0)
            return r6
        L_0x017c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A0L.A01(X.1oW, X.A2x, java.util.List, boolean):java.util.HashMap");
    }
}
