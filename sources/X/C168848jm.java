package X;

import android.view.View;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.8jm  reason: invalid class name and case insensitive filesystem */
public final class C168848jm extends AnonymousClass8IO {
    public final View A00;
    public final AnonymousClass1L9 A01;
    public final WaTextView A02;
    public final WaTextView A03;
    public final B7L A04;
    public final AnonymousClass8HZ A05;
    public final WDSButton A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C168848jm(View view, AnonymousClass1L9 r4, B7L b7l, AnonymousClass8HZ r6, UserJid userJid) {
        super(view);
        C18070vi.A0d(view, 2);
        this.A01 = r4;
        this.A05 = r6;
        this.A04 = b7l;
        this.A00 = AnonymousClass3MX.A0C(view, 2131429180);
        View findViewById = view.findViewById(2131428588);
        C18070vi.A0z(findViewById, "null cannot be cast to non-null type com.whatsapp.wds.components.button.WDSButton");
        WDSButton wDSButton = (WDSButton) findViewById;
        AnonymousClass78Q.A00(wDSButton, this, userJid, 48);
        this.A06 = wDSButton;
        this.A03 = C72453Mb.A0g(view, 2131436105);
        this.A02 = C72453Mb.A0g(view, 2131436104);
    }

    public /* bridge */ /* synthetic */ void A0B(C182999Wn r5) {
        C168748jc r52 = (C168748jc) r5;
        C18070vi.A0d(r52, 0);
        this.A03.setText(r52.A00);
        View view = this.A00;
        int i = 0;
        int i2 = 0;
        if (!r52.A01) {
            i2 = 4;
        }
        view.setVisibility(i2);
        WDSButton wDSButton = this.A06;
        if (!(!"catalog_products_all_items_collection_id".equals(r52.A02))) {
            i = 8;
        }
        wDSButton.setVisibility(i);
    }
}
