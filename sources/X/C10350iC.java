package X;

import android.content.Context;

/* renamed from: X.0iC  reason: invalid class name and case insensitive filesystem */
public final class C10350iC extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0R0 $callbacks;
    public final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10350iC(Context context, AnonymousClass0R0 r3) {
        super(1);
        this.$context = context;
        this.$callbacks = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.$context.getApplicationContext().registerComponentCallbacks(this.$callbacks);
        return new AnonymousClass0VX(this.$context, this.$callbacks, 7);
    }
}
