package X;

/* renamed from: X.2sn  reason: invalid class name and case insensitive filesystem */
public class C63272sn {
    public final C24681Lg A00;
    public final AnonymousClass1WM A01;
    public final C200710s A02;
    public final AnonymousClass1KB A03;
    public final AnonymousClass1RW A04;
    public final C25931Qe A05;

    public static void A01(C63272sn r4, AnonymousClass206 r5, Runnable runnable, int i, boolean z, boolean z2) {
        C63272sn r3 = r4;
        Runnable runnable2 = runnable;
        int i2 = i;
        if (runnable2 != null || z) {
            r3.A03.A0J(new C70843Cs((Object) r3, (Object) runnable2, (Object) r5, i2, 1, z));
        }
        if (z2) {
            r3.A02.execute(new C21470Akb((Object) r3, i2, 16, (Object) r5));
        }
    }

    public void A02(AnonymousClass206 r10, Runnable runnable, int i, boolean z) {
        AnonymousClass206 r3 = r10;
        boolean A012 = this.A04.A00().A01(r10.A0v.A00);
        int i2 = i;
        Runnable runnable2 = runnable;
        if (A03(r10, i)) {
            this.A02.execute(new AnonymousClass7QE(this, r3, runnable2, i2, 0, z, A012));
        } else {
            A01(this, r3, runnable2, i2, false, A012);
        }
    }

    public synchronized boolean A04(AnonymousClass206 r5, int i) {
        boolean z;
        AnonymousClass25F A002;
        z = false;
        if (A03(r5, i) && (A002 = A00(r5, i)) != null) {
            this.A05.A0A(A002);
            if (A002.A02 != null) {
                z = true;
            }
        }
        return z;
    }

    public static AnonymousClass25F A00(AnonymousClass206 r1, int i) {
        if (i == 56) {
            C18070vi.A0d(r1, 0);
            return C18070vi.A09(r1, AnonymousClass8BG.class);
        } else if (i != 79) {
            if (i != 86) {
                if (i != 93) {
                    if (i != 67) {
                        if (i != 68) {
                            return null;
                        }
                    } else if (r1 instanceof AnonymousClass22H) {
                        return ((AnonymousClass22H) r1).A06;
                    }
                    C18070vi.A0d(r1, 0);
                    return C18070vi.A09(r1, AnonymousClass22A.class);
                }
            } else if (r1 instanceof C444323k) {
                return ((C444323k) r1).A00;
            }
            if (r1 instanceof C445823z) {
                return ((C445823z) r1).A0A;
            }
            return null;
        } else {
            C18070vi.A0d(r1, 0);
            return C18070vi.A09(r1, AnonymousClass22C.class);
        }
    }

    public boolean A03(AnonymousClass206 r3, int i) {
        AnonymousClass25F A002;
        if (!AnonymousClass000.A1O(r3.A08) || (A002 = A00(r3, i)) == null) {
            return false;
        }
        return this.A05.A0B(A002);
    }

    public C63272sn(AnonymousClass1KB r3, AnonymousClass1RW r4, C24681Lg r5, AnonymousClass1WM r6, C25931Qe r7, AnonymousClass10I r8) {
        this.A03 = r3;
        this.A00 = r5;
        this.A01 = r6;
        this.A04 = r4;
        this.A02 = new C200710s(r8, true);
        this.A05 = r7;
    }
}
