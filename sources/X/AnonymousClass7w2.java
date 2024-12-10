package X;

import com.whatsapp.ml.v2.MLModelUtilV2;

/* renamed from: X.7w2  reason: invalid class name */
public final class AnonymousClass7w2 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass708 $model;
    public final /* synthetic */ C18090vk $onDeletionComplete;
    public final /* synthetic */ C1407873b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7w2(C1407873b r2, AnonymousClass708 r3, C18090vk r4) {
        super(0);
        this.this$0 = r2;
        this.$model = r3;
        this.$onDeletionComplete = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.this$0.A03.get();
        AnonymousClass3MW.A12(this.this$0.A05).remove(MLModelUtilV2.A00(this.$model));
        this.$onDeletionComplete.invoke();
        return C27621Wu.A00;
    }
}
