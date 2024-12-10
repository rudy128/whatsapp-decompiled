package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.wds.components.banners.WDSBanner;
import java.util.Iterator;

/* renamed from: X.5OB  reason: invalid class name */
public final class AnonymousClass5OB extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1FU $activity;
    public final /* synthetic */ AnonymousClass4VW this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5OB(AnonymousClass1FU r2, AnonymousClass4VW r3) {
        super(0);
        this.this$0 = r3;
        this.$activity = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ViewGroup viewGroup;
        View view = this.$activity.A00;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            Iterator it = C83714Gj.A00(viewGroup, WDSBanner.class).iterator();
            while (it.hasNext()) {
                AnonymousClass3MX.A0E(it).setVisibility(8);
            }
        }
        return C27621Wu.A00;
    }
}
