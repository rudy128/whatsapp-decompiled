package X;

import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2rN  reason: invalid class name and case insensitive filesystem */
public final class C62422rN {
    public final C001100p A00 = new C001100p(10);
    public final AnonymousClass00H A01;
    public volatile boolean A02;

    public C62422rN(AnonymousClass00H r3) {
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
    }

    public final void A02(Collection collection, int i) {
        C18070vi.A0d(collection, 0);
        A00(this);
        C001100p r4 = this.A00;
        synchronized (r4) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                r4.A0A(C17890vO.A07(it), Integer.valueOf(i));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0082, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C62422rN r8) {
        /*
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x008b
            monitor-enter(r8)
            boolean r0 = r8.A02     // Catch:{ all -> 0x0087 }
            if (r0 != 0) goto L_0x008a
            X.00H r0 = r8.A01     // Catch:{ all -> 0x0087 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0087 }
            X.72Q r1 = (X.AnonymousClass72Q) r1     // Catch:{ all -> 0x0087 }
            r3 = 0
            r0 = 10
            X.00p r6 = new X.00p     // Catch:{ all -> 0x0087 }
            r6.<init>(r0)     // Catch:{ all -> 0x0087 }
            X.1Cd r0 = r1.A00     // Catch:{ all -> 0x0087 }
            X.1at r5 = r0.get()     // Catch:{ all -> 0x0087 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0080 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0080 }
            java.lang.String r1 = "SELECT status_message_row_id, state FROM status_crossposting"
            java.lang.String r0 = "SELECT_STATE_LIST"
            android.database.Cursor r7 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = "status_message_row_id"
            int r4 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = "state"
            int r3 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0079 }
        L_0x003a:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0050
            long r1 = r7.getLong(r4)     // Catch:{ all -> 0x0079 }
            int r0 = r7.getInt(r3)     // Catch:{ all -> 0x0079 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0079 }
            r6.A0A(r1, r0)     // Catch:{ all -> 0x0079 }
            goto L_0x003a
        L_0x0050:
            r7.close()     // Catch:{ all -> 0x0080 }
            r5.close()     // Catch:{ all -> 0x0087 }
            X.00p r5 = r8.A00     // Catch:{ all -> 0x0087 }
            monitor-enter(r5)     // Catch:{ all -> 0x0087 }
            r5.A07()     // Catch:{ all -> 0x0076 }
            int r4 = r6.A00()     // Catch:{ all -> 0x0076 }
            r3 = 0
        L_0x0061:
            if (r3 >= r4) goto L_0x0071
            long r1 = r6.A02(r3)     // Catch:{ all -> 0x0076 }
            java.lang.Object r0 = r6.A04(r3)     // Catch:{ all -> 0x0076 }
            r5.A0A(r1, r0)     // Catch:{ all -> 0x0076 }
            int r3 = r3 + 1
            goto L_0x0061
        L_0x0071:
            monitor-exit(r5)     // Catch:{ all -> 0x0087 }
            r0 = 1
            r8.A02 = r0     // Catch:{ all -> 0x0087 }
            goto L_0x008a
        L_0x0076:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0087 }
            goto L_0x0086
        L_0x0079:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007b }
        L_0x007b:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x0080 }
            throw r0     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0087 }
        L_0x0086:
            throw r0     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x008a:
            monitor-exit(r8)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62422rN.A00(X.2rN):void");
    }

    public final Integer A01(long j) {
        Integer num;
        if (!this.A02) {
            Log.e("[XFAM] XFamilyStatusCrosspostStateCache/getNonBlocking cache not initialized");
            return null;
        }
        C001100p r1 = this.A00;
        synchronized (r1) {
            num = (Integer) r1.A05(j);
        }
        return num;
    }

    public final boolean A03(long j) {
        boolean A1Q;
        if (!this.A02) {
            Log.e("[XFAM] XFamilyStatusCrosspostStateCache/containsKeyNonBlocking cache not initialized");
            return false;
        }
        C001100p r1 = this.A00;
        synchronized (r1) {
            A1Q = AnonymousClass000.A1Q(r1.A01(j));
        }
        return A1Q;
    }
}
