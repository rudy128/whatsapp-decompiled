package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import android.os.ConditionVariable;
import android.os.Environment;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1oU  reason: invalid class name and case insensitive filesystem */
public class C36801oU implements C36791oT, AnonymousClass11J {
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public WifiManager.WifiLock A03;
    public boolean A04 = false;
    public boolean A05 = false;
    public boolean A06 = false;
    public boolean A07 = false;
    public boolean A08 = false;
    public boolean A09 = false;
    public final ConditionVariable A0A = new ConditionVariable(false);
    public final ConditionVariable A0B = new ConditionVariable(false);
    public final ConditionVariable A0C = new ConditionVariable(false);
    public final ConditionVariable A0D = new ConditionVariable(false);
    public final ConditionVariable A0E = new ConditionVariable(false);
    public final ConditionVariable A0F = new ConditionVariable(false);
    public final ConditionVariable A0G = new ConditionVariable(false);
    public final C23651Hc A0H;
    public final C36821oW A0I = new C36831oX(this);
    public final AnonymousClass118 A0J;
    public final C19830z4 A0K;
    public final AnonymousClass10I A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AtomicBoolean A0P = new AtomicBoolean(false);
    public final AtomicBoolean A0Q = new AtomicBoolean(false);
    public final AtomicBoolean A0R = new AtomicBoolean(false);
    public final AtomicBoolean A0S = new AtomicBoolean(false);
    public final AtomicBoolean A0T = new AtomicBoolean(false);
    public final AtomicBoolean A0U = new AtomicBoolean(false);
    public final AtomicBoolean A0V = new AtomicBoolean(false);
    public final AtomicBoolean A0W = new AtomicBoolean(false);
    public final AtomicBoolean A0X = new AtomicBoolean(false);
    public final AnonymousClass11S A0Y;
    public final AnonymousClass194 A0Z;
    public final AnonymousClass11E A0a;
    public final AnonymousClass11C A0b;
    public final AnonymousClass11P A0c;
    public final AnonymousClass1Cd A0d;
    public final C18010vc A0e;
    public final AnonymousClass1CM A0f;
    public final AnonymousClass00H A0g;
    public final AnonymousClass00H A0h;
    public final AnonymousClass00H A0i;
    public final AnonymousClass00H A0j;
    public final ThreadLocal A0k = new ThreadLocal();

