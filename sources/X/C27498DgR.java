package X;

import java.util.concurrent.Executor;

/* renamed from: X.DgR  reason: case insensitive filesystem */
public final class C27498DgR extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C26220Cv8 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27498DgR(C26220Cv8 cv8) {
        super(0);
        this.this$0 = cv8;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C26220Cv8 cv8 = this.this$0;
        if (!C26212Cuq.A04()) {
            C25239Cba cba = cv8.A03;
            Executor executor = ((C26762DCr) cba.A07).A02;
            return new DD7(C26220Cv8.A00(cv8, new BSk(cba.A00, cba.A09, executor)), cv8.A05);
        }
        C26212Cuq.A03("ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence:init");
        try {
            C25239Cba cba2 = cv8.A03;
            Executor executor2 = ((C26762DCr) cba2.A07).A02;
            return new DD7(C26220Cv8.A00(cv8, new BSk(cba2.A00, cba2.A09, executor2)), cv8.A05);
        } finally {
            C26212Cuq.A01();
        }
    }
}
