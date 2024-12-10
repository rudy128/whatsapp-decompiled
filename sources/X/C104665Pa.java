package X;

import android.content.Context;

/* renamed from: X.5Pa  reason: invalid class name and case insensitive filesystem */
public final class C104665Pa extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AnonymousClass4CV $displayMode;
    public final /* synthetic */ AnonymousClass1EC $groupJid;
    public final /* synthetic */ AnonymousClass3QQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104665Pa(Context context, AnonymousClass4CV r3, AnonymousClass3QQ r4, AnonymousClass1EC r5) {
        super(0);
        this.$displayMode = r3;
        this.this$0 = r4;
        this.$context = context;
        this.$groupJid = r5;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int ordinal = this.$displayMode.ordinal();
        if (ordinal == 0) {
            return this.this$0.A00.BGP(this.$context, this.$groupJid);
        }
        if (ordinal == 1) {
            return null;
        }
        throw AnonymousClass3MW.A14();
    }
}
