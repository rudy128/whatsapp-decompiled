package X;

import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.conversation.EditMessageActivity;
import com.whatsapp.emojiedittext.EmojiEditTextBottomSheetDialogFragment;
import com.whatsapp.group.newgroup.NewGroup;
import com.whatsapp.profile.ProfilePhotoReminder;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import java.util.List;

/* renamed from: X.4n0  reason: invalid class name and case insensitive filesystem */
public class C95914n0 implements C107395Zn {
    public final int A00;
    public final Object A01;

    public C95914n0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BsX(AnonymousClass737 r3) {
        C107845ai r1;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(r3, 1);
                r1 = ((CartFragment) this.A01).A19;
                break;
            case 1:
                C18070vi.A0d(r3, 1);
                r1 = ((EditMessageActivity) this.A01).A0O;
                break;
            case 2:
                ReactionsTrayViewModel reactionsTrayViewModel = ((AnonymousClass3uU) this.A01).A00.A0p;
                C17960vV.A07(reactionsTrayViewModel);
                reactionsTrayViewModel.A0W(C43251zV.A06(r3.A00));
                return;
            case 3:
                r1 = ((C74763cR) this.A01).A0B;
                break;
            case 4:
                r1 = ((EmojiEditTextBottomSheetDialogFragment) this.A01).A0X;
                break;
            case 5:
                r1 = ((NewGroup) this.A01).A0w;
                break;
            case 6:
                C92094gk r12 = (C92094gk) this.A01;
                List list = C42011xT.A0I;
                C18070vi.A0h(r12, r3);
                r12.BsW(r3.A00);
                return;
            case 9:
                r1 = ((ProfilePhotoReminder) this.A01).A0M;
                break;
            case 10:
                r1 = ((AnonymousClass4P4) this.A01).A02;
                break;
            default:
                r1 = (C107845ai) this.A01;
                break;
        }
        r1.BsW(r3.A00);
    }
}
