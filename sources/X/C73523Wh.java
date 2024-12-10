package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.3Wh  reason: invalid class name and case insensitive filesystem */
public final class C73523Wh extends C38391rD {
    public boolean A00;
    public final List A01 = AnonymousClass000.A13();
    public final C18090vk A02;
    public final C22821Di A03;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new C74203Yx(AnonymousClass3MY.A0E(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131626042), this);
    }

    public int A0Q() {
        return this.A01.size() + (this.A00 ? 1 : 0);
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r6, int i) {
        View view;
        View.OnClickListener r2;
        C74203Yx r62 = (C74203Yx) r6;
        C18070vi.A0d(r62, 0);
        List list = this.A01;
        if (i < list.size()) {
            C87044Ub r4 = (C87044Ub) list.get(i);
            C18070vi.A0d(r4, 0);
            TextEmojiLabel textEmojiLabel = r62.A00;
            textEmojiLabel.setText(r4.A01);
            Drawable drawable = r4.A00;
            textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
            int i2 = 2;
            if (drawable == null) {
                i2 = 3;
            }
            textEmojiLabel.setLines(i2);
            view = r62.A0H;
            r2 = new C90014dO(r62.A01, r4, 6);
        } else {
            TextEmojiLabel textEmojiLabel2 = r62.A00;
            textEmojiLabel2.setText(2131899186);
            textEmojiLabel2.setCompoundDrawablesWithIntrinsicBounds(0, 2131232119, 0, 0);
            textEmojiLabel2.setLines(2);
            view = r62.A0H;
            r2 = new C89924dF(r62.A01, 3);
        }
        view.setOnClickListener(r2);
    }

    public C73523Wh(C18090vk r2, C22821Di r3) {
        this.A02 = r2;
        this.A03 = r3;
    }
}
