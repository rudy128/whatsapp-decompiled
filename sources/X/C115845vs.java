package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeBot;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeBotImpl;

/* renamed from: X.5vs  reason: invalid class name and case insensitive filesystem */
public final class C115845vs extends C115885vz {
    public C143307Cw A00;
    public final C136486tt A01;
    public final C1598486c A02;
    public final C18100vl A03 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C148547hc(this));
    public final C57642jP A04;

    public void A0C(C143307Cw r19) {
        String str;
        int i;
        boolean z;
        C20125A8k A09;
        AiHomeBotImpl.Persona BX1;
        C143307Cw r3 = r19;
        C18070vi.A0d(r3, 0);
        this.A00 = r3;
        AiHomeBot aiHomeBot = r3.A00;
        if (aiHomeBot != null) {
            this.A01.A02(aiHomeBot, AnonymousClass3MW.A17(this.A03));
        }
        TextEmojiLabel textEmojiLabel = this.A03;
        if (textEmojiLabel != null) {
            textEmojiLabel.setText(C1401970i.A00(r3));
            C43421zm.A04(textEmojiLabel);
        }
        if (aiHomeBot == null || (BX1 = aiHomeBot.BX1()) == null || (str = BX1.A0F("tagline")) == null) {
            str = "";
        }
        TextView textView = this.A01;
        if (textView != null) {
            int i2 = 0;
            if (str.length() <= 0) {
                i2 = 8;
            }
            textView.setVisibility(i2);
        }
        if (str.length() > 0 && textView != null) {
            textView.setText(str);
        }
        TextEmojiLabel textEmojiLabel2 = this.A02;
        if (textEmojiLabel2 != null) {
            C57642jP r6 = this.A04;
            Context A042 = AnonymousClass3MY.A04(this.A0H);
            String str2 = null;
            if (!(aiHomeBot == null || (A09 = ((C20125A8k) aiHomeBot).A09(AiHomeBotImpl.Creator.class, "creator")) == null)) {
                str2 = A09.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            }
            String str3 = null;
            if (aiHomeBot != null) {
                C20125A8k a8k = (C20125A8k) aiHomeBot;
                C20125A8k A092 = a8k.A09(AiHomeBotImpl.Creator.class, "creator");
                if (A092 != null) {
                    str3 = A092.A0F("profile_uri");
                }
                i = a8k.A00.optInt("social_signal_message_count");
                z = a8k.A0G("is_meta_created");
            } else {
                i = 0;
                z = false;
            }
            r6.A00(A042, textEmojiLabel2, (Integer) null, str2, str3, i, false, false, true, z, false);
        }
        TextView textView2 = this.A00;
        if (textView2 != null) {
            textView2.setText(r3.A03);
        }
        AnonymousClass78Q.A00(this.A0H, this, r3, 42);
    }

    public C115845vs(View view, C57642jP r4, C136486tt r5, C1598486c r6) {
        super(view);
        this.A01 = r5;
        this.A02 = r6;
        this.A04 = r4;
    }
}
