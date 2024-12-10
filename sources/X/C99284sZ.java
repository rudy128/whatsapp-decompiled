package X;

/* renamed from: X.4sZ  reason: invalid class name and case insensitive filesystem */
public final class C99284sZ implements C30391dr, C30401ds {
    public final C30391dr A00;
    public final C18560wh A01;

    public C30401ds getCallerFrame() {
        C30391dr r1 = this.A00;
        if (r1 instanceof C30401ds) {
            return (C30401ds) r1;
        }
        return null;
    }

    public C18560wh getContext() {
        return this.A01;
    }

    public void resumeWith(Object obj) {
        this.A00.resumeWith(obj);
    }

    public C99284sZ(C30391dr r1, C18560wh r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
