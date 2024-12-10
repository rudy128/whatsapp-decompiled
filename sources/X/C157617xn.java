package X;

import com.whatsapp.bot.home.AIHomeActivity;
import com.whatsapp.wds.components.search.WDSSearchBar;

/* renamed from: X.7xn  reason: invalid class name and case insensitive filesystem */
public final class C157617xn extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AIHomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157617xn(AIHomeActivity aIHomeActivity) {
        super(1);
        this.this$0 = aIHomeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1a = AnonymousClass3MX.A1a((Boolean) obj);
        AIHomeActivity aIHomeActivity = this.this$0;
        WDSSearchBar wDSSearchBar = aIHomeActivity.A03;
        if (A1a) {
            if (wDSSearchBar != null) {
                if (!AnonymousClass000.A1P(wDSSearchBar.A08.getVisibility())) {
                    WDSSearchBar wDSSearchBar2 = aIHomeActivity.A03;
                    if (wDSSearchBar2 != null) {
                        WDSSearchBar.A01(wDSSearchBar2, true, true);
                    }
                }
            }
            C18070vi.A11("wdsSearchBar");
            throw null;
        }
        if (wDSSearchBar != null) {
            if (AnonymousClass000.A1P(wDSSearchBar.A08.getVisibility())) {
                WDSSearchBar wDSSearchBar3 = aIHomeActivity.A03;
                if (wDSSearchBar3 != null) {
                    wDSSearchBar3.A02(true);
                }
            }
        }
        C18070vi.A11("wdsSearchBar");
        throw null;
        return C27621Wu.A00;
    }
}
