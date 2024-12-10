package X;

import android.os.Handler;
import android.os.Looper;
import java.util.List;

public class BUN extends C22891BUc implements EDE {
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public EDC A06;
    public C28497E4c A07;
    public E99 A08;
    public C28498E4d A09;
    public C28553E7e A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D;
    public int A0E;
    public E8l A0F;
    public C28496E4b A0G;
    public boolean A0H = false;
    public final Handler A0I;
    public final Handler A0J;
    public final C25639CjS A0K;
    public final C25132CZh A0L = new C25132CZh();
    public final C28628EBb A0M;
    public final Object A0N = C17880vN.A0p();
    public final boolean A0O;
    public final C26813DEv A0P;
    public volatile E9S A0Q;
    public volatile boolean A0R;
    public volatile C25742ClC A0S;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: X.DEe} */
    /* JADX WARNING: type inference failed for: r0v14, types: [X.EBb] */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BUN(X.C28592E9h r5) {
        /*
            r4 = this;
            r3 = 0
            r4.<init>(r5)
            X.CZh r0 = new X.CZh
            r0.<init>()
            r4.A0L = r0
            java.lang.Object r0 = X.C17880vN.A0p()
            r4.A0N = r0
            r4.A00 = r3
            r4.A0H = r3
            X.CdJ r0 = X.EBD.A00
            X.CjS r1 = new X.CjS
            r1.<init>()
            X.E9h r2 = r4.A00
            java.lang.Object r0 = r2.BPA(r0)
            if (r0 == 0) goto L_0x0025
            r1 = r0
        L_0x0025:
            X.CjS r1 = (X.C25639CjS) r1
            r4.A0K = r1
            android.os.Handler r0 = X.C8P.A00(r5)
            r4.A0J = r0
            X.C9Z r0 = X.EDI.A00
            X.E4f r1 = r2.BP8(r0)
            X.EDI r1 = (X.EDI) r1
            java.lang.String r0 = "Lite-Controller-Thread"
            android.os.Handler r0 = r1.BSH(r0)
            r4.A0I = r0
            X.DEv r0 = new X.DEv
            r0.<init>(r4)
            r4.A0P = r0
            r0 = 1
            r4.A0O = r0
            r4.A0B = r3
            X.CdJ r0 = X.EB0.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r0 = r2.BPA(r0)
            if (r0 == 0) goto L_0x0058
            r1 = r0
        L_0x0058:
            boolean r0 = X.AnonymousClass000.A1Y(r1)
            if (r0 == 0) goto L_0x0066
            X.DEe r0 = new X.DEe
            r0.<init>()
        L_0x0063:
            r4.A0M = r0
            return
        L_0x0066:
            X.DEd r0 = new X.DEd
            r0.<init>()
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BUN.<init>(X.E9h):void");
    }

    public void CJB(Object obj, int i, int i2, int i3) {
        Object obj2 = obj;
        if (obj instanceof E8l) {
            this.A0J.post(new C27077DTb(this, obj2, i3, i, i2));
            return;
        }
        throw AnonymousClass8BX.A0V(obj, "input must implement GlInput interface: ", AnonymousClass000.A10());
    }

    public static void A00(C28593E9i e9i, BUN bun) {
        synchronized (bun.A0N) {
            if (bun.A0H || bun.A0F == null) {
                A01(new C26782DDo(e9i, new BUV()), bun, 0);
            }
            bun.A0H = true;
        }
    }

    public static void A01(E8l e8l, BUN bun, int i) {
        if (bun.A0J.getLooper() != Looper.myLooper()) {
            throw AnonymousClass000.A0n("getInputTextureId() must be called at SurfacePipe thread.");
        } else if (e8l instanceof C28496E4b) {
            bun.A0F = e8l;
            C28497E4c e4c = bun.A07;
            if (e4c == null) {
                e4c = new DE5(bun, 1);
                bun.A07 = e4c;
            }
            e8l.CJe(e4c);
            bun.A0G = (C28496E4b) e8l;
            DDm dDm = new DDm(bun.A0K, bun.A0F);
            if (i != 0) {
                dDm.A00 = i;
            }
            DDR.A08(bun.A06).A04(dDm, 0);
        } else {
            throw AnonymousClass8BX.A0V(e8l, "glInput must implement GlInputUpdateAware interface: ", AnonymousClass000.A10());
        }
    }

    public static void A02(BUN bun) {
        int i;
        C28496E4b e4b;
        int i2;
        int i3;
        BUN bun2 = bun;
        int i4 = bun2.A03;
        if (i4 != 0 && (i = bun2.A02) != 0 && (e4b = bun2.A0G) != null) {
            boolean z = true;
            boolean z2 = false;
            int i5 = i4;
            if (bun2.A05 % 180 != 0) {
                z2 = true;
                i5 = i;
            }
            int i6 = i5;
            if (!z2) {
                i4 = i;
            }
            int i7 = bun2.A04;
            int i8 = i4;
            if (i7 % 180 == 0) {
                z = false;
                i8 = i5;
                i5 = i4;
            }
            int i9 = i8;
            int i10 = i8;
            if (z) {
                i10 = i5;
            }
            bun2.A0E = i10;
            if (!z) {
                i8 = i5;
            }
            bun2.A0D = i8;
            if (bun2.A0B) {
                i2 = bun2.A01;
            } else {
                i2 = 0;
            }
            CWX CQm = e4b.CQm(i6, i4, i10, i8, i7, i2, bun2.A00, bun2.A0C);
            C25742ClC clC = bun2.A0S;
            if (clC != null) {
                clC.A01 = bun2.A04;
            }
            bun2.A06.CRF(CQm.A01, CQm.A00, i9, i5, bun2.A0C);
            int i11 = bun2.A0E;
            int i12 = bun2.A0D;
            int i13 = bun2.A04;
            if (bun2.A0B) {
                i3 = bun2.A01;
            } else {
                i3 = 0;
            }
            if (i11 != 0 && i12 != 0) {
                List list = bun2.A0L.A00;
                int size = list.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ((C28499E4e) list.get(i14)).Bzn(i11, i12, i13, i3);
                }
            }
        }
    }

    public static void A03(BUN bun, C25742ClC clC) {
        C25742ClC clC2 = bun.A0S;
        if (!(clC2 == null || clC2 == clC)) {
            bun.CEv(clC2);
        }
        bun.A0S = clC;
        if (clC != null) {
            DE3 de3 = new DE3((C28656ECq) null, bun.A0K, clC);
            if (bun.A0R) {
                de3.A02 = 3;
            }
            de3.A0C = true;
            DDR.A08(bun.A06).A03(de3, 0);
        }
    }

    public void BBa(C25742ClC clC) {
        DE3 de3 = new DE3((C28656ECq) null, this.A0K, clC);
        if (this.A0R) {
            de3.A00 = 7;
            de3.A02 = 7;
        }
        de3.A0C = true;
        DDR.A08(this.A06).A03(de3, 0);
    }

    public void BBk(C28499E4e e4e) {
        int i;
        if (this.A0L.A01(e4e)) {
            int i2 = this.A0E;
            int i3 = this.A0D;
            int i4 = this.A04;
            if (this.A0B) {
                i = this.A01;
            } else {
                i = 0;
            }
            if (i2 > 0 && i3 > 0) {
                e4e.Bzn(i2, i3, i4, i);
            }
        }
    }

    public C22892BUd BTg() {
        return EDE.A00;
    }

    public EAW Ba2() {
        return this.A0P;
    }

    public boolean Bcr() {
        EDG edg = ((C22807BPv) this.A06).A06.A00;
        if (edg != null) {
            return edg.Bcs();
        }
        return false;
    }

    public void CEv(C25742ClC clC) {
        DDR.A08(this.A06).A02(0, clC);
    }

    public void CF4(C28499E4e e4e) {
        this.A0L.A02(e4e);
    }

    public void CJj(C24556C9c c9c, Object obj) {
        C26813DEv dEv = this.A0P;
        if (c9c == EB1.A00) {
            dEv.A07.A00 = (EB1) obj;
        }
    }

    public void CK6(boolean z) {
        C25742ClC clC = this.A0S;
        if (clC != null) {
            clC.A07 = z;
        }
    }

    public void CLN(C28553E7e e7e) {
        this.A0A = e7e;
    }
}
