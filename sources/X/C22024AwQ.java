package X;

import android.view.View;

/* renamed from: X.AwQ  reason: case insensitive filesystem */
public final class C22024AwQ extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ int $bannerType;
    public final /* synthetic */ View $containerView;
    public final /* synthetic */ C20441ALe this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22024AwQ(View view, C20441ALe aLe, int i) {
        super(0);
        this.this$0 = aLe;
        this.$bannerType = i;
        this.$containerView = view;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C20441ALe aLe = this.this$0;
        int i = this.$bannerType;
        View view = this.$containerView;
        C20441ALe.A00(aLe, 3, aLe.A02, i);
        view.setVisibility(8);
        aLe.A05.A0C(0);
        return C27621Wu.A00;
    }
}
