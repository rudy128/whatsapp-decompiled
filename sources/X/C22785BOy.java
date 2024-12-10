package X;

import android.net.Uri;
import java.util.concurrent.ExecutorService;

/* renamed from: X.BOy  reason: case insensitive filesystem */
public final class C22785BOy extends D9Q {
    public long A00 = -9223372036854775807L;
    public boolean A01;
    public final Uri A02;
    public final E0Y A03;
    public final E41 A04;

    public void A05() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: X.E8y[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: X.E8y[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: X.E8y[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: X.E8y[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: X.E8y[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: X.E8y[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: X.E8y[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C28649ECi BHj(X.C25199Caq r14, X.C25215CbB r15, long r16) {
        /*
            r13 = this;
            r8 = r13
            android.net.Uri r7 = r13.A02
            X.E41 r0 = r13.A04
            X.E9Q r10 = r0.BHH()
            X.E0Y r6 = r13.A03
            X.D8v r6 = (X.C26672D8v) r6
            int r0 = r6.A00
            if (r0 == 0) goto L_0x006f
            r3 = 1
            java.lang.Object r0 = r6.A02
            X.CbZ r0 = (X.C25238CbZ) r0
            int r0 = r0.A01
            r4 = 2
            r2 = 3
            r1 = 0
            if (r3 != r0) goto L_0x0045
            X.E8y[] r12 = new X.C28585E8y[r2]
            X.D8t r0 = new X.D8t
            r0.<init>()
            r12[r1] = r0
            X.D8z r0 = new X.D8z
            r0.<init>()
            r12[r3] = r0
            X.D8u r0 = new X.D8u
            r0.<init>()
        L_0x0032:
            r12[r4] = r0
        L_0x0034:
            X.CtM r0 = r13.A03
            r1 = 0
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A02
            X.CtM r9 = new X.CtM
            r9.<init>(r14, r0, r1)
            X.D9O r6 = new X.D9O
            r11 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
        L_0x0045:
            java.lang.Object r0 = r6.A01
            X.CkU r0 = (X.C25699CkU) r0
            X.DRp r0 = r0.A06
            boolean r0 = r0.shouldAddDefaultMP4Extractor
            if (r0 == 0) goto L_0x0065
            X.E8y[] r12 = new X.C28585E8y[r2]
            X.D8z r0 = new X.D8z
            r0.<init>()
            r12[r1] = r0
            X.D8u r0 = new X.D8u
            r0.<init>()
            r12[r3] = r0
            X.D8t r0 = new X.D8t
            r0.<init>()
            goto L_0x0032
        L_0x0065:
            X.E8y[] r12 = new X.C28585E8y[r3]
            X.D8z r0 = new X.D8z
            r0.<init>()
            r12[r1] = r0
            goto L_0x0034
        L_0x006f:
            java.lang.String r0 = "com.facebook.android.exoplayer2.extractor.mp3.Mp3Extractor"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x00fa }
            r2 = 0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00fa }
            java.lang.reflect.Constructor r4 = r1.getConstructor(r0)     // Catch:{ Exception -> 0x00fa }
            java.lang.Object r0 = r6.A01     // Catch:{ Exception -> 0x00fa }
            X.CkU r0 = (X.C25699CkU) r0     // Catch:{ Exception -> 0x00fa }
            X.DRp r0 = r0.A06     // Catch:{ Exception -> 0x00fa }
            boolean r0 = r0.enableMp3Mp4ExtractorLogic     // Catch:{ Exception -> 0x00fa }
            r5 = 2
            r3 = 1
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r0 = r6.A02     // Catch:{ Exception -> 0x00fa }
            X.CbZ r0 = (X.C25238CbZ) r0     // Catch:{ Exception -> 0x00fa }
            X.D47 r1 = r0.A0C     // Catch:{ Exception -> 0x00fa }
            android.net.Uri r0 = r1.A05     // Catch:{ Exception -> 0x00fa }
            if (r0 == 0) goto L_0x00d7
            java.lang.String r0 = r0.getLastPathSegment()     // Catch:{ Exception -> 0x00fa }
            if (r0 == 0) goto L_0x00d7
            android.net.Uri r0 = r1.A05     // Catch:{ Exception -> 0x00fa }
            java.lang.String r1 = r0.getLastPathSegment()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r0 = ".mp3"
            boolean r0 = r1.endsWith(r0)     // Catch:{ Exception -> 0x00fa }
            if (r0 == 0) goto L_0x00d7
            X.E8y[] r12 = new X.C28585E8y[r3]     // Catch:{ Exception -> 0x00fa }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00fa }
            java.lang.Object r0 = r4.newInstance(r0)     // Catch:{ Exception -> 0x00fa }
            X.E8y r0 = (X.C28585E8y) r0     // Catch:{ Exception -> 0x00fa }
            r12[r2] = r0     // Catch:{ Exception -> 0x00fa }
            goto L_0x0034
        L_0x00b3:
            java.lang.Object r0 = r6.A02     // Catch:{ Exception -> 0x00fa }
            X.CbZ r0 = (X.C25238CbZ) r0     // Catch:{ Exception -> 0x00fa }
            X.D47 r0 = r0.A0C     // Catch:{ Exception -> 0x00fa }
            java.lang.String r1 = r0.A0G     // Catch:{ Exception -> 0x00fa }
            if (r1 == 0) goto L_0x00ec
            java.lang.String r0 = "undefined"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x00fa }
            if (r0 == 0) goto L_0x00ec
            X.E8y[] r12 = new X.C28585E8y[r5]     // Catch:{ Exception -> 0x00fa }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00fa }
            java.lang.Object r0 = r4.newInstance(r0)     // Catch:{ Exception -> 0x00fa }
            X.E8y r0 = (X.C28585E8y) r0     // Catch:{ Exception -> 0x00fa }
            r12[r2] = r0     // Catch:{ Exception -> 0x00fa }
            X.D8z r0 = new X.D8z     // Catch:{ Exception -> 0x00fa }
            r0.<init>()     // Catch:{ Exception -> 0x00fa }
            goto L_0x00e8
        L_0x00d7:
            X.E8y[] r12 = new X.C28585E8y[r5]     // Catch:{ Exception -> 0x00fa }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00fa }
            java.lang.Object r0 = r4.newInstance(r0)     // Catch:{ Exception -> 0x00fa }
            X.E8y r0 = (X.C28585E8y) r0     // Catch:{ Exception -> 0x00fa }
            r12[r2] = r0     // Catch:{ Exception -> 0x00fa }
            X.D8z r0 = new X.D8z     // Catch:{ Exception -> 0x00fa }
            r0.<init>()     // Catch:{ Exception -> 0x00fa }
        L_0x00e8:
            r12[r3] = r0     // Catch:{ Exception -> 0x00fa }
            goto L_0x0034
        L_0x00ec:
            X.E8y[] r12 = new X.C28585E8y[r3]     // Catch:{ Exception -> 0x00fa }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00fa }
            java.lang.Object r0 = r4.newInstance(r0)     // Catch:{ Exception -> 0x00fa }
            X.E8y r0 = (X.C28585E8y) r0     // Catch:{ Exception -> 0x00fa }
            r12[r2] = r0     // Catch:{ Exception -> 0x00fa }
            goto L_0x0034
        L_0x00fa:
            r2 = move-exception
            java.lang.String r1 = "HeroExo2VodInitHelper"
            java.lang.String r0 = "Error while creating Mp3/Mp4 Extractor(s)"
            android.util.Log.e(r1, r0, r2)
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22785BOy.BHj(X.Caq, X.CbB, long):X.ECi");
    }

    public void BjW() {
    }

    public void A06(C26206Cue cue, boolean z) {
        long j = this.A00;
        this.A00 = j;
        this.A01 = false;
        A04(new BOP(j, false), (Object) null);
    }

    public void CEL(C28649ECi eCi) {
        D9O d9o = (D9O) eCi;
        if (d9o.A0E) {
            for (D91 A042 : d9o.A0H) {
                A042.A04();
            }
        }
        C25667Cjx cjx = d9o.A0S;
        BG8 bg8 = cjx.A00;
        if (bg8 != null) {
            bg8.A00(true);
        }
        ExecutorService executorService = cjx.A02;
        executorService.execute(new C21466AkX(d9o, 42));
        executorService.shutdown();
        d9o.A0O.removeCallbacksAndMessages((Object) null);
        d9o.A08 = null;
        d9o.A0F = true;
        d9o.A0R.A03();
    }

    @Deprecated
    public C22785BOy(Uri uri, E0Y e0y, E41 e41) {
        this.A02 = uri;
        this.A04 = e41;
        this.A03 = e0y;
    }

    public void A07(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (this.A00 != j || this.A01 != z) {
            this.A00 = j;
            this.A01 = z;
            A04(new BOP(j, z), (Object) null);
        }
    }
}
