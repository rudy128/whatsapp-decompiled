package X;

import android.content.Context;
import com.whatsapp.plugins.MetaAiLinkView;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;

/* renamed from: X.DmS  reason: case insensitive filesystem */
public final class C27831DmS extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MetaAiLinkView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27831DmS(Context context, MetaAiLinkView metaAiLinkView) {
        super(0);
        this.this$0 = metaAiLinkView;
        this.$context = context;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass1KB r2 = (AnonymousClass1KB) this.this$0.getGlobalUI().get();
        AnonymousClass181 r3 = (AnonymousClass181) this.this$0.getStatistics().get();
        AnonymousClass18K r7 = (AnonymousClass18K) this.this$0.getWamRuntime().get();
        C24421Kg r9 = (C24421Kg) this.this$0.getRouteSelector().get();
        C24371Kb r8 = (C24371Kb) this.this$0.getMediaHttpClientFactory().get();
        File A0e = C17880vN.A0e(this.$context.getCacheDir(), "meta_ai_link_view");
        return new C115525vC(r2, r3, this.this$0.getBitmapLoaderAdapter(), (AnonymousClass11P) this.this$0.getTime().get(), (C18030ve) this.this$0.getAbProps().get(), r7, r8, r9, (AnonymousClass10I) this.this$0.getWaWorkers().get(), (JniBridge) this.this$0.getIJniBridge().get(), A0e, "meta_ai_link_view", 1, 2097152);
    }
}
