package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.group.GroupChangedParticipantsBottomSheet;

/* renamed from: X.3ZL  reason: invalid class name */
public final class AnonymousClass3ZL extends C42011xT {
    public final ImageView A00;
    public final C42141xh A01;
    public final C28931bI A02;
    public final TextEmojiLabel A03;
    public final /* synthetic */ GroupChangedParticipantsBottomSheet A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3ZL(View view, GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet) {
        super(view);
        this.A04 = groupChangedParticipantsBottomSheet;
        C72043Kk r1 = groupChangedParticipantsBottomSheet.A04;
        if (r1 != null) {
            C42141xh A012 = C42141xh.A01(view, r1, 2131432903);
            this.A01 = A012;
            TextEmojiLabel A0c = C72453Mb.A0c(view, 2131435610);
            this.A03 = A0c;
            A0c.setVisibility(8);
            ImageView A0C = AnonymousClass3Ma.A0C(view, 2131437025);
            this.A00 = A0C;
            this.A02 = C28931bI.A00(view, 2131435005);
            A0C.setImportantForAccessibility(2);
            A012.A01.setTextColor(AnonymousClass3MZ.A02(view.getContext(), view.getContext(), 2130970343, 2131101314));
            view.setBackgroundResource(2131232942);
            return;
        }
        C18070vi.A11("textEmojiLabelViewControllerFactory");
        throw null;
    }
}
