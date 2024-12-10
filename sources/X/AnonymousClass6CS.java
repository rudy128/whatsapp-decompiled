package X;

import android.content.Context;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.6CS  reason: invalid class name */
public class AnonymousClass6CS extends C145267Kp {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6CS(AnonymousClass1KW r2) {
        super(r2);
        C18070vi.A0d(r2, 1);
    }

    public void CFC(C135396s8 r6, AnonymousClass206 r7) {
        C18070vi.A0d(r6, 1);
        TextEmojiLabel textEmojiLabel = r6.A02;
        Context context = textEmojiLabel.getContext();
        String string = context.getString(2131889034);
        CharSequence A03 = C72813Np.A03(textEmojiLabel.getPaint(), AnonymousClass4aX.A02(context, 2131232328, 2131103152), string);
        C18070vi.A0X(A03);
        A00(textEmojiLabel, A03);
    }
}
