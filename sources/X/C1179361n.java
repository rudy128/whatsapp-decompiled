package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.61n  reason: invalid class name and case insensitive filesystem */
public final class C1179361n extends C25871Py {
    public final C18030ve A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C152497o0(this));
    public final C18100vl A02 = AnonymousClass1DF.A01(new C152507o1(this));
    public final C18100vl A03 = AnonymousClass1DF.A01(new C152517o2(this));
    public final C18100vl A04 = AnonymousClass1DF.A01(new C152527o3(this));
    public final C18100vl A05 = AnonymousClass1DF.A01(new C152537o4(this));
    public final C18100vl A06 = AnonymousClass1DF.A01(new C152547o5(this));
    public final C18100vl A07 = AnonymousClass1DF.A01(new C152557o6(this));
    public final C18100vl A08 = AnonymousClass1DF.A01(new C152567o7(this));
    public final C19830z4 A09;

    public static final Set A00(C1179361n r3) {
        Integer valueOf;
        List A0c = C108995ce.A0c(C108955ca.A0v(r3.A00, 3919));
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A0c.iterator();
        while (it.hasNext()) {
            C109005cf.A0q(A13, it);
        }
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it2 = A13.iterator();
        while (it2.hasNext()) {
            C122676Rh A002 = AnonymousClass6X1.A00(C72453Mb.A0H(it2));
            if (!(A002 == null || (valueOf = Integer.valueOf(A002.androidWaType)) == null)) {
                A132.add(valueOf);
            }
        }
        return C29431cG.A12(A132);
    }

    public void A02() {
        this.A01.getValue();
        this.A06.getValue();
        this.A07.getValue();
        this.A04.getValue();
        this.A03.getValue();
        this.A05.getValue();
    }

    public final boolean A03(int i) {
        C18030ve r2;
        int i2;
        if (i != 66 && i != 67) {
            Set set = (Set) this.A01.getValue();
            Integer valueOf = Integer.valueOf(i);
            if (i != 106) {
                return set.contains(valueOf);
            }
            if (set.contains(valueOf)) {
                return true;
            }
            r2 = this.A00;
            i2 = 10414;
        } else if (C108965cb.A1b((Set) this.A01.getValue(), i)) {
            return true;
        } else {
            r2 = this.A00;
            i2 = 6191;
        }
        if (C18020vd.A05(C18040vf.A02, r2, i2)) {
            return true;
        }
        return false;
    }

    public final boolean A05(Collection collection) {
        Object obj;
        boolean A052;
        C18030ve r3 = this.A00;
        C18040vf r2 = C18040vf.A02;
        if (!C18020vd.A05(r2, r3, 6442)) {
            return false;
        }
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            if (!A0Y.A0w()) {
                return false;
            }
            int i = A0Y.A0u;
            if (i != 0) {
                if (i != 2) {
                    Iterator it2 = C122676Rh.A00.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (((C122676Rh) obj).androidWaType == i) {
                            break;
                        }
                    }
                } else if (!(A0Y instanceof C441822l) || !((C441822l) A0Y).A1L()) {
                    obj = C122676Rh.AUDIO;
                } else {
                    obj = C122676Rh.PTT;
                }
            } else if (!(A0Y instanceof AnonymousClass210) || ((AnonymousClass210) A0Y).A07 == null) {
                obj = C122676Rh.TEXT;
            } else {
                obj = C122676Rh.URL;
            }
            if (obj == C122676Rh.POLL_CREATE || obj == C122676Rh.POLL_RESULT_SNAPSHOT) {
                A052 = C18020vd.A05(r2, r3, 10413);
                continue;
            } else {
                A052 = C29431cG.A18((Iterable) this.A02.getValue(), obj);
                continue;
            }
            if (!A052) {
                return false;
            }
        }
        return true;
    }

    public C1179361n(C19830z4 r2, C18030ve r3) {
        C18070vi.A0j(r3, r2);
        this.A00 = r3;
        this.A09 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r8.A00, 6111) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r8.A00, 6506) == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r8.A00, 7237) == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r8.A00, 10414) == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r8.A00, 9776) == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r8.A00, 5876) == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r8 = this;
            java.util.Set r1 = A00(r8)
            X.0vl r0 = r8.A01
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.containsAll(r1)
            if (r0 == 0) goto L_0x00a2
            X.0vl r0 = r8.A06
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 != 0) goto L_0x0027
            X.0ve r2 = r8.A00
            r1 = 5876(0x16f4, float:8.234E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r7 = 1
            if (r0 != 0) goto L_0x0028
        L_0x0027:
            r7 = 0
        L_0x0028:
            X.0vl r0 = r8.A07
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 != 0) goto L_0x003d
            X.0ve r2 = r8.A00
            r1 = 6111(0x17df, float:8.563E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r6 = 1
            if (r0 != 0) goto L_0x003e
        L_0x003d:
            r6 = 0
        L_0x003e:
            X.0vl r0 = r8.A04
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 != 0) goto L_0x0053
            X.0ve r2 = r8.A00
            r1 = 6506(0x196a, float:9.117E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r5 = 1
            if (r0 != 0) goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            X.0vl r0 = r8.A03
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 != 0) goto L_0x0069
            X.0ve r2 = r8.A00
            r1 = 7237(0x1c45, float:1.0141E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r4 = 1
            if (r0 != 0) goto L_0x006a
        L_0x0069:
            r4 = 0
        L_0x006a:
            X.0vl r0 = r8.A05
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 != 0) goto L_0x007f
            X.0ve r2 = r8.A00
            r1 = 10414(0x28ae, float:1.4593E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r3 = 1
            if (r0 != 0) goto L_0x0080
        L_0x007f:
            r3 = 0
        L_0x0080:
            X.0vl r0 = r8.A08
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 != 0) goto L_0x0095
            X.0ve r2 = r8.A00
            r1 = 9776(0x2630, float:1.3699E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 1
            if (r1 != 0) goto L_0x0096
        L_0x0095:
            r0 = 0
        L_0x0096:
            if (r7 != 0) goto L_0x00a2
            if (r6 != 0) goto L_0x00a2
            if (r5 != 0) goto L_0x00a2
            if (r4 != 0) goto L_0x00a2
            if (r3 != 0) goto L_0x00a2
            if (r0 == 0) goto L_0x00a8
        L_0x00a2:
            X.0z4 r1 = r8.A09
            r0 = 1
            r1.A21(r0)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1179361n.A01():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(X.AnonymousClass206 r5) {
        /*
            r4 = this;
            X.206 r0 = r5.A0K()
            r3 = 0
            if (r0 == 0) goto L_0x0019
            int r0 = r5.A0u
            boolean r0 = r4.A03(r0)
            if (r0 == 0) goto L_0x0018
            X.0vl r0 = r4.A03
        L_0x0011:
            boolean r0 = X.C72453Mb.A1a(r0)
        L_0x0015:
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r3 = 1
        L_0x0018:
            return r3
        L_0x0019:
            boolean r0 = r5 instanceof X.AnonymousClass210
            if (r0 != 0) goto L_0x0017
            boolean r0 = r5 instanceof X.C438421d
            if (r0 != 0) goto L_0x0017
            boolean r0 = r5 instanceof X.AnonymousClass23N
            if (r0 != 0) goto L_0x0017
            boolean r0 = r5 instanceof X.C441822l
            if (r0 == 0) goto L_0x003f
            int r0 = r5.A0u
            boolean r0 = r4.A03(r0)
            if (r0 == 0) goto L_0x0018
            X.22l r5 = (X.C441822l) r5
            boolean r0 = r5.A1L()
            if (r0 == 0) goto L_0x003c
            X.0vl r0 = r4.A06
            goto L_0x0011
        L_0x003c:
            X.0vl r0 = r4.A04
            goto L_0x0011
        L_0x003f:
            boolean r0 = r5 instanceof X.C441322g
            if (r0 == 0) goto L_0x004e
            int r0 = r5.A0u
            boolean r0 = r4.A03(r0)
            if (r0 == 0) goto L_0x0018
            X.0vl r0 = r4.A07
            goto L_0x0011
        L_0x004e:
            boolean r0 = r5 instanceof X.AnonymousClass22H
            if (r0 != 0) goto L_0x0074
            boolean r0 = r5 instanceof X.AnonymousClass22E
            if (r0 != 0) goto L_0x0074
            boolean r0 = r5 instanceof X.AnonymousClass24P
            if (r0 == 0) goto L_0x0065
            int r0 = r5.A0u
            boolean r0 = r4.A03(r0)
            if (r0 == 0) goto L_0x0018
            X.0vl r0 = r4.A05
            goto L_0x0011
        L_0x0065:
            boolean r1 = r5 instanceof X.C441522i
            int r0 = r5.A0u
            if (r1 == 0) goto L_0x0087
            boolean r0 = r4.A03(r0)
            if (r0 == 0) goto L_0x0018
            X.0vl r0 = r4.A08
            goto L_0x0011
        L_0x0074:
            int r0 = r5.A0u
            boolean r0 = r4.A03(r0)
            if (r0 != 0) goto L_0x0017
            X.0ve r2 = r4.A00
            r1 = 6191(0x182f, float:8.675E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            goto L_0x0015
        L_0x0087:
            boolean r3 = r4.A03(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1179361n.A04(X.206):boolean");
    }
}
