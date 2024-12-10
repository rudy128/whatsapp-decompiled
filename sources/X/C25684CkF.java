package X;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: X.CkF  reason: case insensitive filesystem */
public final class C25684CkF {
    public static final Map A07 = new AnonymousClass00O(0);
    public static final String[] A08;
    public final ContentResolver A00;
    public final ContentObserver A01;
    public final Object A02 = C17880vN.A0p();
    public final List A03 = AnonymousClass000.A13();
    public final Uri A04;
    public final Runnable A05;
    public volatile Map A06;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.00O, java.util.Map] */
    static {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "key";
        A1Z[1] = "value";
        A08 = A1Z;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.00O] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.util.Map A00() {
        /*
            r6 = this;
            android.content.ContentResolver r0 = r6.A00
            android.net.Uri r1 = r6.A04
            java.lang.String[] r2 = A08
            r3 = 0
            r5 = r3
            r4 = r3
            android.database.Cursor r3 = r0.query(r1, r2, r3, r4, r5)
            if (r3 != 0) goto L_0x0014
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
        L_0x0014:
            int r1 = r3.getCount()     // Catch:{ all -> 0x004c }
            if (r1 != 0) goto L_0x0022
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x004c }
            r3.close()
            return r0
        L_0x0022:
            r0 = 256(0x100, float:3.59E-43)
            if (r1 > r0) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            r0 = 1065353216(0x3f800000, float:1.0)
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x004c }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x004c }
            goto L_0x0034
        L_0x002f:
            X.00P r2 = new X.00P     // Catch:{ all -> 0x004c }
            r2.<init>(r1)     // Catch:{ all -> 0x004c }
        L_0x0034:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0048
            r0 = 0
            java.lang.String r1 = r3.getString(r0)     // Catch:{ all -> 0x004c }
            r0 = 1
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x004c }
            r2.put(r1, r0)     // Catch:{ all -> 0x004c }
            goto L_0x0034
        L_0x0048:
            r3.close()
            return r2
        L_0x004c:
            r0 = move-exception
            r3.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25684CkF.A00():java.util.Map");
    }

    public C25684CkF(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C22588BEn bEn = new C22588BEn(this);
        this.A01 = bEn;
        if (contentResolver != null) {
            this.A00 = contentResolver;
            this.A04 = uri;
            this.A05 = runnable;
            contentResolver.registerContentObserver(uri, false, bEn);
            return;
        }
        throw null;
    }
}
