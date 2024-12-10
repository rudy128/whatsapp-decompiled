package X;

import android.content.Context;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.6Cm  reason: invalid class name */
public class AnonymousClass6Cm extends C145267Kp {
    public final AnonymousClass12F A00;
    public final AnonymousClass1KW A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6Cm(AnonymousClass12F r1, AnonymousClass1KW r2) {
        super(r2);
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public void CFC(C135396s8 r5, AnonymousClass206 r6) {
        C18070vi.A0h(r6, r5);
        TextEmojiLabel textEmojiLabel = r5.A02;
        AnonymousClass12F r2 = this.A00;
        Context context = textEmojiLabel.getContext();
        A00(textEmojiLabel, r2.A0D(context, C108975cc.A0A(textEmojiLabel, context), r6));
    }
}
