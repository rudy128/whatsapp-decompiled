package X;

import java.util.Comparator;

/* renamed from: X.7Rf  reason: invalid class name and case insensitive filesystem */
public class C146947Rf implements Comparator {
    public AnonymousClass1M9 A00;
    public C98964s0 A01;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C60072nL r5 = (C60072nL) obj2;
        AnonymousClass1M9 r1 = this.A00;
        AnonymousClass1E7 A0E = r1.A0E(((C60072nL) obj).A06);
        if (A0E == null) {
            return 1;
        }
        AnonymousClass1E7 A0E2 = r1.A0E(r5.A06);
        if (A0E2 == null) {
            return -1;
        }
        return this.A01.compare(A0E, A0E2);
    }

    public C146947Rf(AnonymousClass11S r3, AnonymousClass1M9 r4, C24921Me r5) {
        this.A00 = r4;
        this.A01 = new C98964s0(r3, r5, 1);
    }
}
