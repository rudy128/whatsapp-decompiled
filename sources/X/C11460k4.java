package X;

/* renamed from: X.0k4  reason: invalid class name and case insensitive filesystem */
public final class C11460k4 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ C04940Pp $state;
    public final /* synthetic */ C16520sO $this_semantics;
    public final /* synthetic */ C26224CvE $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11460k4(C04940Pp r2, C16520sO r3, C26224CvE cvE, boolean z, boolean z2) {
        super(1);
        this.$readOnly = z;
        this.$enabled = z2;
        this.$state = r2;
        this.$this_semantics = r3;
        this.$value = cvE;
    }

    /* renamed from: A00 */
    public final Boolean invoke(C27069DRu dRu) {
        if (this.$readOnly || !this.$enabled) {
            return false;
        }
        C04940Pp r7 = this.$state;
        C25246Cbl A08 = r7.A08();
        if (A08 != null) {
            C05090Qj.A08(r7.A07(), A08, AnonymousClass1ZU.A08(new C26604D5u(), new D60(dRu, 1)), r7.A0A());
        } else {
            C26224CvE cvE = this.$value;
            String A04 = cvE.A04();
            long A01 = cvE.A01();
            r7.A0A().invoke(new C26224CvE(AnonymousClass1YF.A0O(A04, dRu, (int) (A01 >> 32), AnonymousClass000.A0H(A01)).toString(), 4, C25858CnM.A00(((int) (cvE.A01() >> 32)) + dRu.length())));
        }
        return true;
    }
}
