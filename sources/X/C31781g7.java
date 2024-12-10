package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1g7  reason: invalid class name and case insensitive filesystem */
public class C31781g7 extends C30601eD implements C31761g5, C31771g6, C30401ds {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A02;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A03;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A04;
    public final C30391dr A00;
    public final C18560wh A01;
    public volatile /* synthetic */ int _decisionAndIndex$volatile = 536870911;
    public volatile /* synthetic */ Object _parentHandle$volatile;
    public volatile /* synthetic */ Object _state$volatile = AnonymousClass3E9.A00;

    static {
        Class<C31781g7> cls = C31781g7.class;
        A02 = AtomicIntegerFieldUpdater.newUpdater(cls, "_decisionAndIndex$volatile");
        Class<Object> cls2 = Object.class;
        A04 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state$volatile");
        A03 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle$volatile");
    }

    public static final Object A00(Object obj, C22821Di r4, C35941n5 r5, int i) {
        AnonymousClass3MV r52;
        Object obj2 = obj;
        if ((obj instanceof C30681eL) || ((i != 1 && i != 2) || (r4 == null && !(r5 instanceof AnonymousClass3MV)))) {
            return obj2;
        }
        if (r5 instanceof AnonymousClass3MV) {
            r52 = (AnonymousClass3MV) r5;
        } else {
            r52 = null;
        }
        return new C59682mi(obj2, (Object) null, (Throwable) null, r4, r52);
    }

