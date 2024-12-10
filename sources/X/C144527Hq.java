package X;

import com.facebook.stash.core.FileStash;
import java.io.File;

/* renamed from: X.7Hq  reason: invalid class name and case insensitive filesystem */
public final class C144527Hq implements AnonymousClass893 {
    public FileStash A00;
    public final C116065wK A01;
    public final C25655Cjl A02;

    public static final synchronized void A00(C144527Hq r2) {
        synchronized (r2) {
            if (!C22781De.A03() && r2.A00 == null) {
                r2.A00 = r2.A02.A01(112);
            }
        }
    }

    public C128506gA BM6(String str) {
        File file;
        if (str != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(C17970vW.A04(str));
            String A0y = AnonymousClass000.A0y(".gif", A10);
            A00(this);
            C116065wK r7 = this.A01;
            C128506gA A0G = r7.A0G(A0y);
            if (A0G != null || C22781De.A03()) {
                return A0G;
            }
            FileStash fileStash = this.A00;
            if (!(fileStash == null || (file = fileStash.getFile(A0y)) == null)) {
                if (file.length() <= 0) {
                    return A0G;
                }
                byte[] A04 = C1408873l.A04(file);
                String path = file.getPath();
                C18070vi.A0X(path);
                C128506gA r6 = new C128506gA(path, A04, str);
                r7.A0F(A0y, r6);
                return r6;
            }
        }
        return null;
    }

    public void CD1(C128506gA r3, String str) {
        if (str != null) {
            A00(this);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(C17970vW.A04(str));
            this.A01.A0F(AnonymousClass000.A0y(".gif", A10), r3);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.1Lm, X.1Mz, X.5wK] */
    public C144527Hq(C125086aT r6, C25655Cjl cjl) {
        C18070vi.A0j(cjl, r6);
        this.A02 = cjl;
        AnonymousClass10E r1 = r6.A00.A00;
        C24571Kv r4 = (C24571Kv) r1.ABZ.get();
        AnonymousClass11N r3 = (AnonymousClass11N) r1.A96.get();
        C18070vi.A0j(r4, r3);
        ? r0 = new C25131Mz(r3, r4, "gifmemorycache", 256);
        r0.A09();
        this.A01 = r0;
    }
}
