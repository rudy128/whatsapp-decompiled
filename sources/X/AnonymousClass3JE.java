package X;

/* renamed from: X.3JE  reason: invalid class name */
public final class AnonymousClass3JE extends C31781g7 {
    public final AnonymousClass1OC A00;

    public AnonymousClass3JE(C30391dr r2, AnonymousClass1OC r3) {
        super(1, r2);
        this.A00 = r3;
    }

    public Throwable A0E(AnonymousClass1OB r3) {
        Throwable A06;
        Object A0Z = this.A00.A0Z();
        if ((A0Z instanceof AnonymousClass3E7) && (A06 = ((AnonymousClass3E7) A0Z).A06()) != null) {
            return A06;
        }
        if (A0Z instanceof C30681eL) {
            return ((C30681eL) A0Z).A00;
        }
        return r3.BOI();
    }

    public String A0D() {
        return "AwaitContinuation";
    }
}
