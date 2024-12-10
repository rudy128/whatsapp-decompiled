package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1n1  reason: invalid class name and case insensitive filesystem */
public class C35901n1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01;
    public static final /* synthetic */ AtomicLongFieldUpdater A02;
    public static final /* synthetic */ AtomicLongFieldUpdater A03;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A04;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A05;
    public final C22821Di A00 = new C35981n9(this);
    public volatile /* synthetic */ int _availablePermits$volatile = 1;
    public volatile /* synthetic */ long deqIdx$volatile;
    public volatile /* synthetic */ long enqIdx$volatile;
    public volatile /* synthetic */ Object head$volatile;
    public volatile /* synthetic */ Object tail$volatile;

    static {
        Class<Object> cls = Object.class;
        Class<C35901n1> cls2 = C35901n1.class;
        A04 = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "head$volatile");
        A02 = AtomicLongFieldUpdater.newUpdater(cls2, "deqIdx$volatile");
        A05 = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "tail$volatile");
        A03 = AtomicLongFieldUpdater.newUpdater(cls2, "enqIdx$volatile");
        A01 = AtomicIntegerFieldUpdater.newUpdater(cls2, "_availablePermits$volatile");
    }

    public C35901n1() {
        C35961n7 r0 = new C35961n7((C35961n7) null, 2, 0);
        this.head$volatile = r0;
        this.tail$volatile = r0;
    }

    public void A00() {
        int i;
        Object A002;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A01;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1 || atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("The number of released permits cannot be greater than ");
                        sb.append(1);
                    }
                    i = atomicIntegerFieldUpdater.get(this);
                    break;
                } while (atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("The number of released permits cannot be greater than ");
                sb2.append(1);
                throw new IllegalStateException(sb2.toString());
            } else if (andIncrement < 0) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
                C35951n6 r13 = (C35951n6) atomicReferenceFieldUpdater.get(this);
                long andIncrement2 = A02.getAndIncrement(this);
                long j = (long) C35971n8.A01;
                long j2 = andIncrement2 / j;
                AnonymousClass3H1 r17 = AnonymousClass3H1.A00;
                while (true) {
                    A002 = C61052p2.A00(r17, r13, j2);
                    if (A002 == C61052p2.A00) {
                        break;
                    }
                    C35951n6 A003 = AnonymousClass2VJ.A00(A002);
                    while (true) {
                        C35951n6 r0 = (C35951n6) atomicReferenceFieldUpdater.get(this);
                        if (r0.A00 >= A003.A00) {
                            break;
                        } else if (A003.A08()) {
                            if (C30561e9.A00(this, r0, A003, atomicReferenceFieldUpdater)) {
                                if (r0.A07()) {
                                    r0.A02();
                                }
                            } else if (A003.A07()) {
                                A003.A02();
                            }
                        }
                    }
                }
                C35961n7 r12 = (C35961n7) AnonymousClass2VJ.A00(A002);
                r12.A01();
                int i2 = 0;
                if (r12.A00 <= j2) {
                    int i3 = (int) (andIncrement2 % j);
                    AnonymousClass1I8 r4 = C35971n8.A04;
                    AtomicReferenceArray atomicReferenceArray = r12.A00;
                    Object andSet = atomicReferenceArray.getAndSet(i3, r4);
                    if (andSet == null) {
                        int i4 = C35971n8.A00;
                        while (i2 < i4) {
                            if (atomicReferenceArray.get(i3) != C35971n8.A05) {
                                i2++;
                            } else {
                                return;
                            }
                        }
                        if (!C24565C9m.A00(r4, C35971n8.A02, atomicReferenceArray, i3)) {
                            return;
                        }
                    } else if (andSet == C35971n8.A03) {
                        continue;
                    } else if (andSet instanceof C31761g5) {
                        C31761g5 r2 = (C31761g5) andSet;
                        if (r2.CPz(C27621Wu.A00, this.A00) != null) {
                            r2.BFP();
                            return;
                        }
                    } else if (andSet instanceof C27175DXk) {
                        if (C27175DXk.A00(this, C27621Wu.A00, (C27175DXk) andSet) == 0) {
                            return;
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("unexpected: ");
                        sb3.append(andSet);
                        throw new IllegalStateException(sb3.toString());
                    }
                }
            } else {
                return;
            }
        }
    }
}
