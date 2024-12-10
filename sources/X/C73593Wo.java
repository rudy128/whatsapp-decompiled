package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.reactions.ReactionEmojiTextView;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import java.util.List;

/* renamed from: X.3Wo  reason: invalid class name and case insensitive filesystem */
public final class C73593Wo extends C38391rD {
    public AnimatorSet A00;
    public ViewGroup A01;
    public final Context A02;
    public final C18000vb A03;
    public final C1193167q A04;
    public final C18030ve A05;
    public final ReactionsTrayViewModel A06;
    public final AnonymousClass1DC A07;
    public final AnonymousClass10I A08;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        View inflate = C72463Mc.A0K(viewGroup, 0).inflate(2131626674, viewGroup, false);
        C18070vi.A0z(inflate, "null cannot be cast to non-null type com.whatsapp.reactions.ReactionEmojiTextView");
        this.A01 = viewGroup;
        return new C74263Zd(this, (ReactionEmojiTextView) inflate);
    }

    public int A0Q() {
        return this.A06.A07.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r12, int i) {
        int i2;
        C74263Zd r122 = (C74263Zd) r12;
        C18070vi.A0d(r122, 0);
        String A0w = C17880vN.A0w(this.A06.A07, i);
        C18070vi.A0d(A0w, 0);
        boolean A1R = AnonymousClass000.A1R(i);
        C73593Wo r3 = r122.A01;
        ReactionEmojiTextView reactionEmojiTextView = r122.A00;
        reactionEmojiTextView.A0S(A0w, (List) null, 0, false);
        reactionEmojiTextView.setSelected(A0w.equals(((C86514Ry) r3.A06.A0H.A06()).A00));
        int i3 = 2131886203;
        if (reactionEmojiTextView.isSelected()) {
            i3 = 2131886204;
        }
        AnonymousClass1Y5.A02(reactionEmojiTextView, i3);
        ViewGroup.MarginLayoutParams A0P = C72463Mc.A0P(reactionEmojiTextView);
        if (A1R) {
            i2 = r3.A02.getResources().getDimensionPixelSize(2131168421);
        } else {
            i2 = 0;
        }
        C27641Ww.A06(reactionEmojiTextView, r3.A03, i2, A0P.topMargin, A0P.getMarginEnd(), A0P.bottomMargin);
        C825248h.A00(reactionEmojiTextView, r122, r3, 43);
    }

    public C73593Wo(Context context, C18000vb r2, C1193167q r3, C18030ve r4, ReactionsTrayViewModel reactionsTrayViewModel, AnonymousClass1DC r6, AnonymousClass10I r7) {
        this.A02 = context;
        this.A06 = reactionsTrayViewModel;
        this.A07 = r6;
        this.A05 = r4;
        this.A04 = r3;
        this.A08 = r7;
        this.A03 = r2;
    }
}
