package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.CircleWaImageView;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8xW  reason: invalid class name and case insensitive filesystem */
public class C174898xW extends C175028xj {
    public final CircleWaImageView A00;
    public final TextEmojiLabel A01;
    public final C18030ve A02;
    public final C183269Xp A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174898xW(View view, C18030ve r3, C183269Xp r4) {
        super(view);
        C18070vi.A0d(view, 1);
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = AnonymousClass3MX.A0V(view, 2131428554);
        this.A00 = (CircleWaImageView) AnonymousClass1HF.A06(view, 2131428491);
    }

    public void A0D(C174098wE r6) {
        TextEmojiLabel textEmojiLabel = this.A01;
        AF0 af0 = r6.A00;
        textEmojiLabel.setText(af0.A0I);
        if (af0.A08 == 2) {
            textEmojiLabel.A0O(C196929vs.A01(this.A02), 2131167222);
        } else {
            textEmojiLabel.A0N();
        }
        String str = af0.A0G;
        if (!TextUtils.isEmpty(str)) {
            C183269Xp r3 = this.A03;
            CircleWaImageView circleWaImageView = this.A00;
            Drawable A002 = C24261Jm.A00(circleWaImageView.getContext(), 2131231047);
            r3.A00.A01(A002, A002, circleWaImageView, str);
        } else {
            this.A00.setImageResource(2131231047);
        }
        AnonymousClass3MY.A1E(this.A0H, this, r6, 15);
    }
}
