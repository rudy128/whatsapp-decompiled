package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1n3  reason: invalid class name and case insensitive filesystem */
public class C35921n3 extends C35901n1 implements C35911n2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(C35921n3.class, Object.class, "owner$volatile");
    public final C36001nB A00 = new C36011nC(this);
    public volatile /* synthetic */ Object owner$volatile = C35991nA.A00;

    public Object Bhx(C30391dr r23) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean z;
        Object A002;
        while (true) {
            atomicIntegerFieldUpdater = C35901n1.A01;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 <= 1) {
                z = false;
                if (i2 <= 0) {
                    break;
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i2, 0)) {
                    A01.set(this, (Object) null);
                    z = true;
                    break;
                }
            } else {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            }
        }
        if (!z) {
            C31781g7 A003 = C60682oR.A00(C30581eB.A02(r23));
            try {
                AnonymousClass3E1 r2 = new AnonymousClass3E1(A003, this);
                while (true) {
                    int andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement <= 1) {
                        if (andDecrement > 0) {
                            r2.CG1(this.A00, C27621Wu.A00);
                            break;
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C35901n1.A05;
                        C35961n7 r9 = (C35961n7) atomicReferenceFieldUpdater.get(this);
                        long andIncrement = C35901n1.A03.getAndIncrement(this);
                        AnonymousClass3H0 r20 = AnonymousClass3H0.A00;
                        long j = (long) C35971n8.A01;
                        long j2 = andIncrement / j;
                        while (true) {
                            A002 = C61052p2.A00(r20, r9, j2);
                            if (A002 == C61052p2.A00) {
                                break;
                            }
                            C35951n6 A004 = AnonymousClass2VJ.A00(A002);
                            while (true) {
                                C35951n6 r15 = (C35951n6) atomicReferenceFieldUpdater.get(this);
                                if (r15.A00 >= A004.A00) {
                                    break;
                                } else if (A004.A08()) {
                                    if (C30561e9.A00(this, r15, A004, atomicReferenceFieldUpdater)) {
                                        if (r15.A07()) {
                                            r15.A02();
                                        }
                                    } else if (A004.A07()) {
                                        A004.A02();
                                    }
                                }
                            }
                        }
                        C35961n7 r1 = (C35961n7) AnonymousClass2VJ.A00(A002);
                        int i3 = (int) (andIncrement % j);
                        AtomicReferenceArray atomicReferenceArray = r1.A00;
                        if (C24565C9m.A00((Object) null, r2, atomicReferenceArray, i3)) {
                            r2.Bdv(r1, i3);
                            break;
                        } else if (C24565C9m.A00(C35971n8.A04, C35971n8.A05, atomicReferenceArray, i3)) {
                            r2.CG1(this.A00, C27621Wu.A00);
                            break;
                        }
                    }
                }
                Object A0C = A003.A0C();
                C31751g4 r0 = C31751g4.COROUTINE_SUSPENDED;
                if (A0C != r0) {
                    A0C = C27621Wu.A00;
                }
                if (A0C == r0) {
                    return A0C;
                }
            } catch (Throwable th) {
                A003.A0H();
                throw th;
            }
        }
        return C27621Wu.A00;
    }

    public void CQ9(Object obj) {
        while (Math.max(C35901n1.A01.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A01;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            AnonymousClass1I8 r0 = C35991nA.A00;
            if (obj2 != r0) {
                if (obj2 != obj && obj != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("This mutex is locked by ");
                    sb.append(obj2);
                    sb.append(", but ");
                    sb.append(obj);
                    sb.append(" is expected");
                    throw new IllegalStateException(sb.toString());
                } else if (C30561e9.A00(this, obj2, r0, atomicReferenceFieldUpdater)) {
                    A00();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mutex@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[isLocked=");
        boolean z = false;
        if (Math.max(C35901n1.A01.get(this), 0) == 0) {
            z = true;
        }
        sb.append(z);
        sb.append(",owner=");
        sb.append(A01.get(this));
        sb.append(']');
        return sb.toString();
    }
}
