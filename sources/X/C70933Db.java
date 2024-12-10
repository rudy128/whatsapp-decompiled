package X;

/* renamed from: X.3Db  reason: invalid class name and case insensitive filesystem */
public class C70933Db implements C18140vp {
    public final int A00;

    public C70933Db(int i) {
        this.A00 = i;
    }

    public final Object get() {
        int i;
        switch (this.A00) {
            case 0:
                i = 49210;
                break;
            case 1:
                i = 49451;
                break;
            case 2:
                return new C52322aj();
            case 4:
                i = 16488;
                break;
            case 5:
            case 9:
                return C448625b.A02();
            case 6:
            case 18:
            case 22:
            case 30:
                return C448625b.A01();
            case 7:
                Boolean bool = C17970vW.A03;
                try {
                    Class.forName("androidx.test.espresso.Espresso", false, C17970vW.class.getClassLoader());
                    return AnonymousClass000.A0i();
                } catch (ClassNotFoundException unused) {
                    return false;
                }
            case 10:
                i = 32884;
                break;
            case 11:
                return new Object();
            case 12:
                return new Object();
            case 13:
                return new Object();
            case 14:
                return new AnonymousClass1DS();
            case 16:
            case 20:
                return C17890vO.A0O(32799);
            case 17:
                i = 65550;
                break;
            case 21:
                i = 65549;
                break;
            case 23:
            case 31:
                return C448625b.A04();
            case 24:
            case 32:
                return C448625b.A05();
            case 25:
            case 33:
                return C448625b.A00();
            case 26:
                return C448625b.A06();
            case 28:
                i = 65548;
                break;
            case 29:
                i = 32788;
                break;
            default:
                return C448625b.A03();
        }
        return C17890vO.A0O(i);
    }
}
