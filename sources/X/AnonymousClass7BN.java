package X;

import android.view.Window;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.payments.ui.MessageWithLinkWebViewActivity;

/* renamed from: X.7BN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7BN implements C28664EDb {
    public final /* synthetic */ AppBarLayout A00;
    public final /* synthetic */ MessageWithLinkWebViewActivity A01;

    public final void BzS(AppBarLayout appBarLayout, int i) {
        MessageWithLinkWebViewActivity messageWithLinkWebViewActivity = this.A01;
        boolean A1C = C108975cc.A1C(Math.abs(i), this.A00.getTotalScrollRange());
        messageWithLinkWebViewActivity.A0A = A1C;
        if (A1C) {
            Integer num = messageWithLinkWebViewActivity.A09;
            if (num != null) {
                int intValue = num.intValue();
                Window window = messageWithLinkWebViewActivity.getWindow();
                C18070vi.A0X(window);
                C28271Zs.A00(window, intValue, true);
                return;
            }
            return;
        }
        Window window2 = messageWithLinkWebViewActivity.getWindow();
        C18070vi.A0X(window2);
        C28271Zs.A00(window2, AnonymousClass3Ma.A00(messageWithLinkWebViewActivity, 2130970830, 2131102245), true);
    }

    public /* synthetic */ AnonymousClass7BN(AppBarLayout appBarLayout, MessageWithLinkWebViewActivity messageWithLinkWebViewActivity) {
        this.A01 = messageWithLinkWebViewActivity;
        this.A00 = appBarLayout;
    }
}
