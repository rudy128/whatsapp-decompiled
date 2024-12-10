package X;

import com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens;
import java.util.Map;

/* renamed from: X.7rk  reason: invalid class name and case insensitive filesystem */
public final class C154817rk extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BkScreenFragmentWithCustomPreloadScreens this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154817rk(BkScreenFragmentWithCustomPreloadScreens bkScreenFragmentWithCustomPreloadScreens) {
        super(0);
        this.this$0 = bkScreenFragmentWithCustomPreloadScreens;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        BkScreenFragmentWithCustomPreloadScreens bkScreenFragmentWithCustomPreloadScreens = this.this$0;
        Map map = bkScreenFragmentWithCustomPreloadScreens.A09;
        if (map != null) {
            return map.get(bkScreenFragmentWithCustomPreloadScreens.A0D.getValue());
        }
        C18070vi.A11("bloksCustomPreLoadScreens");
        throw null;
    }
}
