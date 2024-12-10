package X;

/* renamed from: X.3Dd  reason: invalid class name and case insensitive filesystem */
public class C70953Dd implements C18140vp {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C70953Dd(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final Object get() {
        switch (this.A00) {
            case 0:
                return new C80613xU((AnonymousClass118) this.A01, (C18000vb) this.A02);
            case 1:
                return new C19947A0e((AnonymousClass1DK) this.A02);
            case 2:
                return new AnonymousClass681(C17890vO.A0D(), (AnonymousClass11C) ((AnonymousClass00H) this.A01).get(), (AnonymousClass19T) ((AnonymousClass00H) this.A02).get());
            default:
                return ((C25201Nh) this.A01).A0A((C25151Nc) this.A02);
        }
    }
}
