package X;

import java.io.File;
import java.util.HashMap;

/* renamed from: X.2E5  reason: invalid class name */
public class AnonymousClass2E5 extends C24531Kr {
    public final HashMap A00 = C17880vN.A11();

    public synchronized HashMap A0E() {
        HashMap hashMap;
        C62612rg A06;
        String[] list;
        hashMap = this.A00;
        if (hashMap.isEmpty() && (A06 = A06()) != null) {
            File A0e = C17880vN.A0e(this.A07.A00.getFilesDir(), C17900vP.A0A("downloadable/filter_", A06.A01()));
            if (!A0e.exists() || (list = A0e.list()) == null) {
                A08();
            } else {
                String absolutePath = A0e.getAbsolutePath();
                for (String str : list) {
                    hashMap.put(str, new File(absolutePath, str));
                }
            }
        }
        return hashMap;
    }

    public synchronized void A0F(C72233Ld r4, int i) {
        this.A0E.CGF(new C70863Cu(this, i, 11, r4));
    }

    public synchronized boolean A0G() {
        return !A0E().isEmpty();
    }

    public AnonymousClass2E5(AnonymousClass190 r2, AnonymousClass181 r3, AnonymousClass11E r4, AnonymousClass11P r5, AnonymousClass118 r6, C24521Kq r7, C19830z4 r8, C24491Kn r9, C18030ve r10, AnonymousClass18K r11, AnonymousClass1D9 r12, C24481Km r13, C220418j r14, AnonymousClass10I r15) {
        super(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
    }
}
