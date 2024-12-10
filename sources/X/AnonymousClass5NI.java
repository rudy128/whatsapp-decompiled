package X;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: X.5NI  reason: invalid class name */
public final class AnonymousClass5NI extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AnonymousClass3Q6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5NI(Context context, AnonymousClass3Q6 r3) {
        super(0);
        this.$context = context;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinearLayout linearLayout = new LinearLayout(this.$context);
        this.this$0.addView(linearLayout);
        return linearLayout;
    }
}
