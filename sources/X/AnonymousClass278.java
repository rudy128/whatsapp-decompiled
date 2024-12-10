package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.278  reason: invalid class name */
public class AnonymousClass278 extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass11S A00;
    public C32191gn A01;
    public AnonymousClass031 A02;
    public boolean A03;
    public final TextEmojiLabel A04;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = new AnonymousClass031(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass278(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E r1 = ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10;
            this.A00 = AnonymousClass10E.A17(r1);
            this.A01 = (C32191gn) r1.AAo.get();
        }
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View.inflate(getContext(), 2131624604, this);
        this.A04 = (TextEmojiLabel) AnonymousClass1HF.A06(this, 2131429222);
    }
}
