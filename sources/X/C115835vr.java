package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeBot;

/* renamed from: X.5vr  reason: invalid class name and case insensitive filesystem */
public final class C115835vr extends C115885vz {
    public C143287Cu A00;
    public final C136486tt A01;
    public final C1598486c A02;
    public final C18100vl A03 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C148567he(this));

    public void A0C(C143287Cu r9) {
        C18070vi.A0d(r9, 0);
        this.A00 = r9;
        C136486tt r1 = this.A01;
        AiHomeBot aiHomeBot = r9.A00;
        r1.A02(aiHomeBot, AnonymousClass3MW.A17(this.A03));
        C143307Cw r2 = new C143307Cw(aiHomeBot, r9.A01, (String) null, r9.A03, 4);
        TextEmojiLabel textEmojiLabel = this.A03;
        if (textEmojiLabel != null) {
            textEmojiLabel.setText(C1401970i.A00(r2));
            C43421zm.A04(textEmojiLabel);
        }
        TextView textView = this.A01;
        if (textView != null) {
            textView.setText(r9.A02);
        }
        AnonymousClass78Q.A00(this.A0H, this, r2, 43);
    }

    public C115835vr(View view, C136486tt r4, C1598486c r5) {
        super(view);
        this.A01 = r4;
        this.A02 = r5;
    }
}
