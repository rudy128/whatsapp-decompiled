package X;

import android.os.Handler;
import android.os.Looper;
import java.util.List;

public class BUO extends C22891BUc implements EDE {
    public static final String A0U = C26812DEu.class.getSimpleName();
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public EDC A08;
    public C28497E4c A09;
    public E99 A0A;
    public C28498E4d A0B;
    public EDH A0C;
    public EDI A0D;
    public C28553E7e A0E;
    public boolean A0F;
    public boolean A0G;
    public E8l A0H;
    public C28496E4b A0I;
    public final Handler A0J;
    public final Handler A0K;
    public final C25639CjS A0L;
    public final EDJ A0M;
    public final C25132CZh A0N = new C25132CZh();
    public final C28628EBb A0O;
    public final boolean A0P;
    public final C26812DEu A0Q;
    public volatile E9S A0R;
    public volatile boolean A0S;
    public volatile C25742ClC A0T;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: X.DEe} */
    /* JADX WARNING: type inference failed for: r0v12, types: [X.EBb] */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BUO(X.C28592E9h r7, boolean r8) {
        /*
            r6 = this;
            r5 = 1
            r6.<init>(r7)
            X.CZh r0 = new X.CZh
            r0.<init>()
            r6.A0N = r0
            r4 = 0
            r6.A00 = r4
            X.CdJ r0 = X.EBD.A00
            X.CjS r1 = new X.CjS
            r1.<init>()
            X.E9h r3 = r6.A00
            java.lang.Object r0 = r3.BPA(r0)
            if (r0 == 0) goto L_0x001e
            r1 = r0
        L_0x001e:
            X.CjS r1 = (X.C25639CjS) r1
            r6.A0L = r1
            android.os.Handler r0 = X.C8P.A00(r7)
            r6.A0K = r0
            X.C9Z r2 = X.EDI.A00
            boolean r1 = r3.BeM(r2)
            r0 = 0
            if (r1 == 0) goto L_0x007f
            X.E4f r2 = r3.BP8(r2)
            X.EDI r2 = (X.EDI) r2
            java.lang.String r1 = "Lite-Controller-Thread"
            android.os.Handler r1 = r2.BSH(r1)
        L_0x003d:
            r6.A0J = r1
            X.C9Z r2 = X.EDJ.A00
            boolean r1 = r3.BeM(r2)
            if (r1 == 0) goto L_0x004d
            X.E4f r0 = r3.BP8(r2)
            X.EDJ r0 = (X.EDJ) r0
        L_0x004d:
            r6.A0M = r0
            X.DEu r0 = new X.DEu
            r0.<init>(r6)
            r6.A0Q = r0
            boolean r0 = X.AnonymousClass000.A1O(r8)
            r6.A0P = r0
            r6.A0F = r5
            X.CdJ r0 = X.EB0.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r0 = r3.BPA(r0)
            if (r0 == 0) goto L_0x006b
            r1 = r0
        L_0x006b:
            boolean r0 = X.AnonymousClass000.A1Y(r1)
            if (r0 == 0) goto L_0x0079
            X.DEe r0 = new X.DEe
            r0.<init>()
        L_0x0076:
            r6.A0O = r0
            return
        L_0x0079:
            X.DEd r0 = new X.DEd
            r0.<init>()
            goto L_0x0076
        L_0x007f:
            r1 = r0
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BUO.<init>(X.E9h, boolean):void");
    }

    public void CJB(Object obj, int i, int i2, int i3) {
        Object obj2 = obj;
        if (obj instanceof E8l) {
            this.A0K.post(new C27077DTb(this, obj2, i3, i, i2));
            return;
        }
        throw AnonymousClass8BX.A0V(obj, "input must implement GlInput interface: ", AnonymousClass000.A10());
    }

    public static void A00(E8l e8l, BUO buo, int i) {
        if (buo.A0K.getLooper() != Looper.myLooper()) {
            throw AnonymousClass000.A0n("getInputTextureId() must be called at SurfacePipe thread.");
        } else if (e8l instanceof C28496E4b) {
            buo.A0H = e8l;
            C28497E4c e4c = buo.A09;
            if (e4c == null) {
                e4c = new DE5(buo, 0);
                buo.A09 = e4c;
            }
            e8l.CJe(e4c);
            buo.A0I = (C28496E4b) e8l;
            DDm dDm = new DDm(buo.A0L, buo.A0H);
            if (i != 0) {
                dDm.A00 = i;
            }
            DDR.A08(buo.A08).A04(dDm, 0);
        } else {
            throw AnonymousClass8BX.A0V(e8l, "glInput must implement GlInputUpdateAware interface: ", AnonymousClass000.A10());
        }
    }

    public static void A01(BUO buo) {
        int i;
        int i2;
        int i3;
        C28496E4b e4b;
        int i4;
        int i5;
        int i6 = buo.A03;
        if (i6 != 0 && (i = buo.A02) != 0 && (i2 = buo.A05) != 0 && (i3 = buo.A04) != 0 && (e4b = buo.A0I) != null) {
            int i7 = i;
            if (buo.A07 % 180 == 0) {
                i7 = i6;
                i6 = i;
            }
            int i8 = buo.A06;
            int i9 = i2;
            int i10 = i3;
            if (i8 % 180 != 0) {
                i9 = i3;
                i10 = i2;
            }
            if (buo.A0F) {
                i4 = buo.A01;
            } else {
                i4 = 0;
            }
            CWX CQm = e4b.CQm(i7, i6, i9, i10, i8, i4, buo.A00, buo.A0G);
            C25742ClC clC = buo.A0T;
            if (clC != null) {
                clC.A01 = buo.A06;
            }
            buo.A08.CRF(CQm.A01, CQm.A00, i2, i3, buo.A0G);
            int i11 = buo.A05;
            int i12 = buo.A04;
            int i13 = buo.A06;
            if (buo.A0F) {
                i5 = buo.A01;
            } else {
                i5 = 0;
            }
            if (i11 != 0 && i12 != 0) {
                List list = buo.A0N.A00;
                int size = list.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ((C28499E4e) list.get(i14)).Bzn(i11, i12, i13, i5);
                }
            }
        }
    }

    public static void A02(BUO buo, C25742ClC clC) {
        C25742ClC clC2 = buo.A0T;
        if (!(clC2 == null || clC2 == clC)) {
            buo.CEv(clC2);
        }
        buo.A0T = clC;
        if (clC != null) {
            C28656ECq eCq = null;
            C25639CjS cjS = buo.A0L;
            EDJ edj = buo.A0M;
            if (edj != null) {
                eCq = edj.BV5();
            }
            DE3 de3 = new DE3(eCq, cjS, clC);
            if (buo.A0S) {
                de3.A02 = 3;
            }
            de3.A0C = true;
            DDR.A08(buo.A08).A03(de3, 0);
        }
    }

    public void BBa(C25742ClC clC) {
        DE3 de3 = new DE3((C28656ECq) null, this.A0L, clC);
        if (this.A0S) {
            de3.A00 = 7;
            de3.A02 = 7;
        }
        de3.A0C = true;
        DDR.A08(this.A08).A03(de3, 0);
    }

    public void BBk(C28499E4e e4e) {
        int i;
        if (this.A0N.A01(e4e)) {
            int i2 = this.A05;
            int i3 = this.A04;
            int i4 = this.A06;
            if (this.A0F) {
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
        return this.A0Q;
    }

    public boolean Bcr() {
        EDG edg = ((C22807BPv) this.A08).A06.A00;
        if (edg != null) {
            return edg.Bcs();
        }
        return false;
    }

    public void CEv(C25742ClC clC) {
        DDR.A08(this.A08).A02(0, clC);
    }

    public void CF4(C28499E4e e4e) {
        this.A0N.A02(e4e);
    }

    public void CJj(C24556C9c c9c, Object obj) {
        C26812DEu dEu = this.A0Q;
        if (c9c == EB1.A00) {
            dEu.A07.A00 = (EB1) obj;
        }
    }

    public void CK6(boolean z) {
        C25742ClC clC = this.A0T;
        if (clC != null) {
            clC.A07 = z;
        }
    }

    public void CLN(C28553E7e e7e) {
        this.A0E = e7e;
    }
}
