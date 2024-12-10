package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AP5 implements BAY, BAX {
    public C195459tN A00;
    public C195459tN A01;
    public List A02;
    public C18090vk A03 = new C21528Alb(this, 21);
    public boolean A04;
    public final int A05;
    public final AnonymousClass1DT A06 = AnonymousClass3MW.A0L();
    public final C184169aW A07;
    public final C199299zl A08;
    public final C188769hx A09;
    public final C22428B7k A0A;
    public final C22429B7l A0B;
    public final C22431B7n A0C;
    public final C198469yO A0D;
    public final C186559eO A0E;
    public final C185729d3 A0F;
    public final AnonymousClass9X1 A0G;
    public final A36 A0H;
    public final C22553BCk A0I;
    public final AnonymousClass1XN A0J;
    public final String A0K;
    public final C185699d0 A0L;
    public final BAX A0M;
    public final C22430B7m A0N;
    public final C20531AOq A0O;
    public final C22495BAc A0P;
    public final C18090vk A0Q;
    public final boolean A0R;

    public void Bmu(List list) {
        A07(this, 2);
        A06(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        if (r9.A02() == false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C174298wY A00(X.C20079A6f r26, java.util.List r27, int r28) {
        /*
            r25 = this;
            r4 = r27
            r3 = r28
            java.lang.Object r9 = r4.get(r3)
            X.AF0 r9 = (X.AF0) r9
            boolean r0 = r26.A05()
            if (r0 != 0) goto L_0x0065
            com.google.android.gms.maps.model.LatLng r5 = X.C20079A6f.A00(r26)
        L_0x0014:
            int r18 = r28 + 1
            r15 = r25
            X.9hx r0 = r15.A09
            java.lang.String r2 = r0.A0D
            java.lang.String r1 = r0.A0E
            int r11 = r26.A03()
            boolean r0 = r26.A07()
            if (r0 == 0) goto L_0x002f
            boolean r0 = r9.A02()
            r12 = 1
            if (r0 != 0) goto L_0x0030
        L_0x002f:
            r12 = 0
        L_0x0030:
            boolean r13 = r15.A0R
            X.APS r6 = new X.APS
            r14 = r6
            r16 = r9
            r19 = r3
            r17 = r4
            r14.<init>(r15, r16, r17, r18, r19)
            r0 = 0
            X.APV r7 = new X.APV
            r7.<init>(r15, r0)
            X.APW r8 = new X.APW
            r19 = r8
            r20 = r15
            r21 = r9
            r22 = r2
            r23 = r1
            r24 = r18
            r19.<init>(r20, r21, r22, r23, r24)
            r10 = 11
            X.8wY r4 = new X.8wY
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.B7m r0 = r15.A0N
            java.lang.String r0 = r0.BYs()
            r4.A02 = r0
            return r4
        L_0x0065:
            r5 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AP5.A00(X.A6f, java.util.List, int):X.8wY");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02() {
        /*
            r10 = this;
            X.9eO r3 = r10.A0E
            java.util.concurrent.atomic.AtomicInteger r6 = r3.A02
            int r5 = r6.get()
            r4 = 14
            X.9hx r2 = r10.A09
            X.9tl r0 = r2.A05
            if (r0 == 0) goto L_0x0050
            java.util.List r1 = r0.A09
            int r0 = r1.size()
            if (r5 >= r0) goto L_0x0050
            int r4 = r4 + r5
            int r0 = X.C108955ca.A08(r1, r4)
            java.util.List r1 = r1.subList(r5, r0)
        L_0x0021:
            java.lang.String r7 = r2.A0F
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            boolean r0 = X.AnonymousClass000.A1a(r1)
            if (r0 == 0) goto L_0x007a
            int r0 = r1.size()
            r6.addAndGet(r0)
            X.ATl r2 = r3.A00
            java.util.ArrayList r8 = X.C29351c6.A0D(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x003e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r1.next()
            X.AF0 r0 = (X.AF0) r0
            java.lang.String r0 = r0.A0E
            r8.add(r0)
            goto L_0x003e
        L_0x0050:
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x0021
        L_0x0055:
            java.util.List r0 = r3.A01
            java.util.ArrayList r9 = X.C29431cG.A0m(r0)
            X.8kL r0 = new X.8kL
            r0.<init>()
            r9.add(r0)
            X.B7e r4 = r2.A0J
            X.9XW r0 = r2.A0M
            X.9mx r6 = r0.A00
            X.ATf r5 = new X.ATf
            r5.<init>(r2, r8)
            X.8kT r1 = r4.BGy(r5, r6, r7, r8, r9)
            r1.A0E()
            java.util.Set r0 = r2.A0O
            r0.add(r1)
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AP5.A02():void");
    }

    public static void A04(C195699tl r14, AP5 ap5) {
        String str;
        String str2;
        AnonymousClass10E r0;
        int i = ap5.A05;
        if (i == 1) {
            C18030ve r2 = ap5.A0J.A03;
            if (AnonymousClass8BS.A1L(r2) && C18020vd.A05(C18040vf.A02, r2, 4844)) {
                ap5.A02();
                return;
            }
        }
        C18030ve r22 = ap5.A0J.A03;
        if (AnonymousClass8BS.A1L(r22) && C18020vd.A05(C18040vf.A02, r22, 1920) && (str = r14.A05) != null && !str.isEmpty() && !r14.A09.isEmpty()) {
            if (i == 0) {
                str2 = ap5.A09.A0F;
            } else {
                str2 = null;
            }
            C186559eO r02 = ap5.A0E;
            C20653ATl aTl = r02.A00;
            List list = r02.A01;
            C20654ATm aTm = new C20654ATm(aTl, str);
            aTl.A01 = aTm;
            B51 b51 = aTl.A0G;
            C191659mx r10 = aTl.A0M.A00;
            C20532AOr aOr = (C20532AOr) b51;
            int i2 = aOr.A00;
            Object obj = aOr.A01;
            if (i2 != 0) {
                r0 = ((C37391pS) obj).A00;
            } else {
                r0 = ((AnonymousClass1K2) obj).A01;
            }
            C18030ve A8r = AnonymousClass10E.A8r(r0);
            AnonymousClass190 A0N2 = AnonymousClass3MY.A0N(r0);
            AnonymousClass10I AL1 = AnonymousClass10E.AL1(r0);
            C18000vb A6Q = AnonymousClass10E.A6Q(r0);
            C22416B6y A0B2 = AnonymousClass8BT.A0B(r0);
            C24521Kq A0F2 = AnonymousClass8BU.A0F(r0);
            AnonymousClass10G r03 = r0.A00;
            C169158kS r23 = new C169158kS(A0N2, A0B2, AnonymousClass8BT.A0E(r03), A0F2, A6Q, A8r, aTm, r10, AnonymousClass8BT.A0O(r03), AL1, str, str2, list);
            aTl.A0O.add(r23);
            r23.A0E();
        }
    }

    /* JADX WARNING: type inference failed for: r0v33, types: [X.8vq, java.lang.Object, X.8we] */
    public static void A06(AP5 ap5) {
        C195699tl r1;
        Object r5;
        C188769hx r3 = ap5.A09;
        List list = r3.A0J;
        list.clear();
        C22429B7l b7l = ap5.A0B;
        C20079A6f BYh = b7l.BYh();
        if (BYh != null && (r1 = r3.A05) != null) {
            if (ap5.A05 == 0) {
                C174078wC A032 = ap5.A0H.A03(ap5.A0I, r1.A08);
                if (A032 != null) {
                    list.add(A032);
                }
                List list2 = r3.A05.A06;
                ap5.A03(BYh, list2, Math.min(2, list2.size()));
                if (list2.size() >= 2) {
                    list.add(new C173938vy());
                    AFN afn = new AFN(ap5, 20);
                    ? r0 = new C174358we(13);
                    r0.A00 = afn;
                    list.add(r0);
                }
                if (!r3.A05.A09.isEmpty()) {
                    list.add(new C174268wV(BYh, ap5.A0Q, 2131887062));
                }
            }
            int i = r3.A02;
            if (r3.A0I) {
                if (i != 3) {
                    r5 = new C174358we(53);
                } else if (!(r3.A05 == null || b7l.BYh() == null)) {
                    r5 = new C174158wK(r3.A05.A00.A00, b7l.BYh(), r3.A0G, ap5.A03, new C21537Alk(ap5, 1));
                }
                list.add(r5);
            }
            C195699tl r7 = r3.A05;
            int i2 = r3.A02;
            boolean z = true;
            if (i2 == 1 || i2 == 3) {
                List list3 = r7.A09;
                for (int i3 = 0; i3 < list3.size(); i3++) {
                    list.add(ap5.A00(BYh, list3, i3));
                    list.add(new C173938vy());
                }
                if (!list.isEmpty()) {
                    list.remove(AnonymousClass3MX.A02(list, 1));
                }
            } else {
                if (i2 == 2) {
                    z = false;
                }
                list.add(new C174088wD(false, z));
            }
            if (r3.A0H) {
                list.addAll(ap5.A01());
            } else {
                list.add(new C174318wa(0));
            }
            r3.A03 = 2;
            ap5.A0B();
        }
    }

    public static void A07(AP5 ap5, int i) {
        C188769hx r1 = ap5.A09;
        int i2 = r1.A02;
        if (!(i2 == 0 || i2 == i)) {
            i = 3;
        }
        r1.A02 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r4.A05 == 0) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer A08() {
        /*
            r4 = this;
            X.9hx r3 = r4.A09
            X.9tl r0 = r3.A05
            if (r0 != 0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            X.B7k r0 = r4.A0A
            boolean r0 = r0.Bfl()
            if (r0 == 0) goto L_0x0026
            boolean r0 = r3.A0H
            if (r0 == 0) goto L_0x0021
            X.9tl r0 = r3.A05
            java.util.List r0 = r0.A09
            int r0 = r0.size()
        L_0x001c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0021:
            int r0 = r4.A05
            r2 = 5
            if (r0 != 0) goto L_0x0028
        L_0x0026:
            r2 = 14
        L_0x0028:
            int r0 = r3.A00
            int r1 = r0 + 1
            int r1 = r1 * r2
            X.9tl r0 = r3.A05
            java.util.List r0 = r0.A09
            int r0 = X.C108955ca.A08(r0, r1)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AP5.A08():java.lang.Integer");
    }

    public void A09() {
        C20653ATl aTl = this.A0E.A00;
        aTl.A00();
        aTl.A09 = null;
        aTl.A07 = null;
        this.A0F.A00.A07 = null;
    }

    public void A0A() {
        if (this.A0A.Bfl()) {
            C188769hx r1 = this.A09;
            if (!r1.A0H) {
                r1.A03 = 9;
                A0B();
            }
        }
        C188769hx r12 = this.A09;
        r12.A03 = 7;
        r12.A00++;
        if (this.A05 == 1) {
            C18030ve r2 = this.A0J.A03;
            if (AnonymousClass8BS.A1L(r2) && C18020vd.A05(C18040vf.A02, r2, 4844)) {
                A02();
            }
        }
        A0B();
    }

    public void A0B() {
        C20531AOq aOq = this.A0O;
        if (aOq == null || aOq.A09()) {
            this.A06.A0F(this.A09);
        }
    }

    public void A0C() {
        C188769hx r3 = this.A09;
        List list = r3.A0J;
        if (!list.isEmpty()) {
            int A012 = AnonymousClass3MX.A01(list);
            if (list.get(A012) instanceof C174318wa) {
                list.remove(A012);
                r3.A03 = 2;
                A0B();
            }
        }
    }

    public void A0D(String str) {
        C188769hx r5 = this.A09;
        r5.A05 = null;
        r5.A0H = false;
        r5.A00 = 0;
        r5.A0F = str;
        r5.A04 = new C184189aY(150, (String) null);
        r5.A03 = 0;
        r5.A0J.clear();
        C198469yO r2 = this.A0D;
        C195459tN r1 = r2.A00;
        if (r1 != null) {
            r1.A00 = true;
            r2.A00 = null;
        }
        r2.A03.clear();
        r2.A01.clear();
        this.A02 = null;
        r5.A08 = null;
        C195459tN r12 = this.A00;
        if (r12 != null) {
            r12.A00 = true;
            this.A00 = null;
        }
        C195459tN r13 = this.A01;
        if (r13 != null) {
            r13.A00 = true;
            this.A01 = null;
        }
        this.A0E.A02.set(0);
        A0B();
    }

    public void A0E(Map map) {
        if (this.A0A.Bfl()) {
            C188769hx r3 = this.A09;
            if (r3.A05 != null) {
                C198469yO r2 = this.A0D;
                List list = r2.A03;
                ArrayList A002 = C198469yO.A00(list, map);
                list.clear();
                list.addAll(A002);
                r2.A01 = C198469yO.A00(r2.A01, map);
                List list2 = r3.A05.A09;
                list2.clear();
                list2.addAll(A002);
                A06(this);
                return;
            }
            return;
        }
        C188769hx r7 = this.A09;
        C195699tl r0 = r7.A05;
        if (r0 != null) {
            List<AF0> list3 = r0.A09;
            C18070vi.A0d(map, 1);
            ArrayList A0D2 = C29351c6.A0D(list3);
            for (AF0 af0 : list3) {
                if (af0.A01 != 1) {
                    C194849sO r02 = (C194849sO) map.get(af0.A0F);
                    if (r02 != null) {
                        List list4 = r02.A02;
                        List list5 = r02.A03;
                        String str = r02.A01;
                        af0 = AF0.A00(af0);
                        af0.A06 = list4;
                        af0.A05 = list5;
                        af0.A04 = str;
                        af0.A01 = 1;
                    }
                    C18070vi.A0b(af0);
                }
                A0D2.add(af0);
            }
            List list6 = r7.A05.A09;
            list6.clear();
            list6.addAll(A0D2);
            r7.A0J.clear();
            A05(this);
        }
    }

    public void Bmv(Map map) {
        C188769hx r9 = this.A09;
        ArrayList A10 = C17880vN.A10(r9.A0G);
        Map map2 = map;
        C18070vi.A0d(map2, 1);
        ArrayList A0D2 = C29351c6.A0D(A10);
        Iterator it = A10.iterator();
        while (it.hasNext()) {
            AF1 af1 = (AF1) it.next();
            C20291AEz aEz = af1.A0B;
            if (aEz.A03 == null) {
                String str = aEz.A0A;
                AF0 af0 = (AF0) map2.get(str);
                if (af0 != null) {
                    double d = aEz.A06;
                    double d2 = aEz.A07;
                    boolean z = aEz.A0B;
                    double d3 = aEz.A08;
                    AnonymousClass8nD r18 = aEz.A09;
                    double d4 = aEz.A00;
                    boolean z2 = z;
                    AF0 af02 = af0;
                    String str2 = str;
                    double d5 = d;
                    C20291AEz aEz2 = new C20291AEz(af02, r18, aEz.A05, aEz.A04, str2, d5, d2, d3, d4, aEz.A01, aEz.A02, z2);
                    aEz2.A00 = aEz.A00;
                    aEz2.A01 = aEz.A01;
                    aEz2.A02 = aEz.A02;
                    aEz2.A05 = aEz.A05;
                    aEz2.A04 = aEz.A04;
                    AF1 af12 = new AF1(aEz2, af1.A06, af1.A05, af1.A09);
                    af12.A07 = af1.A07;
                    af12.A08 = af1.A08;
                    af12.A02 = af1.A02;
                    af12.A01 = af1.A01;
                    af12.A00 = af1.A00;
                    af12.A0A = af1.A0A;
                    af12.A04 = af1.A04;
                    af12.A03 = af1.A03;
                    af1 = af12;
                }
            }
            A0D2.add(af1);
        }
        r9.A0G = C29431cG.A0m(C21486Akr.A00(A0D2, 9));
        A07(this, 2);
        A06(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011a, code lost:
        if (r0.A09.isEmpty() != false) goto L_0x011c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bn0(X.C195699tl r21) {
        /*
            r20 = this;
            r1 = r20
            X.9hx r2 = r1.A09
            X.9tl r0 = r2.A05
            if (r0 != 0) goto L_0x000f
            X.9eO r0 = r1.A0E
            X.ATl r0 = r0.A00
            r0.A00()
        L_0x000f:
            X.9tl r3 = r2.A05
            r0 = r21
            if (r3 == 0) goto L_0x0022
            java.lang.String r4 = r3.A03
            if (r4 == 0) goto L_0x0022
            java.lang.String r3 = r0.A03
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0022
            return
        L_0x0022:
            boolean r3 = r1.A04
            if (r3 == 0) goto L_0x003c
            X.B7l r3 = r1.A0B
            X.A6f r4 = r3.BYh()
            java.util.List r3 = r0.A06
            int r0 = r3.size()
            r1.A03(r4, r3, r0)
            r0 = 2
        L_0x0036:
            r2.A03 = r0
            r1.A0B()
            return
        L_0x003c:
            int r7 = r1.A05
            r3 = 1
            if (r7 == r3) goto L_0x0044
            r3 = 2
            if (r7 != r3) goto L_0x0092
        L_0x0044:
            X.A1X r4 = r0.A00
            X.AEf r3 = r4.A00
            if (r3 == 0) goto L_0x0092
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
            java.util.List r3 = r4.A01
            r13.add(r3)
            r5 = 0
            java.lang.Object r3 = r13.get(r5)
            java.util.List r3 = (java.util.List) r3
            boolean r3 = X.AnonymousClass000.A1a(r3)
            r2.A0I = r3
            X.9g8 r4 = new X.9g8
            r4.<init>()
            r2.A06 = r4
            java.lang.Object r3 = r13.get(r5)
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            r4.A01 = r3
            X.B7l r3 = r1.A0B
            X.A6f r9 = r3.BYh()
            X.C17960vV.A07(r9)
            java.lang.String r12 = r0.A02
            java.lang.Double r11 = r0.A01
            X.AOz r10 = new X.AOz
            r10.<init>(r0, r1, r5)
            r14 = 2
            X.9tN r8 = new X.9tN
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r1.A01 = r8
            X.9zl r3 = r1.A08
            r3.A00(r8)
        L_0x0092:
            X.B7l r8 = r1.A0B
            X.A6f r3 = r8.BYh()
            if (r3 == 0) goto L_0x00fa
            X.A6f r3 = r8.BYh()
            boolean r3 = r3.A08()
            if (r3 == 0) goto L_0x00fa
            java.util.List r3 = r0.A09
            X.A6f r12 = r8.BYh()
            java.util.ListIterator r11 = r3.listIterator()
        L_0x00ae:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x00fa
            java.lang.Object r5 = r11.next()
            X.AF0 r5 = (X.AF0) r5
            java.util.List r4 = r5.A0K
            if (r4 == 0) goto L_0x00ae
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x00ae
            java.lang.String r3 = r5.A0D
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x00ae
            java.lang.Object r9 = X.C108955ca.A0p(r4)
            X.AE9 r9 = (X.AE9) r9
            double r5 = r9.A00
            double r3 = r9.A01
            com.google.android.gms.maps.model.LatLng r10 = new com.google.android.gms.maps.model.LatLng
            r10.<init>(r5, r3)
            com.google.android.gms.maps.model.LatLng r5 = X.C20079A6f.A00(r12)
            java.lang.String r3 = "origin"
            android.location.Location r4 = X.AnonymousClass8BX.A0D(r10, r3)
            java.lang.String r3 = "destination"
            android.location.Location r3 = X.AnonymousClass8BX.A0D(r5, r3)
            float r4 = r4.distanceTo(r3)
            int r3 = r9.A02
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00ae
            r11.remove()
            goto L_0x00ae
        L_0x00fa:
            X.B7k r3 = r1.A0A
            boolean r3 = r3.Bfl()
            if (r3 == 0) goto L_0x01f1
            r4 = 150(0x96, float:2.1E-43)
            java.lang.String r12 = r0.A03
            X.9aY r3 = new X.9aY
            r3.<init>(r4, r12)
            r2.A04 = r3
            boolean r3 = android.text.TextUtils.isEmpty(r12)
            if (r3 != 0) goto L_0x011c
            java.util.List r3 = r0.A09
            boolean r4 = r3.isEmpty()
            r3 = 0
            if (r4 == 0) goto L_0x011d
        L_0x011c:
            r3 = 1
        L_0x011d:
            r2.A0H = r3
            X.9tl r3 = r2.A05
            if (r3 != 0) goto L_0x0160
            r9 = r0
        L_0x0124:
            r2.A05 = r9
            X.A36 r3 = r1.A0H
            boolean r3 = r3.A02
            if (r3 == 0) goto L_0x01a0
            java.util.List r11 = r1.A02
            if (r11 != 0) goto L_0x0136
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            r1.A02 = r11
        L_0x0136:
            X.9X1 r10 = r1.A0G
            java.util.List r0 = r0.A09
            java.util.ArrayList r12 = X.AnonymousClass000.A13()
            java.util.Iterator r13 = r0.iterator()
        L_0x0142:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0180
            java.lang.Object r9 = r13.next()
            X.AF0 r9 = (X.AF0) r9
            double r3 = r9.A00
            double r5 = r10.A00
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0142
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0142
            r12.add(r9)
            goto L_0x0142
        L_0x0160:
            java.util.List r6 = r3.A06
            X.A1X r10 = r3.A00
            java.util.List r5 = r0.A07
            java.util.List r4 = r0.A09
            java.util.List r3 = r0.A08
            java.lang.String r13 = r0.A05
            java.lang.Double r11 = r0.A01
            java.lang.String r14 = r0.A04
            java.lang.String r15 = r0.A02
            X.9tl r9 = new X.9tl
            r17 = r6
            r18 = r4
            r19 = r3
            r16 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0124
        L_0x0180:
            r11.addAll(r12)
            java.util.List r0 = r1.A02
            int r3 = r0.size()
            X.9yO r0 = r1.A0D
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            int r3 = r3 + r0
            r0 = 5
            if (r3 >= r0) goto L_0x019d
            boolean r0 = r2.A0H
            if (r0 != 0) goto L_0x019d
            r0 = 10
            goto L_0x0036
        L_0x019d:
            java.util.List r4 = r1.A02
            goto L_0x01a2
        L_0x01a0:
            java.util.List r4 = r0.A09
        L_0x01a2:
            X.9tl r0 = r2.A05
            X.9yO r13 = r1.A0D
            X.A6f r5 = r8.BYh()
            X.C17960vV.A07(r5)
            java.lang.String r8 = r0.A02
            boolean r3 = r2.A0H
            r10 = 2
            if (r7 != 0) goto L_0x01b5
            r10 = 1
        L_0x01b5:
            X.9ab r12 = new X.9ab
            r12.<init>(r0, r1)
            java.lang.Double r7 = r0.A01
            java.util.List r0 = r13.A01
            java.util.ArrayList r14 = X.C17880vN.A10(r0)
            r14.addAll(r4)
            java.util.List r0 = r13.A01
            r0.addAll(r4)
            X.9tN r2 = r13.A00
            if (r2 == 0) goto L_0x01d4
            r0 = 1
            r2.A00 = r0
            r0 = 0
            r13.A00 = r0
        L_0x01d4:
            java.util.ArrayList r9 = X.C108965cb.A0s(r14)
            X.AP3 r6 = new X.AP3
            r11 = r6
            r15 = r10
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            X.9tN r4 = new X.9tN
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r13.A00 = r4
            X.9zl r0 = r13.A02
            r0.A00(r4)
            r0 = 0
            r1.A02 = r0
            return
        L_0x01f1:
            java.util.List r2 = r0.A09
            java.util.ArrayList r2 = X.C17880vN.A10(r2)
            java.util.ArrayList r9 = X.C108965cb.A0s(r2)
            X.A6f r5 = r8.BYh()
            X.C17960vV.A07(r5)
            java.lang.String r8 = r0.A02
            r10 = 2
            if (r7 != 0) goto L_0x0208
            r10 = 1
        L_0x0208:
            java.lang.Double r7 = r0.A01
            X.AP0 r6 = new X.AP0
            r6.<init>(r0, r1, r2)
            X.9tN r4 = new X.9tN
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r1.A00 = r4
            X.9zl r0 = r1.A08
            r0.A00(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AP5.Bn0(X.9tl):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00ba, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r2, 1920) == false) goto L_0x00bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AP5(X.C184169aW r13, X.C185699d0 r14, X.C199299zl r15, X.C22428B7k r16, X.C22429B7l r17, X.C22430B7m r18, X.C22431B7n r19, X.C198469yO r20, X.C186559eO r21, X.C185729d3 r22, X.AnonymousClass9X1 r23, X.A36 r24, X.C20531AOq r25, X.C22553BCk r26, X.C22495BAc r27, X.AnonymousClass1XN r28, int r29) {
        /*
            r12 = this;
            r12.<init>()
            X.1DT r0 = X.AnonymousClass3MW.A0L()
            r12.A06 = r0
            r1 = 21
            X.Alb r0 = new X.Alb
            r0.<init>(r12, r1)
            r12.A03 = r0
            X.AP4 r1 = new X.AP4
            r1.<init>(r12)
            r12.A0M = r1
            r0 = r29
            r12.A05 = r0
            r5 = r28
            r12.A0J = r5
            r0 = r24
            r12.A0H = r0
            r0 = r25
            r12.A0O = r0
            r0 = r17
            r12.A0B = r0
            r12.A0L = r14
            r0 = r23
            r12.A0G = r0
            r0 = r18
            r12.A0N = r0
            r0 = r16
            r12.A0A = r0
            r2 = r22
            r12.A0F = r2
            r0 = r19
            r12.A0C = r0
            r0 = r20
            r12.A0D = r0
            r3 = r21
            r12.A0E = r3
            r0 = r26
            r12.A0I = r0
            r6 = r27
            r12.A0P = r6
            r12.A07 = r13
            X.ATl r0 = r2.A00
            r0.A07 = r12
            r8 = 0
            X.9hx r0 = new X.9hx
            r0.<init>()
            r12.A09 = r0
            X.ATl r0 = r3.A00
            r0.A09 = r12
            r0.A07 = r1
            r12.A08 = r15
            X.2KW r10 = r14.A01
            android.content.SharedPreferences r0 = r10.A00()
            java.lang.String r11 = "pref_saved_search_session_id"
            java.lang.String r7 = X.C17880vN.A0r(r0, r11)
            if (r7 == 0) goto L_0x00c9
            int r0 = r7.length()
            if (r0 == 0) goto L_0x00c9
            android.content.SharedPreferences r2 = r10.A00()
            java.lang.String r9 = "pref_saved_search_session_ts"
            r0 = 0
            long r3 = r2.getLong(r9, r0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00c9
            long r3 = X.AnonymousClass8BR.A04(r3)
            r1 = 1800000(0x1b7740, double:8.89318E-318)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c9
            android.content.SharedPreferences$Editor r2 = X.AnonymousClass8BT.A05(r10)
            long r0 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r0 = r2.putLong(r9, r0)
        L_0x00a4:
            r0.apply()
            r12.A0K = r7
            X.0ve r2 = r5.A03
            boolean r0 = X.AnonymousClass8BS.A1L(r2)
            if (r0 == 0) goto L_0x00bc
            r1 = 1920(0x780, float:2.69E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 1
            if (r1 != 0) goto L_0x00bd
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            r12.A0R = r0
            r1 = 20
            X.Alb r0 = new X.Alb
            r0.<init>(r6, r1)
            r12.A0Q = r0
            return
        L_0x00c9:
            java.lang.String r7 = X.C108985cd.A0f()
            android.content.SharedPreferences$Editor r0 = X.AnonymousClass8BT.A05(r10)
            X.C17880vN.A1E(r0, r11, r7)
            android.content.SharedPreferences$Editor r3 = X.AnonymousClass8BT.A05(r10)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "pref_saved_search_session_ts"
            X.C17880vN.A1D(r3, r2, r0)
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BT.A05(r10)
            java.lang.String r0 = "pref_saved_search_session_action_order"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r8)
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AP5.<init>(X.9aW, X.9d0, X.9zl, X.B7k, X.B7l, X.B7m, X.B7n, X.9yO, X.9eO, X.9d3, X.9X1, X.A36, X.AOq, X.BCk, X.BAc, X.1XN, int):void");
    }

    private ArrayList A01() {
        Object r1;
        ArrayList A13 = AnonymousClass000.A13();
        if (this.A05 != 0) {
            C22429B7l b7l = this.A0B;
            if (b7l.BYh() != null && b7l.BYh().A05() && !this.A0J.A05()) {
                r1 = new C174238wS(this.A0P, this.A0N.BYs());
                A13.add(r1);
                return A13;
            }
        }
        r1 = new C174338wc((String) null);
        A13.add(r1);
        return A13;
    }

    private void A03(C20079A6f a6f, List list, int i) {
        if (!list.isEmpty()) {
            List list2 = this.A09.A0J;
            list2.add(new C174348wd(2));
            for (int i2 = 0; i2 < i; i2++) {
                list2.add(A00(a6f, list, i2));
            }
        }
    }

    public static void A05(AP5 ap5) {
        ArrayList A13 = AnonymousClass000.A13();
        C20079A6f BYh = ap5.A0B.BYh();
        if (BYh != null) {
            C188769hx r3 = ap5.A09;
            C195699tl r1 = r3.A05;
            C17960vV.A08(r1, "BusinessListItemDelegate/addNextBusinessProfilesPage Current search results cannot be null");
            List list = r1.A09;
            int size = list.size();
            int i = ap5.A05;
            boolean A052 = BYh.A05();
            if (i == 0) {
                if (A052 && ap5.A0J.A05()) {
                    r3.A0J.add(new C174238wS(ap5.A0P, ap5.A0N.BYs()));
                }
                C174078wC A032 = ap5.A0H.A03(ap5.A0I, r3.A05.A08);
                if (A032 != null) {
                    r3.A0J.add(A032);
                }
                List list2 = r3.A05.A06;
                ap5.A03(BYh, list2, C108955ca.A08(list2, 2));
                if (!r3.A05.A09.isEmpty()) {
                    r3.A0J.add(new C174268wV(BYh, ap5.A0Q, 2131887062));
                }
            } else if (A052 && ap5.A0J.A05()) {
                A13.add(new C174268wV(BYh, ap5.A0Q, 2131887062));
            }
            for (int i2 = 0; i2 < size; i2++) {
                A13.add(ap5.A00(BYh, list, i2));
                A13.add(new C173938vy());
            }
            A13.remove(A13.size() - 1);
            List list3 = r3.A0J;
            list3.addAll(A13);
            list3.addAll(ap5.A01());
            r3.A0H = true;
            r3.A03 = 2;
            ap5.A0B();
        }
    }

    public void Bmz(C190599lD r3, int i) {
        A0C();
        C188769hx r1 = this.A09;
        r1.A01 = i;
        r1.A03 = 8;
        A0B();
    }
}
