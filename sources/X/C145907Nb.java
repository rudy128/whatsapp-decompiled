package X;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBanner;
import com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment;
import com.whatsapp.expressionstray.expression.emoji.view.EmojiImageView;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.7Nb  reason: invalid class name and case insensitive filesystem */
public class C145907Nb implements C38531rR {
    public final int A00;
    public final Object A01;

    public C145907Nb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C28931bI r1, Object obj, int i) {
        r1.A07(new C145907Nb(obj, i));
    }

    public final void Bvu(View view) {
        ViewParent viewParent;
        switch (this.A00) {
            case 0:
                C115065tL.A00(view, (C115065tL) this.A01);
                return;
            case 1:
                AnonymousClass741 r4 = (AnonymousClass741) this.A01;
                C18070vi.A0d(r4, 0);
                View view2 = r4.A0F;
                WDSButton A0r = AnonymousClass3MW.A0r(view2, 2131437103);
                AnonymousClass3MX.A1D(A0r.getResources(), A0r, 2131895309);
                r4.A09 = A0r;
                Context A04 = AnonymousClass3MY.A04(view2);
                WDSButton wDSButton = r4.A09;
                r4.A07 = new C1407172r(A04, wDSButton);
                if (wDSButton != null) {
                    viewParent = wDSButton.getParent();
                } else {
                    viewParent = null;
                }
                C18070vi.A0z(viewParent, "null cannot be cast to non-null type android.view.View");
                r4.A03 = (View) viewParent;
                WDSButton wDSButton2 = r4.A09;
                if (wDSButton2 != null) {
                    C89884dB.A00(wDSButton2, r4, 4);
                    return;
                }
                return;
            case 2:
                AnonymousClass3Ma.A1B(view, this.A01, 43);
                return;
            case 3:
                ((EmojiExpressionsFragment) this.A01).A0D = (EmojiImageView) AnonymousClass1HF.A06(view, 2131430323);
                return;
            case 4:
                Context context = (Context) this.A01;
                CircularProgressBar circularProgressBar = (CircularProgressBar) view;
                if (circularProgressBar != null) {
                    circularProgressBar.setMax(100);
                    circularProgressBar.A0C = C19740yt.A00(context, AnonymousClass4Z9.A00(circularProgressBar.getContext(), 2130970487));
                    circularProgressBar.A0B = C19740yt.A00(context, 2131100128);
                    return;
                }
                return;
            case 5:
                ImageView imageView = (ImageView) view;
                List list = C42011xT.A0I;
                C27641Ww.A03(imageView, AnonymousClass000.A0Y(((C42011xT) this.A01).A0H).getDimensionPixelSize(2131166255), C72453Mb.A1Z(imageView) ? 1 : 0);
                imageView.setImageResource(2131232145);
                return;
            default:
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A01;
                ((VoipInCallNotifBanner) view).A02(voipActivityV2, voipActivityV2.A0p);
                return;
        }
    }
}
