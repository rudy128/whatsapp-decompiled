package X;

import android.animation.Animator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.whatsapp.BoundedLinearLayout;
import com.whatsapp.community.ConversationCommunityViewModel;
import com.whatsapp.components.CircularRevealView;
import com.whatsapp.conversation.ConversationAttachmentContentView;
import java.lang.ref.WeakReference;

/* renamed from: X.3RS  reason: invalid class name */
public class AnonymousClass3RS extends PopupWindow {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final View A04;
    public final ViewTreeObserver.OnGlobalLayoutListener A05 = new C90584eJ((Object) this, 15);
    public final FrameLayout A06;
    public final CircularRevealView A07;
    public final ConversationAttachmentContentView A08;
    public final WeakReference A09;
    public final int A0A;
    public final FrameLayout.LayoutParams A0B;
    public final BoundedLinearLayout A0C;
    public final AnonymousClass1KB A0D;
    public final AnonymousClass1L4 A0E;
    public final boolean A0F;

    public static void A04(AnonymousClass3RS r5) {
        int[] iArr = new int[2];
        r5.A04.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        CircularRevealView circularRevealView = r5.A07;
        circularRevealView.getLocationOnScreen(iArr2);
        int i = 0;
        int i2 = (iArr[0] + r5.A00) - iArr2[0];
        if (r5.A02) {
            i = r5.A06.getMeasuredHeight();
        }
        circularRevealView.A00 = i2;
        circularRevealView.A01 = i;
    }

    public static int A00(Activity activity, AnonymousClass3RS r5) {
        r5.A06.measure(0, 0);
        View view = r5.A04;
        view.measure(0, 0);
        if (!AnonymousClass1L4.A00(view) || (Build.VERSION.SDK_INT >= 24 && activity.isInMultiWindowMode())) {
            return -(view.getMeasuredHeight() + r5.A08.A0C(view));
        }
        return 0;
    }

