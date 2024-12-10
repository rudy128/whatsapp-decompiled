package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8oe  reason: invalid class name and case insensitive filesystem */
public final class C170048oe extends AnonymousClass1KF {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C20942Abw r7, com.whatsapp.jid.UserJid r8) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A00(r8)
            if (r0 == 0) goto L_0x0098
            X.00H r0 = r6.A01
            java.lang.Object r3 = r0.get()
            X.9yA r3 = (X.C198329yA) r3
            X.00H r0 = r6.A03
            java.lang.Object r5 = X.C18070vi.A0E(r0)
            X.BCT r5 = (X.BCT) r5
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            X.8oS r2 = r5.BPQ(r8)
            X.8of r2 = (X.C170058of) r2
            if (r2 == 0) goto L_0x0099
            X.00H r0 = r3.A01
            r0.get()
            X.9ub r0 = r2.A02
            X.9nJ r1 = r0.A00()
            r0 = 0
            r1.A01 = r0
            X.9ub r4 = r1.A00()
            boolean r0 = A00(r2, r3)
            if (r0 == 0) goto L_0x0099
            X.8oR r3 = r2.A01
            long r1 = java.lang.System.currentTimeMillis()
            X.8of r0 = new X.8of
            r0.<init>(r3, r4, r1)
            r5.CGg(r0)
            X.8oU r3 = new X.8oU
            r3.<init>(r0)
        L_0x0051:
            boolean r0 = r3 instanceof X.AnonymousClass8oU
            if (r0 == 0) goto L_0x0098
            X.0ve r2 = r6.A00
            r1 = 7136(0x1be0, float:1.0E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0098
            X.00H r0 = r6.A04
            java.lang.Object r4 = r0.get()
            X.9j7 r4 = (X.AnonymousClass9j7) r4
            X.8oU r3 = (X.AnonymousClass8oU) r3
            X.8of r3 = r3.A00
            X.9ub r2 = r3.A02
            boolean r0 = r2.A03
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0098
            boolean r0 = r4 instanceof X.AnonymousClass8oa
            if (r0 == 0) goto L_0x0081
            r1 = r4
            X.8oa r1 = (X.AnonymousClass8oa) r1
            r0 = 12
            X.AnonymousClass8oa.A00(r3, r1, r0)
        L_0x0081:
            X.9nJ r1 = r2.A00()
            r0 = 1
            r1.A03 = r0
            X.9ub r0 = r1.A00()
            X.8oS r1 = r3.A00(r0)
            X.BCT r0 = r4.A00
            X.C18070vi.A0b(r1)
            r0.CGg(r1)
        L_0x0098:
            return
        L_0x0099:
            X.8oV r3 = X.AnonymousClass8oV.A00
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170048oe.A03(X.Abw, com.whatsapp.jid.UserJid):void");
    }

    public static boolean A00(C170058of r1, C198329yA r2) {
        return ((C57152ic) r2.A02.get()).A00(r1);
    }

    public void A02() {
        long j;
        long j2;
        C198329yA r8 = (C198329yA) this.A01.get();
        BCT bct = (BCT) C18070vi.A0E(this.A03);
        C18070vi.A0d(bct, 0);
        List BMq = bct.BMq();
        ArrayList<C170058of> A13 = AnonymousClass000.A13();
        for (Object next : BMq) {
            C170058of r9 = (C170058of) next;
            boolean A05 = C18020vd.A05(C18040vf.A02, r8.A00, 7612);
            long currentTimeMillis = System.currentTimeMillis();
            if (A05) {
                j = currentTimeMillis - r9.A01.A01;
                j2 = C170058of.A03;
            } else {
                j = currentTimeMillis - r9.A00;
                j2 = C170058of.A04;
            }
            if (j > j2) {
                A13.add(next);
            }
        }
        for (C170058of r0 : A13) {
            bct.BIF(r0.A01.A00);
        }
    }

    public void A05(UserJid userJid, long j) {
        Object obj;
        AnonymousClass9j7 r2;
        C191859nJ A002;
        C18030ve r5 = this.A00;
        long A05 = AnonymousClass8BR.A05(r5, 7444);
        if (C22941Dw.A00(userJid) != null) {
            C198329yA r3 = (C198329yA) this.A01.get();
            BCT bct = (BCT) C18070vi.A0E(this.A03);
            C18070vi.A0d(bct, 1);
            C170058of r22 = (C170058of) bct.BPQ(userJid);
            if (r22 == null || !A00(r22, r3)) {
                obj = AnonymousClass8oV.A00;
            } else {
                obj = new AnonymousClass8oU(r22);
            }
            if (obj instanceof AnonymousClass8oU) {
                C170058of r32 = ((AnonymousClass8oU) obj).A00;
                C196189ub r4 = r32.A02;
                boolean z = r4.A01;
                boolean A052 = C18020vd.A05(C18040vf.A02, r5, 7136);
                if (z) {
                    if (A052) {
                        r2 = (AnonymousClass9j7) this.A04.get();
                        if (j >= A05 && !r4.A07) {
                            if (r2 instanceof AnonymousClass8oa) {
                                AnonymousClass8oa.A00(r32, (AnonymousClass8oa) r2, 13);
                            }
                            A002 = r4.A00();
                            A002.A07 = true;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (A052) {
                    r2 = (AnonymousClass9j7) this.A04.get();
                    if (j >= A05 && !r4.A04) {
                        if (r2 instanceof AnonymousClass8oa) {
                            AnonymousClass8oa.A00(r32, (AnonymousClass8oa) r2, 14);
                        }
                        A002 = r4.A00();
                        A002.A04 = true;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                AnonymousClass8oS A003 = r32.A00(A002.A00());
                BCT bct2 = r2.A00;
                C18070vi.A0b(A003);
                bct2.CGg(A003);
            }
        }
    }

    public C170048oe(C18030ve r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A00 = r1;
        this.A04 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }

    public void A04(UserJid userJid) {
        Object obj;
        UserJid A002 = C22941Dw.A00(userJid);
        if (A002 != null) {
            C30751eS r0 = (C30751eS) this.A02.get();
            AnonymousClass8oR A022 = r0.A02(A002);
            if (A022 == null || !((AnonymousClass4R8) r0.A01.get()).A00(A022)) {
                A022 = null;
            }
            C198329yA r6 = (C198329yA) this.A01.get();
            BCT bct = (BCT) C18070vi.A0E(this.A03);
            C18070vi.A0d(bct, 2);
            AnonymousClass9MG A003 = C198329yA.A00(A022, bct, userJid);
            if (A003 instanceof AnonymousClass8oW) {
                AnonymousClass1D6 r1 = ((AnonymousClass8oW) A003).A00;
                r6.A01.get();
                C196189ub r12 = (C196189ub) r1.second;
                C18070vi.A0d(r12, 0);
                C191859nJ A004 = r12.A00();
                A004.A01 = true;
                C170058of r13 = new C170058of((AnonymousClass8oR) r1.first, A004.A00(), System.currentTimeMillis());
                if (A00(r13, r6)) {
                    bct.CGg(r13);
                    obj = new AnonymousClass8oU(r13);
                }
                obj = AnonymousClass8oV.A00;
            } else {
                if (!(A003 instanceof AnonymousClass8oX)) {
                    throw AnonymousClass3MW.A14();
                }
                obj = AnonymousClass8oV.A00;
            }
            if (obj instanceof AnonymousClass8oU) {
                if (C18020vd.A05(C18040vf.A02, this.A00, 7136)) {
                    AnonymousClass9j7 r4 = (AnonymousClass9j7) this.A04.get();
                    C170058of r3 = ((AnonymousClass8oU) obj).A00;
                    C196189ub r2 = r3.A02;
                    if (!r2.A06) {
                        if (r4 instanceof AnonymousClass8oa) {
                            AnonymousClass8oa.A00(r3, (AnonymousClass8oa) r4, 11);
                        }
                        C191859nJ A005 = r2.A00();
                        A005.A06 = true;
                        AnonymousClass8oS A006 = r3.A00(A005.A00());
                        BCT bct2 = r4.A00;
                        C18070vi.A0b(A006);
                        bct2.CGg(A006);
                    }
                }
            }
        }
    }

    public void A06(AnonymousClass206 r7) {
        Object obj;
        int i;
        UserJid A0K = AnonymousClass8BT.A0K(r7);
        if (A0K != null) {
            C198329yA r1 = (C198329yA) this.A01.get();
            BCT bct = (BCT) C18070vi.A0E(this.A03);
            C18070vi.A0d(bct, 1);
            C170058of r3 = (C170058of) bct.BPQ(A0K);
            if (r3 == null || !A00(r3, r1)) {
                obj = AnonymousClass8oV.A00;
            } else {
                r1.A01.get();
                C196189ub r12 = r3.A02;
                boolean z = true;
                if (r12.A02 || r12.A01) {
                    i = r12.A00 + 1;
                    z = false;
                } else {
                    i = r12.A00;
                }
                C191859nJ A002 = r12.A00();
                A002.A00 = i;
                A002.A0A = z;
                A002.A02 = false;
                C170058of r0 = new C170058of(r3.A01, A002.A00(), System.currentTimeMillis());
                bct.CGg(r0);
                obj = new AnonymousClass8oU(r0);
            }
            if (obj instanceof AnonymousClass8oU) {
                if (C18020vd.A05(C18040vf.A02, this.A00, 7136)) {
                    AnonymousClass8BY.A0w((AnonymousClass9j7) this.A04.get(), ((AnonymousClass8oU) obj).A00, r7);
                }
            }
        }
    }

    public void A07(AnonymousClass206 r8) {
        Object obj;
        UserJid A0K = AnonymousClass8BT.A0K(r8);
        if (A0K != null) {
            C30751eS r0 = (C30751eS) this.A02.get();
            AnonymousClass8oR A022 = r0.A02(A0K);
            if (A022 == null || !((AnonymousClass4R8) r0.A01.get()).A00(A022)) {
                A022 = null;
            }
            C198329yA r6 = (C198329yA) this.A01.get();
            BCT bct = (BCT) C18070vi.A0E(this.A03);
            C18070vi.A0d(bct, 2);
            AnonymousClass9MG A002 = C198329yA.A00(A022, bct, A0K);
            if (A002 instanceof AnonymousClass8oW) {
                AnonymousClass1D6 r1 = ((AnonymousClass8oW) A002).A00;
                r6.A01.get();
                C196189ub r12 = (C196189ub) r1.second;
                C18070vi.A0d(r12, 0);
                boolean z = r12.A02;
                int i = r12.A00;
                boolean A1O = AnonymousClass000.A1O(z ? 1 : 0);
                C191859nJ A003 = r12.A00();
                A003.A00 = i;
                A003.A0A = A1O;
                A003.A02 = true;
                C170058of r13 = new C170058of((AnonymousClass8oR) r1.first, A003.A00(), System.currentTimeMillis());
                if (A00(r13, r6)) {
                    bct.CGg(r13);
                    obj = new AnonymousClass8oU(r13);
                }
                obj = AnonymousClass8oV.A00;
            } else {
                if (!(A002 instanceof AnonymousClass8oX)) {
                    throw AnonymousClass3MW.A14();
                }
                obj = AnonymousClass8oV.A00;
            }
            if (obj instanceof AnonymousClass8oU) {
                if (C18020vd.A05(C18040vf.A02, this.A00, 7136)) {
                    AnonymousClass8BY.A0w((AnonymousClass9j7) this.A04.get(), ((AnonymousClass8oU) obj).A00, r8);
                }
            }
        }
    }
}
