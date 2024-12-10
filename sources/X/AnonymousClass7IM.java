package X;

/* renamed from: X.7IM  reason: invalid class name */
public class AnonymousClass7IM implements AnonymousClass87I {
    public final int A00;
    public final Object A01;

    public AnonymousClass7IM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C4o(boolean z) {
        if (1 - this.A00 != 0) {
            AnonymousClass4I3.A00(Boolean.valueOf(z), (C108495bn) this.A01);
            return;
        }
        AnonymousClass71R r3 = (AnonymousClass71R) this.A01;
        r3.A05.post(new C70813Cp(12, (Object) r3, z));
    }
}
