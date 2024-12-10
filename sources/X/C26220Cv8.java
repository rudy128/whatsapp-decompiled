package X;

import android.content.ContentResolver;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.Cv8  reason: case insensitive filesystem */
public final class C26220Cv8 {
    public Map A00 = C17880vN.A13();
    public Map A01 = C17880vN.A13();
    public Map A02 = C17880vN.A13();
    public final C25239Cba A03;
    public final C25946CpE A04;
    public final CNH A05;
    public final E4X A06;
    public final C18100vl A07 = AnonymousClass1DF.A01(new C27498DgR(this));
    public final C18100vl A08 = AnonymousClass1DF.A01(new C27499DgS(this));
    public final C18100vl A09 = AnonymousClass1DF.A01(new C27500DgT(this));
    public final C18100vl A0A = AnonymousClass1DF.A01(new C27501DgU(this));
    public final C18100vl A0B = AnonymousClass1DF.A01(new C27502DgV(this));
    public final C18100vl A0C = AnonymousClass1DF.A01(new C27503DgW(this));
    public final C18100vl A0D = AnonymousClass1DF.A01(new C27505DgY(this));
    public final C18100vl A0E = AnonymousClass1DF.A01(new C27508Dgb(this));
    public final C18100vl A0F = AnonymousClass1DF.A01(new C27509Dgc(this));
    public final C18100vl A0G = AnonymousClass1DF.A01(new C27511Dge(this));
    public final C18100vl A0H = AnonymousClass1DF.A01(new C27513Dgg(this));
    public final C18100vl A0I = AnonymousClass1DF.A01(new C27515Dgi(this));
    public final ContentResolver A0J;
    public final C24272ByV A0K;
    public final Set A0L;
    public final C18100vl A0M = AnonymousClass1DF.A01(new C27504DgX(this));
    public final C18100vl A0N = AnonymousClass1DF.A01(new C27506DgZ(this));
    public final C18100vl A0O = AnonymousClass1DF.A01(new C27507Dga(this));
    public final C18100vl A0P = AnonymousClass1DF.A01(new C27510Dgd(this));
    public final C18100vl A0Q = AnonymousClass1DF.A01(new C27512Dgf(this));
    public final C18100vl A0R = AnonymousClass1DF.A01(new C27514Dgh(this));
    public final boolean A0S;
    public final boolean A0T;

    public static final E4W A02(C26220Cv8 cv8, E4W e4w) {
        C25239Cba cba = cv8.A03;
        Executor executor = ((C26762DCr) cba.A07).A02;
        return A03(cv8, e4w, new ECv[]{new DDK(cba.A00, cba.A09, executor)});
    }

    public final E4W A05(E4W e4w) {
        C18070vi.A0d(e4w, 0);
        if (!C26212Cuq.A04()) {
            return A01(this, this.A03.A00(e4w));
        }
        C26212Cuq.A03("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        try {
            return A01(this, this.A03.A00(e4w));
        } finally {
            C26212Cuq.A01();
        }
    }

    public final synchronized DDD A06(C25946CpE cpE) {
        DDD ddd;
        boolean z = true;
        if (!C26212Cuq.A04()) {
            C25239Cba cba = this.A03;
            DD0 dd0 = new DD0(A00(this, new DDH(cba.A08, cba.A09, cpE)));
            if (!this.A0T || this.A0K == C24272ByV.NEVER) {
                z = false;
            }
            ddd = cba.A02(dd0, this.A06, z);
            C18070vi.A0b(ddd);
        } else {
            C26212Cuq.A03("ProducerSequenceFactory#createCommonNetworkFetchToEncodedMemorySequence");
            try {
                C25239Cba cba2 = this.A03;
                DD0 dd02 = new DD0(A00(this, new DDH(cba2.A08, cba2.A09, cpE)));
                if (!this.A0T || this.A0K == C24272ByV.NEVER) {
                    z = false;
                }
                ddd = cba2.A02(dd02, this.A06, z);
                C18070vi.A0b(ddd);
            } finally {
                C26212Cuq.A01();
            }
        }
        return ddd;
    }

