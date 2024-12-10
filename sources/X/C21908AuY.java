package X;

import android.view.View;
import android.view.ViewStub;

/* renamed from: X.AuY  reason: case insensitive filesystem */
public final class C21908AuY extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C187939gc this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21908AuY(C187939gc r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        View inflate = ((ViewStub) this.this$0.A06.getValue()).inflate();
        C18070vi.A0z(inflate, "null cannot be cast to non-null type com.whatsapp.WaTextView");
        return inflate;
    }
}
