package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.30p  reason: invalid class name and case insensitive filesystem */
public class C677230p implements AnonymousClass1WS {
    public final C27131Uv A00;

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByH(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void ByK(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void ByN(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByQ(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        AnonymousClass2TK.A00(this, collection, i);
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byc(AnonymousClass1BI r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Byd(Collection collection) {
    }

    public /* synthetic */ void Bz8(C29681ch r1) {
    }

    public /* synthetic */ void Bz9(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BzA(C29681ch r1, boolean z) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public void ByZ(AnonymousClass1BI r7) {
        C27131Uv r5 = this.A00;
        synchronized (r5.A0U) {
            C54882er r0 = (C54882er) C27131Uv.A06(r5).get(r7);
            if (r0 != null) {
                if (((AnonymousClass121) r5.A0O.get()).BfY(r0.A02)) {
                    r5.A0V(r7);
                }
            }
        }
        synchronized (r5.A0T) {
            Map A05 = C27131Uv.A05(r5);
            if (A05.containsKey(r7)) {
                Map map = (Map) A05.get(r7);
                C17960vV.A07(map);
                Iterator it = C17880vN.A10(map.values()).iterator();
                while (it.hasNext()) {
                    C54392e4 r2 = (C54392e4) it.next();
                    if (((AnonymousClass121) r5.A0O.get()).BfY(r2.A02)) {
                        C27131Uv.A08(r7, r2.A01, r5);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        r1 = X.C17880vN.A0Y(r8);
        r4 = r1.A0v;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bya(java.util.Collection r10, java.util.Map r11) {
        /*
            r9 = this;
            X.1Uv r7 = r9.A00
            java.lang.Object r6 = r7.A0U
            monitor-enter(r6)
            java.util.Map r5 = X.C27131Uv.A06(r7)     // Catch:{ all -> 0x008d }
            java.util.Iterator r4 = r10.iterator()     // Catch:{ all -> 0x008d }
        L_0x000d:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0039
            X.206 r3 = X.C17880vN.A0Y(r4)     // Catch:{ all -> 0x008d }
            X.205 r2 = r3.A0v     // Catch:{ all -> 0x008d }
            X.1BI r1 = r2.A00     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x000d
            boolean r0 = r2.A02     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x000d
            boolean r0 = r3 instanceof X.AnonymousClass219     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r5.get(r1)     // Catch:{ all -> 0x008d }
            X.2er r0 = (X.C54882er) r0     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x000d
            X.205 r0 = r0.A02     // Catch:{ all -> 0x008d }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x000d
            r7.A0V(r1)     // Catch:{ all -> 0x008d }
            goto L_0x000d
        L_0x0039:
            monitor-exit(r6)     // Catch:{ all -> 0x008d }
            java.lang.Object r6 = r7.A0T
            monitor-enter(r6)
            java.util.Map r5 = X.C27131Uv.A05(r7)     // Catch:{ all -> 0x008a }
            java.util.Iterator r8 = r10.iterator()     // Catch:{ all -> 0x008a }
        L_0x0045:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0088
            X.206 r1 = X.C17880vN.A0Y(r8)     // Catch:{ all -> 0x008a }
            X.205 r4 = r1.A0v     // Catch:{ all -> 0x008a }
            X.1BI r3 = r4.A00     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0088
            boolean r0 = r4.A02     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x0088
            boolean r0 = r1 instanceof X.AnonymousClass219     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0088
            java.lang.Object r2 = r5.get(r3)     // Catch:{ all -> 0x008a }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ all -> 0x008a }
            if (r2 == 0) goto L_0x0088
            X.1BI r0 = r1.A0H()     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x0083
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A00(r3)     // Catch:{ all -> 0x008a }
        L_0x006f:
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x008a }
            X.2e4 r0 = (X.C54392e4) r0     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0045
            X.205 r0 = r0.A02     // Catch:{ all -> 0x008a }
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0045
            X.C27131Uv.A08(r3, r1, r7)     // Catch:{ all -> 0x008a }
            goto L_0x0045
        L_0x0083:
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A00(r0)     // Catch:{ all -> 0x008a }
            goto L_0x006f
        L_0x0088:
            monitor-exit(r6)     // Catch:{ all -> 0x008a }
            return
        L_0x008a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x008a }
            throw r0
        L_0x008d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x008d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C677230p.Bya(java.util.Collection, java.util.Map):void");
    }

    public C677230p(C27131Uv r1) {
        this.A00 = r1;
    }
}
