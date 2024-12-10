package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.bot.prompts.BonsaiPromptsViewModel;
import java.util.List;

/* renamed from: X.3WR  reason: invalid class name */
public final class AnonymousClass3WR extends C38391rD {
    public final BonsaiPromptsViewModel A00;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        View inflate = AnonymousClass3MY.A0B(viewGroup).inflate(2131624301, viewGroup, false);
        C18070vi.A0z(inflate, "null cannot be cast to non-null type com.whatsapp.TextEmojiLabel");
        return new C74083Yl((TextEmojiLabel) inflate, this);
    }

    public int A0Q() {
        return AnonymousClass3MW.A10(this.A00.A05).size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r8, int i) {
        String A0x;
        C74083Yl r82 = (C74083Yl) r8;
        C18070vi.A0d(r82, 0);
        AnonymousClass24Z r6 = (AnonymousClass24Z) AnonymousClass3MW.A10(this.A00.A05).get(i);
        String str = r6.A00;
        if (str.length() == 0) {
            A0x = r6.A01;
        } else {
            A0x = AnonymousClass3MW.A0x(r82.A0H.getResources(), r6.A01, AnonymousClass3MX.A1b(str, 0), 1, 2131887319);
            C18070vi.A0b(A0x);
        }
        C90104dX r2 = new C90104dX(this, i, 7);
        C18070vi.A0d(A0x, 0);
        TextEmojiLabel textEmojiLabel = r82.A00;
        textEmojiLabel.A0S(A0x, (List) null, 0, false);
        textEmojiLabel.setOnClickListener(r2);
    }

    public AnonymousClass3WR(AnonymousClass1F9 r4, BonsaiPromptsViewModel bonsaiPromptsViewModel) {
        this.A00 = bonsaiPromptsViewModel;
        AnonymousClass3MY.A1K(r4, bonsaiPromptsViewModel.A05, new C105015Qj(this), 16);
    }
}
