package X;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1IB  reason: invalid class name */
public final class AnonymousClass1IB {
    public static final AnonymousClass1I8 A04 = new AnonymousClass1I8("REMOVE_FROZEN");
    public static final /* synthetic */ AtomicLongFieldUpdater A05;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A06;
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final /* synthetic */ AtomicReferenceArray A03;
    public volatile /* synthetic */ Object _next$volatile;
    public volatile /* synthetic */ long _state$volatile;

    static {
        Class<AnonymousClass1IB> cls = AnonymousClass1IB.class;
        A06 = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next$volatile");
        A05 = AtomicLongFieldUpdater.newUpdater(cls, "_state$volatile");
    }

    public static final long A00(AnonymousClass1IB r13) {
        AnonymousClass1IB r8;
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = A05;
        do {
            r8 = r13;
            j = atomicLongFieldUpdater.get(r13);
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(r8, j, j2));
        return j2;
    }

    public static final AnonymousClass1IB A01(AnonymousClass1IB r8, long j) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A06;
        while (true) {
            AnonymousClass1IB r0 = (AnonymousClass1IB) atomicReferenceFieldUpdater.get(r8);
            if (r0 != null) {
                return r0;
            }
            AnonymousClass1IB r5 = new AnonymousClass1IB(r8.A00 * 2, r8.A02);
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = r8.A01;
                if ((i & i3) == (i3 & i2)) {
                    break;
                }
                Object obj = r8.A03.get(i3 & i);
                if (obj == null) {
                    obj = new C52812bW(i);
                }
                r5.A03.set(r5.A01 & i, obj);
                i++;
            }
            A05.set(r5, j & -1152921504606846977L);
            C30561e9.A00(r8, (Object) null, r5, atomicReferenceFieldUpdater);
        }
    }

    public final int A02(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = A05;
        while (true) {
            AnonymousClass1IB r11 = this;
            long j = atomicLongFieldUpdater.get(r11);
            if ((3458764513820540928L & j) == 0) {
                int i = (int) ((1073741823 & j) >> 0);
                int i2 = (int) ((1152921503533105152L & j) >> 30);
                int i3 = r11.A01;
                if (((i2 + 2) & i3) != (i & i3)) {
                    if (!r11.A02 && r11.A03.get(i2 & i3) != null) {
                        int i4 = r11.A00;
                        if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                            break;
                        }
                    } else if (atomicLongFieldUpdater.compareAndSet(r11, j, (j & -1152921503533105153L) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                        Object obj2 = obj;
                        r11.A03.set(i2 & i3, obj2);
                        while ((atomicLongFieldUpdater.get(r11) & 1152921504606846976L) != 0) {
                            r11 = A01(r11, A00(r11));
                            AtomicReferenceArray atomicReferenceArray = r11.A03;
                            int i5 = r11.A01 & i2;
                            Object obj3 = atomicReferenceArray.get(i5);
                            if (!(obj3 instanceof C52812bW) || ((C52812bW) obj3).A00 != i2) {
                                break;
                            }
                            atomicReferenceArray.set(i5, obj2);
                        }
                        return 0;
                    }
                } else {
                    break;
                }
            } else if ((j & 2305843009213693952L) != 0) {
                return 2;
            } else {
                return 1;
            }
        }
        return 1;
    }

    public final Object A03() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = A05;
        while (true) {
            AnonymousClass1IB r12 = this;
            long j = atomicLongFieldUpdater.get(r12);
            if ((1152921504606846976L & j) == 0) {
                int i = (int) ((1073741823 & j) >> 0);
                int i2 = r12.A01;
                int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
                int i4 = i2 & i;
                if (i3 != i4) {
                    AtomicReferenceArray atomicReferenceArray = r12.A03;
                    Object obj = atomicReferenceArray.get(i4);
                    if (obj != null) {
                        if (obj instanceof C52812bW) {
                            break;
                        }
                        long j2 = ((long) ((i + 1) & 1073741823)) << 0;
                        if (atomicLongFieldUpdater.compareAndSet(r12, j, (j & -1073741824) | j2)) {
                            atomicReferenceArray.set(i4, (Object) null);
                            return obj;
                        } else if (r12.A02) {
                            while (true) {
                                long j3 = atomicLongFieldUpdater.get(r12);
                                int i5 = (int) ((1073741823 & j3) >> 0);
                                if ((1152921504606846976L & j3) != 0) {
                                    r12 = A01(r12, A00(r12));
                                } else if (atomicLongFieldUpdater.compareAndSet(r12, j3, (j3 & -1073741824) | j2)) {
                                    r12.A03.set(r12.A01 & i5, (Object) null);
                                    return obj;
                                }
                            }
                        }
                    } else if (r12.A02) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return A04;
            }
        }
        return null;
    }

    public final boolean A04() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = A05;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                break;
            } else if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    public AnonymousClass1IB(int i, boolean z) {
        this.A00 = i;
        this.A02 = z;
        int i2 = i - 1;
        this.A01 = i2;
        this.A03 = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        } else if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
