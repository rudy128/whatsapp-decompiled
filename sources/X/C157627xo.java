package X;

import com.whatsapp.bot.home.AIHomeActivity;
import com.whatsapp.bot.home.AiHomeViewAllFragment;

/* renamed from: X.7xo  reason: invalid class name and case insensitive filesystem */
public final class C157627xo extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AIHomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157627xo(AIHomeActivity aIHomeActivity) {
        super(1);
        this.this$0 = aIHomeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (obj != null && this.this$0.getSupportFragmentManager().A0Q("ai_home_view_all_fragment") == null) {
            C34001jj A0H = AnonymousClass3Ma.A0H(this.this$0);
            A0H.A0G = true;
            A0H.A0H("ai_home_view_all_fragment");
            C72473Md.A19(A0H);
            A0H.A0D(new AiHomeViewAllFragment(), "ai_home_view_all_fragment", 2131431000);
            A0H.A01();
        }
        return C27621Wu.A00;
    }
}
