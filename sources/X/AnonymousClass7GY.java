package X;

/* renamed from: X.7GY  reason: invalid class name */
public final class AnonymousClass7GY implements C1606789m {
    public final /* synthetic */ C126786dI A00;
    public final /* synthetic */ Runnable A01;

    public AnonymousClass7GY(C126786dI r1, Runnable runnable) {
        this.A01 = runnable;
        this.A00 = r1;
    }

    public void BrA() {
        C31081ez.A01("WaffleLinkedRequestExecutor/ping/onDeliveryFailure");
        C126786dI r2 = this.A00;
        r2.A00.BrB(C17880vN.A0f("Account ping failed to deliver"));
    }

    public void C7I(AnonymousClass732 r2) {
        C31081ez.A02("WaffleLinkedRequestExecutor/ping/onSuccess");
        this.A01.run();
    }

    public void Bsw(Exception exc) {
        C31081ez.A01(C17900vP.A0C("WaffleLinkedRequestExecutor/ping/onError ", C18070vi.A0K(exc), exc));
        C126786dI r0 = this.A00;
        r0.A00.Bsw(new AnonymousClass6OU(exc));
    }
}