    public static final C22861BSp A00(C26220Cv8 cv8, E4W e4w) {
        if (cv8.A0S) {
            if (!C26212Cuq.A04()) {
                C25239Cba cba = cv8.A03;
                E4K e4k = cba.A03;
                C24661CEb cEb = cba.A04;
                e4w = new DD9(e4k, cEb, new DDA(e4k, cEb, e4w));
            } else {
                C26212Cuq.A03("ProducerSequenceFactory#newDiskCacheSequence");
                try {
                    C25239Cba cba2 = cv8.A03;
                    E4K e4k2 = cba2.A03;
                    C24661CEb cEb2 = cba2.A04;
                    e4w = new DD9(e4k2, cEb2, new DDA(e4k2, cEb2, e4w));
                } finally {
                    C26212Cuq.A01();
                }
            }
        }
        C25239Cba cba3 = cv8.A03;
        E7Y e7y = cba3.A06;
        C24661CEb cEb3 = cba3.A04;
        return new C22861BSp(cEb3, new DDB(cEb3, e7y, e4w));
    }

    public static final E4W A01(C26220Cv8 cv8, E4W e4w) {
        C25239Cba cba = cv8.A03;
        E7Y e7y = cba.A05;
        C24661CEb cEb = cba.A04;
        return new DD8(cEb, e7y, new DD7(new C22860BSo(cEb, new DD8(cEb, e7y, e4w)), cv8.A05));
    }

    public C26220Cv8(ContentResolver contentResolver, C24272ByV byV, C25239Cba cba, C25946CpE cpE, CNH cnh, E4X e4x, Set set, boolean z, boolean z2) {
        C72473Md.A1I(contentResolver, cpE);
        C18070vi.A0l(cnh, byV);
        this.A0J = contentResolver;
        this.A03 = cba;
        this.A04 = cpE;
        this.A0T = z;
        this.A05 = cnh;
        this.A0K = byV;
        this.A0S = z2;
        this.A06 = e4x;
        this.A0L = set;
    }

