package X;

import java.util.SortedSet;

/* renamed from: X.5Ug  reason: invalid class name and case insensitive filesystem */
public final class C106025Ug extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ SortedSet $list;
    public final /* synthetic */ AnonymousClass4ZK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106025Ug(AnonymousClass4ZK r2, SortedSet sortedSet) {
        super(1);
        this.this$0 = r2;
        this.$list = sortedSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0094, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0095, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0098, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            java.util.AbstractCollection r10 = (java.util.AbstractCollection) r10
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            X.4ZK r5 = r9.this$0
            java.util.SortedSet r1 = r9.$list
            X.1Cd r0 = r5.A02
            X.1at r2 = r0.get()
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x0092 }
            X.206 r0 = r5.A03     // Catch:{ all -> 0x0092 }
            long r3 = r0.A0x     // Catch:{ all -> 0x0092 }
            java.lang.Object r0 = r1.last()     // Catch:{ all -> 0x0092 }
            X.206 r0 = (X.AnonymousClass206) r0     // Catch:{ all -> 0x0092 }
            long r0 = r0.A0y     // Catch:{ all -> 0x0092 }
            r8 = 100
            r7 = 0
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x0092 }
            X.C17880vN.A1V(r6, r7, r3)     // Catch:{ all -> 0x0092 }
            r3 = 1
            X.C17880vN.A1V(r6, r3, r0)     // Catch:{ all -> 0x0092 }
            r1 = 2
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0092 }
            r6[r1] = r0     // Catch:{ all -> 0x0092 }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0092 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0092 }
            java.lang.String r1 = X.C50862Wb.A02     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "SELECT_MORE_COMMENTS_FOR_PARENT_MESSAGE_QUERY_ID"
            android.database.Cursor r3 = r3.A0A(r1, r0, r6)     // Catch:{ all -> 0x0092 }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x0092 }
            int r0 = r3.getCount()     // Catch:{ all -> 0x008b }
            java.util.ArrayList r1 = X.C17880vN.A0z(r0)     // Catch:{ all -> 0x008b }
            r0 = -1
            r3.moveToPosition(r0)     // Catch:{ all -> 0x008b }
            boolean r0 = r3.isBeforeFirst()     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x005c
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x008b }
            if (r0 != 0) goto L_0x005c
            goto L_0x0074
        L_0x005c:
            boolean r0 = r3.isAfterLast()     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0063
            goto L_0x0074
        L_0x0063:
            X.1W6 r0 = r5.A04     // Catch:{ all -> 0x008b }
            X.206 r0 = r0.A01(r3)     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x006e
            r1.add(r0)     // Catch:{ all -> 0x008b }
        L_0x006e:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x008b }
            if (r0 != 0) goto L_0x0063
        L_0x0074:
            r3.close()     // Catch:{ all -> 0x0092 }
            r2.close()
            boolean r0 = r10.addAll(r1)
            java.util.concurrent.atomic.AtomicReference r1 = r5.A05
            if (r0 != 0) goto L_0x0088
            X.4D4 r0 = X.AnonymousClass4D4.COMPLETE
        L_0x0084:
            r1.set(r0)
            return r10
        L_0x0088:
            X.4D4 r0 = X.AnonymousClass4D4.INCOMPLETE
            goto L_0x0084
        L_0x008b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008d }
        L_0x008d:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0092 }
            throw r0     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106025Ug.invoke(java.lang.Object):java.lang.Object");
    }
}
