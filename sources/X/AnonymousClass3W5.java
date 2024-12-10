package X;

/* renamed from: X.3W5  reason: invalid class name */
public final class AnonymousClass3W5 extends C40411uf {
    public static final AnonymousClass3W5 A00 = new Object();

    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        AnonymousClass4EQ r4 = (AnonymousClass4EQ) obj;
        AnonymousClass4EQ r5 = (AnonymousClass4EQ) obj2;
        C18070vi.A0h(r4, r5);
        if ((r4 instanceof C80403x5) && (r5 instanceof C80403x5)) {
            return r4.equals(r5);
        }
        if (!(r4 instanceof C80393x4) || !(r5 instanceof C80393x4)) {
            return false;
        }
        C80393x4 r42 = (C80393x4) r4;
        C80393x4 r52 = (C80393x4) r5;
        if (r42.A01 != r52.A01 || !C18070vi.A18(r42.A00.getPath(), r52.A00.getPath())) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj, Object obj2) {
        C18070vi.A0h(obj, obj2);
        return obj.equals(obj2);
    }
}
