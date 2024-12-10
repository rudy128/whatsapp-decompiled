package X;

import com.whatsapp.audioRecording.OpusRecorderFactory;

/* renamed from: X.7wF  reason: invalid class name */
public final class AnonymousClass7wF extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C18030ve $abProps;
    public final /* synthetic */ OpusRecorderFactory $opusRecorderFactory;
    public final /* synthetic */ AnonymousClass72K this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7wF(OpusRecorderFactory opusRecorderFactory, C18030ve r3, AnonymousClass72K r4) {
        super(0);
        this.$opusRecorderFactory = opusRecorderFactory;
        this.this$0 = r4;
        this.$abProps = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        OpusRecorderFactory opusRecorderFactory = this.$opusRecorderFactory;
        AnonymousClass72K r0 = this.this$0;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(AnonymousClass3MW.A0y(r0.A0B));
        String A0y = AnonymousClass000.A0y(".opus", A10);
        C18030ve r1 = this.$abProps;
        C18040vf r2 = C18040vf.A02;
        boolean A05 = C18020vd.A05(r2, r1, 6501);
        int A00 = C18020vd.A00(r2, this.$abProps, 8149);
        boolean A052 = C18020vd.A05(r2, this.$abProps, 8379);
        AnonymousClass72K r02 = this.this$0;
        return opusRecorderFactory.createOpusRecorder(A0y, A05, A00, A052, r02.A0G, r02.A06, r02.A0F, r02.A04);
    }
}