    public static final AnonymousClass1I8 A02(Object obj, C22821Di r6, C31781g7 r7) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            obj2 = atomicReferenceFieldUpdater.get(r7);
            if (!(obj2 instanceof C35941n5)) {
                return null;
            }
        } while (!C30561e9.A00(r7, obj2, A00(obj, r6, (C35941n5) obj2, r7.A00), atomicReferenceFieldUpdater));
        if (!A08(r7)) {
            r7.A0G();
        }
        return AnonymousClass2W9.A00;
    }

    private final AnonymousClass1OI A01() {
        AnonymousClass1OB r3 = (AnonymousClass1OB) this.A01.get(AnonymousClass1OB.A00);
        if (r3 == null) {
            return null;
        }
        AnonymousClass1OI A012 = C30551e8.A01(new AnonymousClass3JI(this), r3, true, true);
        C30561e9.A00(this, (Object) null, A012, A03);
        return A012;
    }

    private final void A03(Object obj, C22821Di r5, int i) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C35941n5)) {
                if (obj2 instanceof AnonymousClass3JF) {
                    AnonymousClass3JF r1 = (AnonymousClass3JF) obj2;
                    if (r1.A03()) {
                        if (r5 != null) {
                            A0I(r1.A00, r5);
                            return;
                        }
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Already resumed, but proposed with update ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString());
            }
        } while (!C30561e9.A00(this, obj2, A00(obj, r5, (C35941n5) obj2, i), atomicReferenceFieldUpdater));
        if (!A08(this)) {
            A0G();
        }
        A06(this, i);
    }

    public static final void A04(Object obj, C31781g7 r14) {
        boolean A002;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            Object obj2 = atomicReferenceFieldUpdater.get(r14);
            if (obj2 instanceof AnonymousClass3E9) {
                A002 = C30561e9.A00(r14, obj2, obj, atomicReferenceFieldUpdater);
                continue;
            } else {
                if (!(obj2 instanceof AnonymousClass3MV) && !(obj2 instanceof C35951n6)) {
                    if (obj2 instanceof C30681eL) {
                        C30681eL r1 = (C30681eL) obj2;
                        if (r1.A02()) {
                            if (obj2 instanceof AnonymousClass3JF) {
                                Throwable th = r1.A00;
                                if (obj instanceof AnonymousClass3MV) {
                                    r14.A0J(th, (AnonymousClass3MV) obj);
                                    return;
                                }
                                C18070vi.A0z(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                r14.A07((C35951n6) obj);
                                return;
                            }
                            return;
                        }
                    } else if (obj2 instanceof C59682mi) {
                        C59682mi r2 = (C59682mi) obj2;
                        if (r2.A04 == null) {
                            if (!(obj instanceof C35951n6)) {
                                C18070vi.A0z(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                                Throwable th2 = r2.A02;
                                if (th2 != null) {
                                    r14.A0J(th2, (AnonymousClass3MV) obj);
                                    return;
                                }
                                Object obj3 = r2.A01;
                                C22821Di r6 = r2.A03;
                                A002 = C30561e9.A00(r14, obj2, new C59682mi(obj3, r2.A00, th2, r6, (AnonymousClass3MV) obj), atomicReferenceFieldUpdater);
                                continue;
                            } else {
                                return;
                            }
                        }
                    } else if (!(obj instanceof C35951n6)) {
                        C18070vi.A0z(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        A002 = C30561e9.A00(r14, obj2, new C59682mi(obj2, (Object) null, (Throwable) null, (C22821Di) null, (AnonymousClass3MV) obj), atomicReferenceFieldUpdater);
                        continue;
                    } else {
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("It's prohibited to register multiple handlers, tried to register ");
                sb.append(obj);
                sb.append(", already has ");
                sb.append(obj2);
                throw new IllegalStateException(sb.toString());
            }
        } while (!A002);
    }

    public static final void A05(C30391dr r5, C30601eD r6, boolean z) {
        Object obj;
        C41641wp r0;
        if (r6 instanceof C30611eE) {
            C30611eE r1 = (C30611eE) r6;
            obj = r1.A00;
            r1.A00 = C30621eF.A01;
        } else {
            obj = A04.get(r6);
        }
        Throwable A0B = r6.A0B(obj);
        if (A0B != null) {
            obj = new AnonymousClass1IU(A0B);
        } else if ((r6 instanceof C31781g7) && (obj instanceof C59682mi)) {
            obj = ((C59682mi) obj).A01;
        }
        if (z) {
            C18070vi.A0z(r5, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            C30611eE r52 = (C30611eE) r5;
            C30391dr r12 = r52.A02;
            Object obj2 = r52.A01;
            C18560wh context = r12.getContext();
            Object A002 = C30631eG.A00(obj2, context);
            if (A002 != C30631eG.A00) {
                r0 = C30471e0.A03(A002, r12, context);
            } else {
                r0 = null;
            }
            try {
                r12.resumeWith(obj);
            } finally {
                if (r0 == null || r0.A15()) {
                    C30631eG.A02(A002, context);
                }
            }
        } else {
            r5.resumeWith(obj);
        }
    }

    public static final void A06(C31781g7 r7, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
        do {
            i2 = atomicIntegerFieldUpdater.get(r7);
            int i3 = i2 >> 29;
            boolean z = true;
            if (i3 != 0) {
                if (i3 == 1) {
                    C30391dr r6 = r7.A00;
                    boolean z2 = true;
                    if (i != 4) {
                        z2 = false;
                        if (r6 instanceof C30611eE) {
                            boolean z3 = true;
                            if (!(i == 1 || i == 2)) {
                                z3 = false;
                            }
                            int i4 = r7.A00;
                            if (!(i4 == 1 || i4 == 2)) {
                                z = false;
                            }
                            if (z3 == z) {
                                C18600wl r2 = ((C30611eE) r6).A03;
                                C18560wh context = r6.getContext();
                                if (r2.A0C(context)) {
                                    r2.A0D(r7, context);
                                    return;
                                }
                                AnonymousClass1IJ A002 = C37591po.A00();
                                long j = A002.A00;
                                if (j >= 4294967296L) {
                                    A002.A0G(r7);
                                    return;
                                }
                                A002.A00 = j + 4294967296L;
                                try {
                                    A05(r6, r7, true);
                                    do {
                                    } while (A002.A0I());
                                } catch (Throwable th) {
                                    A002.A0H(true);
                                    throw th;
                                }
                                A002.A0H(true);
                                return;
                            }
                        }
                    }
                    A05(r6, r7, z2);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(r7, i2, 1073741824 + (536870911 & i2)));
    }

    private final void A07(C35951n6 r5) {
        int i = A02.get(this) & 536870911;
        if (i != 536870911) {
            try {
                r5.A06(i);
            } catch (Throwable th) {
                C18560wh r2 = this.A01;
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in invokeOnCancellation handler for ");
                sb.append(this);
                C181879Se.A00(r2, new AnonymousClass3EX(sb.toString(), th));
            }
        } else {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
    }

    public static final boolean A08(C31781g7 r2) {
        if (r2.A00 == 2) {
            C30391dr r1 = r2.A00;
            C18070vi.A0z(r1, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (C30611eE.A04.get(r1) == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void A0G() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A03;
        AnonymousClass1OI r0 = (AnonymousClass1OI) atomicReferenceFieldUpdater.get(this);
        if (r0 != null) {
            r0.dispose();
            atomicReferenceFieldUpdater.set(this, AnonymousClass1OK.A00);
        }
    }

    public final void A0H() {
        AnonymousClass1I8 r0;
        C30391dr r4 = this.A00;
        if ((r4 instanceof C30611eE) && r4 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C30611eE.A04;
            do {
                Object obj = atomicReferenceFieldUpdater.get(r4);
                r0 = C30621eF.A00;
                if (obj != r0) {
                    if (!(obj instanceof Throwable)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Inconsistent state ");
                        sb.append(obj);
                        throw new IllegalStateException(sb.toString());
                    } else if (C30561e9.A00(r4, obj, (Object) null, atomicReferenceFieldUpdater)) {
                        Throwable th = (Throwable) obj;
                        if (th != null) {
                            A0G();
                            BEN(th);
                            return;
                        }
                        return;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
            } while (!C30561e9.A00(r4, r0, this, atomicReferenceFieldUpdater));
        }
    }

    public boolean BEN(Throwable th) {
        Object obj;
        boolean z;
        boolean z2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z = false;
            if (!(obj instanceof C35941n5)) {
                return false;
            }
            z2 = obj instanceof AnonymousClass3MV;
            if (z2 || (obj instanceof C35951n6)) {
                z = true;
            }
        } while (!C30561e9.A00(this, obj, new AnonymousClass3JF(th, this, z), atomicReferenceFieldUpdater));
        if (z2) {
            A0J(th, (AnonymousClass3MV) obj);
        } else if (obj instanceof C35951n6) {
            A07((C35951n6) obj);
        }
        if (!A08(this)) {
            A0G();
        }
        A06(this, this.A00);
        return true;
    }

    public void BFP() {
        A06(this, this.A00);
    }

    public void Bdu(C22821Di r2) {
        C60682oR.A01(new C71153Dz(r2), this);
    }

    public void Bdv(C35951n6 r5, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        A04(r5, this);
    }

    public boolean Be2() {
        return A04.get(this) instanceof C35941n5;
    }

    public void CG1(C22821Di r2, Object obj) {
        A03(obj, r2, this.A00);
    }

    public void CG2(Object obj, C18600wl r5) {
        int i;
        C30611eE r2;
        C30391dr r22 = this.A00;
        C18600wl r0 = null;
        if ((r22 instanceof C30611eE) && (r2 = (C30611eE) r22) != null) {
            r0 = r2.A03;
        }
        if (r0 == r5) {
            i = 4;
        } else {
            i = this.A00;
        }
        A03(obj, (C22821Di) null, i);
    }

    public C30401ds getCallerFrame() {
        C30391dr r1 = this.A00;
        if (r1 instanceof C30401ds) {
            return (C30401ds) r1;
        }
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A0D());
        sb.append('(');
        sb.append(AnonymousClass2VG.A00(this.A00));
        sb.append("){");
        Object obj = A04.get(this);
        if (obj instanceof C35941n5) {
            str = "Active";
        } else if (obj instanceof AnonymousClass3JF) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    public C31781g7(int i, C30391dr r3) {
        this.A00 = i;
        this.A00 = r3;
        this.A01 = r3.getContext();
    }

    public Throwable A0B(Object obj) {
        Throwable A0B = super.A0B(obj);
        if (A0B == null) {
            return null;
        }
        return A0B;
    }

    public final Object A0C() {
        int i;
        AnonymousClass1OB r1;
        boolean A08 = A08(this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    if (A08) {
                        A0H();
                    }
                    Object obj = A04.get(this);
                    if (obj instanceof C30681eL) {
                        throw ((C30681eL) obj).A00;
                    }
                    int i3 = this.A00;
                    if ((i3 == 1 || i3 == 2) && (r1 = (AnonymousClass1OB) this.A01.get(AnonymousClass1OB.A00)) != null && !r1.Be2()) {
                        CancellationException BOI = r1.BOI();
                        A09(BOI);
                        throw BOI;
                    } else if (obj instanceof C59682mi) {
                        return ((C59682mi) obj).A01;
                    } else {
                        return obj;
                    }
                } else {
                    throw new IllegalStateException("Already suspended");
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (A03.get(this) == null) {
            A01();
        }
        if (A08) {
            A0H();
        }
        return C31751g4.COROUTINE_SUSPENDED;
    }

    public String A0D() {
        return "CancellableContinuation";
    }

    public Throwable A0E(AnonymousClass1OB r2) {
        return r2.BOI();
    }

    public void A0F() {
        AnonymousClass1OI A012 = A01();
        if (A012 != null && (!(A04.get(this) instanceof C35941n5))) {
            A012.dispose();
            A03.set(this, AnonymousClass1OK.A00);
        }
    }

    public final void A0I(Throwable th, C22821Di r6) {
        try {
            r6.invoke(th);
        } catch (Throwable th2) {
            C18560wh r2 = this.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception in resume onCancellation handler for ");
            sb.append(this);
            C181879Se.A00(r2, new AnonymousClass3EX(sb.toString(), th2));
        }
    }

    public final void A0J(Throwable th, AnonymousClass3MV r6) {
        try {
            r6.Bdq(th);
        } catch (Throwable th2) {
            C18560wh r2 = this.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception in invokeOnCancellation handler for ");
            sb.append(this);
            C181879Se.A00(r2, new AnonymousClass3EX(sb.toString(), th2));
        }
    }

    public Object CPz(Object obj, C22821Di r3) {
        return A02(obj, r3, this);
    }

    public C18560wh getContext() {
        return this.A01;
    }

    public void resumeWith(Object obj) {
        Throwable A002 = C30671eK.A00(obj);
        if (A002 != null) {
            obj = new C30681eL(A002);
        }
        A03(obj, (C22821Di) null, this.A00);
    }
}
