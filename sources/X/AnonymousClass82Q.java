package X;

import com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$addRecentEmojiShape$1;

/* renamed from: X.82Q  reason: invalid class name */
public final class AnonymousClass82Q extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int[] $emoji;
    public final /* synthetic */ AnonymousClass7JF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass82Q(AnonymousClass7JF r2, int[] iArr) {
        super(1);
        this.this$0 = r2;
        this.$emoji = iArr;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1409773u r7 = (C1409773u) obj;
        C18070vi.A0d(r7, 0);
        C130376jK r5 = (C130376jK) this.this$0.A0b.get();
        C23381Fv lifecycle = this.this$0.A0A.getLifecycle();
        int[] iArr = this.$emoji;
        AnonymousClass3Ma.A1N(lifecycle, 0, iArr);
        AnonymousClass3MW.A1X(r5.A05, new ExpressionsShapeCreator$addRecentEmojiShape$1(r5, (C30391dr) null, iArr), C37561pk.A00(lifecycle));
        this.this$0.A0H.A0D();
        this.this$0.C5O(r7);
        return C27621Wu.A00;
    }
}
