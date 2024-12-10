package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.9kC  reason: invalid class name and case insensitive filesystem */
public class C189999kC {
    public final C198539yV A00;
    public final C18030ve A01;

    public C189999kC(C198539yV r1, C18030ve r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(Context context, C107905ao r13, int i) {
        Context context2 = context;
        View A08 = AnonymousClass3MX.A08(context, 2131625096);
        TextView A0J = AnonymousClass3MW.A0J(A08, 2131433770);
        ImageView A0G = AnonymousClass3MW.A0G(A08, 2131433767);
        TextEmojiLabel A0V = AnonymousClass3MX.A0V(A08, 2131431966);
        if (i == 0) {
            C198539yV.A00(context2, A0V, this.A00, context.getString(2131887045), "security-and-privacy", "how-to-select-a-location-when-looking-for-businesses-nearby");
            A0J.setText(2131894352);
        } else {
            A0J.setText(2131887138);
            A0V.setVisibility(8);
        }
        A0G.setImageResource(2131232061);
        View A06 = AnonymousClass1HF.A06(A08, 2131435879);
        View A062 = AnonymousClass1HF.A06(A08, 2131428811);
        C73203Rj A002 = AnonymousClass4a6.A00(context);
        A002.A0c(A08);
        A002.A0T(true);
        C010105w create = A002.create();
        create.setOnDismissListener(C20160A9w.A00(r13, 3));
        if (create.getWindow() != null) {
            AnonymousClass3Ma.A1H(create.getWindow(), C19740yt.A00(context, 2131102739));
        }
        C89994dM.A00(A06, r13, create, 1);
        C89994dM.A00(A062, create, r13, 2);
        create.setCanceledOnTouchOutside(false);
        create.show();
    }
}
