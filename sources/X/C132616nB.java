package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.InterceptingEditText;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;

/* renamed from: X.6nB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C132616nB {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C74873d3 A01;
    public final /* synthetic */ EmojiSearchContainer A02;
    public final /* synthetic */ AnonymousClass4UI A03;

    public final void A00(EmojiSearchProvider emojiSearchProvider) {
        AnonymousClass4UI r3 = this.A03;
        C74873d3 r1 = this.A01;
        EmojiSearchContainer emojiSearchContainer = this.A02;
        Activity activity = this.A00;
        r1.A08(r1.A0M);
        r1.A0B = r3;
        C95934n2 r0 = new C95934n2(r3, 1);
        emojiSearchContainer.A00 = activity;
        emojiSearchContainer.A0A = emojiSearchProvider;
        emojiSearchContainer.A0B = r0;
        if (!emojiSearchContainer.A0H) {
            emojiSearchContainer.A0H = true;
            activity.getLayoutInflater().inflate(2131625191, emojiSearchContainer, true);
            emojiSearchContainer.A02 = emojiSearchContainer.findViewById(2131433163);
            emojiSearchContainer.A03 = AnonymousClass3MX.A0Q(emojiSearchContainer, 2131434954);
            emojiSearchContainer.A03.A0r(new C112585li(emojiSearchContainer, C72463Mc.A06(emojiSearchContainer), 2));
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity);
            linearLayoutManager.A1Z(0);
            emojiSearchContainer.A03.setLayoutManager(linearLayoutManager);
            emojiSearchContainer.A01 = emojiSearchContainer.findViewById(2131434187);
            InterceptingEditText interceptingEditText = (InterceptingEditText) emojiSearchContainer.findViewById(2131434853);
            emojiSearchContainer.A04 = interceptingEditText;
            interceptingEditText.setHint(2131889729);
            View findViewById = emojiSearchContainer.findViewById(2131429122);
            C825148g.A00(findViewById, emojiSearchContainer, 0);
            C1422478s.A00(emojiSearchContainer, 2);
            InterceptingEditText interceptingEditText2 = emojiSearchContainer.A04;
            interceptingEditText2.A00 = new C142997Bp(r3, 0);
            interceptingEditText2.addTextChangedListener(new AnonymousClass6Ii(findViewById, emojiSearchContainer));
            C825248h.A00(emojiSearchContainer.findViewById(2131428012), emojiSearchContainer, r3, 49);
            AnonymousClass3NL.A01(emojiSearchContainer.getContext(), AnonymousClass3MW.A0H(emojiSearchContainer, 2131428012), emojiSearchContainer.A05, 2131231672);
        }
        emojiSearchContainer.setVisibility(0);
        emojiSearchContainer.A02.setVisibility(0);
        emojiSearchContainer.A01.setVisibility(8);
        C117035z6 r12 = new C117035z6(emojiSearchContainer.A00, emojiSearchContainer.A05, emojiSearchContainer.A08, new AnonymousClass7GF(emojiSearchContainer, 0), emojiSearchContainer.A0D, emojiSearchContainer, emojiSearchContainer.getResources().getDimensionPixelSize(2131166635), 0);
        emojiSearchContainer.A09 = r12;
        emojiSearchContainer.A03.setAdapter(r12);
        emojiSearchContainer.A0G = "";
        EmojiSearchContainer.A00(emojiSearchContainer, "");
        emojiSearchContainer.A04.setText("");
        emojiSearchContainer.A04.requestFocus();
        emojiSearchContainer.A04.A0I(false);
        emojiSearchContainer.A04.performAccessibilityAction(64, (Bundle) null);
    }

    public /* synthetic */ C132616nB(Activity activity, C74873d3 r2, EmojiSearchContainer emojiSearchContainer, AnonymousClass4UI r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = emojiSearchContainer;
        this.A00 = activity;
    }
}
