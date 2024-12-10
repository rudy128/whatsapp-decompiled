package X;

import android.graphics.Paint;

/* renamed from: X.Dlc  reason: case insensitive filesystem */
public final class C27800Dlc extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BHP $content;
    public final /* synthetic */ int $defaultLayerType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27800Dlc(BHP bhp, int i) {
        super(0);
        this.$content = bhp;
        this.$defaultLayerType = i;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int layerType = this.$content.getLayerType();
        int i = this.$defaultLayerType;
        if (layerType != i) {
            this.$content.setLayerType(i, (Paint) null);
        }
        return C27621Wu.A00;
    }
}
