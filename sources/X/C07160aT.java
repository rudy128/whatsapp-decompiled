package X;

/* renamed from: X.0aT  reason: invalid class name and case insensitive filesystem */
public final class C07160aT implements AnonymousClass1G2 {
    public final /* synthetic */ AnonymousClass0Q5 A00;
    public final /* synthetic */ C17300uR A01;
    public final /* synthetic */ C16300s2 A02;

    public C07160aT(AnonymousClass0Q5 r1, C17300uR r2, C16300s2 r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final Object A02(boolean z) {
        boolean z2;
        C17300uR r3 = this.A01;
        if (z) {
            AnonymousClass1OS A012 = A00(this.A02);
            AnonymousClass0Q5 r0 = this.A00;
            z2 = AnonymousClass000.A1Y(A012.invoke(AnonymousClass0Q5.A02(r0), r0.A06.getValue()));
        } else {
            z2 = false;
        }
        AnonymousClass000.A1C(r3, z2);
        return C27621Wu.A00;
    }

    public static final AnonymousClass1OS A00(C16300s2 r0) {
        return (AnonymousClass1OS) r0.getValue();
    }

    public /* bridge */ /* synthetic */ Object BJt(Object obj, C30391dr r3) {
        return A02(AnonymousClass000.A1Y(obj));
    }
}
