package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.0JE  reason: invalid class name */
public final class AnonymousClass0JE {
    public final C06970a9 A00 = C06970a9.A02(new AnonymousClass0Ja[16]);

    public final void A00() {
        C06970a9 r4 = this.A00;
        C25411Oc r0 = new C25411Oc(0, r4.A00 - 1);
        int A002 = r0.A00();
        int A01 = r0.A01();
        if (A002 <= A01) {
            while (true) {
                ((AnonymousClass0Ja) r4.A01[A002]).A01().resumeWith(C27621Wu.A00);
                if (A002 == A01) {
                    break;
                }
                A002++;
            }
        }
        r4.A08();
    }

    public final void A01(Throwable th) {
        C06970a9 r5 = this.A00;
        int i = r5.A00;
        C31761g5[] r3 = new C31761g5[i];
        for (int i2 = 0; i2 < i; i2++) {
            r3[i2] = ((AnonymousClass0Ja) r5.A01[i2]).A01();
        }
        for (int i3 = 0; i3 < i; i3++) {
            r3[i3].BEN(th);
        }
        if (r5.A00 != 0) {
            throw AnonymousClass000.A0n("uncancelled requests present");
        }
    }

    public final boolean A02(AnonymousClass0Ja r10) {
        AnonymousClass0NU r7 = (AnonymousClass0NU) r10.A00().invoke();
        C31761g5 A01 = r10.A01();
        if (r7 == null) {
            A01.resumeWith(C27621Wu.A00);
            return false;
        }
        A01.Bdu(new C10220hz(this, r10));
        C06970a9 r5 = this.A00;
        C25411Oc r0 = new C25411Oc(0, r5.A00 - 1);
        int A002 = r0.A00();
        int A012 = r0.A01();
        if (A002 <= A012) {
            while (true) {
                AnonymousClass0NU r2 = (AnonymousClass0NU) ((AnonymousClass0Ja) r5.A01[A012]).A00().invoke();
                if (r2 != null) {
                    AnonymousClass0NU A03 = r7.A03(r2);
                    if (C18070vi.A18(A03, r7)) {
                        r5.A0B(A012 + 1, r10);
                        return true;
                    } else if (!C18070vi.A18(A03, r2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int i = r5.A00 - 1;
                        if (i <= A012) {
                            while (true) {
                                ((AnonymousClass0Ja) r5.A01[A012]).A01().BEN(cancellationException);
                                if (i == A012) {
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
                if (A012 == A002) {
                    break;
                }
                A012--;
            }
        }
        r5.A0B(0, r10);
        return true;
    }
}
