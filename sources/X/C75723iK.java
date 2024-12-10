package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: X.3iK  reason: invalid class name and case insensitive filesystem */
public abstract class C75723iK extends C91944gV {
    public final FrameLayout A00;

    public int A00(AnonymousClass5YR r3, boolean z) {
        if (C18070vi.A18(((C21319Ai4) r3).A0G, "whatsapp_banner_privacy_tip")) {
            return C19740yt.A00(this.A00.getContext(), 2131102256);
        }
        return super.A00(r3, z);
    }

    public void A02(C195759tr r6, C85634Od r7, AnonymousClass5YR r8) {
        C18070vi.A0d(r7, 0);
        super.A02(r6, r7, r8);
        if (r8 != null) {
            r7.A05.setVisibility(8);
            r7.A00.setBackgroundResource(2131231085);
            r7.A01.getLayoutParams().height = -2;
            if (C18070vi.A18(((C21319Ai4) r8).A0G, "whatsapp_banner_privacy_tip")) {
                if (!this.A01) {
                    r7.A02.setImageResource(2131233343);
                }
                ImageView imageView = r7.A02;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                FrameLayout frameLayout = this.A00;
                layoutParams.height = frameLayout.getResources().getDimensionPixelSize(2131168312);
                imageView.getLayoutParams().width = AnonymousClass3Ma.A02(frameLayout, 2131168312);
                imageView.setImageTintList(C19740yt.A03(imageView.getContext(), 2131101221));
            }
        }
    }

    public C75723iK(FrameLayout frameLayout, C36621oC r4, C189349iw r5, C18030ve r6, AnonymousClass10I r7) {
        super(frameLayout, r4, r5, r6, r7);
        this.A00 = frameLayout;
        r4.A00.A0N(3712);
    }
}
