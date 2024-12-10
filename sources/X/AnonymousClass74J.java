package X;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.LockableCoodinatorLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.expressions.BaseExpressionsTray;
import com.whatsapp.expressionstray.ExpressionsTrayView;
import com.whatsapp.expressionstray.search.ExpressionsSearchView;

/* renamed from: X.74J  reason: invalid class name */
public abstract class AnonymousClass74J {
    public int A00;
    public Activity A01;
    public Context A02;
    public View A03;
    public ImageButton A04;
    public CoordinatorLayout A05;
    public BottomSheetBehavior A06;
    public C107845ai A07;
    public KeyboardPopupLayout A08;
    public WaEditText A09;
    public EmojiSearchKeyboardContainer A0A;
    public BaseExpressionsTray A0B;
    public AnonymousClass875 A0C;
    public C1605488x A0D;
    public ExpressionsTrayView A0E;
    public AnonymousClass87C A0F;
    public AnonymousClass3SU A0G;
    public AnonymousClass88B A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public View A0O;
    public final C19830z4 A0P;
    public final C1193267r A0Q;
    public final C131196kh A0R;
    public final EmojiSearchProvider A0S;
    public final C1605588y A0T = new AnonymousClass7GK(this);
    public final AnonymousClass1L4 A0U;

    public static final long A02(AnonymousClass74J r2, int i) {
        ContentResolver contentResolver;
        float f = (float) i;
        Activity activity = r2.A01;
        if (activity != null) {
            contentResolver = activity.getContentResolver();
        } else {
            contentResolver = null;
        }
        return (long) (f * Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f));
    }

    public void A0K(int i) {
        this.A00 = i;
        this.A0K = true;
        A04((AnonymousClass1GP) null);
        ExpressionsTrayView expressionsTrayView = this.A0E;
        View view = null;
        if (expressionsTrayView != null) {
            view = expressionsTrayView.findViewById(2131430747);
        }
        this.A03 = view;
        this.A0S.A01((Integer) null);
        ExpressionsTrayView expressionsTrayView2 = this.A0E;
        if (expressionsTrayView2 != null) {
            expressionsTrayView2.setExpressionsSearchListener(this.A0T);
            expressionsTrayView2.setVisibility(8);
        }
        ExpressionsTrayView expressionsTrayView3 = this.A0E;
        if (expressionsTrayView3 != null) {
            BottomSheetBehavior A022 = BottomSheetBehavior.A02(expressionsTrayView3);
            this.A06 = A022;
            if (A022 != null) {
                A022.A0Z(new C114315qV(this, 6));
            }
            BottomSheetBehavior bottomSheetBehavior = this.A06;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A0h = A0T();
            }
            A0Q(false);
            return;
        }
        throw C17890vO.A0K();
    }

    public void A0N(C107845ai r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
        ExpressionsTrayView expressionsTrayView = this.A0E;
        if (expressionsTrayView != null) {
            expressionsTrayView.A02 = r2;
        }
    }

    public boolean A0S() {
        return false;
    }

    public boolean A0T() {
        return false;
    }

    public static final int A00(AnonymousClass74J r2) {
        Resources resources;
        Resources resources2;
        Configuration configuration;
        int A072;
        Context context = r2.A02;
        if (!(context == null || (resources2 = context.getResources()) == null || (configuration = resources2.getConfiguration()) == null)) {
            int i = configuration.orientation;
            if (Integer.valueOf(i) != null) {
                if (i == 1) {
                    A072 = r2.A0P.A08();
                } else if (i == 2) {
                    A072 = r2.A0P.A07();
                }
                if (A072 > 0) {
                    return A072;
                }
            }
        }
        View view = r2.A0O;
        if (view == null || (resources = view.getResources()) == null) {
            return 0;
        }
        return resources.getDimensionPixelOffset(2131166738);
    }

    public static final int A01(AnonymousClass74J r3) {
        int i;
        View rootView;
        AnonymousClass1HO A0C2;
        Activity activity = (Activity) C008803x.A00(r3.A02);
        if (activity == null || (A0C2 = AnonymousClass1HF.A0C(AnonymousClass3MZ.A0F(activity))) == null) {
            Rect A072 = AnonymousClass3MW.A07();
            View view = r3.A0O;
            if (view != null) {
                view.getWindowVisibleDisplayFrame(A072);
            }
            View view2 = r3.A0O;
            if (view2 == null || (rootView = view2.getRootView()) == null) {
                i = 0;
            } else {
                i = rootView.getHeight();
            }
            return i - A072.bottom;
        }
        return A0C2.A07(8).A00 - A0C2.A07(2).A00;
    }

    public static final void A03(View view, AnonymousClass74J r3) {
        CoordinatorLayout coordinatorLayout;
        int height;
        if (view != null && (coordinatorLayout = r3.A05) != null && (height = coordinatorLayout.getHeight()) > 0) {
            r3.A0A(Integer.valueOf((int) (((float) height) - view.getY())));
        }
    }

    private final void A04(AnonymousClass1GP r11) {
        ExpressionsTrayView expressionsTrayView;
        Context context = this.A02;
        if (context != null) {
            CoordinatorLayout coordinatorLayout = this.A05;
            if (coordinatorLayout == null || (expressionsTrayView = (ExpressionsTrayView) coordinatorLayout.findViewById(2131430746)) == null) {
                this.A0E = new ExpressionsTrayView(context, (AttributeSet) null, 0, A0S(), (AnonymousClass1BI) null, 2, r11);
                BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
                bottomSheetBehavior.A0d(true);
                int i = 4;
                if (A0T()) {
                    i = 3;
                }
                bottomSheetBehavior.A0W(i);
                bottomSheetBehavior.A0V(context.getResources().getDimensionPixelOffset(2131166738));
                C37891qK r1 = new C37891qK(-1, -1);
                r1.A00(bottomSheetBehavior);
                ExpressionsTrayView expressionsTrayView2 = this.A0E;
                if (expressionsTrayView2 != null) {
                    expressionsTrayView2.setLayoutParams(r1);
                }
                ViewGroup viewGroup = this.A05;
                if (viewGroup == null) {
                    View view = this.A0O;
                    if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
                        throw AnonymousClass000.A0k("layoutRoot isn't a viewGroup or is null");
                    }
                }
                viewGroup.addView(this.A0E);
                return;
            }
            this.A0E = expressionsTrayView;
        }
    }

    public static final void A05(AnonymousClass74J r4) {
        Integer num;
        int i;
        BottomSheetBehavior bottomSheetBehavior;
        BottomSheetBehavior bottomSheetBehavior2;
        BottomSheetBehavior bottomSheetBehavior3 = r4.A06;
        Integer num2 = null;
        if (bottomSheetBehavior3 != null) {
            num2 = Integer.valueOf(bottomSheetBehavior3.A0C);
        }
        r4.A0B(num2);
        if (r4.A0K) {
            ExpressionsTrayView expressionsTrayView = r4.A0E;
            if ((expressionsTrayView == null || expressionsTrayView.getVisibility() != 8) && (bottomSheetBehavior = r4.A06) != null && bottomSheetBehavior.A0J == 3) {
                i = bottomSheetBehavior.A0C;
            } else {
                ExpressionsTrayView expressionsTrayView2 = r4.A0E;
                if ((expressionsTrayView2 == null || expressionsTrayView2.getVisibility() != 8) && (bottomSheetBehavior2 = r4.A06) != null && bottomSheetBehavior2.A0J == 4) {
                    i = bottomSheetBehavior2.A0R();
                } else {
                    return;
                }
            }
            num = Integer.valueOf(i);
        } else {
            num = Integer.valueOf(A00(r4));
            r4.A0B(num);
        }
        r4.A0A(num);
    }

    public static final void A06(AnonymousClass74J r4) {
        Activity activity = r4.A01;
        if (activity != null) {
            KeyboardPopupLayout keyboardPopupLayout = r4.A08;
            if (keyboardPopupLayout != null) {
                keyboardPopupLayout.A09 = true;
            }
            A09(r4, false);
            ExpressionsTrayView expressionsTrayView = r4.A0E;
            if (expressionsTrayView != null) {
                expressionsTrayView.post(new C70733Ch(r4, activity, 49));
            }
        }
    }

    public static final void A07(AnonymousClass74J r2) {
        if (r2.A0K) {
            A03(r2.A0E, r2);
            int i = 4;
            if (r2.A0T()) {
                i = 3;
            }
            ExpressionsTrayView expressionsTrayView = r2.A0E;
            if (expressionsTrayView != null) {
                expressionsTrayView.A0F(i);
            }
        }
        ExpressionsTrayView expressionsTrayView2 = r2.A0E;
        if (expressionsTrayView2 != null) {
            expressionsTrayView2.A0C();
        }
        KeyboardPopupLayout keyboardPopupLayout = r2.A08;
        if (keyboardPopupLayout != null) {
            keyboardPopupLayout.A09 = false;
        }
    }

    public static final void A08(AnonymousClass74J r2) {
        ViewGroup.LayoutParams layoutParams;
        KeyboardPopupLayout keyboardPopupLayout = r2.A08;
        if (keyboardPopupLayout != null) {
            keyboardPopupLayout.A09 = false;
            keyboardPopupLayout.requestLayout();
        }
        WaEditText waEditText = r2.A09;
        if (waEditText != null) {
            waEditText.requestFocus();
        }
        r2.A0I();
        KeyboardPopupLayout keyboardPopupLayout2 = r2.A08;
        if (!(keyboardPopupLayout2 == null || (layoutParams = keyboardPopupLayout2.getLayoutParams()) == null)) {
            layoutParams.height = -1;
        }
        KeyboardPopupLayout keyboardPopupLayout3 = r2.A08;
        if (keyboardPopupLayout3 != null) {
            keyboardPopupLayout3.requestLayout();
        }
    }

    public static final void A09(AnonymousClass74J r2, boolean z) {
        ExpressionsTrayView expressionsTrayView = r2.A0E;
        if (expressionsTrayView != null) {
            expressionsTrayView.setVisibility(C72453Mb.A07(z ? 1 : 0));
        }
        C1605488x r0 = r2.A0D;
        if (z) {
            if (r0 != null) {
                r0.C5V();
            }
        } else if (r0 != null) {
            r0.Bvc();
        }
    }

    private final void A0A(Integer num) {
        int height;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (num != null) {
            BottomSheetBehavior bottomSheetBehavior = this.A06;
            if (bottomSheetBehavior == null || bottomSheetBehavior.A0J != 5) {
                ExpressionsTrayView expressionsTrayView = this.A0E;
                if (expressionsTrayView == null || expressionsTrayView.getVisibility() != 8) {
                    if (!this.A0K) {
                        KeyboardPopupLayout keyboardPopupLayout = this.A08;
                        if (!(keyboardPopupLayout == null || (layoutParams2 = keyboardPopupLayout.getLayoutParams()) == null)) {
                            layoutParams2.height = num.intValue();
                        }
                    } else {
                        CoordinatorLayout coordinatorLayout = this.A05;
                        if (coordinatorLayout != null && (height = coordinatorLayout.getHeight()) > 0) {
                            int intValue = height - num.intValue();
                            KeyboardPopupLayout keyboardPopupLayout2 = this.A08;
                            if (!(keyboardPopupLayout2 == null || (layoutParams = keyboardPopupLayout2.getLayoutParams()) == null)) {
                                layoutParams.height = intValue;
                            }
                        } else {
                            return;
                        }
                    }
                    KeyboardPopupLayout keyboardPopupLayout3 = this.A08;
                    if (keyboardPopupLayout3 != null) {
                        keyboardPopupLayout3.requestLayout();
                    }
                }
            }
        }
    }

    private final void A0B(Integer num) {
        ViewTreeObserver viewTreeObserver;
        ViewGroup.LayoutParams layoutParams;
        if (num != null) {
            View view = this.A03;
            if (!(view == null || (layoutParams = view.getLayoutParams()) == null)) {
                layoutParams.height = num.intValue();
            }
            View view2 = this.A03;
            if (view2 != null) {
                view2.requestLayout();
            }
            View view3 = this.A03;
            if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null) {
                AnonymousClass793.A00(viewTreeObserver, this, 7);
            }
        }
    }

    public void A0D() {
        BottomSheetBehavior bottomSheetBehavior;
        ExpressionsTrayView expressionsTrayView = this.A0E;
        if (!(expressionsTrayView == null || expressionsTrayView.getVisibility() == 8 || (bottomSheetBehavior = this.A06) == null || bottomSheetBehavior.A0J == 2)) {
            bottomSheetBehavior.A0W(5);
        }
        if (!this.A0K) {
            ExpressionsTrayView expressionsTrayView2 = this.A0E;
            if (expressionsTrayView2 != null) {
                expressionsTrayView2.A0E();
            }
            A09(this, false);
        }
    }

    public void A0E() {
        ViewTreeObserver viewTreeObserver;
        KeyboardPopupLayout keyboardPopupLayout;
        if (this instanceof C117275zV) {
            A0J();
            A0P((Integer) null, (Integer) null);
            C72453Mb.A1C(this.A0E);
            A0H();
            ExpressionsTrayView expressionsTrayView = this.A0E;
            if (expressionsTrayView != null) {
                expressionsTrayView.A0C();
                return;
            }
            return;
        }
        KeyboardPopupLayout keyboardPopupLayout2 = this.A08;
        if (keyboardPopupLayout2 == null || !AnonymousClass1L4.A00(keyboardPopupLayout2)) {
            A09(this, true);
            ExpressionsTrayView expressionsTrayView2 = this.A0E;
            if (!(expressionsTrayView2 == null || (viewTreeObserver = expressionsTrayView2.getViewTreeObserver()) == null)) {
                viewTreeObserver.addOnGlobalLayoutListener(new AnonymousClass794(this, 0, true));
            }
            WaEditText waEditText = this.A09;
            if (waEditText != null) {
                waEditText.A0H();
                return;
            }
            return;
        }
        if (this.A0K && (keyboardPopupLayout = this.A08) != null) {
            keyboardPopupLayout.A09 = true;
        }
        this.A0I = true;
        this.A0N = true;
        A0H();
        KeyboardPopupLayout keyboardPopupLayout3 = this.A08;
        if (keyboardPopupLayout3 != null) {
            keyboardPopupLayout3.postDelayed(C146747Ql.A00(this, 2), A02(this, 50));
        }
        if (A0R()) {
            AnonymousClass3SU r1 = this.A0G;
            if (r1 != null) {
                r1.A01 = new C149997jx(this);
                return;
            }
            return;
        }
        KeyboardPopupLayout keyboardPopupLayout4 = this.A08;
        if (keyboardPopupLayout4 != null) {
            keyboardPopupLayout4.postDelayed(C146747Ql.A00(this, 3), A02(this, 300));
        }
    }

    public void A0F() {
        boolean z = this instanceof C117275zV;
        ExpressionsTrayView expressionsTrayView = this.A0E;
        if (z) {
            if (expressionsTrayView != null) {
                expressionsTrayView.A0E();
            }
            C72453Mb.A1D(this.A0E);
            WaEditText waEditText = this.A09;
            if (waEditText != null) {
                waEditText.requestFocus();
            }
            WaEditText waEditText2 = this.A09;
            if (waEditText2 != null) {
                waEditText2.A0I(false);
            }
            A0I();
            return;
        }
        if (expressionsTrayView != null) {
            expressionsTrayView.A0E();
        }
        BottomSheetBehavior bottomSheetBehavior = this.A06;
        if (bottomSheetBehavior == null || bottomSheetBehavior.A0J != 3) {
            ExpressionsTrayView expressionsTrayView2 = this.A0E;
            if (expressionsTrayView2 == null || expressionsTrayView2.getVisibility() != 8) {
                KeyboardPopupLayout keyboardPopupLayout = this.A08;
                if (keyboardPopupLayout != null) {
                    keyboardPopupLayout.A09 = true;
                }
                A09(this, false);
                ExpressionsTrayView expressionsTrayView3 = this.A0E;
                if (expressionsTrayView3 != null) {
                    expressionsTrayView3.post(C146747Ql.A00(this, 4));
                    return;
                }
                return;
            }
            WaEditText waEditText3 = this.A09;
            if (waEditText3 != null) {
                waEditText3.requestFocus();
            }
            WaEditText waEditText4 = this.A09;
            if (waEditText4 != null) {
                waEditText4.A0I(false);
                return;
            }
            return;
        }
        this.A0M = true;
        int i = 4;
        if (A0T()) {
            i = 5;
        }
        bottomSheetBehavior.A0W(i);
    }

    public final void A0G() {
        ExpressionsTrayView expressionsTrayView = this.A0E;
        if (expressionsTrayView != null) {
            expressionsTrayView.A0D();
        }
        BaseExpressionsTray baseExpressionsTray = this.A0B;
        if (baseExpressionsTray != null) {
            ExpressionsSearchView expressionsSearchView = (ExpressionsSearchView) baseExpressionsTray;
            expressionsSearchView.A0N = null;
            expressionsSearchView.A0E = null;
            expressionsSearchView.A0J = null;
        }
        this.A0B = null;
        EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = this.A0A;
        if (emojiSearchKeyboardContainer != null) {
            emojiSearchKeyboardContainer.setOnTouchListener((View.OnTouchListener) null);
            emojiSearchKeyboardContainer.A09 = null;
        }
        this.A09 = null;
        this.A02 = null;
        this.A01 = null;
        this.A04 = null;
        this.A0O = null;
        this.A0C = null;
        this.A03 = null;
        this.A05 = null;
        this.A08 = null;
        this.A0E = null;
        this.A0A = null;
        this.A07 = null;
        this.A0F = null;
        this.A0G = null;
        this.A0H = null;
        this.A06 = null;
    }

    public final void A0I() {
        String str;
        Resources resources;
        KeyboardPopupLayout keyboardPopupLayout = this.A08;
        if (keyboardPopupLayout == null || (resources = keyboardPopupLayout.getResources()) == null) {
            str = null;
        } else {
            str = resources.getString(2131890250);
        }
        ImageButton imageButton = this.A04;
        if (imageButton != null) {
            imageButton.setImageResource(2131232116);
        }
        ImageButton imageButton2 = this.A04;
        if (imageButton2 != null) {
            imageButton2.setContentDescription(str);
        }
    }

    public final void A0J() {
        String str;
        Resources resources;
        KeyboardPopupLayout keyboardPopupLayout = this.A08;
        if (keyboardPopupLayout == null || (resources = keyboardPopupLayout.getResources()) == null) {
            str = null;
        } else {
            str = resources.getString(2131891546);
        }
        ImageButton imageButton = this.A04;
        if (imageButton != null) {
            imageButton.setImageResource(2131232028);
        }
        ImageButton imageButton2 = this.A04;
        if (imageButton2 != null) {
            imageButton2.setContentDescription(str);
        }
    }

    public void A0M(AnonymousClass1GP r4, int i) {
        this.A00 = i;
        this.A0K = false;
        A04(r4);
        ExpressionsTrayView expressionsTrayView = this.A0E;
        View view = null;
        if (expressionsTrayView != null) {
            view = expressionsTrayView.findViewById(2131430747);
        }
        this.A03 = view;
        this.A0S.A01((Integer) null);
        ExpressionsTrayView expressionsTrayView2 = this.A0E;
        if (expressionsTrayView2 != null) {
            expressionsTrayView2.setExpressionsSearchListener(this.A0T);
            expressionsTrayView2.setVisibility(8);
            expressionsTrayView2.A0j.setVisibility(8);
        }
        A05(this);
    }

    public void A0O(Integer num, Integer num2) {
        if (this instanceof C117275zV) {
            C117275zV r2 = (C117275zV) this;
            LockableCoodinatorLayout lockableCoodinatorLayout = r2.A00;
            if (lockableCoodinatorLayout != null && !lockableCoodinatorLayout.A01) {
                lockableCoodinatorLayout.A01 = true;
                ExpressionsTrayView expressionsTrayView = r2.A0E;
                if (expressionsTrayView == null || expressionsTrayView.getVisibility() == 0) {
                    r2.A0F();
                } else {
                    r2.A0E();
                }
                lockableCoodinatorLayout.A01 = false;
                return;
            }
            return;
        }
        KeyboardPopupLayout keyboardPopupLayout = this.A08;
        if (keyboardPopupLayout == null || !keyboardPopupLayout.A09) {
            ExpressionsTrayView expressionsTrayView2 = this.A0E;
            if (expressionsTrayView2 == null || expressionsTrayView2.getVisibility() != 8) {
                A0F();
                return;
            }
            A0J();
            A0P(num, num2);
            A0E();
        }
    }

    public final void A0P(Integer num, Integer num2) {
        EmojiSearchKeyboardContainer emojiSearchKeyboardContainer;
        ExpressionsTrayView expressionsTrayView = this.A0E;
        if (expressionsTrayView != null) {
            expressionsTrayView.A0G(num, (Integer) null, (Integer) null, num2, A0C());
            EmojiSearchKeyboardContainer emojiSearchKeyboardContainer2 = this.A0A;
            if (emojiSearchKeyboardContainer2 != null && emojiSearchKeyboardContainer2.getVisibility() == 0 && (emojiSearchKeyboardContainer = this.A0A) != null) {
                emojiSearchKeyboardContainer.A03();
            }
        }
    }

    public void A0Q(boolean z) {
        ViewTreeObserver viewTreeObserver;
        CoordinatorLayout coordinatorLayout = this.A05;
        if (coordinatorLayout != null && (viewTreeObserver = coordinatorLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new AnonymousClass794(this, 1, z));
        }
    }

    public final boolean A0U() {
        ExpressionsTrayView expressionsTrayView = this.A0E;
        if (expressionsTrayView == null || expressionsTrayView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public AnonymousClass74J(C19830z4 r2, C1193267r r3, EmojiSearchProvider emojiSearchProvider, C131196kh r5, AnonymousClass1L4 r6) {
        this.A0U = r6;
        this.A0Q = r3;
        this.A0S = emojiSearchProvider;
        this.A0P = r2;
        this.A0R = r5;
    }

    public int A0C() {
        return 14;
    }

    public final void A0H() {
        BottomSheetBehavior bottomSheetBehavior;
        SharedPreferences.Editor A002;
        String str;
        Resources resources;
        Configuration configuration;
        int A012 = A01(this);
        if (A012 > 0 && (bottomSheetBehavior = this.A06) != null && bottomSheetBehavior.A0C > A012) {
            Context context = this.A02;
            if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 1) {
                C19830z4 r1 = this.A0P;
                if (r1.A07() != A012) {
                    A002 = C19830z4.A00(r1);
                    str = "expressions_tray_peek_height_landscape";
                }
            } else {
                C19830z4 r12 = this.A0P;
                if (r12.A08() != A012) {
                    A002 = C19830z4.A00(r12);
                    str = "expressions_tray_peek_height_portrait";
                }
            }
            C17880vN.A1C(A002, str, A012);
            BottomSheetBehavior bottomSheetBehavior2 = this.A06;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.A0V(A012);
            }
        }
        WaEditText waEditText = this.A09;
        if (waEditText != null) {
            waEditText.A0H();
        }
    }

    public void A0L(Activity activity, Context context, View view, ImageButton imageButton, CoordinatorLayout coordinatorLayout, KeyboardPopupLayout keyboardPopupLayout, WaEditText waEditText, EmojiSearchKeyboardContainer emojiSearchKeyboardContainer, AnonymousClass3SU r12, boolean z) {
        C18070vi.A0h(context, view);
        this.A09 = waEditText;
        this.A02 = context;
        this.A01 = activity;
        this.A04 = imageButton;
        this.A05 = coordinatorLayout;
        this.A08 = keyboardPopupLayout;
        this.A0A = emojiSearchKeyboardContainer;
        this.A0O = view;
        this.A0G = r12;
        if (z) {
            int A002 = C19740yt.A00(activity, 2131103238);
            C109455dT r1 = new C109455dT(activity, 2131232116);
            r1.A00(A002, 1.0f);
            r1.A03 = null;
            r1.invalidateSelf();
            if (imageButton != null) {
                imageButton.setBackground(r1);
            }
        }
    }

    public boolean A0R() {
        return false;
    }
}
