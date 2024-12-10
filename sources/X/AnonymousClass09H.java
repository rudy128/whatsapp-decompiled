package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.Map;

/* renamed from: X.09H  reason: invalid class name */
public final class AnonymousClass09H extends AnonymousClass0XW implements C17670v2, C17660v1, C17640uz {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass0QI A03;
    public C27069DRu A04;
    public C26251Cvq A05;
    public E3V A06;
    public List A07;
    public Map A08;
    public C22821Di A09;
    public C22821Di A0A;
    public C22821Di A0B;
    public boolean A0C;
    public final C17330uU A0D;

    public /* synthetic */ AnonymousClass09H(C05680Vh r12, C15780rC r13, C27069DRu dRu, C26251Cvq cvq, E3V e3v, List list, C22821Di r18, C22821Di r19, AnonymousClass1Y1 r20, int i, int i2, int i3, boolean z) {
        this(dRu, cvq, e3v, list, r18, r19, i, i2, i3, z);
    }

    public final boolean A0P(C26251Cvq cvq) {
        return !cvq.A0F(this.A05);
    }

    public /* synthetic */ void Bxi() {
    }

    public static final AnonymousClass0QI A00(AnonymousClass09H r10) {
        AnonymousClass0QI r0 = r10.A03;
        if (r0 == null) {
            C27069DRu dRu = r10.A04;
            C26251Cvq cvq = r10.A05;
            E3V e3v = r10.A06;
            int i = r10.A02;
            boolean z = r10.A0C;
            r0 = new AnonymousClass0QI(dRu, cvq, e3v, r10.A07, (AnonymousClass1Y1) null, i, r10.A00, r10.A01, z);
            r10.A03 = r0;
        }
        C18070vi.A0b(r0);
        return r0;
    }

    private final AnonymousClass0QI A01(C28644ECa eCa) {
        AnonymousClass0QI A002;
        AnonymousClass0NR r1 = (AnonymousClass0NR) this.A0D.getValue();
        if (r1 == null || !r1.A01 || (A002 = r1.A00) == null) {
            A002 = A00(this);
        }
        A002.A0C(eCa);
        return A002;
    }

