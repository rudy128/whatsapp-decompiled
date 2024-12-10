package X;

/* renamed from: X.7On  reason: invalid class name and case insensitive filesystem */
public final class C146287On implements AnonymousClass89Z {
    public final /* synthetic */ AnonymousClass705 A00;
    public final /* synthetic */ C122936Sm A01;
    public final /* synthetic */ C128056fN A02;
    public final /* synthetic */ Runnable A03;

    public C146287On(AnonymousClass705 r1, C122936Sm r2, C128056fN r3, Runnable runnable) {
        this.A00 = r1;
        this.A03 = runnable;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void Bti() {
        C31081ez.A01("BloksPreConsentGraphqlIntegrityCheckIqHelper/callForceSuspendState:onFailure");
        C128056fN r2 = this.A02;
        C122936Sm r1 = this.A01;
        C18070vi.A0d(r1, 0);
        r2.A00.A01.A01.A01(r1);
    }

    public void onSuccess() {
        C31081ez.A02("BloksPreConsentGraphqlIntegrityCheckIqHelper/callForceSuspendState:onSuccess");
        if (this.A00.A04()) {
            this.A03.run();
        }
    }
}
