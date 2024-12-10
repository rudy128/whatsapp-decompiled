package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.6Cj  reason: invalid class name */
public class AnonymousClass6Cj extends C145267Kp {
    public final AnonymousClass12F A00;
    public final C32021gV A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6Cj(AnonymousClass12F r1, AnonymousClass1KW r2, C32021gV r3) {
        super(r2);
        C18070vi.A0o(r2, r1, r3);
        this.A00 = r1;
        this.A01 = r3;
    }

    public void CFC(C135396s8 r5, AnonymousClass206 r6) {
        C18070vi.A0h(r6, r5);
        TextEmojiLabel textEmojiLabel = r5.A02;
        AnonymousClass12F r2 = this.A00;
        Context context = textEmojiLabel.getContext();
        A00(textEmojiLabel, r2.A0A(context, C108975cc.A0A(textEmojiLabel, context), r6));
        View view = r5.A01;
        this.A01.A0D(view, r6, new AnonymousClass7N9(AnonymousClass3MY.A04(view)));
    }
}
