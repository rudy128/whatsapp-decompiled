package X;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.DXk  reason: case insensitive filesystem */
public class C27175DXk implements AnonymousClass3MV, C31771g6 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A05 = AtomicReferenceFieldUpdater.newUpdater(C27175DXk.class, Object.class, "state$volatile");
    public Object A00;
    public Object A01 = CIE.A01;
    public List A02 = C17880vN.A0z(2);
    public int A03 = -1;
    public final C18560wh A04;
    public volatile /* synthetic */ Object state$volatile = CIE.A05;

    public static final int A00(Object obj, Object obj2, C27175DXk dXk) {
        Object A0l;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
            Object obj3 = atomicReferenceFieldUpdater.get(dXk);
            if (!(obj3 instanceof C31761g5)) {
                if (!C18070vi.A18(obj3, CIE.A04) && !(obj3 instanceof C25004CTe)) {
                    if (C18070vi.A18(obj3, CIE.A03)) {
                        break;
                    }
                    if (C18070vi.A18(obj3, CIE.A05)) {
                        A0l = C18070vi.A0M(obj);
                    } else if (obj3 instanceof List) {
                        A0l = C29431cG.A0l(obj, (Collection) obj3);
                    } else {
                        throw BEA.A0c(obj3, "Unexpected state: ", AnonymousClass000.A10());
                    }
                    if (C30561e9.A00(dXk, obj3, A0l, atomicReferenceFieldUpdater)) {
                        return 1;
                    }
                } else {
                    return 3;
                }
            } else {
                C25004CTe A042 = dXk.A04(obj);
                if (A042 != null && C30561e9.A00(dXk, obj3, A042, atomicReferenceFieldUpdater)) {
                    C31761g5 r2 = (C31761g5) obj3;
                    dXk.A01 = obj2;
                    if (r2.CPz(C27621Wu.A00, (C22821Di) null) == null) {
                        dXk.A01 = CIE.A01;
                    } else {
                        r2.BFP();
                        return 0;
                    }
                }
            }
        }
        return 2;
    }

    private final Object A01(C30391dr r8) {
        AnonymousClass1OI r1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
        Object obj = atomicReferenceFieldUpdater.get(this);
        C18070vi.A0z(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        C25004CTe cTe = (C25004CTe) obj;
        Object obj2 = this.A01;
        List<C25004CTe> list = this.A02;
        if (list != null) {
            for (C25004CTe cTe2 : list) {
                if (cTe2 != cTe) {
                    Object obj3 = cTe2.A01;
                    if (obj3 instanceof C35951n6) {
                        ((C35951n6) obj3).A06(cTe2.A00);
                    } else if ((obj3 instanceof AnonymousClass1OI) && (r1 = (AnonymousClass1OI) obj3) != null) {
                        r1.dispose();
                    }
                }
            }
            atomicReferenceFieldUpdater.set(this, CIE.A04);
            this.A01 = CIE.A01;
            this.A02 = null;
        }
        C36001nB r12 = cTe.A05;
        Object obj4 = cTe.A03;
        Object obj5 = cTe.A04;
        Object invoke = r12.invoke(obj4, obj5, obj2);
        Object obj6 = cTe.A02;
        if (obj5 == CIE.A02) {
            C18070vi.A0z(obj6, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((C22821Di) obj6).invoke(r8);
        }
        C18070vi.A0z(obj6, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
        return ((AnonymousClass1OS) obj6).invoke(invoke, r8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0091 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.C30391dr r8, X.C27175DXk r9) {
        /*
            boolean r0 = r8 instanceof X.C27395Dd8
            if (r0 == 0) goto L_0x0092
            r4 = r8
            X.Dd8 r4 = (X.C27395Dd8) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0092
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0024
            if (r0 == r8) goto L_0x007f
            if (r0 != r3) goto L_0x0099
            X.C30691eM.A01(r1)
        L_0x0023:
            return r1
        L_0x0024:
            X.C30691eM.A01(r1)
            r4.L$0 = r9
            r4.label = r8
            X.1g7 r6 = X.C72473Md.A0m(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = A05
        L_0x0031:
            java.lang.Object r2 = r7.get(r9)
            X.1I8 r1 = X.CIE.A05
            if (r2 != r1) goto L_0x0049
            boolean r0 = X.C30561e9.A00(r9, r2, r6, r7)
            if (r0 == 0) goto L_0x0031
            X.C60682oR.A01(r9, r6)
        L_0x0042:
            java.lang.Object r0 = r6.A0C()
            if (r0 != r5) goto L_0x0086
            return r5
        L_0x0049:
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L_0x0074
            boolean r0 = X.C30561e9.A00(r9, r2, r1, r7)
            if (r0 == 0) goto L_0x0031
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0059:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r2.next()
            X.CTe r1 = r9.A04(r0)
            X.C18070vi.A0b(r1)
            r0 = 0
            r1.A01 = r0
            r0 = -1
            r1.A00 = r0
            r9.A06(r1, r8)
            goto L_0x0059
        L_0x0074:
            boolean r0 = r2 instanceof X.C25004CTe
            if (r0 == 0) goto L_0x009e
            X.1Wu r1 = X.C27621Wu.A00
            r0 = 0
            r6.CG1(r0, r1)
            goto L_0x0042
        L_0x007f:
            java.lang.Object r9 = r4.L$0
            X.DXk r9 = (X.C27175DXk) r9
            X.C30691eM.A01(r1)
        L_0x0086:
            r0 = 0
            r4.L$0 = r0
            r4.label = r3
            java.lang.Object r1 = r9.A01(r4)
            if (r1 != r5) goto L_0x0023
            return r5
        L_0x0092:
            X.Dd8 r4 = new X.Dd8
            r4.<init>(r8, r9)
            goto L_0x0012
        L_0x0099:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x009e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "unexpected state: "
            java.lang.IllegalStateException r0 = X.BEA.A0c(r2, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27175DXk.A02(X.1dr, X.DXk):java.lang.Object");
    }

    public static /* synthetic */ Object A03(C30391dr r1, C27175DXk dXk) {
        if (A05.get(dXk) instanceof C25004CTe) {
            return dXk.A01(r1);
        }
        return A02(r1, dXk);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.CTe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.CTe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.CTe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: X.CTe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.CTe} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C25004CTe A04(java.lang.Object r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.A02
            r3 = 0
            if (r0 == 0) goto L_0x0032
            java.util.Iterator r2 = r0.iterator()
        L_0x0009:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.CTe r0 = (X.C25004CTe) r0
            java.lang.Object r0 = r0.A03
            if (r0 != r5) goto L_0x0009
            r3 = r1
        L_0x001b:
            X.CTe r3 = (X.C25004CTe) r3
            if (r3 != 0) goto L_0x0032
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Clause with object "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " is not found"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r0, r1)
            throw r0
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27175DXk.A04(java.lang.Object):X.CTe");
    }

    public void A05(AnonymousClass1OS r8, C24937CQk cQk) {
        A06(new C25004CTe(cQk.A00, (Object) null, r8, cQk.A02, cQk.A01, this), false);
    }

    public final void A06(C25004CTe cTe, boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
        if (!(atomicReferenceFieldUpdater.get(this) instanceof C25004CTe)) {
            if (!z) {
                Object obj = cTe.A03;
                List<C25004CTe> list = this.A02;
                C18070vi.A0b(list);
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (C25004CTe cTe2 : list) {
                        if (cTe2.A03 == obj) {
                            throw BEA.A0c(obj, "Cannot use select clauses on the same object: ", AnonymousClass000.A10());
                        }
                    }
                }
            }
            cTe.A06.invoke(cTe.A03, this, cTe.A04);
            if (this.A01 == CIE.A01) {
                if (!z) {
                    List list2 = this.A02;
                    C18070vi.A0b(list2);
                    list2.add(cTe);
                }
                cTe.A01 = this.A00;
                cTe.A00 = this.A03;
                this.A00 = null;
                this.A03 = -1;
                return;
            }
            atomicReferenceFieldUpdater.set(this, cTe);
        }
    }

    public void Bdq(Throwable th) {
        Object obj;
        AnonymousClass1OI r1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == CIE.A04) {
                return;
            }
        } while (!C30561e9.A00(this, obj, CIE.A03, atomicReferenceFieldUpdater));
        List<C25004CTe> list = this.A02;
        if (list != null) {
            for (C25004CTe cTe : list) {
                Object obj2 = cTe.A01;
                if (obj2 instanceof C35951n6) {
                    ((C35951n6) obj2).A06(cTe.A00);
                } else if ((obj2 instanceof AnonymousClass1OI) && (r1 = (AnonymousClass1OI) obj2) != null) {
                    r1.dispose();
                }
            }
            this.A01 = CIE.A01;
            this.A02 = null;
        }
    }

    public void Bdv(C35951n6 r1, int i) {
        this.A00 = r1;
        this.A03 = i;
    }

    public C27175DXk(C18560wh r2) {
        this.A04 = r2;
    }
}
