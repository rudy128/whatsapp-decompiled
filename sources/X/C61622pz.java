package X;

import java.util.concurrent.locks.Lock;

/* renamed from: X.2pz  reason: invalid class name and case insensitive filesystem */
public class C61622pz {
    public final C218617r A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass1NM A02;
    public final AnonymousClass00H A03;
    public final C55342fc A04;

    public static void A00(C61622pz r3) {
        AnonymousClass00H r1 = r3.A02.A01;
        if (!((C54212dm) r1.get()).A00 && !((C54212dm) r1.get()).A01) {
            C55342fc r32 = r3.A04;
            if (r32.A04 == null) {
                synchronized (r32) {
                    if (r32.A04 == null) {
                        r32.A04 = new C54862ep(r32.A00.A00(), r32.A02);
                    }
                }
            }
            C54862ep r33 = r32.A04;
            Lock lock = r33.A03;
            lock.lock();
            if (!r33.A00) {
                lock.unlock();
                r33.A02.CGF(new C146747Ql(r33, 28));
                return;
            }
            lock.unlock();
        }
    }

    public C61622pz(C218617r r1, AnonymousClass1KB r2, AnonymousClass1NM r3, C55342fc r4, AnonymousClass00H r5) {
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r4;
        this.A02 = r3;
        this.A03 = r5;
    }
}
