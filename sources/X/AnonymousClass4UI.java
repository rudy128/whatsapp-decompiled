package X;

import android.app.Activity;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.gifsearch.GifSearchContainer;

/* renamed from: X.4UI  reason: invalid class name */
public class AnonymousClass4UI {
    public C107395Zn A00;
    public final C74873d3 A01;
    public final EmojiSearchContainer A02;

    public void A00(boolean z) {
        int visibility;
        GifSearchContainer gifSearchContainer;
        if (this instanceof C80753xv) {
            C80753xv r2 = (C80753xv) this;
            C28931bI r1 = r2.A04;
            if (r1 != null) {
                visibility = r1.A01();
            } else {
                GifSearchContainer gifSearchContainer2 = r2.A02;
                C17960vV.A05(gifSearchContainer2);
                visibility = gifSearchContainer2.getVisibility();
            }
            if (visibility == 0) {
                if (r1 == null || (gifSearchContainer = (GifSearchContainer) r1.A02()) == null) {
                    gifSearchContainer = r2.A02;
                    C17960vV.A05(gifSearchContainer);
                    C18070vi.A0X(gifSearchContainer);
                }
                gifSearchContainer.setVisibility(8);
                C140126zz r12 = gifSearchContainer.A0G;
                if (r12 != null) {
                    C83734Gl.A00(gifSearchContainer.getWamRuntime(), r12);
                }
                gifSearchContainer.A0G = null;
            } else {
                EmojiSearchContainer emojiSearchContainer = r2.A02;
                if (emojiSearchContainer.getVisibility() == 0) {
                    emojiSearchContainer.setVisibility(8);
                    emojiSearchContainer.A04.A0H();
                    emojiSearchContainer.A0A = null;
                }
            }
            C74873d3 r13 = r2.A01;
            C18070vi.A0z(r13, "null cannot be cast to non-null type com.whatsapp.gifsearch.EmojiAndGifPopupWindow");
            r13.A0B = null;
            if (z) {
                C83734Gl.A00(r2.A01, r2.A03);
                return;
            }
            return;
        }
        EmojiSearchContainer emojiSearchContainer2 = this.A02;
        if (emojiSearchContainer2.getVisibility() == 0) {
            emojiSearchContainer2.setVisibility(8);
            emojiSearchContainer2.A04.A0H();
            emojiSearchContainer2.A0A = null;
        }
        this.A01.A0B = null;
    }

    public boolean A01() {
        int visibility;
        if (!(this instanceof C80753xv)) {
            return AnonymousClass000.A1P(this.A02.getVisibility());
        }
        C80753xv r1 = (C80753xv) this;
        C28931bI r0 = r1.A04;
        if (r0 != null) {
            visibility = r0.A01();
        } else {
            GifSearchContainer gifSearchContainer = r1.A02;
            C17960vV.A05(gifSearchContainer);
            visibility = gifSearchContainer.getVisibility();
        }
        if (visibility != 0) {
            EmojiSearchContainer emojiSearchContainer = r1.A02;
            C18070vi.A0W(emojiSearchContainer);
            if (emojiSearchContainer.getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    public AnonymousClass4UI(Activity activity, C74873d3 r3, EmojiSearchContainer emojiSearchContainer) {
        this.A02 = emojiSearchContainer;
        emojiSearchContainer.setVisibility(8);
        this.A01 = r3;
        r3.A0A = new C132616nB(activity, r3, emojiSearchContainer, this);
    }

    public boolean A02() {
        if (!A01()) {
            return false;
        }
        A00(true);
        this.A02.post(new C98564rM(this, 42));
        return true;
    }
}
