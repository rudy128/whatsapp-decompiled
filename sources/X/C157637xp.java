package X;

import com.whatsapp.bot.home.AIHomeActivity;
import com.whatsapp.bot.home.AiHomePreviewBottomSheet;
import com.whatsapp.bot.home.AiHomeViewModel;

/* renamed from: X.7xp  reason: invalid class name and case insensitive filesystem */
public final class C157637xp extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AIHomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157637xp(AIHomeActivity aIHomeActivity) {
        super(1);
        this.this$0 = aIHomeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AiHomeViewModel A0b;
        int i;
        C143307Cw r4 = (C143307Cw) obj;
        if (r4 != null) {
            AnonymousClass1CJ r1 = this.this$0.A02;
            if (r1 != null) {
                C29691ci A0A = r1.A0A(r4.A01);
                AIHomeActivity aIHomeActivity = this.this$0;
                if (A0A != null) {
                    C108945cZ.A0b(aIHomeActivity.A07).A0U(r4);
                    A0b = C108945cZ.A0b(this.this$0.A07);
                    i = 62;
                } else if (aIHomeActivity.getSupportFragmentManager().A0Q("ai_home_preview_bottom_sheet") == null) {
                    AnonymousClass3MY.A1H(new AiHomePreviewBottomSheet(), this.this$0, "ai_home_preview_bottom_sheet");
                    A0b = C108945cZ.A0b(this.this$0.A07);
                    i = 63;
                }
                A0b.A0T(i);
            } else {
                C18070vi.A11("chatsCache");
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}
