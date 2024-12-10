package X;

/* renamed from: X.3J8  reason: invalid class name */
public final class AnonymousClass3J8 extends AnonymousClass11G implements AnonymousClass1OS {
    public static final AnonymousClass3J8 A00 = new AnonymousClass3J8();

    public AnonymousClass3J8() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        C18070vi.A0h(str, obj2);
        if (str.length() == 0) {
            return obj2.toString();
        }
        return AnonymousClass001.A1E(obj2, ", ", AnonymousClass000.A11(str));
    }
}
