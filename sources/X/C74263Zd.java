package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.whatsapp.reactions.ReactionEmojiTextView;

/* renamed from: X.3Zd  reason: invalid class name and case insensitive filesystem */
public final class C74263Zd extends C42011xT {
    public final ReactionEmojiTextView A00;
    public final /* synthetic */ C73593Wo A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74263Zd(C73593Wo r2, ReactionEmojiTextView reactionEmojiTextView) {
        super(reactionEmojiTextView);
        C18070vi.A0d(reactionEmojiTextView, 2);
        this.A01 = r2;
        this.A00 = reactionEmojiTextView;
    }

    public static final AnimatorSet A00(ReactionEmojiTextView reactionEmojiTextView) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator duration = ObjectAnimator.ofFloat(reactionEmojiTextView, "backgroundScale", C72473Md.A1a(1.0f, 0.0f)).setDuration(100);
        C18070vi.A0X(duration);
        duration.addListener(new C72493Mg(reactionEmojiTextView, 0.0f, 1));
        duration.setInterpolator(C1409073n.A00);
        animatorSet.play(duration);
        AnonymousClass3Mo.A00(animatorSet, reactionEmojiTextView, 14);
        return animatorSet;
    }
}