    /* access modifiers changed from: private */
    public final void A04(C27069DRu dRu) {
        C17330uU r2 = this.A0D;
        AnonymousClass0NR r1 = (AnonymousClass0NR) r2.getValue();
        C27069DRu dRu2 = dRu;
        if (r1 == null) {
            AnonymousClass0NR r12 = new AnonymousClass0NR(this.A04, dRu);
            C26251Cvq cvq = this.A05;
            E3V e3v = this.A06;
            int i = this.A02;
            boolean z = this.A0C;
            AnonymousClass0QI r3 = new AnonymousClass0QI(dRu2, cvq, e3v, this.A07, (AnonymousClass1Y1) null, i, this.A00, this.A01, z);
            r3.A0C(A00(this).A0A());
            r12.A00 = r3;
            r2.setValue(r12);
        } else if (!C18070vi.A18(dRu, r1.A00())) {
            r1.A01(dRu);
            AnonymousClass0QI r32 = r1.A00;
            if (r32 != null) {
                C26251Cvq cvq2 = this.A05;
                E3V e3v2 = this.A06;
                int i2 = this.A02;
                boolean z2 = this.A0C;
                r32.A0B(dRu2, cvq2, e3v2, this.A07, i2, this.A00, this.A01, z2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r11 == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r13 == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0N(boolean r10, boolean r11, boolean r12, boolean r13) {
        /*
            r9 = this;
            boolean r0 = r9.A07
            if (r0 == 0) goto L_0x0037
            if (r11 != 0) goto L_0x000c
            if (r10 == 0) goto L_0x0011
            X.1Di r0 = r9.A0B
            if (r0 == 0) goto L_0x0011
        L_0x000c:
            X.AnonymousClass0QV.A07(r9)
            if (r11 != 0) goto L_0x0015
        L_0x0011:
            if (r12 != 0) goto L_0x0015
            if (r13 == 0) goto L_0x0032
        L_0x0015:
            X.0QI r0 = A00(r9)
            X.DRu r1 = r9.A04
            X.Cvq r2 = r9.A05
            X.E3V r3 = r9.A06
            int r5 = r9.A02
            boolean r8 = r9.A0C
            int r6 = r9.A00
            int r7 = r9.A01
            java.util.List r4 = r9.A07
            r0.A0B(r1, r2, r3, r4, r5, r6, r7, r8)
            X.AnonymousClass0QV.A08(r9)
            X.AnonymousClass0F0.A00(r9)
        L_0x0032:
            if (r10 == 0) goto L_0x0037
            X.AnonymousClass0F0.A00(r9)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09H.A0N(boolean, boolean, boolean, boolean):void");
    }

    public final boolean A0O(C27069DRu dRu) {
        if (C18070vi.A18(this.A04, dRu)) {
            return false;
        }
        this.A04 = dRu;
        this.A0D.setValue((Object) null);
        return true;
    }

    public final boolean A0Q(C26251Cvq cvq, E3V e3v, List list, int i, int i2, int i3, boolean z) {
        boolean z2 = !this.A05.A0G(cvq);
        this.A05 = cvq;
        if (!C18070vi.A18(this.A07, list)) {
            this.A07 = list;
            z2 = true;
        }
        if (this.A01 != i) {
            this.A01 = i;
            z2 = true;
        }
        if (this.A00 != i2) {
            this.A00 = i2;
            z2 = true;
        }
        if (this.A0C != z) {
            this.A0C = z;
            z2 = true;
        }
        if (!C18070vi.A18(this.A06, e3v)) {
            this.A06 = e3v;
            z2 = true;
        }
        if (this.A02 == i3) {
            return z2;
        }
        this.A02 = i3;
        return true;
    }

    public final boolean A0R(C22821Di r3, C22821Di r4) {
        boolean z;
        if (!C18070vi.A18(this.A0A, r3)) {
            this.A0A = r3;
            z = true;
        } else {
            z = false;
        }
        if (C18070vi.A18(this.A09, r4)) {
            return z;
        }
        this.A09 = r4;
        return true;
    }

    public void BCT(C16520sO r5) {
        C22821Di r3 = this.A0B;
        if (r3 == null) {
            r3 = new C10680ij(this);
            this.A0B = r3;
        }
        C05150Qq.A03(r5, this.A04);
        AnonymousClass0NR r2 = (AnonymousClass0NR) this.A0D.getValue();
        if (r2 != null) {
            r5.CHj(C03150Gu.A0Q, r2.A00());
            r5.CHj(C03150Gu.A0D, Boolean.valueOf(r2.A01));
        }
        C05150Qq.A09(r5, new C10690ik(this));
        C05150Qq.A0A(r5, new C09770hG(this));
        C05150Qq.A06(r5, new C08040eS(this));
        C05150Qq.A08(r5, r3);
    }

    public void BJM(C17480uj r18) {
        boolean z;
        if (this.A07) {
            C17480uj r2 = r18;
            C16960tV BOJ = r2.BQs().BOJ();
            C26227CvJ A092 = A01(r2).A09();
            C26222CvC A0M = A092.A0M();
            if (!A092.A0S() || this.A02 == 3) {
                z = false;
            } else {
                z = true;
                long A0H = A092.A0H();
                long j = AnonymousClass0QY.A03;
                long A0p = AnonymousClass001.A0p(AnonymousClass000.A02(A0H), (float) AnonymousClass000.A0H(A0H));
                long j2 = AnonymousClass0QG.A02;
                AnonymousClass0NU A002 = C02470Ed.A00(j, A0p);
                BOJ.CGe();
                BOJ.BF1(A002);
            }
            try {
                C26251Cvq cvq = this.A05;
                C25827Cme A0E = cvq.A0E();
                if (A0E == null) {
                    A0E = C25289Ccr.A00();
                }
                AnonymousClass0NG A072 = cvq.A07();
                if (A072 == null) {
                    A072 = AnonymousClass0NG.A03;
                }
                C02000Cg A082 = cvq.A08();
                if (A082 == null) {
                    A082 = C016909m.A00;
                }
                C03380Hv A062 = cvq.A06();
                if (A062 != null) {
                    C75.A00(A062, BOJ, A072, A082, A0M, A0E, cvq.A03());
                } else {
                    long j3 = C05100Qk.A05;
                    if (j3 == j3) {
                        if (cvq.A04() != j3) {
                            j3 = cvq.A04();
                        } else {
                            j3 = C05100Qk.A01;
                        }
                    }
                    A0M.A08(BOJ, A072, A082, A0E, j3);
                }
                List list = this.A07;
                if (list != null && !list.isEmpty()) {
                    r2.BJR();
                }
            } finally {
                if (z) {
                    BOJ.CFz();
                }
            }
        }
    }

    public AnonymousClass09H(C27069DRu dRu, C26251Cvq cvq, E3V e3v, List list, C22821Di r6, C22821Di r7, int i, int i2, int i3, boolean z) {
        this.A04 = dRu;
        this.A05 = cvq;
        this.A06 = e3v;
        this.A0A = r6;
        this.A02 = i;
        this.A0C = z;
        this.A00 = i2;
        this.A01 = i3;
        this.A07 = list;
        this.A09 = r7;
        this.A0D = AnonymousClass0Q9.A02((Object) null);
    }

    public /* synthetic */ boolean BZA() {
        return false;
    }

    public /* synthetic */ boolean BZC() {
        return false;
    }

    public int BjB(C16860tL r3, C17740v9 r4, int i) {
        return A01(r4).A07(r4.getLayoutDirection(), i);
    }

    public int BjE(C16860tL r3, C17740v9 r4, int i) {
        return A01(r4).A05(r4.getLayoutDirection());
    }

    public C16820tH Bja(C17500ul r6, C17530uo r7, long j) {
        AnonymousClass0QI A012 = A01(r7);
        boolean A0D2 = A012.A0D(r7.getLayoutDirection(), j);
        C26227CvJ A092 = A012.A09();
        A092.A0M().A07().BSK();
        if (A0D2) {
            AnonymousClass0F2.A00(this);
            C22821Di r0 = this.A0A;
            if (r0 != null) {
                r0.invoke(A092);
            }
            this.A08 = AnonymousClass1D7.A0B(AnonymousClass6YK.A00(AnonymousClass0MK.A00, Integer.valueOf(C22339B3q.A01(A092.A04()))), AnonymousClass6YK.A00(AnonymousClass0MK.A01, Integer.valueOf(C22339B3q.A01(A092.A05()))));
        }
        C22821Di r1 = this.A09;
        if (r1 != null) {
            r1.invoke(A092.A0R());
        }
        C25705Cka cka = Constraints.A01;
        long A0H = A092.A0H();
        int A0G = AnonymousClass000.A0G(A0H);
        int A0H2 = AnonymousClass000.A0H(A0H);
        AnonymousClass0XJ Bjb = r6.Bjb(C04430Nj.A02(cka, A0G, A0H2));
        Map map = this.A08;
        C18070vi.A0b(map);
        return r7.BhL(map, new C09780hH(Bjb), A0G, A0H2);
    }

    public int Bjx(C16860tL r3, C17740v9 r4, int i) {
        return A01(r4).A07(r4.getLayoutDirection(), i);
    }

    public int Bk0(C16860tL r3, C17740v9 r4, int i) {
        return A01(r4).A06(r4.getLayoutDirection());
    }
}
