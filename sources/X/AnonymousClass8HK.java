package X;

/* renamed from: X.8HK  reason: invalid class name */
public class AnonymousClass8HK extends C40411uf {
    public final int A00;

    public AnonymousClass8HK(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        switch (this.A00) {
            case 2:
                return ((C22497BAe) obj).equals(obj2);
            case 4:
                C18070vi.A0h(obj, obj2);
                break;
        }
        return obj.equals(obj2);
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj, Object obj2) {
        switch (this.A00) {
            case 1:
                obj = (C174358we) obj;
                obj2 = (C174358we) obj2;
                if ((obj instanceof C174298wY) && (obj2 instanceof C174298wY)) {
                    return ((C174298wY) obj).A0B.A0F.equals(((C174298wY) obj2).A0B.A0F);
                }
            case 2:
                return AnonymousClass000.A1T(((C22497BAe) obj).BTW(), ((C22497BAe) obj2).BTW());
            case 4:
                AF0 af0 = (AF0) obj;
                AF0 af02 = (AF0) obj2;
                C18070vi.A0h(af0, af02);
                return C18070vi.A18(af0.A0F, af02.A0F);
        }
        return obj.equals(obj2);
    }
}
