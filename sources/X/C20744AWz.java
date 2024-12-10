package X;

import com.whatsapp.passkeys.PasskeyFacade;

/* renamed from: X.AWz  reason: case insensitive filesystem */
public final class C20744AWz implements BB2 {
    public final /* synthetic */ PasskeyFacade A00;
    public final /* synthetic */ C31761g5 A01;

    public C20744AWz(PasskeyFacade passkeyFacade, C31761g5 r2) {
        this.A00 = passkeyFacade;
        this.A01 = r2;
    }

    public void Bti() {
        this.A01.resumeWith(C30691eM.A00(AnonymousClass8BR.A0w("Failed to check passkey existence with error")));
    }

    public void C7K(AnonymousClass9MS r6) {
        AnonymousClass9I1 r1;
        if (r6 instanceof C175318yW) {
            C175318yW r62 = (C175318yW) r6;
            this.A00.A03.A01(new C20741AWw(r62.A02, Long.valueOf(r62.A00), Long.valueOf(r62.A01)));
            r1 = AnonymousClass9I1.ALREADY_HAS_PASSKEY;
        } else if (r6 instanceof C175328yX) {
            this.A00.A03.A01(C20742AWx.A00);
            r1 = AnonymousClass9I1.DOES_NOT_HAVE_PASSKEY;
        } else {
            throw AnonymousClass3MW.A14();
        }
        this.A01.resumeWith(r1);
    }
}
