package X;

/* renamed from: X.Adr  reason: case insensitive filesystem */
public final class C21061Adr implements C72413Lv {
    public final AnonymousClass00H A00;

    public C21061Adr(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void Bi5(String str) {
        C18070vi.A0d(str, 0);
        C22781De.A01();
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append("/unique_xpost_id: ");
        String str2 = "";
        String string = AnonymousClass716.A00((AnonymousClass716) this.A00.get()).getString("pref_debug_session_id", str2);
        if (string != null) {
            str2 = string;
        }
        C17890vO.A1A(A11, str2);
    }

    public /* synthetic */ void BiC(C186289dx r1) {
    }

    public /* synthetic */ void BiY(String str) {
    }
}
