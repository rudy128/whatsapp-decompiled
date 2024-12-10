package X;

import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel;
import com.whatsapp.settings.chat.theme.fragment.PreviewThemePickerBottomSheetFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5UE  reason: invalid class name */
public final class AnonymousClass5UE extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ PreviewThemePickerBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5UE(PreviewThemePickerBottomSheetFragment previewThemePickerBottomSheetFragment) {
        super(1);
        this.this$0 = previewThemePickerBottomSheetFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayList;
        C18070vi.A0d(obj, 0);
        ChatThemeViewModel chatThemeViewModel = this.this$0.A01;
        if (chatThemeViewModel != null) {
            AnonymousClass1DT r7 = chatThemeViewModel.A0G;
            List<AnonymousClass4VO> A10 = AnonymousClass3MW.A10(r7);
            if (A10 != null) {
                arrayList = C29351c6.A0D(A10);
                for (AnonymousClass4VO r0 : A10) {
                    C88434Zr r4 = r0.A00;
                    arrayList.add(new AnonymousClass4VO(r4, chatThemeViewModel.A0R, (String) null, C18070vi.A18(r4.A00, obj)));
                }
            } else {
                arrayList = null;
            }
            r7.A0F(arrayList);
            return C27621Wu.A00;
        }
        AnonymousClass3MW.A1H();
        throw null;
    }
}
