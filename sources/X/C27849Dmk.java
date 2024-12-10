package X;

import android.graphics.Rect;

/* renamed from: X.Dmk  reason: case insensitive filesystem */
public final class C27849Dmk extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Object $callerContext = "BloksRichTextImageSpan";
    public final /* synthetic */ D4B $contextChain;
    public final /* synthetic */ C28604E9v $imageListener;
    public final /* synthetic */ C26738DBr $imageRequest;
    public final /* synthetic */ C22627BGn $target;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27849Dmk(D4B d4b, C26738DBr dBr, C28604E9v e9v, C22627BGn bGn) {
        super(0);
        this.$target = bGn;
        this.$imageRequest = dBr;
        this.$contextChain = d4b;
        this.$imageListener = e9v;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Boolean.valueOf(C25869Cnd.A00().A08((Rect) null, (E12) null, this.$target.A03, this.$imageRequest, this.$imageListener, this.$callerContext));
    }
}
