package X;

import java.util.List;

/* renamed from: X.DrP  reason: case insensitive filesystem */
public final class C28106DrP extends AnonymousClass11G implements C22821Di {
    public static final C28106DrP A00 = new C28106DrP();

    public C28106DrP() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C05100Qk r0;
        AnonymousClass0QY r02;
        List A13 = BE6.A13(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        AnonymousClass0NG r03 = AnonymousClass0NG.A03;
        Object obj2 = A13.get(0);
        long j = C05100Qk.A01;
        ECZ ecz = C25471CgQ.A0G;
        C18070vi.A18(obj2, false);
        Number number = null;
        if (obj2 != null) {
            r0 = (C05100Qk) ecz.CFy(obj2);
        } else {
            r0 = null;
        }
        C18070vi.A0b(r0);
        long j2 = r0.A00;
        Object obj3 = A13.get(1);
        long j3 = AnonymousClass0QY.A03;
        ECZ ecz2 = C25471CgQ.A0H;
        C18070vi.A18(obj3, false);
        if (obj3 != null) {
            r02 = (AnonymousClass0QY) ecz2.CFy(obj3);
        } else {
            r02 = null;
        }
        C18070vi.A0b(r02);
        long j4 = r02.A00;
        Object obj4 = A13.get(2);
        if (obj4 != null) {
            number = (Number) obj4;
        }
        C18070vi.A0b(number);
        return new AnonymousClass0NG(number.floatValue(), j2, j4);
    }
}
