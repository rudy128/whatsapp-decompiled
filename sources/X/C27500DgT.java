package X;

/* renamed from: X.DgT  reason: case insensitive filesystem */
public final class C27500DgT extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C26220Cv8 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27500DgT(C26220Cv8 cv8) {
        super(0);
        this.this$0 = cv8;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C26220Cv8 cv8 = this.this$0;
        if (!C26212Cuq.A04()) {
            return new DD7((E4W) cv8.A0A.getValue(), cv8.A05);
        }
        C26212Cuq.A03("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
        try {
            return new DD7((E4W) cv8.A0A.getValue(), cv8.A05);
        } finally {
            C26212Cuq.A01();
        }
    }
}
