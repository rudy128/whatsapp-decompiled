package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.settings.chat.theme.fragment.ChatThemeMessageColorFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5UC  reason: invalid class name */
public final class AnonymousClass5UC extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ChatThemeMessageColorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5UC(ChatThemeMessageColorFragment chatThemeMessageColorFragment) {
        super(1);
        this.this$0 = chatThemeMessageColorFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        List<AnonymousClass4VO> list = (List) obj;
        C18070vi.A0b(list);
        ArrayList A0D = C29351c6.A0D(list);
        for (AnonymousClass4VO r4 : list) {
            C88434Zr r1 = r4.A00;
            if (r1 instanceof C80373x2) {
                i = ((C80373x2) r1).A00;
            } else {
                i = 0;
            }
            A0D.add(new AnonymousClass4UC(i, r1.A00, r4.A03));
        }
        ChatThemeMessageColorFragment chatThemeMessageColorFragment = this.this$0;
        RecyclerView recyclerView = chatThemeMessageColorFragment.A00;
        if (recyclerView != null) {
            C38391rD r0 = recyclerView.A0B;
            if (r0 != null) {
                ((C73663Wv) r0).A0U(A0D);
            } else {
                C73663Wv r12 = new C73663Wv(A0D, new AnonymousClass5UB(chatThemeMessageColorFragment));
                RecyclerView recyclerView2 = this.this$0.A00;
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(r12);
                }
            }
            return C27621Wu.A00;
        }
        C18070vi.A11("colorsRecyclerView");
        throw null;
    }
}
