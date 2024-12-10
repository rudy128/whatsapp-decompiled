package com.whatsapp.accountswitching;

import X.A6J;
import X.A8T;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass10X;
import X.AnonymousClass10b;
import X.AnonymousClass11A;
import X.AnonymousClass11P;
import X.AnonymousClass11Z;
import X.AnonymousClass1Cd;
import X.C17930vS;
import X.C18030ve;
import X.C18070vi;
import X.C19680yj;
import X.C19830z4;
import X.C199210d;
import X.C199710i;
import X.C219017v;
import X.C23651Hc;
import X.C24801Ls;
import X.C24811Lt;
import X.C25011Mn;
import X.C29431cG;
import X.C29491cN;
import X.C49842Sd;
import X.C59692mj;
import X.C60322np;
import X.C62562rb;
import X.C64012u4;
import X.C99014s7;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class AccountSwitchingContentProvider extends C19680yj {
    public C23651Hc A00;
    public AnonymousClass11P A01;
    public C19830z4 A02;
    public AnonymousClass11Z A03;
    public AnonymousClass1Cd A04;
    public C18030ve A05;
    public C17930vS A06;
    public C199210d A07;
    public C219017v A08;
    public C25011Mn A09;
    public AnonymousClass10X A0A;
    public AnonymousClass11A A0B;
    public AnonymousClass10I A0C;
    public C24811Lt A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public AnonymousClass00H A0Q;
    public AnonymousClass00H A0R;
    public AnonymousClass00H A0S;
    public AnonymousClass00H A0T;
    public AnonymousClass00H A0U;

    private final String A01() {
        String obj;
        Log.i("AccountSwitchingContentProvider/maybeCorrectMakeActiveLid");
        String str = (String) C29431cG.A0c(((A8T) A0B().get()).A0D());
        if (str == null) {
            obj = "AccountSwitchingFileManager/getMakeActiveLidFromStagedDir/null";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("AccountSwitchingFileManager/getMakeActiveLidFromStagedDir/");
            sb.append(C60322np.A01(str));
            obj = sb.toString();
        }
        Log.i(obj);
        if (str == null || str.length() == 0) {
            throw new IllegalStateException("AccountSwitchingContentProvider/maybeCorrectMakeActiveLid/correctMakeActiveLid isNullOrEmpty");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AccountSwitchingContentProvider/maybeCorrectMakeActiveLid/correctMakeActiveLid ");
        sb2.append(C60322np.A01(str));
        Log.i(sb2.toString());
        return str;
    }

    public static final void A02(C29491cN r9, C64012u4 r10, A8T a8t, C19830z4 r12, AnonymousClass11Z r13, AnonymousClass10b r14, C17930vS r15, C199710i r16) {
        String str;
        String str2;
        String str3;
        C18070vi.A0d(r9, 2);
        C18070vi.A0d(r14, 5);
        C18070vi.A0d(r10, 6);
        C18070vi.A0d(a8t, 8);
        StringBuilder sb = new StringBuilder();
        sb.append("AccountSwitchingContentProvider/healthState");
        sb.append("/current account lid: ");
        C62562rb A032 = r9.A03();
        String str4 = null;
        if (A032 != null) {
            str = C60322np.A01(A032.A07);
        } else {
            str = null;
        }
        sb.append(str);
        Log.i(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AccountSwitchingContentProvider/healthState");
        sb2.append("/numberOfInactiveAccounts: ");
        sb2.append(r12.A0E());
        Log.i(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("AccountSwitchingContentProvider/healthState");
        sb3.append("/available internal phone storage: ");
        sb3.append(r13.A02() / SearchActionVerificationClientService.MS_TO_NS);
        sb3.append(" MB");
        Log.i(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("AccountSwitchingContentProvider/healthState");
        sb4.append("/stagingDirLogString/");
        sb4.append(C60322np.A00(a8t));
        Log.i(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append("AccountSwitchingContentProvider/healthState");
        sb5.append("/accountsDirLogString/");
        File[] listFiles = new File(new File(r15.A00.getApplicationInfo().dataDir), "accounts").listFiles();
        if (listFiles == null || listFiles.length == 0) {
            str2 = "secondaryAccountFolders null or empty";
        } else {
            C99014s7 r7 = new C99014s7(listFiles);
            str2 = "";
            while (r7.hasNext()) {
                File file = (File) r7.next();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(file.getName());
                sb6.append(" ->");
                String obj = sb6.toString();
                File[] listFiles2 = file.listFiles();
                if (listFiles2 == null || listFiles2.length == 0) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(obj);
                    sb7.append("secondaryAccountFiles null or empty");
                    obj = sb7.toString();
                } else {
                    C99014s7 r5 = new C99014s7(listFiles2);
                    while (r5.hasNext()) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(obj);
                        sb8.append(' ');
                        sb8.append(((File) r5.next()).getName());
                        obj = sb8.toString();
                    }
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str2);
                sb9.append(obj);
                sb9.append(10);
                str2 = sb9.toString();
            }
        }
        sb5.append(str2);
        Log.i(sb5.toString());
        StringBuilder sb10 = new StringBuilder();
        sb10.append("AccountSwitchingContentProvider/healthState");
        sb10.append("/accounts file content: ");
        synchronized (r10) {
            C59692mj A012 = C64012u4.A01(r10);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("inactiveAccounts", C64012u4.A06(A012.A03));
                jSONObject.put("allAccounts", C64012u4.A06(A012.A02));
                String str5 = A012.A01;
                if (!(str5 == null || str5.length() == 0)) {
                    jSONObject.put("paymentsOnboardedLid", C60322np.A01(str5));
                }
                jSONObject.put("shownMeTabMenuItemToolTip", A012.A05);
                jSONObject.put("isCompanionModeEnabled", A012.A04);
                str3 = jSONObject.toString();
                C18070vi.A0X(str3);
            } catch (JSONException e) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append("AccountSwitchingDataRepo/readDataForLogging/JSONException : ");
                sb11.append(e);
                Log.e(sb11.toString());
                str3 = "";
            }
        }
        sb10.append(str3);
        Log.i(sb10.toString());
        StringBuilder sb12 = new StringBuilder();
        sb12.append("AccountSwitchingContentProvider/healthState");
        sb12.append("/isSecondaryUser: ");
        sb12.append(r16.A05());
        Log.i(sb12.toString());
        String A002 = r14.A00();
        if (A002 != null) {
            if (A002.length() == 0) {
                A002 = "primaryAccount";
            }
            str4 = A002;
        }
        StringBuilder sb13 = new StringBuilder();
        sb13.append("AccountSwitchingContentProvider/healthState");
        sb13.append("/activeAccountDirId: ");
        sb13.append(str4);
        Log.i(sb13.toString());
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01bc, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01bf, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A03(X.C22534BBr r13, java.lang.String r14, java.lang.String r15, X.C18090vk r16, boolean r17) {
        /*
            r12 = this;
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executing preCheckpointOps..."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r13 == 0) goto L_0x000a
            r13.CC9()
        L_0x000a:
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executed preCheckpointOps"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r12.A0H
            if (r0 == 0) goto L_0x01c8
            java.lang.Object r0 = r0.get()
            X.2sg r0 = (X.C63202sg) r0
            X.00H r0 = r0.A00
            java.lang.Object r1 = r0.get()
            X.0vS r1 = (X.C17930vS) r1
            java.lang.String r0 = "account_switching"
            r10 = 0
            java.io.File r1 = r1.A02(r0, r10)
            java.lang.String r0 = "checkpoint"
            java.io.File r3 = X.C17880vN.A0e(r1, r0)
            boolean r0 = r3.exists()
            if (r0 != 0) goto L_0x01c0
            boolean r2 = r3.createNewFile()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AccountSwitchingRecoveryManager/createCheckpointFile = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "rws"
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
            r2.<init>(r3, r0)
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/checkpoint file created"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01b9 }
            X.00H r0 = r12.A0A()     // Catch:{ all -> 0x01b9 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x01b9 }
            X.2u4 r4 = (X.C64012u4) r4     // Catch:{ all -> 0x01b9 }
            monitor-enter(r4)     // Catch:{ all -> 0x01b9 }
            r3 = 0
            java.lang.String r0 = "accounts"
            java.io.File r1 = r4.A0D(r0)     // Catch:{ SecurityException -> 0x00be }
            boolean r0 = r1.exists()     // Catch:{ SecurityException -> 0x00be }
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = "AccountSwitchingDataRepo/createBackup/accounts file does not exist, attempting to create an empty one"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SecurityException -> 0x00be }
            X.0wS r7 = X.C18460wS.A00     // Catch:{ SecurityException -> 0x00be }
            r6 = 0
            r9 = 1000(0x3e8, float:1.401E-42)
            X.2mj r5 = new X.2mj     // Catch:{ SecurityException -> 0x00be }
            r8 = r7
            r11 = r10
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ SecurityException -> 0x00be }
            boolean r0 = X.C64012u4.A08(r5, r4)     // Catch:{ SecurityException -> 0x00be }
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = "AccountSwitchingDataRepo/createBackup/unable to create accounts file"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SecurityException -> 0x00be }
            goto L_0x00c4
        L_0x008d:
            java.lang.String r0 = "accounts.bak"
            java.io.File r7 = r4.A0D(r0)     // Catch:{ SecurityException -> 0x00be }
            boolean r0 = r7.exists()     // Catch:{ SecurityException -> 0x00be }
            if (r0 == 0) goto L_0x00b1
            boolean r6 = r7.delete()     // Catch:{ SecurityException -> 0x00be }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x00be }
            r5.<init>()     // Catch:{ SecurityException -> 0x00be }
            java.lang.String r0 = "AccountSwitchingDataRepo/createBackup/deleted previous backup file: "
            r5.append(r0)     // Catch:{ SecurityException -> 0x00be }
            r5.append(r6)     // Catch:{ SecurityException -> 0x00be }
            java.lang.String r0 = r5.toString()     // Catch:{ SecurityException -> 0x00be }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SecurityException -> 0x00be }
        L_0x00b1:
            X.00H r0 = r4.A02     // Catch:{ SecurityException -> 0x00be }
            java.lang.Object r0 = r0.get()     // Catch:{ SecurityException -> 0x00be }
            X.17y r0 = (X.C219317y) r0     // Catch:{ SecurityException -> 0x00be }
            boolean r3 = X.C64062u9.A0P(r0, r1, r7)     // Catch:{ SecurityException -> 0x00be }
            goto L_0x00c4
        L_0x00be:
            r1 = move-exception
            java.lang.String r0 = "AccountSwitchingDataRepo/createBackup/"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x019a }
        L_0x00c4:
            monitor-exit(r4)     // Catch:{ all -> 0x01b9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
            r1.<init>()     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/accounts file backed up:"
            r1.append(r0)     // Catch:{ all -> 0x01b9 }
            r1.append(r3)     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01b9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01b9 }
            if (r3 == 0) goto L_0x019d
            X.00H r0 = r12.A0H     // Catch:{ all -> 0x01b9 }
            if (r0 == 0) goto L_0x0194
            r0.get()     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = "accounts_backup_created\n"
            r2.writeBytes(r0)     // Catch:{ all -> 0x01b9 }
            if (r17 == 0) goto L_0x0121
            X.00H r0 = r12.A0H     // Catch:{ all -> 0x01b9 }
            if (r0 == 0) goto L_0x018e
            r0.get()     // Catch:{ all -> 0x01b9 }
            r0 = 1
            X.C18070vi.A0d(r15, r0)     // Catch:{ all -> 0x01b9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
            r1.<init>()     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = "new_storage:"
            r1.append(r0)     // Catch:{ all -> 0x01b9 }
            r1.append(r15)     // Catch:{ all -> 0x01b9 }
            r0 = 10
            r1.append(r0)     // Catch:{ all -> 0x01b9 }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x01b9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
            r1.<init>()     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recordNewStorageInfo/recorded: "
            r1.append(r0)     // Catch:{ all -> 0x01b9 }
            r1.append(r3)     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01b9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01b9 }
            r2.writeBytes(r3)     // Catch:{ all -> 0x01b9 }
        L_0x0121:
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executing data repo ops..."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01b9 }
            r16.invoke()     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executed data repo ops"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executing checkpointOps..."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01b9 }
            if (r13 == 0) goto L_0x0138
            r13.BEm(r2)     // Catch:{ all -> 0x01b9 }
        L_0x0138:
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executed checkpointOps"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01b9 }
            r3 = 0
            r2.close()
            X.00H r0 = r12.A0H
            if (r0 == 0) goto L_0x0188
            java.lang.Object r0 = r0.get()
            X.2sg r0 = (X.C63202sg) r0
            r0.A02()
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/checkpoint file deleted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executing postCheckpointOps..."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r13 == 0) goto L_0x015d
            r13.CBz()
        L_0x015d:
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executed postCheckpointOps"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r12.A0A()
            java.lang.Object r0 = r0.get()
            X.2u4 r0 = (X.C64012u4) r0
            boolean r2 = r0.A0M()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/deleteBackupResult:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r12.A04(r3, r14)
            return
        L_0x0188:
            java.lang.String r0 = "accountSwitchingRecoveryManager"
            X.C18070vi.A11(r0)
            throw r3
        L_0x018e:
            java.lang.String r0 = "accountSwitchingRecoveryManager"
            X.C18070vi.A11(r0)     // Catch:{ all -> 0x01b9 }
            goto L_0x01b7
        L_0x0194:
            java.lang.String r0 = "accountSwitchingRecoveryManager"
            X.C18070vi.A11(r0)     // Catch:{ all -> 0x01b9 }
            goto L_0x01b7
        L_0x019a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01b9 }
            goto L_0x01b1
        L_0x019d:
            X.00H r0 = r12.A0H     // Catch:{ all -> 0x01b9 }
            if (r0 == 0) goto L_0x01b2
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01b9 }
            X.2sg r0 = (X.C63202sg) r0     // Catch:{ all -> 0x01b9 }
            r0.A02()     // Catch:{ all -> 0x01b9 }
            java.lang.String r1 = "Could not create backup for accounts file"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01b9 }
            r0.<init>(r1)     // Catch:{ all -> 0x01b9 }
        L_0x01b1:
            throw r0     // Catch:{ all -> 0x01b9 }
        L_0x01b2:
            java.lang.String r0 = "accountSwitchingRecoveryManager"
            X.C18070vi.A11(r0)     // Catch:{ all -> 0x01b9 }
        L_0x01b7:
            r0 = 0
            goto L_0x01b1
        L_0x01b9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01bb }
        L_0x01bb:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x01c0:
            java.lang.String r1 = "Checkpoint file already exists"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01c8:
            java.lang.String r0 = "accountSwitchingRecoveryManager"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountswitching.AccountSwitchingContentProvider.A03(X.BBr, java.lang.String, java.lang.String, X.0vk, boolean):void");
    }

    private final void A04(C62562rb r18, String str) {
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("AccountSwitchingContentProvider/postAccountSwitchingOperations/clearNotificationsForLid=");
        String str4 = str;
        sb.append(str4);
        sb.append(",resetLifecycleFieldsAccount=");
        C62562rb r3 = r18;
        if (r18 != null) {
            str2 = C49842Sd.A00(r3);
        } else {
            str2 = null;
        }
        sb.append(str2);
        Log.i(sb.toString());
        if (!(str == null || str4.length() == 0)) {
            AnonymousClass00H r0 = this.A0O;
            if (r0 != null) {
                ((A6J) r0.get()).A04(str4);
            } else {
                str3 = "inactiveAccountNotificationManagerLazy";
                C18070vi.A11(str3);
                throw null;
            }
        }
        if (r18 != null) {
            C64012u4 r2 = (C64012u4) A0A().get();
            AnonymousClass11P r02 = this.A01;
            if (r02 != null) {
                long A012 = AnonymousClass11P.A01(r02);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("AccountSwitchingDataRepo/resetInactiveAccountLifecycleFields/");
                sb2.append(C49842Sd.A00(r3));
                Log.i(sb2.toString());
                C59692mj A013 = C64012u4.A01(r2);
                C62562rb A022 = C64012u4.A02(A013, r3);
                if (A022 == null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("AccountSwitchingDataRepo/resetInactiveAccountLifecycleFields/account not found: ");
                    sb3.append(C49842Sd.A00(r3));
                    Log.e(sb3.toString());
                    return;
                }
                C64012u4.A07(A013, r2, C62562rb.A00(A022, (String) null, (String) null, (String) null, (String) null, 0, 0, 1839, A012, 0, false));
                return;
            }
            str3 = "time";
            C18070vi.A11(str3);
            throw null;
        }
    }

    public static final void A05(C24801Ls r5) {
        try {
            boolean tryLock = r5.A02.writeLock().tryLock(5, TimeUnit.SECONDS);
            StringBuilder sb = new StringBuilder();
            sb.append("AccountSwitchingContentProvider/disconnect/");
            sb.append(r5.getDatabaseName());
            sb.append(" lock acquired: ");
            sb.append(tryLock);
            Log.i(sb.toString());
        } catch (InterruptedException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccountSwitchingContentProvider/disconnect/");
            sb2.append(r5.getDatabaseName());
            sb2.append(" lock exception");
            Log.e(sb2.toString(), e);
        }
    }

    public final AnonymousClass00H A0A() {
        AnonymousClass00H r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("accountSwitchingDataRepo");
        throw null;
    }

    public final AnonymousClass00H A0B() {
        AnonymousClass00H r0 = this.A0G;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("accountSwitchingFileManager");
        throw null;
    }

    /* JADX WARNING: type inference failed for: r5v12, types: [java.lang.Object, X.4rF] */
    /* JADX WARNING: type inference failed for: r5v15, types: [java.lang.Object, X.4rF] */
    /* JADX WARNING: type inference failed for: r7v30, types: [java.lang.Object, X.4rF] */
    /* JADX WARNING: type inference failed for: r4v17, types: [java.lang.Object, X.4rF] */
    /* JADX WARNING: type inference failed for: r2v271, types: [java.util.concurrent.RejectedExecutionHandler, java.lang.Object] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:159:0x0371 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0118 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0164 */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0379 A[Catch:{ IllegalStateException -> 0x09e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x09b6 A[Catch:{ IllegalStateException -> 0x09e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0181 A[Catch:{ IllegalStateException -> 0x09e9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle call(java.lang.String r24, java.lang.String r25, android.os.Bundle r26) {
        /*
            r23 = this;
            java.lang.String r5 = "AccountSwitchingContentProvider/call/remove account action/lid: "
            java.lang.String r12 = "kill_process"
            java.lang.String r6 = "null cannot be cast to non-null type com.whatsapp.filesystem.UserScopedFileSystemApi"
            java.lang.String r1 = "Required value was null."
            r14 = 0
            r4 = r24
            X.C18070vi.A0d(r4, r14)
            java.lang.String r0 = "AccountSwitchingContentProvider/call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r23
            r0.A09()
            X.11Z r11 = r0.A03     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r11 == 0) goto L_0x09db
            X.00H r2 = r0.A0E     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x09d5
            java.lang.Object r15 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.C18070vi.A0X(r15)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.1cN r15 = (X.C29491cN) r15     // Catch:{ IllegalStateException -> 0x09e9 }
            X.0z4 r10 = r0.A02     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r10 == 0) goto L_0x09ce
            X.10d r2 = r0.A07     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x09c8
            X.10i r9 = r2.A00()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.C18070vi.A0z(r9, r6)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r0.A0I     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x09c2
            java.lang.Object r8 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.C18070vi.A0X(r8)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.10b r8 = (X.AnonymousClass10b) r8     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r7 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.C18070vi.A0X(r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r7 = (X.C64012u4) r7     // Catch:{ IllegalStateException -> 0x09e9 }
            X.0vS r3 = r0.A06     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r3 == 0) goto L_0x09bc
            X.00H r2 = r0.A0B()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.C18070vi.A0X(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.A8T r2 = (X.A8T) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            r17 = r2
            r18 = r10
            r19 = r11
            r20 = r8
            r21 = r3
            r22 = r9
            r16 = r7
            A02(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ IllegalStateException -> 0x09e9 }
            boolean r11 = r4.equals(r12)     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r11 != 0) goto L_0x0208
            r2 = 1
            java.util.concurrent.CountDownLatch r9 = new java.util.concurrent.CountDownLatch     // Catch:{ IllegalStateException -> 0x09e9 }
            r9.<init>(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.1Hc r2 = r0.A00     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x01db
            boolean r3 = r2.A02()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x09e9 }
            r7.<init>()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = "AccountSwitchingContentProvider/disconnect/isXmppConnected: "
            r7.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            r7.append(r3)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = ", isXmppConnecting: "
            r7.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.1Hc r2 = r0.A00     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x01db
            int r3 = r2.A05     // Catch:{ IllegalStateException -> 0x09e9 }
            r2 = 1
            if (r3 == r2) goto L_0x00a4
            r2 = 0
        L_0x00a4:
            r7.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = r7.toString()     // Catch:{ IllegalStateException -> 0x09e9 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.11A r7 = r0.A0B     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r7 == 0) goto L_0x01d7
            r3 = 39
            X.3C0 r2 = new X.3C0     // Catch:{ IllegalStateException -> 0x09e9 }
            r2.<init>(r0, r9, r3)     // Catch:{ IllegalStateException -> 0x09e9 }
            r7.A00(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.1Mn r2 = r0.A09     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x01d2
            r2.A00()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.17v r3 = r0.A08     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r3 == 0) goto L_0x01ce
            r2 = 12
            r8 = 0
            r3.A0F(r14, r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x00d8 }
            r2 = 5
            boolean r2 = r9.await(r2, r7)     // Catch:{ InterruptedException -> 0x00d8 }
            r8 = r2 ^ 1
            goto L_0x00de
        L_0x00d8:
            r3 = move-exception
            java.lang.String r2 = "AccountSwitchingContentProvider/exception while waiting for xmpp disconnect"
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x00de:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.<init>()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = "AccountSwitchingContentProvider/disconnect/xmpp disconnect timed out: "
            r3.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.append(r8)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ IllegalStateException -> 0x09e9 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = "AccountSwitchingContentProvider/disconnect/shutdown waJobManager"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r0.A0U     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x01c9
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.1Mm r2 = (X.C25001Mm) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            X.9nG r9 = r2.A00     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r9 == 0) goto L_0x012f
            boolean r2 = r9.A00     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 != 0) goto L_0x012f
            r2 = 1
            r9.A00 = r2     // Catch:{ IllegalStateException -> 0x09e9 }
            java.util.concurrent.ExecutorService r8 = r9.A03     // Catch:{ IllegalStateException -> 0x09e9 }
            r8.shutdown()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0118 }
            r2 = 5
            r8.awaitTermination(r2, r7)     // Catch:{ InterruptedException -> 0x0118 }
        L_0x0118:
            X.Amf r2 = r9.A05     // Catch:{ IllegalStateException -> 0x09e9 }
            java.util.concurrent.ThreadPoolExecutor r8 = r2.A01     // Catch:{ IllegalStateException -> 0x09e9 }
            r8.shutdown()     // Catch:{ IllegalStateException -> 0x09e9 }
            r3 = 3
            X.AlE r2 = new X.AlE     // Catch:{ IllegalStateException -> 0x09e9 }
            r2.<init>(r3)     // Catch:{ IllegalStateException -> 0x09e9 }
            r8.setRejectedExecutionHandler(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x012f }
            r2 = 5
            r8.awaitTermination(r2, r7)     // Catch:{ InterruptedException -> 0x012f }
        L_0x012f:
            java.lang.String r2 = "AccountSwitchingContentProvider/disconnect/shutdown waJobManager completed"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = "AccountSwitchingContentProvider/disconnect/shutdown worker threads"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.10I r2 = r0.A0C     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x01c4
            X.3DN r2 = new X.3DN     // Catch:{ IllegalStateException -> 0x09e9 }
            r2.<init>()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.10P r7 = X.AnonymousClass10J.A05     // Catch:{ IllegalStateException -> 0x09e9 }
            r7.setRejectedExecutionHandler(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.util.concurrent.ThreadPoolExecutor r10 = X.AnonymousClass10J.A08     // Catch:{ IllegalStateException -> 0x09e9 }
            r10.setRejectedExecutionHandler(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            r7.shutdown()     // Catch:{ IllegalStateException -> 0x09e9 }
            r10.shutdown()     // Catch:{ IllegalStateException -> 0x09e9 }
            r9 = 0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0164 }
            r2 = 1
            boolean r7 = r7.awaitTermination(r2, r8)     // Catch:{ InterruptedException -> 0x0164 }
            if (r7 == 0) goto L_0x0164
            boolean r2 = r10.awaitTermination(r2, r8)     // Catch:{ InterruptedException -> 0x0164 }
            if (r2 == 0) goto L_0x0164
            r9 = 1
        L_0x0164:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.<init>()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = "AccountSwitchingContentProvider/disconnect/shutdown worker threads terminated: "
            r3.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.append(r9)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ IllegalStateException -> 0x09e9 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = "AccountSwitchingContentProvider/disconnect/shutdown asyncCommitManager"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r0.A0J     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x09b6
            java.lang.Object r10 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.1gM r10 = (X.C31931gM) r10     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = "AsyncCommitManager/shutdown"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            r2 = 2
            java.util.concurrent.CountDownLatch r8 = new java.util.concurrent.CountDownLatch     // Catch:{ IllegalStateException -> 0x09e9 }
            r8.<init>(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            r9 = 28
            X.3Bq r2 = new X.3Bq     // Catch:{ IllegalStateException -> 0x09e9 }
            r2.<init>(r8, r9)     // Catch:{ IllegalStateException -> 0x09e9 }
            r7 = 72
            r10.A01(r2, r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            android.os.HandlerThread r3 = r10.A02     // Catch:{ IllegalStateException -> 0x09e9 }
            boolean r2 = r3.isAlive()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x01a9
            r3.quitSafely()     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x01a9:
            X.3Bq r2 = new X.3Bq     // Catch:{ IllegalStateException -> 0x09e9 }
            r2.<init>(r8, r9)     // Catch:{ IllegalStateException -> 0x09e9 }
            r10.A02(r2, r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            android.os.HandlerThread r3 = r10.A03     // Catch:{ IllegalStateException -> 0x09e9 }
            boolean r2 = r3.isAlive()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x01bc
            r3.quitSafely()     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x01bc:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x01e0 }
            r2 = 1
            r8.await(r2, r7)     // Catch:{ InterruptedException -> 0x01e0 }
            goto L_0x01e0
        L_0x01c4:
            java.lang.String r2 = "waWorkers"
            goto L_0x09b8
        L_0x01c9:
            java.lang.String r2 = "waJobManager"
            goto L_0x09b8
        L_0x01ce:
            java.lang.String r2 = "messageHandlerBridge"
            goto L_0x09b8
        L_0x01d2:
            java.lang.String r2 = "sendMethods"
            goto L_0x09b8
        L_0x01d7:
            java.lang.String r2 = "mainThreadHandler"
            goto L_0x09b8
        L_0x01db:
            java.lang.String r2 = "xmppStateManager"
            goto L_0x09b8
        L_0x01e0:
            java.lang.String r2 = "AccountSwitchingContentProvider/disconnect/shutdown asyncCommitManager completed"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r2 = (X.C64012u4) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            boolean r2 = r2.A0L()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x020e
            X.0ve r7 = r0.A05     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r7 == 0) goto L_0x0995
            r3 = 9381(0x24a5, float:1.3146E-41)
            X.0vf r2 = X.C18040vf.A02     // Catch:{ IllegalStateException -> 0x09e9 }
            boolean r2 = X.C18020vd.A05(r2, r7, r3)     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x020e
            java.lang.String r2 = "AccountSwitchingContentProvider/acquireDbLocks/isMultiAccountStorageV2Enabled/not shutting down dbs & LightPreferencesDiskIoHandler"
        L_0x0205:
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x0208:
            int r2 = r4.hashCode()     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x0380
        L_0x020e:
            r2 = 5
            X.1Cd r7 = r0.A04     // Catch:{ InterruptedException -> 0x023b }
            if (r7 == 0) goto L_0x0234
            r7.A06()     // Catch:{ InterruptedException -> 0x023b }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r8 = r7.A04     // Catch:{ InterruptedException -> 0x023b }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x023b }
            boolean r9 = r8.tryLock(r2, r7)     // Catch:{ InterruptedException -> 0x023b }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x023b }
            r8.<init>()     // Catch:{ InterruptedException -> 0x023b }
            java.lang.String r7 = "AccountSwitchingContentProvider/disconnect/messageStoreManager lock acquired: "
            r8.append(r7)     // Catch:{ InterruptedException -> 0x023b }
            r8.append(r9)     // Catch:{ InterruptedException -> 0x023b }
            java.lang.String r7 = r8.toString()     // Catch:{ InterruptedException -> 0x023b }
            com.whatsapp.util.Log.i((java.lang.String) r7)     // Catch:{ InterruptedException -> 0x023b }
            goto L_0x0241
        L_0x0234:
            java.lang.String r7 = "messageStoreManager"
            X.C18070vi.A11(r7)     // Catch:{ InterruptedException -> 0x023b }
            r7 = 0
            throw r7     // Catch:{ InterruptedException -> 0x023b }
        L_0x023b:
            r8 = move-exception
            java.lang.String r7 = "AccountSwitchingContentProvider/disconnect/messageStoreManager lock exception"
            com.whatsapp.util.Log.e(r7, r8)     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x0241:
            X.00H r7 = r0.A0U     // Catch:{ InterruptedException -> 0x027d }
            if (r7 == 0) goto L_0x0275
            java.lang.Object r7 = r7.get()     // Catch:{ InterruptedException -> 0x027d }
            X.1Mm r7 = (X.C25001Mm) r7     // Catch:{ InterruptedException -> 0x027d }
            X.9nG r7 = X.C25001Mm.A00(r7)     // Catch:{ InterruptedException -> 0x027d }
            X.A0C r7 = r7.A07     // Catch:{ InterruptedException -> 0x027d }
            java.util.concurrent.locks.ReentrantReadWriteLock r7 = r7.A02     // Catch:{ InterruptedException -> 0x027d }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r8 = r7.writeLock()     // Catch:{ InterruptedException -> 0x027d }
            X.C18070vi.A0X(r8)     // Catch:{ InterruptedException -> 0x027d }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x027d }
            boolean r9 = r8.tryLock(r2, r7)     // Catch:{ InterruptedException -> 0x027d }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x027d }
            r8.<init>()     // Catch:{ InterruptedException -> 0x027d }
            java.lang.String r7 = "AccountSwitchingContentProvider/disconnect/waJobManagerLockAcquired lock acquired: "
            r8.append(r7)     // Catch:{ InterruptedException -> 0x027d }
            r8.append(r9)     // Catch:{ InterruptedException -> 0x027d }
            java.lang.String r7 = r8.toString()     // Catch:{ InterruptedException -> 0x027d }
            com.whatsapp.util.Log.i((java.lang.String) r7)     // Catch:{ InterruptedException -> 0x027d }
            goto L_0x0283
        L_0x0275:
            java.lang.String r7 = "waJobManager"
            X.C18070vi.A11(r7)     // Catch:{ InterruptedException -> 0x027d }
            r7 = 0
            throw r7     // Catch:{ InterruptedException -> 0x027d }
        L_0x027d:
            r8 = move-exception
            java.lang.String r7 = "AccountSwitchingContentProvider/disconnect/waJobManagerLockAcquired lock exception"
            com.whatsapp.util.Log.e(r7, r8)     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x0283:
            X.00H r7 = r0.A0T     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r7 == 0) goto L_0x09b2
            java.lang.Object r7 = r7.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.C18070vi.A0X(r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.1Ls r7 = (X.C24801Ls) r7     // Catch:{ IllegalStateException -> 0x09e9 }
            A05(r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r7 = r0.A0Q     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r7 == 0) goto L_0x09af
            java.lang.Object r7 = r7.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.C18070vi.A0X(r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.1Ls r7 = (X.C24801Ls) r7     // Catch:{ IllegalStateException -> 0x09e9 }
            A05(r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r7 = r0.A0K     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r7 == 0) goto L_0x09ac
            java.lang.Object r7 = r7.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.C18070vi.A0X(r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.1Ls r7 = (X.C24801Ls) r7     // Catch:{ IllegalStateException -> 0x09e9 }
            A05(r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r7 = r0.A0P     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r7 == 0) goto L_0x09a9
            java.lang.Object r7 = r7.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.C18070vi.A0X(r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.1Ls r7 = (X.C24801Ls) r7     // Catch:{ IllegalStateException -> 0x09e9 }
            A05(r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r7 = r0.A0S     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r7 == 0) goto L_0x09a5
            java.lang.Object r7 = r7.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.C18070vi.A0X(r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.1Ls r7 = (X.C24801Ls) r7     // Catch:{ IllegalStateException -> 0x09e9 }
            A05(r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.1Lt r7 = r0.A0D     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r7 == 0) goto L_0x09a1
            A05(r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r7 = r0.A0L     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r7 == 0) goto L_0x099e
            java.lang.Object r7 = r7.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.1Nb r7 = (X.AnonymousClass1Nb) r7     // Catch:{ IllegalStateException -> 0x09e9 }
            X.1tH r7 = r7.A0U()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.C18070vi.A0X(r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            A05(r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r7 = r0.A0M     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r7 == 0) goto L_0x099b
            java.lang.Object r7 = r7.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.9or r7 = (X.C192719or) r7     // Catch:{ IllegalStateException -> 0x09e9 }
            X.8ov r7 = r7.A00()     // Catch:{ IllegalStateException -> 0x09e9 }
            A05(r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r7 = r0.A0R     // Catch:{ InterruptedException -> 0x033d }
            if (r7 == 0) goto L_0x0333
            java.lang.Object r9 = r7.get()     // Catch:{ InterruptedException -> 0x033d }
            X.1KH r9 = (X.AnonymousClass1KH) r9     // Catch:{ InterruptedException -> 0x033d }
            monitor-enter(r9)     // Catch:{ InterruptedException -> 0x033d }
            X.2Di r7 = r9.A00     // Catch:{ all -> 0x033a }
            if (r7 != 0) goto L_0x0311
            monitor-exit(r9)     // Catch:{ InterruptedException -> 0x033d }
            r7 = 0
            goto L_0x031e
        L_0x0311:
            java.util.concurrent.locks.ReentrantReadWriteLock r7 = r7.A02     // Catch:{ all -> 0x033a }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r8 = r7.writeLock()     // Catch:{ all -> 0x033a }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x033a }
            boolean r7 = r8.tryLock(r2, r7)     // Catch:{ all -> 0x033a }
            monitor-exit(r9)     // Catch:{ InterruptedException -> 0x033d }
        L_0x031e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x033d }
            r3.<init>()     // Catch:{ InterruptedException -> 0x033d }
            java.lang.String r2 = "AccountSwitchingContentProvider/disconnect/paymentStore lock acquired: "
            r3.append(r2)     // Catch:{ InterruptedException -> 0x033d }
            r3.append(r7)     // Catch:{ InterruptedException -> 0x033d }
            java.lang.String r2 = r3.toString()     // Catch:{ InterruptedException -> 0x033d }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ InterruptedException -> 0x033d }
            goto L_0x0343
        L_0x0333:
            java.lang.String r2 = "paymentStore"
            X.C18070vi.A11(r2)     // Catch:{ InterruptedException -> 0x033d }
            r2 = 0
            goto L_0x033c
        L_0x033a:
            r2 = move-exception
            monitor-exit(r9)     // Catch:{ InterruptedException -> 0x033d }
        L_0x033c:
            throw r2     // Catch:{ InterruptedException -> 0x033d }
        L_0x033d:
            r3 = move-exception
            java.lang.String r2 = "AccountSwitchingContentProvider/disconnect/paymentStore lock exception"
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x0343:
            java.lang.String r2 = "AccountSwitchingContentProvider/disconnect/shutdown light shared pref writes"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.10X r9 = r0.A0A     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r9 == 0) goto L_0x0998
            boolean r2 = r9.A04     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 != 0) goto L_0x037c
            r2 = 1
            r9.A04 = r2     // Catch:{ IllegalStateException -> 0x09e9 }
            java.util.concurrent.CountDownLatch r8 = new java.util.concurrent.CountDownLatch     // Catch:{ IllegalStateException -> 0x09e9 }
            r8.<init>(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            android.os.Handler r10 = r9.A00     // Catch:{ IllegalStateException -> 0x09e9 }
            r2 = 28
            X.3Bq r7 = new X.3Bq     // Catch:{ IllegalStateException -> 0x09e9 }
            r7.<init>(r8, r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            r2 = 100
            r10.postDelayed(r7, r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0371 }
            r2 = 1
            long r2 = r7.toMillis(r2)     // Catch:{ InterruptedException -> 0x0371 }
            r8.await(r2, r7)     // Catch:{ InterruptedException -> 0x0371 }
        L_0x0371:
            android.os.HandlerThread r3 = r9.A01     // Catch:{ IllegalStateException -> 0x09e9 }
            boolean r2 = r3.isAlive()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x037c
            r3.quitSafely()     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x037c:
            java.lang.String r2 = "AccountSwitchingContentProvider/disconnect/shutdown light shared pref completed"
            goto L_0x0205
        L_0x0380:
            java.lang.String r3 = "switch_to_account_lid"
            r10 = 0
            r8 = r26
            switch(r2) {
                case -478190222: goto L_0x0399;
                case -274828254: goto L_0x04b5;
                case 141981839: goto L_0x05f5;
                case 318873029: goto L_0x06a1;
                case 1594147470: goto L_0x090a;
                default: goto L_0x0389;
            }
        L_0x0389:
            java.lang.String r0 = "AccountSwitchingContentProvider/call/kill process"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.util.Log.flush()
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            return r10
        L_0x0399:
            java.lang.String r2 = "remove_account"
            boolean r2 = r4.equals(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x0389
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r2 = (X.C64012u4) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            boolean r2 = r2.A0L()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 != 0) goto L_0x0751
            java.lang.String r2 = "AccountSwitchingContentProvider/call/remove account action"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.4rF r7 = new X.4rF     // Catch:{ IllegalStateException -> 0x09e9 }
            r7.<init>()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r2 = (X.C64012u4) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2rb r2 = r2.A0B()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x03d0
            java.lang.String r2 = r2.A07     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x03cd:
            r7.element = r2     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x03d2
        L_0x03d0:
            r2 = 0
            goto L_0x03cd
        L_0x03d2:
            if (r2 == 0) goto L_0x0931
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.<init>()     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.append(r5)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = X.C60322np.A01(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ IllegalStateException -> 0x09e9 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.4rF r4 = new X.4rF     // Catch:{ IllegalStateException -> 0x09e9 }
            r4.<init>()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r26 == 0) goto L_0x03f2
            goto L_0x03f4
        L_0x03f2:
            r2 = r10
            goto L_0x03fa
        L_0x03f4:
            java.lang.String r2 = "remove_account_lid"
            java.lang.String r2 = r8.getString(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x03fa:
            r4.element = r2     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 != 0) goto L_0x0412
            X.00H r2 = r0.A0E     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x092a
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.1cN r2 = (X.C29491cN) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2rb r2 = r2.A03()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x0923
            java.lang.String r2 = r2.A07     // Catch:{ IllegalStateException -> 0x09e9 }
            r4.element = r2     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x0412:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.<init>()     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.append(r5)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = X.C60322np.A01(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ IllegalStateException -> 0x09e9 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r3 = r7.element     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r4.element     // Catch:{ IllegalStateException -> 0x09e9 }
            boolean r2 = X.C18070vi.A18(r3, r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x0438
            java.lang.String r2 = r0.A01()     // Catch:{ IllegalStateException -> 0x09e9 }
            r7.element = r2     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x0438:
            X.00H r2 = r0.A0B()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r8 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.A8T r8 = (X.A8T) r8     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r9 = r7.element     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r5 = r4.element     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IllegalStateException -> 0x09e9 }
            X.C18070vi.A0d(r9, r14)     // Catch:{ IllegalStateException -> 0x09e9 }
            r2 = 1
            X.C18070vi.A0d(r5, r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.<init>()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = "AccountSwitchingFileManager/removeAndSwitchAccount/active:"
            r3.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = X.C60322np.A01(r9)     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = "/removeLid:"
            r3.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = X.C60322np.A01(r5)     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ IllegalStateException -> 0x09e9 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.ALx r2 = r8.A08(r9, r5)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.ALw r3 = new X.ALw     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.<init>(r8, r2, r5)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.3Hx r2 = new X.3Hx     // Catch:{ IllegalStateException -> 0x09e9 }
            r2.<init>(r0, r7, r4)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r11 = ""
            r8 = r0
            r9 = r3
            r12 = r2
            r13 = r14
            r8.A03(r9, r10, r11, r12, r13)     // Catch:{ IllegalStateException -> 0x09e9 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalStateException -> 0x09e9 }
            r2 = 26
            if (r3 < r2) goto L_0x0389
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r2 = (X.C64012u4) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            java.util.List r2 = r2.A0F()     // Catch:{ IllegalStateException -> 0x09e9 }
            boolean r2 = r2.isEmpty()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x0389
            X.00H r2 = r0.A0N     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x091d
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2sq r2 = (X.C63302sq) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            r2.A02()     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x0389
        L_0x04b5:
            java.lang.String r2 = "switch_account"
            boolean r2 = r4.equals(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x0389
            X.00H r2 = r0.A0E     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x095b
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.1cN r2 = (X.C29491cN) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2rb r4 = r2.A03()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r4 == 0) goto L_0x0954
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r2 = (X.C64012u4) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            boolean r2 = r2.A0L()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x058d
            java.lang.String r2 = "AccountSwitchingContentProvider/call/switch account action/multi-account storage v2 enabled"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r26 == 0) goto L_0x04e6
            goto L_0x04e9
        L_0x04e6:
            r3 = r10
            r5 = r10
            goto L_0x04f4
        L_0x04e9:
            java.lang.String r3 = r8.getString(r3)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = "switch_to_account_dir_id"
            java.lang.String r5 = r8.getString(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x04f4:
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r2 = (X.C64012u4) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            boolean r2 = r2.A0K()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x0507
            if (r5 == 0) goto L_0x0938
            goto L_0x0576
        L_0x0507:
            if (r3 == 0) goto L_0x0946
            java.lang.String r2 = "AccountSwitchingContentProvider/call/switch account action/starting migration process"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r2 = (X.C64012u4) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            java.util.List r2 = r2.A0F()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x0520:
            boolean r2 = r5.hasNext()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x0538
            java.lang.Object r7 = r5.next()     // Catch:{ IllegalStateException -> 0x09e9 }
            r2 = r7
            X.2rb r2 = (X.C62562rb) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = r2.A07     // Catch:{ IllegalStateException -> 0x09e9 }
            boolean r2 = X.C18070vi.A18(r2, r3)     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x0520
        L_0x0535:
            X.2rb r7 = (X.C62562rb) r7     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x053a
        L_0x0538:
            r7 = 0
            goto L_0x0535
        L_0x053a:
            if (r7 == 0) goto L_0x093f
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r2 = (X.C64012u4) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r5 = r2.A0E()     // Catch:{ IllegalStateException -> 0x09e9 }
            r15 = 2046(0x7fe, float:2.867E-42)
            r16 = 0
            r12 = r10
            r20 = r14
            r8 = r7
            r9 = r5
            r11 = r10
            r13 = r14
            r18 = r16
            X.2rb r7 = X.C62562rb.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r0.A0B()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.A8T r2 = (X.A8T) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            X.ALx r9 = r2.A07(r3, r5)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.3Hv r2 = new X.3Hv     // Catch:{ IllegalStateException -> 0x09e9 }
            r2.<init>(r0, r4, r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            r13 = 1
            r8 = r0
            r11 = r5
            r12 = r2
            r8.A03(r9, r10, r11, r12, r13)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x0588
        L_0x0576:
            java.lang.String r2 = "AccountSwitchingContentProvider/call/switch account action/using migrated storage"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r2 = (X.C64012u4) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            r2.A0H(r5)     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x0588:
            r0.A04(r4, r3)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x0389
        L_0x058d:
            java.lang.String r2 = "AccountSwitchingContentProvider/call/switch account action"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.4rF r5 = new X.4rF     // Catch:{ IllegalStateException -> 0x09e9 }
            r5.<init>()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r26 == 0) goto L_0x059a
            goto L_0x059c
        L_0x059a:
            r7 = r10
            goto L_0x05a0
        L_0x059c:
            java.lang.String r7 = r8.getString(r3)     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x05a0:
            r5.element = r7     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r7 == 0) goto L_0x094d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.<init>()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = "AccountSwitchingContentProvider/call/switch account action/lid: "
            r3.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = X.C60322np.A01(r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ IllegalStateException -> 0x09e9 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r5.element     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r7 = r4.A07     // Catch:{ IllegalStateException -> 0x09e9 }
            boolean r2 = X.C18070vi.A18(r2, r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x05cc
            java.lang.String r2 = r0.A01()     // Catch:{ IllegalStateException -> 0x09e9 }
            r5.element = r2     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x05cc:
            X.00H r2 = r0.A0B()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r3 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.A8T r3 = (X.A8T) r3     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r5.element     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            X.ALx r16 = r3.A08(r2, r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r3 = r5.element     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IllegalStateException -> 0x09e9 }
            X.3Hw r2 = new X.3Hw     // Catch:{ IllegalStateException -> 0x09e9 }
            r2.<init>(r0, r4, r5)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r18 = ""
            r15 = r0
            r17 = r3
            r19 = r2
            r20 = r14
            r15.A03(r16, r17, r18, r19, r20)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x0389
        L_0x05f5:
            java.lang.String r2 = "add_account"
            boolean r2 = r4.equals(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x0389
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r2 = (X.C64012u4) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            boolean r2 = r2.A0L()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x0653
            java.lang.String r2 = "AccountSwitchingContentProvider/call/add new account action/multi-account storage v2 enabled"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r0.A0E     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x0969
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.1cN r2 = (X.C29491cN) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2rb r9 = r2.A03()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r9 == 0) goto L_0x0962
            r16 = 1023(0x3ff, float:1.434E-42)
            r17 = 0
            r21 = 1
            r12 = r10
            r13 = r10
            r11 = r10
            r15 = r14
            r19 = r17
            X.2rb r4 = X.C62562rb.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r21)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r2 = (X.C64012u4) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r3 = r2.A0E()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.3Hu r2 = new X.3Hu     // Catch:{ IllegalStateException -> 0x09e9 }
            r2.<init>(r0, r4, r3)     // Catch:{ IllegalStateException -> 0x09e9 }
            r9 = r10
            r8 = r0
            r11 = r3
            r12 = r2
            r13 = r21
            r8.A03(r9, r10, r11, r12, r13)     // Catch:{ IllegalStateException -> 0x09e9 }
            r0.A04(r4, r10)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x0389
        L_0x0653:
            java.lang.String r2 = "AccountSwitchingContentProvider/call/add new account action"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r0.A0E     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x0975
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.1cN r2 = (X.C29491cN) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2rb r7 = r2.A03()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r7 == 0) goto L_0x096f
            X.00H r2 = r0.A0B()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r5 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.A8T r5 = (X.A8T) r5     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r4 = r7.A07     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.<init>()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = "AccountSwitchingFileManager/prepForAddingNewAccount/"
            r3.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = X.C60322np.A01(r4)     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ IllegalStateException -> 0x09e9 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.ALv r3 = new X.ALv     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.<init>(r5, r4, r14)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.3Hk r2 = new X.3Hk     // Catch:{ IllegalStateException -> 0x09e9 }
            r2.<init>(r0, r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r11 = ""
            r8 = r0
            r9 = r3
            r12 = r2
            r13 = r14
            r8.A03(r9, r10, r11, r12, r13)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x0389
        L_0x06a1:
            java.lang.String r2 = "abandon_add_account"
            boolean r2 = r4.equals(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x0389
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r2 = (X.C64012u4) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            boolean r2 = r2.A0L()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 != 0) goto L_0x0751
            java.lang.String r2 = "AccountSwitchingContentProvider/call/abandon add account action"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.4rF r5 = new X.4rF     // Catch:{ IllegalStateException -> 0x09e9 }
            r5.<init>()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r26 == 0) goto L_0x06c6
            goto L_0x06c8
        L_0x06c6:
            r4 = r10
            goto L_0x06cc
        L_0x06c8:
            java.lang.String r4 = r8.getString(r3)     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x06cc:
            r5.element = r4     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r4 == 0) goto L_0x06d6
            int r2 = r4.length()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 != 0) goto L_0x06f1
        L_0x06d6:
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r2 = (X.C64012u4) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2rb r2 = r2.A0B()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x06eb
            java.lang.String r4 = r2.A07     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x06e8:
            r5.element = r4     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x06ed
        L_0x06eb:
            r4 = 0
            goto L_0x06e8
        L_0x06ed:
            if (r4 != 0) goto L_0x06f1
            goto L_0x09e3
        L_0x06f1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.<init>()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = "AccountSwitchingContentProvider/call/abandon add account action/restore lid: "
            r3.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = X.C60322np.A01(r4)     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ IllegalStateException -> 0x09e9 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r0.A0B()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r8 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.A8T r8 = (X.A8T) r8     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r7 = r5.element     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IllegalStateException -> 0x09e9 }
            X.C18070vi.A0d(r7, r14)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.<init>()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = "AccountSwitchingFileManager/restoreAccount/"
            r3.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = X.C60322np.A01(r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ IllegalStateException -> 0x09e9 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            r2 = 1
            X.ALv r4 = new X.ALv     // Catch:{ IllegalStateException -> 0x09e9 }
            r4.<init>(r8, r7, r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r3 = r5.element     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IllegalStateException -> 0x09e9 }
            X.3Hl r2 = new X.3Hl     // Catch:{ IllegalStateException -> 0x09e9 }
            r2.<init>(r0, r5)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r18 = ""
            r15 = r0
            r16 = r4
            r17 = r3
            r19 = r2
            r20 = r14
            r15.A03(r16, r17, r18, r19, r20)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x0389
        L_0x0751:
            X.00H r2 = r0.A0E     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x098f
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.1cN r2 = (X.C29491cN) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2rb r2 = r2.A03()     // Catch:{ IllegalStateException -> 0x09e9 }
            r7 = 0
            if (r2 == 0) goto L_0x0791
            java.lang.String r4 = r2.A07     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x0764:
            java.lang.String r2 = "AccountSwitchingContentProvider/call/remove account action/multi-account storage v2 enabled"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r2 = (X.C64012u4) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            boolean r2 = r2.A0K()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x0885
            java.lang.String r2 = "AccountSwitchingContentProvider/call/remove account action/using migrated storage"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r2 = (X.C64012u4) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2rb r2 = r2.A0B()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x0795
            java.lang.String r5 = r2.A05     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x0793
        L_0x0791:
            r4 = r10
            goto L_0x0764
        L_0x0793:
            if (r5 != 0) goto L_0x0797
        L_0x0795:
            java.lang.String r5 = ""
        L_0x0797:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.<init>()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = "AccountSwitchingContentProvider/call/remove account action/make active dirId: "
            r3.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.append(r5)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ IllegalStateException -> 0x09e9 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r0.A0I     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x0983
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.10b r2 = (X.AnonymousClass10b) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r7 = r2.A00()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.<init>()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = "AccountSwitchingContentProvider/call/remove account action/remove dirId: "
            r3.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.append(r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ IllegalStateException -> 0x09e9 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r2 = (X.C64012u4) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2rb r8 = r2.A0C(r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r2 = (X.C64012u4) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2rb r2 = r2.A0C(r5)     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x0801
            java.lang.String r3 = r2.A07     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x07ed:
            X.3Hy r2 = new X.3Hy     // Catch:{ IllegalStateException -> 0x09e9 }
            r2.<init>(r0, r7, r5)     // Catch:{ IllegalStateException -> 0x09e9 }
            r20 = 1
            r15 = r0
            r16 = r10
            r17 = r3
            r18 = r5
            r19 = r2
            r15.A03(r16, r17, r18, r19, r20)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x0803
        L_0x0801:
            r3 = r10
            goto L_0x07ed
        L_0x0803:
            if (r7 == 0) goto L_0x086d
            int r5 = r7.length()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r5 == 0) goto L_0x086d
            X.00H r2 = r0.A0B()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r8 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.A8T r8 = (X.A8T) r8     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.<init>()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = "AccountSwitchingFileManager/deleteSecondaryAccountDirectory/dirId: "
            r3.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.append(r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ IllegalStateException -> 0x09e9 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r5 <= 0) goto L_0x097b
            X.00H r2 = r8.A07     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.1L7 r2 = (X.AnonymousClass1L7) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r2.A02     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r5 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.io.File r5 = (java.io.File) r5     // Catch:{ IllegalStateException -> 0x09e9 }
            X.C18070vi.A0X(r5)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.<init>()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = "AccountSwitchingFileManager/deleteSecondaryAccountDirectory/externalDir: "
            r3.append(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.append(r5)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ IllegalStateException -> 0x09e9 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.C21721ArX.A05(r5)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.0vl r2 = r8.A08     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r5 = r2.getValue()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = "accounts"
            java.io.File r3 = new java.io.File     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.<init>(r5, r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.io.File r2 = new java.io.File     // Catch:{ IllegalStateException -> 0x09e9 }
            r2.<init>(r3, r7)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.C21721ArX.A05(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x08dd
        L_0x086d:
            X.00H r2 = r0.A0B()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r3 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.A8T r3 = (X.A8T) r3     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r8 == 0) goto L_0x0883
            boolean r2 = r8.A09     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x087f:
            r3.A0E(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x08dd
        L_0x0883:
            r2 = r10
            goto L_0x087f
        L_0x0885:
            java.lang.String r2 = "AccountSwitchingContentProvider/call/remove account action/starting migration process"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r2 = (X.C64012u4) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2rb r7 = r2.A0B()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r7 == 0) goto L_0x0989
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r2 = (X.C64012u4) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r5 = r2.A0E()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r0.A0B()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.A8T r2 = (X.A8T) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r3 = r7.A07     // Catch:{ IllegalStateException -> 0x09e9 }
            X.ALx r16 = r2.A07(r3, r5)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.3Hz r2 = new X.3Hz     // Catch:{ IllegalStateException -> 0x09e9 }
            r2.<init>(r0, r7, r5)     // Catch:{ IllegalStateException -> 0x09e9 }
            r20 = 1
            r17 = r3
            r18 = r5
            r19 = r2
            r15 = r0
            r15.A03(r16, r17, r18, r19, r20)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.00H r2 = r0.A0B()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r3 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.C18070vi.A0X(r3)     // Catch:{ IllegalStateException -> 0x09e9 }
            X.A8T r3 = (X.A8T) r3     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r14)     // Catch:{ IllegalStateException -> 0x09e9 }
            r3.A0E(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x08dd:
            if (r4 == 0) goto L_0x0389
            int r2 = r4.length()     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x0389
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r2 = (X.C64012u4) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2mj r2 = X.C64012u4.A01(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.String r2 = r2.A01     // Catch:{ IllegalStateException -> 0x09e9 }
            boolean r2 = X.C18070vi.A18(r2, r4)     // Catch:{ IllegalStateException -> 0x09e9 }
            if (r2 == 0) goto L_0x0389
            X.00H r2 = r0.A0A()     // Catch:{ IllegalStateException -> 0x09e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x09e9 }
            X.2u4 r2 = (X.C64012u4) r2     // Catch:{ IllegalStateException -> 0x09e9 }
            r2.A0I(r10)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x0389
        L_0x090a:
            if (r11 == 0) goto L_0x0389
            java.lang.String r2 = "AccountSwitchingContentProvider/call/kill process action"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            com.whatsapp.util.Log.flush()     // Catch:{ IllegalStateException -> 0x09e9 }
            int r2 = android.os.Process.myPid()     // Catch:{ IllegalStateException -> 0x09e9 }
            android.os.Process.killProcess(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x0389
        L_0x091d:
            java.lang.String r2 = "inactiveAccountNotification"
            X.C18070vi.A11(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            throw r10     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x0923:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x09e9 }
            r7.<init>(r1)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e8
        L_0x092a:
            java.lang.String r2 = "accountSwitcher"
            X.C18070vi.A11(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e1
        L_0x0931:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x09e9 }
            r7.<init>(r1)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e8
        L_0x0938:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x09e9 }
            r7.<init>(r1)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e8
        L_0x093f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x09e9 }
            r7.<init>(r1)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e8
        L_0x0946:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x09e9 }
            r7.<init>(r1)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e8
        L_0x094d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x09e9 }
            r7.<init>(r1)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e8
        L_0x0954:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x09e9 }
            r7.<init>(r1)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e8
        L_0x095b:
            java.lang.String r2 = "accountSwitcher"
            X.C18070vi.A11(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e1
        L_0x0962:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x09e9 }
            r7.<init>(r1)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e8
        L_0x0969:
            java.lang.String r2 = "accountSwitcher"
            X.C18070vi.A11(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e1
        L_0x096f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x09e9 }
            r7.<init>(r1)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e8
        L_0x0975:
            java.lang.String r2 = "accountSwitcher"
            X.C18070vi.A11(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e1
        L_0x097b:
            java.lang.String r2 = "Failed requirement."
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ IllegalStateException -> 0x09e9 }
            r7.<init>(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e8
        L_0x0983:
            java.lang.String r2 = "activeAccountFileHandler"
            X.C18070vi.A11(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e8
        L_0x0989:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x09e9 }
            r7.<init>(r1)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e8
        L_0x098f:
            java.lang.String r2 = "accountSwitcher"
            X.C18070vi.A11(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e1
        L_0x0995:
            java.lang.String r2 = "abProps"
            goto L_0x09b8
        L_0x0998:
            java.lang.String r2 = "lightPreferencesDiskIoHandler"
            goto L_0x09b8
        L_0x099b:
            java.lang.String r2 = "commerceDbManager"
            goto L_0x09b8
        L_0x099e:
            java.lang.String r2 = "chatSettingsStore"
            goto L_0x09b8
        L_0x09a1:
            java.lang.String r2 = "waDatabaseHelper"
            goto L_0x09b8
        L_0x09a5:
            java.lang.String r2 = "stickersDbHelper"
            goto L_0x09b8
        L_0x09a9:
            java.lang.String r2 = "locationDbHelper"
            goto L_0x09b8
        L_0x09ac:
            java.lang.String r2 = "axolotlDbHelper"
            goto L_0x09b8
        L_0x09af:
            java.lang.String r2 = "mediaDbHelper"
            goto L_0x09b8
        L_0x09b2:
            java.lang.String r2 = "syncDbHelper"
            goto L_0x09b8
        L_0x09b6:
            java.lang.String r2 = "asyncCommitManager"
        L_0x09b8:
            X.C18070vi.A11(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e1
        L_0x09bc:
            java.lang.String r2 = "deviceScopedFileSystemApi"
            X.C18070vi.A11(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e1
        L_0x09c2:
            java.lang.String r2 = "activeAccountFileHandler"
            X.C18070vi.A11(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e1
        L_0x09c8:
            java.lang.String r2 = "multiAccountFileSystemManager"
            X.C18070vi.A11(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e1
        L_0x09ce:
            java.lang.String r2 = "waSharedPreferences"
            X.C18070vi.A11(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e1
        L_0x09d5:
            java.lang.String r2 = "accountSwitcher"
            X.C18070vi.A11(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
            goto L_0x09e1
        L_0x09db:
            java.lang.String r2 = "storageUtils"
            X.C18070vi.A11(r2)     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x09e1:
            r7 = 0
            goto L_0x09e8
        L_0x09e3:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x09e9 }
            r7.<init>(r1)     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x09e8:
            throw r7     // Catch:{ IllegalStateException -> 0x09e9 }
        L_0x09e9:
            r3 = move-exception
            java.lang.String r2 = "AccountSwitchingContentProvider/call/exception when handling account switching"
            com.whatsapp.util.Log.e(r2, r3)
            java.lang.String r2 = "AccountSwitchingContentProvider/recoverFromAccountSwitchingFailure"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.00H r2 = r0.A0H
            if (r2 == 0) goto L_0x0a74
            java.lang.Object r2 = r2.get()
            X.2sg r2 = (X.C63202sg) r2
            r2.A03(r14)
            X.11Z r8 = r0.A03
            if (r8 == 0) goto L_0x0a70
            X.00H r2 = r0.A0E
            if (r2 == 0) goto L_0x0a6d
            java.lang.Object r4 = r2.get()
            X.C18070vi.A0X(r4)
            X.1cN r4 = (X.C29491cN) r4
            X.0z4 r7 = r0.A02
            if (r7 == 0) goto L_0x0a69
            X.10d r2 = r0.A07
            if (r2 == 0) goto L_0x0a66
            X.10i r11 = r2.A00()
            X.C18070vi.A0z(r11, r6)
            X.00H r2 = r0.A0I
            if (r2 == 0) goto L_0x0a63
            java.lang.Object r9 = r2.get()
            X.C18070vi.A0X(r9)
            X.10b r9 = (X.AnonymousClass10b) r9
            X.00H r2 = r0.A0A()
            java.lang.Object r5 = r2.get()
            X.C18070vi.A0X(r5)
            X.2u4 r5 = (X.C64012u4) r5
            X.0vS r10 = r0.A06
            if (r10 == 0) goto L_0x0a77
            X.00H r2 = r0.A0B()
            java.lang.Object r6 = r2.get()
            X.C18070vi.A0X(r6)
            X.A8T r6 = (X.A8T) r6
            A02(r4, r5, r6, r7, r8, r9, r10, r11)
            android.content.Context r2 = r0.getContext()
            if (r2 != 0) goto L_0x0a5b
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r1)
            throw r3
        L_0x0a5b:
            X.0vS r0 = r0.A06
            if (r0 == 0) goto L_0x0a77
            X.AnonymousClass197.A00(r2, r0, r3)
            throw r3
        L_0x0a63:
            java.lang.String r0 = "activeAccountFileHandler"
            goto L_0x0a79
        L_0x0a66:
            java.lang.String r0 = "multiAccountFileSystemManager"
            goto L_0x0a79
        L_0x0a69:
            java.lang.String r0 = "waSharedPreferences"
            goto L_0x0a79
        L_0x0a6d:
            java.lang.String r0 = "accountSwitcher"
            goto L_0x0a79
        L_0x0a70:
            java.lang.String r0 = "storageUtils"
            goto L_0x0a79
        L_0x0a74:
            java.lang.String r0 = "accountSwitchingRecoveryManager"
            goto L_0x0a79
        L_0x0a77:
            java.lang.String r0 = "deviceScopedFileSystemApi"
        L_0x0a79:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountswitching.AccountSwitchingContentProvider.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public String getType(Uri uri) {
        throw new UnsupportedOperationException();
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException();
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
