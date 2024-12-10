package X;

import androidx.viewpager2.widget.ViewPager2;
import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet;

/* renamed from: X.7y1  reason: invalid class name */
public final class AnonymousClass7y1 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AiImagineBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7y1(AiImagineBottomSheet aiImagineBottomSheet) {
        super(1);
        this.this$0 = aiImagineBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ViewPager2 viewPager2 = this.this$0.A0C;
        C38391rD r1 = null;
        if (viewPager2 != null) {
            r1 = viewPager2.A04.A0B;
        }
        if ((r1 instanceof C111905kc) && r1 != null) {
            r1.notifyDataSetChanged();
        }
        return C27621Wu.A00;
    }
}
