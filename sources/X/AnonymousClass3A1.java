package X;

/* renamed from: X.3A1  reason: invalid class name */
public final class AnonymousClass3A1 implements C72413Lv {
    public final C19830z4 A00;

    public AnonymousClass3A1(C19830z4 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ void Bi5(String str) {
    }

    public /* synthetic */ void BiC(C186289dx r1) {
    }

    public void BiY(String str) {
        StringBuilder A0K = C18070vi.A0K(str);
        A0K.append(str);
        A0K.append("/priv/last=");
        C19830z4 r3 = this.A00;
        AnonymousClass00H r5 = r3.A00;
        C17890vO.A1A(A0K, C63682tW.A02("last", C17880vN.A0B(r5).getInt("privacy_last_seen", 0)));
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append("/priv/pic=");
        C17890vO.A1A(A11, C63682tW.A02("profile", r3.A0I()));
        StringBuilder A112 = AnonymousClass000.A11(str);
        A112.append("/priv/status=");
        C17890vO.A1A(A112, C63682tW.A02("status", C17880vN.A0B(r5).getInt("privacy_status", 0)));
        StringBuilder A113 = AnonymousClass000.A11(str);
        A113.append("/priv/readreceipts=");
        C17900vP.A0r(A113, r3.A2U());
    }
}
