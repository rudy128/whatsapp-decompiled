package X;

import android.view.View;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8If  reason: invalid class name and case insensitive filesystem */
public final class C161908If extends C42011xT {
    public final TextEmojiLabel A00;
    public final /* synthetic */ C161778Hs A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161908If(View view, AnonymousClass1L9 r12, AnonymousClass11C r13, C161778Hs r14, C36401np r15) {
        super(view);
        this.A01 = r14;
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass3MX.A0C(view, 2131430027);
        this.A00 = textEmojiLabel;
        AnonymousClass3Ma.A1L(textEmojiLabel.getAbProps(), textEmojiLabel);
        AnonymousClass3Ma.A1K(textEmojiLabel, r13);
        C36401np r4 = r15;
        textEmojiLabel.setText(r4.A06(textEmojiLabel.getContext(), new AnonymousClass7R0(r12, textEmojiLabel, r14, 1), textEmojiLabel.getContext().getString(2131890892), "", AnonymousClass1YL.A00(textEmojiLabel.getContext(), 2130968627, 2131099690)));
    }
}
