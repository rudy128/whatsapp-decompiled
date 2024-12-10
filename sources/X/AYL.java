package X;

public final class AYL implements C22449B8h {
    public final /* synthetic */ C188289hB A00;
    public final /* synthetic */ AnonymousClass205 A01;
    public final /* synthetic */ AnonymousClass21K A02;

    public AYL(C188289hB r1, AnonymousClass205 r2, AnonymousClass21K r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.4rF] */
    public void C3t(A7B a7b, AnonymousClass9NV r17) {
        C188289hB r3 = this.A00;
        AnonymousClass1QE r2 = r3.A03;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Got response for get encrypted prefetch call ");
        AnonymousClass205 r13 = this.A01;
        r2.A07(C17890vO.A0V(r13, A10));
        AnonymousClass9NV r0 = r17;
        if (r17 != null) {
            AnonymousClass21K r10 = this.A02;
            ? obj = new Object();
            String str = r0.A05;
            if (str != null) {
                String str2 = r0.A04;
                C18070vi.A0W(str2);
                String str3 = r0.A02;
                C18070vi.A0W(str3);
                String str4 = r0.A00;
                C18070vi.A0W(str4);
                String str5 = r0.A03;
                C18070vi.A0W(str5);
                obj.element = new C20935Abp(str2, str3, str4, str5, str);
            }
            C189699jf r1 = r3.A00;
            C20873Aap aap = new C20873Aap(obj, 0);
            C20847AaP aaP = r3.A04;
            C18070vi.A0d(aaP, 3);
            r1.A00.CGF(new C146617Py(r10, aap, aaP, r13, 13));
        }
    }
}
