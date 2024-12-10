package X;

public final class AVP implements C22513BAw {
    public final /* synthetic */ C191839nH A00;
    public final /* synthetic */ C30391dr A01;

    public AVP(C191839nH r1, C30391dr r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void C7R(String str) {
        this.A01.resumeWith(str);
    }

    public void onFailure(Exception exc) {
        this.A00.A05.A01(AnonymousClass8oG.A02, (String) null, exc);
        this.A01.resumeWith((Object) null);
    }
}
