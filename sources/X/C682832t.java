package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Set;

/* renamed from: X.32t  reason: invalid class name and case insensitive filesystem */
public final class C682832t implements C25341Nv {
    public final AnonymousClass1Cd A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final C18030ve A03;

    public boolean Bca(AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        if ((r4 instanceof AnonymousClass247) && r4.A0z(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
            if (!C18020vd.A05(C18040vf.A02, this.A03, 8528)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Set BZv() {
        return C18070vi.A0P(C692536m.class);
    }

    public C682832t(AnonymousClass1Cd r1, C18030ve r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r3, r1, r4);
        this.A03 = r2;
        this.A01 = r3;
        this.A00 = r1;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005d, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0060, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bhl(X.AnonymousClass25F r9) {
        /*
            r8 = this;
            X.206 r7 = X.C18070vi.A08(r9)
            boolean r0 = r7 instanceof X.AnonymousClass247
            if (r0 == 0) goto L_0x0061
            X.247 r7 = (X.AnonymousClass247) r7
            if (r7 == 0) goto L_0x0061
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            X.1Cd r0 = r8.A00
            X.1at r4 = r0.get()
            X.00H r0 = r8.A02     // Catch:{ all -> 0x005a }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x005a }
            X.1RU r3 = (X.AnonymousClass1RU) r3     // Catch:{ all -> 0x005a }
            X.C18070vi.A0b(r4)     // Catch:{ all -> 0x005a }
            long r1 = r7.A0x     // Catch:{ all -> 0x005a }
            X.6RT r0 = X.AnonymousClass6RT.MEDIA_ALBUM     // Catch:{ all -> 0x005a }
            android.database.Cursor r2 = r3.BMu(r4, r0, r1)     // Catch:{ all -> 0x005a }
        L_0x002d:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0049
            X.00H r0 = r8.A01     // Catch:{ all -> 0x0053 }
            X.206 r1 = X.AnonymousClass1W6.A00(r2, r0)     // Catch:{ all -> 0x0053 }
            boolean r0 = r1 instanceof X.AnonymousClass21V     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0041
            r6.add(r1)     // Catch:{ all -> 0x0053 }
            goto L_0x002d
        L_0x0041:
            boolean r0 = r1 instanceof X.AnonymousClass23N     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x002d
            r5.add(r1)     // Catch:{ all -> 0x0053 }
            goto L_0x002d
        L_0x0049:
            r2.close()     // Catch:{ all -> 0x005a }
            r4.close()
            r7.A19(r6, r5)
            return
        L_0x0053:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x005a }
            throw r0     // Catch:{ all -> 0x005a }
        L_0x005a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C682832t.Bhl(X.25F):void");
    }
}
