package X;

import android.view.View;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.6s8  reason: invalid class name and case insensitive filesystem */
public final class C135396s8 {
    public View A00;
    public final View A01;
    public final TextEmojiLabel A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135396s8) {
                C135396s8 r5 = (C135396s8) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A02)));
    }

    public C135396s8(View view, View view2, TextEmojiLabel textEmojiLabel) {
        C18070vi.A0j(textEmojiLabel, view);
        this.A02 = textEmojiLabel;
        this.A01 = view;
        this.A00 = view2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PinInChatRenderParams(contentTextView=");
        A10.append(this.A02);
        A10.append(", contentThumbnailViewOrStub=");
        A10.append(this.A01);
        A10.append(", secondaryContentTextViewOrStub=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