    public static final E4W A03(C26220Cv8 cv8, E4W e4w, ECv[] eCvArr) {
        DD0 dd0 = new DD0(A00(cv8, e4w));
        C25239Cba cba = cv8.A03;
        E4X e4x = cv8.A06;
        return cv8.A05(new DD4(cba.A02(new DD3(eCvArr), e4x, true), new DDC(cba.A02(dd0, e4x, true), ((C26762DCr) cba.A07).A03)));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.E4W A04(X.C26220Cv8 r4, X.C25256Cbv r5) {
        /*
            boolean r0 = X.C26212Cuq.A04()
            java.lang.String r3 = "Unsupported uri scheme! Uri is: "
            if (r0 != 0) goto L_0x0084
            android.net.Uri r2 = r5.A03
            X.C18070vi.A0X(r2)
            int r0 = r5.A02
            if (r0 == 0) goto L_0x0064
            switch(r0) {
                case 2: goto L_0x0078;
                case 3: goto L_0x0061;
                case 4: goto L_0x0067;
                case 5: goto L_0x005e;
                case 6: goto L_0x005b;
                case 7: goto L_0x0058;
                case 8: goto L_0x0055;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.util.Set r0 = r4.A0L
            if (r0 == 0) goto L_0x002c
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002c
            r1.next()
            java.lang.String r0 = "getCustomDecodedImageSequence"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x002c:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A11(r3)
            java.lang.String r2 = X.C18070vi.A0H(r2)
            int r1 = r2.length()
            r0 = 30
            if (r1 <= r0) goto L_0x0050
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.AnonymousClass8BS.A0o(r2, r0)
            X.C18070vi.A0X(r0)
            r1.append(r0)
            java.lang.String r0 = "..."
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)
        L_0x0050:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r2, r3)
            throw r0
        L_0x0055:
            X.0vl r0 = r4.A0I
            goto L_0x007a
        L_0x0058:
            X.0vl r0 = r4.A0B
            goto L_0x007a
        L_0x005b:
            X.0vl r0 = r4.A0F
            goto L_0x007a
        L_0x005e:
            X.0vl r0 = r4.A0C
            goto L_0x007a
        L_0x0061:
            X.0vl r0 = r4.A0E
            goto L_0x007a
        L_0x0064:
            X.0vl r0 = r4.A0H
            goto L_0x007a
        L_0x0067:
            android.content.ContentResolver r0 = r4.A0J
            java.lang.String r2 = r0.getType(r2)
            r1 = 0
            if (r2 == 0) goto L_0x0081
            java.lang.String r0 = "video/"
            boolean r0 = X.AnonymousClass1YE.A0A(r2, r0, r1)
            if (r0 == 0) goto L_0x0081
        L_0x0078:
            X.0vl r0 = r4.A0G
        L_0x007a:
            java.lang.Object r0 = r0.getValue()
            X.E4W r0 = (X.E4W) r0
            return r0
        L_0x0081:
            X.0vl r0 = r4.A0D
            goto L_0x007a
        L_0x0084:
            java.lang.String r0 = "ProducerSequenceFactory#getBasicDecodedImageSequence"
            X.C26212Cuq.A03(r0)
            android.net.Uri r2 = r5.A03     // Catch:{ all -> 0x013b }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x013b }
            int r0 = r5.A02     // Catch:{ all -> 0x013b }
            if (r0 == 0) goto L_0x012f
            switch(r0) {
                case 2: goto L_0x0103;
                case 3: goto L_0x00fa;
                case 4: goto L_0x010c;
                case 5: goto L_0x00f1;
                case 6: goto L_0x00e8;
                case 7: goto L_0x00df;
                case 8: goto L_0x00d6;
                default: goto L_0x0095;
            }     // Catch:{ all -> 0x013b }
        L_0x0095:
            java.util.Set r0 = r4.A0L     // Catch:{ all -> 0x013b }
            if (r0 == 0) goto L_0x00ad
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x013b }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x013b }
            if (r0 == 0) goto L_0x00ad
            r1.next()     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "getCustomDecodedImageSequence"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)     // Catch:{ all -> 0x013b }
        L_0x00ac:
            throw r0     // Catch:{ all -> 0x013b }
        L_0x00ad:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A11(r3)     // Catch:{ all -> 0x013b }
            java.lang.String r2 = X.C18070vi.A0H(r2)     // Catch:{ all -> 0x013b }
            int r1 = r2.length()     // Catch:{ all -> 0x013b }
            r0 = 30
            if (r1 <= r0) goto L_0x00d1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x013b }
            java.lang.String r0 = X.AnonymousClass8BS.A0o(r2, r0)     // Catch:{ all -> 0x013b }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x013b }
            r1.append(r0)     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "..."
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x013b }
        L_0x00d1:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r2, r3)     // Catch:{ all -> 0x013b }
            goto L_0x00ac
        L_0x00d6:
            X.0vl r0 = r4.A0I     // Catch:{ all -> 0x013b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x013b }
            X.E4W r0 = (X.E4W) r0     // Catch:{ all -> 0x013b }
            goto L_0x0137
        L_0x00df:
            X.0vl r0 = r4.A0B     // Catch:{ all -> 0x013b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x013b }
            X.E4W r0 = (X.E4W) r0     // Catch:{ all -> 0x013b }
            goto L_0x0137
        L_0x00e8:
            X.0vl r0 = r4.A0F     // Catch:{ all -> 0x013b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x013b }
            X.E4W r0 = (X.E4W) r0     // Catch:{ all -> 0x013b }
            goto L_0x0137
        L_0x00f1:
            X.0vl r0 = r4.A0C     // Catch:{ all -> 0x013b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x013b }
            X.E4W r0 = (X.E4W) r0     // Catch:{ all -> 0x013b }
            goto L_0x0137
        L_0x00fa:
            X.0vl r0 = r4.A0E     // Catch:{ all -> 0x013b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x013b }
            X.E4W r0 = (X.E4W) r0     // Catch:{ all -> 0x013b }
            goto L_0x0137
        L_0x0103:
            X.0vl r0 = r4.A0G     // Catch:{ all -> 0x013b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x013b }
            X.E4W r0 = (X.E4W) r0     // Catch:{ all -> 0x013b }
            goto L_0x0137
        L_0x010c:
            android.content.ContentResolver r0 = r4.A0J     // Catch:{ all -> 0x013b }
            java.lang.String r2 = r0.getType(r2)     // Catch:{ all -> 0x013b }
            r1 = 0
            if (r2 == 0) goto L_0x0126
            java.lang.String r0 = "video/"
            boolean r0 = X.AnonymousClass1YE.A0A(r2, r0, r1)     // Catch:{ all -> 0x013b }
            if (r0 == 0) goto L_0x0126
            X.0vl r0 = r4.A0G     // Catch:{ all -> 0x013b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x013b }
            X.E4W r0 = (X.E4W) r0     // Catch:{ all -> 0x013b }
            goto L_0x0137
        L_0x0126:
            X.0vl r0 = r4.A0D     // Catch:{ all -> 0x013b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x013b }
            X.E4W r0 = (X.E4W) r0     // Catch:{ all -> 0x013b }
            goto L_0x0137
        L_0x012f:
            X.0vl r0 = r4.A0H     // Catch:{ all -> 0x013b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x013b }
            X.E4W r0 = (X.E4W) r0     // Catch:{ all -> 0x013b }
        L_0x0137:
            X.C26212Cuq.A01()
            return r0
        L_0x013b:
            r0 = move-exception
            X.C26212Cuq.A01()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26220Cv8.A04(X.Cv8, X.Cbv):X.E4W");
    }
}
