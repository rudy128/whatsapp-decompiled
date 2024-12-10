package X;

import android.animation.TimeInterpolator;
import android.transition.AutoTransition;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.Visibility;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.actionfeedback.view.ActionFeedbackViewGroup;

/* renamed from: X.5Ax  reason: invalid class name */
public final class AnonymousClass5Ax extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ ActionFeedbackViewGroup this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5Ax(ActionFeedbackViewGroup actionFeedbackViewGroup) {
        super(0);
        this.this$0 = actionFeedbackViewGroup;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        TimeInterpolator accelerateInterpolator;
        AutoTransition autoTransition = new AutoTransition();
        int transitionCount = autoTransition.getTransitionCount();
        for (int i = 0; i < transitionCount; i++) {
            Transition transitionAt = autoTransition.getTransitionAt(i);
            if (transitionAt instanceof ChangeBounds) {
                transitionAt.setDuration(0);
            } else if (transitionAt instanceof Fade) {
                if (((Visibility) transitionAt).getMode() == 1) {
                    transitionAt.setDuration(125);
                    accelerateInterpolator = new DecelerateInterpolator();
                } else {
                    transitionAt.setDuration(100);
                    accelerateInterpolator = new AccelerateInterpolator();
                }
                transitionAt.setInterpolator(accelerateInterpolator);
            }
        }
        return autoTransition;
    }
}
