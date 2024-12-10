package X;

import com.whatsapp.InteractiveAnnotation;
import java.util.Set;

/* renamed from: X.32s  reason: invalid class name and case insensitive filesystem */
public final class C682732s implements C25341Nv {
    public final AnonymousClass1Cd A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public boolean Bca(AnonymousClass206 r8) {
        C62572rc r0;
        InteractiveAnnotation[] interactiveAnnotationArr;
        int length;
        C49482Qq r1;
        C18070vi.A0d(r8, 0);
        if (!(r8 instanceof AnonymousClass21V) || (r0 = ((AnonymousClass21V) r8).A02) == null || (interactiveAnnotationArr = r0.A0b) == null || (length = interactiveAnnotationArr.length) == 0) {
            return false;
        }
        int i = 0;
        do {
            InteractiveAnnotation interactiveAnnotation = interactiveAnnotationArr[i];
            if (interactiveAnnotation != null) {
                r1 = interactiveAnnotation.type;
            } else {
                r1 = null;
            }
            if (r1 == C49482Qq.LINKCLICK) {
                return true;
            }
            i++;
        } while (i < length);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bhl(X.AnonymousClass25F r8) {
        /*
            r7 = this;
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.206 r1 = r8.A00
            X.C18070vi.A0d(r1, r0)
            java.lang.Class<X.7LD> r0 = X.AnonymousClass7LD.class
            X.25F r6 = X.C18070vi.A09(r1, r0)
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            X.1Cd r0 = r7.A00
            X.1at r4 = r0.get()
            X.00H r0 = r7.A02     // Catch:{ all -> 0x005a }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x005a }
            X.1RU r3 = (X.AnonymousClass1RU) r3     // Catch:{ all -> 0x005a }
            X.C18070vi.A0b(r4)     // Catch:{ all -> 0x005a }
            long r1 = r1.A0x     // Catch:{ all -> 0x005a }
            X.6RT r0 = X.AnonymousClass6RT.STATUS_TAPPABLE_MESSAGE     // Catch:{ all -> 0x005a }
            android.database.Cursor r2 = r3.BMu(r4, r0, r1)     // Catch:{ all -> 0x005a }
        L_0x002c:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0044
            X.00H r0 = r7.A01     // Catch:{ all -> 0x0053 }
            X.206 r1 = X.AnonymousClass1W6.A00(r2, r0)     // Catch:{ all -> 0x0053 }
            boolean r0 = r1 instanceof X.AnonymousClass210     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x002c
            X.210 r1 = (X.AnonymousClass210) r1     // Catch:{ all -> 0x0053 }
            if (r1 == 0) goto L_0x002c
            r5.add(r1)     // Catch:{ all -> 0x0053 }
            goto L_0x002c
        L_0x0044:
            r2.close()     // Catch:{ all -> 0x005a }
            r4.close()
            X.7LD r0 = new X.7LD
            r0.<init>(r5)
            r6.A02(r0)
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
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C682732s.Bhl(X.25F):void");
    }

    public Set BZv() {
        return C18070vi.A0P(AnonymousClass7LD.class);
    }

    public C682732s(AnonymousClass1Cd r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
