package X;

import android.content.Context;
import android.view.WindowMetrics;

/* renamed from: X.DqA  reason: case insensitive filesystem */
public final class C28035DqA extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ BMq $splitRule;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28035DqA(Context context, BMq bMq) {
        super(1);
        this.$splitRule = bMq;
        this.$context = context;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        WindowMetrics windowMetrics = (WindowMetrics) obj;
        C18070vi.A0d(windowMetrics, 0);
        return Boolean.valueOf(this.$splitRule.A01(this.$context, windowMetrics));
    }
}
