package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3Aa  reason: invalid class name and case insensitive filesystem */
public class C70173Aa implements AnonymousClass1TI {
    public int A00 = -1;
    public int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C70173Aa(C32861hs r2, AnonymousClass34B r3, C63642tS r4, int i) {
        this.A02 = i;
        this.A03 = r2;
        this.A05 = r4;
        this.A04 = r3;
    }

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        C63642tS r5;
        AnonymousClass1KB r2;
        int i;
        if (this.A02 != 0) {
            int A0M = AnonymousClass000.A0M(obj);
            if (A0M != this.A00) {
                this.A00 = A0M;
                if (A0M >= this.A01 + 5) {
                    this.A01 = A0M;
                    ((C63642tS) this.A05).A03.size();
                }
                C32861hs r7 = (C32861hs) this.A03;
                C32821ho r6 = r7.A0A;
                r5 = (C63642tS) this.A05;
                Iterator A0o = C29431cG.A0o(r5.A03);
                while (A0o.hasNext()) {
                    AnonymousClass21V A0b = C17880vN.A0b(A0o);
                    if (C18020vd.A07(r6)) {
                        AnonymousClass206.A00(A0b).A0C = (long) A0M;
                    } else {
                        synchronized (A0b) {
                            AnonymousClass206.A00(A0b).A0C = (long) A0M;
                        }
                    }
                }
                r2 = r7.A01;
                i = 23;
            } else {
                return;
            }
        } else {
            int A0M2 = AnonymousClass000.A0M(obj);
            if (A0M2 != this.A00) {
                this.A00 = A0M2;
                if (A0M2 >= this.A01 + 5) {
                    this.A01 = A0M2;
                    ((C63642tS) this.A05).A03.size();
                }
                C32861hs r8 = (C32861hs) this.A03;
                C32821ho r72 = r8.A0A;
                r5 = (C63642tS) this.A05;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                Iterator A0o2 = C29431cG.A0o(r5.A03);
                while (A0o2.hasNext()) {
                    AnonymousClass21V A0b2 = C17880vN.A0b(A0o2);
                    if (C18020vd.A07(r72)) {
                        C62572rc A002 = AnonymousClass206.A00(A0b2);
                        boolean z = false;
                        if (A0b2.A0u != 1) {
                            long j = (long) A0M2;
                            if (A002.A0C != j) {
                                z = true;
                            }
                            A002.A0C = j;
                            if (z) {
                                atomicBoolean.set(true);
                            }
                        }
                    } else {
                        synchronized (A0b2) {
                            C62572rc A003 = AnonymousClass206.A00(A0b2);
                            boolean z2 = false;
                            if (A0b2.A0u != 1) {
                                long j2 = (long) A0M2;
                                if (A003.A0C != j2) {
                                    z2 = true;
                                }
                                A003.A0C = j2;
                                if (z2) {
                                    atomicBoolean.set(true);
                                }
                            }
                        }
                    }
                }
                if (atomicBoolean.get()) {
                    r2 = r8.A01;
                    i = 22;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        r2.CGP(new C146807Qr(this, r5, i));
    }
}
