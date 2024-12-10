package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.9vK  reason: invalid class name and case insensitive filesystem */
public abstract class C196599vK {
    public static void A01(TextEmojiLabel textEmojiLabel, C198539yV r9, String str) {
        TextEmojiLabel textEmojiLabel2 = textEmojiLabel;
        Context context = textEmojiLabel.getContext();
        C198539yV.A00(context, textEmojiLabel2, r9, AnonymousClass001.A1H("# ", str, AnonymousClass000.A10()), "security-and-privacy", "how-to-select-a-location-when-looking-for-businesses-nearby");
        CharSequence text = textEmojiLabel2.getText();
        int A01 = C72463Mc.A01(context);
        C18070vi.A0d(text, 1);
        Context context2 = textEmojiLabel2.getContext();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(new SpannableString(text));
        C72813Np.A04(textEmojiLabel2.getPaint(), AnonymousClass4aX.A08(AnonymousClass3MX.A06(context2, 2131232072), C19740yt.A00(context2, A01)), spannableStringBuilder, -1, 0, 1);
        textEmojiLabel2.setText(spannableStringBuilder);
    }

    public static void A00(AnonymousClass1FL r5, C40751vD r6, C36531o3 r7) {
        C73203Rj A00 = AnonymousClass4a6.A00(r5);
        View A08 = AnonymousClass3MX.A08(r5, 2131625100);
        View A06 = AnonymousClass1HF.A06(A08, 2131433186);
        C90084dV.A00(AnonymousClass1HF.A06(A08, 2131436531), r5, r6, r7, 18);
        AFN.A00(A06, r5, 8);
        A00.A0O(C20160A9w.A00(r5, 1));
        A00.setView(A08);
        A00.A0C();
    }
}
