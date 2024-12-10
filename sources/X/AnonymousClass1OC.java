package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1OC  reason: invalid class name */
public class AnonymousClass1OC implements AnonymousClass1OB {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A00;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01;
    public volatile /* synthetic */ Object _parentHandle$volatile;
    public volatile /* synthetic */ Object _state$volatile;

    static {
        Class<Object> cls = Object.class;
        Class<AnonymousClass1OC> cls2 = AnonymousClass1OC.class;
        A01 = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_state$volatile");
        A00 = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_parentHandle$volatile");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        if (r3 == null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0068, code lost:
        A0O(r3, r4.BU1());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object A02(java.lang.Object r7) {
        /*
            r6 = this;
            r3 = 0
            r5 = r3
        L_0x0002:
            java.lang.Object r2 = r6.A0Z()
            boolean r0 = r2 instanceof X.AnonymousClass3E7
            if (r0 == 0) goto L_0x000c
            monitor-enter(r2)
            goto L_0x003c
        L_0x000c:
            boolean r0 = r2 instanceof X.AnonymousClass1OG
            if (r0 == 0) goto L_0x008b
            if (r5 != 0) goto L_0x0016
            java.lang.Throwable r5 = r6.A0A(r7)
        L_0x0016:
            r1 = r2
            X.1OG r1 = (X.AnonymousClass1OG) r1
            boolean r0 = r1.Be2()
            if (r0 == 0) goto L_0x0026
            boolean r0 = r6.A0X(r5, r1)
            if (r0 == 0) goto L_0x0002
            goto L_0x006f
        L_0x0026:
            X.1eL r0 = new X.1eL
            r0.<init>(r5)
            java.lang.Object r1 = r6.A03(r2, r0)
            X.1I8 r0 = X.AnonymousClass1OF.A03
            if (r1 == r0) goto L_0x0074
            X.1I8 r0 = X.AnonymousClass1OF.A04
            if (r1 == r0) goto L_0x0002
            return r1
        L_0x003c:
            r4 = r2
            X.3E7 r4 = (X.AnonymousClass3E7) r4     // Catch:{ all -> 0x0061 }
            boolean r0 = r4.A0D()     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x004b
            X.1I8 r0 = X.AnonymousClass1OF.A06     // Catch:{ all -> 0x0061 }
            monitor-exit(r2)
            return r0
        L_0x004b:
            boolean r0 = r4.A0B()     // Catch:{ all -> 0x0061 }
            if (r5 != 0) goto L_0x0055
            java.lang.Throwable r5 = r6.A0A(r7)     // Catch:{ all -> 0x0061 }
        L_0x0055:
            r4.A09(r5)     // Catch:{ all -> 0x0061 }
            java.lang.Throwable r1 = r4.A06()     // Catch:{ all -> 0x0061 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0065
            goto L_0x0064
        L_0x0061:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0064:
            r3 = r1
        L_0x0065:
            monitor-exit(r2)
            if (r3 == 0) goto L_0x006f
            X.3JS r0 = r4.BU1()
            r6.A0O(r3, r0)
        L_0x006f:
            X.1I8 r0 = X.AnonymousClass1OF.A03
            return r0
        L_0x0074:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Cannot happen in "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x008b:
            X.1I8 r0 = X.AnonymousClass1OF.A06
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OC.A02(java.lang.Object):java.lang.Object");
    }

    private final boolean A0U(Object obj, AnonymousClass1OG r5) {
        if (!C30561e9.A00(this, r5, AnonymousClass1OF.A00(obj), A01)) {
            return false;
        }
        A0l(obj);
        A0M(obj, r5);
        return true;
    }

    private final boolean A0X(Throwable th, AnonymousClass1OG r7) {
        AnonymousClass3JS A0J = A0J(r7);
        if (A0J == null || !C30561e9.A00(this, r7, new AnonymousClass3E7(th, A0J), A01)) {
            return false;
        }
        A0O(th, A0J);
        return true;
    }

    public void A0j() {
    }

    public void A0k(Object obj) {
    }

    public void A0l(Object obj) {
    }

    public boolean A0t() {
        return true;
    }

    public boolean A0u() {
        return false;
    }

    public boolean A0v() {
        return false;
    }

    public boolean A0z(Throwable th) {
        return false;
    }

    public final AnonymousClass1JQ BOj() {
        return new C99434so(new C71423Ff((C30391dr) null, this), 5);
    }

    public Object fold(Object obj, AnonymousClass1OS r3) {
        C18070vi.A0d(r3, 2);
        return r3.invoke(obj, this);
    }

    private final int A00(Object obj) {
        AtomicReferenceFieldUpdater A0F;
        Object obj2;
        if (obj instanceof AnonymousClass1OH) {
            if (!((AnonymousClass1OH) obj).A00) {
                A0F = A01;
                obj2 = AnonymousClass1OF.A01;
            }
            return 0;
        }
        if (obj instanceof AnonymousClass3E6) {
            A0F = A01;
            obj2 = ((AnonymousClass3E6) obj).A00;
        }
        return 0;
        if (!C30561e9.A00(this, obj, obj2, A0F)) {
            return -1;
        }
        A0j();
        return 1;
    }

    private final Object A03(Object obj, Object obj2) {
        if (!(obj instanceof AnonymousClass1OG)) {
            return AnonymousClass1OF.A03;
        }
        if ((!(obj instanceof AnonymousClass1OH) && !(obj instanceof AnonymousClass1ON)) || (obj instanceof AnonymousClass1OP) || (obj2 instanceof C30681eL)) {
            return A04(obj2, (AnonymousClass1OG) obj);
        }
        if (A0U(obj2, (AnonymousClass1OG) obj)) {
            return obj2;
        }
        return AnonymousClass1OF.A04;
    }

    private final Object A05(Object obj, AnonymousClass3E7 r5) {
        Throwable A0C;
        C30681eL r0;
        Throwable th = null;
        if ((obj instanceof C30681eL) && (r0 = (C30681eL) obj) != null) {
            th = r0.A00;
        }
        synchronized (r5) {
            r5.A0B();
            ArrayList A07 = r5.A07(th);
            A0C = A0C(A07, r5);
            if (A0C != null) {
                A0N(A0C, A07);
            }
        }
        if (A0C != null) {
            if (A0C != th) {
                obj = new C30681eL(A0C);
            }
            if (A0W(A0C) || A0z(A0C)) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((C30681eL) obj).A02();
            }
        }
        A0l(obj);
        C30561e9.A00(this, r5, AnonymousClass1OF.A00(obj), A01);
        A0M(obj, r5);
        return obj;
    }

    private final Object A06(C30391dr r5) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C31781g7.A02;
        AnonymousClass3JE r3 = new AnonymousClass3JE(C30581eB.A02(r5), this);
        r3.A0F();
        C60682oR.A01(new AnonymousClass3E0(C30551e8.A01(new AnonymousClass3JM(r3), this, false, true)), r3);
        return r3.A0C();
    }

    private final Object A07(C30391dr r5) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C31781g7.A02;
        C31781g7 r2 = new C31781g7(1, C30581eB.A02(r5));
        r2.A0F();
        C60682oR.A01(new AnonymousClass3E0(C30551e8.A01(new AnonymousClass3JN(r2), this, false, true)), r2);
        Object A0C = r2.A0C();
        if (A0C == C31751g4.COROUTINE_SUSPENDED) {
            return A0C;
        }
        return C27621Wu.A00;
    }

    public static final String A08(Object obj) {
        if (obj instanceof AnonymousClass3E7) {
            AnonymousClass3E7 r2 = (AnonymousClass3E7) obj;
            if (r2.A0B()) {
                return "Cancelling";
            }
            if (r2.A0C()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof AnonymousClass1OG) {
            if (!((AnonymousClass1OG) obj).Be2()) {
                return "New";
            }
            return "Active";
        } else if (obj instanceof C30681eL) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    private final Throwable A0A(Object obj) {
        if (obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new C71313Et(A0d(), (Throwable) null, this);
            }
            return th;
        }
        C18070vi.A0z(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((AnonymousClass1OC) obj).A0f();
    }

    public static final Throwable A0B(Object obj) {
        C30681eL r2;
        if (!(obj instanceof C30681eL) || (r2 = (C30681eL) obj) == null) {
            return null;
        }
        return r2.A00;
    }

    private final AnonymousClass1OP A0G(AnonymousClass1OG r3) {
        AnonymousClass1OP r0;
        if ((r3 instanceof AnonymousClass1OP) && (r0 = (AnonymousClass1OP) r3) != null) {
            return r0;
        }
        AnonymousClass3JS BU1 = r3.BU1();
        if (BU1 != null) {
            return A0H(BU1);
        }
        return null;
    }

    public static final AnonymousClass1OP A0H(AnonymousClass1OL r3) {
        while (!(r3 instanceof AnonymousClass3JV) && (r3.A01() instanceof C57042iR)) {
            AnonymousClass1OL A002 = AnonymousClass1OL.A00(r3);
            if (A002 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass1OL.A01;
                Object obj = atomicReferenceFieldUpdater.get(r3);
                while (true) {
                    A002 = (AnonymousClass1OL) obj;
                    if ((A002 instanceof AnonymousClass3JV) || !(A002.A01() instanceof C57042iR)) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(A002);
                }
            }
            r3 = A002;
        }
        while (true) {
            r3 = r3.A02();
            if ((r3 instanceof AnonymousClass3JV) || !(r3.A01() instanceof C57042iR)) {
                if (r3 instanceof AnonymousClass1OP) {
                    return (AnonymousClass1OP) r3;
                }
                if (r3 instanceof AnonymousClass3JS) {
                    return null;
                }
            }
        }
    }

    private final AnonymousClass1ON A0I(AnonymousClass1OM r2, boolean z) {
        AnonymousClass1ON r0;
        if (z) {
            if (!(r2 instanceof AnonymousClass1OO) || (r0 = (AnonymousClass1ON) r2) == null) {
                r0 = new AnonymousClass3JJ(r2);
            }
        } else if (!(r2 instanceof AnonymousClass1ON) || (r0 = (AnonymousClass1ON) r2) == null) {
            r0 = new AnonymousClass3JL(r2);
        }
        r0.A00 = this;
        return r0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.1OL, X.3JS] */
    private final void A0Q(AnonymousClass1OH r3) {
        ? r1 = new AnonymousClass1OL();
        AnonymousClass3E6 r12 = r1;
        if (!r3.A00) {
            r12 = new AnonymousClass3E6(r1);
        }
        C30561e9.A00(this, r3, r12, A01);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001b A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0R(X.AnonymousClass1ON r5) {
        /*
            r4 = this;
            X.3JS r3 = new X.3JS
            r3.<init>()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = X.AnonymousClass1OL.A01
            r2.set(r3, r5)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.AnonymousClass1OL.A00
            r1.set(r3, r5)
        L_0x000f:
            java.lang.Object r0 = r5.A01()
            if (r0 != r5) goto L_0x002b
            boolean r0 = X.C30561e9.A00(r5, r5, r3, r1)
            if (r0 == 0) goto L_0x000f
        L_0x001b:
            java.lang.Object r1 = r2.get(r5)
            java.lang.Object r0 = r3.A01()
            if (r0 != r5) goto L_0x002b
            boolean r0 = X.C30561e9.A00(r5, r1, r3, r2)
            if (r0 == 0) goto L_0x001b
        L_0x002b:
            X.1OL r1 = r5.A02()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A01
            X.C30561e9.A00(r4, r5, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OC.A0R(X.1ON):void");
    }

    private final boolean A0T(Object obj, AnonymousClass1OP r6, AnonymousClass3E7 r7) {
        do {
            if (C30551e8.A01(new AnonymousClass3JO(obj, r6, r7, this), r6.A00, false, false) != AnonymousClass1OK.A00) {
                return true;
            }
            r6 = A0H(r6);
        } while (r6 != null);
        return false;
    }

    private final boolean A0V(Object obj, AnonymousClass1ON r6, AnonymousClass3JS r7) {
        AnonymousClass1OL A002;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AnonymousClass3JT r3 = new AnonymousClass3JT(obj, this, r6);
        do {
            A002 = AnonymousClass1OL.A00(r7);
            if (A002 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = AnonymousClass1OL.A01;
                Object obj2 = atomicReferenceFieldUpdater2.get(r7);
                while (true) {
                    A002 = (AnonymousClass1OL) obj2;
                    if ((A002 instanceof AnonymousClass3JV) || !(A002.A01() instanceof C57042iR)) {
                        break;
                    }
                    obj2 = atomicReferenceFieldUpdater2.get(A002);
                }
            }
            AnonymousClass1OL.A01.set(r6, A002);
            atomicReferenceFieldUpdater = AnonymousClass1OL.A00;
            atomicReferenceFieldUpdater.set(r6, r7);
            r3.A00 = r7;
        } while (!C30561e9.A00(A002, r7, r3, atomicReferenceFieldUpdater));
        if (r3.A00(A002) == null) {
            return true;
        }
        return false;
    }

    public final String A0e() {
        StringBuilder sb = new StringBuilder();
        sb.append(A0c());
        sb.append('{');
        sb.append(A08(A0Z()));
        sb.append('}');
        return sb.toString();
    }

    public final CancellationException A0g(String str, Throwable th) {
        CancellationException cancellationException;
        if ((th instanceof CancellationException) && (cancellationException = (CancellationException) th) != null) {
            return cancellationException;
        }
        if (str == null) {
            str = A0d();
        }
        return new C71313Et(str, th, this);
    }

    public final void A0q(AnonymousClass1OB r3) {
        if (r3 != null) {
            r3.CNg();
            AnonymousClass1OJ BCj = r3.BCj(this);
            A0p(BCj);
            if (BeK()) {
                BCj.dispose();
            } else {
                return;
            }
        }
        A0p(AnonymousClass1OK.A00);
    }

    public boolean A0y(Throwable th) {
        if ((th instanceof CancellationException) || (A0w(th) && A0t())) {
            return true;
        }
        return false;
    }

    public final AnonymousClass1OJ BCj(AnonymousClass1OC r3) {
        AnonymousClass1OI A012 = C30551e8.A01(new AnonymousClass1OP(r3), this, true, true);
        C18070vi.A0z(A012, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (AnonymousClass1OJ) A012;
    }

    public void BEM(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C71313Et(A0d(), (Throwable) null, this);
        }
        A0m(cancellationException);
    }

    public final AnonymousClass1OI Bdx(C22821Di r2, boolean z, boolean z2) {
        return A0i(new AnonymousClass3E8(r2), z, z2);
    }

    public final void Bdy(C22821Di r4) {
        A0i(new AnonymousClass3E8(r4), false, true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A0e());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    public AnonymousClass1OC(boolean z) {
        AnonymousClass1OH A03;
        if (z) {
            A03 = AnonymousClass1OF.A01;
        } else {
            A03 = AnonymousClass1OF.A02;
        }
        this._state$volatile = A03;
    }

    private final Object A01(Object obj) {
        Object A03;
        do {
            Object A0Z = A0Z();
            if (!(A0Z instanceof AnonymousClass1OG) || ((A0Z instanceof AnonymousClass3E7) && ((AnonymousClass3E7) A0Z).A0C())) {
                return AnonymousClass1OF.A03;
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C30681eL.A01;
            A03 = A03(A0Z, new C30681eL(A0A(obj)));
        } while (A03 == AnonymousClass1OF.A04);
        return A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005c, code lost:
        if (r4 == null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005e, code lost:
        A0O(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0061, code lost:
        r0 = A0G(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0065, code lost:
        if (r0 == null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006b, code lost:
        if (A0T(r7, r0, r3) == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006f, code lost:
        return X.AnonymousClass1OF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0074, code lost:
        return A05(r7, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object A04(java.lang.Object r7, X.AnonymousClass1OG r8) {
        /*
            r6 = this;
            X.3JS r5 = r6.A0J(r8)
            if (r5 != 0) goto L_0x000b
            X.1I8 r0 = X.AnonymousClass1OF.A04
            return r0
        L_0x000b:
            boolean r0 = r8 instanceof X.AnonymousClass3E7
            r4 = 0
            if (r0 == 0) goto L_0x001c
            r3 = r8
            X.3E7 r3 = (X.AnonymousClass3E7) r3
        L_0x0013:
            if (r3 != 0) goto L_0x001a
            X.3E7 r3 = new X.3E7
            r3.<init>(r4, r5)
        L_0x001a:
            monitor-enter(r3)
            goto L_0x001e
        L_0x001c:
            r3 = r4
            goto L_0x0013
        L_0x001e:
            boolean r0 = r3.A0C()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0029
            X.1I8 r0 = X.AnonymousClass1OF.A03     // Catch:{ all -> 0x0075 }
            goto L_0x003d
        L_0x0029:
            r2 = 1
            r3.A08()     // Catch:{ all -> 0x0075 }
            if (r3 == r8) goto L_0x003f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A01     // Catch:{ all -> 0x0075 }
            boolean r0 = X.C30561e9.A00(r6, r8, r3, r0)     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x003f
            X.1I8 r0 = X.AnonymousClass1OF.A04     // Catch:{ all -> 0x0075 }
        L_0x003d:
            monitor-exit(r3)
            return r0
        L_0x003f:
            boolean r1 = r3.A0B()     // Catch:{ all -> 0x0075 }
            boolean r0 = r7 instanceof X.C30681eL     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x004b
            r0 = r7
            X.1eL r0 = (X.C30681eL) r0     // Catch:{ all -> 0x0075 }
            goto L_0x004c
        L_0x004b:
            r0 = r4
        L_0x004c:
            if (r0 == 0) goto L_0x0053
            java.lang.Throwable r0 = r0.A00     // Catch:{ all -> 0x0075 }
            r3.A09(r0)     // Catch:{ all -> 0x0075 }
        L_0x0053:
            java.lang.Throwable r0 = r3.A06()     // Catch:{ all -> 0x0075 }
            r2 = r2 ^ r1
            if (r2 == 0) goto L_0x005b
            r4 = r0
        L_0x005b:
            monitor-exit(r3)
            if (r4 == 0) goto L_0x0061
            r6.A0O(r4, r5)
        L_0x0061:
            X.1OP r0 = r6.A0G(r8)
            if (r0 == 0) goto L_0x0070
            boolean r0 = r6.A0T(r7, r0, r3)
            if (r0 == 0) goto L_0x0070
            X.1I8 r0 = X.AnonymousClass1OF.A00
            return r0
        L_0x0070:
            java.lang.Object r0 = r6.A05(r7, r3)
            return r0
        L_0x0075:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OC.A04(java.lang.Object, X.1OG):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Throwable A0C(java.util.List r6, X.AnonymousClass3E7 r7) {
        /*
            r5 = this;
            boolean r0 = r6.isEmpty()
            r4 = 0
            if (r0 == 0) goto L_0x0017
            boolean r0 = r7.A0B()
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = r5.A0d()
            X.3Et r3 = new X.3Et
            r3.<init>(r0, r4, r5)
        L_0x0016:
            return r3
        L_0x0017:
            java.util.Iterator r2 = r6.iterator()
        L_0x001b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x001b
        L_0x002b:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x0032
            return r1
        L_0x0030:
            r1 = r4
            goto L_0x002b
        L_0x0032:
            r0 = 0
            java.lang.Object r3 = r6.get(r0)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            boolean r0 = r3 instanceof X.C99814tV
            if (r0 == 0) goto L_0x0016
            java.util.Iterator r2 = r6.iterator()
        L_0x0041:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r1 = r2.next()
            if (r1 == r3) goto L_0x0041
            boolean r0 = r1 instanceof X.C99814tV
            if (r0 == 0) goto L_0x0041
            r4 = r1
        L_0x0052:
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L_0x0016
        L_0x0056:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OC.A0C(java.util.List, X.3E7):java.lang.Throwable");
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.1OL, X.3JS] */
    private final AnonymousClass3JS A0J(AnonymousClass1OG r3) {
        AnonymousClass3JS BU1 = r3.BU1();
        if (BU1 != null) {
            return BU1;
        }
        if (r3 instanceof AnonymousClass1OH) {
            return new AnonymousClass1OL();
        }
        if (r3 instanceof AnonymousClass1ON) {
            A0R((AnonymousClass1ON) r3);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("State should have list: ");
        sb.append(r3);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: private */
    public final void A0K(Object obj, AnonymousClass1OP r3, AnonymousClass3E7 r4) {
        AnonymousClass1OP A0H = A0H(r3);
        if (A0H == null || !A0T(obj, A0H, r4)) {
            A0k(A05(obj, r4));
        }
    }

    private final void A0M(Object obj, AnonymousClass1OG r5) {
        C30681eL r4;
        AnonymousClass1OJ A0h = A0h();
        if (A0h != null) {
            A0h.dispose();
            A0p(AnonymousClass1OK.A00);
        }
        Throwable th = null;
        if ((obj instanceof C30681eL) && (r4 = (C30681eL) obj) != null) {
            th = r4.A00;
        }
        if (r5 instanceof AnonymousClass1ON) {
            try {
                ((AnonymousClass1ON) r5).Bdq(th);
            } catch (Throwable th2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in completion handler ");
                sb.append(r5);
                sb.append(" for ");
                sb.append(this);
                A0n(new AnonymousClass3EX(sb.toString(), th2));
            }
        } else {
            AnonymousClass3JS BU1 = r5.BU1();
            if (BU1 != null) {
                A0P(th, BU1);
            }
        }
    }

    public static final void A0N(Throwable th, List list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th2 = (Throwable) it.next();
                if (th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    C25359CeJ.A01(th, th2);
                }
            }
        }
    }

    private final void A0O(Throwable th, AnonymousClass3JS r7) {
        Object A012 = r7.A01();
        C18070vi.A0z(A012, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        AnonymousClass3EX r1 = null;
        for (AnonymousClass1OL r4 = (AnonymousClass1OL) A012; !C18070vi.A18(r4, r7); r4 = r4.A02()) {
            if (r4 instanceof AnonymousClass1OO) {
                AnonymousClass1ON r3 = (AnonymousClass1ON) r4;
                try {
                    r3.Bdq(th);
                } catch (Throwable th2) {
                    if (r1 != null) {
                        C25359CeJ.A01(r1, th2);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Exception in completion handler ");
                        sb.append(r3);
                        sb.append(" for ");
                        sb.append(this);
                        r1 = new AnonymousClass3EX(sb.toString(), th2);
                    }
                }
            }
        }
        if (r1 != null) {
            A0n(r1);
        }
        A0W(th);
    }

    private final void A0P(Throwable th, AnonymousClass3JS r7) {
        Object A012 = r7.A01();
        C18070vi.A0z(A012, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        AnonymousClass3EX r1 = null;
        for (AnonymousClass1OL r4 = (AnonymousClass1OL) A012; !C18070vi.A18(r4, r7); r4 = r4.A02()) {
            if (r4 instanceof AnonymousClass1ON) {
                AnonymousClass1ON r3 = (AnonymousClass1ON) r4;
                try {
                    r3.Bdq(th);
                } catch (Throwable th2) {
                    if (r1 != null) {
                        C25359CeJ.A01(r1, th2);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Exception in completion handler ");
                        sb.append(r3);
                        sb.append(" for ");
                        sb.append(this);
                        r1 = new AnonymousClass3EX(sb.toString(), th2);
                    }
                }
            }
        }
        if (r1 != null) {
            A0n(r1);
        }
    }

    private final boolean A0S() {
        Object A0Z;
        do {
            A0Z = A0Z();
            if (!(A0Z instanceof AnonymousClass1OG)) {
                return false;
            }
        } while (A00(A0Z) < 0);
        return true;
    }

    private final boolean A0W(Throwable th) {
        if (A0v()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        AnonymousClass1OJ A0h = A0h();
        if (A0h == null || A0h == AnonymousClass1OK.A00) {
            return z;
        }
        if (A0h.BEn(th) || z) {
            return true;
        }
        return false;
    }

    public final Object A0Y() {
        Object A0Z = A0Z();
        if (!(!(A0Z instanceof AnonymousClass1OG))) {
            throw new IllegalStateException("This job has not completed yet");
        } else if (!(A0Z instanceof C30681eL)) {
            return AnonymousClass1OF.A01(A0Z);
        } else {
            throw ((C30681eL) A0Z).A00;
        }
    }

    public final Object A0Z() {
        AtomicReferenceFieldUpdater A0F = A01;
        while (true) {
            Object obj = A0F.get(this);
            if (!(obj instanceof C30521e5)) {
                return obj;
            }
            ((C30521e5) obj).A00(this);
        }
    }

    public final Object A0a(Object obj) {
        Object A03;
        do {
            A03 = A03(A0Z(), obj);
            if (A03 == AnonymousClass1OF.A03) {
                StringBuilder sb = new StringBuilder();
                sb.append("Job ");
                sb.append(this);
                sb.append(" is already complete or completing, but is being completed with ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString(), A0B(obj));
            }
        } while (A03 == AnonymousClass1OF.A04);
        return A03;
    }

    public final Object A0b(C30391dr r3) {
        Object A0Z;
        do {
            A0Z = A0Z();
            if (!(A0Z instanceof AnonymousClass1OG)) {
                if (!(A0Z instanceof C30681eL)) {
                    return AnonymousClass1OF.A01(A0Z);
                }
                throw ((C30681eL) A0Z).A00;
            }
        } while (A00(A0Z) < 0);
        return A06(r3);
    }

    public String A0c() {
        return getClass().getSimpleName();
    }

    public String A0d() {
        return "Job was cancelled";
    }

    public CancellationException A0f() {
        CancellationException cancellationException;
        Object A0Z = A0Z();
        Throwable th = null;
        if (A0Z instanceof AnonymousClass3E7) {
            th = ((AnonymousClass3E7) A0Z).A06();
        } else if (A0Z instanceof C30681eL) {
            th = ((C30681eL) A0Z).A00;
        } else if (A0Z instanceof AnonymousClass1OG) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot be cancelling child in this state: ");
            sb.append(A0Z);
            throw new IllegalStateException(sb.toString());
        }
        if ((th instanceof CancellationException) && (cancellationException = (CancellationException) th) != null) {
            return cancellationException;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Parent job is ");
        sb2.append(A08(A0Z));
        return new C71313Et(sb2.toString(), th, this);
    }

    public final AnonymousClass1OJ A0h() {
        return (AnonymousClass1OJ) A00.get(this);
    }

    public final AnonymousClass1OI A0i(AnonymousClass1OM r8, boolean z, boolean z2) {
        C30681eL r5;
        AnonymousClass1OI r3;
        boolean A0V;
        Throwable A06;
        AnonymousClass1ON A0I = A0I(r8, z);
        while (true) {
            Object A0Z = A0Z();
            if (A0Z instanceof AnonymousClass1OH) {
                AnonymousClass1OH r1 = (AnonymousClass1OH) A0Z;
                if (r1.A00) {
                    A0V = C30561e9.A00(this, A0Z, A0I, A01);
                } else {
                    A0Q(r1);
                }
            } else {
                Throwable th = null;
                if (A0Z instanceof AnonymousClass1OG) {
                    AnonymousClass3JS BU1 = ((AnonymousClass1OG) A0Z).BU1();
                    if (BU1 != null) {
                        r3 = AnonymousClass1OK.A00;
                        if (z && (A0Z instanceof AnonymousClass3E7)) {
                            synchronized (A0Z) {
                                AnonymousClass3E7 r2 = (AnonymousClass3E7) A0Z;
                                A06 = r2.A06();
                                if (A06 != null && (!(r8 instanceof AnonymousClass1OP) || r2.A0C())) {
                                    break;
                                } else if (A0V(A0Z, A0I, BU1)) {
                                    if (A06 == null) {
                                        return A0I;
                                    }
                                    r3 = A0I;
                                }
                            }
                        } else {
                            A0V = A0V(A0Z, A0I, BU1);
                        }
                    } else {
                        C18070vi.A0z(A0Z, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        A0R((AnonymousClass1ON) A0Z);
                    }
                } else {
                    if (z2) {
                        if ((A0Z instanceof C30681eL) && (r5 = (C30681eL) A0Z) != null) {
                            th = r5.A00;
                        }
                        r8.Bdq(th);
                    }
                    return AnonymousClass1OK.A00;
                }
            }
            if (A0V) {
                return A0I;
            }
        }
        if (z2) {
            r8.Bdq(A06);
        }
        return r3;
    }

    public void A0m(Throwable th) {
        A0w(th);
    }

    public void A0n(Throwable th) {
        throw th;
    }

    public final void A0o(Throwable th) {
        A0w(th);
    }

    public final void A0p(AnonymousClass1OJ r2) {
        A00.set(this, r2);
    }

    public final void A0r(AnonymousClass1ON r5) {
        Object A0Z;
        Object A012;
        AnonymousClass1OL r2;
        Object obj;
        do {
            A0Z = A0Z();
            if (A0Z instanceof AnonymousClass1ON) {
                if (A0Z == r5) {
                } else {
                    return;
                }
            } else if ((A0Z instanceof AnonymousClass1OG) && ((AnonymousClass1OG) A0Z).BU1() != null) {
                do {
                    A012 = r5.A01();
                    if (!(A012 instanceof C57042iR) && A012 != r5) {
                        C18070vi.A0z(A012, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        r2 = (AnonymousClass1OL) A012;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass1OL.A02;
                        obj = atomicReferenceFieldUpdater.get(r2);
                        if (obj == null) {
                            obj = new C57042iR(r2);
                            atomicReferenceFieldUpdater.set(r2, obj);
                        }
                    } else {
                        return;
                    }
                } while (!C30561e9.A00(r5, A012, obj, AnonymousClass1OL.A00));
                AnonymousClass1OL.A00(r2);
                return;
            } else {
                return;
            }
        } while (!C30561e9.A00(this, A0Z, AnonymousClass1OF.A01, A01));
    }

    public final void A0s(AnonymousClass1OC r1) {
        A0w(r1);
    }

    public final boolean A0w(Object obj) {
        Object A04 = AnonymousClass1OF.A03;
        Object obj2 = A04;
        if (!A0u() || (A04 = A01(obj)) != AnonymousClass1OF.A00) {
            if (A04 == obj2) {
                A04 = A02(obj);
            }
            if (!(A04 == obj2 || A04 == AnonymousClass1OF.A00)) {
                if (A04 == AnonymousClass1OF.A06) {
                    return false;
                }
                A0k(A04);
                return true;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0x(java.lang.Object r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.A0Z()
            java.lang.Object r2 = r3.A03(r0, r4)
            X.1I8 r0 = X.AnonymousClass1OF.A03
            if (r2 != r0) goto L_0x0010
            r0 = 0
            return r0
        L_0x0010:
            X.1I8 r0 = X.AnonymousClass1OF.A00
            r1 = 1
            if (r2 == r0) goto L_0x001e
            X.1I8 r0 = X.AnonymousClass1OF.A04
            if (r2 == r0) goto L_0x0000
            r3.A0k(r2)
        L_0x001e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OC.A0x(java.lang.Object):boolean");
    }

    public final CancellationException BOI() {
        Object A0Z = A0Z();
        if (A0Z instanceof AnonymousClass3E7) {
            Throwable A06 = ((AnonymousClass3E7) A0Z).A06();
            if (A06 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(getClass().getSimpleName());
                sb.append(" is cancelling");
                return A0g(sb.toString(), A06);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Job is still new or active: ");
            sb2.append(this);
            throw new IllegalStateException(sb2.toString());
        } else if (A0Z instanceof AnonymousClass1OG) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Job is still new or active: ");
            sb3.append(this);
            throw new IllegalStateException(sb3.toString());
        } else if (A0Z instanceof C30681eL) {
            return A0g((String) null, ((C30681eL) A0Z).A00);
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(getClass().getSimpleName());
            sb4.append(" has completed normally");
            return new C71313Et(sb4.toString(), (Throwable) null, this);
        }
    }

    public final Throwable BP6() {
        Object A0Z = A0Z();
        if (!(A0Z instanceof AnonymousClass1OG)) {
            return A0B(A0Z);
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    public AnonymousClass1OB BWA() {
        AnonymousClass1OJ A0h = A0h();
        if (A0h != null) {
            return A0h.BWA();
        }
        return null;
    }

    public boolean Be2() {
        Object A0Z = A0Z();
        if (!(A0Z instanceof AnonymousClass1OG) || !((AnonymousClass1OG) A0Z).Be2()) {
            return false;
        }
        return true;
    }

    public final boolean BeK() {
        return !(A0Z() instanceof AnonymousClass1OG);
    }

    public final Object BhB(C30391dr r3) {
        if (!A0S()) {
            C30551e8.A05(r3.getContext());
        } else {
            Object A07 = A07(r3);
            if (A07 == C31751g4.COROUTINE_SUSPENDED) {
                return A07;
            }
        }
        return C27621Wu.A00;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void CNg() {
        /*
            r2 = this;
        L_0x0000:
            java.lang.Object r0 = r2.A0Z()
            int r1 = r2.A00(r0)
            if (r1 == 0) goto L_0x000e
            r0 = 1
            if (r1 == r0) goto L_0x000e
            goto L_0x0000
        L_0x000e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OC.CNg():void");
    }

    public C18570wi get(C23801Hr r2) {
        return AnonymousClass1OQ.A01(this, r2);
    }

    public final C23801Hr getKey() {
        return AnonymousClass1OB.A00;
    }

    public final boolean isCancelled() {
        Object A0Z = A0Z();
        if (A0Z instanceof C30681eL) {
            return true;
        }
        if (!(A0Z instanceof AnonymousClass3E7) || !((AnonymousClass3E7) A0Z).A0B()) {
            return false;
        }
        return true;
    }

    public C18560wh minusKey(C23801Hr r2) {
        return AnonymousClass1OQ.A02(this, r2);
    }

    public C18560wh plus(C18560wh r2) {
        return AnonymousClass1OQ.A03(this, r2);
    }
}
