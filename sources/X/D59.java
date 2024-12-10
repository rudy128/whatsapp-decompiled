package X;

import android.animation.Animator;
import android.view.ViewTreeObserver;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;

public class D59 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;

    public D59(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onGlobalLayout() {
        switch (this.A00) {
            case 0:
                BIJ bij = (BIJ) this.A01;
                if (bij.A09) {
                    int i = bij.A02;
                    Animator.AnimatorListener animatorListener = bij.A0G;
                    bij.clearAnimation();
                    bij.setScaleX(1.5f);
                    bij.setScaleY(1.5f);
                    bij.animate().setDuration((long) i).setInterpolator(bij.A04).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setListener(animatorListener);
                } else {
                    boolean equals = bij.A07.equals(AnonymousClass00R.A00);
                    int height = bij.getHeight();
                    if (equals) {
                        height = -height;
                    }
                    bij.setTranslationY((float) height);
                    bij.A04(bij.A0G, bij.A02);
                }
                BIJ.A00(bij);
                AnonymousClass3MY.A1D(bij, this);
                return;
            case 1:
                GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) this.A01;
                AnonymousClass3MY.A1D(groupChatLiveLocationsActivity.A0M, this);
                if (groupChatLiveLocationsActivity.A0M.getWidth() > 0 && groupChatLiveLocationsActivity.A0M.getHeight() > 0) {
                    GroupChatLiveLocationsActivity.A0q(groupChatLiveLocationsActivity, false);
                    return;
                }
                return;
            default:
                GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) this.A01;
                AnonymousClass3MY.A1D(groupChatLiveLocationsActivity2.A0N, this);
                if (groupChatLiveLocationsActivity2.A0N.getWidth() > 0 && groupChatLiveLocationsActivity2.A0N.getHeight() > 0) {
                    GroupChatLiveLocationsActivity2.A0q(groupChatLiveLocationsActivity2, false);
                    return;
                }
                return;
        }
    }
}
