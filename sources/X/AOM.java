package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;

public final class AOM implements B7T {
    public final ImageView A00;
    public final C18100vl A01;
    public final TextEmojiLabel A02;
    public final C42141xh A03;
    public final C37451pZ A04;
    public final C18000vb A05;
    public final AnonymousClass12L A06;
    public final C33971jg A07;

    public void Bmb(B7U b7u) {
        AnonymousClass1E7 r4 = ((AOO) b7u).A00;
        ImageView imageView = this.A00;
        AnonymousClass1Xr.A04(imageView, C22971Dz.A06(r4.A0J));
        C825248h.A00(imageView, r4, this, 11);
        this.A04.A07(imageView, r4);
        C42141xh r3 = this.A03;
        r3.A05(r4);
        String A0G = this.A05.A0G(AnonymousClass17K.A02(r4));
        if (C22971Dz.A0S(r4.A0J)) {
            TextEmojiLabel textEmojiLabel = this.A02;
            textEmojiLabel.setVisibility(0);
            C33971jg r2 = this.A07;
            C22941Dw r0 = UserJid.Companion;
            UserJid A012 = C22941Dw.A01(r4.A0J);
            C18070vi.A0z(A012, "null cannot be cast to non-null type com.whatsapp.jid.InteropUserJid");
            textEmojiLabel.setText(r2.A01((AnonymousClass1ED) A012));
        } else if (C18070vi.A18(r3.A01.getText().toString(), A0G) || C42761yh.A00(r4, this.A06)) {
            TextEmojiLabel textEmojiLabel2 = this.A02;
            textEmojiLabel2.setVisibility(8);
            AnonymousClass3MW.A1S(textEmojiLabel2);
        } else {
            TextEmojiLabel textEmojiLabel3 = this.A02;
            textEmojiLabel3.setVisibility(0);
            textEmojiLabel3.setText(A0G);
        }
    }

    public AOM(View view, C72043Kk r4, C37451pZ r5, C18000vb r6, AnonymousClass12L r7, C33971jg r8) {
        C18070vi.A0p(r5, r4, r7);
        C72473Md.A1J(r8, r6);
        this.A04 = r5;
        this.A06 = r7;
        this.A07 = r8;
        this.A05 = r6;
        this.A01 = C21528Alb.A00(view, 12);
        this.A00 = C108975cc.A0B(view, 2131429479);
        C42141xh A012 = C42141xh.A01(view, r4, 2131429476);
        C43421zm.A04(A012.A01);
        this.A03 = A012;
        this.A02 = (TextEmojiLabel) AnonymousClass3MX.A0C(view, 2131429480);
    }
}
