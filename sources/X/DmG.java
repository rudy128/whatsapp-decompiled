package X;

import android.view.View;
import com.whatsapp.TextEmojiLabel;

public final class DmG extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ View $itemView;
    public final /* synthetic */ C72043Kk $textEmojiLabelViewControllerFactory;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DmG(View view, C72043Kk r3) {
        super(0);
        this.$textEmojiLabelViewControllerFactory = r3;
        this.$itemView = view;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C42141xh BGE = this.$textEmojiLabelViewControllerFactory.BGE(this.$itemView.getContext(), (TextEmojiLabel) AnonymousClass1HF.A06(this.$itemView, 2131429428));
        BGE.A01.setSingleLine(true);
        return BGE;
    }
}
