package X;

/* renamed from: X.1Iy  reason: invalid class name and case insensitive filesystem */
public class C24121Iy implements C24051Ir {
    public static C24121Iy A00;
    public static final AnonymousClass1GH A01 = AnonymousClass1J0.A00;

    public /* synthetic */ AnonymousClass1J2 BGl(C24091Iv r2, Class cls) {
        C18070vi.A0d(cls, 1);
        return BG9(cls);
    }

    public AnonymousClass1J2 BG9(Class cls) {
        C18070vi.A0d(cls, 0);
        try {
            Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            C18070vi.A0X(newInstance);
            return (AnonymousClass1J2) newInstance;
        } catch (NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create an instance of ");
            sb.append(cls);
            throw new RuntimeException(sb.toString(), e);
        } catch (InstantiationException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot create an instance of ");
            sb2.append(cls);
            throw new RuntimeException(sb2.toString(), e2);
        } catch (IllegalAccessException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Cannot create an instance of ");
            sb3.append(cls);
            throw new RuntimeException(sb3.toString(), e3);
        }
    }
}
