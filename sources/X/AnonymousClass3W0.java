package X;

/* renamed from: X.3W0  reason: invalid class name */
public class AnonymousClass3W0 extends C40411uf {
    public final int A00;

    public AnonymousClass3W0(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                return AnonymousClass026.A00(obj, obj2);
            case 1:
                AnonymousClass4N6 r3 = (AnonymousClass4N6) obj;
                AnonymousClass4N6 r4 = (AnonymousClass4N6) obj2;
                C18070vi.A0h(r3, r4);
                return C18070vi.A18(r3.A01, r4.A01);
            case 2:
                return obj.equals(obj2);
            default:
                return ((AnonymousClass4NK) obj).A02.A00.equals(((AnonymousClass4NK) obj2).A02.A00);
        }
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        switch (this.A00) {
            case 0:
                C108685c8 r4 = (C108685c8) obj;
                C108685c8 r5 = (C108685c8) obj2;
                int BTW = r4.BTW();
                int BTW2 = r5.BTW();
                if (BTW != BTW2) {
                    return false;
                }
                if (BTW2 == 1) {
                    obj3 = ((C93104iR) r5).A02;
                    obj4 = ((C93104iR) r4).A02;
                    break;
                } else {
                    return true;
                }
            case 1:
                AnonymousClass4N6 r42 = (AnonymousClass4N6) obj;
                AnonymousClass4N6 r52 = (AnonymousClass4N6) obj2;
                C18070vi.A0h(r42, r52);
                return C18070vi.A18(r42.A02, r52.A02);
            case 2:
                if (((C86334Rf) obj).A00 != ((C86334Rf) obj2).A00) {
                    return false;
                }
                return true;
            default:
                obj3 = ((AnonymousClass4NK) obj).A02;
                obj4 = ((AnonymousClass4NK) obj2).A02;
                break;
        }
        return obj3.equals(obj4);
    }
}
