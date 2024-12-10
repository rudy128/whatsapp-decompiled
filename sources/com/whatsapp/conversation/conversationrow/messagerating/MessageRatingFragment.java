package com.whatsapp.conversation.conversationrow.messagerating;

import X.AnonymousClass1BI;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4c8;
import X.AnonymousClass86E;
import X.C17880vN;
import X.C17960vV;
import X.C21456AkN;
import X.C21467AkY;
import X.C22971Dz;
import X.C72463Mc;
import X.C825048f;
import X.C825248h;
import X.C91624fz;
import X.C92204gv;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.FAQTextView;
import com.whatsapp.StarRatingBar;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public class MessageRatingFragment extends Hilt_MessageRatingFragment implements AnonymousClass86E {
    public static final int[] A05 = {2131892075, 2131892076, 2131892077, 2131892078, 2131892079};
    public AnonymousClass1KB A00;
    public AnonymousClass4c8 A01;
    public MessageRatingViewModel A02;
    public AnonymousClass1BI A03;
    public String A04;

    /* JADX WARNING: type inference failed for: r4v0, types: [com.whatsapp.conversation.conversationrow.messagerating.Hilt_MessageRatingFragment, androidx.fragment.app.Fragment, com.whatsapp.conversation.conversationrow.messagerating.MessageRatingFragment] */
    public static MessageRatingFragment A00(AnonymousClass4c8 r5, AnonymousClass206 r6) {
        ? hilt_MessageRatingFragment = new Hilt_MessageRatingFragment();
        Bundle A0D = C17880vN.A0D();
        AnonymousClass205 r2 = r6.A0v;
        A0D.putString("chat_jid", C22971Dz.A06(r2.A00));
        A0D.putString("message_id", r2.A01);
        A0D.putParcelable("entry_point", r5);
        hilt_MessageRatingFragment.A1R(A0D);
        return hilt_MessageRatingFragment;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A09 = AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131626039);
        C825048f.A00(AnonymousClass1HF.A06(A09, 2131429138), this, 26);
        ((FAQTextView) AnonymousClass1HF.A06(A09, 2131429927)).setEducationTextFromNamedArticle(new SpannableString(A1H(2131892080)), "chats", "controls-when-messaging-businesses");
        StarRatingBar starRatingBar = (StarRatingBar) AnonymousClass1HF.A06(A09, 2131434316);
        WDSButton A0q = AnonymousClass3MW.A0q(A09, 2131435879);
        WaTextView A0T = AnonymousClass3MW.A0T(A09, 2131434318);
        C825248h.A00(A0q, this, starRatingBar, 44);
        starRatingBar.A01 = new C92204gv(A0T, this, A0q);
        C91624fz.A01(A1G(), this.A02.A01, starRatingBar, 45);
        MessageRatingViewModel messageRatingViewModel = this.A02;
        messageRatingViewModel.A05.CGF(new C21467AkY(messageRatingViewModel, this.A03, this.A04, 13));
        return A09;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A02 = (MessageRatingViewModel) AnonymousClass3MW.A0N(this).A00(MessageRatingViewModel.class);
        this.A03 = C72463Mc.A0f(A15(), "chat_jid");
        String string = A15().getString("message_id");
        C17960vV.A07(string);
        this.A04 = string;
        Parcelable parcelable = A15().getParcelable("entry_point");
        C17960vV.A07(parcelable);
        AnonymousClass4c8 r4 = (AnonymousClass4c8) parcelable;
        this.A01 = r4;
        MessageRatingViewModel messageRatingViewModel = this.A02;
        messageRatingViewModel.A05.CGF(new C21456AkN(messageRatingViewModel, this.A03, r4, this.A04, 23));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        MessageRatingViewModel messageRatingViewModel = this.A02;
        AnonymousClass1BI r3 = this.A03;
        String str = this.A04;
        AnonymousClass4c8 r4 = this.A01;
        if (!messageRatingViewModel.A00) {
            messageRatingViewModel.A05.CGF(new C21456AkN(messageRatingViewModel, r3, r4, str, 24));
        }
    }
}
