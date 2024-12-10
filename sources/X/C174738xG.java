package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8xG  reason: invalid class name and case insensitive filesystem */
public final class C174738xG extends C175028xj {
    public final View A00;
    public final TextEmojiLabel A01;
    public final View A02;

    public C174738xG(View view) {
        super(view);
        this.A02 = view;
        TextEmojiLabel A0c = C72453Mb.A0c(view, 2131427777);
        this.A01 = A0c;
        this.A00 = C18070vi.A05(view, 2131432800);
        Context context = view.getContext();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("# ");
        C17880vN.A1A(context, A10, 2131887019);
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(A10.toString());
        C72813Np.A04(A0c.getPaint(), AnonymousClass4aX.A08(AnonymousClass3MX.A06(context, 2131232133), AnonymousClass3Ma.A00(context, 2130971957, 2131103410)), A09, -1, 0, 1);
        A0c.setText(A09);
    }
}
