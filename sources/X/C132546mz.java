package X;

/* renamed from: X.6mz  reason: invalid class name and case insensitive filesystem */
public final class C132546mz {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C136526tx A01;
    public final /* synthetic */ C146167Ob A02;

    public C132546mz(C136526tx r1, C146167Ob r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public void A00(int i, String str, String str2) {
        C18070vi.A0d("BloksPreConsentFetcherHelper/performIntegrityCheck: Integrity check success", 0);
        C146167Ob r3 = this.A02;
        C136526tx r2 = this.A01;
        int i2 = this.A00;
        C18070vi.A0d("BloksPreConsentFetcherHelper/makeFetchRequest: Fetching bloks payload", 0);
        r3.A01.CGF(new AnonymousClass7QD(r2, r3, str, str2, i, i2));
    }
}
