package X;

import android.database.ContentObserver;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7H7  reason: invalid class name */
public class AnonymousClass7H7 implements C160878Ah {
    public int A00 = 0;
    public C109335dH A01;
    public final AnonymousClass1ST A02;
    public final AnonymousClass1BI A03;
    public final AnonymousClass1W6 A04;
    public final Map A05 = C17880vN.A11();
    public final C32021gV A06;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass7H2 A00(X.AnonymousClass7H7 r3, int r4) {
        /*
            r2 = 0
            monitor-enter(r3)     // Catch:{ all -> 0x002e }
            X.5dH r0 = r3.A01     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0029
            boolean r0 = r0.isClosed()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0029
            X.5dH r0 = r3.A01     // Catch:{ all -> 0x002b }
            boolean r0 = r0.moveToPosition(r4)     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0029
            X.5dH r0 = r3.A01     // Catch:{ all -> 0x002b }
            X.21V r1 = r0.A01()     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0029
            X.1gV r0 = r3.A06     // Catch:{ all -> 0x002b }
            X.7H2 r1 = X.C137216v6.A00(r1, r0)     // Catch:{ all -> 0x002b }
            java.util.Map r0 = r3.A05     // Catch:{ all -> 0x002b }
            X.C17880vN.A1O(r1, r0, r4)     // Catch:{ all -> 0x002b }
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            return r1
        L_0x0029:
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            return r2
        L_0x002b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002e }
        L_0x002e:
            r1 = move-exception
            java.lang.String r0 = "MediaGalleryList/error"
            com.whatsapp.util.Log.e(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7H7.A00(X.7H7, int):X.7H2");
    }

    public Cursor A01() {
        if (this instanceof AnonymousClass65I) {
            AnonymousClass65I r0 = (AnonymousClass65I) this;
            int i = r0.A00;
            int i2 = r0.A01;
            Cursor A022 = C31141f5.A02(r0.A02, r0.A03, i, i2);
            C18070vi.A0X(A022);
            return A022;
        }
        AnonymousClass1BI r1 = this.A03;
        C17960vV.A07(r1);
        return this.A02.A01(r1);
    }

    public /* bridge */ /* synthetic */ AnonymousClass8B2 BUY(int i) {
        AnonymousClass7H2 r1 = (AnonymousClass7H2) AnonymousClass000.A0w(this.A05, i);
        if (this.A01 == null || r1 != null || C22781De.A03()) {
            return r1;
        }
        return A00(this, i);
    }

    public void CFP() {
        C109335dH r2 = this.A01;
        if (r2 != null) {
            Cursor A012 = A01();
            r2.A01.close();
            r2.A01 = A012;
            r2.A00 = -1;
            r2.moveToPosition(-1);
        }
        this.A05.clear();
        this.A00 = 0;
    }

    public void close() {
        C109335dH r0 = this.A01;
        if (r0 != null) {
            r0.close();
        }
    }

    public int getCount() {
        C109335dH r0 = this.A01;
        if (r0 == null) {
            return 0;
        }
        return r0.getCount() - this.A00;
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        C109335dH r0 = this.A01;
        if (r0 != null) {
            try {
                r0.registerContentObserver(contentObserver);
            } catch (IllegalStateException e) {
                Log.e("MediaGalleryList/registerContentObserver/error", e);
            }
        }
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        C109335dH r0 = this.A01;
        if (r0 != null) {
            try {
                r0.unregisterContentObserver(contentObserver);
            } catch (IllegalStateException e) {
                Log.e("MediaGalleryList/unregisterContentObserver/error", e);
            }
        }
    }

    public AnonymousClass7H7(AnonymousClass1ST r2, AnonymousClass1BI r3, AnonymousClass1W6 r4, C32021gV r5) {
        this.A04 = r4;
        this.A02 = r2;
        this.A06 = r5;
        this.A03 = r3;
    }

    public HashMap BNm() {
        return C17880vN.A11();
    }

    public /* bridge */ /* synthetic */ AnonymousClass8B2 CCk(int i) {
        C17960vV.A00();
        try {
            return A00(this, i);
        } catch (Exception e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("MediaGalleryList/processMediaAt/position = ");
            A10.append(i);
            C17900vP.A0X(e, " ; e = ", A10);
            return null;
        }
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1P(getCount());
    }
}
