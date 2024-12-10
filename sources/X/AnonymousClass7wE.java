package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;
import java.util.List;

/* renamed from: X.7wE  reason: invalid class name */
public final class AnonymousClass7wE extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ View $itemView;
    public final /* synthetic */ C18000vb $whatsAppLocale;
    public final /* synthetic */ AnonymousClass6KM this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7wE(View view, C18000vb r3, AnonymousClass6KM r4) {
        super(0);
        this.$itemView = view;
        this.$whatsAppLocale = r3;
        this.this$0 = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        WDSSectionHeader wDSSectionHeader;
        WDSButton A07;
        View view = this.$itemView;
        C03610Iy r6 = null;
        if (!(!(view instanceof WDSSectionHeader) || (wDSSectionHeader = (WDSSectionHeader) view) == null || (A07 = wDSSectionHeader.A07(true)) == null)) {
            View view2 = this.$itemView;
            C18000vb r0 = this.$whatsAppLocale;
            AnonymousClass6KM r3 = this.this$0;
            Context context = view2.getContext();
            int i = 3;
            if (AnonymousClass3MY.A1b(r0)) {
                i = 5;
            }
            r6 = new C03610Iy(context, A07, i, 0, 2132084381);
            C003301m r5 = r6.A03;
            if (C22891Dp.A05) {
                r5.A06 = true;
            }
            List list = C42011xT.A0I;
            if (r3.A01.BcY()) {
                C108995ce.A0s(r5.add(0, 0, 0, 2131894712), r3.A0H, 2131232194);
            }
            C108995ce.A0s(r5.add(0, 1, 0, 2131894713), r3.A0H, 2131231878);
            r6.A01 = r3;
        }
        return r6;
    }
}
