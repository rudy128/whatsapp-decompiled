package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: X.2sg  reason: invalid class name and case insensitive filesystem */
public final class C63202sg {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public final void A02() {
        File A0e = C17880vN.A0e(((C17930vS) this.A00.get()).A02("account_switching", 0), "checkpoint");
        if (A0e.exists()) {
            C17900vP.A0n("AccountSwitchingRecoveryManager/deleteCheckpointFile = ", AnonymousClass000.A10(), A0e.delete());
            return;
        }
        Log.e("AccountSwitchingRecoveryManager/deleteCheckpointFile/checkpointFile not found");
    }

    public C63202sg(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }

    public static final void A00(RandomAccessFile randomAccessFile, String str) {
        long length = randomAccessFile.length() - 1;
        while (length > 0) {
            randomAccessFile.seek(length);
            if (randomAccessFile.readByte() == 10) {
                break;
            }
            length--;
        }
        long j = 0;
        if (length != 0) {
            j = 1 + length;
        }
        randomAccessFile.seek(j);
        randomAccessFile.writeBytes(str);
        randomAccessFile.setLength(randomAccessFile.getFilePointer());
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A01(java.io.File r10, java.io.File r11, java.io.File r12, java.io.File r13, java.io.RandomAccessFile r14, long r15, boolean r17) {
        /*
            r9 = this;
            boolean r0 = r10.exists()
            java.lang.String r4 = "staging"
            r2 = 0
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = r10.getAbsolutePath()
            X.C18070vi.A0X(r0)
            boolean r0 = X.AnonymousClass1YF.A0Y(r0, r4, r2)
            if (r0 == 0) goto L_0x003e
            boolean r3 = r10.mkdirs()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/"
            X.C17900vP.A0N(r10, r0, r1)
            java.lang.String r0 = " dirCreated: "
            X.C17900vP.A0n(r0, r1, r3)
            if (r3 != 0) goto L_0x003e
            if (r17 != 0) goto L_0x003e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/failed to create "
            r1.append(r0)
            java.lang.String r0 = r11.getAbsolutePath()
            X.C17890vO.A1A(r1, r0)
            return r2
        L_0x003e:
            boolean r0 = r11.exists()
            java.lang.String r8 = " found. Deleting it: "
            java.lang.String r5 = "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/fromDir: "
            if (r0 == 0) goto L_0x0056
            boolean r1 = X.C21721ArX.A05(r11)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.C17900vP.A0N(r11, r5, r0)
            X.C17900vP.A0n(r8, r0, r1)
        L_0x0056:
            boolean r3 = r13.renameTo(r11)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.C17900vP.A0N(r11, r5, r0)
            java.lang.String r7 = ", toDir: "
            X.C17900vP.A0N(r13, r7, r0)
            java.lang.String r6 = ":, moveDir:"
            X.C17900vP.A0n(r6, r0, r3)
            if (r3 != 0) goto L_0x00d0
            boolean r0 = r11.exists()
            java.lang.String r5 = "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/attempting again fromDir: "
            if (r0 == 0) goto L_0x0083
            boolean r1 = X.C21721ArX.A05(r11)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.C17900vP.A0N(r11, r5, r0)
            X.C17900vP.A0n(r8, r0, r1)
        L_0x0083:
            boolean r3 = r13.renameTo(r11)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.C17900vP.A0N(r11, r5, r0)
            X.C17900vP.A0N(r13, r7, r0)
            X.C17900vP.A0n(r6, r0, r3)
            if (r3 != 0) goto L_0x00d0
            if (r17 != 0) goto L_0x00d0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/failed to recover "
            X.C17900vP.A0X(r11, r0, r1)
        L_0x00a1:
            boolean r0 = r12.exists()
            if (r0 == 0) goto L_0x00cf
            java.lang.String r0 = r12.getAbsolutePath()
            X.C18070vi.A0X(r0)
            boolean r0 = X.AnonymousClass1YF.A0Y(r0, r4, r2)
            if (r0 == 0) goto L_0x00cf
            java.io.File[] r0 = r12.listFiles()
            if (r0 == 0) goto L_0x00bd
            int r0 = r0.length
            if (r0 != 0) goto L_0x00cf
        L_0x00bd:
            boolean r2 = X.C21721ArX.A05(r12)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/toPath: "
            X.C17900vP.A0N(r12, r0, r1)
            java.lang.String r0 = " is empty. Deleting it:"
            X.C17900vP.A0n(r0, r1, r2)
        L_0x00cf:
            return r3
        L_0x00d0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/recovered "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " successfully: "
            X.C17900vP.A0n(r0, r1, r3)
            r0 = r15
            r14.seek(r0)
            long r0 = r14.getFilePointer()
            r14.setLength(r0)
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63202sg.A01(java.io.File, java.io.File, java.io.File, java.io.File, java.io.RandomAccessFile, long, boolean):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02a7, code lost:
        if (X.C18070vi.A18(r3.A00(), r11) != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02a9, code lost:
        com.whatsapp.util.Log.i("AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/isNewStorageMigrate/newDirId different from active dir id, move the directory back to the original location");
        X.C17900vP.A0n("AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/isNewStorageMigrate/recover move result=", X.AnonymousClass000.A10(), r9.renameTo(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x034a, code lost:
        X.C17900vP.A0X(r3, "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/failed to recover from MOVING case for ", X.AnonymousClass000.A10());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0352, code lost:
        X.C17900vP.A0X(r3, "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/failed to recover from MOVING case for ", X.AnonymousClass000.A10());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x035a, code lost:
        X.C17900vP.A0X(r3, "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/failed to recover from MOVED case for ", X.AnonymousClass000.A10());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0376, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0377, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x037a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0126, code lost:
        if (r12.equals("moving") != false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        X.C17960vV.A0C(X.AnonymousClass000.A1T(r9.size(), 6));
        r13 = X.C17880vN.A0w(r9, 1);
        r12 = new java.io.File(X.C17880vN.A0w(r9, 3));
        r10 = new java.io.File(X.C17880vN.A0w(r9, 5));
        r3 = X.C17880vN.A0e(r12, r13);
        r18 = X.C17880vN.A0e(r10, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0157, code lost:
        if (r18.exists() != false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0159, code lost:
        r9 = X.AnonymousClass000.A10();
        X.C17900vP.A0N(r18, "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/toDir: ", r9);
        X.C17890vO.A1A(r9, " doesn't exist");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0173, code lost:
        if (X.C18070vi.A18(r9.get(0), "moving") == false) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0175, code lost:
        r9 = r10.getAbsolutePath();
        X.C18070vi.A0X(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018a, code lost:
        if (X.AnonymousClass1YF.A0Y(r9, "staging", false) == false) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0190, code lost:
        if (r18.exists() == false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0192, code lost:
        r11 = X.AnonymousClass000.A11("AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/record was moving but ");
        r11.append(r13);
        X.C17890vO.A1A(r11, " was successfully moved from data dir");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01b2, code lost:
        if (A01(r12, r3, r10, r18, r5, r0, r8) != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01b4, code lost:
        if (r31 != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b8, code lost:
        X.C17900vP.A0f(r11, " is not moved", X.AnonymousClass000.A11("AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/Skipping as "));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c0, code lost:
        r15 = r12.getAbsolutePath();
        X.C18070vi.A0X(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01cd, code lost:
        if (X.AnonymousClass1YF.A0Y(r15, "staging", false) == false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d3, code lost:
        if (r3.exists() != false) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d5, code lost:
        r11 = X.AnonymousClass000.A11("AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/record was moving but ");
        r11.append(r13);
        X.C17890vO.A1A(r11, " was successfully moved from staging");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01f5, code lost:
        if (A01(r12, r3, r10, r18, r5, r0, r8) != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01f7, code lost:
        if (r31 != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0203, code lost:
        if (X.C18070vi.A18(r9.get(0), "moved") == false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0219, code lost:
        if (A01(r12, r3, r10, r18, r5, r0, r8) != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x021b, code lost:
        if (r31 != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x021f, code lost:
        X.C17900vP.A0e("AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/invalid record: ", r11, X.AnonymousClass000.A10());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0229, code lost:
        X.C17900vP.A0f(r11, " is not moved", X.AnonymousClass000.A11("AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/Skipping as "));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0230, code lost:
        r5.seek(r0);
        r5.setLength(r5.getFilePointer());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        X.C17960vV.A0C(X.AnonymousClass000.A1T(r9.size(), 6));
        r11 = X.C17880vN.A0w(r9, 1);
        r10 = new java.io.File(X.C17880vN.A0w(r9, 3));
        r9 = new java.io.File(X.C17880vN.A0w(r9, 5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x027f, code lost:
        if (r9.exists() == false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0281, code lost:
        r3 = (X.AnonymousClass10b) r7.A02.get();
        r2 = r3.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x028d, code lost:
        if (r2 == null) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0293, code lost:
        if (r2.length() != 0) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0295, code lost:
        if (r11 == null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x029b, code lost:
        if (r11.length() != 0) goto L_0x029f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008b A[Catch:{ all -> 0x0376 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0099 A[Catch:{ all -> 0x0376 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4 A[Catch:{ all -> 0x0376 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(boolean r31) {
        /*
            r30 = this;
            java.lang.String r20 = "staging"
            r7 = r30
            X.00H r0 = r7.A00
            java.lang.Object r1 = r0.get()
            X.0vS r1 = (X.C17930vS) r1
            java.lang.String r0 = "account_switching"
            r6 = 0
            java.io.File r1 = r1.A02(r0, r6)
            java.lang.String r0 = "checkpoint"
            java.io.File r2 = X.C17880vN.A0e(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/checkpointFile found = "
            r1.append(r0)
            boolean r0 = r2.exists()
            r1.append(r0)
            java.lang.String r0 = " recoveryOnAppStartup: "
            r8 = r31
            X.C17900vP.A0n(r0, r1, r8)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x037b
            java.lang.String r0 = "rws"
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile
            r5.<init>(r2, r0)
            long r1 = r5.length()     // Catch:{ all -> 0x0374 }
            r14 = 1
            r4 = 0
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0053
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/checkpointFile is empty, nothing to recover"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0374 }
            r7.A02()     // Catch:{ all -> 0x0374 }
            goto L_0x0369
        L_0x0053:
            r19 = 0
        L_0x0055:
            long r9 = r5.length()     // Catch:{ all -> 0x0374 }
            r2 = 0
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x036d
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0374 }
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/checkpoint file length: "
            r9.append(r0)     // Catch:{ all -> 0x0374 }
            long r0 = r5.length()     // Catch:{ all -> 0x0374 }
            X.C17890vO.A16(r9, r0)     // Catch:{ all -> 0x0374 }
            long r0 = r5.length()     // Catch:{ all -> 0x0374 }
            long r0 = r0 - r14
        L_0x0074:
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x0087
            r5.seek(r0)     // Catch:{ all -> 0x0374 }
            byte r10 = r5.readByte()     // Catch:{ all -> 0x0374 }
            r9 = 10
            if (r10 == r9) goto L_0x0087
            r9 = -1
            long r0 = r0 + r9
            goto L_0x0074
        L_0x0087:
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 == 0) goto L_0x008d
            long r2 = r0 + r14
        L_0x008d:
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0374 }
            long r11 = r5.length()     // Catch:{ all -> 0x0374 }
        L_0x0095:
            int r9 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x00aa
            r5.seek(r2)     // Catch:{ all -> 0x0374 }
            int r10 = r5.read()     // Catch:{ all -> 0x0374 }
            r9 = 10
            if (r10 == r9) goto L_0x00aa
            char r9 = (char) r10     // Catch:{ all -> 0x0374 }
            r13.append(r9)     // Catch:{ all -> 0x0374 }
            long r2 = r2 + r14
            goto L_0x0095
        L_0x00aa:
            java.lang.String r11 = X.C18070vi.A0H(r13)     // Catch:{ all -> 0x0374 }
            int r2 = r11.length()     // Catch:{ all -> 0x0374 }
            if (r2 == 0) goto L_0x00d2
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0374 }
            java.lang.String r2 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/checkpoint line: "
            X.C17900vP.A0f(r2, r11, r3)     // Catch:{ all -> 0x0374 }
            r10 = 1
            java.lang.String[] r9 = new java.lang.String[r10]     // Catch:{ all -> 0x0374 }
            java.lang.String r2 = ":"
            r9[r6] = r2     // Catch:{ all -> 0x0374 }
            r3 = 6
            java.util.List r9 = X.AnonymousClass1YF.A0S(r11, r9, r6)     // Catch:{ all -> 0x0374 }
            java.lang.String r12 = X.C17880vN.A0w(r9, r6)     // Catch:{ all -> 0x0374 }
            int r13 = r12.hashCode()     // Catch:{ all -> 0x0374 }
            goto L_0x00dd
        L_0x00d2:
            r5.seek(r0)     // Catch:{ all -> 0x0374 }
            long r0 = r5.getFilePointer()     // Catch:{ all -> 0x0374 }
            r5.setLength(r0)     // Catch:{ all -> 0x0374 }
            goto L_0x00e4
        L_0x00dd:
            java.lang.String r14 = "moved"
            java.lang.String r2 = "moving"
            switch(r13) {
                case -1068259250: goto L_0x0122;
                case -1051557880: goto L_0x023c;
                case 104087219: goto L_0x011b;
                case 243173305: goto L_0x0112;
                case 1666052828: goto L_0x00e8;
                case 2038719204: goto L_0x0246;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            r14 = 1
            goto L_0x0055
        L_0x00e8:
            java.lang.String r2 = "new_storage"
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x0374 }
            if (r2 == 0) goto L_0x00e4
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0374 }
            java.lang.String r2 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/recovering from a new storage error, recoveryOnAppStartUp="
            X.C17900vP.A0n(r2, r3, r8)     // Catch:{ all -> 0x0374 }
            java.lang.String r4 = X.C17880vN.A0w(r9, r10)     // Catch:{ all -> 0x0374 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0374 }
            java.lang.String r2 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/new dir id: "
            X.C17900vP.A0f(r2, r4, r3)     // Catch:{ all -> 0x0374 }
            r5.seek(r0)     // Catch:{ all -> 0x0374 }
            long r0 = r5.getFilePointer()     // Catch:{ all -> 0x0374 }
            r5.setLength(r0)     // Catch:{ all -> 0x0374 }
            goto L_0x0344
        L_0x0112:
            java.lang.String r2 = "ns_moved"
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x0374 }
            if (r2 != 0) goto L_0x0258
            goto L_0x00e4
        L_0x011b:
            boolean r12 = r12.equals(r14)     // Catch:{ all -> 0x0374 }
            if (r12 != 0) goto L_0x0128
            goto L_0x00e4
        L_0x0122:
            boolean r12 = r12.equals(r2)     // Catch:{ all -> 0x0374 }
            if (r12 == 0) goto L_0x00e4
        L_0x0128:
            int r12 = r9.size()     // Catch:{ all -> 0x0374 }
            boolean r3 = X.AnonymousClass000.A1T(r12, r3)
            X.C17960vV.A0C(r3)     // Catch:{ all -> 0x0374 }
            java.lang.String r13 = X.C17880vN.A0w(r9, r10)     // Catch:{ all -> 0x0374 }
            r3 = 3
            java.lang.String r3 = X.C17880vN.A0w(r9, r3)     // Catch:{ all -> 0x0374 }
            java.io.File r12 = new java.io.File     // Catch:{ all -> 0x0374 }
            r12.<init>(r3)     // Catch:{ all -> 0x0374 }
            r3 = 5
            java.lang.String r3 = X.C17880vN.A0w(r9, r3)     // Catch:{ all -> 0x0374 }
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x0374 }
            r10.<init>(r3)     // Catch:{ all -> 0x0374 }
            java.io.File r3 = X.C17880vN.A0e(r12, r13)     // Catch:{ all -> 0x0374 }
            java.io.File r18 = X.C17880vN.A0e(r10, r13)     // Catch:{ all -> 0x0374 }
            boolean r15 = r18.exists()     // Catch:{ all -> 0x0374 }
            if (r15 != 0) goto L_0x016b
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0374 }
            java.lang.String r3 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/toDir: "
            r2 = r18
            X.C17900vP.A0N(r2, r3, r9)     // Catch:{ all -> 0x0374 }
            java.lang.String r2 = " doesn't exist"
            X.C17890vO.A1A(r9, r2)     // Catch:{ all -> 0x0374 }
            goto L_0x00d2
        L_0x016b:
            java.lang.Object r15 = r9.get(r6)     // Catch:{ all -> 0x0374 }
            boolean r2 = X.C18070vi.A18(r15, r2)     // Catch:{ all -> 0x0374 }
            if (r2 == 0) goto L_0x01fb
            java.lang.String r9 = r10.getAbsolutePath()     // Catch:{ all -> 0x0374 }
            X.C18070vi.A0X(r9)     // Catch:{ all -> 0x0374 }
            r2 = r20
            boolean r2 = X.AnonymousClass1YF.A0Y(r9, r2, r6)     // Catch:{ all -> 0x0374 }
            java.lang.String r9 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/failed to recover from MOVING case for "
            java.lang.String r14 = " is not moved"
            java.lang.String r17 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/record was moving but "
            java.lang.String r16 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/Skipping as "
            if (r2 == 0) goto L_0x01c0
            boolean r2 = r18.exists()     // Catch:{ all -> 0x0374 }
            if (r2 == 0) goto L_0x01b8
            java.lang.StringBuilder r11 = X.AnonymousClass000.A11(r17)     // Catch:{ all -> 0x0374 }
            r11.append(r13)     // Catch:{ all -> 0x0374 }
            java.lang.String r2 = " was successfully moved from data dir"
            X.C17890vO.A1A(r11, r2)     // Catch:{ all -> 0x0374 }
            r23 = r3
            r24 = r10
            r25 = r18
            r26 = r5
            r27 = r0
            r29 = r8
            r21 = r7
            r22 = r12
            boolean r0 = r21.A01(r22, r23, r24, r25, r26, r27, r29)     // Catch:{ all -> 0x0374 }
            if (r0 != 0) goto L_0x00e4
            if (r31 != 0) goto L_0x00e4
            goto L_0x034a
        L_0x01b8:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r16)     // Catch:{ all -> 0x0374 }
            X.C17900vP.A0f(r11, r14, r2)     // Catch:{ all -> 0x0374 }
            goto L_0x0230
        L_0x01c0:
            java.lang.String r15 = r12.getAbsolutePath()     // Catch:{ all -> 0x0374 }
            X.C18070vi.A0X(r15)     // Catch:{ all -> 0x0374 }
            r2 = r20
            boolean r2 = X.AnonymousClass1YF.A0Y(r15, r2, r6)     // Catch:{ all -> 0x0374 }
            if (r2 == 0) goto L_0x00e4
            boolean r2 = r3.exists()     // Catch:{ all -> 0x0374 }
            if (r2 != 0) goto L_0x0229
            java.lang.StringBuilder r11 = X.AnonymousClass000.A11(r17)     // Catch:{ all -> 0x0374 }
            r11.append(r13)     // Catch:{ all -> 0x0374 }
            java.lang.String r2 = " was successfully moved from staging"
            X.C17890vO.A1A(r11, r2)     // Catch:{ all -> 0x0374 }
            r23 = r3
            r24 = r10
            r25 = r18
            r26 = r5
            r27 = r0
            r29 = r8
            r21 = r7
            r22 = r12
            boolean r0 = r21.A01(r22, r23, r24, r25, r26, r27, r29)     // Catch:{ all -> 0x0374 }
            if (r0 != 0) goto L_0x00e4
            if (r31 != 0) goto L_0x00e4
            goto L_0x0352
        L_0x01fb:
            java.lang.Object r2 = r9.get(r6)     // Catch:{ all -> 0x0374 }
            boolean r2 = X.C18070vi.A18(r2, r14)     // Catch:{ all -> 0x0374 }
            if (r2 == 0) goto L_0x021f
            r23 = r3
            r24 = r10
            r25 = r18
            r26 = r5
            r27 = r0
            r29 = r8
            r21 = r7
            r22 = r12
            boolean r0 = r21.A01(r22, r23, r24, r25, r26, r27, r29)     // Catch:{ all -> 0x0374 }
            if (r0 != 0) goto L_0x00e4
            if (r31 != 0) goto L_0x00e4
            goto L_0x035a
        L_0x021f:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0374 }
            java.lang.String r2 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/invalid record: "
            X.C17900vP.A0e(r2, r11, r3)     // Catch:{ all -> 0x0374 }
            goto L_0x0230
        L_0x0229:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r16)     // Catch:{ all -> 0x0374 }
            X.C17900vP.A0f(r11, r14, r2)     // Catch:{ all -> 0x0374 }
        L_0x0230:
            r5.seek(r0)     // Catch:{ all -> 0x0374 }
            long r0 = r5.getFilePointer()     // Catch:{ all -> 0x0374 }
            r5.setLength(r0)     // Catch:{ all -> 0x0374 }
            goto L_0x00e4
        L_0x023c:
            java.lang.String r2 = "ns_moving"
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x0374 }
            if (r2 != 0) goto L_0x0258
            goto L_0x00e4
        L_0x0246:
            java.lang.String r2 = "accounts_backup_created"
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x0374 }
            if (r2 == 0) goto L_0x00e4
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0374 }
            java.lang.String r2 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/restoring accounts backup file, recoveryOnAppStartUp="
            X.C17900vP.A0n(r2, r3, r8)     // Catch:{ all -> 0x0374 }
            goto L_0x02bd
        L_0x0258:
            int r2 = r9.size()     // Catch:{ all -> 0x0374 }
            boolean r2 = X.AnonymousClass000.A1T(r2, r3)
            X.C17960vV.A0C(r2)     // Catch:{ all -> 0x0374 }
            java.lang.String r11 = X.C17880vN.A0w(r9, r10)     // Catch:{ all -> 0x0374 }
            r2 = 3
            java.lang.String r2 = X.C17880vN.A0w(r9, r2)     // Catch:{ all -> 0x0374 }
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x0374 }
            r10.<init>(r2)     // Catch:{ all -> 0x0374 }
            r2 = 5
            java.lang.String r2 = X.C17880vN.A0w(r9, r2)     // Catch:{ all -> 0x0374 }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x0374 }
            r9.<init>(r2)     // Catch:{ all -> 0x0374 }
            boolean r2 = r9.exists()     // Catch:{ all -> 0x0374 }
            if (r2 == 0) goto L_0x00d2
            X.00H r2 = r7.A02     // Catch:{ all -> 0x0374 }
            java.lang.Object r3 = r2.get()     // Catch:{ all -> 0x0374 }
            X.10b r3 = (X.AnonymousClass10b) r3     // Catch:{ all -> 0x0374 }
            java.lang.String r2 = r3.A00()     // Catch:{ all -> 0x0374 }
            if (r2 == 0) goto L_0x0295
            int r2 = r2.length()     // Catch:{ all -> 0x0374 }
            if (r2 != 0) goto L_0x029f
        L_0x0295:
            if (r11 == 0) goto L_0x00d2
            int r2 = r11.length()     // Catch:{ all -> 0x0374 }
            if (r2 != 0) goto L_0x029f
            goto L_0x00d2
        L_0x029f:
            java.lang.String r2 = r3.A00()     // Catch:{ all -> 0x0374 }
            boolean r2 = X.C18070vi.A18(r2, r11)     // Catch:{ all -> 0x0374 }
            if (r2 != 0) goto L_0x00d2
            java.lang.String r2 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/isNewStorageMigrate/newDirId different from active dir id, move the directory back to the original location"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0374 }
            boolean r9 = r9.renameTo(r10)     // Catch:{ all -> 0x0374 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0374 }
            java.lang.String r2 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/isNewStorageMigrate/recover move result="
            X.C17900vP.A0n(r2, r3, r9)     // Catch:{ all -> 0x0374 }
            goto L_0x00d2
        L_0x02bd:
            java.lang.String r10 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/failed to restore accounts backup file"
            java.lang.String r9 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/retrying restoring accounts backup file"
            if (r19 == 0) goto L_0x0325
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0374 }
            java.lang.String r2 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/isNewStorage/newDirId="
            X.C17900vP.A0f(r2, r4, r3)     // Catch:{ all -> 0x0374 }
            X.00H r2 = r7.A02     // Catch:{ all -> 0x0374 }
            java.lang.Object r3 = r2.get()     // Catch:{ all -> 0x0374 }
            X.10b r3 = (X.AnonymousClass10b) r3     // Catch:{ all -> 0x0374 }
            java.lang.String r2 = r3.A00()     // Catch:{ all -> 0x0374 }
            if (r2 == 0) goto L_0x02e0
            int r2 = r2.length()     // Catch:{ all -> 0x0374 }
            if (r2 != 0) goto L_0x02f8
        L_0x02e0:
            if (r4 == 0) goto L_0x02e8
            int r2 = r4.length()     // Catch:{ all -> 0x0374 }
            if (r2 != 0) goto L_0x02f8
        L_0x02e8:
            java.lang.String r2 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/isNewStorage/newDirId same as active dir id, deleting accounts backup"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0374 }
            X.00H r2 = r7.A01     // Catch:{ all -> 0x0374 }
            X.2u4 r2 = X.C17880vN.A0J(r2)     // Catch:{ all -> 0x0374 }
            r2.A0M()     // Catch:{ all -> 0x0374 }
            goto L_0x00d2
        L_0x02f8:
            java.lang.String r2 = r3.A00()     // Catch:{ all -> 0x0374 }
            boolean r2 = X.C18070vi.A18(r2, r4)     // Catch:{ all -> 0x0374 }
            if (r2 != 0) goto L_0x02e8
            java.lang.String r2 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/isNewStorage/newDirId different from active dir id, restoring accounts backup"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0374 }
            X.00H r3 = r7.A01     // Catch:{ all -> 0x0374 }
            X.2u4 r2 = X.C17880vN.A0J(r3)     // Catch:{ all -> 0x0374 }
            boolean r2 = r2.A0N()     // Catch:{ all -> 0x0374 }
            if (r2 != 0) goto L_0x00d2
            com.whatsapp.util.Log.i((java.lang.String) r9)     // Catch:{ all -> 0x0374 }
            X.2u4 r2 = X.C17880vN.A0J(r3)     // Catch:{ all -> 0x0374 }
            boolean r2 = r2.A0N()     // Catch:{ all -> 0x0374 }
            if (r2 != 0) goto L_0x00d2
            com.whatsapp.util.Log.e((java.lang.String) r10)     // Catch:{ all -> 0x0374 }
            goto L_0x00d2
        L_0x0325:
            X.00H r3 = r7.A01     // Catch:{ all -> 0x0374 }
            X.2u4 r2 = X.C17880vN.A0J(r3)     // Catch:{ all -> 0x0374 }
            boolean r2 = r2.A0N()     // Catch:{ all -> 0x0374 }
            if (r2 != 0) goto L_0x00d2
            com.whatsapp.util.Log.i((java.lang.String) r9)     // Catch:{ all -> 0x0374 }
            X.2u4 r2 = X.C17880vN.A0J(r3)     // Catch:{ all -> 0x0374 }
            boolean r2 = r2.A0N()     // Catch:{ all -> 0x0374 }
            if (r2 != 0) goto L_0x00d2
            com.whatsapp.util.Log.e((java.lang.String) r10)     // Catch:{ all -> 0x0374 }
            if (r31 != 0) goto L_0x00d2
            goto L_0x0364
        L_0x0344:
            r14 = 1
            r19 = 1
            goto L_0x0055
        L_0x034a:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0374 }
            X.C17900vP.A0X(r3, r9, r0)     // Catch:{ all -> 0x0374 }
            goto L_0x0369
        L_0x0352:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0374 }
            X.C17900vP.A0X(r3, r9, r0)     // Catch:{ all -> 0x0374 }
            goto L_0x0369
        L_0x035a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0374 }
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/failed to recover from MOVED case for "
            X.C17900vP.A0X(r3, r0, r1)     // Catch:{ all -> 0x0374 }
            goto L_0x0369
        L_0x0364:
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/failed to restore accounts backup file, retrying on app startup"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0374 }
        L_0x0369:
            r5.close()
            return
        L_0x036d:
            r5.close()
            r7.A02()
            return
        L_0x0374:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0376 }
        L_0x0376:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        L_0x037b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63202sg.A03(boolean):void");
    }
}
