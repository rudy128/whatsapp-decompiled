package X;

import android.view.ViewStub;

/* renamed from: X.AuZ  reason: case insensitive filesystem */
public final class C21909AuZ extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C187939gc this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21909AuZ(C187939gc r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ViewStub viewStub = (ViewStub) AnonymousClass1HF.A06(this.this$0.A01, 2131436399);
        viewStub.setOnInflateListener(new C20295AFd(this.this$0, 1));
        return viewStub;
    }
}
