package X;

import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel;
import com.whatsapp.settings.chat.theme.fragment.ChatThemeMessageColorFragment;

/* renamed from: X.5UB  reason: invalid class name */
public final class AnonymousClass5UB extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ChatThemeMessageColorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5UB(ChatThemeMessageColorFragment chatThemeMessageColorFragment) {
        super(1);
        this.this$0 = chatThemeMessageColorFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C18070vi.A0d(str, 0);
        ChatThemeMessageColorFragment chatThemeMessageColorFragment = this.this$0;
        ChatThemeViewModel chatThemeViewModel = chatThemeMessageColorFragment.A01;
        if (chatThemeViewModel != null) {
            chatThemeViewModel.A0U(chatThemeMessageColorFragment.A14(), str, true);
            return C27621Wu.A00;
        }
        AnonymousClass3MW.A1H();
        throw null;
    }
}
