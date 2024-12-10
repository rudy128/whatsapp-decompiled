package X;

import android.animation.Animator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.4VZ  reason: invalid class name */
public class AnonymousClass4VZ {
    public SearchView A00;
    public int A01;
    public final Activity A02;
    public final View A03;
    public final C16560sd A04;
    public final Toolbar A05;
    public final C18000vb A06;
    public final View.OnClickListener A07 = new C90064dT((Object) this, 0);

    public void A01() {
    }

    public void A02() {
    }

    public void A0A() {
    }

    public void A03(Bundle bundle) {
        CharSequence charSequence;
        if (bundle != null && (charSequence = bundle.getCharSequence("search_text")) != null) {
            A06(false);
            this.A01 = bundle.getInt("search_button_x_pos");
            this.A00.A0N(charSequence);
        }
    }

    public void A04(Bundle bundle) {
        if (this.A00 != null && A0C()) {
            bundle.putCharSequence("search_text", this.A00.A0b.getText());
            bundle.putInt("search_button_x_pos", this.A01);
        }
    }

    public void A08() {
        AnonymousClass3MW.A0H(this.A00, 2131434914).setImageDrawable(new AnonymousClass3NH(C24261Jm.A00(this.A02, 2131231675), this));
    }

    public void A09() {
        C28281Zt.A0A(this.A02.getWindow(), false);
    }

    public void A0B() {
        C72463Mc.A0t(this.A02);
    }

    public boolean A0C() {
        return AnonymousClass000.A1P(this.A03.getVisibility());
    }

    public AnonymousClass4VZ(Activity activity, View view, C16560sd r5, Toolbar toolbar, C18000vb r7) {
        this.A02 = activity;
        this.A06 = r7;
        this.A03 = view;
        this.A05 = toolbar;
        this.A04 = r5;
    }

    public void A05(boolean z) {
        int i;
        if (A0C()) {
            this.A00.A0N("");
            this.A05.setVisibility(0);
            View view = this.A03;
            if (!view.isAttachedToWindow() || !z) {
                this.A00.A0G();
                view.setVisibility(4);
            } else {
                int i2 = this.A01;
                int width = view.getWidth();
                int i3 = this.A01;
                int max = Math.max(i2, width - i3);
                if (i3 == 0) {
                    this.A01 = view.getWidth() / 2;
                }
                if (AnonymousClass3MY.A1b(this.A06)) {
                    i = view.getWidth() - this.A01;
                } else {
                    i = this.A01;
                }
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, view.getHeight() / 2, (float) max, 0.0f);
                createCircularReveal.setDuration(250);
                AnonymousClass3Mo.A00(createCircularReveal, this, 21);
                createCircularReveal.start();
            }
            A09();
            Activity activity = this.A02;
            C18070vi.A0d(activity, 0);
            C28281Zt.A05(activity, AnonymousClass4Z9.A01(activity, false));
        }
    }

    public void A06(boolean z) {
        int width;
        int i;
        if (!A0C()) {
            if (this.A00 == null) {
                View view = this.A03;
                int i2 = 2131232920;
                if (z) {
                    i2 = 2131232921;
                }
                view.setBackgroundResource(i2);
                Activity activity = this.A02;
                activity.getLayoutInflater().inflate(A07(), (ViewGroup) view, true);
                SearchView searchView = (SearchView) AnonymousClass1HF.A06(view, 2131434976);
                this.A00 = searchView;
                TextView A0J = AnonymousClass3MW.A0J(searchView, 2131434969);
                C72463Mc.A0y(activity, A0J, 2130971105, 2131102431);
                A0J.setHintTextColor(AnonymousClass3Ma.A00(activity, 2130970055, 2131101191));
                this.A00.setIconifiedByDefault(false);
                this.A00.setQueryHint(activity.getString(2131895489));
                this.A00.A06 = this.A04;
                A08();
                ImageView A0H = AnonymousClass3MW.A0H(view, 2131434851);
                SearchView searchView2 = this.A00;
                if (!(searchView2 == null || searchView2.getContext() == null)) {
                    C74743cP.A03(AnonymousClass4aX.A04(activity, this.A00.getContext(), 2130971091, 2131102420, 2131231675), A0H, this.A06);
                }
                AnonymousClass3MZ.A1L(A0H, this, 49);
                A0A();
            }
            A02();
            View view2 = this.A03;
            view2.setVisibility(0);
            if (view2.isAttachedToWindow()) {
                View findViewById = this.A05.findViewById(2131432620);
                if (findViewById != null) {
                    int[] iArr = new int[2];
                    findViewById.getLocationInWindow(iArr);
                    if (AnonymousClass3MY.A1b(this.A06)) {
                        width = (view2.getWidth() - iArr[0]) - (findViewById.getWidth() / 2);
                    } else {
                        width = iArr[0] + (findViewById.getWidth() / 2);
                    }
                } else {
                    width = view2.getWidth() / 2;
                }
                this.A01 = width;
                int max = Math.max(width, view2.getWidth() - this.A01);
                if (AnonymousClass3MY.A1b(this.A06)) {
                    i = view2.getWidth() - this.A01;
                } else {
                    i = this.A01;
                }
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i, view2.getHeight() / 2, 0.0f, (float) max);
                createCircularReveal.setDuration(250);
                AnonymousClass3Mo.A00(createCircularReveal, this, 20);
                createCircularReveal.start();
            }
            if (AnonymousClass112.A01()) {
                A0B();
                return;
            }
            Activity activity2 = this.A02;
            activity2.getWindow().setStatusBarColor(AnonymousClass3Ma.A00(activity2, 2130968810, 2131099888));
        }
    }

    public int A07() {
        return 2131625555;
    }
}
