package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5lQ  reason: invalid class name and case insensitive filesystem */
public final class C112405lQ extends C38391rD implements AnonymousClass89H {
    public C135366s5 A00;
    public AnonymousClass6BS A01;
    public List A02;
    public List A03;
    public C116695yT A04;
    public final C56442hT A05;
    public final AnonymousClass6ZX A06;
    public final AnonymousClass1KB A07;
    public final AnonymousClass1M9 A08;
    public final C37451pZ A09;
    public final AnonymousClass118 A0A;
    public final C18000vb A0B;
    public final C18030ve A0C;
    public final AnonymousClass1c4 A0D;
    public final AnonymousClass8BE A0E;
    public final AnonymousClass85Y A0F;
    public final AnonymousClass85Z A0G;
    public final AnonymousClass10I A0H;
    public final C18100vl A0I = AnonymousClass1DF.A01(new C152727oN(this));
    public final C131616lO A0J;
    public final AnonymousClass89G A0K;

    public final void A0V(C29681ch r21, boolean z, boolean z2) {
        C29681ch r8 = r21;
        C18070vi.A0d(r8, 0);
        Iterator it = C29431cG.A0m(this.A02).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                AnonymousClass1ZU.A0B();
                throw null;
            }
            AnonymousClass6TV r6 = (AnonymousClass6TV) next;
            boolean z3 = z;
            boolean z4 = z2;
            if (r6 instanceof AnonymousClass6B5) {
                AnonymousClass6B5 r62 = (AnonymousClass6B5) r6;
                if (C18070vi.A18(r62.A06.A08(), r8)) {
                    this.A0H.CGS(new AnonymousClass7QE(r62, this, r8, i, 1, z3, z4), "NewsletterCategoriesAdapter/notifyItemChanged");
                }
            } else if (r6 instanceof AnonymousClass6B2) {
                for (C135386s7 r14 : ((AnonymousClass6B2) r6).A00) {
                    if (C18070vi.A18(r14.A02.A08(), r8)) {
                        this.A0H.CGS(new AnonymousClass7Q6(r14, this, r8, 3, z3, z4), "NewsletterCategoriesAdapter/notifyItemChanged");
                    }
                }
            }
            i = i2;
        }
    }

    public final void A0W(AnonymousClass6TV r3) {
        this.A02 = C18070vi.A0M(r3);
        this.A03 = C18460wS.A00;
        A0G(0);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        AnonymousClass6BN r4;
        int i2;
        C18070vi.A0d(viewGroup, 0);
        switch (i) {
            case 0:
                boolean A052 = AnonymousClass1J8.A05(this.A0C);
                List list = C42011xT.A0I;
                C18000vb r2 = this.A0B;
                LayoutInflater A0D2 = AnonymousClass3MZ.A0D(viewGroup);
                if (A052) {
                    i2 = 2131625112;
                } else {
                    i2 = 2131625111;
                }
                r4 = new AnonymousClass6BO(AnonymousClass3MX.A0B(A0D2, viewGroup, i2, false), r2, this.A0E);
                break;
            case 1:
                AnonymousClass6ZX r42 = this.A06;
                View A0B2 = AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131625110, false);
                AnonymousClass8BE r22 = this.A0E;
                C37451pZ r1 = this.A09;
                List list2 = C42011xT.A0I;
                AnonymousClass6BS r43 = new AnonymousClass6BS(A0B2, (C131416l3) r42.A00.A01.A00.A1x.get(), r1, r22);
                this.A01 = r43;
                C135366s5 r0 = this.A00;
                r4 = r43;
                if (r0 != null) {
                    AnonymousClass6B2 r02 = r0.A01;
                    r4 = r43;
                    if (r02 != null) {
                        List list3 = r02.A00;
                        r4 = r43;
                        if (list3 != null) {
                            r43.A01.A02(list3);
                            r4 = r43;
                            break;
                        }
                    }
                }
                break;
            case 2:
                r4 = this.A05.A00(AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626177, false), this.A09, this);
                break;
            case 3:
                r4 = new C42011xT(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625115, false));
                break;
            case 4:
                r4 = new AnonymousClass6BM(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625116, false));
                break;
            case 5:
            case 6:
            case 7:
                r4 = new AnonymousClass6BP(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625114, false), this.A0G);
                break;
            case 8:
                r4 = new AnonymousClass6BR(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625109, false), this.A0F);
                break;
            case 9:
                List list4 = C42011xT.A0I;
                r4 = new AnonymousClass6BN(AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131625108, false), this.A0B, this.A0E);
                break;
            case 11:
                r4 = new C42011xT(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625107, false));
                break;
            default:
                throw AnonymousClass001.A13("View type not supported ", AnonymousClass000.A10(), i);
        }
        C42011xT r44 = r4;
        C18070vi.A0z(r44, "null cannot be cast to non-null type com.whatsapp.newsletter.ui.directory.adapter.viewholders.NewsletterDirectoryBaseViewHolder<com.whatsapp.newsletter.directory.DirectoryDataItem>");
        return r44;
    }

    public C112405lQ(C56442hT r4, AnonymousClass6ZX r5, AnonymousClass1KB r6, AnonymousClass1M9 r7, C27201Vd r8, AnonymousClass118 r9, C18000vb r10, C18030ve r11, AnonymousClass1c4 r12, C131616lO r13, AnonymousClass89G r14, AnonymousClass8BE r15, AnonymousClass85Y r16, AnonymousClass85Z r17, AnonymousClass10I r18) {
        AnonymousClass10I r1 = r18;
        C18070vi.A0w(r8, r1, r7, r9, r10);
        C18070vi.A0x(r12, r5, r13, r6, r4);
        C18070vi.A0d(r11, 11);
        this.A0H = r1;
        this.A08 = r7;
        this.A0A = r9;
        this.A0B = r10;
        this.A0D = r12;
        this.A06 = r5;
        this.A0J = r13;
        this.A07 = r6;
        this.A05 = r4;
        this.A0C = r11;
        this.A0K = r14;
        this.A0E = r15;
        this.A0G = r17;
        this.A0F = r16;
        C18460wS r2 = C18460wS.A00;
        this.A02 = r2;
        this.A09 = r8.A06(r9.A00, "newsletter-directory-categories-adapter");
        this.A03 = r2;
    }

    public static final void A00(C112405lQ r3, List list, boolean z) {
        C108955ca.A1O(r3.A04);
        C116695yT r2 = new C116695yT(r3.A02, list);
        ((C37471pb) r3.A0I.getValue()).A00(new C143637Ee(r3, list, z), r2);
        r3.A04 = r2;
    }

    public int A0Q() {
        return this.A02.size();
    }

    public final void A0U() {
        if (!this.A02.isEmpty()) {
            int itemViewType = getItemViewType(AnonymousClass3MX.A01(this.A02));
            if (itemViewType == 3) {
                List list = this.A02;
                ArrayList A13 = AnonymousClass000.A13();
                for (Object next : list) {
                    if (!(next instanceof AnonymousClass6B8)) {
                        A13.add(next);
                    }
                }
                A00(this, A13, false);
            } else if (itemViewType == 5 || itemViewType == 6 || itemViewType == 7) {
                List list2 = this.A02;
                ArrayList A132 = AnonymousClass000.A13();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    C108985cd.A1O(A132, it);
                }
                A00(this, C29431cG.A0l(AnonymousClass6B8.A00, A132), false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ce, code lost:
        if (r10.A09() != false) goto L_0x00d0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0X(X.C135366s5 r14) {
        /*
            r13 = this;
            if (r14 == 0) goto L_0x0149
            X.6B2 r7 = r14.A01
            if (r7 == 0) goto L_0x0015
            X.6BS r2 = r13.A01
            if (r2 == 0) goto L_0x0015
            java.util.List r1 = r7.A00
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.7KN r0 = r2.A01
            r0.A02(r1)
        L_0x0015:
            java.util.List r0 = r14.A02
            if (r0 == 0) goto L_0x003c
            java.util.ArrayList r6 = X.C29351c6.A0D(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0021:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r4.next()
            X.6s3 r0 = (X.C135346s3) r0
            X.9Ir r3 = r0.A00
            java.lang.String r2 = r0.A01
            java.util.List r1 = r0.A02
            X.6s3 r0 = new X.6s3
            r0.<init>(r3, r2, r1)
            r6.add(r0)
            goto L_0x0021
        L_0x003c:
            r6 = 0
        L_0x003d:
            java.lang.String r0 = r14.A00
            X.6s5 r5 = new X.6s5
            r5.<init>(r7, r0, r6)
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            X.1c4 r10 = r13.A0D
            boolean r0 = r10.A06()
            if (r0 == 0) goto L_0x009a
            X.9Ir r2 = X.C179619Ir.EXPLORE
        L_0x0052:
            X.118 r7 = r13.A0A
            r0 = 2131889453(0x7f120d2d, float:1.941357E38)
            java.lang.String r1 = X.C18070vi.A0G(r7, r0)
            X.6B4 r0 = new X.6B4
            r0.<init>(r2, r1)
            r4.add(r0)
            r13.A00 = r5
            X.6B2 r6 = r5.A01
            java.util.List r9 = r5.A02
            if (r6 == 0) goto L_0x00bb
            java.util.List r1 = r6.A00
            boolean r0 = r10.A06()
            if (r0 == 0) goto L_0x0098
            java.lang.String r12 = "EXPLORE"
        L_0x0075:
            java.util.ArrayList r3 = X.C29351c6.A0D(r1)
            java.util.Iterator r11 = r1.iterator()
        L_0x007d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x009c
            java.lang.Object r0 = r11.next()
            X.6s7 r0 = (X.C135386s7) r0
            X.2Dk r8 = r0.A02
            X.1E7 r2 = r0.A00
            boolean r1 = r0.A01
            X.6B5 r0 = new X.6B5
            r0.<init>(r8, r2, r12, r1)
            r3.add(r0)
            goto L_0x007d
        L_0x0098:
            r12 = 0
            goto L_0x0075
        L_0x009a:
            r2 = 0
            goto L_0x0052
        L_0x009c:
            boolean r0 = r10.A04()
            if (r0 == 0) goto L_0x0112
            X.0ve r2 = r10.A02
            r0 = 9353(0x2489, float:1.3106E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0112
            r0 = 9312(0x2460, float:1.3049E-41)
            int r0 = X.C18020vd.A00(r1, r2, r0)
            java.util.List r0 = X.C29431cG.A0v(r3, r0)
            r4.addAll(r0)
        L_0x00bb:
            if (r9 == 0) goto L_0x013c
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x013c
            boolean r0 = r10.A06()
            if (r0 != 0) goto L_0x00d0
            boolean r0 = r10.A09()
            r12 = 0
            if (r0 == 0) goto L_0x00d1
        L_0x00d0:
            r12 = 1
        L_0x00d1:
            java.util.Iterator r11 = r9.iterator()
        L_0x00d5:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0116
            java.lang.Object r2 = r11.next()
            X.6s3 r2 = (X.C135346s3) r2
            java.lang.String r8 = r2.A01
            X.9Ir r1 = r2.A00
            X.6B4 r0 = new X.6B4
            r0.<init>(r1, r8)
            r4.add(r0)
            int r6 = r9.indexOf(r2)
            java.util.List r3 = r2.A02
            java.util.Iterator r2 = r3.iterator()
        L_0x00f7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x010e
            java.lang.Object r1 = r2.next()
            X.6B5 r1 = (X.AnonymousClass6B5) r1
            if (r12 == 0) goto L_0x00f7
            r1.A03 = r8
            r1.A00 = r6
            java.lang.String r0 = r5.A00
            r1.A04 = r0
            goto L_0x00f7
        L_0x010e:
            r4.addAll(r3)
            goto L_0x00d5
        L_0x0112:
            r4.add(r6)
            goto L_0x00bb
        L_0x0116:
            boolean r0 = r10.A05()
            if (r0 == 0) goto L_0x0146
            X.6B6 r0 = X.AnonymousClass6B6.A00
            r4.add(r0)
            r0 = 2131889450(0x7f120d2a, float:1.9413564E38)
            java.lang.String r2 = X.C18070vi.A0G(r7, r0)
            r0 = 2131889449(0x7f120d29, float:1.9413562E38)
            java.lang.String r1 = X.C18070vi.A0G(r7, r0)
            X.6B3 r0 = new X.6B3
            r0.<init>(r2, r1)
            r4.add(r0)
            java.util.List r0 = r13.A03
            r4.addAll(r0)
        L_0x013c:
            X.6B8 r0 = X.AnonymousClass6B8.A00
        L_0x013e:
            r4.add(r0)
            r0 = 0
            A00(r13, r4, r0)
            goto L_0x014a
        L_0x0146:
            X.6B7 r0 = X.AnonymousClass6B7.A00
            goto L_0x013e
        L_0x0149:
            r5 = 0
        L_0x014a:
            r13.A00 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112405lQ.A0X(X.6s5):void");
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r2, int i) {
        C112945mI r22 = (C112945mI) r2;
        C18070vi.A0d(r22, 0);
        r22.A0B((AnonymousClass6TV) this.A02.get(i), i);
    }

    public void Brg(AnonymousClass6B5 r2, int i, boolean z) {
        this.A0K.Brf(r2, i, z);
        r2.A05 = true;
    }

    public void Bri(AnonymousClass6B5 r2, int i) {
        this.A0K.Brh(r2, i);
    }

    public int getItemViewType(int i) {
        Object obj = this.A02.get(i);
        if (obj instanceof AnonymousClass6B4) {
            return 0;
        }
        if (obj instanceof AnonymousClass6B3) {
            return 9;
        }
        if (obj instanceof AnonymousClass6B2) {
            return 1;
        }
        if (obj instanceof AnonymousClass6B5) {
            return 2;
        }
        if (obj instanceof AnonymousClass6B8) {
            return 3;
        }
        if (obj instanceof AnonymousClass6BA) {
            return 4;
        }
        if (obj instanceof AnonymousClass6B9) {
            return 5;
        }
        if (obj instanceof AnonymousClass6BC) {
            return 6;
        }
        if (obj instanceof AnonymousClass6BB) {
            return 7;
        }
        if (obj instanceof AnonymousClass6B7) {
            return 8;
        }
        if (obj instanceof AnonymousClass6B6) {
            return 11;
        }
        throw new C122776Rw("An operation is not implemented.");
    }
}