    public static void A01(Activity activity, AnonymousClass3RS r17, int i, int i2, boolean z) {
        int i3;
        int i4;
        ConversationAttachmentContentView conversationAttachmentContentView;
        CircularRevealView circularRevealView;
        FrameLayout.LayoutParams layoutParams;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        Fragment A0Q;
        View view;
        boolean z2 = z;
        AnonymousClass3RS r12 = r17;
        r12.A02 = z2;
        Activity activity2 = activity;
        Display defaultDisplay = activity2.getWindowManager().getDefaultDisplay();
        Point A022 = C62762rw.A02(activity2.getWindowManager());
        if (!(activity2 instanceof AnonymousClass01E) || (A0Q = ((AnonymousClass1FL) activity2).getSupportFragmentManager().A0Q("com.whatsapp.HomeActivity.ConversationFragment")) == null || !A0Q.A1e() || (view = A0Q.A0B) == null) {
            i3 = -1;
        } else {
            i3 = view.getWidth();
        }
        int[] iArr = new int[2];
        View view2 = r12.A04;
        view2.getLocationOnScreen(iArr);
        int A023 = AnonymousClass3MW.A02(view2, iArr[1]);
        r12.A01 = iArr[0];
        if (Build.VERSION.SDK_INT < 28 || (rootWindowInsets = view2.getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            i4 = 0;
        } else {
            i4 = displayCutout.getSafeInsetTop();
        }
        BoundedLinearLayout boundedLinearLayout = r12.A0C;
        int i5 = i2;
        if (!z) {
            boundedLinearLayout.A00 = Integer.MAX_VALUE;
            boundedLinearLayout.A01 = Integer.MAX_VALUE;
            circularRevealView = r12.A07;
            C72473Md.A11(circularRevealView, 0);
            conversationAttachmentContentView = r12.A08;
            conversationAttachmentContentView.A06 = 0;
            layoutParams = r12.A0B;
            layoutParams.height = -1;
            int i6 = A023 + i2;
            boundedLinearLayout.getLayoutParams().height = (A022.y + i4) - i6;
            if (r12.A0F) {
                boundedLinearLayout.setGravity(8388611);
            }
            r12.showAtLocation(view2, 8388661, 0, i6);
        } else {
            conversationAttachmentContentView = r12.A08;
            boundedLinearLayout.A00 = conversationAttachmentContentView.A0C(view2);
            boundedLinearLayout.A01 = conversationAttachmentContentView.A0B(view2);
            circularRevealView = r12.A07;
            circularRevealView.setPadding(circularRevealView.getPaddingLeft(), circularRevealView.getPaddingTop(), circularRevealView.getPaddingRight(), r12.A0A);
            boundedLinearLayout.getLayoutParams().height = -2;
            layoutParams = r12.A0B;
            layoutParams.height = -2;
            conversationAttachmentContentView.A06 = conversationAttachmentContentView.getResources().getDimensionPixelOffset(2131165365);
            r12.showAsDropDown(view2, 0, i5, 8388661);
        }
        circularRevealView.forceLayout();
        int i7 = i;
        circularRevealView.A02 = i7;
        if (z) {
            boundedLinearLayout.measure(0, 0);
            int measuredWidth = boundedLinearLayout.getMeasuredWidth();
            int A002 = (int) (((float) A022.x) - ((((float) AnonymousClass3MX.A00(activity2.getResources(), 2131167148, AnonymousClass3MX.A00(activity2.getResources(), 2131167149, activity2.getResources().getDimensionPixelSize(2131167147)))) + activity2.getResources().getDimension(2131167146)) * 2.0f));
            if ((defaultDisplay.getRotation() == 1 || defaultDisplay.getRotation() == 3) && A002 > measuredWidth) {
                layoutParams.width = A002;
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            } else {
                layoutParams.width = -1;
                int dimensionPixelSize = activity2.getResources().getDimensionPixelSize(2131165366);
                layoutParams.rightMargin = dimensionPixelSize;
                layoutParams.leftMargin = dimensionPixelSize;
            }
            int i8 = 2130971998;
            int i9 = 2131103200;
            if (r12.A0F) {
                i8 = 2130968694;
                i9 = 2131099771;
            }
            circularRevealView.setBackground(AnonymousClass4aX.A03(activity2, i8, i9, 2131231607));
        } else {
            layoutParams.width = -1;
            int i10 = 2130968693;
            int i11 = 2131099770;
            if (r12.A0F) {
                i10 = 2130968694;
                i11 = 2131099771;
            }
            circularRevealView.setBackgroundColor(AnonymousClass3Ma.A00(activity2, i10, i11));
            C19740yt.A00(activity2, AnonymousClass1YL.A00(activity2, 2130968691, 2131099735));
        }
        if (i3 != -1) {
            layoutParams.width = i3;
            layoutParams.gravity = 8388613;
        }
        circularRevealView.setVisibility(0);
        C90584eJ.A00(circularRevealView.getViewTreeObserver(), r12, 16);
        if (i > 0) {
            conversationAttachmentContentView.A0G(i7, z2);
        }
    }

    public static void A02(AnonymousClass3RS r2) {
        r2.A07.setVisibility(8);
        super.dismiss();
    }

    public static void A03(AnonymousClass3RS r2) {
        if (r2.A03) {
            r2.A03 = false;
            r2.A06.getViewTreeObserver().removeOnGlobalLayoutListener(r2.A05);
        }
    }

    public AnonymousClass3RS(Activity activity, View view, AnonymousClass1KB r11, ConversationCommunityViewModel conversationCommunityViewModel, C115095tO r13, AnonymousClass11C r14, C18030ve r15, AnonymousClass1BI r16, AnonymousClass1L4 r17, boolean z) {
        super(activity);
        this.A0D = r11;
        this.A0E = r17;
        this.A04 = view;
        this.A09 = AnonymousClass3MW.A0z(activity);
        C18070vi.A0d(r15, 0);
        boolean z2 = false;
        C18040vf r1 = C18040vf.A02;
        this.A0F = (C18020vd.A05(r1, r15, 10753) || C18020vd.A05(r1, r15, 3223)) ? true : z2;
        AnonymousClass3P7 r7 = new AnonymousClass3P7(activity, activity, this);
        this.A06 = r7;
        r7.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        activity.getLayoutInflater().inflate(2131624218, r7, true);
        CircularRevealView circularRevealView = (CircularRevealView) AnonymousClass1HF.A06(r7, 2131433413);
        this.A07 = circularRevealView;
        this.A0C = (BoundedLinearLayout) AnonymousClass1HF.A06(r7, 2131429510);
        this.A0B = (FrameLayout.LayoutParams) circularRevealView.getLayoutParams();
        this.A0A = circularRevealView.getResources().getDimensionPixelSize(2131165364);
        circularRevealView.setVisibility(0);
        setContentView(r7);
        setBackgroundDrawable(new BitmapDrawable());
        setWidth(-1);
        setHeight(-2);
        setAnimationStyle(0);
        setTouchable(true);
        setFocusable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        setTouchInterceptor(new C90324dt(activity, this, r14, 0));
        ConversationAttachmentContentView conversationAttachmentContentView = (ConversationAttachmentContentView) AnonymousClass1HF.A06(circularRevealView, 2131429564);
        this.A08 = conversationAttachmentContentView;
        conversationAttachmentContentView.A0H(conversationCommunityViewModel, r13, r16, C72453Mb.A08(activity), z);
    }

    public void A06(Activity activity) {
        boolean z;
        Resources resources = activity.getResources();
        int[] iArr = new int[2];
        View view = this.A04;
        view.getLocationOnScreen(iArr);
        if (C62762rw.A02(AnonymousClass11C.A01(this.A06.getContext())).y - AnonymousClass3MW.A02(view, iArr[1]) < activity.getResources().getDimensionPixelSize(2131165372) || (Build.VERSION.SDK_INT >= 24 && activity.isInMultiWindowMode())) {
            z = true;
        } else {
            z = false;
        }
        this.A00 = view.getWidth() / 2;
        if (z) {
            A01(activity, this, 300, A00(activity, this), true);
        } else {
            A01(activity, this, 300, resources.getDimensionPixelSize(2131165380), false);
        }
    }

    public void dismiss() {
        if (isShowing()) {
            this.A08.A0E();
            A04(this);
            int[] iArr = new int[2];
            this.A04.getLocationOnScreen(iArr);
            boolean z = this.A02;
            float f = (float) (this.A00 + iArr[0]);
            float f2 = 0.0f;
            if (z) {
                f2 = 1.0f;
            }
            C72473Md.A0J(new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 0, f, 1, f2), 1.0f, 1.0f - 1.0f).setDuration(300);
            CircularRevealView circularRevealView = this.A07;
            circularRevealView.A02 = 300;
            if (!circularRevealView.A04) {
                int max = Math.max(circularRevealView.getWidth(), circularRevealView.getHeight());
                if (circularRevealView.isAttachedToWindow()) {
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(circularRevealView, circularRevealView.A00, circularRevealView.A01, (float) max, 0.0f);
                    createCircularReveal.setDuration((long) circularRevealView.A02);
                    AnonymousClass3Mo.A00(createCircularReveal, circularRevealView, 8);
                    createCircularReveal.addListener(circularRevealView.A06);
                    createCircularReveal.start();
                } else {
                    circularRevealView.setVisibility(8);
                }
            }
        }
        A03(this);
        this.A0D.A0K(new C70563Bp(this, 40), 300);
    }

    public /* synthetic */ void A05() {
        super.dismiss();
    }
}
