package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.biz.order.view.fragment.OrderDetailFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8iH  reason: invalid class name and case insensitive filesystem */
public class C168098iH extends AnonymousClass8IS {
    public final ImageView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextEmojiLabel A04;
    public final TextEmojiLabel A05;
    public final C26911Ty A06;
    public final C20114A7x A07;
    public final C20005A2v A08;
    public final C19973A1i A09;
    public final C189919k4 A0A;
    public final C18000vb A0B;
    public final UserJid A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C168098iH(View view, C26911Ty r4, B79 b79, C20114A7x a7x, C20005A2v a2v, C19973A1i a1i, OrderDetailFragment orderDetailFragment, C189919k4 r10, C18000vb r11, UserJid userJid) {
        super(view);
        C18070vi.A0d(view, 1);
        this.A0B = r11;
        this.A09 = a1i;
        this.A06 = r4;
        this.A0A = r10;
        this.A08 = a2v;
        this.A07 = a7x;
        this.A02 = AnonymousClass3MW.A0J(view, 2131428873);
        this.A03 = AnonymousClass3MW.A0J(view, 2131428870);
        this.A01 = AnonymousClass3MW.A0J(view, 2131428867);
        this.A00 = AnonymousClass3MW.A0G(view, 2131428871);
        this.A04 = AnonymousClass3MX.A0V(view, 2131428874);
        this.A05 = AnonymousClass3MX.A0V(view, 2131428875);
        view.setOnClickListener(new AnonymousClass48j(b79, orderDetailFragment, this, 2));
        this.A0C = userJid;
    }
}
