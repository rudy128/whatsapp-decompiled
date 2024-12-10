package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.util.Set;

/* renamed from: X.32w  reason: invalid class name and case insensitive filesystem */
public final class C683132w implements C25341Nv {
    public final AnonymousClass1Cd A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final C18030ve A03;

    public boolean Bca(AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        if ((r4 instanceof C445823z) && r4.A0z(ZipDecompressor.UNZIP_BUFFER_SIZE)) {
            if (!C18020vd.A05(C18040vf.A02, this.A03, 8792)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Set BZv() {
        return C18070vi.A0P(C692636n.class);
    }

    public C683132w(AnonymousClass1Cd r1, C18030ve r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r3, r1, r4);
        this.A03 = r2;
        this.A01 = r3;
        this.A00 = r1;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bhl(X.AnonymousClass25F r8) {
        /*
            r7 = this;
            X.206 r6 = X.C18070vi.A08(r8)
            java.lang.Class<X.23z> r1 = X.C445823z.class
            boolean r0 = r6 instanceof X.C445823z
            if (r0 != 0) goto L_0x0021
            java.lang.String r3 = X.C17890vO.A0U(r6)
            java.lang.String r2 = r1.getName()
            java.lang.String r0 = ""
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = X.C17890vO.A0W(r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass206.A02(r6, r2, r3, r0, r1)
            throw r0
        L_0x0021:
            X.23z r6 = (X.C445823z) r6
            X.25F r5 = r6.A09
            X.1Cd r0 = r7.A00
            X.1at r4 = r0.get()
            X.00H r0 = r7.A02     // Catch:{ all -> 0x0067 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x0067 }
            X.1RU r3 = (X.AnonymousClass1RU) r3     // Catch:{ all -> 0x0067 }
            X.C18070vi.A0b(r4)     // Catch:{ all -> 0x0067 }
            long r1 = r6.A0x     // Catch:{ all -> 0x0067 }
            X.6RT r0 = X.AnonymousClass6RT.EVENT_COVER_IMAGE     // Catch:{ all -> 0x0067 }
            android.database.Cursor r2 = r3.BMu(r4, r0, r1)     // Catch:{ all -> 0x0067 }
        L_0x003e:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0060 }
            r1 = 0
            if (r0 == 0) goto L_0x0051
            X.00H r0 = r7.A01     // Catch:{ all -> 0x0060 }
            X.206 r1 = X.AnonymousClass1W6.A00(r2, r0)     // Catch:{ all -> 0x0060 }
            boolean r0 = r1 instanceof X.C438421d     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x003e
            X.21d r1 = (X.C438421d) r1     // Catch:{ all -> 0x0060 }
        L_0x0051:
            r2.close()     // Catch:{ all -> 0x0067 }
            r4.close()
            X.36n r0 = new X.36n
            r0.<init>(r1)
            r5.A02(r0)
            return
        L_0x0060:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0067 }
            throw r0     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C683132w.Bhl(X.25F):void");
    }
}
