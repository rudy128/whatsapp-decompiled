package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.8or  reason: invalid class name and case insensitive filesystem */
public final class C170178or extends AnonymousClass1NZ {
    public final C25311Ns A00;
    public final AnonymousClass118 A01;
    public final C18030ve A02;
    public final AnonymousClass1NR A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;

    public ArrayList A0N(File file) {
        C18070vi.A0d(file, 0);
        ArrayList A022 = A3K.A02(AnonymousClass9JN.CRYPT13);
        A022.add(".crypt1");
        return AnonymousClass8BU.A0v(file, "stickers.db", A022);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: java.io.BufferedInputStream} */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.io.InputStream] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:110:0x01c0=Splitter:B:110:0x01c0, B:100:0x01af=Splitter:B:100:0x01af} */
    public synchronized boolean A0S(X.C171768sF r15, java.io.File r16) {
        /*
            r14 = this;
            monitor-enter(r14)
            r3 = 1
            r8 = r16
            X.C18070vi.A0d(r8, r3)     // Catch:{ all -> 0x0228 }
            X.00H r1 = r14.A06     // Catch:{ all -> 0x0228 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x0228 }
            X.5yf r0 = (X.C116815yf) r0     // Catch:{ all -> 0x0228 }
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.A02     // Catch:{ all -> 0x0228 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r13 = r0.writeLock()     // Catch:{ all -> 0x0228 }
            X.C18070vi.A0X(r13)     // Catch:{ all -> 0x0228 }
            r13.lock()     // Catch:{ all -> 0x0228 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x0228 }
            X.1Ls r0 = (X.C24801Ls) r0     // Catch:{ all -> 0x0228 }
            r0.close()     // Catch:{ all -> 0x0228 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x0228 }
            X.5yf r0 = (X.C116815yf) r0     // Catch:{ all -> 0x0228 }
            r0.A08()     // Catch:{ all -> 0x0228 }
            X.118 r0 = r14.A01     // Catch:{ all -> 0x0228 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0228 }
            java.lang.String r1 = "stickers.db"
            java.io.File r7 = r0.getDatabasePath(r1)     // Catch:{ all -> 0x0228 }
            X.C18070vi.A0X(r7)     // Catch:{ all -> 0x0228 }
            X.1Ns r0 = r14.A00     // Catch:{ all -> 0x0228 }
            X.17r r0 = r0.A00     // Catch:{ all -> 0x0228 }
            java.io.File r6 = r0.A0I()     // Catch:{ all -> 0x0228 }
            r2 = 0
            X.00H r0 = r14.A04     // Catch:{ Exception -> 0x0206 }
            java.lang.Object r5 = r0.get()     // Catch:{ Exception -> 0x0206 }
            X.9mv r5 = (X.C191639mv) r5     // Catch:{ Exception -> 0x0206 }
            java.lang.String r0 = X.AnonymousClass8BS.A0i(r8)     // Catch:{ Exception -> 0x0206 }
            int r4 = X.A3K.A00(r0, r1)     // Catch:{ Exception -> 0x0206 }
            if (r4 <= 0) goto L_0x007b
            X.9JN r1 = X.AnonymousClass9JN.CRYPT13     // Catch:{ Exception -> 0x0206 }
            int r0 = r1.version     // Catch:{ Exception -> 0x0206 }
            if (r4 < r0) goto L_0x0061
            X.9JN r1 = X.AnonymousClass9JN.A02(r4)     // Catch:{ Exception -> 0x0206 }
            if (r1 == 0) goto L_0x007b
        L_0x0061:
            r0 = 0
            X.A5N r9 = r5.A00(r0, r1, r8, r2)     // Catch:{ Exception -> 0x0206 }
            X.AMM r8 = new X.AMM     // Catch:{ Exception -> 0x0206 }
            r8.<init>(r7, r6)     // Catch:{ Exception -> 0x0206 }
            boolean r0 = r9 instanceof X.C167298fn     // Catch:{ Exception -> 0x0206 }
            if (r0 == 0) goto L_0x00ca
            java.io.File r0 = r9.A03     // Catch:{ Exception -> 0x0206 }
            java.io.FileInputStream r0 = X.C108945cZ.A18(r0)     // Catch:{ Exception -> 0x0206 }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0206 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0206 }
            goto L_0x007e
        L_0x007b:
            X.9JN r1 = X.AnonymousClass9JN.UNENCRYPTED     // Catch:{ Exception -> 0x0206 }
            goto L_0x0061
        L_0x007e:
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x01fc }
            r0.<init>()     // Catch:{ all -> 0x01fc }
            X.A4f r1 = r9.A02     // Catch:{ all -> 0x01fc }
            monitor-enter(r1)     // Catch:{ all -> 0x01fc }
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x00c7 }
            r5.<init>(r4)     // Catch:{ all -> 0x00c7 }
            monitor-exit(r1)     // Catch:{ all -> 0x01fc }
            java.util.zip.ZipEntry r0 = r5.getNextEntry()     // Catch:{ Exception -> 0x00bf }
        L_0x0090:
            if (r0 == 0) goto L_0x01af
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x00bf }
            java.lang.Object r6 = r8.apply(r0)     // Catch:{ Exception -> 0x00bf }
            java.io.File r6 = (java.io.File) r6     // Catch:{ Exception -> 0x00bf }
            if (r6 == 0) goto L_0x00ad
            X.17y r0 = r9.A01     // Catch:{ Exception -> 0x00bf }
            X.17z r1 = r0.A00     // Catch:{ Exception -> 0x00bf }
            X.2QW r0 = new X.2QW     // Catch:{ Exception -> 0x00bf }
            r0.<init>(r1, r6)     // Catch:{ Exception -> 0x00bf }
            X.C64062u9.A00(r5, r0)     // Catch:{ all -> 0x00b5 }
            r0.close()     // Catch:{ Exception -> 0x00bf }
        L_0x00ad:
            r5.closeEntry()     // Catch:{ Exception -> 0x00bf }
            java.util.zip.ZipEntry r0 = r5.getNextEntry()     // Catch:{ Exception -> 0x00bf }
            goto L_0x0090
        L_0x00b5:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x00ba }
            goto L_0x00be
        L_0x00ba:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x00bf }
        L_0x00be:
            throw r1     // Catch:{ Exception -> 0x00bf }
        L_0x00bf:
            r1 = move-exception
            java.lang.String r0 = "unencrypted-backup-file/restore-multi-file-backup/restore failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01f2 }
            goto L_0x01c0
        L_0x00c7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01fc }
            throw r0     // Catch:{ all -> 0x01fc }
        L_0x00ca:
            X.8fs r9 = (X.C167348fs) r9     // Catch:{ Exception -> 0x0206 }
            java.io.File r1 = r9.A03     // Catch:{ Exception -> 0x0206 }
            java.io.FileInputStream r4 = X.C108945cZ.A18(r1)     // Catch:{ Exception -> 0x0206 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ all -> 0x01fc }
            r5.<init>(r4)     // Catch:{ all -> 0x01fc }
            X.9nv r0 = r9.A0B(r5, r3)     // Catch:{ all -> 0x01f2 }
            r9.A00 = r0     // Catch:{ all -> 0x01f2 }
            if (r0 != 0) goto L_0x00e6
            java.lang.String r0 = "EncryptedBackupFile/restore-multi-file-backup/restore/failed to read prefix"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01f2 }
            goto L_0x01c0
        L_0x00e6:
            r1.length()     // Catch:{ all -> 0x01f2 }
            java.util.concurrent.atomic.AtomicLong r7 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x01f2 }
            r7.<init>()     // Catch:{ all -> 0x01f2 }
            X.A4f r6 = r9.A02     // Catch:{ all -> 0x01f2 }
            X.9JN r12 = r9.A0D()     // Catch:{ all -> 0x01f2 }
            X.9nv r10 = r9.A00     // Catch:{ all -> 0x01f2 }
            boolean r1 = r10 instanceof X.AnonymousClass8h3     // Catch:{ all -> 0x01f2 }
            if (r1 == 0) goto L_0x0100
            r0 = r10
            X.8h3 r0 = (X.AnonymousClass8h3) r0     // Catch:{ all -> 0x01f2 }
            byte[] r11 = r0.A02     // Catch:{ all -> 0x01f2 }
            goto L_0x0105
        L_0x0100:
            r0 = r10
            X.8h5 r0 = (X.AnonymousClass8h5) r0     // Catch:{ all -> 0x01f2 }
            byte[] r11 = r0.A03     // Catch:{ all -> 0x01f2 }
        L_0x0105:
            if (r11 == 0) goto L_0x01e8
            if (r1 == 0) goto L_0x010a
            goto L_0x010f
        L_0x010a:
            X.8h5 r10 = (X.AnonymousClass8h5) r10     // Catch:{ all -> 0x01f2 }
            byte[] r10 = r10.A02     // Catch:{ all -> 0x01f2 }
            goto L_0x0113
        L_0x010f:
            X.8h3 r10 = (X.AnonymousClass8h3) r10     // Catch:{ all -> 0x01f2 }
            byte[] r10 = r10.A01     // Catch:{ all -> 0x01f2 }
        L_0x0113:
            monitor-enter(r6)     // Catch:{ all -> 0x01f2 }
            int r1 = r12.ordinal()     // Catch:{ all -> 0x01ef }
            if (r1 == r3) goto L_0x015f
            r0 = 3
            if (r1 == r0) goto L_0x0145
            r0 = 4
            if (r1 == r0) goto L_0x012b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01ef }
            java.lang.String r0 = "unsupported key selector "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass8BX.A0V(r12, r0, r1)     // Catch:{ all -> 0x01ef }
            throw r0     // Catch:{ all -> 0x01ef }
        L_0x012b:
            X.C20036A4f.A01(r6)     // Catch:{ all -> 0x01ef }
            javax.crypto.Cipher r1 = r6.A02     // Catch:{ all -> 0x01ef }
            X.C17960vV.A07(r1)     // Catch:{ all -> 0x01ef }
            javax.crypto.spec.SecretKeySpec r0 = X.AnonymousClass8BS.A0v(r11)     // Catch:{ all -> 0x01ef }
            X.AnonymousClass8BW.A1O(r0, r1, r10)     // Catch:{ all -> 0x01ef }
            X.Amv r0 = new X.Amv     // Catch:{ all -> 0x01ef }
            r0.<init>(r5, r7, r1)     // Catch:{ all -> 0x01ef }
            java.util.zip.ZipInputStream r7 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x01ef }
            r7.<init>(r0)     // Catch:{ all -> 0x01ef }
            goto L_0x0178
        L_0x0145:
            X.C20036A4f.A01(r6)     // Catch:{ all -> 0x01ef }
            javax.crypto.Cipher r1 = r6.A01     // Catch:{ all -> 0x01ef }
            X.C17960vV.A07(r1)     // Catch:{ all -> 0x01ef }
            javax.crypto.spec.SecretKeySpec r0 = X.AnonymousClass8BS.A0v(r11)     // Catch:{ all -> 0x01ef }
            X.AnonymousClass8BW.A1O(r0, r1, r10)     // Catch:{ all -> 0x01ef }
            X.Amv r0 = new X.Amv     // Catch:{ all -> 0x01ef }
            r0.<init>(r5, r7, r1)     // Catch:{ all -> 0x01ef }
            java.util.zip.ZipInputStream r7 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x01ef }
            r7.<init>(r0)     // Catch:{ all -> 0x01ef }
            goto L_0x0178
        L_0x015f:
            X.C20036A4f.A01(r6)     // Catch:{ all -> 0x01ef }
            javax.crypto.Cipher r1 = r6.A00     // Catch:{ all -> 0x01ef }
            X.C17960vV.A07(r1)     // Catch:{ all -> 0x01ef }
            javax.crypto.spec.SecretKeySpec r0 = X.AnonymousClass8BS.A0v(r11)     // Catch:{ all -> 0x01ef }
            X.AnonymousClass8BW.A1O(r0, r1, r10)     // Catch:{ all -> 0x01ef }
            X.Amv r0 = new X.Amv     // Catch:{ all -> 0x01ef }
            r0.<init>(r5, r7, r1)     // Catch:{ all -> 0x01ef }
            java.util.zip.ZipInputStream r7 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x01ef }
            r7.<init>(r0)     // Catch:{ all -> 0x01ef }
        L_0x0178:
            monitor-exit(r6)     // Catch:{ all -> 0x01f2 }
            java.util.zip.ZipEntry r0 = r7.getNextEntry()     // Catch:{ Exception -> 0x01b7 }
        L_0x017d:
            if (r0 == 0) goto L_0x01ac
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x01b7 }
            java.lang.Object r6 = r8.apply(r0)     // Catch:{ Exception -> 0x01b7 }
            java.io.File r6 = (java.io.File) r6     // Catch:{ Exception -> 0x01b7 }
            if (r6 == 0) goto L_0x019a
            X.17y r0 = r9.A01     // Catch:{ Exception -> 0x01b7 }
            X.17z r1 = r0.A00     // Catch:{ Exception -> 0x01b7 }
            X.2QW r0 = new X.2QW     // Catch:{ Exception -> 0x01b7 }
            r0.<init>(r1, r6)     // Catch:{ Exception -> 0x01b7 }
            X.C64062u9.A00(r7, r0)     // Catch:{ all -> 0x01a2 }
            r0.close()     // Catch:{ Exception -> 0x01b7 }
        L_0x019a:
            r7.closeEntry()     // Catch:{ Exception -> 0x01b7 }
            java.util.zip.ZipEntry r0 = r7.getNextEntry()     // Catch:{ Exception -> 0x01b7 }
            goto L_0x017d
        L_0x01a2:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x01a7 }
            goto L_0x01ab
        L_0x01a7:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x01b7 }
        L_0x01ab:
            throw r1     // Catch:{ Exception -> 0x01b7 }
        L_0x01ac:
            r7.close()     // Catch:{ all -> 0x01f2 }
        L_0x01af:
            r5.close()     // Catch:{ all -> 0x01fc }
            r4.close()     // Catch:{ Exception -> 0x0206 }
            r1 = 1
            goto L_0x01c7
        L_0x01b7:
            r1 = move-exception
            java.lang.String r0 = "EncryptedBackupFile/restore-multi-file-backup/restore"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01de }
            r7.close()     // Catch:{ all -> 0x01f2 }
        L_0x01c0:
            r5.close()     // Catch:{ all -> 0x01fc }
            r4.close()     // Catch:{ Exception -> 0x0206 }
            r1 = 0
        L_0x01c7:
            r13.unlock()     // Catch:{ all -> 0x0228 }
            if (r1 == 0) goto L_0x01d5
            if (r15 == 0) goto L_0x0218
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0228 }
            r15.A06 = r0     // Catch:{ all -> 0x0228 }
            goto L_0x0218
        L_0x01d5:
            if (r15 == 0) goto L_0x0218
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0228 }
            r15.A06 = r0     // Catch:{ all -> 0x0228 }
            goto L_0x0218
        L_0x01de:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x01e3 }
            goto L_0x01e7
        L_0x01e3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01f2 }
        L_0x01e7:
            throw r1     // Catch:{ all -> 0x01f2 }
        L_0x01e8:
            java.lang.String r0 = "backup-prefix/get-key/key is null"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x01f2 }
            goto L_0x01f1
        L_0x01ef:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01f2 }
        L_0x01f1:
            throw r0     // Catch:{ all -> 0x01f2 }
        L_0x01f2:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x01f7 }
            goto L_0x01fb
        L_0x01f7:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01fc }
        L_0x01fb:
            throw r1     // Catch:{ all -> 0x01fc }
        L_0x01fc:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0201 }
            goto L_0x0205
        L_0x0201:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x0206 }
        L_0x0205:
            throw r1     // Catch:{ Exception -> 0x0206 }
        L_0x0206:
            r1 = move-exception
            java.lang.String r0 = "StickerBackupProducer/restore/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x021b }
            r13.unlock()     // Catch:{ all -> 0x0228 }
            if (r15 == 0) goto L_0x0219
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0228 }
            r15.A06 = r0     // Catch:{ all -> 0x0228 }
            goto L_0x0219
        L_0x0218:
            r2 = r1
        L_0x0219:
            monitor-exit(r14)
            return r2
        L_0x021b:
            r1 = move-exception
            r13.unlock()     // Catch:{ all -> 0x0228 }
            if (r15 == 0) goto L_0x0227
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0228 }
            r15.A06 = r0     // Catch:{ all -> 0x0228 }
        L_0x0227:
            throw r1     // Catch:{ all -> 0x0228 }
        L_0x0228:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170178or.A0S(X.8sF, java.io.File):boolean");
    }

    public void A0K(C171768sF r6, long j) {
        long j2 = 0;
        r6.A0K = C17880vN.A0o(C17900vP.A01(r6.A0K), j);
        Long l = r6.A0H;
        if (l != null) {
            j2 = l.longValue();
        }
        r6.A0H = C17880vN.A0o(j2, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0150, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.A26 A0U(X.AnonymousClass9JN r21) {
        /*
            r20 = this;
            r2 = r20
            boolean r0 = r2.A0L()
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "sticker-db-storage/backup/skip no media or read-only media"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r3 = "stickers-db"
            r1 = 0
            r4 = 1
            r5 = 0
            X.A26 r0 = new X.A26
            r2 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L_0x001a:
            X.9JN r0 = X.AnonymousClass9JN.CRYPT13
            r3 = r21
            if (r3 != r0) goto L_0x0073
            X.1L7 r0 = r2.A02
            java.io.File r4 = r0.A03()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r10 = "stickers.db"
            r1.append(r10)
            java.lang.String r0 = ".crypt1"
            java.io.File r14 = X.AnonymousClass8BW.A0X(r4, r0, r1)
        L_0x0035:
            boolean r0 = r14.exists()
            if (r0 == 0) goto L_0x0044
            boolean r0 = r14.isDirectory()
            if (r0 == 0) goto L_0x0044
            r14.delete()
        L_0x0044:
            java.io.File r0 = r14.getParentFile()
            X.C17960vV.A07(r0)
            X.C18070vi.A0X(r0)
            X.AnonymousClass8BV.A1H(r0)
            java.io.File r0 = r2.A0G(r3)
            java.util.ArrayList r0 = r2.A0N(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x005d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0090
            java.io.File r1 = X.AnonymousClass8BS.A0T(r4)
            if (r1 == 0) goto L_0x005d
            boolean r0 = r1.equals(r14)
            if (r0 != 0) goto L_0x005d
            X.C108985cd.A1C(r1)
            goto L_0x005d
        L_0x0073:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r10 = "stickers.db"
            r1.append(r10)
            java.lang.String r0 = ".crypt"
            r1.append(r0)
            int r0 = r3.version
            java.lang.String r1 = X.C17880vN.A0t(r1, r0)
            java.io.File r0 = r2.A0G(r3)
            java.io.File r14 = X.C17880vN.A0e(r0, r1)
            goto L_0x0035
        L_0x0090:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sticker-db-storage/backup/to "
            X.C17900vP.A0Y(r14, r0, r1)
            X.00H r1 = r2.A06
            java.lang.Object r0 = r1.get()
            X.1Ls r0 = (X.C24801Ls) r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.A02
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r11 = r0.writeLock()
            X.C18070vi.A0X(r11)
            r11.lock()
            java.lang.Object r0 = r1.get()     // Catch:{ Exception -> 0x0151 }
            X.5yf r0 = (X.C116815yf) r0     // Catch:{ Exception -> 0x0151 }
            r0.A07()     // Catch:{ Exception -> 0x0151 }
            java.lang.Object r0 = r1.get()     // Catch:{ Exception -> 0x0151 }
            X.1Ls r0 = (X.C24801Ls) r0     // Catch:{ Exception -> 0x0151 }
            r0.close()     // Catch:{ Exception -> 0x0151 }
            X.00H r0 = r2.A04     // Catch:{ Exception -> 0x0151 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0151 }
            X.9mv r0 = (X.C191639mv) r0     // Catch:{ Exception -> 0x0151 }
            r13 = 0
            r6 = 0
            X.A5N r1 = r0.A00(r13, r3, r14, r6)     // Catch:{ Exception -> 0x0151 }
            X.118 r0 = r2.A01     // Catch:{ Exception -> 0x0151 }
            android.content.Context r9 = r0.A00     // Catch:{ Exception -> 0x0151 }
            boolean r0 = r1 instanceof X.C167298fn     // Catch:{ Exception -> 0x0151 }
            if (r0 == 0) goto L_0x00dd
            X.8fn r1 = (X.C167298fn) r1     // Catch:{ Exception -> 0x0151 }
            X.AMP r5 = new X.AMP     // Catch:{ Exception -> 0x0151 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0151 }
            goto L_0x00fe
        L_0x00dd:
            X.8fs r1 = (X.C167348fs) r1     // Catch:{ Exception -> 0x0151 }
            boolean r0 = r1.A0A(r9, r13)     // Catch:{ Exception -> 0x0151 }
            if (r0 != 0) goto L_0x00f9
            java.lang.String r0 = "EncryptedBackupFile/failed to prepare for backup"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0151 }
            r5 = 0
            java.lang.String r15 = "stickers-db"
            r16 = 1
            r17 = 0
            X.A26 r0 = new X.A26     // Catch:{ all -> 0x014a }
            r12 = r0
            r14 = r13
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x014a }
            goto L_0x0163
        L_0x00f9:
            X.AMO r5 = new X.AMO     // Catch:{ Exception -> 0x0151 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0151 }
        L_0x00fe:
            java.io.File r0 = r9.getDatabasePath(r10)     // Catch:{ all -> 0x014a }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x014a }
            r5.CSM(r0)     // Catch:{ all -> 0x014a }
            X.1Ns r0 = r2.A00     // Catch:{ all -> 0x014a }
            X.17r r0 = r0.A00     // Catch:{ all -> 0x014a }
            java.io.File r0 = r0.A0I()     // Catch:{ all -> 0x014a }
            java.io.File[] r8 = r0.listFiles()     // Catch:{ all -> 0x014a }
            if (r8 == 0) goto L_0x0129
            int r7 = r8.length     // Catch:{ all -> 0x014a }
            r3 = 0
            r2 = 0
        L_0x011a:
            if (r2 >= r7) goto L_0x012b
            r0 = r8[r2]     // Catch:{ all -> 0x014a }
            r5.CSM(r0)     // Catch:{ all -> 0x014a }
            long r0 = r0.length()     // Catch:{ all -> 0x014a }
            long r3 = r3 + r0
            int r2 = r2 + 1
            goto L_0x011a
        L_0x0129:
            r3 = 0
        L_0x012b:
            r5.close()     // Catch:{ Exception -> 0x0151 }
            java.lang.String r16 = "stickers-db"
            java.io.File r0 = r9.getDatabasePath(r10)     // Catch:{ Exception -> 0x0151 }
            X.C18070vi.A0X(r0)     // Catch:{ Exception -> 0x0151 }
            long r18 = r0.length()     // Catch:{ Exception -> 0x0151 }
            long r18 = r18 + r3
            java.lang.Long r15 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x0151 }
            X.A26 r0 = new X.A26     // Catch:{ Exception -> 0x0151 }
            r13 = r0
            r17 = r6
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0151 }
            goto L_0x0163
        L_0x014a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x014c }
        L_0x014c:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ Exception -> 0x0151 }
            throw r0     // Catch:{ Exception -> 0x0151 }
        L_0x0151:
            r1 = move-exception
            java.lang.String r0 = "sticker-db-storage/backup failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0167 }
            java.lang.String r3 = "stickers-db"
            r1 = 0
            r4 = 1
            r5 = 0
            X.A26 r0 = new X.A26     // Catch:{ all -> 0x0167 }
            r2 = r1
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0167 }
        L_0x0163:
            r11.unlock()
            return r0
        L_0x0167:
            r0 = move-exception
            r11.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170178or.A0U(X.9JN):X.A26");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C170178or(C25311Ns r1, AnonymousClass118 r2, AnonymousClass1NX r3, C18030ve r4, AnonymousClass1NR r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        super(r3);
        C18070vi.A0w(r2, r4, r6, r7, r8);
        C18070vi.A0q(r5, r1, r9);
        this.A01 = r2;
        this.A02 = r4;
        this.A04 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A03 = r5;
        this.A00 = r1;
        this.A05 = r9;
    }

    public String A0M() {
        return "stickers-db";
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

    public A26 A0T(C171828sL r10, AnonymousClass9JN r11) {
        C18070vi.A0h(r11, r10);
        C18030ve r2 = this.A02;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 9369)) {
            ((C217917k) this.A05.get()).A00();
        }
        if (!C18020vd.A05(r1, r2, 8271)) {
            AnonymousClass1Ez r12 = new AnonymousClass1Ez("stickers-db");
            A26 A0U = A0U(r11);
            r10.A0B = Integer.valueOf(A3O.A01(A0U.A01));
            r10.A0S = AnonymousClass8BT.A0n(r12);
            return A0U;
        }
        Iterator it = A0N(A0G(r11)).iterator();
        while (it.hasNext()) {
            C64062u9.A0Q(AnonymousClass8BS.A0T(it));
        }
        return new A26((File) null, (Long) null, "stickers-db", 3, 0);
    }
}
