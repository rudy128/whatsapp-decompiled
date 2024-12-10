package X;

/* renamed from: X.0jt  reason: invalid class name and case insensitive filesystem */
public final class C11350jt extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ C04940Pp $state;
    public final /* synthetic */ C16520sO $this_semantics;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11350jt(C04940Pp r2, C16520sO r3, boolean z, boolean z2) {
        super(1);
        this.$readOnly = z;
        this.$enabled = z2;
        this.$state = r2;
        this.$this_semantics = r3;
    }

    /* renamed from: A00 */
    public final Boolean invoke(C27069DRu dRu) {
        if (this.$readOnly || !this.$enabled) {
            return false;
        }
        C04940Pp r4 = this.$state;
        C25246Cbl A08 = r4.A08();
        if (A08 != null) {
            C05090Qj.A08(r4.A07(), A08, AnonymousClass1ZU.A08(new C26603D5t(), new D60(dRu, 1)), r4.A0A());
        } else {
            C22821Di A0A = r4.A0A();
            String A02 = dRu.A02();
            A0A.invoke(new C26224CvE(A02, 4, C25858CnM.A00(A02.length())));
        }
        return true;
    }
}
