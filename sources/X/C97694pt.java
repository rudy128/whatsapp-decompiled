package X;

/* renamed from: X.4pt  reason: invalid class name and case insensitive filesystem */
public class C97694pt implements AnonymousClass1Bh {
    public final /* synthetic */ AnonymousClass4RS A00;
    public final /* synthetic */ AnonymousClass1E7 A01;

    public C97694pt(AnonymousClass4RS r1, AnonymousClass1E7 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BJ9(C223419n r3) {
        String str;
        AnonymousClass1E7 r1 = this.A01;
        if (r1.A0F()) {
            int A09 = ((AnonymousClass1MW) this.A00.A05.get()).A09((AnonymousClass1E9) AnonymousClass3Ma.A0m(r1));
            if (A09 < 32) {
                str = "GROUP_32";
            } else if (A09 < 64) {
                str = "GROUP_64";
            } else if (A09 < 128) {
                str = "GROUP_128";
            } else if (A09 < 256) {
                str = "GROUP_256";
            } else if (A09 < 512) {
                str = "GROUP_512";
            } else {
                str = "GROUP_MORE_512";
            }
        } else if (C22971Dz.A0V(r1.A0J)) {
            str = "newsletter";
        } else {
            str = "one_to_one";
        }
        r3.A04("type_of_chat", str);
    }

    public String BU9() {
        return "type_of_chat";
    }
}
