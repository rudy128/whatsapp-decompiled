package X;

import java.util.List;

/* renamed from: X.3xl  reason: invalid class name and case insensitive filesystem */
public final class C80673xl extends AnonymousClass4S3 {
    public static final List A00;

    static {
        String[] strArr = new String[2];
        strArr[0] = "dogfood.DogfooderDiagnosticsDetailReportActivity";
        A00 = C18070vi.A0O("HomeActivity", strArr, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80673xl(AnonymousClass11P r1, C24521Kq r2) {
        super(r1, r2);
        C18070vi.A0j(r1, r2);
    }

    public boolean A01() {
        if (super.A01()) {
            List list = A00;
            C108385bc r1 = this.A00;
            C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.dogfood.GhostViewEventData");
            if (list.contains(((C95744mj) r1).A01)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
