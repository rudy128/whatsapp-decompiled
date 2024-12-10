package X;

import android.widget.FrameLayout;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4FG  reason: invalid class name */
public abstract class AnonymousClass4FG {
    public void A01(FrameLayout frameLayout, AnonymousClass3uP r10, AnonymousClass206 r11, C20285AEt aEt) {
        String str;
        String str2;
        if (this instanceof C46112Cy) {
            C18070vi.A0o(r11, aEt, r10);
            frameLayout.removeAllViews();
            AnonymousClass3go r1 = new AnonymousClass3go(AnonymousClass3MY.A04(frameLayout));
            frameLayout.addView(r1);
            AEE aee = aEt.A05;
            if (aee == null || (str2 = aee.A02) == null || str2.length() == 0) {
                r1.A02.setVisibility(8);
                return;
            }
            TextEmojiLabel textEmojiLabel = r1.A02;
            r10.setMessageText(str2, textEmojiLabel, r11, C82924Cr.HEADER);
            textEmojiLabel.setVisibility(0);
            return;
        }
        C18070vi.A0e(frameLayout, 0, aEt);
        frameLayout.removeAllViews();
        AnonymousClass3gn r6 = new AnonymousClass3gn(AnonymousClass3MY.A04(frameLayout));
        frameLayout.addView(r6);
        AEE aee2 = aEt.A05;
        String str3 = null;
        if (aee2 != null) {
            str3 = aee2.A02;
        }
        String str4 = "";
        if (str3 == null) {
            str3 = str4;
        }
        int length = str3.length();
        TextEmojiLabel textEmojiLabel2 = r6.A01;
        if (length > 0) {
            textEmojiLabel2.setText(str3);
            textEmojiLabel2.setVisibility(0);
        } else {
            textEmojiLabel2.setVisibility(8);
        }
        if (!(aee2 == null || (str = aee2.A01) == null)) {
            str4 = str;
        }
        int length2 = str4.length();
        TextEmojiLabel textEmojiLabel3 = r6.A00;
        if (length2 > 0) {
            textEmojiLabel3.setText(str4);
            textEmojiLabel3.setVisibility(0);
        } else {
            textEmojiLabel3.setVisibility(8);
        }
        if (length == 0 && length2 == 0) {
            r6.setVisibility(8);
        } else {
            r6.setVisibility(0);
        }
    }
}
