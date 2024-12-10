package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView;

/* renamed from: X.5Me  reason: invalid class name and case insensitive filesystem */
public final class C103925Me extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ VCOverscrollEntryPointView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103925Me(Context context, VCOverscrollEntryPointView vCOverscrollEntryPointView) {
        super(0);
        this.$context = context;
        this.this$0 = vCOverscrollEntryPointView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return new LayerDrawable(new Drawable[]{AnonymousClass03S.A01(this.$context, 2131233007), this.this$0.getSocialIconDrawable()});
    }
}
