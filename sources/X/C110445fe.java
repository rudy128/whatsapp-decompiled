package X;

import android.widget.FrameLayout;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.perf.MeasuringFrameLayout;
import com.whatsapp.util.ClippingLayout;

/* renamed from: X.5fe  reason: invalid class name and case insensitive filesystem */
public abstract class C110445fe extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public void A02() {
        AnonymousClass033 r1;
        ClippingLayout clippingLayout;
        if (this instanceof ClippingLayout) {
            ClippingLayout clippingLayout2 = (ClippingLayout) this;
            if (!clippingLayout2.A00) {
                clippingLayout2.A00 = true;
                r1 = (AnonymousClass033) clippingLayout2.generatedComponent();
                clippingLayout = clippingLayout2;
            } else {
                return;
            }
        } else if (this instanceof EmojiSearchKeyboardContainer) {
            EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = (EmojiSearchKeyboardContainer) this;
            if (!emojiSearchKeyboardContainer.A0G) {
                emojiSearchKeyboardContainer.A0G = true;
                C27691Xc r12 = (C27691Xc) ((AnonymousClass033) emojiSearchKeyboardContainer.generatedComponent());
                emojiSearchKeyboardContainer.A00 = C27691Xc.A0Z(r12);
                AnonymousClass10E r2 = r12.A10;
                emojiSearchKeyboardContainer.A0A = AnonymousClass10E.A8r(r2);
                emojiSearchKeyboardContainer.A07 = AnonymousClass3Ma.A0f(r2);
                AnonymousClass10G r13 = r2.A00;
                emojiSearchKeyboardContainer.A0C = C108965cb.A0i(r13);
                emojiSearchKeyboardContainer.A0D = C108965cb.A0j(r13);
                emojiSearchKeyboardContainer.A0E = C000200d.A00(r13.ABP);
                emojiSearchKeyboardContainer.A0B = AnonymousClass3Ma.A0r(r2);
                emojiSearchKeyboardContainer.A05 = AnonymousClass10E.A6Q(r2);
                return;
            }
            return;
        } else if (!this.A01) {
            this.A01 = true;
            r1 = (AnonymousClass033) generatedComponent();
            clippingLayout = (MeasuringFrameLayout) this;
        } else {
            return;
        }
        clippingLayout.A00 = C27691Xc.A0Z((C27691Xc) r1);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public static AnonymousClass160 A00(EmojiSearchKeyboardContainer emojiSearchKeyboardContainer) {
        emojiSearchKeyboardContainer.A02();
        emojiSearchKeyboardContainer.A00 = 500;
        return (AnonymousClass160) C221618v.A01(16385);
    }
}
