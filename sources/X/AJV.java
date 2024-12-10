package X;

public class AJV implements E65, BDh {
    public final int A00;

    public AJV(int i) {
        this.A00 = i;
    }

    public final void BK0(Object obj, Object obj2) {
        if (this.A00 != 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Couldn't find encoder for type ");
            throw new C21580AmU(AnonymousClass000.A0y(obj.getClass().getCanonicalName(), A10));
        }
        BDi bDi = C20396AJj.A05;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("Couldn't find encoder for type ");
        throw new C21580AmU(AnonymousClass000.A0y(obj.getClass().getCanonicalName(), A102));
    }
}
