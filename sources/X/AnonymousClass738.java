package X;

import android.util.LongSparseArray;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.738  reason: invalid class name */
public final class AnonymousClass738 {
    public final LongSparseArray A00 = new LongSparseArray(0);
    public final AnonymousClass00H A01;
    public volatile boolean A02;

    public AnonymousClass738(AnonymousClass00H r3) {
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
    }

    public static final Integer A00(C122646Re r1, AnonymousClass738 r2, long j) {
        C123446Um r3 = (C123446Um) r2.A00.get(j);
        if (r1.ordinal() != 0) {
            if (r3 != null) {
                return r3.A01;
            }
            return null;
        } else if (r3 != null) {
            return r3.A00;
        } else {
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.6Um, java.lang.Object] */
    public static final void A01(C122646Re r4, AnonymousClass738 r5, Integer num, long j) {
        LongSparseArray longSparseArray = r5.A00;
        ? obj = new Object();
        obj.A00 = null;
        obj.A01 = null;
        Object obj2 = longSparseArray.get(j);
        Object obj3 = obj;
        if (obj2 != null) {
            obj3 = obj2;
        }
        C123446Um r2 = (C123446Um) obj3;
        int ordinal = r4.ordinal();
        if (ordinal == 0) {
            r2.A00 = num;
        } else if (ordinal == 1) {
            r2.A01 = num;
        }
        longSparseArray.put(j, r2);
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [X.6Um, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ac, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00af, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass738 r13) {
        /*
            boolean r0 = r13.A02
            if (r0 != 0) goto L_0x00b8
            monitor-enter(r13)
            boolean r0 = r13.A02     // Catch:{ all -> 0x00b4 }
            if (r0 != 0) goto L_0x00b7
            X.00H r0 = r13.A01     // Catch:{ all -> 0x00b4 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00b4 }
            X.73E r0 = (X.AnonymousClass73E) r0     // Catch:{ all -> 0x00b4 }
            android.util.LongSparseArray r6 = new android.util.LongSparseArray     // Catch:{ all -> 0x00b4 }
            r6.<init>()     // Catch:{ all -> 0x00b4 }
            X.1Cd r0 = r0.A00     // Catch:{ all -> 0x00b4 }
            X.1at r5 = r0.get()     // Catch:{ all -> 0x00b4 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00ad }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "SELECT status_message_row_id, state, destination FROM status_crossposting_v3"
            java.lang.String r0 = "SELECT_STATE_LIST"
            r10 = 0
            android.database.Cursor r8 = r2.A0A(r1, r0, r10)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = "status_message_row_id"
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "state"
            int r7 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "destination"
            int r4 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a6 }
        L_0x003c:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x007d
            long r1 = r8.getLong(r9)     // Catch:{ all -> 0x00a6 }
            int r12 = r8.getInt(r7)     // Catch:{ all -> 0x00a6 }
            int r11 = r8.getInt(r4)     // Catch:{ all -> 0x00a6 }
            X.6Um r3 = new X.6Um     // Catch:{ all -> 0x00a6 }
            r3.<init>()     // Catch:{ all -> 0x00a6 }
            r3.A00 = r10     // Catch:{ all -> 0x00a6 }
            r3.A01 = r10     // Catch:{ all -> 0x00a6 }
            java.lang.Object r0 = r6.get(r1)     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x005e
            r3 = r0
        L_0x005e:
            X.6Um r3 = (X.C123446Um) r3     // Catch:{ all -> 0x00a6 }
            X.6Re r0 = X.C122646Re.FACEBOOK     // Catch:{ all -> 0x00a6 }
            int r0 = r0.databaseValue     // Catch:{ all -> 0x00a6 }
            if (r11 != r0) goto L_0x0070
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x00a6 }
            r3.A00 = r0     // Catch:{ all -> 0x00a6 }
        L_0x006c:
            r6.put(r1, r3)     // Catch:{ all -> 0x00a6 }
            goto L_0x003c
        L_0x0070:
            X.6Re r0 = X.C122646Re.INSTAGRAM     // Catch:{ all -> 0x00a6 }
            int r0 = r0.databaseValue     // Catch:{ all -> 0x00a6 }
            if (r11 != r0) goto L_0x006c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x00a6 }
            r3.A01 = r0     // Catch:{ all -> 0x00a6 }
            goto L_0x006c
        L_0x007d:
            r8.close()     // Catch:{ all -> 0x00ad }
            r5.close()     // Catch:{ all -> 0x00b4 }
            android.util.LongSparseArray r5 = r13.A00     // Catch:{ all -> 0x00b4 }
            monitor-enter(r5)     // Catch:{ all -> 0x00b4 }
            r5.clear()     // Catch:{ all -> 0x00a3 }
            int r4 = r6.size()     // Catch:{ all -> 0x00a3 }
            r3 = 0
        L_0x008e:
            if (r3 >= r4) goto L_0x009e
            long r1 = r6.keyAt(r3)     // Catch:{ all -> 0x00a3 }
            java.lang.Object r0 = r6.valueAt(r3)     // Catch:{ all -> 0x00a3 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00a3 }
            int r3 = r3 + 1
            goto L_0x008e
        L_0x009e:
            monitor-exit(r5)     // Catch:{ all -> 0x00b4 }
            r0 = 1
            r13.A02 = r0     // Catch:{ all -> 0x00b4 }
            goto L_0x00b7
        L_0x00a3:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b4 }
            goto L_0x00b3
        L_0x00a6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x00ad }
            throw r0     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00af }
        L_0x00af:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x00b4 }
        L_0x00b3:
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x00b7:
            monitor-exit(r13)
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass738.A02(X.738):void");
    }

    public final Integer A03(C122646Re r3, long j) {
        Integer A002;
        if (!this.A02) {
            Log.e("[WAFFLE] WaffleStatusCrosspostStateCache/getNonBlocking cache not initialized");
            return null;
        }
        synchronized (this.A00) {
            A002 = A00(r3, this, j);
        }
        return A002;
    }

    public final boolean A05(C122646Re r4, long j) {
        boolean z = false;
        if (!this.A02) {
            Log.e("[WAFFLE] WaffleStatusCrosspostStateCache/containsKeyNonBlocking cache not initialized");
            return false;
        }
        synchronized (this.A00) {
            if (A00(r4, this, j) != null) {
                z = true;
            }
        }
        return z;
    }

    public final void A04(C122646Re r6, Collection collection, int i) {
        A02(this);
        synchronized (this.A00) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                A01(r6, this, Integer.valueOf(i), C17890vO.A07(it));
            }
        }
    }
}
