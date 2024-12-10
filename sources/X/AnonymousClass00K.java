package X;

/* renamed from: X.00K  reason: invalid class name */
public final class AnonymousClass00K implements AnonymousClass009 {
    public final AnonymousClass00J A00;
    public final Object A01 = new Object();
    public volatile Object A02;

    public Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = this.A00.A00();
                }
            }
        }
        return this.A02;
    }

    public AnonymousClass00K(AnonymousClass00J r2) {
        this.A00 = r2;
    }
}
