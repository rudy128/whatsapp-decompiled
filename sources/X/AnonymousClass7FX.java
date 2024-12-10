package X;

import android.os.Handler;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7FX  reason: invalid class name */
public final class AnonymousClass7FX implements AnonymousClass1WS {
    public final Handler A00 = C17890vO.A0D();
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final LinkedHashMap A03 = C17880vN.A13();
    public final AnonymousClass2PC A04;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r1.A0V == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(X.AnonymousClass206 r6, int r7) {
        /*
            r5 = this;
            r0 = 1
            boolean r4 = X.AnonymousClass000.A1T(r7, r0)
            boolean r3 = r6 instanceof X.AnonymousClass21V
            if (r3 == 0) goto L_0x001d
            r0 = r6
            X.21V r0 = (X.AnonymousClass21V) r0
            X.2rc r1 = r0.A02
            if (r1 == 0) goto L_0x001d
            boolean r0 = r1.A0U
            if (r0 == 0) goto L_0x001d
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x001d
            boolean r0 = r1.A0V
            r2 = 1
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            X.205 r1 = r6.A0v
            boolean r0 = X.C108945cZ.A1S(r1)
            if (r0 == 0) goto L_0x0030
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0030
            if (r3 == 0) goto L_0x0031
            if (r4 == 0) goto L_0x0030
            if (r2 != 0) goto L_0x0031
        L_0x0030:
            return
        L_0x0031:
            boolean r0 = r6 instanceof X.AnonymousClass23N
            if (r0 == 0) goto L_0x003c
            r0 = r6
            X.23N r0 = (X.AnonymousClass23N) r0
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x0030
        L_0x003c:
            X.2PC r2 = r5.A04
            r1 = 43
            X.7Pl r0 = new X.7Pl
            r0.<init>(r5, r6, r1)
            r2.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7FX.A00(X.206, int):void");
    }

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public void ByH(AnonymousClass206 r2, int i) {
        C18070vi.A0d(r2, 0);
        A00(r2, i);
    }

    public void ByK(AnonymousClass206 r2, int i) {
        C18070vi.A0d(r2, 0);
        if (r2 instanceof AnonymousClass21V) {
            A00(r2, i);
        }
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

    public /* synthetic */ void ByZ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Bya(Collection collection, Map map) {
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

    public final AnonymousClass1IX A01() {
        AnonymousClass1IX copyOf = AnonymousClass1IX.copyOf(C108955ca.A17(this.A03));
        C18070vi.A0X(copyOf);
        return copyOf;
    }

    public final void A02() {
        AnonymousClass7RH.A00(this.A00, this, 11);
    }

    public AnonymousClass7FX(AnonymousClass2PC r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0o(r2, r3, r4);
        this.A04 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }
}
