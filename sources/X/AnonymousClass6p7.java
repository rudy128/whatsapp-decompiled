package X;

/* renamed from: X.6p7  reason: invalid class name */
public final class AnonymousClass6p7 {
    public final C35021lW A00;
    public final C1418477e A01;
    public final C1418477e A02;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.87L] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.87L] */
    public AnonymousClass6p7(C35021lW r5, String str, long j) {
        C18070vi.A0d(str, 2);
        this.A00 = r5;
        this.A02 = new C1418477e(new Object(), Long.valueOf(j), "WaFbid");
        this.A01 = new C1418477e(new Object(), str, "WaFbAccessToken");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.fbusers.FBUserPasswordlessEntity");
                AnonymousClass6p7 r5 = (AnonymousClass6p7) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.A00;
        Object obj = this.A02.A00;
        C17960vV.A07(obj);
        objArr[1] = obj;
        Object obj2 = this.A01.A00;
        C17960vV.A07(obj2);
        return AnonymousClass000.A0P(obj2, objArr, 2);
    }
}
