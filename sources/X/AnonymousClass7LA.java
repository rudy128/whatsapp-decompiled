package X;

/* renamed from: X.7LA  reason: invalid class name */
public final class AnonymousClass7LA implements AnonymousClass89J {
    public final /* synthetic */ AnonymousClass7CJ A00;
    public final /* synthetic */ AnonymousClass2L4 A01;
    public final /* synthetic */ C136796uQ A02;

    public AnonymousClass7LA(AnonymousClass7CJ r1, AnonymousClass2L4 r2, C136796uQ r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void onSuccess() {
        this.A00.A00.A0J(new C21457AkO((Object) this.A01, 4));
        this.A02.A01();
    }

    public void onFailure(Exception exc) {
        StringBuilder A0K = C18070vi.A0K(exc);
        A0K.append("AvatarAsyncInit");
        C108985cd.A1M("/deleteAvatarUser Failed to delete avatar via Smax: ", A0K, exc);
    }
}
