package X;

import androidx.compose.ui.unit.Constraints;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.09I  reason: invalid class name */
public final class AnonymousClass09I extends AnonymousClass0XW implements C17670v2, C17660v1, C17640uz {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass0QS A03;
    public C26251Cvq A04;
    public E3V A05;
    public String A06;
    public Map A07;
    public C22821Di A08;
    public boolean A09;
    public final C17330uU A0A;

    public /* synthetic */ AnonymousClass09I(C15780rC r9, C26251Cvq cvq, E3V e3v, String str, AnonymousClass1Y1 r13, int i, int i2, int i3, boolean z) {
        this(cvq, e3v, str, i, i2, i3, z);
    }

    public final boolean A0O(C26251Cvq cvq) {
        return !cvq.A0F(this.A04);
    }

    public /* synthetic */ void Bxi() {
    }

    public static final AnonymousClass0QS A00(AnonymousClass09I r9) {
        AnonymousClass0QS r0 = r9.A03;
        if (r0 == null) {
            String str = r9.A06;
            r0 = new AnonymousClass0QS(r9.A04, r9.A05, str, (AnonymousClass1Y1) null, r9.A02, r9.A00, r9.A01, r9.A09);
            r9.A03 = r0;
        }
        C18070vi.A0b(r0);
        return r0;
    }

    private final AnonymousClass0QS A01(C28644ECa eCa) {
        AnonymousClass0QS A002;
        AnonymousClass0K1 r1 = (AnonymousClass0K1) this.A0A.getValue();
        if (r1 == null || !r1.A02 || (A002 = r1.A00) == null) {
            A002 = A00(this);
        }
        A002.A0E(eCa);
        return A002;
    }

