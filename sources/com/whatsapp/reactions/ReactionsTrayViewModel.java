package com.whatsapp.reactions;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1J2;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4a5;
import X.AnonymousClass737;
import X.AnonymousClass74I;
import X.C137176v2;
import X.C1409873v;
import X.C146517Pk;
import X.C179519Ih;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C182329Ty;
import X.C191569mo;
import X.C21118Aem;
import X.C21132Af0;
import X.C25452Cg4;
import X.C29431cG;
import X.C29691ci;
import X.C32731hf;
import X.C41111vp;
import X.C46162Dk;
import X.C72463Mc;
import X.C86514Ry;
import java.util.List;
import java.util.Set;

public final class ReactionsTrayViewModel extends AnonymousClass1J2 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public List A06;
    public List A07;
    public boolean A08;
    public final AnonymousClass11C A09;
    public final AnonymousClass11P A0A;
    public final C18030ve A0B;
    public final C18010vc A0C;
    public final C32731hf A0D;
    public final C191569mo A0E;
    public final C41111vp A0F = AnonymousClass3MW.A0n(-1);
    public final C41111vp A0G = AnonymousClass3MW.A0n(false);
    public final C41111vp A0H = AnonymousClass3MW.A0n(new C86514Ry((String) null, (String) null, false));
    public final AnonymousClass10I A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass11S A0K;
    public final AnonymousClass1CJ A0L;
    public volatile AnonymousClass206 A0M;

    private final void A00(List list, Set set) {
        for (int i = 0; i < list.size() && this.A07.size() < 12; i++) {
            AnonymousClass737 r3 = (AnonymousClass737) list.get(i);
            String obj = r3.toString();
            if (AnonymousClass74I.A01(r3.A00)) {
                obj = C137176v2.A01(AnonymousClass74I.A06(r3.A00));
            }
            if (!set.contains(obj)) {
                this.A07.add(C1409873v.A00(r3, this.A0C).toString());
                set.add(obj);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0V(X.AnonymousClass206 r9, int r10) {
        /*
            r8 = this;
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            X.11S r0 = r8.A0K
            java.lang.String r4 = X.C63892tr.A04(r0, r9)
            r8.A0M = r9
            r8.A01 = r10
            boolean r0 = r8.A0X()
            if (r0 == 0) goto L_0x00ab
            X.0ve r2 = r8.A0B
            r0 = 11732(0x2dd4, float:1.644E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x00ab
            r0 = 11094(0x2b56, float:1.5546E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 != 0) goto L_0x00ab
            java.util.List r0 = X.C25452Cg4.A01
        L_0x002a:
            r8.A06 = r0
            java.util.ArrayList r0 = X.C29431cG.A0m(r0)
            r8.A07 = r0
            java.util.List r0 = r8.A06
            int r0 = r0.size()
            r8.A00 = r0
            java.lang.String r3 = X.C1409073n.A02(r4)
            X.1vp r2 = r8.A0H
            r1 = 0
            X.4Ry r0 = new X.4Ry
            r0.<init>(r3, r3, r1)
            r2.A0F(r0)
            if (r4 == 0) goto L_0x00a8
            int r0 = r4.length()
            if (r0 == 0) goto L_0x00a8
            X.C17960vV.A07(r4)
            X.737 r0 = new X.737
            r0.<init>((java.lang.String) r4)
            int[] r0 = r0.A00
            int[] r0 = X.AnonymousClass74I.A08(r0)
            java.lang.String r6 = X.C137176v2.A01(r0)
            r7 = 1
        L_0x0064:
            java.util.List r0 = r8.A06
            int r0 = r0.size()
            int r0 = r0 + 1
            java.util.ArrayList r0 = X.C17880vN.A0z(r0)
            r8.A07 = r0
            java.util.List r0 = r8.A06
            java.util.Iterator r5 = r0.iterator()
        L_0x0078:
            boolean r0 = r5.hasNext()
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x00b4
            java.lang.String r3 = X.C17880vN.A0v(r5)
            boolean r0 = X.C18070vi.A18(r3, r6)
            if (r0 == 0) goto L_0x0093
            java.util.List r0 = r8.A07
            if (r4 == 0) goto L_0x00af
            r0.add(r4)
            r7 = 0
            goto L_0x0078
        L_0x0093:
            java.util.List r2 = r8.A07
            X.0vc r1 = r8.A0C
            X.737 r0 = new X.737
            r0.<init>((java.lang.String) r3)
            X.737 r0 = X.C1409873v.A00(r0, r1)
            java.lang.String r0 = r0.toString()
            r2.add(r0)
            goto L_0x0078
        L_0x00a8:
            r6 = 0
            r7 = 0
            goto L_0x0064
        L_0x00ab:
            java.util.List r0 = X.C25452Cg4.A00
            goto L_0x002a
        L_0x00af:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r1)
            throw r0
        L_0x00b4:
            if (r7 == 0) goto L_0x00bd
            java.util.List r0 = r8.A07
            if (r4 == 0) goto L_0x01c9
            r0.add(r4)
        L_0x00bd:
            boolean r0 = r8.A0X()
            if (r0 == 0) goto L_0x01c8
            X.0ve r5 = r8.A0B
            r0 = 11094(0x2b56, float:1.5546E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r5, r0)
            if (r0 == 0) goto L_0x01c8
            java.util.List r0 = r8.A07
            int r0 = r0.size()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r0)
            java.util.List r0 = r8.A07
            java.util.Iterator r6 = r0.iterator()
        L_0x00e0:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x010d
            java.lang.String r0 = X.C17880vN.A0v(r6)
            X.737 r2 = new X.737
            r2.<init>((java.lang.String) r0)
            int[] r1 = r2.A00
            boolean r0 = X.AnonymousClass74I.A01(r1)
            if (r0 == 0) goto L_0x0108
            int[] r1 = X.AnonymousClass74I.A06(r1)
            X.737 r0 = new X.737
            r0.<init>((int[]) r1)
            java.lang.String r0 = r0.toString()
        L_0x0104:
            r4.add(r0)
            goto L_0x00e0
        L_0x0108:
            java.lang.String r0 = r2.toString()
            goto L_0x0104
        L_0x010d:
            r0 = 11732(0x2dd4, float:1.644E-41)
            boolean r0 = X.C18020vd.A05(r3, r5, r0)
            if (r0 == 0) goto L_0x0125
            java.lang.String r1 = "🎉"
            boolean r0 = r4.contains(r1)
            if (r0 != 0) goto L_0x0125
            r4.add(r1)
            java.util.List r0 = r8.A07
            r0.add(r1)
        L_0x0125:
            r0 = 11848(0x2e48, float:1.6603E-41)
            boolean r0 = X.C18020vd.A05(r3, r5, r0)
            if (r0 == 0) goto L_0x015e
            X.00H r0 = r8.A04
            if (r0 == 0) goto L_0x0158
            java.lang.Object r0 = r0.get()
            X.6nE r0 = (X.AnonymousClass6nE) r0
            java.util.List r0 = r0.A00()
            java.util.ArrayList r3 = X.C29351c6.A0E(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0143:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x015b
            java.lang.Object r1 = r2.next()
            int[] r1 = (int[]) r1
            X.737 r0 = new X.737
            r0.<init>((int[]) r1)
            r3.add(r0)
            goto L_0x0143
        L_0x0158:
            java.lang.String r0 = "frequentReactionsLazy"
            goto L_0x0198
        L_0x015b:
            r8.A00(r3, r4)
        L_0x015e:
            java.util.List r0 = r8.A07
            int r0 = r0.size()
            r5 = 12
            if (r0 >= r5) goto L_0x01a0
            X.00H r0 = r8.A05
            if (r0 == 0) goto L_0x0196
            java.lang.Object r0 = r0.get()
            X.6ui r0 = (X.C136976ui) r0
            java.util.ArrayList r0 = r0.A05()
            java.util.ArrayList r3 = X.C29351c6.A0E(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x017e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x019d
            java.lang.Object r1 = r2.next()
            int[] r1 = (int[]) r1
            X.C18070vi.A0b(r1)
            X.737 r0 = new X.737
            r0.<init>((int[]) r1)
            r3.add(r0)
            goto L_0x017e
        L_0x0196:
            java.lang.String r0 = "recentEmojisLazy"
        L_0x0198:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x019d:
            r8.A00(r3, r4)
        L_0x01a0:
            java.util.List r0 = r8.A07
            int r0 = r0.size()
            if (r0 >= r5) goto L_0x01c8
            java.util.List r0 = X.C25452Cg4.A02
            java.util.ArrayList r3 = X.C29351c6.A0E(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x01b2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01c5
            java.lang.String r1 = X.C17880vN.A0v(r2)
            X.737 r0 = new X.737
            r0.<init>((java.lang.String) r1)
            r3.add(r0)
            goto L_0x01b2
        L_0x01c5:
            r8.A00(r3, r4)
        L_0x01c8:
            return
        L_0x01c9:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.reactions.ReactionsTrayViewModel.A0V(X.206, int):void");
    }

    public final void A0W(String str) {
        C18070vi.A0d(str, 0);
        C41111vp r5 = this.A0H;
        boolean equals = str.equals(((C86514Ry) r5.A06()).A00);
        AnonymousClass206 r3 = this.A0M;
        if (!equals && r3 != null) {
            this.A0E.A00(r3, AnonymousClass00R.A0C, this.A01);
        }
        A0T(0);
        AnonymousClass4a5.A04(this.A09);
        if (!equals) {
            r5.A0F(new C86514Ry(((C86514Ry) r5.A06()).A00, str, true));
        }
    }

    public final void A0T(int i) {
        AnonymousClass206 r4 = this.A0M;
        if (i == 0) {
            this.A08 = AnonymousClass000.A1T(C72463Mc.A0A(this.A0F), 2);
        }
        C41111vp r3 = this.A0F;
        if (C72463Mc.A0A(r3) == i) {
            return;
        }
        if (i != 1) {
            if (i == 0 && r4 != null) {
                this.A0E.A00(r4, AnonymousClass00R.A15, this.A01);
            }
            AnonymousClass3MX.A1J(r3, i);
            return;
        }
        throw AnonymousClass000.A0k("Use setDisplayStateToTrayOpen instead of setDisplayState(DisplayState.TRAY_OPEN)");
    }

    public final void A0U(int i) {
        AnonymousClass206 r4 = this.A0M;
        if (r4 != null) {
            C21132Af0 af0 = new C21132Af0();
            this.A0I.CGF(new C146517Pk(af0, this, 26));
            af0.A09(new C21118Aem(r4, i, 1, this));
        }
    }

    public final boolean A0X() {
        C46162Dk r2;
        AnonymousClass206 r1 = this.A0M;
        if (r1 == null || !r1.A0w()) {
            if (!C18020vd.A05(C18040vf.A02, this.A0B, 11094)) {
                if (this.A07.size() == this.A00) {
                    return true;
                }
                return false;
            }
        } else {
            AnonymousClass1CJ r5 = this.A0L;
            C18030ve r4 = this.A0B;
            AnonymousClass1BI r22 = r1.A0v.A00;
            if (!C18020vd.A05(C18040vf.A02, r4, 4306)) {
                return false;
            }
            C29691ci A0A2 = r5.A0A(r22);
            C179519Ih r12 = null;
            if ((A0A2 instanceof C46162Dk) && (r2 = (C46162Dk) A0A2) != null) {
                r12 = r2.A03;
            }
            if (r12 != C182329Ty.A00) {
                return false;
            }
        }
        if (this.A07.size() <= 12) {
            return true;
        }
        return false;
    }

    public ReactionsTrayViewModel(AnonymousClass11S r4, AnonymousClass11C r5, AnonymousClass11P r6, AnonymousClass1CJ r7, C18030ve r8, C18010vc r9, C32731hf r10, C191569mo r11, AnonymousClass10I r12, AnonymousClass00H r13) {
        C18070vi.A0w(r6, r8, r12, r4, r7);
        C18070vi.A0x(r5, r11, r10, r9, r13);
        this.A0A = r6;
        this.A0B = r8;
        this.A0I = r12;
        this.A0K = r4;
        this.A0L = r7;
        this.A09 = r5;
        this.A0E = r11;
        this.A0D = r10;
        this.A0C = r9;
        this.A0J = r13;
        List list = C25452Cg4.A00;
        this.A06 = list;
        this.A07 = C29431cG.A0m(list);
        this.A00 = list.size();
    }
}
