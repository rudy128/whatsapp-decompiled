package X;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.banners.WDSBanner;

/* renamed from: X.3iL  reason: invalid class name and case insensitive filesystem */
public final class C75733iL extends C91944gV {
    public final boolean A00;
    public final C18090vk A01;

    public void A02(C195759tr r4, C85634Od r5, AnonymousClass5YR r6) {
        C188169gz r0;
        C18070vi.A0d(r5, 0);
        super.A02(r4, r5, r6);
        if (r6 != null && (r0 = ((C21319Ai4) r6).A07) != null) {
            TextView textView = r5.A05;
            textView.setVisibility(0);
            textView.setText(r0.A06);
        }
    }

    public void A03(C195759tr r3, AnonymousClass5YR r4, WDSBanner wDSBanner) {
        C18070vi.A0d(wDSBanner, 0);
        super.A03(r3, r4, wDSBanner);
        TextEmojiLabel textEmojiLabel = wDSBanner.A01;
        if (textEmojiLabel != null) {
            textEmojiLabel.setMaxLines(Integer.MAX_VALUE);
        }
    }

    public C75733iL(FrameLayout frameLayout, C36671oH r3, C189349iw r4, C18030ve r5, AnonymousClass10I r6, C18090vk r7) {
        super(frameLayout, r3, r4, r5, r6);
        this.A01 = r7;
        this.A00 = r3.A06();
    }

    public void Bcv() {
        super.Bcv();
        this.A01.invoke();
    }
}
