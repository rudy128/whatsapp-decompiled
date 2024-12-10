package X;

import android.database.Cursor;

/* renamed from: X.218  reason: invalid class name */
public abstract class AnonymousClass218 extends AnonymousClass206 {
    public double A00;
    public double A01;
    public int A02;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r3.A02 == 2) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A16() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = super.A16()     // Catch:{ all -> 0x0010 }
            if (r0 != 0) goto L_0x000d
            int r2 = r3.A02     // Catch:{ all -> 0x0010 }
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x000e
        L_0x000d:
            r0 = 1
        L_0x000e:
            monitor-exit(r3)
            return r0
        L_0x0010:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass218.A16():boolean");
    }

    public void A17(Cursor cursor) {
        this.A00 = cursor.getDouble(cursor.getColumnIndexOrThrow("latitude"));
        this.A01 = cursor.getDouble(cursor.getColumnIndexOrThrow("longitude"));
        A15(cursor.getBlob(cursor.getColumnIndexOrThrow("thumbnail")), true);
    }

    public void A18(Cursor cursor, AnonymousClass11S r4) {
        this.A00 = cursor.getDouble(cursor.getColumnIndexOrThrow("latitude"));
        this.A01 = cursor.getDouble(cursor.getColumnIndexOrThrow("longitude"));
        this.A02 = cursor.getInt(cursor.getColumnIndexOrThrow("map_download_status"));
    }

    public C693336u A0O() {
        C693336u A0O = super.A0O();
        C17960vV.A07(A0O);
        return A0O;
    }
}
