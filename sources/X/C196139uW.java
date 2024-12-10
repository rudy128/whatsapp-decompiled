package X;

import java.io.File;
import java.util.Random;

/* renamed from: X.9uW  reason: invalid class name and case insensitive filesystem */
public final class C196139uW {
    public final C199039zK A00;
    public final AnonymousClass00H A01;
    public final ThreadLocal A02 = new ThreadLocal();
    public final C19961A0s A03;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0042, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0045, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A00() {
        /*
            r6 = this;
            X.9zK r0 = r6.A00
            java.lang.String r5 = "migration/messages_export.zip"
            r1 = 0
            X.A0s r0 = r0.A00
            X.1at r4 = r0.A01()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x003f }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x003f }
            java.lang.String r2 = "SELECT  f.file_size AS exported_file_size FROM exported_files_metadata AS f WHERE f.exported_path = ?"
            java.lang.String[] r1 = X.C17880vN.A1a(r5, r1)     // Catch:{ all -> 0x003f }
            java.lang.String r0 = "XPM_EXPORT_DB_SIZE"
            android.database.Cursor r2 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x003f }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x002b
            r2.close()     // Catch:{ all -> 0x003f }
            r4.close()
            r0 = 0
            return r0
        L_0x002b:
            java.lang.String r0 = "exported_file_size"
            long r0 = X.C17890vO.A06(r2, r0)     // Catch:{ all -> 0x0038 }
            r2.close()     // Catch:{ all -> 0x003f }
            r4.close()
            return r0
        L_0x0038:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x003f }
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196139uW.A00():long");
    }

    public final long A02(File file, String str, boolean z) {
        C199039zK r3 = this.A00;
        String canonicalPath = file.getCanonicalPath();
        C18070vi.A0X(canonicalPath);
        long length = file.length();
        ThreadLocal threadLocal = this.A02;
        byte[] bArr = (byte[]) threadLocal.get();
        if (bArr == null) {
            bArr = new byte[16];
            threadLocal.set(bArr);
        }
        ((Random) this.A01.get()).nextBytes(bArr);
        String A14 = C108955ca.A14(bArr);
        C18070vi.A0X(A14);
        return r3.A00(canonicalPath, str, A14, length, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003a, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r5 = this;
            X.9zK r0 = r5.A00
            X.A0s r0 = r0.A00
            X.1au r4 = r0.A02()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0037 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0037 }
            java.lang.String r2 = "exported_files_metadata"
            java.lang.String r0 = "XPM_EXPORT_METADATA_DELETE_ALL"
            r1 = 0
            r3.A04(r2, r1, r0, r1)     // Catch:{ all -> 0x0037 }
            r4.close()
            X.A0s r2 = r5.A03
            monitor-enter(r2)
            X.8ot r0 = r2.A00     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0022
            r0.close()     // Catch:{ all -> 0x0032 }
        L_0x0022:
            r2.A00 = r1     // Catch:{ all -> 0x0032 }
            android.content.Context r1 = r2.A01     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = "migration_export_metadata.db"
            r1.deleteDatabase(r0)     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = "ExportMetadataDbManager/removeDatabase/deleted"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)
            return
        L_0x0032:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0037:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196139uW.A04():void");
    }

    public C196139uW(C19961A0s a0s, C199039zK r3, AnonymousClass00H r4) {
        C18070vi.A0o(r4, r3, a0s);
        this.A01 = r4;
        this.A00 = r3;
        this.A03 = a0s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0037, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003b, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A01() {
        /*
            r4 = this;
            X.1at r3 = X.C19961A0s.A00(r4)
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0038 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = "SELECT  SUM(files.file_size) AS total_size FROM exported_files_metadata AS files"
            java.lang.String r0 = "XPM_EXPORT_TOTAL_SIZE"
            android.database.Cursor r2 = X.C23141Ev.A00(r2, r1, r0)     // Catch:{ all -> 0x0038 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x0022
            r2.close()     // Catch:{ all -> 0x0038 }
            if (r3 == 0) goto L_0x001f
            r3.close()
        L_0x001f:
            r0 = 0
            return r0
        L_0x0022:
            java.lang.String r0 = "total_size"
            long r0 = X.C17890vO.A06(r2, r0)     // Catch:{ all -> 0x0031 }
            r2.close()     // Catch:{ all -> 0x0038 }
            if (r3 == 0) goto L_0x0030
            r3.close()
        L_0x0030:
            return r0
        L_0x0031:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0038 }
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196139uW.A01():long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C21487Akw A03() {
        /*
            r5 = this;
            X.1at r4 = X.C19961A0s.A00(r5)
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0027 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0027 }
            java.lang.String r1 = "SELECT   f._id, f.local_path, f.exported_path, f.file_size, f.required, f.encryption_iv FROM exported_files_metadata AS f ORDER BY   f.required DESC , f._id ASC "
            java.lang.String r0 = "XPM_EXPORT_FILE_METADATA_SELECT_INTERNAL_ALL"
            android.database.Cursor r3 = X.C23141Ev.A00(r2, r1, r0)     // Catch:{ all -> 0x0027 }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x0027 }
            X.9vY r2 = X.C199039zK.A01     // Catch:{ all -> 0x0027 }
            r0 = 2
            X.ARn r1 = new X.ARn     // Catch:{ all -> 0x0027 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0027 }
            X.Akw r0 = new X.Akw     // Catch:{ all -> 0x0027 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0027 }
            if (r4 == 0) goto L_0x0026
            r4.close()
        L_0x0026:
            return r0
        L_0x0027:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196139uW.A03():X.Akw");
    }
}
