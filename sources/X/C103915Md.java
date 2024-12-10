package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView;

/* renamed from: X.5Md  reason: invalid class name and case insensitive filesystem */
public final class C103915Md extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ VCOverscrollEntryPointView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103915Md(Context context, VCOverscrollEntryPointView vCOverscrollEntryPointView) {
        super(0);
        this.this$0 = vCOverscrollEntryPointView;
        this.$context = context;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LayerDrawable layerDrawable;
        Drawable A00 = this.this$0.getSocialIconDrawable();
        LayerDrawable layerDrawable2 = null;
        if (A00 instanceof LayerDrawable) {
            layerDrawable = (LayerDrawable) A00;
        } else {
            layerDrawable = null;
        }
        if (layerDrawable != null) {
            layerDrawable.getDrawable(0).setTint(-1);
            layerDrawable2 = layerDrawable;
        }
        return new LayerDrawable(new Drawable[]{AnonymousClass03S.A01(this.$context, 2131233124), layerDrawable2});
    }
}
