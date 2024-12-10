package com.whatsapp.migration.export.api;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass190;
import X.AnonymousClass2Q3;
import X.AnonymousClass9UB;
import X.C000100c;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C186049dZ;
import X.C188269h9;
import X.C190339km;
import X.C19680yj;
import X.C20006A2w;
import X.C60012nF;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;

public class ExportMigrationContentProvider extends C19680yj {
    public C188269h9 A00;
    public UriMatcher A01;
    public AnonymousClass190 A02;
    public C18030ve A03;
    public C20006A2w A04;
    public AnonymousClass2Q3 A05;
    public C186049dZ A06;

    public synchronized void A0A() {
        SecurityException securityException;
        A09();
        try {
            if (!C18020vd.A05(C18040vf.A02, this.A03, 843)) {
                securityException = new SecurityException("Provider access is disabled.");
            } else if (this.A04.A05()) {
                this.A05.A00().A00();
                C186049dZ r2 = this.A06;
                C60012nF A002 = r2.A00.A00();
                if (!A002.A03) {
                    A002.A00();
                }
                C190339km r0 = r2.A01;
                String str = A002.A01;
                if (!r0.A00(str)) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Caller ");
                    A10.append(str);
                    throw new SecurityException(AnonymousClass001.A1H(" does not have a correctly declared permission ", "com.apple.movetoios.ACCESS", A10));
                }
            } else {
                securityException = new SecurityException("Provider component is disabled.");
            }
            throw securityException;
        } catch (SecurityException e) {
            this.A02.A0E("xpm-export-provider-security", e.toString(), e);
            throw e;
        }
    }

    public String getType(Uri uri) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ba, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        X.CDX.A00(r9, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.ParcelFileDescriptor openFile(android.net.Uri r21, java.lang.String r22, android.os.CancellationSignal r23) {
        /*
            r20 = this;
            r16 = r23
            java.lang.String r4 = ";"
            r6 = r20
            r6.A0A()
            r5 = r21
            X.A2w r0 = r6.A04     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            r0.A04()     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            java.lang.String r0 = "ExportMigrationContentProvider/openFile/uriPath="
            r1.append(r0)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            java.lang.String r0 = r5.getPath()     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            X.C17890vO.A1A(r1, r0)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            android.content.UriMatcher r0 = r6.A01     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            int r1 = r0.match(r5)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            r0 = 2
            if (r1 != r0) goto L_0x01bf
            java.util.List r1 = r5.getPathSegments()     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            r0 = 1
            java.lang.String r0 = X.C17880vN.A0w(r1, r0)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            long r2 = java.lang.Long.parseLong(r0)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            X.9h9 r12 = r6.A00     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            X.9uW r0 = r12.A03     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            X.1at r9 = X.C19961A0s.A00(r0)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01b8 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x01b8 }
            java.lang.String r7 = "SELECT   f._id, f.local_path, f.exported_path, f.file_size, f.required, f.encryption_iv FROM exported_files_metadata AS f WHERE f._id = ?"
            java.lang.String[] r1 = X.C17900vP.A0t(r2)     // Catch:{ all -> 0x01b8 }
            java.lang.String r0 = "XPM_EXPORT_FILE_METADATA_SELECT_INTERNAL_SINGLE"
            android.database.Cursor r8 = r8.A0A(r7, r0, r1)     // Catch:{ all -> 0x01b8 }
            boolean r0 = r8.moveToFirst()     // Catch:{ all -> 0x01b1 }
            r7 = 0
            if (r0 == 0) goto L_0x005a
            X.9gH r7 = X.C196729vY.A00(r8)     // Catch:{ all -> 0x01b1 }
        L_0x005a:
            r8.close()     // Catch:{ all -> 0x01b8 }
            if (r9 == 0) goto L_0x0062
            r9.close()     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
        L_0x0062:
            if (r7 == 0) goto L_0x01a1
            java.io.File r13 = r7.A02     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            boolean r0 = r13.exists()     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            if (r0 == 0) goto L_0x0181
            long r10 = r13.length()     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            r8 = 0
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x007f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            java.lang.String r0 = "Exporting EMPTY file: path="
            X.C17900vP.A0Y(r13, r0, r1)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
        L_0x007f:
            long r10 = r13.length()     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            long r0 = r7.A01     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            java.lang.String r9 = ", on-record="
            int r8 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x009f
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            java.lang.String r8 = "Exporting MISMATCHED SIZE file: path="
            r10.append(r8)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            r10.append(r13)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            java.lang.String r8 = ", on-disk="
            X.AnonymousClass8BV.A1I(r13, r8, r10)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            X.C17900vP.A0m(r9, r10, r0)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
        L_0x009f:
            java.util.concurrent.atomic.AtomicLong r8 = r12.A06     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            long r10 = r8.getAndSet(r2)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            int r8 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x00bd
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            java.lang.String r2 = "RETRY DETECTED for path="
            r3.append(r2)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            r3.append(r13)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            java.lang.String r2 = " with size on-disk="
            X.AnonymousClass8BV.A1I(r13, r2, r3)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            X.C17900vP.A0m(r9, r3, r0)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
        L_0x00bd:
            if (r23 != 0) goto L_0x00c4
            android.os.CancellationSignal r16 = new android.os.CancellationSignal     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            r16.<init>()     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
        L_0x00c4:
            android.os.ParcelFileDescriptor[] r1 = android.os.ParcelFileDescriptor.createReliablePipe()     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x01c9 }
            r8 = 0
            r9 = r1[r8]     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x01c9 }
            r0 = 1
            r15 = r1[r0]     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x01c9 }
            monitor-enter(r12)     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x01c9 }
            java.util.Set r3 = r12.A04     // Catch:{ all -> 0x0175 }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0175 }
            if (r0 != 0) goto L_0x011b
            X.190 r2 = r12.A00     // Catch:{ all -> 0x0175 }
            java.lang.String r1 = "xpm-export-api-leaked-fd"
            int r0 = r3.size()     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x0175 }
            r2.A0G(r1, r0, r8)     // Catch:{ all -> 0x0175 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = "ExportMigrationApi/force closing pending file descriptors ("
            r1.append(r0)     // Catch:{ all -> 0x0175 }
            int r0 = r3.size()     // Catch:{ all -> 0x0175 }
            r1.append(r0)     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = ")"
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x0175 }
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x0175 }
        L_0x00ff:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0175 }
            if (r0 == 0) goto L_0x0118
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0175 }
            android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = "Force closing, concurrent streaming not supported."
            r1.closeWithError(r0)     // Catch:{ IOException -> 0x0111 }
            goto L_0x00ff
        L_0x0111:
            r1 = move-exception
            java.lang.String r0 = "ExportMigrationApi/Failed to close the pipe after an error."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0175 }
            goto L_0x00ff
        L_0x0118:
            r3.clear()     // Catch:{ all -> 0x0175 }
        L_0x011b:
            r3.add(r15)     // Catch:{ all -> 0x0175 }
            monitor-exit(r12)     // Catch:{ all -> 0x0175 }
            java.lang.String r2 = r7.A03     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x01c9 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x01c9 }
            if (r0 == 0) goto L_0x0129
            r14 = 0
            goto L_0x014c
        L_0x0129:
            X.9uV r0 = r12.A01     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x01c9 }
            X.9gG r0 = r0.A00()     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x01c9 }
            if (r0 == 0) goto L_0x0178
            java.lang.String r1 = r0.A03     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x01c9 }
            r0 = 2
            byte[] r1 = android.util.Base64.decode(r1, r0)     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x01c9 }
            byte[] r0 = android.util.Base64.decode(r2, r0)     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x01c9 }
            javax.crypto.Cipher r14 = X.AnonymousClass8BR.A18()     // Catch:{ GeneralSecurityException -> 0x015d }
            javax.crypto.spec.IvParameterSpec r2 = X.AnonymousClass8BR.A19(r0)     // Catch:{ GeneralSecurityException -> 0x015d }
            javax.crypto.spec.SecretKeySpec r1 = X.AnonymousClass8BS.A0v(r1)     // Catch:{ GeneralSecurityException -> 0x015d }
            r0 = 1
            r14.init(r0, r1, r2)     // Catch:{ GeneralSecurityException -> 0x015d }
        L_0x014c:
            long r0 = r7.A00     // Catch:{ RejectedExecutionException -> 0x0166 }
            java.util.concurrent.Executor r2 = r12.A05     // Catch:{ RejectedExecutionException -> 0x0166 }
            r17 = 2
            X.3CM r11 = new X.3CM     // Catch:{ RejectedExecutionException -> 0x0166 }
            r18 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ RejectedExecutionException -> 0x0166 }
            r2.execute(r11)     // Catch:{ RejectedExecutionException -> 0x0166 }
            return r9
        L_0x015d:
            r1 = move-exception
            java.lang.String r0 = "Failed to initiate encrypting cipher."
            java.io.IOException r2 = new java.io.IOException     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x01c9 }
            r2.<init>(r0, r1)     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x01c9 }
            goto L_0x0174
        L_0x0166:
            r1 = move-exception
            r9.close()     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x01c9 }
            r15.close()     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x01c9 }
            java.lang.String r0 = "Failed to initiate streaming."
            java.io.IOException r2 = new java.io.IOException     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x01c9 }
            r2.<init>(r0, r1)     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x01c9 }
        L_0x0174:
            throw r2     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x01c9 }
        L_0x0175:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0175 }
            goto L_0x017e
        L_0x0178:
            java.lang.String r0 = "Failed to initiate encryption, key is missing."
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x01c9 }
        L_0x017e:
            throw r0     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x01c9 }
        L_0x017f:
            r1 = move-exception
            goto L_0x01d3
        L_0x0181:
            java.lang.String r0 = r13.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            java.lang.String r8 = X.C64062u9.A09(r0)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            X.190 r7 = r12.A00     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            java.lang.String r1 = "xpm-export-missing-file-type"
            r0 = 0
            r7.A0G(r1, r8, r0)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            java.lang.String r0 = "File no longer exists: "
            java.lang.String r0 = X.C17890vO.A0a(r0, r1, r2)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            goto L_0x01d3
        L_0x01a1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            java.lang.String r0 = "Unknown entry: "
            java.lang.String r0 = X.C17890vO.A0a(r0, r1, r2)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            goto L_0x01d3
        L_0x01b1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01b3 }
        L_0x01b3:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x01b8 }
            throw r0     // Catch:{ all -> 0x01b8 }
        L_0x01b8:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x01ba:
            r1 = move-exception
            X.CDX.A00(r9, r0)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            goto L_0x01d3
        L_0x01bf:
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            goto L_0x01d3
        L_0x01c9:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
        L_0x01d3:
            throw r1     // Catch:{ FileNotFoundException -> 0x01fa, Exception -> 0x01d4 }
        L_0x01d4:
            r3 = move-exception
            X.190 r2 = r6.A02
            java.lang.StringBuilder r0 = X.C17890vO.A0f(r5)
            java.lang.String r1 = X.C17900vP.A0C(r4, r0, r3)
            java.lang.String r0 = "xpm-export-provider-open-file"
            r2.A0E(r0, r1, r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexplained error opening "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = X.AnonymousClass001.A1E(r3, r4, r1)
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>(r1)
            throw r0
        L_0x01fa:
            r3 = move-exception
            java.lang.String r0 = r3.getMessage()
            if (r0 == 0) goto L_0x021b
            java.lang.String r0 = r3.getMessage()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x021b
            X.190 r2 = r6.A02
            java.lang.StringBuilder r0 = X.C17890vO.A0f(r5)
            java.lang.String r1 = X.C17900vP.A0C(r4, r0, r3)
            java.lang.String r0 = "xpm-export-provider-file-not-found"
            r2.A0E(r0, r1, r3)
            throw r3
        L_0x021b:
            X.190 r2 = r6.A02
            java.lang.StringBuilder r1 = X.C17890vO.A0f(r5)
            java.lang.String r0 = "; FileNotFoundException without message"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = "xpm-export-provider-file-not-found-other"
            r2.A0E(r0, r1, r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "File not found without reason: "
            java.lang.String r1 = X.AnonymousClass001.A1E(r5, r0, r1)
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.export.api.ExportMigrationContentProvider.openFile(android.net.Uri, java.lang.String, android.os.CancellationSignal):android.os.ParcelFileDescriptor");
    }

    public void A08() {
        Context context = getContext();
        if (context != null) {
            C000100c A0H = C17890vO.A0H(context);
            this.A03 = A0H.BAL();
            this.A02 = A0H.BG6();
            AnonymousClass10E r2 = (AnonymousClass10E) A0H;
            AnonymousClass10G r1 = r2.Ao8.A00;
            this.A05 = (AnonymousClass2Q3) r1.A1e.get();
            this.A00 = AnonymousClass10G.A7f(r1);
            this.A06 = (C186049dZ) r1.A1g.get();
            this.A04 = (C20006A2w) r2.A3s.get();
            UriMatcher uriMatcher = new UriMatcher(-1);
            String str = AnonymousClass9UB.A03;
            uriMatcher.addURI(str, "files", 1);
            uriMatcher.addURI(str, "file/#", 2);
            this.A01 = uriMatcher;
            return;
        }
        throw AnonymousClass000.A0n("Context is not attached.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        if ("FAILURE".equals(r8.getString("state")) == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00aa, code lost:
        r2.putString(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ad, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002e, code lost:
        r5.A02.A0G("xpm-export-provider-unsupported-method", r6, false);
        X.C17890vO.A19(X.AnonymousClass8BW.A0o("ExportMigrationContentProvider/call/", r6), " not found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0043, code lost:
        throw new java.lang.UnsupportedOperationException(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle call(java.lang.String r6, java.lang.String r7, android.os.Bundle r8) {
        /*
            r5 = this;
            r5.A09()
            r5.A0A()
            if (r6 == 0) goto L_0x00ae
            X.A2w r0 = r5.A04
            r0.A04()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r2 = "ExportMigrationContentProvider/call/"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r0 = " Arg: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " Bundle: "
            X.C17900vP.A0Y(r8, r0, r1)
            int r0 = r6.hashCode()
            r4 = 0
            switch(r0) {
                case 94756344: goto L_0x0044;
                case 1139677387: goto L_0x008a;
                case 1976339394: goto L_0x009b;
                default: goto L_0x002e;
            }
        L_0x002e:
            X.190 r1 = r5.A02
            java.lang.String r0 = "xpm-export-provider-unsupported-method"
            r1.A0G(r0, r6, r4)
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0o(r2, r6)
            java.lang.String r0 = " not found"
            X.C17890vO.A19(r1, r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r6)
            throw r0
        L_0x0044:
            java.lang.String r0 = "close"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "ExportMigrationContentProvider/close() is called"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9h9 r3 = r5.A00
            if (r8 == 0) goto L_0x006a
            java.lang.String r2 = "state"
            boolean r0 = r8.containsKey(r2)
            if (r0 == 0) goto L_0x006a
            java.lang.String r1 = "FAILURE"
            java.lang.String r0 = r8.getString(r2)
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 != 0) goto L_0x006b
        L_0x006a:
            r0 = 1
        L_0x006b:
            X.A7R r1 = r3.A02
            if (r0 == 0) goto L_0x0077
            r1.A05()
        L_0x0072:
            android.os.Bundle r2 = X.C17880vN.A0D()
            return r2
        L_0x0077:
            X.A2w r0 = r1.A08
            r0.A02()
            X.190 r2 = r1.A02
            r1 = 0
            java.lang.String r0 = "xpm-export-disabled-provider-with-failure"
            r2.A0G(r0, r1, r4)
            java.lang.String r0 = "ExportFlowManager/disableExportProviderAndClearMigrationFlags/complete/failure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0072
        L_0x008a:
            java.lang.String r0 = "get_label"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002e
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r1 = "name"
            java.lang.String r0 = "WhatsApp"
            goto L_0x00aa
        L_0x009b:
            java.lang.String r0 = "get_icon"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002e
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r1 = "iconUri"
            r0 = 0
        L_0x00aa:
            r2.putString(r1, r0)
            return r2
        L_0x00ae:
            java.lang.String r0 = "method is null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.export.api.ExportMigrationContentProvider.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        A09();
        A0A();
        this.A02.A0G("xpm-export-provider-delete-unsupported", uri.getPath(), false);
        throw C17880vN.A0y();
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        A09();
        A0A();
        this.A02.A0G("xpm-export-provider-insert-unsupported", uri.getPath(), false);
        throw C17880vN.A0y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0057, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        X.CDX.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        X.CDX.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bb, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00be, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r11, java.lang.String[] r12, java.lang.String r13, java.lang.String[] r14, java.lang.String r15) {
        /*
            r10 = this;
            r10.A09()
            r10.A0A()
            X.A2w r0 = r10.A04
            r0.A04()
            android.content.UriMatcher r0 = r10.A01
            int r2 = r0.match(r11)
            r9 = 1
            if (r2 != r9) goto L_0x0081
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ExportMigrationContentProvider/query/supported-request "
            X.C17900vP.A0Y(r11, r0, r1)
            java.lang.String r0 = "offset"
            java.lang.String r1 = r11.getQueryParameter(r0)
            java.lang.String r0 = "limit"
            java.lang.String r0 = r11.getQueryParameter(r0)
            if (r1 == 0) goto L_0x005c
            if (r0 == 0) goto L_0x005c
            long r4 = java.lang.Long.parseLong(r1)
            long r2 = java.lang.Long.parseLong(r0)
            X.9h9 r0 = r10.A00
            X.9uW r0 = r0.A03
            X.1at r6 = X.C19961A0s.A00(r0)
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0055 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0055 }
            java.lang.String r7 = "SELECT   f._id AS _id,  ('xpm-import/' ||  f.exported_path)  AS path, f.file_size AS original_size, f.required AS required, 0 AS include_in_backups FROM exported_files_metadata AS f ORDER BY   f.required DESC , f.file_size DESC , f._id ASC  LIMIT ?, ?"
            java.lang.String[] r1 = X.C17880vN.A1Z()     // Catch:{ all -> 0x0055 }
            X.C17890vO.A1J(r1, r4)     // Catch:{ all -> 0x0055 }
            X.C17880vN.A1V(r1, r9, r2)     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "XPM_EXPORT_FILE_METADATA_PUBLIC_SELECT_PAGED"
            android.database.Cursor r0 = X.C18070vi.A04(r8, r7, r0, r1)     // Catch:{ all -> 0x0055 }
            goto L_0x00b2
        L_0x0055:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r1 = move-exception
            X.CDX.A00(r6, r0)
            throw r1
        L_0x005c:
            X.9h9 r0 = r10.A00
            X.9uW r0 = r0.A03
            X.1at r3 = X.C19961A0s.A00(r0)
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x007a }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x007a }
            java.lang.String r1 = "SELECT   f._id AS _id,  ('xpm-import/' || f.exported_path)  AS path, f.file_size AS original_size, f.required AS required, 0 AS include_in_backups FROM exported_files_metadata AS f ORDER BY   f.required DESC , f.file_size DESC , f._id ASC "
            java.lang.String r0 = "XPM_EXPORT_FILE_METADATA_PUBLIC_SELECT_ALL"
            android.database.Cursor r0 = X.C23141Ev.A00(r2, r1, r0)     // Catch:{ all -> 0x007a }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x007a }
            if (r3 == 0) goto L_0x00b7
            r3.close()
            return r0
        L_0x007a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r1 = move-exception
            X.CDX.A00(r3, r0)
            throw r1
        L_0x0081:
            r0 = 2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r2 != r0) goto L_0x00bf
            java.lang.String r0 = "ExportMigrationContentProvider/query/ignored-request "
            X.C17900vP.A0Y(r11, r0, r1)
            java.util.List r0 = r11.getPathSegments()
            java.lang.String r0 = X.C17880vN.A0w(r0, r9)
            long r4 = java.lang.Long.parseLong(r0)
            X.9h9 r0 = r10.A00
            X.9uW r0 = r0.A03
            X.1at r6 = X.C19961A0s.A00(r0)
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00b8 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00b8 }
            java.lang.String r2 = "SELECT   f._id AS _id,  ('xpm-import/' || f.exported_path)  AS path, f.file_size AS original_size, f.required AS required, 0 AS include_in_backups FROM exported_files_metadata AS f WHERE f._id = ?"
            java.lang.String[] r1 = X.C17900vP.A0t(r4)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = "XPM_EXPORT_METADATA_API_SELECT_SINGLE"
            android.database.Cursor r0 = X.C18070vi.A04(r3, r2, r0, r1)     // Catch:{ all -> 0x00b8 }
        L_0x00b2:
            if (r6 == 0) goto L_0x00b7
            r6.close()
        L_0x00b7:
            return r0
        L_0x00b8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        L_0x00bf:
            java.lang.String r0 = "ExportMigrationContentProvider/query/unsupported-request "
            X.C17900vP.A0X(r11, r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unsupported URI: "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass8BX.A0V(r11, r0, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.export.api.ExportMigrationContentProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A09();
        A0A();
        this.A02.A0G("xpm-export-provider-update-unsupported", uri.getPath(), false);
        throw C17880vN.A0y();
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return openFile(uri, str, new CancellationSignal());
    }
}
