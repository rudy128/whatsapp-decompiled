package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.8oo  reason: invalid class name and case insensitive filesystem */
public class C170148oo extends AnonymousClass1NZ {
    public final AnonymousClass118 A00;
    public final C192719or A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r1 == null) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072 A[Catch:{ Exception -> 0x0084, all -> 0x009b }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0082 A[Catch:{ Exception -> 0x0084, all -> 0x009b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0S(X.C171768sF r14, java.io.File r15) {
        /*
            r13 = this;
            monitor-enter(r13)
            X.9or r1 = r13.A01     // Catch:{ all -> 0x00a0 }
            X.8ov r0 = r1.A00()     // Catch:{ all -> 0x00a0 }
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.A02     // Catch:{ all -> 0x00a0 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r5 = r0.writeLock()     // Catch:{ all -> 0x00a0 }
            r5.lock()     // Catch:{ all -> 0x00a0 }
            r10 = 0
            r1.A01()     // Catch:{ Exception -> 0x0084 }
            X.118 r0 = r1.A02     // Catch:{ Exception -> 0x0084 }
            android.content.Context r1 = r0.A00     // Catch:{ Exception -> 0x0084 }
            java.lang.String r0 = "commerce.db"
            java.io.File r9 = r1.getDatabasePath(r0)     // Catch:{ Exception -> 0x0084 }
            boolean r0 = r15.exists()     // Catch:{ Exception -> 0x0084 }
            r3 = 1
            if (r0 != 0) goto L_0x0033
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0084 }
            java.lang.String r0 = "commerce_backup_store/backup/backup-file-not-found"
            X.C17900vP.A0Y(r15, r0, r1)     // Catch:{ Exception -> 0x0084 }
            r5.unlock()     // Catch:{ all -> 0x00a0 }
            monitor-exit(r13)
            return r3
        L_0x0033:
            r15.length()     // Catch:{ Exception -> 0x0084 }
            X.00H r0 = r13.A03     // Catch:{ Exception -> 0x0084 }
            java.lang.Object r4 = r0.get()     // Catch:{ Exception -> 0x0084 }
            X.9mv r4 = (X.C191639mv) r4     // Catch:{ Exception -> 0x0084 }
            java.lang.String r1 = r15.getName()     // Catch:{ Exception -> 0x0084 }
            java.lang.String r0 = "commerce_backup.db"
            int r2 = X.A3K.A00(r1, r0)     // Catch:{ Exception -> 0x0084 }
            if (r2 <= 0) goto L_0x006d
            X.9JN r1 = X.AnonymousClass9JN.CRYPT13     // Catch:{ Exception -> 0x0084 }
            int r0 = r1.version     // Catch:{ Exception -> 0x0084 }
            if (r2 < r0) goto L_0x0056
            X.9JN r1 = X.AnonymousClass9JN.A02(r2)     // Catch:{ Exception -> 0x0084 }
            if (r1 == 0) goto L_0x006d
        L_0x0056:
            r8 = 0
            X.A5N r6 = r4.A00(r8, r1, r15, r10)     // Catch:{ Exception -> 0x0084 }
            X.118 r7 = r13.A00     // Catch:{ Exception -> 0x0084 }
            r12 = r10
            r11 = r10
            X.9jz r2 = r6.A07(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0084 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0084 }
            java.lang.String r0 = "commerce_backup_store/restore/result "
            X.C17900vP.A0Y(r2, r0, r1)     // Catch:{ Exception -> 0x0084 }
            goto L_0x0070
        L_0x006d:
            X.9JN r1 = X.AnonymousClass9JN.UNENCRYPTED     // Catch:{ Exception -> 0x0084 }
            goto L_0x0056
        L_0x0070:
            if (r14 == 0) goto L_0x007e
            int r0 = r2.A00     // Catch:{ Exception -> 0x0084 }
            int r0 = X.A3O.A00(r0)     // Catch:{ Exception -> 0x0084 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0084 }
            r14.A04 = r0     // Catch:{ Exception -> 0x0084 }
        L_0x007e:
            int r0 = r2.A00     // Catch:{ Exception -> 0x0084 }
            if (r0 != r3) goto L_0x0096
            r10 = 1
            goto L_0x0096
        L_0x0084:
            r1 = move-exception
            java.lang.String r0 = "commerce_backup_store/restore failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x009b }
            if (r14 == 0) goto L_0x0096
            int r0 = X.A3O.A02(r1)     // Catch:{ all -> 0x009b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x009b }
            r14.A04 = r0     // Catch:{ all -> 0x009b }
        L_0x0096:
            r5.unlock()     // Catch:{ all -> 0x00a0 }
            monitor-exit(r13)
            return r10
        L_0x009b:
            r0 = move-exception
            r5.unlock()     // Catch:{ all -> 0x00a0 }
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170148oo.A0S(X.8sF, java.io.File):boolean");
    }

    public ArrayList A0N(File file) {
        ArrayList A022 = A3K.A02(AnonymousClass9JN.CRYPT13);
        A022.add(".crypt1");
        return AnonymousClass8BU.A0v(file, "commerce_backup.db", A022);
    }

    public A26 A0T(C171828sL r18, AnonymousClass9JN r19) {
        File file;
        A26 a26;
        AnonymousClass1Ez r3 = new AnonymousClass1Ez("commerce-db");
        if (!A0L()) {
            Log.i("commerce_backup_store/backup/skip no media or read-only media");
            a26 = new A26("commerce-db", 1);
        } else {
            C192719or r4 = this.A01;
            ReentrantReadWriteLock.WriteLock writeLock = r4.A00().A02.writeLock();
            writeLock.lock();
            try {
                Log.i("commerce_backup_store/backup/close-backup-db");
                r4.A01();
                AnonymousClass9JN r7 = r19;
                if (r7 == AnonymousClass9JN.CRYPT13) {
                    file = C17880vN.A0e(this.A02.A03(), "commerce_backup.db.crypt1");
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("commerce_backup.db.crypt");
                    file = C17880vN.A0e(A0G(r7), C17880vN.A0t(A10, r7.version));
                }
                File databasePath = r4.A02.A00.getDatabasePath("commerce.db");
                if (!databasePath.exists()) {
                    C17900vP.A0Y(databasePath, "commerce_backup_store/backup/db-file-not-found", AnonymousClass000.A10());
                    a26 = new A26("commerce-db", 3);
                } else {
                    Iterator it = A0N(A0G(r7)).iterator();
                    while (it.hasNext()) {
                        File A0T = AnonymousClass8BS.A0T(it);
                        if (!A0T.equals(file)) {
                            C108985cd.A1C(A0T);
                        }
                    }
                    A5N A002 = ((C191639mv) this.A03.get()).A00((C19947A0e) null, r7, file, false);
                    if (C18020vd.A05(C18040vf.A02, this.A02, 8968)) {
                        Context context = this.A00.A00;
                        if (A002.A09(context, databasePath)) {
                            Log.i("commerce_backup_store/backup/skip backup because backup file has the same source file");
                            a26 = new A26("commerce-db", 2);
                        } else if (!A002.A0A(context, databasePath)) {
                            Log.w("commerce_backup_store/backup/failed to prepare for backup");
                            C64062u9.A0Q(file);
                            a26 = new A26("commerce-db", 1);
                        }
                    } else if (!A002.A0A(this.A00.A00, (File) null)) {
                        Log.w("commerce_backup_store/backup/failed to prepare for backup");
                        C64062u9.A0Q(file);
                        a26 = new A26("commerce-db", 1);
                    }
                    C17900vP.A0Y(file, "commerce_backup_store/backup/to ", AnonymousClass000.A10());
                    A002.A08((C72053Kl) null, databasePath);
                    a26 = new A26(file, (Long) null, "commerce-db", 0, A0E(A0G(r7)));
                }
            } catch (Exception e) {
                e.printStackTrace();
                Log.w("commerce_backup_store/backup/error", e);
                C64062u9.A0Q(file);
                a26 = new A26("commerce-db", 1);
            } catch (Throwable th) {
                writeLock.unlock();
                throw th;
            }
            writeLock.unlock();
        }
        C171828sL r1 = r18;
        r1.A07 = Integer.valueOf(A3O.A01(a26.A01));
        r1.A0I = AnonymousClass8BT.A0n(r3);
        return a26;
    }

    public C170148oo(AnonymousClass118 r1, AnonymousClass1NX r2, C192719or r3, C18030ve r4, AnonymousClass00H r5) {
        super(r2);
        this.A00 = r1;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
    }

    public void A0K(C171768sF r2, long j) {
        r2.A0D = Long.valueOf(j);
    }

    public String A0M() {
        return "commerce-db";
    }

    public void A0O(C171878sQ r2, double d) {
        r2.A0N = Double.valueOf(d);
    }

    public void A0P(C171878sQ r2, double d) {
        r2.A0O = Double.valueOf(d);
    }

    public void A0Q(C171878sQ r2, double d) {
        r2.A0M = Double.valueOf(d);
    }
}
