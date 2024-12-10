package X;

public final class CWG {
    public Integer A00;
    public Long A01;
    public String A02;

    public C23574Bm2 A00() {
        Long l = this.A01;
        String str = "";
        if (l == null) {
            str = AnonymousClass000.A0y(" tokenExpirationTimestamp", AnonymousClass000.A11(str));
        }
        if (str.isEmpty()) {
            return new C23574Bm2(this.A00, this.A02, l.longValue());
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Missing required properties:");
        throw AnonymousClass000.A0o(str, A10);
    }
}
