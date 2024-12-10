package X;

import android.content.Context;
import android.text.TextPaint;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.6Cn  reason: invalid class name */
public class AnonymousClass6Cn extends C145267Kp {
    public final AnonymousClass12F A00;
    public final AnonymousClass1KW A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6Cn(AnonymousClass12F r1, AnonymousClass1KW r2) {
        super(r2);
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public void CFC(C135396s8 r6, AnonymousClass206 r7) {
        C18070vi.A0h(r7, r6);
        TextEmojiLabel textEmojiLabel = r6.A02;
        Context context = textEmojiLabel.getContext();
        TextPaint A0A = C108975cc.A0A(textEmojiLabel, context);
        String str = ((AnonymousClass22Q) r7).A0A;
        if (str == null) {
            str = "";
        }
        CharSequence A03 = C72813Np.A03(A0A, AnonymousClass12F.A00(context, 2131232336), str);
        C18070vi.A0X(A03);
        A00(textEmojiLabel, A03);
    }
}
