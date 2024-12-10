package X;

/* renamed from: X.2VG  reason: invalid class name */
public abstract class AnonymousClass2VG {
    public static final String A00(C30391dr r3) {
        Object obj;
        if (r3 instanceof C30611eE) {
            return r3.toString();
        }
        try {
            StringBuilder A0f = C17890vO.A0f(r3);
            A0f.append('@');
            obj = AnonymousClass000.A0y(Integer.toHexString(System.identityHashCode(r3)), A0f);
        } catch (Throwable th) {
            obj = new AnonymousClass1IU(th);
        }
        if (C30671eK.A00(obj) != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(C17890vO.A0U(r3));
            A10.append('@');
            obj = AnonymousClass000.A0y(Integer.toHexString(System.identityHashCode(r3)), A10);
        }
        return (String) obj;
    }
}
