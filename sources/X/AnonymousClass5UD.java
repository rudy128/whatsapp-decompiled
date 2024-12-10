package X;

import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel;
import com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment;
import java.util.List;

/* renamed from: X.5UD  reason: invalid class name */
public final class AnonymousClass5UD extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ChatThemeSelectionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5UD(ChatThemeSelectionFragment chatThemeSelectionFragment) {
        super(1);
        this.this$0 = chatThemeSelectionFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass4VO r1;
        int A0M = AnonymousClass000.A0M(obj);
        ChatThemeViewModel chatThemeViewModel = this.this$0.A02;
        if (chatThemeViewModel != null) {
            List A10 = AnonymousClass3MW.A10(chatThemeViewModel.A08);
            if (!(A10 == null || (r1 = (AnonymousClass4VO) A10.get(A0M)) == null)) {
                ChatThemeSelectionFragment chatThemeSelectionFragment = this.this$0;
                ChatThemeViewModel chatThemeViewModel2 = chatThemeSelectionFragment.A02;
                if (chatThemeViewModel2 != null) {
                    chatThemeViewModel2.A0U(chatThemeSelectionFragment.A14(), r1.A00(), false);
                }
            }
            return C27621Wu.A00;
        }
        AnonymousClass3MW.A1H();
        throw null;
    }
}