    public static final void A03(AnonymousClass09I r12, String str) {
        C17330uU r2 = r12.A0A;
        AnonymousClass0K1 r1 = (AnonymousClass0K1) r2.getValue();
        String str2 = str;
        if (r1 == null) {
            AnonymousClass0K1 r13 = new AnonymousClass0K1(r12.A06, str);
            AnonymousClass0QS r3 = new AnonymousClass0QS(r12.A04, r12.A05, str2, (AnonymousClass1Y1) null, r12.A02, r12.A00, r12.A01, r12.A09);
            r3.A0E(A00(r12).A0B());
            r13.A00 = r3;
            r2.setValue(r13);
        } else if (!C18070vi.A18(str, r1.A01)) {
            r1.A01 = str;
            AnonymousClass0QS r32 = r1.A00;
            if (r32 != null) {
                r32.A0D(r12.A04, r12.A05, str2, r12.A02, r12.A00, r12.A01, r12.A09);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r9 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        X.AnonymousClass0F0.A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r10 == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        if (r11 != false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r0 = A00(r8);
        r3 = r8.A06;
        r0.A0D(r8.A04, r8.A05, r3, r8.A02, r8.A00, r8.A01, r8.A09);
        X.AnonymousClass0QV.A08(r8);
        X.AnonymousClass0F0.A00(r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0N(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x0033
            if (r10 != 0) goto L_0x000c
            if (r9 == 0) goto L_0x0011
            X.1Di r0 = r8.A08
            if (r0 == 0) goto L_0x0011
        L_0x000c:
            X.AnonymousClass0QV.A07(r8)
            if (r10 != 0) goto L_0x0013
        L_0x0011:
            if (r11 == 0) goto L_0x002e
        L_0x0013:
            X.0QS r0 = A00(r8)
            java.lang.String r3 = r8.A06
            X.Cvq r1 = r8.A04
            X.E3V r2 = r8.A05
            int r4 = r8.A02
            boolean r7 = r8.A09
            int r5 = r8.A00
            int r6 = r8.A01
            r0.A0D(r1, r2, r3, r4, r5, r6, r7)
            X.AnonymousClass0QV.A08(r8)
            X.AnonymousClass0F0.A00(r8)
        L_0x002e:
            if (r9 == 0) goto L_0x0033
            X.AnonymousClass0F0.A00(r8)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09I.A0N(boolean, boolean, boolean):void");
    }

    public final boolean A0P(C26251Cvq cvq, E3V e3v, int i, int i2, int i3, boolean z) {
        boolean z2 = !this.A04.A0G(cvq);
        this.A04 = cvq;
        if (this.A01 != i) {
            this.A01 = i;
            z2 = true;
        }
        if (this.A00 != i2) {
            this.A00 = i2;
            z2 = true;
        }
        if (this.A09 != z) {
            this.A09 = z;
            z2 = true;
        }
        if (!C18070vi.A18(this.A05, e3v)) {
            this.A05 = e3v;
            z2 = true;
        }
        if (this.A02 == i3) {
            return z2;
        }
        this.A02 = i3;
        return true;
    }

    public final boolean A0Q(String str) {
        if (C18070vi.A18(this.A06, str)) {
            return false;
        }
        this.A06 = str;
        this.A0A.setValue((Object) null);
        return true;
    }

    public void BCT(C16520sO r7) {
        C22821Di r4 = this.A08;
        if (r4 == null) {
            r4 = new C10700il(this);
            this.A08 = r4;
        }
        C05150Qq.A03(r7, new C27069DRu((List) null, 6, this.A06));
        AnonymousClass0K1 r2 = (AnonymousClass0K1) this.A0A.getValue();
        if (r2 != null) {
            r7.CHj(C03150Gu.A0D, Boolean.valueOf(r2.A02));
            r7.CHj(C03150Gu.A0Q, new C27069DRu((List) null, 6, r2.A01));
        }
        C05150Qq.A09(r7, new C10710im(this));
        C05150Qq.A0A(r7, new C09790hI(this));
        C05150Qq.A06(r7, new C08050eT(this));
        C05150Qq.A08(r7, r4);
    }

    public void BJM(C17480uj r15) {
        if (this.A07) {
            EA0 A092 = A00(this).A09();
            if (A092 != null) {
                C16960tV BOJ = r15.BQs().BOJ();
                boolean z = A00(this).A01;
                if (z) {
                    long j = AnonymousClass0QY.A03;
                    long A0p = AnonymousClass001.A0p(AnonymousClass000.A02(A00(this).A00), (float) AnonymousClass000.A0H(A00(this).A00));
                    long j2 = AnonymousClass0QG.A02;
                    AnonymousClass0NU A002 = C02470Ed.A00(j, A0p);
                    BOJ.CGe();
                    BOJ.BF1(A002);
                }
                try {
                    C26251Cvq cvq = this.A04;
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
                        A092.CB5(A062, BOJ, A072, A082, A0E, cvq.A03());
                    } else {
                        long j3 = C05100Qk.A05;
                        if (j3 == j3) {
                            if (cvq.A04() != j3) {
                                j3 = cvq.A04();
                            } else {
                                j3 = C05100Qk.A01;
                            }
                        }
                        A092.CB4(BOJ, A072, A082, A0E, j3);
                    }
                } finally {
                    if (z) {
                        BOJ.CFz();
                    }
                }
            } else {
                throw AnonymousClass000.A0k("no paragraph");
            }
        }
    }

    public AnonymousClass09I(C26251Cvq cvq, E3V e3v, String str, int i, int i2, int i3, boolean z) {
        this.A06 = str;
        this.A04 = cvq;
        this.A05 = e3v;
        this.A02 = i;
        this.A09 = z;
        this.A00 = i2;
        this.A01 = i3;
        this.A0A = AnonymousClass0Q9.A02((Object) null);
    }

    public /* synthetic */ boolean BZA() {
        return false;
    }

    public /* synthetic */ boolean BZC() {
        return false;
    }

    public int BjB(C16860tL r3, C17740v9 r4, int i) {
        return A01(r4).A08(r4.getLayoutDirection(), i);
    }

    public int BjE(C16860tL r3, C17740v9 r4, int i) {
        return A01(r4).A06(r4.getLayoutDirection());
    }

    public C16820tH Bja(C17500ul r7, C17530uo r8, long j) {
        AnonymousClass0QS A012 = A01(r8);
        boolean A0F = A012.A0F(r8.getLayoutDirection(), j);
        A012.A0C();
        EA0 A092 = A012.A09();
        C18070vi.A0b(A092);
        long j2 = A012.A00;
        if (A0F) {
            AnonymousClass0F2.A00(this);
            Map map = this.A07;
            if (map == null) {
                map = new LinkedHashMap(2);
            }
            map.put(AnonymousClass0MK.A00, Integer.valueOf(C22339B3q.A01(A092.BRl())));
            map.put(AnonymousClass0MK.A01, Integer.valueOf(C22339B3q.A01(A092.BTo())));
            this.A07 = map;
        }
        C25705Cka cka = Constraints.A01;
        int A0G = AnonymousClass000.A0G(j2);
        int A0H = AnonymousClass000.A0H(j2);
        AnonymousClass0XJ Bjb = r7.Bjb(C04430Nj.A02(cka, A0G, A0H));
        Map map2 = this.A07;
        C18070vi.A0b(map2);
        return r8.BhL(map2, new C09800hJ(Bjb), A0G, A0H);
    }

    public int Bjx(C16860tL r3, C17740v9 r4, int i) {
        return A01(r4).A08(r4.getLayoutDirection(), i);
    }

    public int Bk0(C16860tL r3, C17740v9 r4, int i) {
        return A01(r4).A07(r4.getLayoutDirection());
    }
}
