package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.conversation.headerfooter.InteropView;

/* renamed from: X.1wM  reason: invalid class name and case insensitive filesystem */
public final class C41421wM extends FrameLayout implements AnonymousClass009 {
    public C64072uB A00;
    public AnonymousClass1CJ A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public AnonymousClass031 A06;
    public boolean A07;
    public C41451wQ A08;
    public C51882Zz A09;
    public Runnable A0A;
    public final View A0B;
    public final View A0C;

    public C41421wM(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass10E r1 = ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10;
            this.A01 = (AnonymousClass1CJ) r1.A2H.get();
            this.A02 = C000200d.A00(r1.A59);
            this.A03 = C000200d.A00(r1.A5U);
            this.A04 = C000200d.A00(r1.A5V);
            this.A05 = C000200d.A00(r1.A00.A2r);
        }
        View inflate = LayoutInflater.from(context).inflate(2131625001, this, false);
        C18070vi.A0X(inflate);
        this.A0B = inflate;
        View findViewById = inflate.findViewById(2131429663);
        C18070vi.A0X(findViewById);
        this.A0C = findViewById;
        if (((C28391a8) getInboxFilterHelper().get()).A02()) {
            A00(this);
        }
        if (!getChatsCache().A01.isEmpty()) {
            A02();
        }
        if (((C39541tF) getInteropRolloutManager().get()).A00() || ((C41461wR) getInteropUtility().get()).A00.A06()) {
            Object obj = getInteropRolloutManager().get();
            C18070vi.A0X(obj);
            Object obj2 = getInteropUiCache().get();
            C18070vi.A0X(obj2);
            if (!AnonymousClass4GM.A00((C39541tF) obj, (C33971jg) obj2)) {
                A01(this);
            }
            A01(this);
        }
        addView(inflate);
    }

    public final void setChatsCache(AnonymousClass1CJ r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setInboxFilterHelper(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setInteropRolloutManager(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setInteropUiCache(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setInteropUtility(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setOnLockedChatsInflateListener(Runnable runnable) {
        C18070vi.A0d(runnable, 0);
        if (this.A00 != null) {
            runnable.run();
        } else {
            this.A0A = runnable;
        }
    }

    public static final C41451wQ A00(C41421wM r2) {
        C41451wQ r0 = r2.A08;
        if (r0 == null) {
            View findViewById = r2.A0B.findViewById(2131429662);
            C18070vi.A0X(findViewById);
            ViewStub viewStub = (ViewStub) findViewById;
            C18070vi.A0d(viewStub, 0);
            View inflate = viewStub.inflate();
            C18070vi.A0z(inflate, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            r0 = new C41451wQ((RecyclerView) inflate);
            r2.A08 = r0;
        }
        C17960vV.A07(r0);
        return r0;
    }

    public static final C51882Zz A01(C41421wM r2) {
        C51882Zz r0 = r2.A09;
        if (r0 == null) {
            View findViewById = r2.A0B.findViewById(2131429664);
            C18070vi.A0X(findViewById);
            ViewStub viewStub = (ViewStub) findViewById;
            C18070vi.A0d(viewStub, 0);
            View inflate = viewStub.inflate();
            C18070vi.A0z(inflate, "null cannot be cast to non-null type com.whatsapp.conversation.headerfooter.InteropView");
            r0 = new C51882Zz((InteropView) inflate);
            r2.A09 = r0;
        }
        C17960vV.A07(r0);
        return r0;
    }

    public final void A02() {
        if (this.A00 == null) {
            View findViewById = this.A0B.findViewById(2131429665);
            C18070vi.A0X(findViewById);
            ViewStub viewStub = (ViewStub) findViewById;
            C18070vi.A0d(viewStub, 0);
            View inflate = viewStub.inflate();
            C18070vi.A0X(inflate);
            this.A00 = new C64072uB(inflate);
            Runnable runnable = this.A0A;
            if (runnable != null) {
                runnable.run();
            }
            this.A0A = null;
        }
        C64072uB r0 = this.A00;
        C17960vV.A07(r0);
        C18070vi.A0X(r0);
    }

    public final void A03(Runnable runnable) {
        Integer num;
        C64072uB r3 = this.A00;
        if (r3 != null) {
            r3.A01 = runnable;
            int intValue = r3.A00.intValue();
            LottieAnimationView lottieAnimationView = r3.A03;
            if (intValue != 0) {
                lottieAnimationView.setSpeed(-0.7f);
                lottieAnimationView.A04();
                num = AnonymousClass00R.A00;
            } else {
                lottieAnimationView.setSpeed(0.7f);
                lottieAnimationView.A04();
                num = AnonymousClass00R.A01;
            }
            r3.A00 = num;
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A06;
        if (r0 == null) {
            r0 = new AnonymousClass031(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1CJ getChatsCache() {
        AnonymousClass1CJ r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("chatsCache");
        throw null;
    }

    public final AnonymousClass00H getInboxFilterHelper() {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("inboxFilterHelper");
        throw null;
    }

    public final AnonymousClass00H getInteropRolloutManager() {
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("interopRolloutManager");
        throw null;
    }

    public final AnonymousClass00H getInteropUiCache() {
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("interopUiCache");
        throw null;
    }

    public final AnonymousClass00H getInteropUtility() {
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("interopUtility");
        throw null;
    }

    public final void setEnableStateForChatLock(boolean z) {
        C64072uB r1 = this.A00;
        if (r1 != null) {
            r1.A04.setEnabled(z);
            View view = r1.A02;
            view.setClickable(z);
            view.setEnabled(z);
            LottieAnimationView lottieAnimationView = r1.A03;
            float f = 0.4f;
            if (z) {
                f = 1.0f;
            }
            lottieAnimationView.setAlpha(f);
        }
    }

    public final void setInteropViewVisibility(boolean z) {
        if (z) {
            A01(this);
        }
        C51882Zz r0 = this.A09;
        if (r0 != null) {
            InteropView interopView = r0.A00;
            int i = 8;
            if (z) {
                i = 0;
            }
            interopView.setVisibility(i);
        }
    }

    public final void setLockedRowVisibility(boolean z) {
        if (z) {
            A02();
        }
        C64072uB r0 = this.A00;
        if (r0 != null) {
            View view = r0.A02;
            int i = 8;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    public final void setOnLockedClickListener(View.OnClickListener onClickListener) {
        C64072uB r0 = this.A00;
        if (r0 != null) {
            r0.A02.setOnClickListener(onClickListener);
        }
    }

    public final View getContainer() {
        return this.A0B;
    }

    public final InteropView getInteropView() {
        return A01(this).A00;
    }

    public final View getParentViewToBeAnimated() {
        return this.A0C;
    }

    public final RecyclerView getRevealFilterRecyclerView() {
        return A00(this).A00;
    }
}
