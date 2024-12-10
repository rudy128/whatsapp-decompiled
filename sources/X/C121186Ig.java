package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.GridLayout;
import com.whatsapp.status.playback.MessageReplyActivity;
import java.util.ArrayList;

/* renamed from: X.6Ig  reason: invalid class name and case insensitive filesystem */
public class C121186Ig extends C89564cf {
    public final /* synthetic */ AnonymousClass1E7 A00;
    public final /* synthetic */ MessageReplyActivity A01;
    public final /* synthetic */ boolean A02;

    public static AnimationSet A00(boolean z, boolean z2) {
        AlphaAnimation alphaAnimation;
        ScaleAnimation scaleAnimation;
        AnimationSet animationSet = new AnimationSet(true);
        if (!z2) {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        }
        alphaAnimation.setDuration(100);
        animationSet.addAnimation(alphaAnimation);
        if (z2) {
            scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 1.0f, 1.0f, 1, C108975cc.A01(z), 1, 0.5f);
        } else {
            scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 1.0f, 1, C108975cc.A01(z ? 1 : 0), 1, 0.5f);
        }
        scaleAnimation.setDuration(100);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setDuration(100);
        return animationSet;
    }

    public C121186Ig(AnonymousClass1E7 r1, MessageReplyActivity messageReplyActivity, boolean z) {
        this.A01 = messageReplyActivity;
        this.A00 = r1;
        this.A02 = z;
    }

    public void afterTextChanged(Editable editable) {
        GridLayout gridLayout;
        Editable editable2 = editable;
        String obj = editable2.toString();
        boolean isEmpty = TextUtils.isEmpty(obj);
        MessageReplyActivity messageReplyActivity = this.A01;
        C33251iW r1 = messageReplyActivity.A0F;
        AnonymousClass1BI A002 = AnonymousClass1E7.A00(this.A00);
        if (!isEmpty) {
            r1.A0Q(A002, 0);
            if (this.A02) {
                messageReplyActivity.A02.setAlpha(1.0f);
                messageReplyActivity.A08.setAlpha(1.0f);
            }
        } else {
            r1.A0P(A002);
        }
        C18030ve r8 = messageReplyActivity.A0E;
        AnonymousClass1KW r7 = messageReplyActivity.A0D;
        AnonymousClass11C r6 = messageReplyActivity.A08;
        C26302CxJ.A0L(messageReplyActivity, editable2, messageReplyActivity.A0k.getPaint(), r6, r7, r8, messageReplyActivity.A0o, AnonymousClass1YL.A00(messageReplyActivity, 2130970892, 2131102330), AnonymousClass1YL.A00(messageReplyActivity, 2130970132, 2131101250), true);
        boolean A0H = AnonymousClass1EG.A0H(obj);
        messageReplyActivity.A0U.A0X(A0H);
        if (!A0H) {
            MessageReplyActivity.A0y(messageReplyActivity);
        } else if (messageReplyActivity.A1a) {
            messageReplyActivity.A08.setVisibility(0);
            if (messageReplyActivity.A1W == AnonymousClass00R.A00) {
                gridLayout = messageReplyActivity.A0A;
            } else {
                gridLayout = messageReplyActivity.A09;
            }
            AnimatorSet A0B = C108945cZ.A0B();
            ArrayList A13 = AnonymousClass000.A13();
            if (gridLayout != null) {
                for (int i = 0; i < gridLayout.getChildCount(); i++) {
                    ObjectAnimator A0C = C108945cZ.A0C(View.ALPHA, gridLayout.getChildAt(i), new float[1], 1.0f, 0);
                    A0C.setDuration(150);
                    A0C.setInterpolator(MessageReplyActivity.A1s);
                    A13.add(A0C);
                }
            }
            View view = messageReplyActivity.A05;
            if (view != null) {
                ObjectAnimator A0C2 = C108945cZ.A0C(View.ALPHA, view, new float[1], 1.0f, 0);
                A0C2.setDuration(150);
                A0C2.setInterpolator(MessageReplyActivity.A1s);
                A13.add(A0C2);
            }
            A0B.playTogether(A13);
            A0B.start();
        }
        if (messageReplyActivity.A1Z != A0H && messageReplyActivity.A0y.BcY()) {
            messageReplyActivity.A1Z = A0H;
            View view2 = messageReplyActivity.A06;
            boolean A1b = AnonymousClass3MY.A1b(messageReplyActivity.A00);
            if (A0H) {
                view2.startAnimation(C88404Zo.A00(A1b, true, false));
                messageReplyActivity.A0B.startAnimation(A00(AnonymousClass3MY.A1b(messageReplyActivity.A00), true));
                messageReplyActivity.A0B.setVisibility(0);
            } else {
                view2.startAnimation(C88404Zo.A00(A1b, false, false));
                messageReplyActivity.A0B.startAnimation(A00(AnonymousClass3MY.A1b(messageReplyActivity.A00), false));
                messageReplyActivity.A0B.setVisibility(8);
            }
        }
        if (((AnonymousClass6pA) messageReplyActivity.A1T.get()).A01() && messageReplyActivity.A0t != null && ((C133686pK) messageReplyActivity.A1I.get()).A02) {
            messageReplyActivity.A0t.A00(obj);
        }
    }
}