    /* JADX WARNING: type inference failed for: r13v9, types: [X.1Hg] */
    /* JADX WARNING: type inference failed for: r24v5, types: [X.35J] */
    /* JADX WARNING: type inference failed for: r24v6, types: [X.35L] */
    /* JADX WARNING: type inference failed for: r13v11 */
    /* JADX WARNING: type inference failed for: r24v7, types: [X.35L] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0194  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C36801oU r20, X.A7X r21, long r22, long r24, long r26, long r28) {
        /*
            r4 = 0
            r7 = r21
            if (r21 == 0) goto L_0x024f
            r5 = r20
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0U
            boolean r12 = r0.get()
            boolean r6 = r5.A06
            X.1Hc r0 = r5.A0H
            boolean r0 = r0.A02()
            r3 = 1
            if (r0 != 0) goto L_0x0028
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0P
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x024c
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0Q
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x024c
        L_0x0028:
            r11 = 1
        L_0x0029:
            java.util.concurrent.atomic.AtomicBoolean r8 = r5.A0P
            boolean r0 = r8.get()
            if (r0 != 0) goto L_0x0242
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0Q
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0242
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0R
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0049
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0V
            boolean r12 = r0.get()
            boolean r6 = r5.A07
        L_0x0049:
            if (r12 == 0) goto L_0x0066
            if (r6 == 0) goto L_0x0066
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x0066
            if (r11 == 0) goto L_0x0066
        L_0x0053:
            X.00H r0 = r5.A0j
            java.lang.Object r1 = r0.get()
            X.1O1 r1 = (X.AnonymousClass1O1) r1
            X.00H r0 = X.C20134A8u.A00
            r7.A09(r3)
            java.lang.String r0 = "gdrive_backup"
            r1.A01(r0, r3)
            return r3
        L_0x0066:
            android.net.wifi.WifiManager$WifiLock r0 = r5.A03
            if (r0 == 0) goto L_0x0238
            boolean r0 = r0.isHeld()
            if (r0 == 0) goto L_0x0238
            r10 = 1
            r5.A09()
        L_0x0074:
            r2 = 2
            r14 = r22
            r17 = r24
            r22 = r26
            r19 = r28
            if (r12 != 0) goto L_0x00bd
            X.00H r0 = r5.A0g
            java.lang.Object r0 = r0.get()
            X.1NP r0 = (X.AnonymousClass1NP) r0
            int r0 = r0.A05()
            if (r0 == r3) goto L_0x020e
            if (r0 != r2) goto L_0x00bd
            int r1 = r5.A02
            X.00H r0 = r5.A0h
            java.lang.Object r0 = r0.get()
            X.10T r0 = (X.AnonymousClass10T) r0
            if (r1 != 0) goto L_0x0205
            X.35L r13 = new X.35L
            r24 = r13
            r25 = r14
            r27 = r3
            r28 = r17
            r24.<init>(r25, r27, r28)
        L_0x00a8:
            r0.notifyAllObservers(r13)
            X.00H r0 = r5.A0j
            java.lang.Object r1 = r0.get()
            X.1O1 r1 = (X.AnonymousClass1O1) r1
            X.00H r0 = X.C20134A8u.A00
            r7.A09(r4)
            java.lang.String r0 = "gdrive_backup"
            r1.A01(r0, r4)
        L_0x00bd:
            if (r6 != 0) goto L_0x00f3
            X.00H r0 = r5.A0g
            java.lang.Object r0 = r0.get()
            X.1NP r0 = (X.AnonymousClass1NP) r0
            int r0 = r0.A05()
            if (r0 == r3) goto L_0x01ee
            if (r0 != r2) goto L_0x00f3
            X.00H r0 = r5.A0h
            java.lang.Object r0 = r0.get()
            X.10T r0 = (X.AnonymousClass10T) r0
            r16 = 6
            X.35J r13 = new X.35J
            r13.<init>(r14, r16, r17)
        L_0x00de:
            r0.notifyAllObservers(r13)
            X.00H r0 = r5.A0j
            java.lang.Object r1 = r0.get()
            X.1O1 r1 = (X.AnonymousClass1O1) r1
            X.00H r0 = X.C20134A8u.A00
            r7.A09(r4)
            java.lang.String r0 = "gdrive_backup"
            r1.A01(r0, r4)
        L_0x00f3:
            boolean r0 = r5.A09
            if (r0 != 0) goto L_0x0126
            X.00H r0 = r5.A0g
            java.lang.Object r0 = r0.get()
            X.1NP r0 = (X.AnonymousClass1NP) r0
            int r0 = r0.A05()
            java.lang.String r1 = "unmounted"
            if (r0 == r3) goto L_0x01c1
            if (r0 != r2) goto L_0x0126
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            boolean r1 = r1.equals(r0)
            X.00H r0 = r5.A0h
            java.lang.Object r0 = r0.get()
            X.10T r0 = (X.AnonymousClass10T) r0
            if (r1 == 0) goto L_0x01b2
            r16 = 5
            X.35J r13 = new X.35J
            r13.<init>(r14, r16, r17)
        L_0x0123:
            r0.notifyAllObservers(r13)
        L_0x0126:
            if (r11 != 0) goto L_0x013a
            X.00H r0 = r5.A0j
            java.lang.Object r1 = r0.get()
            X.1O1 r1 = (X.AnonymousClass1O1) r1
            X.00H r0 = X.C20134A8u.A00
            r7.A09(r4)
            java.lang.String r0 = "gdrive_backup"
            r1.A01(r0, r4)
        L_0x013a:
            boolean r0 = r5.A0E()
            if (r0 == 0) goto L_0x0166
            boolean r9 = r8.get()
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            if (r9 != 0) goto L_0x0183
            java.util.concurrent.atomic.AtomicBoolean r9 = r5.A0Q
            boolean r9 = r9.get()
            if (r9 != 0) goto L_0x0183
            java.util.concurrent.atomic.AtomicBoolean r9 = r5.A0R
            boolean r9 = r9.get()
            if (r9 == 0) goto L_0x018e
            android.os.ConditionVariable r9 = r5.A0C
            boolean r0 = r9.block(r0)
            if (r0 != 0) goto L_0x018e
            java.lang.String r0 = "restore>GoogleBackupConditionsManager/battery-wait/media-restore 86400000 milliseconds, giving up now."
        L_0x0163:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0166:
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r1[r4] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1[r3] = r0
            boolean r0 = r5.A09
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1[r2] = r0
            java.lang.String r0 = "gdrive-service/wait-for-suitable-conditions network-available:%b, battery-available:%b sdcard-available:%b"
            java.lang.String.format(r0, r1)
            return r4
        L_0x0183:
            android.os.ConditionVariable r9 = r5.A0A
            boolean r0 = r9.block(r0)
            if (r0 != 0) goto L_0x018e
            java.lang.String r0 = "GoogleBackupConditionsManager/battery-wait/backup 86400000 milliseconds, giving up now."
            goto L_0x0163
        L_0x018e:
            boolean r0 = r5.A0F()
            if (r0 == 0) goto L_0x0166
            boolean r0 = r8.get()
            if (r0 != 0) goto L_0x01a2
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0Q
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x023b
        L_0x01a2:
            X.00H r0 = r5.A0N     // Catch:{ 1oV -> 0x0166 }
            java.lang.Object r8 = r0.get()     // Catch:{ 1oV -> 0x0166 }
            X.1OZ r8 = (X.AnonymousClass1OZ) r8     // Catch:{ 1oV -> 0x0166 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            r8.A0E(r0)     // Catch:{ 1oV -> 0x0166 }
            goto L_0x023b
        L_0x01b2:
            X.35J r13 = new X.35J
            r19 = r13
            r20 = r14
            r22 = r4
            r23 = r17
            r19.<init>(r20, r22, r23)
            goto L_0x0123
        L_0x01c1:
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            boolean r9 = r1.equals(r0)
            X.00H r0 = r5.A0h
            java.lang.Object r1 = r0.get()
            X.10T r1 = (X.AnonymousClass10T) r1
            if (r9 == 0) goto L_0x01e1
            r21 = 4
            X.35J r0 = new X.35J
            r18 = r0
            r18.<init>(r19, r21, r22)
        L_0x01dc:
            r1.notifyAllObservers(r0)
            goto L_0x0126
        L_0x01e1:
            X.35J r0 = new X.35J
            r13 = r0
            r14 = r19
            r16 = r3
            r17 = r22
            r13.<init>(r14, r16, r17)
            goto L_0x01dc
        L_0x01ee:
            X.00H r0 = r5.A0h
            java.lang.Object r0 = r0.get()
            X.10T r0 = (X.AnonymousClass10T) r0
            r27 = 3
            X.35J r13 = new X.35J
            r24 = r13
            r25 = r19
            r28 = r22
            r24.<init>(r25, r27, r28)
            goto L_0x00de
        L_0x0205:
            r16 = 7
            X.35J r13 = new X.35J
            r13.<init>(r14, r16, r17)
            goto L_0x00a8
        L_0x020e:
            int r1 = r5.A01
            X.00H r0 = r5.A0h
            java.lang.Object r0 = r0.get()
            X.10T r0 = (X.AnonymousClass10T) r0
            if (r1 != 0) goto L_0x0229
            X.35L r13 = new X.35L
            r24 = r13
            r25 = r19
            r27 = r4
            r28 = r22
            r24.<init>(r25, r27, r28)
            goto L_0x00a8
        L_0x0229:
            X.35J r13 = new X.35J
            r24 = r13
            r25 = r19
            r27 = r2
            r28 = r22
            r24.<init>(r25, r27, r28)
            goto L_0x00a8
        L_0x0238:
            r10 = 0
            goto L_0x0074
        L_0x023b:
            if (r10 == 0) goto L_0x0053
            r5.A02()
            goto L_0x0053
        L_0x0242:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0T
            boolean r12 = r0.get()
            boolean r6 = r5.A05
            goto L_0x0049
        L_0x024c:
            r11 = 0
            goto L_0x0029
        L_0x024f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36801oU.A00(X.1oU, X.A7X, long, long, long, long):boolean");
    }

    public void A03() {
        this.A04 = true;
        this.A0L.CGF(new C21457AkO((Object) this, 26));
    }

    public void A05() {
        this.A08 = true;
        A0B(((C27411Vz) this.A0M.get()).A00);
        this.A0L.CGF(new C21457AkO((Object) this, 25));
    }

    public synchronized void A0A() {
        boolean z;
        AtomicBoolean atomicBoolean;
        boolean z2;
        AtomicBoolean atomicBoolean2;
        AtomicBoolean atomicBoolean3;
        boolean z3;
        boolean z4;
        C17960vV.A01();
        AnonymousClass11E r0 = this.A0a;
        int A032 = r0.A03(true);
        this.A00 = A032;
        if (A032 != 0) {
            if (A032 == 1) {
                AnonymousClass1LR A042 = r0.A04();
                if (A042 == null) {
                    Log.i("GoogleBackupConditionsManager/can-use-network/active_network/wifi active network info is null, no connection");
                    this.A0E.close();
                    this.A0F.close();
                    this.A0D.close();
                    atomicBoolean = this.A0U;
                    boolean andSet = atomicBoolean.getAndSet(false);
                    atomicBoolean2 = this.A0V;
                    z = andSet | atomicBoolean2.getAndSet(false);
                    atomicBoolean3 = this.A0T;
                    z2 = atomicBoolean3.getAndSet(false);
                } else if (!A042.A06 || !AnonymousClass11E.A01()) {
                    Log.i("GoogleBackupConditionsManager/can-use-network/active_network/wifi");
                    this.A0E.open();
                    this.A0F.open();
                    this.A0D.open();
                    atomicBoolean = this.A0U;
                    atomicBoolean2 = this.A0V;
                    z = (!atomicBoolean.getAndSet(true)) | (!atomicBoolean2.getAndSet(true));
                    atomicBoolean3 = this.A0T;
                    z3 = atomicBoolean3.getAndSet(true);
                } else {
                    Log.i("GoogleBackupConditionsManager/can-use-network/active_network/wifi/captive");
                    this.A0E.close();
                    this.A0F.close();
                    this.A0D.close();
                    atomicBoolean = this.A0U;
                    boolean andSet2 = atomicBoolean.getAndSet(false);
                    atomicBoolean2 = this.A0V;
                    z = andSet2 | atomicBoolean2.getAndSet(false);
                    atomicBoolean3 = this.A0T;
                    z2 = atomicBoolean3.getAndSet(false);
                }
            } else if (A032 == 2) {
                Log.i("GoogleBackupConditionsManager/can-use-network/active_network/cellular");
                this.A0E.open();
                atomicBoolean = this.A0U;
                boolean z5 = !atomicBoolean.getAndSet(true);
                if (this.A04 || this.A01 == 1) {
                    this.A0D.open();
                    atomicBoolean3 = this.A0T;
                    z4 = !atomicBoolean3.getAndSet(true);
                } else {
                    this.A0D.close();
                    atomicBoolean3 = this.A0T;
                    z4 = atomicBoolean3.getAndSet(false);
                }
                z = z5 | z4;
                if (this.A02 == 1) {
                    this.A0F.open();
                    atomicBoolean2 = this.A0V;
                    z3 = atomicBoolean2.getAndSet(true);
                } else {
                    this.A0F.close();
                    atomicBoolean2 = this.A0V;
                    z2 = atomicBoolean2.getAndSet(false);
                }
            } else if (A032 == 3) {
                Log.i("GoogleBackupConditionsManager/can-use-network/active_network/roaming");
                this.A0E.open();
                this.A0F.close();
                this.A0D.close();
                atomicBoolean = this.A0U;
                atomicBoolean2 = this.A0V;
                z = (!atomicBoolean.getAndSet(true)) | atomicBoolean2.getAndSet(false);
                atomicBoolean3 = this.A0T;
                z2 = atomicBoolean3.getAndSet(false);
            }
            z2 = true ^ z3;
        } else {
            Log.i("GoogleBackupConditionsManager/can-use-network/active_network/none");
            this.A0E.close();
            this.A0F.close();
            this.A0D.close();
            atomicBoolean = this.A0U;
            boolean andSet3 = atomicBoolean.getAndSet(false);
            atomicBoolean2 = this.A0V;
            z = andSet3 | atomicBoolean2.getAndSet(false);
            atomicBoolean3 = this.A0T;
            z2 = atomicBoolean3.getAndSet(false);
        }
        if (z || z2) {
            StringBuilder sb = new StringBuilder();
            sb.append("restore>GoogleBackupConditionsManager/can-use-network/message-restore/");
            sb.append(atomicBoolean.get());
            Log.i(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("restore>GoogleBackupConditionsManager/can-use-network/media-restore/");
            sb2.append(atomicBoolean2.get());
            Log.i(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("GoogleBackupConditionsManager/can-use-network/backup/");
            sb3.append(atomicBoolean3.get());
            Log.i(sb3.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a4, code lost:
        if (r7 != null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00af, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b8, code lost:
        if (r1.toString().contains("file is encrypted") != false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ba, code lost:
        com.whatsapp.util.Log.w("databasehelper/getInitialMessageCount/cursor/encrypted-file-error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c0, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c1, code lost:
        X.C22601Cm.A03(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d7, code lost:
        com.whatsapp.util.Log.w("databasehelper/getInitialMessageCount/dbcorrupt", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00dc, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0123, code lost:
        if (r11.A0K.A0f() == null) goto L_0x011b;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d6 A[Catch:{ SQLiteDatabaseCorruptException -> 0x00d6, SQLiteException -> 0x00c5 }, ExcHandler: SQLiteDatabaseCorruptException (r1v9 'e' android.database.sqlite.SQLiteDatabaseCorruptException A[CUSTOM_DECLARE, Catch:{ all -> 0x017a }]), Splitter:B:30:0x0073] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0D() {
        /*
            r11 = this;
            r10 = 0
            X.11S r0 = r11.A0Y
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x0018
            X.118 r0 = r11.A0J
            android.content.Context r0 = r0.A00
            boolean r0 = X.C41361wE.A09(r0)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/gdrive-access-not-allowed"
        L_0x0015:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0018:
            return r10
        L_0x0019:
            X.1CM r0 = r11.A0f
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/reg-not-verified"
            goto L_0x0015
        L_0x0024:
            X.00H r0 = r11.A0i
            java.lang.Object r0 = r0.get()
            X.1Do r0 = (X.C22881Do) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/login-failed"
            goto L_0x0015
        L_0x0033:
            X.194 r1 = r11.A0Z
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/clock-wrong"
            goto L_0x0015
        L_0x003e:
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/software-expired"
            goto L_0x0015
        L_0x0047:
            X.1Cd r1 = r11.A0d
            r1.A06()
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x016a
            r1.A06()
            X.1Cm r3 = r1.A02
            X.1at r9 = r1.get()
            java.lang.Object r2 = r3.A0C     // Catch:{ all -> 0x017a }
            monitor-enter(r2)     // Catch:{ all -> 0x017a }
            java.lang.Boolean r0 = r3.A01     // Catch:{ all -> 0x0177 }
            if (r0 != 0) goto L_0x00e3
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0177 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0177 }
            java.lang.String r4 = "file is encrypted"
            java.lang.String r0 = "databasehelper/getInitialMessageCount"
            X.1Ez r8 = new X.1Ez     // Catch:{ all -> 0x0177 }
            r8.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0177 }
            java.lang.String r5 = "SELECT _id FROM message LIMIT 2"
            java.lang.String r1 = "GET_HAS_MESSAGES"
            r0 = 0
            android.database.Cursor r7 = r6.A0A(r5, r1, r0)     // Catch:{ SQLiteFullException -> 0x00c0, SQLiteException -> 0x00af, SQLiteDatabaseCorruptException -> 0x00d6 }
            int r0 = r7.getCount()     // Catch:{ all -> 0x00a3 }
            r6 = 1
            if (r0 > r6) goto L_0x007f
            r6 = 0
        L_0x007f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a3 }
            r5.<init>()     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = "databasehelper/checkHasMessagesInDB: hasMessages = "
            r5.append(r0)     // Catch:{ all -> 0x00a3 }
            r5.append(r6)     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = " | time spent:"
            r5.append(r0)     // Catch:{ all -> 0x00a3 }
            long r0 = r8.A02()     // Catch:{ all -> 0x00a3 }
            r5.append(r0)     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x00a3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00a3 }
            r7.close()     // Catch:{ SQLiteFullException -> 0x00c0, SQLiteException -> 0x00af, SQLiteDatabaseCorruptException -> 0x00d6 }
            goto L_0x00dd
        L_0x00a3:
            r1 = move-exception
            if (r7 == 0) goto L_0x00ae
            r7.close()     // Catch:{ all -> 0x00aa }
            goto L_0x00ae
        L_0x00aa:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteFullException -> 0x00c0, SQLiteException -> 0x00af, SQLiteDatabaseCorruptException -> 0x00d6 }
        L_0x00ae:
            throw r1     // Catch:{ SQLiteFullException -> 0x00c0, SQLiteException -> 0x00af, SQLiteDatabaseCorruptException -> 0x00d6 }
        L_0x00af:
            r1 = move-exception
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6, SQLiteException -> 0x00c5 }
            boolean r0 = r0.contains(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6, SQLiteException -> 0x00c5 }
            if (r0 == 0) goto L_0x00c4
            java.lang.String r0 = "databasehelper/getInitialMessageCount/cursor/encrypted-file-error"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6, SQLiteException -> 0x00c5 }
            goto L_0x00dc
        L_0x00c0:
            r1 = move-exception
            X.C22601Cm.A03(r1, r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6, SQLiteException -> 0x00c5 }
        L_0x00c4:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6, SQLiteException -> 0x00c5 }
        L_0x00c5:
            r1 = move-exception
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0177 }
            boolean r0 = r0.contains(r4)     // Catch:{ all -> 0x0177 }
            if (r0 == 0) goto L_0x016e
            java.lang.String r0 = "databasehelper/getInitialMessageCount/encrypted-file-error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0177 }
            goto L_0x00dc
        L_0x00d6:
            r1 = move-exception
            java.lang.String r0 = "databasehelper/getInitialMessageCount/dbcorrupt"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0177 }
        L_0x00dc:
            r6 = 0
        L_0x00dd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0177 }
            r3.A01 = r0     // Catch:{ all -> 0x0177 }
        L_0x00e3:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0177 }
            monitor-exit(r2)     // Catch:{ all -> 0x0177 }
            r9.close()
            if (r0 == 0) goto L_0x016a
            X.00H r0 = r11.A0g
            java.lang.Object r0 = r0.get()
            X.1NP r0 = (X.AnonymousClass1NP) r0
            int r2 = r0.A03()
            r0 = 1
            if (r2 == 0) goto L_0x011b
            if (r2 == r0) goto L_0x011d
            r0 = 2
            if (r2 == r0) goto L_0x011d
            r0 = 3
            if (r2 == r0) goto L_0x011d
            r0 = 4
            if (r2 == r0) goto L_0x011d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/unexpected-backup-freq/"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x011b:
            r8 = 1
            goto L_0x0126
        L_0x011d:
            X.0z4 r0 = r11.A0K
            java.lang.String r0 = r0.A0f()
            if (r0 != 0) goto L_0x0018
            goto L_0x011b
        L_0x0126:
            X.0z4 r0 = r11.A0K     // Catch:{ NumberFormatException -> 0x016f }
            java.lang.String r3 = "gdrive_next_prompt_for_setup_timestamp"
            r1 = -1
            X.00H r0 = r0.A00     // Catch:{ NumberFormatException -> 0x016f }
            java.lang.Object r0 = r0.get()     // Catch:{ NumberFormatException -> 0x016f }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ NumberFormatException -> 0x016f }
            long r6 = r0.getLong(r3, r1)     // Catch:{ NumberFormatException -> 0x016f }
            long r4 = java.lang.System.currentTimeMillis()
            java.util.Locale r3 = java.util.Locale.ENGLISH
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r2[r10] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r2[r8] = r0
            long r4 = r4 - r6
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r0 = 2
            r2[r0] = r1
            java.lang.String r0 = "saved time: %d, current time: %d, difference: %d"
            java.lang.String.format(r3, r0, r2)
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0175
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0018
            java.lang.String r0 = "GoogleBackupConditionsManager/sufficient-time-passed-since-last-user-prompt/true"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0175
        L_0x016a:
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/message-count-low"
            goto L_0x0015
        L_0x016e:
            throw r1     // Catch:{ all -> 0x0177 }
        L_0x016f:
            r1 = move-exception
            java.lang.String r0 = "GoogleBackupConditionsManager/sufficient-time-passed-since-last-user-prompt/"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0175:
            r10 = 1
            return r10
        L_0x0177:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0177 }
            throw r0     // Catch:{ all -> 0x017a }
        L_0x017a:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x017f }
            throw r1
        L_0x017f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36801oU.A0D():boolean");
    }

    public int A01(int i) {
        int A012 = C24191Jf.A01(this.A0b, this.A0e);
        StringBuilder sb = new StringBuilder();
        sb.append("GoogleBackupConditionsManager/calc-max-concurrent-reads/network_type=");
        sb.append(this.A00);
        sb.append(", year class = ");
        sb.append(A012);
        Log.i(sb.toString());
        if (this.A00 != 1 || A012 < 2011) {
            return Math.min(i, 2);
        }
        return i;
    }

    public void A02() {
        if (this.A03 == null) {
            WifiManager A0F2 = this.A0b.A0F();
            if (A0F2 == null) {
                Log.w("GoogleBackupConditionsManager/create-wifi-lock wm=null");
            } else {
                WifiManager.WifiLock createWifiLock = A0F2.createWifiLock(1, "backup-lock");
                this.A03 = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        WifiManager.WifiLock wifiLock = this.A03;
        if (wifiLock != null && !wifiLock.isHeld()) {
            this.A03.acquire();
        }
    }

    public void A04() {
        ((AnonymousClass1NP) this.A0g.get()).A07().edit().putString("gdrive_media_restore_network_setting", String.valueOf(1)).apply();
        A07();
        this.A0L.CGF(new C21457AkO((Object) this, 26));
    }

    public void A06() {
        String str;
        Boolean bool = Boolean.TRUE;
        ThreadLocal threadLocal = this.A0k;
        if (bool != threadLocal.get()) {
            threadLocal.set(bool);
            try {
                C17960vV.A01();
                AnonymousClass00H r6 = this.A0g;
                if (C20134A8u.A07((AnonymousClass1NP) r6.get())) {
                    AtomicBoolean atomicBoolean = this.A0R;
                    if (!atomicBoolean.get()) {
                        A08();
                        A07();
                        A0A();
                        AtomicBoolean atomicBoolean2 = this.A0V;
                        if (!atomicBoolean2.get() || !this.A07 || !this.A09) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("restore>GoogleBackupConditionsManager/trigger-nothing media-restore-pending: ");
                            sb.append(C20134A8u.A07((AnonymousClass1NP) r6.get()));
                            sb.append(" media-restore-running: ");
                            sb.append(atomicBoolean.get());
                            sb.append(" network_available_for_media_restore: ");
                            sb.append(atomicBoolean2.get());
                            sb.append(" battery_available_for_media_restore: ");
                            sb.append(this.A07);
                            sb.append(" sdcard_available: ");
                            sb.append(this.A09);
                            str = sb.toString();
                            Log.i(str);
                        }
                        Log.i("restore>GoogleBackupConditionsManager/trigger-pending-media-restore");
                        this.A0O.get();
                        Context context = this.A0J.A00;
                        C25081Mu.A00(context, AnonymousClass1LU.A1M(context, "action_restore_media"));
                    }
                }
                if (C17890vO.A1R(((AnonymousClass1NP) r6.get()).A05())) {
                    AtomicBoolean atomicBoolean3 = this.A0P;
                    if (!atomicBoolean3.get()) {
                        A08();
                        A07();
                        A0A();
                        AtomicBoolean atomicBoolean4 = this.A0T;
                        if (!atomicBoolean4.get() || !this.A05 || !this.A09) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("GoogleBackupConditionsManager/trigger-nothing is-backup-pending: ");
                            sb2.append(C17890vO.A1R(((AnonymousClass1NP) r6.get()).A05()));
                            sb2.append(" is-backup-running: ");
                            sb2.append(atomicBoolean3.get());
                            sb2.append(" network_available_for_backup: ");
                            sb2.append(atomicBoolean4.get());
                            sb2.append(" battery_available_for_backup: ");
                            sb2.append(this.A05);
                            sb2.append(" sdcard_available: ");
                            sb2.append(this.A09);
                            str = sb2.toString();
                        } else {
                            this.A0O.get();
                            Context context2 = this.A0J.A00;
                            Intent A1M = AnonymousClass1LU.A1M(context2, "action_backup");
                            A1M.putExtra("only_if_pending", true);
                            C25081Mu.A00(context2, A1M);
                            str = "GoogleBackupConditionsManager/trigger-pending-backup";
                        }
                        Log.i(str);
                    }
                }
                if (this.A0W.get() || this.A0X.get()) {
                    Log.i("GoogleBackupConditionsManager/service-running/recalculate-network-and-sdcard");
                    A08();
                    A07();
                    A0A();
                }
                str = "GoogleBackupConditionsManager/trigger-nothing/nothing-pending";
                Log.i(str);
            } finally {
                threadLocal.set(Boolean.FALSE);
            }
        }
    }

    public void A07() {
        String str;
        Integer A032;
        int i;
        try {
            AnonymousClass00H r1 = this.A0g;
            this.A01 = ((AnonymousClass1NP) r1.get()).A04();
            AnonymousClass1NP r12 = (AnonymousClass1NP) r1.get();
            if (r12.A07().contains("gdrive_media_restore_network_setting")) {
                str = r12.A07().getString("gdrive_media_restore_network_setting", "0");
            } else {
                try {
                    i = Integer.parseInt(((SharedPreferences) r12.A00.A00.get()).getString("gdrive_media_restore_network_setting", String.valueOf(0)));
                } catch (NumberFormatException e) {
                    Log.e("wa-shared-preferences/get-media-restore-network-setting", e);
                    i = 0;
                }
                str = String.valueOf(i);
            }
            int i2 = 0;
            if (!(str == null || (A032 = AnonymousClass1YD.A03(str)) == null)) {
                i2 = A032.intValue();
            }
            this.A02 = i2;
        } catch (NumberFormatException e2) {
            Log.e((Throwable) e2);
        }
    }

    public void A09() {
        WifiManager.WifiLock wifiLock = this.A03;
        if (wifiLock != null && wifiLock.isHeld()) {
            this.A03.release();
        }
    }

    public boolean A0E() {
        String str;
        if (this.A0P.get() || this.A0Q.get()) {
            if (this.A0D.block(1800000)) {
                return true;
            }
            str = "GoogleBackupConditionsManager/network-wait/backup 1800000 milliseconds, giving up now.";
        } else if (this.A0R.get()) {
            if (this.A0F.block(1800000)) {
                return true;
            }
            Log.e("restore>GoogleBackupConditionsManager/network-wait/media-restore 1800000 milliseconds, giving up now.");
            return true;
        } else if (this.A0E.block(1800000)) {
            return true;
        } else {
            str = "restore>GoogleBackupConditionsManager/network-wait/message-restore 1800000 milliseconds, giving up now.";
        }
        Log.e(str);
        return false;
    }

    public void Bps(C59732mn r4) {
        this.A0L.CGF(new C21457AkO((Object) this, 24));
    }

    public C36801oU(AnonymousClass11S r3, AnonymousClass194 r4, C23651Hc r5, AnonymousClass11E r6, AnonymousClass11C r7, AnonymousClass11P r8, AnonymousClass118 r9, C19830z4 r10, AnonymousClass1Cd r11, C18010vc r12, AnonymousClass1CM r13, AnonymousClass10I r14, AnonymousClass00H r15, AnonymousClass00H r16, AnonymousClass00H r17, AnonymousClass00H r18, AnonymousClass00H r19, AnonymousClass00H r20, AnonymousClass00H r21) {
        this.A0J = r9;
        this.A0c = r8;
        this.A0Y = r3;
        this.A0O = r15;
        this.A0L = r14;
        this.A0Z = r4;
        this.A0i = r16;
        this.A0N = r17;
        this.A0b = r7;
        this.A0H = r5;
        this.A0d = r11;
        this.A0K = r10;
        this.A0M = r18;
        this.A0j = r19;
        this.A0g = r20;
        this.A0f = r13;
        this.A0e = r12;
        this.A0a = r6;
        this.A0h = r21;
    }

    public void A08() {
        A0C(Environment.getExternalStorageState());
    }

    public void A0B(AnonymousClass1W0 r7) {
        int i;
        double A002 = r7.A00();
        boolean z = false;
        if (!Double.isNaN(A002)) {
            i = (int) A002;
        } else {
            i = 0;
        }
        this.A0B.open();
        boolean z2 = true;
        this.A06 = true;
        if (this.A08 || r7.A02()) {
            this.A0A.open();
            this.A0C.open();
            if (!this.A05 || !this.A07) {
                z = true;
            }
            this.A05 = true;
            this.A07 = true;
            z2 = z;
        } else {
            this.A0A.close();
            this.A0C.close();
            if (!this.A05 && !this.A07) {
                z2 = false;
            }
            this.A05 = false;
            this.A07 = false;
        }
        if (z2) {
            StringBuilder sb = new StringBuilder();
            sb.append("GoogleBackupConditionsManager/can-use-battery/battery-level/");
            sb.append(i);
            Log.i(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("GoogleBackupConditionsManager/can-use-battery-for-backup/");
            sb2.append(this.A05);
            Log.i(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("restore>GoogleBackupConditionsManager/can-use-battery-for-media-restore/");
            sb3.append(this.A07);
            Log.i(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("GoogleBackupConditionsManager/ignore-battery-status/");
            sb4.append(this.A08);
            Log.i(sb4.toString());
        }
    }

    public void A0C(String str) {
        C17960vV.A01();
        boolean equals = "mounted".equals(str);
        ConditionVariable conditionVariable = this.A0G;
        if (equals) {
            conditionVariable.open();
            if (!this.A09) {
                this.A09 = true;
                if (C41361wE.A09(this.A0J.A00)) {
                    A06();
                    return;
                }
                return;
            }
            return;
        }
        conditionVariable.close();
        this.A09 = false;
    }

    public boolean A0F() {
        if (this.A0G.block(86400000)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GoogleBackupConditionsManager/sdcard-wait ");
        sb.append(86400000);
        sb.append(" milliseconds, giving up now.");
        Log.e(sb.toString());
        return false;
    }

    public boolean A0G(int i) {
        C17960vV.A01();
        if (i == 0 || i == 1) {
            this.A01 = i;
            A0A();
            ((AnonymousClass1NP) this.A0g.get()).A07().edit().putString("interface_gdrive_backup_network_setting", String.valueOf(i)).apply();
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GoogleBackupConditionsManager/set-backup-network-setting/incorrect-value/");
        sb.append(i);
        Log.e(sb.toString());
        return false;
    }

    public void BmS(AnonymousClass1W0 r1) {
        A0B(r1);
    }
}
