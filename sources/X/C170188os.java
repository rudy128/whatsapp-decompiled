package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.8os  reason: invalid class name and case insensitive filesystem */
public final class C170188os extends AnonymousClass1NZ {
    public final C25311Ns A00;
    public final AnonymousClass118 A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass19D A05;
    public final AnonymousClass00H A06;

    private final boolean A00(C171768sF r9, File file, File file2, boolean z) {
        try {
            file.length();
            C191639mv r2 = (C191639mv) this.A06.get();
            AnonymousClass9JN A022 = AnonymousClass9JN.A02(A3K.A00(AnonymousClass8BS.A0i(file), "stickers_db.bak"));
            if (A022 == null) {
                A022 = AnonymousClass9JN.UNENCRYPTED;
            }
            C189869jz A07 = r2.A00((C19947A0e) null, A022, file, false).A07(this.A01, (B9V) null, file2, 0, 0, false);
            C17900vP.A0Y(A07, "StickerBackupProducerV2/restore/result ", AnonymousClass000.A10());
            if (z && r9 != null) {
                r9.A06 = Integer.valueOf(A3O.A00(A07.A00));
            }
            return C108975cc.A1B(A07.A00);
        } catch (Exception e) {
            Log.e("StickerBackupProducerV2/restore/error", e);
            if (z && r9 != null) {
                r9.A06 = Integer.valueOf(A3O.A02(e));
            }
            return false;
        }
    }

    public ArrayList A0N(File file) {
        C18070vi.A0d(file, 0);
        return AnonymousClass8BU.A0v(file, "stickers_db.bak", A3K.A02(AnonymousClass9JN.CRYPT14));
    }

