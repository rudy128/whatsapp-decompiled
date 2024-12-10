package X;

/* renamed from: X.9lo  reason: invalid class name and case insensitive filesystem */
public final class C190969lo {
    public final /* synthetic */ DOZ A00;
    public final /* synthetic */ C23736Boh A01;
    public final /* synthetic */ E8A A02;
    public final /* synthetic */ E8A A03;

    public void A00(Integer num) {
        String str;
        E8A e8a = this.A02;
        if (e8a != null) {
            DOZ doz = this.A00;
            C23736Boh boh = this.A01;
            Object[] A1b = AnonymousClass3MX.A1b(doz, 0);
            switch (num.intValue()) {
                case 0:
                    str = "file_not_found";
                    break;
                case 1:
                    str = "invalid_parameter";
                    break;
                default:
                    str = "internal_error";
                    break;
            }
            AnonymousClass8BT.A19(boh, e8a, C18070vi.A0O(str, A1b, 1));
        }
    }

    public C190969lo(DOZ doz, C23736Boh boh, E8A e8a, E8A e8a2) {
        this.A03 = e8a;
        this.A00 = doz;
        this.A01 = boh;
        this.A02 = e8a2;
    }
}
