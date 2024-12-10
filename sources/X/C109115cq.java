package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.ReactionsBubbleLayout;

/* renamed from: X.5cq  reason: invalid class name and case insensitive filesystem */
public class C109115cq extends AnimatorListenerAdapter {
    public final /* synthetic */ TextEmojiLabel A00;
    public final /* synthetic */ ReactionsBubbleLayout A01;
    public final /* synthetic */ String A02;

    public C109115cq(TextEmojiLabel textEmojiLabel, ReactionsBubbleLayout reactionsBubbleLayout, String str) {
        this.A01 = reactionsBubbleLayout;
        this.A00 = textEmojiLabel;
        this.A02 = str;
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.A0B = false;
    }

    public void onAnimationStart(Animator animator) {
        TextEmojiLabel textEmojiLabel = this.A00;
        textEmojiLabel.A0R(this.A02);
        textEmojiLabel.setVisibility(0);
        textEmojiLabel.setScaleX(0.0f);
        textEmojiLabel.setScaleY(0.0f);
    }
}
