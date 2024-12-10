package X;

import android.app.Activity;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.9Bc  reason: invalid class name and case insensitive filesystem */
public abstract class C177919Bc extends A34 {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final /* synthetic */ C195509tS A03;

    public C177919Bc(C195509tS r1, boolean z, boolean z2, boolean z3) {
        this.A03 = r1;
        this.A00 = z;
        this.A02 = z2;
        this.A01 = z3;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C192039nf r4 = (C192039nf) obj;
        if (!A0O(r4)) {
            boolean A002 = r4.A00();
            StringBuilder A10 = AnonymousClass000.A10();
            String A0K = A0K();
            if (A002) {
                A10.append(A0K);
                C17890vO.A1A(A10, "success");
                boolean z = this.A00;
                if (!z) {
                    C17890vO.A1A(AnonymousClass000.A11(A0K), "notregname/send-active");
                    this.A03.A03.A03(true);
                }
                C195509tS r1 = this.A03;
                r1.A04.A01();
                if (!z) {
                    r1.A02.A07();
                }
            } else {
                A10.append(A0K);
                C17900vP.A0Y(r4, "failed with status: ", A10);
            }
            C195509tS r0 = this.A03;
            r0.A01();
            r0.A02(r4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006f, code lost:
        if (r5 == 21) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0181, code lost:
        if (r11 == 21) goto L_0x0183;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C192039nf A0J() {
        /*
            r14 = this;
            boolean r0 = r14 instanceof X.C1775699h
            if (r0 == 0) goto L_0x00c6
            r4 = r14
            X.99h r4 = (X.C1775699h) r4
            X.99i r3 = r4.A01
            X.1WZ r0 = r3.A01
            r0.A01()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "restore>PrepareMessageStoreTask/"
            r1.append(r0)
            java.lang.String r0 = "initialize msgstore from backup"
            X.C17890vO.A1A(r1, r0)
            r9 = 1
            X.AeD r6 = new X.AeD
            r6.<init>(r4, r9)
            X.1j7 r2 = r3.A01
            boolean r8 = r4.A01
            X.9pW r1 = r3.A02
            java.lang.String r0 = X.C182319Tx.A00
            java.io.File r5 = r1.A01(r0)
            X.11r r0 = X.C33621j7.A00(r2)
            X.1Wb r4 = r0.A09
            X.1Cd r3 = r4.A0I
            r3.A06()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r3.A04
            r2.lock()
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00be }
            monitor-enter(r4)     // Catch:{ all -> 0x00be }
            r3.A06()     // Catch:{ all -> 0x00bb }
            boolean r0 = r3.A08     // Catch:{ all -> 0x00bb }
            if (r0 != 0) goto L_0x008f
            X.1WZ r0 = r4.A0J     // Catch:{ all -> 0x00bb }
            r0.A01()     // Catch:{ all -> 0x00bb }
            X.1Cn r7 = r4.A0H     // Catch:{ all -> 0x00bb }
            r7.A02()     // Catch:{ all -> 0x00bb }
            r1 = 100
            java.util.List r0 = java.util.Collections.singletonList(r5)     // Catch:{ all -> 0x00bb }
            X.9nf r6 = X.C27431Wb.A01(r4, r6, r0, r1)     // Catch:{ all -> 0x00bb }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore/restoring-from-backup-or-direct-transfer/"
            X.C17900vP.A0Y(r6, r0, r1)     // Catch:{ all -> 0x00bb }
            int r5 = r6.A00     // Catch:{ all -> 0x00bb }
            if (r5 == r9) goto L_0x0071
            r0 = 21
            r1 = 0
            if (r5 != r0) goto L_0x0072
        L_0x0071:
            r1 = 1
        L_0x0072:
            r3.A06()     // Catch:{ SQLiteException -> 0x008c }
            X.1Cm r0 = r3.A02     // Catch:{ SQLiteException -> 0x008c }
            r0.Bbw()     // Catch:{ SQLiteException -> 0x008c }
            if (r1 == 0) goto L_0x008c
            r3.A06()     // Catch:{ all -> 0x00bb }
            r3.A08 = r9     // Catch:{ all -> 0x00bb }
            X.1ST r0 = r4.A0E     // Catch:{ all -> 0x00bb }
            r0.A0G()     // Catch:{ all -> 0x00bb }
            X.1Vy r0 = r4.A0R     // Catch:{ all -> 0x00bb }
            r0.A02()     // Catch:{ all -> 0x00bb }
            goto L_0x00b3
        L_0x008c:
            if (r8 == 0) goto L_0x00b3
            goto L_0x009b
        L_0x008f:
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore/restoring-from-backup/6"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00bb }
            r0 = 6
            X.9nf r6 = new X.9nf     // Catch:{ all -> 0x00bb }
            r6.<init>(r0)     // Catch:{ all -> 0x00bb }
            goto L_0x00b3
        L_0x009b:
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore/re-creating db"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00bb }
            X.1Cd r0 = r7.A00     // Catch:{ all -> 0x00bb }
            r0.A06()     // Catch:{ all -> 0x00bb }
            X.AnonymousClass1Cd.A02(r0)     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore/db recreated"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00bb }
            r0 = 2
            X.9nf r6 = new X.9nf     // Catch:{ all -> 0x00bb }
            r6.<init>(r0)     // Catch:{ all -> 0x00bb }
        L_0x00b3:
            monitor-exit(r4)     // Catch:{ all -> 0x00bb }
            r3.A06()
            r2.unlock()
            return r6
        L_0x00bb:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00bb }
            throw r0     // Catch:{ all -> 0x00be }
        L_0x00be:
            r0 = move-exception
            r3.A06()
            r2.unlock()
            throw r0
        L_0x00c6:
            r6 = r14
            X.99g r6 = (X.AnonymousClass99g) r6
            X.99j r4 = r6.A01
            X.1WZ r0 = r4.A08
            r0.A01()
            boolean r2 = r6.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "restore>PrepareMessageStoreTask/"
            if (r2 == 0) goto L_0x01e8
            r1.append(r0)
            java.lang.String r0 = "initialize msgstore from backup"
            X.C17890vO.A1A(r1, r0)
            r12 = 0
            X.AeD r11 = new X.AeD
            r11.<init>(r6, r12)
            X.1j7 r0 = r4.A01
            boolean r9 = r6.A01
            X.11r r0 = X.C33621j7.A00(r0)
            X.1Wb r5 = r0.A09
            X.1Cd r3 = r5.A0I
            r3.A06()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r3.A04
            r1.lock()
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01e0 }
            monitor-enter(r5)     // Catch:{ all -> 0x01e0 }
            r3.A06()     // Catch:{ all -> 0x01dd }
            boolean r0 = r3.A08     // Catch:{ all -> 0x01dd }
            if (r0 != 0) goto L_0x01aa
            X.1WZ r0 = r5.A0J     // Catch:{ all -> 0x01dd }
            r0.A01()     // Catch:{ all -> 0x01dd }
            X.1Cn r8 = r5.A0H     // Catch:{ all -> 0x01dd }
            r8.A02()     // Catch:{ all -> 0x01dd }
            r10 = 100
            java.io.File r2 = r5.A0H()     // Catch:{ all -> 0x01dd }
            X.9JN r0 = X.AnonymousClass9JN.A01()     // Catch:{ all -> 0x01dd }
            java.util.ArrayList r0 = X.A3K.A02(r0)     // Catch:{ all -> 0x01dd }
            java.util.ArrayList r7 = X.A8L.A01(r2, r0)     // Catch:{ all -> 0x01dd }
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x01dd }
            if (r0 == 0) goto L_0x0144
            java.lang.String r0 = "MessageStoreBackup/restore/backupfiles/none-found"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01dd }
            X.9nf r2 = new X.9nf     // Catch:{ all -> 0x01dd }
            r2.<init>(r12)     // Catch:{ all -> 0x01dd }
        L_0x0135:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore/restoring-from-backup-or-direct-transfer/"
            X.C17900vP.A0Y(r2, r0, r7)     // Catch:{ all -> 0x01dd }
            int r11 = r2.A00     // Catch:{ all -> 0x01dd }
            r10 = 1
            if (r11 == r10) goto L_0x0183
            goto L_0x017e
        L_0x0144:
            java.util.Iterator r13 = r7.iterator()     // Catch:{ all -> 0x01dd }
        L_0x0148:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x01dd }
            if (r0 == 0) goto L_0x0166
            java.io.File r12 = X.AnonymousClass8BS.A0T(r13)     // Catch:{ all -> 0x01dd }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "MessageStoreBackup/restore/backupfiles "
            X.AnonymousClass8BV.A1J(r12, r0, r2)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = " ("
            X.AnonymousClass8BV.A1I(r12, r0, r2)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = ")"
            X.C17890vO.A1A(r2, r0)     // Catch:{ all -> 0x01dd }
            goto L_0x0148
        L_0x0166:
            r3.A06()     // Catch:{ all -> 0x01dd }
            java.io.File r2 = r3.A03     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "restore"
            boolean r0 = X.C27431Wb.A0C(r2, r0)     // Catch:{ all -> 0x01dd }
            if (r0 == 0) goto L_0x0179
            r3.A06()     // Catch:{ all -> 0x01dd }
            X.C64062u9.A0Q(r2)     // Catch:{ all -> 0x01dd }
        L_0x0179:
            X.9nf r2 = X.C27431Wb.A01(r5, r11, r7, r10)     // Catch:{ all -> 0x01dd }
            goto L_0x0135
        L_0x017e:
            r0 = 21
            r7 = 0
            if (r11 != r0) goto L_0x0184
        L_0x0183:
            r7 = 1
        L_0x0184:
            r3.A06()     // Catch:{ SQLiteException -> 0x018f }
            X.1Cm r0 = r3.A02     // Catch:{ SQLiteException -> 0x018f }
            r0.Bbw()     // Catch:{ SQLiteException -> 0x018f }
            if (r7 == 0) goto L_0x018f
            goto L_0x01b6
        L_0x018f:
            if (r9 == 0) goto L_0x01c5
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore/re-creating db"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01dd }
            X.1Cd r0 = r8.A00     // Catch:{ all -> 0x01dd }
            r0.A06()     // Catch:{ all -> 0x01dd }
            X.AnonymousClass1Cd.A02(r0)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore/db recreated"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01dd }
            r0 = 2
            X.9nf r2 = new X.9nf     // Catch:{ all -> 0x01dd }
            r2.<init>(r0)     // Catch:{ all -> 0x01dd }
            goto L_0x01c5
        L_0x01aa:
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore/restoring-from-backup/6"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01dd }
            r0 = 6
            X.9nf r2 = new X.9nf     // Catch:{ all -> 0x01dd }
            r2.<init>(r0)     // Catch:{ all -> 0x01dd }
            goto L_0x01c5
        L_0x01b6:
            r3.A06()     // Catch:{ all -> 0x01dd }
            r3.A08 = r10     // Catch:{ all -> 0x01dd }
            X.1ST r0 = r5.A0E     // Catch:{ all -> 0x01dd }
            r0.A0G()     // Catch:{ all -> 0x01dd }
            X.1Vy r0 = r5.A0R     // Catch:{ all -> 0x01dd }
            r0.A02()     // Catch:{ all -> 0x01dd }
        L_0x01c5:
            monitor-exit(r5)     // Catch:{ all -> 0x01dd }
            r3.A06()
            r1.unlock()
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x01dc
            X.1To r1 = r4.A05
            boolean r0 = r1.A0T()
            if (r0 == 0) goto L_0x01dc
            r0 = 5
            r1.A0K(r0)
        L_0x01dc:
            return r2
        L_0x01dd:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01dd }
            throw r0     // Catch:{ all -> 0x01e0 }
        L_0x01e0:
            r0 = move-exception
            r3.A06()
            r1.unlock()
            throw r0
        L_0x01e8:
            r1.append(r0)
            java.lang.String r0 = "initializeMessageStore/newstore"
            X.C17890vO.A1A(r1, r0)
            X.1Cn r0 = r4.A07
            X.9nf r2 = r0.A00()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177919Bc.A0J():X.9nf");
    }

    public void A0L() {
        if (this instanceof C1775699h) {
            C1775699h r6 = (C1775699h) this;
            C1775799i r5 = r6.A01;
            Set<AnonymousClass1NZ> set = (Set) r5.A03.get();
            double size = 100.0d / (((double) set.size()) * 2.0d);
            for (AnonymousClass1NZ r7 : set) {
                String A0M = r7.A0M();
                try {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("restore>PrepareMessageStoreTask/");
                    C17900vP.A0f(" restoring ", A0M, A10);
                    r7.A0I(C108945cZ.A0E(r5.A00), (C171768sF) null, C17880vN.A0e(r5.A02.A00.getFilesDir(), "migration/import/sandbox"));
                    C17900vP.A0f(" restored ", A0M, AnonymousClass000.A11("restore>PrepareMessageStoreTask/"));
                } catch (Exception e) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("restore>PrepareMessageStoreTask/");
                    A102.append(" failed to restore ");
                    C17890vO.A13(A0M, A102, e);
                }
                double d = r6.A00 + size;
                r6.A00 = d;
                C17880vN.A0V(r5.A04).notifyAllObservers(new C20725AWf((int) d, 100, 2));
            }
            return;
        }
        AnonymousClass99g r1 = (AnonymousClass99g) this;
        if (r1.A00 && r1.A02) {
            C171768sF r4 = new C171768sF();
            AnonymousClass1Ez r62 = new AnonymousClass1Ez("essential-files-restore");
            C1775899j r52 = r1.A01;
            Iterator A0h = C17890vO.A0h(r52.A0A);
            while (A0h.hasNext()) {
                AnonymousClass1NZ r72 = (AnonymousClass1NZ) A0h.next();
                String A0M2 = r72.A0M();
                try {
                    StringBuilder A103 = AnonymousClass000.A10();
                    A103.append("restore>PrepareMessageStoreTask/");
                    C17900vP.A0f("restoring ", A0M2, A103);
                    Activity activity = r52.A01;
                    C18070vi.A0d(activity, 0);
                    r72.A0I(activity, r4, r72.A02.A03());
                    C17900vP.A0f("restored ", A0M2, AnonymousClass000.A11("restore>PrepareMessageStoreTask/"));
                } catch (Exception e2) {
                    StringBuilder A104 = AnonymousClass000.A10();
                    A104.append("restore>PrepareMessageStoreTask/");
                    A104.append("failed to restore ");
                    C17890vO.A13(A0M2, A104, e2);
                }
            }
            r4.A0L = AnonymousClass8BT.A0n(r62);
            r52.A09.CC7(r4);
        }
    }

    public void A0M(long j) {
        if (this.A02 && j > 0) {
            SystemClock.sleep(j);
        }
    }

    public void A0N(C192039nf r5) {
        if (!(this instanceof C1775699h)) {
            AnonymousClass99g r3 = (AnonymousClass99g) this;
            if (r3.A02 && r5.A00 == 2 && r3.A00) {
                r3.A01.A02.A0J(new C70613Bu(r3, 1));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0O(X.C192039nf r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C1775699h
            if (r0 != 0) goto L_0x0075
            r4 = r5
            X.99g r4 = (X.AnonymousClass99g) r4
            X.8Bf r0 = X.C1775899j.A0J
            if (r0 == 0) goto L_0x0017
            X.99j r0 = r4.A01
            android.app.Activity r1 = r0.A01
            r0 = 100
            X.AnonymousClass4Yv.A00(r1, r0)
            r0 = 0
            X.C1775899j.A0J = r0
        L_0x0017:
            int r1 = r6.A00
            if (r1 == 0) goto L_0x0027
            r0 = 3
            if (r1 == r0) goto L_0x0027
            r0 = 4
            if (r1 == r0) goto L_0x0027
            r0 = 5
            if (r1 == r0) goto L_0x0027
            r0 = 6
            if (r1 != r0) goto L_0x0069
        L_0x0027:
            java.util.concurrent.atomic.AtomicReference r1 = X.C1775899j.A0K
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x0069
            java.lang.Object r6 = r1.get()
            X.9nf r6 = (X.C192039nf) r6
        L_0x0035:
            int r1 = r6.A00
            if (r1 == 0) goto L_0x0045
            r0 = 3
            if (r1 == r0) goto L_0x0045
            r0 = 4
            if (r1 == r0) goto L_0x0045
            r0 = 5
            if (r1 == r0) goto L_0x0045
            r0 = 6
            if (r1 != r0) goto L_0x0075
        L_0x0045:
            r3 = 1
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "restore>PrepareMessageStoreTask/"
            r2.append(r1)
            java.lang.String r0 = "setting onePrepareMsgstoreTaskAlreadyFinished to true"
            X.C17890vO.A1A(r2, r0)
            X.99j r0 = r4.A01
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0D
            boolean r0 = r0.getAndSet(r3)
            if (r0 == 0) goto L_0x0075
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)
            java.lang.String r0 = "this attempt failed but another attempt in parallel proceeded further than this stage, therefore, aborting this attempt "
            X.C17900vP.A0Y(r6, r0, r1)
            r0 = 1
            return r0
        L_0x0069:
            java.util.concurrent.atomic.AtomicReference r1 = X.C1775899j.A0K
            java.lang.Object r0 = r1.get()
            if (r0 != 0) goto L_0x0035
            r1.set(r6)
            goto L_0x0035
        L_0x0075:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177919Bc.A0O(X.9nf):boolean");
    }

    public String A0K() {
        return "restore>PrepareMessageStoreTask/";
    }
}
