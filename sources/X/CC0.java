package X;

public abstract class CC0 {
    public static final E8A A00(DFL dfl, Object obj, int i) {
        D8I d8i;
        C18070vi.A0d(obj, 2);
        if (obj instanceof E8A) {
            return (E8A) obj;
        }
        if (obj instanceof C26972DNu) {
            return ((C26972DNu) obj).A00(dfl.A01, dfl.A0A);
        } else if (obj instanceof C25488Cgj) {
            return ((C25488Cgj) obj).A00;
        } else {
            if (obj instanceof String) {
                String str = (String) obj;
                C18070vi.A0d(str, 2);
                E9O e9o = dfl.A01;
                if (e9o != null) {
                    CMY cmy = new CMY(e9o);
                    BE7.A11(i, cmy.A00);
                    d8i = new D8I(cmy.A01, cmy.A00);
                } else {
                    d8i = null;
                }
                return new C26972DNu(d8i, str, dfl.A0A, dfl.A04);
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Unsupported value type: ");
            AnonymousClass8BW.A1M(obj, A10);
            C25913CoX.A01("BloksExpressionParser", AnonymousClass001.A1I(" for key: ", A10, i));
            return null;
        }
    }
}
