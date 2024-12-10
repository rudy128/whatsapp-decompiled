package X;

import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.4XA  reason: invalid class name */
public final class AnonymousClass4XA {
    public final C24921Me A00;

    public AnonymousClass4XA(C24921Me r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final void A00(TextEmojiLabel textEmojiLabel, String str) {
        C18070vi.A0d(textEmojiLabel, 0);
        if (str == null || str.length() == 0) {
            textEmojiLabel.setText((CharSequence) null);
            textEmojiLabel.setVisibility(8);
            return;
        }
        textEmojiLabel.A0S(str, (List) null, 0, false);
        textEmojiLabel.setVisibility(0);
    }

    public final void A01(TextEmojiLabel textEmojiLabel, AnonymousClass1E7 r3, Integer num, int i) {
        C18070vi.A0d(textEmojiLabel, 3);
        A00(textEmojiLabel, this.A00.A0G(r3, num, i).A01);
    }
}
