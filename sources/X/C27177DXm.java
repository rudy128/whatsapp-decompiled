package X;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.DXm  reason: case insensitive filesystem */
public final class C27177DXm implements C31771g6 {
    public Object A00 = CIR.A0D;
    public C31781g7 A01;
    public final /* synthetic */ C27178DXn A02;

    public C27177DXm(C27178DXn dXn) {
        this.A02 = dXn;
    }

    public Object A00() {
        Object obj = this.A00;
        AnonymousClass1I8 r0 = CIR.A0D;
        if (obj != r0) {
            this.A00 = r0;
            if (obj != CIR.A04) {
                return obj;
            }
            Throwable A04 = C27178DXn.A04(this.A02);
            StackTraceElement stackTraceElement = AnonymousClass2WE.A00;
            throw A04;
        }
        throw AnonymousClass000.A0n("`hasNext()` has not been invoked");
    }

    public Object A01(C30391dr r33) {
        boolean z;
        boolean z2;
        Object A1J;
        C27178DXn dXn = this.A02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C27178DXn.A08;
        C28244Du5 A17 = BE6.A17(dXn, atomicReferenceFieldUpdater);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = C27178DXn.A04;
            if (BE9.A1X(atomicLongFieldUpdater, dXn)) {
                this.A00 = CIR.A04;
                Throwable th = (Throwable) C27178DXn.A05.get(dXn);
                if (th == null) {
                    z = false;
                } else {
                    StackTraceElement stackTraceElement = AnonymousClass2WE.A00;
                    throw th;
                }
            } else {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = C27178DXn.A03;
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(dXn);
                long j = (long) CIR.A01;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (A17.A00 != j2) {
                    C28244Du5 A06 = C27178DXn.A06(dXn, A17, j2);
                    if (A06 != null) {
                        A17 = A06;
                    } else {
                        continue;
                    }
                }
                C27178DXn dXn2 = dXn;
                Object A012 = C27178DXn.A01((Object) null, dXn2, A17, i, andIncrement);
                AnonymousClass1I8 r11 = CIR.A0H;
                if (A012 != r11) {
                    AnonymousClass1I8 r10 = CIR.A08;
                    if (A012 != r10) {
                        AnonymousClass1I8 r15 = CIR.A0I;
                        if (A012 == r15) {
                            C31781g7 A002 = C60682oR.A00(C30581eB.A02(r33));
                            try {
                                this.A01 = A002;
                                Object A013 = C27178DXn.A01(this, dXn, A17, i, andIncrement);
                                if (A013 == r11) {
                                    Bdv(A17, i);
                                } else {
                                    C27177DXm dXm = null;
                                    if (A013 == r10) {
                                        if (andIncrement < dXn.A0J()) {
                                            A17.A01();
                                        }
                                        C28244Du5 A172 = BE6.A17(dXn, atomicReferenceFieldUpdater);
                                        while (true) {
                                            if (C27178DXn.A0I(dXn, atomicLongFieldUpdater.get(dXn), true)) {
                                                C31781g7 r1 = this.A01;
                                                C18070vi.A0b(r1);
                                                this.A01 = null;
                                                this.A00 = CIR.A04;
                                                Throwable th2 = (Throwable) C27178DXn.A05.get(dXn);
                                                if (th2 == null) {
                                                    A1J = AnonymousClass000.A0h();
                                                } else {
                                                    A1J = C108945cZ.A1J(th2);
                                                }
                                                r1.resumeWith(A1J);
                                            } else {
                                                long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(dXn);
                                                long j3 = andIncrement2 / j;
                                                int i2 = (int) (andIncrement2 % j);
                                                if (A172.A00 != j3) {
                                                    C28244Du5 A062 = C27178DXn.A06(dXn, A172, j3);
                                                    if (A062 != null) {
                                                        A172 = A062;
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                                Object A014 = C27178DXn.A01(this, dXn2, A172, i2, andIncrement2);
                                                if (A014 == r11) {
                                                    if (this instanceof C31771g6) {
                                                        dXm = this;
                                                    }
                                                    if (dXm != null) {
                                                        dXm.Bdv(A172, i2);
                                                    }
                                                } else if (A014 == r10) {
                                                    if (andIncrement2 < dXn.A0J()) {
                                                        A172.A01();
                                                    }
                                                } else if (A014 != r15) {
                                                    A172.A01();
                                                    this.A00 = A014;
                                                    this.A01 = null;
                                                    z2 = true;
                                                } else {
                                                    throw AnonymousClass000.A0n("unexpected");
                                                }
                                            }
                                        }
                                    } else {
                                        A17.A01();
                                        this.A00 = A013;
                                        this.A01 = null;
                                        z2 = AnonymousClass000.A0i();
                                    }
                                    A002.CG1((C22821Di) null, z2);
                                }
                                return A002.A0C();
                            } catch (Throwable th3) {
                                A002.A0H();
                                throw th3;
                            }
                        } else {
                            A17.A01();
                            this.A00 = A012;
                            z = true;
                        }
                    } else if (andIncrement < dXn.A0J()) {
                        A17.A01();
                    }
                } else {
                    throw AnonymousClass000.A0n("unreachable");
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public void Bdv(C35951n6 r2, int i) {
        C31781g7 r0 = this.A01;
        if (r0 != null) {
            r0.Bdv(r2, i);
        }
    }
}
