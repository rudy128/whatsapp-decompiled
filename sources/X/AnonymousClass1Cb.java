package X;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1Cb  reason: invalid class name */
public class AnonymousClass1Cb {
    public C28781at A00(C22591Cl r8, ReentrantReadWriteLock.ReadLock readLock) {
        C22591Cl r3 = r8;
        ReentrantReadWriteLock.ReadLock readLock2 = readLock;
        if (!(this instanceof AnonymousClass1Cc)) {
            return new C28801av(r8, readLock, false);
        }
        AnonymousClass1Cc r1 = (AnonymousClass1Cc) this;
        AnonymousClass1Ca r4 = r1.A01;
        if (r4.A03) {
            return new C46172Dl(r1.A00, r3, r4, readLock2, false);
        }
        return new C28801av(r8, readLock, false);
    }

    public C28791au A01(C22591Cl r8, ReentrantReadWriteLock.ReadLock readLock) {
        C22591Cl r3 = r8;
        ReentrantReadWriteLock.ReadLock readLock2 = readLock;
        if (!(this instanceof AnonymousClass1Cc)) {
            return new C28801av(r8, readLock, true);
        }
        AnonymousClass1Cc r1 = (AnonymousClass1Cc) this;
        AnonymousClass1Ca r4 = r1.A01;
        if (r4.A03) {
            return new C46172Dl(r1.A00, r3, r4, readLock2, true);
        }
        return new C28801av(r8, readLock, true);
    }
}
