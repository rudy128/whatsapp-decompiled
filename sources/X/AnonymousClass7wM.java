package X;

import android.graphics.RectF;
import com.whatsapp.mediacomposer.ImageComposerFragment;

/* renamed from: X.7wM  reason: invalid class name */
public final class AnonymousClass7wM extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ RectF $cropRectF;
    public final /* synthetic */ int $rotate;
    public final /* synthetic */ Integer $toolToActivateAfterCrop;
    public final /* synthetic */ ImageComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7wM(RectF rectF, ImageComposerFragment imageComposerFragment, Integer num, int i) {
        super(0);
        this.this$0 = imageComposerFragment;
        this.$cropRectF = rectF;
        this.$rotate = i;
        this.$toolToActivateAfterCrop = num;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int intValue;
        AnonymousClass7JF r4 = this.this$0.A0J;
        if (r4 != null) {
            RectF rectF = this.$cropRectF;
            int i = this.$rotate;
            Integer num = this.$toolToActivateAfterCrop;
            r4.A0B();
            r4.A0C(rectF);
            if (!r4.A0N.A02) {
                C1405671z r1 = r4.A0Q;
                r1.A02 = (r1.A02 + i) % 360;
                C1405671z.A01(r1);
                C1405671z.A01(r1);
                r4.A0P.requestLayout();
                r4.A0O.A06();
            }
            if (num != null && (intValue = num.intValue()) == 6) {
                r4.A0W.A07(intValue);
            }
        }
        return C27621Wu.A00;
    }
}
