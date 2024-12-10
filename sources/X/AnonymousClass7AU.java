package X;

/* renamed from: X.7AU  reason: invalid class name */
public class AnonymousClass7AU implements C24051Ir {
    public /* synthetic */ AnonymousClass1J2 BGl(C24091Iv r2, Class cls) {
        return C60282nh.A00(this, cls);
    }

    public AnonymousClass1J2 BG9(Class cls) {
        Class<C111305jV> cls2 = C111305jV.class;
        if (cls.equals(cls2)) {
            return new C111305jV();
        }
        Class<C111085iA> cls3 = C111085iA.class;
        if (cls.equals(cls3)) {
            return new C111085iA();
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Model class must be one of: [");
        A10.append(cls2.getCanonicalName());
        A10.append(", ");
        A10.append(cls3.getCanonicalName());
        throw AnonymousClass001.A12("]", A10);
    }
}
