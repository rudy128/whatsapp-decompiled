package X;

public final class CXF {
    public Integer A00;
    public Long A01;
    public Long A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public C23572Bm0 A00() {
        Integer num = this.A00;
        String str = "";
        if (num == null) {
            str = AnonymousClass000.A0y(" registrationStatus", AnonymousClass000.A11(str));
        }
        Long l = this.A01;
        if (l == null) {
            str = AnonymousClass000.A0y(" expiresInSecs", AnonymousClass000.A11(str));
        }
        Long l2 = this.A02;
        if (l2 == null) {
            str = AnonymousClass000.A0y(" tokenCreationEpochInSecs", AnonymousClass000.A11(str));
        }
        if (str.isEmpty()) {
            C24686CFk cFk = C24686CFk.A00;
            return new C23572Bm0(num, this.A04, this.A03, this.A06, this.A05, l.longValue(), l2.longValue());
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Missing required properties:");
        throw AnonymousClass000.A0o(str, A10);
    }
}
