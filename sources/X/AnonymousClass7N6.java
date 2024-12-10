package X;

/* renamed from: X.7N6  reason: invalid class name */
public class AnonymousClass7N6 implements C28541E6p {
    public final int A00;

    public AnonymousClass7N6(int i) {
        this.A00 = i;
    }

    public final Object BCG(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                if (obj == null) {
                    throw AnonymousClass000.A0k("Required value was null.");
                } else if (obj2 == null) {
                    throw AnonymousClass000.A0k("Required value was null.");
                }
                break;
            case 1:
                AnonymousClass4V2 r2 = (AnonymousClass4V2) obj;
                AnonymousClass4TW r3 = (AnonymousClass4TW) obj2;
                C18070vi.A0b(r2);
                C18070vi.A0b(r3);
                return new AnonymousClass4VS(r2, r3);
            default:
                if (obj == null) {
                    throw AnonymousClass000.A0k("Required value was null.");
                } else if (obj2 == null) {
                    throw AnonymousClass000.A0k("Required value was null.");
                }
                break;
        }
        return AnonymousClass1D6.A01(obj, obj2);
    }
}
