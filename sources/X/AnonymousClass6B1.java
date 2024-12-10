package X;

import android.view.View;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.List;

/* renamed from: X.6B1  reason: invalid class name */
public final class AnonymousClass6B1 extends C175028xj {
    public final TextEmojiLabel A00;
    public final C42141xh A01;
    public final WaImageButton A02;
    public final ThumbnailButton A03;
    public final C37451pZ A04;
    public final C1600987c A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6B1(View view, C72043Kk r9, C27201Vd r10, C1600987c r11) {
        super(view);
        C18070vi.A0p(r11, r10, r9);
        this.A05 = r11;
        C42141xh A012 = C42141xh.A01(view, r9, 2131429428);
        this.A01 = A012;
        this.A04 = r10.A06(view.getContext(), "wa-business-contact-view-holder");
        ThumbnailButton thumbnailButton = (ThumbnailButton) C18070vi.A05(view, 2131429433);
        this.A03 = thumbnailButton;
        TextEmojiLabel A0c = C72453Mb.A0c(view, 2131429458);
        this.A00 = A0c;
        this.A02 = (WaImageButton) C18070vi.A05(view, 2131432671);
        A0c.setClickable(true);
        A0c.setVisibility(0);
        A0c.A0L();
        C72463Mc.A0w(view.getContext(), view.getContext(), A0c, 2130970340, 2131101312);
        thumbnailButton.setAlpha(1.0f);
        TextEmojiLabel textEmojiLabel = A012.A01;
        C43421zm.A04(textEmojiLabel);
        C72463Mc.A0w(view.getContext(), view.getContext(), textEmojiLabel, 2130970343, 2131101314);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C127546eX r6 = (C127546eX) obj;
        C18070vi.A0d(r6, 0);
        C42141xh r1 = this.A01;
        AnonymousClass1E7 r4 = r6.A00;
        r1.A08(r4, -1);
        this.A04.A07(this.A03, r4);
        String str = r4.A0Z;
        if (str != null) {
            this.A00.A0S(AnonymousClass000.A0y("  ", AnonymousClass000.A11(str)), (List) null, 0, false);
        }
        TextEmojiLabel textEmojiLabel = this.A00;
        String str2 = r4.A0Z;
        int i = 0;
        if (str2 == null || str2.length() == 0) {
            i = 8;
        }
        textEmojiLabel.setVisibility(i);
        AnonymousClass3MZ.A1O(this.A02, this, r6, 33);
    }
}
