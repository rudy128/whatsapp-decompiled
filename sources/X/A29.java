package X;

public final class A29 {
    public final AnonymousClass11S A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final C18100vl A04 = AnonymousClass1DF.A01(new C21524AlX(this, 5));
    public final AnonymousClass00H A05;

    public static final void A00(A29 a29, String str, String str2, String str3) {
        A29 a292 = a29;
        String A0r = C17880vN.A0r(C17900vP.A02(a29.A03), "previous_registration_screen");
        if (A0r == null) {
            A0r = "unknown";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PrePNClientFunnelLogger/previous screen: ");
        A10.append(A0r);
        A10.append("/action taken: ");
        A10.append(str2);
        A10.append("/current screen: ");
        A10.append(str);
        C17900vP.A0f("/event name: ", str3, A10);
        AnonymousClass3MX.A0x(a292.A05).CGF(new C21372Aj1(a292, str, A0r, str2, str3));
    }

    public final void A03(String str, String str2, String str3) {
        C18070vi.A0d(str2, 1);
        if (C72453Mb.A1a(this.A04)) {
            A00(this, str, str2, str3);
            A02(str, str2);
        }
    }

    public final void A01(String str) {
        if (C72453Mb.A1a(this.A04)) {
            A00(this, str, "view", AnonymousClass000.A0y("_impression", AnonymousClass000.A11(str)));
            A02(str, "view");
        }
    }

    public final void A02(String str, String str2) {
        if (C72453Mb.A1a(this.A04)) {
            C19830z4 A0K = C17880vN.A0K(this.A03);
            C17880vN.A1E(C19830z4.A00(A0K), "previous_registration_screen", str);
            C17880vN.A1E(C19830z4.A00(A0K), "previous_registration_action", str2);
        }
    }

    public A29(AnonymousClass11S r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r4, r5, r6, r7, r3);
        this.A05 = r4;
        this.A03 = r5;
        this.A01 = r6;
        this.A02 = r7;
        this.A00 = r3;
    }
}
