package X;

/* renamed from: X.0jE  reason: invalid class name and case insensitive filesystem */
public final class C10940jE extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C17330uU $layoutResult;
    public final /* synthetic */ C22821Di $onClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10940jE(C17330uU r2, C22821Di r3) {
        super(1);
        this.$layoutResult = r2;
        this.$onClick = r3;
    }

    public final void A00(long j) {
        C26227CvJ cvJ = (C26227CvJ) this.$layoutResult.getValue();
        if (cvJ != null) {
            this.$onClick.invoke(Integer.valueOf(cvJ.A0G(j)));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00(((AnonymousClass0QY) obj).A00);
        return C27621Wu.A00;
    }
}
