package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;

/* renamed from: X.6BO  reason: invalid class name */
public final class AnonymousClass6BO extends C112945mI {
    public final AnonymousClass85X A00;
    public final C18000vb A01;

    public AnonymousClass6BO(View view, C18000vb r5, AnonymousClass85X r6) {
        super(view);
        this.A01 = r5;
        this.A00 = r6;
        if (view instanceof WDSSectionHeader) {
            WDSSectionHeader wDSSectionHeader = (WDSSectionHeader) view;
            Context context = wDSSectionHeader.getContext();
            wDSSectionHeader.setAddOnType(new AnonymousClass6Pk(C27881Xz.TONAL, context != null ? context.getString(2131895583) : null));
            return;
        }
        C43421zm.A04(C17880vN.A0E(view, 2131435061));
        C43421zm.A04(C108975cc.A0C(view));
        AnonymousClass3NL.A01(view.getContext(), AnonymousClass3MW.A0H(view, 2131429091), r5, 2131233242);
    }
}