    public final A26 A0U(AnonymousClass9JN r19, File file, File file2, String str) {
        File file3 = file;
        String str2 = str;
        AnonymousClass3Ma.A1O(file3, 1, str2);
        File file4 = file2;
        try {
            A5N A002 = ((C191639mv) this.A06.get()).A00((C19947A0e) null, r19, file4, false);
            Context context = this.A01.A00;
            if (A002.A09(context, file3)) {
                StringBuilder A10 = AnonymousClass000.A10();
                AnonymousClass8BV.A1J(file4, "StickerBackupProducerV2/createSingleFileBackupIfNeeded/skip backup because backup file ", A10);
                C17890vO.A1A(A10, " has the same source file");
                return new A26((File) null, (Long) null, str2, 2, 0);
            } else if (!A002.A0A(context, file3)) {
                Log.e("StickerBackupProducerV2/createSingleFileBackupIfNeeded/failed to prepare for backup");
                C64062u9.A0Q(file4);
                return new A26((File) null, (Long) null, str2, 1, 0);
            } else {
                file4.getName();
                A002.A08((C72053Kl) null, file3);
                return new A26(file4, C17890vO.A0L(), str2, 0, file4.length());
            }
        } catch (IOException e) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("StickerBackupProducerV2/createSingleFileBackupIfNeeded/failed to create single file backup for ");
            C108985cd.A1M(file4.getName(), A102, e);
            C64062u9.A0Q(file4);
            return new A26((File) null, (Long) null, str2, 1, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0127, code lost:
        if (r18 != false) goto L_0x0129;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f5 A[Catch:{ all -> 0x011a, IOException -> 0x00e8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0S(X.C171768sF r20, java.io.File r21) {
        /*
            r19 = this;
            r4 = r19
            monitor-enter(r4)
            X.19D r2 = r4.A05     // Catch:{ all -> 0x012d }
            r1 = 8269(0x204d, float:1.1587E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x012d }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ all -> 0x012d }
            if (r0 == 0) goto L_0x0028
            X.1L7 r0 = r4.A02     // Catch:{ all -> 0x012d }
            java.io.File r2 = r0.A03()     // Catch:{ all -> 0x012d }
            X.9JN r0 = X.AnonymousClass9JN.CRYPT14     // Catch:{ all -> 0x012d }
            java.util.ArrayList r1 = X.A3K.A02(r0)     // Catch:{ all -> 0x012d }
            java.lang.String r0 = "stickers_db.bak"
            java.util.ArrayList r0 = X.AnonymousClass8BU.A0v(r2, r0, r1)     // Catch:{ all -> 0x012d }
            java.lang.Object r8 = X.C29431cG.A0e(r0)     // Catch:{ all -> 0x012d }
            java.io.File r8 = (java.io.File) r8     // Catch:{ all -> 0x012d }
            goto L_0x0029
        L_0x0028:
            r8 = 0
        L_0x0029:
            r7 = 1
            if (r8 == 0) goto L_0x0129
            java.lang.String r2 = "stickers"
            X.1Ez r6 = new X.1Ez     // Catch:{ all -> 0x012d }
            r6.<init>((java.lang.String) r2)     // Catch:{ all -> 0x012d }
            X.00H r1 = r4.A04     // Catch:{ all -> 0x012d }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x012d }
            X.1Ls r0 = (X.C24801Ls) r0     // Catch:{ all -> 0x012d }
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.A02     // Catch:{ all -> 0x012d }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r0.writeLock()     // Catch:{ all -> 0x012d }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x012d }
            r3.lock()     // Catch:{ all -> 0x012d }
            r5 = r20
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x011a }
            X.1Ls r0 = (X.C24801Ls) r0     // Catch:{ all -> 0x011a }
            r0.close()     // Catch:{ all -> 0x011a }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x011a }
            X.5yf r0 = (X.C116815yf) r0     // Catch:{ all -> 0x011a }
            r0.A08()     // Catch:{ all -> 0x011a }
            X.118 r0 = r4.A01     // Catch:{ all -> 0x011a }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x011a }
            java.lang.String r0 = "stickers.db"
            java.io.File r0 = r1.getDatabasePath(r0)     // Catch:{ all -> 0x011a }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x011a }
            boolean r1 = r4.A00(r5, r8, r0, r7)     // Catch:{ all -> 0x011a }
            r3.unlock()     // Catch:{ all -> 0x012d }
            if (r20 == 0) goto L_0x0077
            java.lang.Long r0 = X.AnonymousClass8BT.A0n(r6)     // Catch:{ all -> 0x012d }
            r5.A0K = r0     // Catch:{ all -> 0x012d }
        L_0x0077:
            if (r1 == 0) goto L_0x012b
            X.1Ns r0 = r4.A00     // Catch:{ all -> 0x012d }
            X.17r r0 = r0.A00     // Catch:{ all -> 0x012d }
            java.io.File r0 = r0.A0I()     // Catch:{ all -> 0x012d }
            java.lang.String r10 = r0.getCanonicalPath()     // Catch:{ all -> 0x012d }
            r9 = 0
            if (r10 == 0) goto L_0x012b
            X.1Ez r8 = new X.1Ez     // Catch:{ all -> 0x012d }
            r8.<init>((java.lang.String) r2)     // Catch:{ all -> 0x012d }
            X.1L7 r0 = r4.A02     // Catch:{ all -> 0x012d }
            java.io.File r1 = r0.A03()     // Catch:{ all -> 0x012d }
            java.lang.String r0 = "Stickers"
            java.io.File r0 = X.C17880vN.A0e(r1, r0)     // Catch:{ all -> 0x012d }
            java.io.File[] r6 = r0.listFiles()     // Catch:{ all -> 0x012d }
            if (r6 == 0) goto L_0x0101
            int r3 = r6.length     // Catch:{ all -> 0x012d }
            r18 = 1
            r2 = 0
            r17 = 0
            r16 = 0
        L_0x00a7:
            if (r2 >= r3) goto L_0x00fe
            r1 = r6[r2]     // Catch:{ all -> 0x012d }
            X.C18070vi.A0b(r1)     // Catch:{ IOException -> 0x00e8 }
            java.lang.String r0 = X.C21721ArX.A04(r1)     // Catch:{ IOException -> 0x00e8 }
            java.io.File r15 = X.C64062u9.A06(r10, r0)     // Catch:{ IOException -> 0x00e8 }
            if (r15 == 0) goto L_0x00df
            boolean r14 = r4.A00(r5, r1, r15, r9)     // Catch:{ IOException -> 0x00e8 }
            if (r14 == 0) goto L_0x00e5
            long r0 = r1.lastModified()     // Catch:{ IOException -> 0x00e8 }
            r12 = 0
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 > 0) goto L_0x00d6
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x00e8 }
            java.lang.String r11 = "StickerBackupProducerV2/Internal Sticker File is null or updateTime is non-positive: "
            java.lang.String r0 = X.C17890vO.A0a(r11, r12, r0)     // Catch:{ IOException -> 0x00e8 }
        L_0x00d2:
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x00e8 }
            goto L_0x00f1
        L_0x00d6:
            boolean r0 = r15.setLastModified(r0)     // Catch:{ IOException -> 0x00e8 }
            if (r0 != 0) goto L_0x00f1
            java.lang.String r0 = "StickerBackupProducerV2/failed to update last modified time for internal sticker file"
            goto L_0x00d2
        L_0x00df:
            java.lang.String r0 = "StickerBackupProducerV2/restore/restoreSingleFileMediaBackups/target file is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x00e8 }
            r14 = 0
        L_0x00e5:
            int r17 = r17 + 1
            goto L_0x00f3
        L_0x00e8:
            r1 = move-exception
            java.lang.String r0 = "StickerBackupProducerV2/restore/restoreSingleFileMediaBackups/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x012d }
            int r17 = r17 + 1
            goto L_0x00f9
        L_0x00f1:
            int r16 = r16 + 1
        L_0x00f3:
            if (r18 == 0) goto L_0x00f9
            r18 = 1
            if (r14 != 0) goto L_0x00fb
        L_0x00f9:
            r18 = 0
        L_0x00fb:
            int r2 = r2 + 1
            goto L_0x00a7
        L_0x00fe:
            r9 = r17
            goto L_0x0105
        L_0x0101:
            r18 = 1
            r16 = 0
        L_0x0105:
            if (r20 == 0) goto L_0x0127
            java.lang.Long r0 = X.AnonymousClass8BT.A0n(r8)     // Catch:{ all -> 0x012d }
            r5.A0H = r0     // Catch:{ all -> 0x012d }
            java.lang.Long r0 = X.C17880vN.A0n(r9)     // Catch:{ all -> 0x012d }
            r5.A0I = r0     // Catch:{ all -> 0x012d }
            java.lang.Long r0 = X.C17880vN.A0n(r16)     // Catch:{ all -> 0x012d }
            r5.A0J = r0     // Catch:{ all -> 0x012d }
            goto L_0x0127
        L_0x011a:
            r1 = move-exception
            r3.unlock()     // Catch:{ all -> 0x012d }
            if (r20 == 0) goto L_0x0126
            java.lang.Long r0 = X.AnonymousClass8BT.A0n(r6)     // Catch:{ all -> 0x012d }
            r5.A0K = r0     // Catch:{ all -> 0x012d }
        L_0x0126:
            throw r1     // Catch:{ all -> 0x012d }
        L_0x0127:
            if (r18 == 0) goto L_0x012b
        L_0x0129:
            monitor-exit(r4)
            return r7
        L_0x012b:
            r7 = 0
            goto L_0x0129
        L_0x012d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170188os.A0S(X.8sF, java.io.File):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: X.A26} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: X.A26} */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.A26 A0T(X.C171828sL r32, X.AnonymousClass9JN r33) {
        /*
            r31 = this;
            r23 = 0
            r3 = r32
            r7 = r33
            boolean r1 = X.C18070vi.A17(r7, r3)
            r6 = r31
            X.0ve r4 = r6.A02
            r0 = 9369(0x2499, float:1.3129E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r4, r0)
            if (r0 == 0) goto L_0x0023
            X.00H r0 = r6.A03
            java.lang.Object r0 = r0.get()
            X.17k r0 = (X.C217917k) r0
            r0.A00()
        L_0x0023:
            r0 = 8271(0x204f, float:1.159E-41)
            boolean r0 = X.C18020vd.A05(r2, r4, r0)
            if (r0 == 0) goto L_0x0161
            boolean r0 = r6.A0L()
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "StickerBackupProducerV2/backup/skip no media or read-only media"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r5 = "stickers"
            r3 = 0
        L_0x0039:
            r7 = 0
            X.A26 r0 = new X.A26
            r2 = r0
            r4 = r3
            r6 = r1
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0043:
            return r0
        L_0x0044:
            java.lang.String r22 = "stickers"
            X.1Ez r21 = new X.1Ez
            r2 = r21
            r0 = r22
            r2.<init>((java.lang.String) r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r8 = "stickers_db.bak"
            r2.append(r8)
            java.lang.String r0 = X.A3K.A01(r7)
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r2)
            java.io.File r0 = r6.A0G(r7)
            java.io.File r5 = X.C17880vN.A0e(r0, r2)
            java.io.File r0 = r5.getParentFile()
            X.C17960vV.A07(r0)
            X.C18070vi.A0X(r0)
            X.AnonymousClass8BV.A1H(r0)
            java.io.File r2 = r6.A0G(r7)
            X.9JN r0 = X.AnonymousClass9JN.CRYPT14
            java.util.ArrayList r0 = X.A3K.A02(r0)
            java.util.ArrayList r0 = X.AnonymousClass8BU.A0v(r2, r8, r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0087:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x009b
            java.io.File r2 = X.AnonymousClass8BS.A0T(r4)
            boolean r0 = X.C18070vi.A18(r2, r5)
            if (r0 != 0) goto L_0x0087
            X.C108985cd.A1C(r2)
            goto L_0x0087
        L_0x009b:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "StickerBackupProducerV2/backup to "
            X.C17900vP.A0Y(r5, r0, r2)
            X.00H r2 = r6.A04
            java.lang.Object r0 = r2.get()
            X.1Ls r0 = (X.C24801Ls) r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.A02
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r0.writeLock()
            X.C18070vi.A0X(r4)
            r4.lock()
            java.lang.Object r0 = r2.get()     // Catch:{ Exception -> 0x00dc }
            X.5yf r0 = (X.C116815yf) r0     // Catch:{ Exception -> 0x00dc }
            r0.A07()     // Catch:{ Exception -> 0x00dc }
            java.lang.Object r0 = r2.get()     // Catch:{ Exception -> 0x00dc }
            X.1Ls r0 = (X.C24801Ls) r0     // Catch:{ Exception -> 0x00dc }
            r0.close()     // Catch:{ Exception -> 0x00dc }
            X.118 r0 = r6.A01     // Catch:{ Exception -> 0x00dc }
            android.content.Context r2 = r0.A00     // Catch:{ Exception -> 0x00dc }
            java.lang.String r0 = "stickers.db"
            java.io.File r0 = r2.getDatabasePath(r0)     // Catch:{ Exception -> 0x00dc }
            X.C18070vi.A0X(r0)     // Catch:{ Exception -> 0x00dc }
            X.A26 r0 = r6.A0U(r7, r0, r5, r8)     // Catch:{ Exception -> 0x00dc }
            goto L_0x00f2
        L_0x00dc:
            r2 = move-exception
            java.lang.String r0 = "StickerBackupProducerV2/backup/failed"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0386 }
            r13 = 0
            java.lang.Long r10 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0386 }
            r9 = 0
            X.A26 r0 = new X.A26     // Catch:{ all -> 0x0386 }
            r8 = r0
            r11 = r22
            r12 = r1
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0386 }
        L_0x00f2:
            r4.unlock()
            int r8 = r0.A01
            int r2 = X.A3O.A01(r8)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.A0B = r2
            long r4 = r21.A01()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r3.A0S = r2
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r2 = "StickerBackupProducerV2/backup/dbBackupResult "
            X.C17900vP.A0Y(r0, r2, r4)
            if (r8 == r1) goto L_0x0043
            long r13 = r21.A01()
            X.1L7 r2 = r6.A02
            java.io.File r4 = r2.A03()
            java.lang.String r2 = "Stickers"
            java.io.File r11 = X.C17880vN.A0e(r4, r2)
            X.AnonymousClass8BV.A1H(r11)
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            X.1Ns r2 = r6.A00
            X.17r r2 = r2.A00
            java.io.File r2 = r2.A0I()
            r9 = 0
            java.lang.Integer r15 = X.AnonymousClass00R.A00
            X.DXj r4 = new X.DXj
            r4.<init>(r2, r15)
            X.B3P r2 = X.B3P.A00
            X.7Sa r2 = X.AnonymousClass1b2.A09(r2, r4)
            java.util.LinkedHashMap r8 = X.C17880vN.A13()
            X.7Rp r5 = new X.7Rp
            r5.<init>((X.C147157Sa) r2)
        L_0x014c:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0199
            java.lang.Object r4 = r5.next()
            r2 = r4
            java.io.File r2 = (java.io.File) r2
            java.lang.String r2 = r2.getName()
            r8.put(r2, r4)
            goto L_0x014c
        L_0x0161:
            java.io.File r2 = r6.A0G(r7)
            X.9JN r0 = X.AnonymousClass9JN.CRYPT14
            java.util.ArrayList r1 = X.A3K.A02(r0)
            java.lang.String r0 = "stickers_db.bak"
            java.util.ArrayList r0 = X.AnonymousClass8BU.A0v(r2, r0, r1)
            java.util.Iterator r1 = r0.iterator()
        L_0x0175:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0183
            java.io.File r0 = X.AnonymousClass8BS.A0T(r1)
            X.C64062u9.A0Q(r0)
            goto L_0x0175
        L_0x0183:
            X.1L7 r0 = r6.A02
            java.io.File r1 = r0.A03()
            java.lang.String r0 = "Stickers"
            java.io.File r1 = X.C17880vN.A0e(r1, r0)
            r0 = 0
            X.C64062u9.A0K(r1, r0)
            java.lang.String r5 = "stickers"
            r3 = 0
            r1 = 3
            goto L_0x0039
        L_0x0199:
            java.util.LinkedHashMap r12 = X.AnonymousClass1D7.A08(r8)
            boolean r2 = r12.isEmpty()
            if (r2 != 0) goto L_0x0281
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            X.DXj r4 = new X.DXj
            r4.<init>(r11, r15)
            X.B3O r2 = X.B3O.A00
            X.7Sa r2 = X.AnonymousClass1b2.A09(r2, r4)
            X.7Rp r4 = new X.7Rp
            r4.<init>((X.C147157Sa) r2)
        L_0x01bb:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0203
            java.lang.Object r2 = r4.next()
            java.io.File r2 = (java.io.File) r2
            java.lang.String r15 = X.C21721ArX.A04(r2)
            java.lang.Object r15 = r12.remove(r15)
            java.io.File r15 = (java.io.File) r15
            if (r15 != 0) goto L_0x01d7
            r8.add(r2)
            goto L_0x01bb
        L_0x01d7:
            long r19 = r15.lastModified()
            long r17 = r2.lastModified()
            int r16 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r16 <= 0) goto L_0x01e7
            X.AnonymousClass1D6.A02(r15, r2, r5)
            goto L_0x01bb
        L_0x01e7:
            java.lang.String r2 = "StickerBackupProducerV2/skip as source sticker file is older than backup file"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.lang.String r27 = X.AnonymousClass8BS.A0i(r15)
            r28 = 2
            r29 = 0
            X.A26 r2 = new X.A26
            r26 = r9
            r24 = r2
            r25 = r9
            r24.<init>(r25, r26, r27, r28, r29)
            r10.add(r2)
            goto L_0x01bb
        L_0x0203:
            java.util.Iterator r4 = r8.iterator()
        L_0x0207:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0215
            java.io.File r2 = X.AnonymousClass8BS.A0T(r4)
            X.C64062u9.A0Q(r2)
            goto L_0x0207
        L_0x0215:
            java.util.Iterator r15 = r5.iterator()
        L_0x0219:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x024e
            java.lang.Object r2 = r15.next()
            X.1D6 r2 = (X.AnonymousClass1D6) r2
            java.lang.Object r5 = r2.first
            java.io.File r5 = (java.io.File) r5
            java.lang.Object r4 = r2.second
            java.io.File r4 = (java.io.File) r4
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.String r2 = "StickerBackupProducerV2/updateExistingBackupsIfNeeded/stickerFile "
            X.AnonymousClass8BV.A1J(r5, r2, r8)
            java.lang.String r2 = " targetBackupFile "
            r8.append(r2)
            java.lang.String r2 = r4.getName()
            X.C17890vO.A1A(r8, r2)
            java.lang.String r2 = X.AnonymousClass8BS.A0i(r5)
            X.A26 r2 = r6.A0U(r7, r5, r4, r2)
            r10.add(r2)
            goto L_0x0219
        L_0x024e:
            java.util.Iterator r12 = X.AnonymousClass000.A15(r12)
        L_0x0252:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x0281
            java.util.Map$Entry r8 = X.AnonymousClass000.A16(r12)
            java.lang.Object r5 = r8.getValue()
            java.io.File r5 = (java.io.File) r5
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r2 = X.C17880vN.A0x(r8)
            r4.append(r2)
            java.lang.String r2 = X.A3K.A01(r7)
            java.io.File r4 = X.AnonymousClass8BW.A0X(r11, r2, r4)
            java.lang.String r2 = X.C17880vN.A0x(r8)
            X.A26 r2 = r6.A0U(r7, r5, r4, r2)
            r10.add(r2)
            goto L_0x0252
        L_0x0281:
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x02bd
            r11 = 0
            X.A26 r6 = new X.A26
            r8 = r9
            r7 = r9
            r9 = r22
            r10 = r23
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x0294:
            long r1 = r21.A01()
            java.lang.Long r1 = X.C108945cZ.A1B(r1, r13)
            r3.A0O = r1
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "StickerBackupProducerV2/backup/mediaBackupResult "
            X.C17900vP.A0Y(r6, r1, r2)
            int r4 = r6.A01
            long r0 = r0.A02
            long r2 = r6.A02
            long r2 = r2 + r0
            java.lang.Long r1 = r6.A04
            r6 = 0
            X.A26 r0 = new X.A26
            r5 = r0
            r7 = r1
            r8 = r22
            r9 = r4
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return r0
        L_0x02bd:
            java.util.LinkedHashMap r6 = X.C17880vN.A13()
            java.util.Iterator r7 = r10.iterator()
        L_0x02c5:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x02f4
            java.lang.Object r2 = r7.next()
            X.A26 r2 = (X.A26) r2
            int r2 = r2.A01
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r6.get(r5)
            if (r4 != 0) goto L_0x02e8
            boolean r2 = r6.containsKey(r5)
            if (r2 != 0) goto L_0x02e8
            X.4rD r4 = new X.4rD
            r4.<init>()
        L_0x02e8:
            X.4rD r4 = (X.C98474rD) r4
            int r2 = r4.element
            int r2 = r2 + 1
            r4.element = r2
            r6.put(r5, r4)
            goto L_0x02c5
        L_0x02f4:
            java.util.Iterator r4 = X.AnonymousClass000.A15(r6)
        L_0x02f8:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0302
            X.AnonymousClass8BY.A1N(r4)
            goto L_0x02f8
        L_0x0302:
            java.util.Map r4 = X.C41681wt.A03(r6)
            java.lang.Object r2 = X.AnonymousClass000.A0w(r4, r1)
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0378
            java.lang.Long r2 = X.C17890vO.A0N(r2)
        L_0x0312:
            r3.A0P = r2
            r2 = 2
            java.lang.Object r2 = X.AnonymousClass000.A0w(r4, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0376
            java.lang.Long r2 = X.C17890vO.A0N(r2)
        L_0x0321:
            r3.A0Q = r2
            r2 = r23
            java.lang.Object r2 = X.AnonymousClass000.A0w(r4, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0331
            java.lang.Long r9 = X.C17890vO.A0N(r2)
        L_0x0331:
            r3.A0R = r9
            java.util.Iterator r10 = r10.iterator()
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x037e
            java.lang.Object r6 = r10.next()
        L_0x0341:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x037a
            java.lang.Object r7 = r10.next()
            X.A26 r7 = (X.A26) r7
            X.A26 r6 = (X.A26) r6
            java.lang.String r9 = r6.A05
            int r8 = r6.A01
            int r2 = r7.A01
            if (r8 == r2) goto L_0x035d
            if (r8 == r1) goto L_0x035c
            r8 = 0
            if (r2 != r1) goto L_0x035d
        L_0x035c:
            r8 = 1
        L_0x035d:
            long r4 = r6.A02
            long r6 = r7.A02
            long r4 = r4 + r6
            java.lang.Long r25 = java.lang.Long.valueOf(r4)
            r24 = 0
            X.A26 r6 = new X.A26
            r27 = r8
            r28 = r4
            r26 = r9
            r23 = r6
            r23.<init>(r24, r25, r26, r27, r28)
            goto L_0x0341
        L_0x0376:
            r2 = r9
            goto L_0x0321
        L_0x0378:
            r2 = r9
            goto L_0x0312
        L_0x037a:
            X.A26 r6 = (X.A26) r6
            goto L_0x0294
        L_0x037e:
            java.lang.String r1 = "Empty collection can't be reduced."
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0386:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170188os.A0T(X.8sL, X.9JN):X.A26");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C170188os(C25311Ns r1, AnonymousClass118 r2, AnonymousClass1NX r3, AnonymousClass19D r4, C18030ve r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        super(r3);
        C18070vi.A0w(r2, r5, r4, r6, r7);
        C18070vi.A0l(r1, r8);
        this.A01 = r2;
        this.A02 = r5;
        this.A05 = r4;
        this.A06 = r6;
        this.A04 = r7;
        this.A00 = r1;
        this.A03 = r8;
    }

    public String A0M() {
        return "stickers";
    }

    public void A0O(C171878sQ r2, double d) {
        r2.A0T = AnonymousClass8BW.A0Y(d);
    }

    public void A0P(C171878sQ r2, double d) {
        r2.A0U = AnonymousClass8BW.A0Y(d);
    }

    public void A0Q(C171878sQ r2, double d) {
        r2.A0R = AnonymousClass8BW.A0Y(d);
    }

    public void A0R(C171878sQ r2, double d) {
        Double valueOf = Double.valueOf(d);
        r2.A0S = valueOf;
        r2.A0V = valueOf;
    }
}
