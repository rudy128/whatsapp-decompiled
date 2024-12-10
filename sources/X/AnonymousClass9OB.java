package X;

/* renamed from: X.9OB  reason: invalid class name */
public abstract class AnonymousClass9OB {
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ac, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00af, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.database.Cursor A00(X.C20076A6c r9, X.BA0 r10, boolean r11) {
        /*
            r9.A05()
            r9.A06()
            X.BE1 r0 = r9.A03()
            X.AHV r0 = (X.AHV) r0
            X.0vl r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.8CH r0 = (X.AnonymousClass8CH) r0
            X.BE3 r0 = r0.A00()
            android.database.Cursor r6 = r0.CD7(r10)
            if (r11 == 0) goto L_0x00b0
            boolean r0 = r6 instanceof android.database.AbstractWindowedCursor
            if (r0 == 0) goto L_0x00b0
            r1 = r6
            android.database.AbstractWindowedCursor r1 = (android.database.AbstractWindowedCursor) r1
            int r3 = r1.getCount()
            boolean r0 = r1.hasWindow()
            if (r0 == 0) goto L_0x0045
            android.database.CursorWindow r0 = r1.getWindow()
            int r2 = r0.getNumRows()
        L_0x0037:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x003f
            if (r2 >= r3) goto L_0x00b0
        L_0x003f:
            r10 = 4
            r9 = 3
            r8 = 2
            r11 = 0
            r7 = 1
            goto L_0x0047
        L_0x0045:
            r2 = r3
            goto L_0x0037
        L_0x0047:
            java.lang.String[] r1 = r6.getColumnNames()     // Catch:{ all -> 0x00a9 }
            int r0 = r6.getCount()     // Catch:{ all -> 0x00a9 }
            android.database.MatrixCursor r5 = new android.database.MatrixCursor     // Catch:{ all -> 0x00a9 }
            r5.<init>(r1, r0)     // Catch:{ all -> 0x00a9 }
        L_0x0054:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a5
            int r0 = r6.getColumnCount()     // Catch:{ all -> 0x00a9 }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x00a9 }
            int r3 = r6.getColumnCount()     // Catch:{ all -> 0x00a9 }
            r2 = 0
        L_0x0065:
            if (r2 >= r3) goto L_0x009b
            int r0 = r6.getType(r2)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0096
            if (r0 == r7) goto L_0x008e
            if (r0 == r8) goto L_0x0083
            if (r0 == r9) goto L_0x007c
            if (r0 != r10) goto L_0x009f
            byte[] r0 = r6.getBlob(r2)     // Catch:{ all -> 0x00a9 }
            r4[r2] = r0     // Catch:{ all -> 0x00a9 }
            goto L_0x0098
        L_0x007c:
            java.lang.String r0 = r6.getString(r2)     // Catch:{ all -> 0x00a9 }
            r4[r2] = r0     // Catch:{ all -> 0x00a9 }
            goto L_0x0098
        L_0x0083:
            double r0 = r6.getDouble(r2)     // Catch:{ all -> 0x00a9 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x00a9 }
            r4[r2] = r0     // Catch:{ all -> 0x00a9 }
            goto L_0x0098
        L_0x008e:
            long r0 = r6.getLong(r2)     // Catch:{ all -> 0x00a9 }
            X.AnonymousClass3MX.A1S(r4, r2, r0)     // Catch:{ all -> 0x00a9 }
            goto L_0x0098
        L_0x0096:
            r4[r2] = r11     // Catch:{ all -> 0x00a9 }
        L_0x0098:
            int r2 = r2 + 1
            goto L_0x0065
        L_0x009b:
            r5.addRow(r4)     // Catch:{ all -> 0x00a9 }
            goto L_0x0054
        L_0x009f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a9 }
            r0.<init>()     // Catch:{ all -> 0x00a9 }
            throw r0     // Catch:{ all -> 0x00a9 }
        L_0x00a5:
            r6.close()
            return r5
        L_0x00a9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        L_0x00b0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9OB.A00(X.A6c, X.BA0, boolean):android.database.Cursor");
    }
}
