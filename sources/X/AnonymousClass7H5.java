package X;

import android.database.ContentObserver;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7H5  reason: invalid class name */
public final class AnonymousClass7H5 implements C160878Ah {
    public final int A00;
    public final C160878Ah A01;
    public final HashMap A02;
    public final List A03;
    public final boolean A04;
    public final /* synthetic */ AnonymousClass7HA A05;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        if (r5.isEmpty() == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass7H5(X.AnonymousClass7HA r3, X.C160878Ah r4, java.util.List r5) {
        /*
            r2 = this;
            r0 = 2
            X.C18070vi.A0d(r4, r0)
            r2.A05 = r3
            r2.<init>()
            r2.A01 = r4
            r2.A03 = r5
            java.util.HashMap r0 = r4.BNm()
            r2.A02 = r0
            int r0 = r4.getCount()
            int r0 = X.C108945cZ.A0A(r5, r0)
            r2.A00 = r0
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x002a
            boolean r1 = r5.isEmpty()
            r0 = 1
            if (r1 != 0) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            r2.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7H5.<init>(X.7HA, X.8Ah, java.util.List):void");
    }

    public AnonymousClass8B2 BUY(int i) {
        List list = this.A03;
        if (i < list.size()) {
            return (AnonymousClass8B2) list.get(i);
        }
        return this.A01.BUY(i - list.size());
    }

    public AnonymousClass8B2 CCk(int i) {
        List list = this.A03;
        if (i >= list.size()) {
            return this.A01.CCk(i - list.size());
        }
        return (AnonymousClass8B2) list.get(i);
    }

    public void CFP() {
        this.A01.CFP();
    }

    public void close() {
        this.A01.close();
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        this.A01.registerContentObserver(contentObserver);
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        this.A01.unregisterContentObserver(contentObserver);
    }

    public HashMap BNm() {
        return this.A02;
    }

    public int getCount() {
        return this.A00;
    }

    public boolean isEmpty() {
        return this.A04;
    }
}
