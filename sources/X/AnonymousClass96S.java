package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.96S  reason: invalid class name */
public class AnonymousClass96S extends AnonymousClass8DH {
    public AnonymousClass11C A00;
    public C18030ve A01;
    public C36401np A02;
    public final ImageButton A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextEmojiLabel A06;
    public final WDSButton A07;
    public final WDSButton A08;

    public AnonymousClass96S(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A00 = AnonymousClass3Ma.A0a(A0O);
            this.A02 = AnonymousClass3MY.A0e(A0O.A00);
            this.A01 = AnonymousClass10E.A8r(A0O);
        }
        View A0A = AnonymousClass3MX.A0A(LayoutInflater.from(context), this, getLayoutRes());
        this.A05 = C17880vN.A0E(A0A, 2131433248);
        this.A03 = (ImageButton) AnonymousClass1HF.A06(A0A, 2131433234);
        this.A04 = AnonymousClass3MW.A0G(A0A, 2131433240);
        this.A07 = AnonymousClass3MW.A0r(A0A, 2131433237);
        this.A08 = AnonymousClass3MW.A0r(A0A, 2131433238);
        this.A06 = AnonymousClass3MX.A0W(A0A, 2131433239);
    }

    public int getLayoutRes() {
        return 2131626386;
    }
}
