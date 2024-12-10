package X;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.20Z  reason: invalid class name */
public final class AnonymousClass20Z {
    public final AnonymousClass20Y A00;
    public final AtomicReferenceArray A01;
    public final C18100vl A02;
    public final AnonymousClass20E A03;
    public final int A04;
    public final AnonymousClass20X A05;
    public final AtomicReferenceArray A06;
    public final AtomicReferenceArray A07;

    public final boolean A02(int i) {
        C446624h r0;
        boolean z = false;
        if (i < 0 || i > this.A04) {
            return false;
        }
        AtomicReferenceArray atomicReferenceArray = this.A06;
        Object obj = atomicReferenceArray.get(i);
        if (obj != null) {
            return obj == C446624h.YES;
        }
        AtomicReferenceArray atomicReferenceArray2 = this.A01;
        ReentrantLock reentrantLock = (ReentrantLock) atomicReferenceArray2.get(i);
        if (reentrantLock == null && (reentrantLock = (ReentrantLock) atomicReferenceArray2.get(i)) == null) {
            reentrantLock = new ReentrantLock();
            atomicReferenceArray2.set(i, reentrantLock);
        }
        reentrantLock.lock();
        try {
            Object obj2 = atomicReferenceArray.get(i);
            if (obj2 != null) {
                r0 = C446624h.YES;
            } else {
                if (this.A05.A00(this.A03, i) == null) {
                    obj2 = C446624h.NO;
                } else {
                    obj2 = C446624h.YES;
                }
                atomicReferenceArray.set(i, obj2);
                r0 = C446624h.YES;
            }
            if (obj2 == r0) {
                z = true;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final AnonymousClass20A A00(int i) {
        if (i < 0 || i > this.A04) {
            AnonymousClass20A r0 = (AnonymousClass20A) this.A02.getValue();
            C18070vi.A0X(r0);
            return r0;
        }
        AtomicReferenceArray atomicReferenceArray = this.A07;
        Object obj = atomicReferenceArray.get(i);
        if (obj != null) {
            return (AnonymousClass20A) obj;
        }
        AtomicReferenceArray atomicReferenceArray2 = this.A01;
        ReentrantLock reentrantLock = (ReentrantLock) atomicReferenceArray2.get(i);
        if (reentrantLock == null && (reentrantLock = (ReentrantLock) atomicReferenceArray2.get(i)) == null) {
            reentrantLock = new ReentrantLock();
            atomicReferenceArray2.set(i, reentrantLock);
        }
        reentrantLock.lock();
        try {
            Object obj2 = atomicReferenceArray.get(i);
            if (obj2 == null) {
                C18140vp A002 = this.A05.A00(this.A03, i);
                if (A002 == null) {
                    this.A06.set(i, C446624h.NO);
                    obj2 = (AnonymousClass20A) this.A02.getValue();
                } else {
                    this.A06.set(i, C446624h.YES);
                    obj2 = A002.get();
                }
                atomicReferenceArray.set(i, obj2);
            }
            C18070vi.A0z(obj2, "null cannot be cast to non-null type IP of com.whatsapp.fmessage.platform.core.FMessageSubsystemApi.getIntegrationPoint$lambda$0");
            return (AnonymousClass20A) obj2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final LinkedHashMap A01() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = this.A04;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                if (A02(i2)) {
                    linkedHashMap.put(Integer.valueOf(i2), A00(i2));
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        return linkedHashMap;
    }

    public AnonymousClass20Z(AnonymousClass20X r3, AnonymousClass20Y r4, AnonymousClass20E r5) {
        this.A03 = r5;
        this.A05 = r3;
        this.A00 = r4;
        r3.A01();
        AnonymousClass24T r0 = r3.A00;
        if (r0 == null) {
            C18070vi.A11("metadata");
            throw null;
        }
        int i = r0.A00;
        this.A04 = i;
        int i2 = i + 1;
        this.A01 = new AtomicReferenceArray(i2);
        this.A07 = new AtomicReferenceArray(i2);
        this.A06 = new AtomicReferenceArray(i2);
        this.A02 = new C18110vm(new C446524g(this));
    }
}
