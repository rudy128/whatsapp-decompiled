package X;

/* renamed from: X.Az2  reason: case insensitive filesystem */
public final class C22186Az2 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C195709tm $flowIdLinks;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22186Az2(C195709tm r2) {
        super(1);
        this.$flowIdLinks = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        A0a.A01("flow_id", this.$flowIdLinks.A04);
        A0a.A01("data_api_version", this.$flowIdLinks.A03);
        A0a.A01("data_api_protocol", this.$flowIdLinks.A02);
        A0a.A01("state", this.$flowIdLinks.A00);
        A0a.A01("flow_version_ids", this.$flowIdLinks.A06);
        A0a.A01("psl_cdn_url", this.$flowIdLinks.A07);
        A0a.A01("psl_signature", this.$flowIdLinks.A08);
        String[] strArr = this.$flowIdLinks.A09;
        if (strArr != null) {
            str = C200410p.A0I(", ", "", "", strArr);
        } else {
            str = null;
        }
        A0a.A01("categories", str);
        A0a.A01("well_version", Integer.valueOf(this.$flowIdLinks.A01));
        A0a.A01("flow_name", this.$flowIdLinks.A05);
        return C27621Wu.A00;
    }
}
