package X;

import android.content.res.AssetManager;

/* renamed from: X.DgG  reason: case insensitive filesystem */
public final class C27487DgG extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BVr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27487DgG(BVr bVr) {
        super(0);
        this.this$0 = bVr;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AssetManager assets = this.this$0.A03.getAssets();
        C18070vi.A0X(assets);
        return new BVs(new CJM(assets));
    }
}
