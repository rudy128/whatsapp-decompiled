package X;

import android.text.Html;
import android.view.View;
import com.whatsapp.TextEmojiLabel;

public class ALZ implements C28582E8t {
    public View A00;
    public final C22654BId A01;
    public final C61952qY A02;
    public final AnonymousClass18O A03;

    public void Bcv() {
        C72453Mb.A1B(this.A00);
    }

    public boolean CLk() {
        return this.A02.A01(this.A01.getContext(), this.A03);
    }

    public ALZ(C22654BId bId, AnonymousClass18O r2, C61952qY r3) {
        this.A03 = r2;
        this.A01 = bId;
        this.A02 = r3;
    }

    public void CQJ() {
        if (CLk() && this.A00 == null) {
            C22654BId bId = this.A01;
            View A09 = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(bId), bId, 2131625017);
            this.A00 = A09;
            bId.addView(A09);
        }
        View view = this.A00;
        if (view == null) {
            C22654BId bId2 = this.A01;
            view = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(bId2), bId2, 2131625017);
            this.A00 = view;
        }
        TextEmojiLabel A0V = AnonymousClass3MX.A0V(view, 2131435503);
        C22654BId bId3 = this.A01;
        A0V.A0R(Html.fromHtml(bId3.getContext().getString(2131896234)));
        bId3.setBackgroundResource(AnonymousClass1YL.A00(bId3.getContext(), 2130969018, 2131100118));
        AFU.A00(bId3, this, 20);
        AFU.A00(AnonymousClass8BS.A06(view), this, 21);
        view.setVisibility(0);
        C61952qY.A00(this.A02, 1);
    }
}
