package X;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.whatsapp.text.FinalBackspaceAwareEntry;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: X.6qA  reason: invalid class name and case insensitive filesystem */
public final class C134176qA {
    public int A00;
    public ObjectAnimator A01;
    public ObjectAnimator A02;
    public ObjectAnimator A03;
    public ObjectAnimator A04;
    public TextView A05;
    public TextView A06;
    public FinalBackspaceAwareEntry A07;
    public String A08;
    public String A09;
    public String A0A;
    public TimerTask A0B;
    public final View A0C;
    public final AccelerateInterpolator A0D;
    public final DecelerateInterpolator A0E;
    public final AnonymousClass1KB A0F;
    public final C18090vk A0G;
    public final int[] A0H;
    public final int[] A0I;
    public final Timer A0J = new Timer();

    public C134176qA(View view, AnonymousClass1KB r10, C18090vk r11) {
        C18070vi.A0d(r10, 1);
        this.A0F = r10;
        this.A0C = view;
        this.A0G = r11;
        int[] iArr = new int[2];
        this.A0I = iArr;
        this.A0D = new AccelerateInterpolator();
        this.A0E = new DecelerateInterpolator();
        int[] iArr2 = new int[2];
        this.A0H = iArr2;
        this.A08 = "";
        iArr[0] = -1;
        iArr2[0] = -1;
        String A0F2 = C18070vi.A0F(view.getContext(), 2131895489);
        this.A09 = A0F2;
        this.A0A = A0F2;
        this.A05 = AnonymousClass3Ma.A0E(view, 2131434895);
        this.A06 = AnonymousClass3Ma.A0E(view, 2131434896);
        this.A07 = (FinalBackspaceAwareEntry) C18070vi.A05(view, 2131434901);
        TextView textView = this.A05;
        C72463Mc.A0w(view.getContext(), view.getContext(), textView, 2130970055, 2131101191);
        TextView textView2 = this.A06;
        C72463Mc.A0w(view.getContext(), view.getContext(), textView2, 2130970055, 2131101191);
        this.A05.setHint("");
        this.A06.setHint("");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A06, "translationY", new float[]{0.0f, 50.0f});
        ofFloat.setDuration(300);
        ofFloat.setStartDelay(700);
        C109195cy.A02(ofFloat, this, 28);
        this.A04 = ofFloat;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A05, "translationY", new float[]{-50.0f, 0.0f});
        ofFloat2.setDuration(300);
        ofFloat2.setStartDelay(700);
        C109195cy.A02(ofFloat2, this, 29);
        this.A02 = ofFloat2;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.A05, "alpha", new float[]{0.0f, 1.0f});
        ofFloat3.setInterpolator(this.A0D);
        ofFloat3.setDuration(300);
        ofFloat3.setStartDelay(700);
        this.A01 = ofFloat3;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.A06, "alpha", new float[]{1.0f, 0.0f});
        ofFloat4.setInterpolator(this.A0E);
        ofFloat4.setDuration(300);
        ofFloat4.setStartDelay(700);
        this.A03 = ofFloat4;
        AnonymousClass79A.A00(this.A07.getViewTreeObserver(), this, 4);
    }

    public final void A00() {
        TimerTask timerTask = this.A0B;
        if (timerTask != null) {
            timerTask.cancel();
        }
        ObjectAnimator objectAnimator = this.A03;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.A04;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        ObjectAnimator objectAnimator3 = this.A02;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        ObjectAnimator objectAnimator4 = this.A01;
        if (objectAnimator4 != null) {
            objectAnimator4.cancel();
        }
        this.A05.clearAnimation();
        this.A06.clearAnimation();
        this.A07.setHint(this.A09);
    }

    public final void A01(String str) {
        if (str == null || str.length() == 0) {
            TimerTask timerTask = this.A0B;
            if (timerTask != null) {
                timerTask.cancel();
            }
            AnonymousClass7T9 r1 = new AnonymousClass7T9(this);
            this.A0B = r1;
            this.A0J.schedule(r1, 0, 7000);
        }
    }
}
