package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

/* renamed from: X.4ZE  reason: invalid class name */
public final class AnonymousClass4ZE {
    public final AnonymousClass4VN A00;

    public AnonymousClass4ZE(AnonymousClass4VN r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final void A00(Context context, Drawable drawable, TextEmojiLabel textEmojiLabel, AnonymousClass5XK r8, C61762qD r9) {
        r9.A04 = true;
        textEmojiLabel.setSelected(true);
        AnonymousClass3uP r4 = ((C94644kx) r8).A00;
        AnonymousClass206 fMessage = r4.getFMessage();
        C108885cS A02 = C88404Zo.A02(r4);
        if (A02 != null) {
            A02.CHZ(fMessage, r9);
            if (((AnonymousClass70P) r4.A2J.get()).A06(fMessage) && r9.A01.equals("DID_NOT_REQUEST_CODE")) {
                r4.A1X.CGF(new C146497Pi(r4, fMessage, 42));
            }
            r4.A1X.CGF(new C70773Cl(r4, fMessage, r9, 49));
            ((C190319kk) r4.A1w.get()).A00(fMessage, "quick-reply", String.valueOf(r9.A06));
        } else {
            Log.e("ConversationRow/onQuickReplyButtonClicked/error: not click in Conversation");
        }
        C27831Xu.A0C(drawable, AnonymousClass3Ma.A00(context, 2130969369, 2131100372));
    }

    public static final void A01(Context context, Drawable drawable, TextEmojiLabel textEmojiLabel, C61762qD r8) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131169001);
        textEmojiLabel.setText(C72813Np.A01(textEmojiLabel.getPaint(), drawable, r8.A09, dimensionPixelSize, context.getResources().getInteger(2131492940)));
    }
}
