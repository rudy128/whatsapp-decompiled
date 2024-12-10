package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.4HL  reason: invalid class name */
public abstract class AnonymousClass4HL {
    public static final void A00(Context context, AnonymousClass3uP r8) {
        boolean A15 = C18070vi.A15(r8, context);
        View findViewById = r8.findViewById(2131435573);
        TextView A0E = C17880vN.A0E(r8, 2131432676);
        View findViewById2 = r8.findViewById(2131429091);
        r8.setRecipientNameVisibility(A15);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131169544);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131169545);
        r8.setPadding(dimensionPixelSize, A15 ? 1 : 0, dimensionPixelSize, A15);
        C72473Md.A11(findViewById, dimensionPixelSize2);
        A0E.setTextAppearance(context, 2132084414);
        AnonymousClass3MX.A1C(context, A0E, 2131103152);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(2131169469);
        AnonymousClass3MX.A1F(findViewById2, dimensionPixelSize3);
        findViewById2.getLayoutParams().width = dimensionPixelSize3;
    }
}
