package X;

import android.content.Context;

/* renamed from: X.3If  reason: invalid class name and case insensitive filesystem */
public final class C71753If extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $isCompanionFlow;
    public final /* synthetic */ int $source;
    public final /* synthetic */ C62092qm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71753If(Context context, C62092qm r3, int i, boolean z) {
        super(1);
        this.this$0 = r3;
        this.$context = context;
        this.$source = i;
        this.$isCompanionFlow = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C62092qm r5 = this.this$0;
        Context context = this.$context;
        int i = this.$source;
        boolean z = this.$isCompanionFlow;
        r5.A08 = str;
        C17900vP.A0f("AddAccountNavigator/executeAddAccountFlow/multiAccountServerPrimer/onComplete/", str, AnonymousClass000.A10());
        C62092qm.A09 = true;
        C62092qm.A00(context, r5, i, z);
        return C27621Wu.A00;
    }
}
