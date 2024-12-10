package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3Q0  reason: invalid class name */
public final class AnonymousClass3Q0 extends FrameLayout implements AnonymousClass009, C108415bf {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public TextEmojiLabel A0E;
    public AnonymousClass11C A0F;
    public C18030ve A0G;
    public AnonymousClass1DC A0H;
    public AnonymousClass031 A0I;
    public boolean A0J;
    public C108565bu A0K;

    public int getType() {
        return 0;
    }

    public void Bd0() {
        this.A02.setVisibility(8);
    }

    public void CFG(AnonymousClass4PI r7) {
        int i;
        int i2;
        int i3;
        this.A02.setVisibility(0);
        this.A06.setVisibility(r7.A0B);
        View view = this.A05;
        int i4 = r7.A0A;
        view.setVisibility(i4);
        View view2 = this.A01;
        int i5 = r7.A02;
        view2.setVisibility(i5);
        this.A00.setVisibility(r7.A00);
        this.A03.setVisibility(r7.A03);
        this.A04.setVisibility(r7.A04);
        TextEmojiLabel textEmojiLabel = this.A0E;
        int i6 = r7.A06;
        textEmojiLabel.setVisibility(i6);
        if (i4 == 0 && (i3 = r7.A09) != -1) {
            this.A0C.setText(i3);
            AnonymousClass3MY.A0w(getContext(), this.A0C, r7.A08);
        }
        if (i5 == 0 && (i2 = r7.A01) != -1) {
            this.A08.setText(i2);
        }
        if (i6 == 0 && (i = r7.A05) != -1) {
            AnonymousClass3Ma.A1L(this.A0G, this.A0E);
            AnonymousClass3Ma.A1K(this.A0E, this.A0F);
            this.A0E.setText(this.A0K.BFg(getContext(), AnonymousClass3Ma.A11(this, i)));
        }
        int i7 = r7.A07;
        if (i7 != -1) {
            this.A0B.setText(i7);
            AnonymousClass3MY.A0w(getContext(), this.A0B, i7);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0I;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0I = r0;
        }
        return r0.generatedComponent();
    }

    public boolean isVisible() {
        return AnonymousClass000.A1P(this.A02.getVisibility());
    }

    public void setup(C108565bu r3) {
        this.A0K = r3;
        C90014dO.A00(this.A06, this, r3, 3);
        C90014dO.A00(this.A01, this, r3, 4);
        C89914dE.A00(this.A00, r3, 45);
        C89914dE.A00(this.A05, r3, 46);
        C89914dE.A00(this.A03, this, 47);
        C90014dO.A00(this.A04, this, r3, 5);
        C43421zm.A04(this.A0D);
        C43421zm.A04(this.A0C);
        C43421zm.A04(this.A08);
        C43421zm.A04(this.A07);
        C43421zm.A04(this.A0A);
    }
}
