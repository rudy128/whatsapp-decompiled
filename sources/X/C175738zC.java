package X;

import java.util.ArrayList;

/* renamed from: X.8zC  reason: invalid class name and case insensitive filesystem */
public final class C175738zC extends C197889xR {
    public final AnonymousClass00H A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass118 A02;
    public final AnonymousClass00H A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175738zC(AnonymousClass1KB r2, AnonymousClass118 r3, A7U a7u, C31061ex r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        super(a7u.A04, r5);
        C18070vi.A0w(r3, r2, a7u, r5, r6);
        C18070vi.A0d(r7, 6);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r6;
        this.A00 = r7;
    }

    public final void A00(C22449B8h b8h, String str, String str2, String str3) {
        ArrayList A13 = AnonymousClass000.A13();
        C17890vO.A11("action", "upi-get-p2m-encrypted-data", A13);
        C17890vO.A11("metadata_payment_identifier", str3, A13);
        String str4 = str;
        C17890vO.A11("tag", str4, A13);
        C196259ui A04 = C197889xR.A04(this, "upi-get-p2m-encrypted-data");
        Integer A002 = AnonymousClass8BR.A0b(this.A00).A00("upi-get-p2m-encrypted-data");
        this.A01.A0I(new C175908zT(this.A02.A00, this.A01, AnonymousClass8BR.A0a(this.A03), A04, b8h, this, A002, str2, str4), AnonymousClass8BX.A0P(A13), "get", C20113A7w.A0L);
    }
}
