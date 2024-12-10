package X;

import com.whatsapp.bot.home.AIHomeActivity;
import com.whatsapp.wds.components.search.WDSSearchBar;
import com.whatsapp.wds.components.search.WDSSearchView;

/* renamed from: X.7xs  reason: invalid class name and case insensitive filesystem */
public final class C157667xs extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AIHomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157667xs(AIHomeActivity aIHomeActivity) {
        super(1);
        this.this$0 = aIHomeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String A0F;
        C123316Ty r4 = (C123316Ty) obj;
        AIHomeActivity aIHomeActivity = this.this$0;
        WDSSearchBar wDSSearchBar = aIHomeActivity.A03;
        if (wDSSearchBar == null) {
            C18070vi.A11("wdsSearchBar");
            throw null;
        }
        WDSSearchView wDSSearchView = wDSSearchBar.A08;
        if (r4 instanceof C121206Ik) {
            A0F = ((C121206Ik) r4).A00;
        } else if (r4 instanceof AnonymousClass6Ij) {
            A0F = C18070vi.A0F(aIHomeActivity, 2131895489);
        } else {
            throw AnonymousClass3MW.A14();
        }
        wDSSearchView.setHint((CharSequence) A0F);
        return C27621Wu.A00;
    }
}
