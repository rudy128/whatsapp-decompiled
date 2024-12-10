package X;

/* renamed from: X.2kP  reason: invalid class name and case insensitive filesystem */
public final class C58262kP {
    public final AnonymousClass1Cd A00;

    public C58262kP(AnonymousClass1Cd r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C693236t A00(long r8) {
        /*
            r7 = this;
            X.1Cd r0 = r7.A00
            X.1at r5 = r0.get()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0050 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = X.C50722Vn.A00     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "SELECT \nparent_message_row_id,\nassociation_type\nFROM message_association\nWHERE\nchild_message_row_id =?\nLIMIT 1"
            java.lang.String[] r1 = X.C17900vP.A0t(r8)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "GET_MESSAGE_ASSOCIATION_FOR_MSG_ROW_ID_SQL"
            android.database.Cursor r6 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0050 }
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0049 }
            r4 = 0
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "parent_message_row_id"
            long r2 = X.C17890vO.A06(r6, r0)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "association_type"
            int r0 = X.C17890vO.A01(r6, r0)     // Catch:{ all -> 0x0049 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0049 }
            X.6RT r1 = X.C50392Ug.A00(r0)     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0042
            X.36t r0 = new X.36t     // Catch:{ all -> 0x0049 }
            r0.<init>(r1, r4, r2)     // Catch:{ all -> 0x0049 }
            r6.close()     // Catch:{ all -> 0x0050 }
            r5.close()
            return r0
        L_0x0042:
            r6.close()     // Catch:{ all -> 0x0050 }
            r5.close()
            return r4
        L_0x0049:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x0050 }
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58262kP.A00(long):X.36t");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A01(long r8) {
        /*
            r7 = this;
            java.lang.String[] r3 = X.C17880vN.A1Y()
            r0 = 0
            X.C17880vN.A1V(r3, r0, r8)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            X.1Cd r0 = r7.A00
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0053 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = X.C50722Vn.A00     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "SELECT message_association.child_message_row_id\n    , message_association.association_type\nFROM message_association\nWHERE\n    parent_message_row_id = ?"
            java.lang.String r0 = "SELECT_ALL_CHILD_MESSAGE_ROW_ID_AND_ASSOCIATION_TYPE_FOR_PARENT_MESSAGE_ROW_QUERY_ID"
            android.database.Cursor r5 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x0053 }
        L_0x0021:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "child_message_row_id"
            long r2 = X.C17890vO.A06(r5, r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = "association_type"
            int r0 = X.C17890vO.A01(r5, r0)     // Catch:{ all -> 0x004c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x004c }
            X.6RT r1 = X.C50392Ug.A00(r0)     // Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x0021
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x004c }
            X.AnonymousClass1D6.A02(r0, r1, r6)     // Catch:{ all -> 0x004c }
            goto L_0x0021
        L_0x0045:
            r5.close()     // Catch:{ all -> 0x0053 }
            r4.close()
            return r6
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58262kP.A01(long):java.util.ArrayList");
    }
}
