package X;

/* renamed from: X.3Vx  reason: invalid class name and case insensitive filesystem */
public final class C73433Vx extends C40411uf {
    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        AnonymousClass4U3 r5 = (AnonymousClass4U3) obj;
        AnonymousClass4U3 r6 = (AnonymousClass4U3) obj2;
        C18070vi.A0h(r5, r6);
        A2B a2b = r5.A00;
        String rawString = a2b.A02.getRawString();
        A2B a2b2 = r6.A00;
        if (!C18070vi.A18(rawString, a2b2.A02.getRawString()) || !C18070vi.A18(a2b.A06, a2b2.A06) || r5.A02 != r6.A02) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj, Object obj2) {
        AnonymousClass4U3 r3 = (AnonymousClass4U3) obj;
        AnonymousClass4U3 r4 = (AnonymousClass4U3) obj2;
        C18070vi.A0h(r3, r4);
        return C18070vi.A18(r3.A00.A02.getRawString(), r4.A00.A02.getRawString());
    }
}
