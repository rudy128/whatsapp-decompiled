package X;

/* renamed from: X.DhL  reason: case insensitive filesystem */
public final class C27554DhL extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C26226CvH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27554DhL(C26226CvH cvH) {
        super(0);
        this.this$0 = cvH;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C25838Cms cms = this.this$0.A0H;
        if (cms != null && cms.A00 == 1) {
            cms.A03("first_video_frame_rendered");
            cms.A01(2);
            C25822CmZ.A0B.A03(true);
            cms.A00 = 2;
        }
        C26226CvH cvH = this.this$0;
        cvH.A0A(cvH.A03 + 1);
        return C27621Wu.A00;
    }
}
