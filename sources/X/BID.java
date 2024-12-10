package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;

public abstract class BID extends FrameLayout {
    public static int[] getViewIdsToIgnoreScaling() {
        return new int[]{2131432211, 2131433891, 2131432153};
    }

    public void A08() {
        C24149BwF bwF = (C24149BwF) this;
        AnonymousClass70X r0 = bwF.A0H;
        if (r0 != null) {
            if (r0.A0a()) {
                C25022CTy cTy = bwF.A0r;
                if (cTy != null) {
                    C136746uK r1 = cTy.A09;
                    if (r1.A01) {
                        r1.A00();
                    }
                }
                bwF.A0H.A0B();
            }
            if (!bwF.A0C()) {
                bwF.A0E();
            }
            bwF.removeCallbacks(bwF.A0t);
            C24149BwF.A05(bwF);
            bwF.A0A(500);
        }
    }

    public void A09() {
        C24149BwF bwF = (C24149BwF) this;
        C24888COg cOg = bwF.A0D;
        if (cOg != null) {
            cOg.A00 = true;
            bwF.A0D = null;
        }
        bwF.A0R = false;
        bwF.A0V.removeCallbacksAndMessages(0);
    }

    public void A0A(int i) {
        C24149BwF bwF = (C24149BwF) this;
        bwF.A09();
        C24888COg cOg = new C24888COg(bwF);
        bwF.A0D = cOg;
        bwF.postDelayed(new AnonymousClass7RJ(cOg, 16), (long) i);
    }

    public void A0B(int i, int i2) {
        C24149BwF bwF = (C24149BwF) this;
        AnonymousClass70X r0 = bwF.A0H;
        if (r0 != null && r0.A09() != null) {
            ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            Object[] A1b = AnonymousClass3MW.A1b();
            BEA.A1U(A1b, i, i2);
            ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, A1b);
            ofObject.setDuration(150);
            C26323Cxg.A00(ofObject, bwF, 27);
            ofObject.start();
        }
    }

    public boolean A0C() {
        View view;
        C24149BwF bwF = (C24149BwF) this;
        if (bwF.A0M) {
            view = bwF.A0k;
        } else {
            view = bwF.A0l;
        }
        if (view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public abstract void A0D();

    public abstract void A0E();

    public abstract List getFullscreenControls();

    public abstract List getInlineControls();

    public abstract void setCloseButtonListener(C28542E6q e6q);

    public abstract void setFullscreenButtonClickListener(C28542E6q e6q);

    public abstract void setMusicAttributionClickListener(C28542E6q e6q);

    public abstract void setPlayer(AnonymousClass70X r1);

    public abstract void setPlayerElevation(int i);

    public abstract void setWatchMoreVideosText(String str);
}
