package com.whatsapp.expressionstray;

import X.A59;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1DT;
import X.AnonymousClass1F9;
import X.AnonymousClass1FL;
import X.AnonymousClass1GP;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L4;
import X.AnonymousClass1LU;
import X.AnonymousClass1Y1;
import X.AnonymousClass1Y5;
import X.AnonymousClass1ZG;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4I5;
import X.AnonymousClass4Z7;
import X.AnonymousClass606;
import X.AnonymousClass778;
import X.AnonymousClass781;
import X.AnonymousClass78O;
import X.AnonymousClass7AT;
import X.AnonymousClass7BO;
import X.AnonymousClass7z0;
import X.AnonymousClass82G;
import X.AnonymousClass873;
import X.AnonymousClass874;
import X.AnonymousClass876;
import X.AnonymousClass87C;
import X.AnonymousClass88B;
import X.C000200d;
import X.C106865Xm;
import X.C106875Xn;
import X.C106885Xo;
import X.C107845ai;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C109595dh;
import X.C111025hp;
import X.C111835kV;
import X.C117225zQ;
import X.C117235zR;
import X.C117245zS;
import X.C117255zT;
import X.C117265zU;
import X.C127246e2;
import X.C137716vu;
import X.C138646xS;
import X.C1402070k;
import X.C1422678u;
import X.C142737Ap;
import X.C149917jp;
import X.C149927jq;
import X.C149937jr;
import X.C149947js;
import X.C149967ju;
import X.C1605588y;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18090vk;
import X.C18100vl;
import X.C18600wl;
import X.C19740yt;
import X.C19830z4;
import X.C22821Di;
import X.C25291Nq;
import X.C27011Uj;
import X.C27691Xc;
import X.C28931bI;
import X.C30391dr;
import X.C37581pm;
import X.C41561wd;
import X.C72453Mb;
import X.C72463Mc;
import X.C84074Ht;
import X.C84084Hu;
import X.C88604aC;
import X.C96004n9;
import X.C99654tF;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.util.Log;
import java.util.List;

public final class ExpressionsTrayView extends LinearLayout implements AnonymousClass009 {
    public int A00;
    public ViewPager A01;
    public C107845ai A02;
    public AnonymousClass1KB A03;
    public C19830z4 A04;
    public C18000vb A05;
    public A59 A06;
    public AnonymousClass873 A07;
    public AnonymousClass874 A08;
    public C106865Xm A09;
    public C106875Xn A0A;
    public C106885Xo A0B;
    public C127246e2 A0C;
    public C127246e2 A0D;
    public C127246e2 A0E;
    public C111025hp A0F;
    public C138646xS A0G;
    public C1605588y A0H;
    public C18030ve A0I;
    public AnonymousClass87C A0J;
    public AnonymousClass1LU A0K;
    public AnonymousClass1BI A0L;
    public AnonymousClass88B A0M;
    public AnonymousClass1L4 A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public AnonymousClass031 A0Q;
    public C22821Di A0R;
    public C18600wl A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public int A0W;
    public View A0X;
    public FrameLayout A0Y;
    public WaImageView A0Z;
    public final View.OnTouchListener A0a;
    public final View A0b;
    public final ViewGroup A0c;
    public final FrameLayout A0d;
    public final MaterialButton A0e;
    public final MaterialButton A0f;
    public final MaterialButton A0g;
    public final MaterialButton A0h;
    public final MaterialButtonToggleGroup A0i;
    public final WaImageView A0j;
    public final WaTextView A0k;
    public final C18100vl A0l;
    public final C18100vl A0m;
    public final Handler A0n;
    public final View A0o;
    public final View A0p;
    public final LinearLayout A0q;
    public final ConstraintLayout A0r;
    public final AnonymousClass1GP A0s;
    public final C18100vl A0t;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExpressionsTrayView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false, (AnonymousClass1BI) null, 2, (AnonymousClass1GP) null);
        C18070vi.A0d(context, 1);
    }

    public static final boolean A0A(MotionEvent motionEvent, ExpressionsTrayView expressionsTrayView) {
        int action = motionEvent.getAction();
        if (action == 0) {
            ExpressionsTrayViewModel expressionsViewModel = expressionsTrayView.getExpressionsViewModel();
            AnonymousClass3MX.A1Q(new ExpressionsTrayViewModel$onEmojiBackspaceClick$1(expressionsViewModel, (C30391dr) null), C41561wd.A00(expressionsViewModel));
            expressionsTrayView.A0n.sendEmptyMessageDelayed(0, (long) ViewConfiguration.getKeyRepeatTimeout());
            expressionsTrayView.getExpressionUserJourneyLogger().A03(41, 1, 4);
            return true;
        } else if (action != 1 && action != 3) {
            return false;
        } else {
            expressionsTrayView.A0n.removeMessages(0);
            return true;
        }
    }

    public static /* synthetic */ void getCurrentBottomSheetState$annotations() {
    }

    public static /* synthetic */ void getLatencySensitiveDispatcher$annotations() {
    }

    public static final void setBrowserTabsClickListeners$lambda$10(ExpressionsTrayView expressionsTrayView, View view) {
        C18070vi.A0d(expressionsTrayView, 0);
        expressionsTrayView.A04(C117255zT.A00);
    }

    public static final void setBrowserTabsClickListeners$lambda$7(ExpressionsTrayView expressionsTrayView, View view) {
        C18070vi.A0d(expressionsTrayView, 0);
        expressionsTrayView.A04(C117235zR.A00);
    }

    public static final void setBrowserTabsClickListeners$lambda$8(ExpressionsTrayView expressionsTrayView, View view) {
        C18070vi.A0d(expressionsTrayView, 0);
        expressionsTrayView.A04(C117245zS.A00);
    }

    public static final void setBrowserTabsClickListeners$lambda$9(ExpressionsTrayView expressionsTrayView, View view) {
        C18070vi.A0d(expressionsTrayView, 0);
        expressionsTrayView.A04(C117225zQ.A00);
    }

    public static /* synthetic */ void setExpressionsTabs$default(ExpressionsTrayView expressionsTrayView, int i, Integer num, Integer num2, Integer num3, Integer num4, int i2, Object obj) {
        Integer num5 = num3;
        Integer num6 = num2;
        Integer num7 = num;
        Integer num8 = null;
        if ((i2 & 2) != 0) {
            num7 = null;
        }
        if ((i2 & 4) != 0) {
            num6 = null;
        }
        if ((i2 & 8) != 0) {
            num5 = null;
        }
        if ((i2 & 16) == 0) {
            num8 = num4;
        }
        expressionsTrayView.A0G(num7, num6, num5, num8, i);
    }

    private final void setTabsPadding(boolean z) {
        int i;
        if (z) {
            i = getResources().getDimensionPixelOffset(2131166745);
        } else {
            i = 0;
        }
        this.A0i.setPadding(i, 0, i, 0);
    }

    public final void A0D() {
        setCurrentChatJid((AnonymousClass1BI) null);
        this.A0J = null;
        this.A0M = null;
        this.A07 = null;
        setExpressionsSheetHandleClickListener((View.OnClickListener) null);
        this.A02 = null;
        this.A0H = null;
        this.A0F = null;
        this.A0B = null;
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A0I = r2;
    }

    public final void setAvatarEditorLauncherLazy(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0O = r2;
    }

    public final void setAvatarLogger(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0P = r2;
    }

    public final void setExpressionUserJourneyLogger(A59 a59) {
        C18070vi.A0d(a59, 0);
        this.A06 = a59;
    }

    public final void setExpressionsMultiSelectListener(C106865Xm r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public final void setExpressionsSearchListener(C1605588y r2) {
        C18070vi.A0d(r2, 0);
        this.A0H = r2;
    }

    public final void setGlobalUI(AnonymousClass1KB r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setImeUtils(AnonymousClass1L4 r2) {
        C18070vi.A0d(r2, 0);
        this.A0N = r2;
    }

    public final void setLatencySensitiveDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A0S = r2;
    }

    public final void setSendStickerPackListener(C106875Xn r2) {
        C18070vi.A0d(r2, 0);
        this.A0A = r2;
    }

    public final void setStickerExpressionsDataSource(C138646xS r2) {
        C18070vi.A0d(r2, 0);
        this.A0G = r2;
    }

    public final void setTabSelectionListener(C106885Xo r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = r2;
    }

    public final void setWaIntents(AnonymousClass1LU r2) {
        C18070vi.A0d(r2, 0);
        this.A0K = r2;
    }

    public final void setWaSharedPreferences(C19830z4 r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    private final void A01() {
        String A0n2 = C72463Mc.A0n(this.A0L);
        AnonymousClass1GP r1 = this.A0s;
        if (r1 == null) {
            Activity A052 = AnonymousClass3Ma.A05(this);
            C18070vi.A0z(A052, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            r1 = AnonymousClass3MX.A0O((AnonymousClass1FL) A052);
        }
        this.A0F = new C111025hp(r1, A0n2, getExpressionsViewModel().A00, false, false);
    }

    private final void A02() {
        int i;
        C127246e2 r0 = this.A0C;
        if (((r0 != null && !(r0 instanceof C117235zR)) || this.A0q.getVisibility() == 0) && C25291Nq.A04(getAbProps(), 7929) && this.A00 == 1) {
            Rect A072 = AnonymousClass3MW.A07();
            if (getGlobalVisibleRect(A072)) {
                ViewGroup.MarginLayoutParams A0P2 = C72463Mc.A0P(this.A0r);
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131166739);
                int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(2131166740);
                float height = ((float) (A072.height() - this.A0W)) / ((float) (getHeight() - this.A0W));
                int i2 = (int) (((float) dimensionPixelOffset) * height);
                int i3 = 0;
                if (0 < i2) {
                    i3 = i2;
                }
                int i4 = (int) (((float) dimensionPixelOffset2) * height);
                int i5 = 0;
                if (0 < i4) {
                    i5 = i4;
                }
                C18100vl r9 = this.A0l;
                if (C72453Mb.A1a(r9)) {
                    int dimensionPixelOffset3 = (int) (((float) (getResources().getDimensionPixelOffset(2131166742) + dimensionPixelOffset)) * height);
                    i = 0;
                    if (0 < dimensionPixelOffset3) {
                        i = dimensionPixelOffset3;
                    }
                } else {
                    i = i3;
                }
                if ((this.A0C instanceof C117235zR) || C72453Mb.A08(getContext()) == 2) {
                    this.A0q.setVisibility(8);
                    View view = this.A0b;
                    AnonymousClass3MX.A1F(view, dimensionPixelOffset);
                    view.setPadding(0, 0, 0, 0);
                    return;
                }
                if (C72453Mb.A1a(r9)) {
                    AnonymousClass3MX.A0v(this.A0m).A04(0);
                }
                LinearLayout linearLayout = this.A0q;
                linearLayout.setVisibility(0);
                AnonymousClass3MX.A1F(linearLayout, i);
                View view2 = this.A0b;
                view2.getLayoutParams().height = dimensionPixelOffset + i3;
                int i6 = i3 - dimensionPixelOffset;
                A0P2.topMargin = i6;
                view2.setPadding(i5, i3, 0, 0);
                this.A0p.setPadding(i5 - dimensionPixelOffset2, i6, 0, 0);
            }
        }
    }

    public static final void A03(View.OnTouchListener onTouchListener, ExpressionsTrayView expressionsTrayView, C18090vk r5, int i, int i2) {
        FrameLayout frameLayout = expressionsTrayView.A0Y;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        WaImageView waImageView = expressionsTrayView.A0Z;
        if (waImageView != null) {
            waImageView.setImageResource(i);
            AnonymousClass3MY.A0w(waImageView.getContext(), waImageView, i2);
            AnonymousClass78O.A00(waImageView, r5, 6);
            if (onTouchListener != null) {
                waImageView.setLongClickable(true);
                waImageView.setOnTouchListener(onTouchListener);
            } else {
                waImageView.setLongClickable(false);
                waImageView.setOnTouchListener((View.OnTouchListener) null);
            }
        }
        C72453Mb.A1D(expressionsTrayView.A0X);
    }

    private final void A04(C127246e2 r5) {
        C127246e2 r0 = this.A0D;
        if (r0 != null) {
            getExpressionUserJourneyLogger().A03(Integer.valueOf(C1402070k.A01(r5)), 1, C1402070k.A00(r0));
        }
    }

    public static final void A05(ExpressionsTrayView expressionsTrayView) {
        C108975cc.A0r(expressionsTrayView.A0Y);
        WaImageView waImageView = expressionsTrayView.A0Z;
        if (waImageView != null) {
            waImageView.setImageResource(2131233283);
            waImageView.setOnClickListener(new AnonymousClass781(7));
        }
    }

    public static final void A08(ExpressionsTrayView expressionsTrayView, int i, boolean z) {
        C127246e2 r1;
        if (z) {
            if (i == 2131430352) {
                r1 = C117235zR.A00;
            } else if (i == 2131431146) {
                r1 = C117245zS.A00;
            } else if (i == 2131428000) {
                r1 = C117225zQ.A00;
            } else if (i == 2131435784) {
                r1 = C117255zT.A00;
            } else {
                return;
            }
            expressionsTrayView.getExpressionsViewModel().A0U(r1);
        }
    }

    public static final void A09(ExpressionsTrayView expressionsTrayView, C117265zU r8) {
        List list;
        C111025hp r0;
        Fragment fragment;
        WaTextView waTextView;
        int i;
        C37581pm r5;
        List list2 = r8.A03;
        C111025hp r02 = expressionsTrayView.A0F;
        if (r02 != null) {
            list = r02.A04;
        } else {
            list = null;
        }
        if (!C18070vi.A18(list2, list)) {
            int i2 = 8;
            expressionsTrayView.A0f.setVisibility(C72453Mb.A07(list2.contains(C117235zR.A00) ? 1 : 0));
            expressionsTrayView.A0g.setVisibility(C72453Mb.A07(list2.contains(C117245zS.A00) ? 1 : 0));
            expressionsTrayView.A0e.setVisibility(C72453Mb.A07(list2.contains(C117225zQ.A00) ? 1 : 0));
            MaterialButton materialButton = expressionsTrayView.A0h;
            if (list2.contains(C117255zT.A00)) {
                i2 = 0;
            }
            materialButton.setVisibility(i2);
            C111025hp r03 = expressionsTrayView.A0F;
            if (r03 != null) {
                r03.A04 = list2;
                r03.A04();
            }
        }
        expressionsTrayView.setTabsPadding(C108975cc.A1B(list2.size()));
        C127246e2 r4 = r8.A02;
        int i3 = r8.A00;
        boolean z = r8.A04;
        if (i3 >= 0 && (r0 = expressionsTrayView.A0F) != null && i3 < r0.A04.size()) {
            C106885Xo r04 = expressionsTrayView.A0B;
            if (r04 != null) {
                boolean z2 = r4 instanceof C117235zR;
                MentionableEntry mentionableEntry = ((C96004n9) r04).A00.A3Z;
                if (z2) {
                    mentionableEntry.requestFocus();
                } else {
                    mentionableEntry.clearFocus();
                }
            }
            C111025hp r05 = expressionsTrayView.A0F;
            if (r05 != null) {
                r05.A02 = r4;
            }
            AnonymousClass874 r2 = null;
            if (r05 != null) {
                fragment = (Fragment) r05.A01.get(i3);
            } else {
                fragment = null;
            }
            if ((fragment instanceof AnonymousClass874) && (r2 = (AnonymousClass874) fragment) != null) {
                r2.CJE(true);
            }
            AnonymousClass874 r1 = expressionsTrayView.A08;
            if (r1 != null && !r1.equals(r2)) {
                r1.CJE(false);
            }
            C127246e2 r06 = expressionsTrayView.A0C;
            C117255zT r52 = C117255zT.A00;
            if (C18070vi.A18(r06, r52)) {
                expressionsTrayView.A0B();
            }
            expressionsTrayView.A08 = r2;
            expressionsTrayView.A0C = r4;
            expressionsTrayView.A02();
            try {
                ViewPager viewPager = expressionsTrayView.A01;
                if (viewPager != null) {
                    viewPager.setCurrentItem(i3);
                }
            } catch (IllegalStateException e) {
                C108945cZ.A0p(expressionsTrayView.getAvatarLogger()).A02(2, "failed_to_select_current_tab_on_browser_content", e.getMessage());
            }
            if (C18070vi.A18(r4, C117235zR.A00)) {
                if (expressionsTrayView.getExpressionsViewModel().A00 == 7 || expressionsTrayView.getExpressionsViewModel().A00 == 1) {
                    A05(expressionsTrayView);
                } else {
                    A03(expressionsTrayView.A0a, expressionsTrayView, new C149947js(expressionsTrayView), 2131231715, 2131886910);
                }
                MaterialButtonToggleGroup.A01(expressionsTrayView.A0i, 2131430352, true);
            } else {
                if (C18070vi.A18(r4, C117245zS.A00)) {
                    A05(expressionsTrayView);
                    MaterialButtonToggleGroup.A01(expressionsTrayView.A0i, 2131431146, true);
                    waTextView = expressionsTrayView.A0k;
                    i = 2131890775;
                } else if (C18070vi.A18(r4, C117225zQ.A00)) {
                    if (z) {
                        A03((View.OnTouchListener) null, expressionsTrayView, new C149937jr(expressionsTrayView), 2131233213, 2131886889);
                    } else {
                        A05(expressionsTrayView);
                    }
                    MaterialButtonToggleGroup.A01(expressionsTrayView.A0i, 2131428000, true);
                    waTextView = expressionsTrayView.A0k;
                    i = 2131886867;
                } else if (C18070vi.A18(r4, r52)) {
                    if (C25291Nq.A04(expressionsTrayView.getAbProps(), 8964)) {
                        AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(expressionsTrayView);
                        if (A002 != null) {
                            r5 = AnonymousClass3MZ.A0H(A002);
                        } else {
                            r5 = null;
                        }
                        if (expressionsTrayView.A00 != 1 || r5 == null) {
                            A05(expressionsTrayView);
                        } else {
                            C138646xS stickerExpressionsDataSource = expressionsTrayView.getStickerExpressionsDataSource();
                            C88604aC.A03(r5, AnonymousClass4I5.A00(expressionsTrayView.getLatencySensitiveDispatcher(), C108955ca.A0I(new ExpressionsTrayView$onStickersTabSelected$1(expressionsTrayView, (C30391dr) null), AnonymousClass4Z7.A01(AnonymousClass606.A00, stickerExpressionsDataSource.A02, stickerExpressionsDataSource.A03, C99654tF.A00()))));
                        }
                    } else {
                        A03((View.OnTouchListener) null, expressionsTrayView, new C149967ju(expressionsTrayView), 2131233127, 2131896498);
                    }
                    MaterialButtonToggleGroup.A01(expressionsTrayView.A0i, 2131435784, true);
                    waTextView = expressionsTrayView.A0k;
                    i = 2131896531;
                }
                waTextView.setText(i);
            }
        }
        expressionsTrayView.setDynamicAvatarIcon(r8.A01, r4);
    }

    /* access modifiers changed from: private */
    public final ExpressionsTrayViewModel getExpressionsViewModel() {
        return (ExpressionsTrayViewModel) this.A0t.getValue();
    }

    private final C28931bI getSearchCategories() {
        return AnonymousClass3MX.A0v(this.A0m);
    }

    private final void setDynamicAvatarIcon(Bitmap bitmap, C127246e2 r5) {
        if (bitmap != null) {
            MaterialButton materialButton = this.A0e;
            materialButton.setIconTint((ColorStateList) null);
            materialButton.setIcon(C108965cb.A05(bitmap, this));
            if (!C18070vi.A18(r5, C117225zQ.A00)) {
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(0.0f);
                Drawable drawable = materialButton.A01;
                if (drawable != null) {
                    drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    return;
                }
                return;
            }
            Drawable drawable2 = materialButton.A01;
            if (drawable2 != null) {
                drawable2.clearColorFilter();
                return;
            }
            return;
        }
        Context context = getContext();
        if (context != null) {
            MaterialButton materialButton2 = this.A0e;
            materialButton2.setIconTint(C19740yt.A03(context, 2131231471));
            materialButton2.setIconResource(getAvatarIconRes());
        }
    }

    public final void A0G(Integer num, Integer num2, Integer num3, Integer num4, int i) {
        C111025hp r0 = this.A0F;
        int i2 = i;
        if (r0 != null) {
            r0.A00 = i;
        }
        if (getExpressionsViewModel().A00 == 7) {
            this.A0c.setBackgroundColor(getResources().getColor(2131103061));
        }
        ExpressionsTrayViewModel expressionsViewModel = getExpressionsViewModel();
        AnonymousClass3MX.A1Q(new ExpressionsTrayViewModel$onTabsUpdated$1(expressionsViewModel, num, num3, num2, num4, (C30391dr) null, i2), C41561wd.A00(expressionsViewModel));
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0Q;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0Q = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass00H getAvatarEditorLauncherLazy() {
        AnonymousClass00H r0 = this.A0O;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("avatarEditorLauncherLazy");
        throw null;
    }

    public final AnonymousClass00H getAvatarLogger() {
        AnonymousClass00H r0 = this.A0P;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("avatarLogger");
        throw null;
    }

    public final A59 getExpressionUserJourneyLogger() {
        A59 a59 = this.A06;
        if (a59 != null) {
            return a59;
        }
        C18070vi.A11("expressionUserJourneyLogger");
        throw null;
    }

    public final AnonymousClass1KB getGlobalUI() {
        AnonymousClass1KB r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }

    public final AnonymousClass1L4 getImeUtils() {
        AnonymousClass1L4 r0 = this.A0N;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("imeUtils");
        throw null;
    }

    public final C18600wl getLatencySensitiveDispatcher() {
        C18600wl r0 = this.A0S;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("latencySensitiveDispatcher");
        throw null;
    }

    public final C138646xS getStickerExpressionsDataSource() {
        C138646xS r0 = this.A0G;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("stickerExpressionsDataSource");
        throw null;
    }

    public final AnonymousClass1LU getWaIntents() {
        AnonymousClass1LU r0 = this.A0K;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    public final C19830z4 getWaSharedPreferences() {
        C19830z4 r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waSharedPreferences");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final void setAdapterFunStickerData(AnonymousClass778 r2) {
        C111025hp r0 = this.A0F;
        if (r0 != null) {
            r0.A03 = r2;
        }
    }

    public final void setCurrentChatJid(AnonymousClass1BI r2) {
        this.A0L = r2;
        ExpressionsTrayViewModel expressionsViewModel = getExpressionsViewModel();
        expressionsViewModel.A03 = r2;
        expressionsViewModel.A09.A00.setValue(r2);
    }

    public final void setExpressionsSheetHandleClickListener(View.OnClickListener onClickListener) {
        this.A0j.setOnClickListener(onClickListener);
    }

    public static final void A06(ExpressionsTrayView expressionsTrayView) {
        expressionsTrayView.getExpressionsViewModel().A0T();
    }

    public static final void A07(ExpressionsTrayView expressionsTrayView) {
        expressionsTrayView.getExpressionsViewModel().A0T();
    }

    private final int getAvatarIconRes() {
        if (C18020vd.A05(C18040vf.A01, getAbProps(), 9398)) {
            return 2131231709;
        }
        return 2131232292;
    }

    public final void A0B() {
        int size;
        StickerExpressionsFragment stickerExpressionsFragment;
        C111835kV r1;
        if (C25291Nq.A04(getAbProps(), 8964)) {
            C111025hp r6 = this.A0F;
            if (r6 != null && (size = r6.A04.size()) >= 0) {
                int i = 0;
                while (true) {
                    Fragment fragment = (Fragment) r6.A01.get(i);
                    if ((fragment instanceof StickerExpressionsFragment) && (stickerExpressionsFragment = (StickerExpressionsFragment) fragment) != null && (r1 = stickerExpressionsFragment.A0F) != null && r1.A03) {
                        r1.A0H.clear();
                        r1.A0X();
                        r1.A03 = false;
                        r1.A0X();
                        C72453Mb.A1D(stickerExpressionsFragment.A0J);
                        View view = stickerExpressionsFragment.A03;
                        if (view != null) {
                            view.setVisibility(0);
                        }
                        r1.notifyDataSetChanged();
                    }
                    if (i == size) {
                        break;
                    }
                    i++;
                }
            }
            this.A0d.setVisibility(0);
        }
    }

    public final void A0C() {
        AnonymousClass876 r1;
        if (getExpressionsViewModel().A00 == 7) {
            this.A0c.setBackgroundColor(getResources().getColor(2131103061));
        }
        if (this.A0F == null) {
            A01();
        }
        C111025hp r4 = this.A0F;
        if (r4 != null && !r4.A05) {
            r4.A05 = true;
            int size = r4.A04.size();
            if (size >= 0) {
                int i = 0;
                while (true) {
                    Fragment fragment = (Fragment) r4.A01.get(i);
                    if ((fragment instanceof AnonymousClass876) && (r1 = (AnonymousClass876) fragment) != null) {
                        r1.BpD();
                    }
                    if (i != size) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void A0E() {
        getExpressionsViewModel().A07.A02();
        C111025hp r1 = this.A0F;
        if (r1 != null) {
            r1.A05 = false;
        }
    }

    public final void A0F(int i) {
        Rect A072 = AnonymousClass3MW.A07();
        if (getGlobalVisibleRect(A072)) {
            int height = getHeight() - A072.height();
            if (i == 1) {
                ViewGroup viewGroup = this.A0c;
                viewGroup.setPadding(viewGroup.getPaddingLeft(), 1, viewGroup.getPaddingRight(), height);
            } else if (i == 3) {
                ViewGroup viewGroup2 = this.A0c;
                viewGroup2.setPadding(viewGroup2.getPaddingLeft(), 1, viewGroup2.getPaddingRight(), 0);
            } else if (i == 4) {
                ViewGroup viewGroup3 = this.A0c;
                viewGroup3.setPadding(viewGroup3.getPaddingLeft(), 1, viewGroup3.getPaddingRight(), height);
                this.A0W = A072.height();
            }
            A02();
        }
    }

    public final void A0H(String str) {
        ExpressionsTrayViewModel expressionsViewModel = getExpressionsViewModel();
        AnonymousClass3MX.A1Q(new ExpressionsTrayViewModel$onMoveToAvatarCategory$1(expressionsViewModel, str, (C30391dr) null), C41561wd.A00(expressionsViewModel));
    }

    public final void A0I(String str) {
        ExpressionsTrayViewModel expressionsViewModel = getExpressionsViewModel();
        AnonymousClass3MX.A1Q(new ExpressionsTrayViewModel$onMoveToStickerPage$1(expressionsViewModel, str, (C30391dr) null, false), C41561wd.A00(expressionsViewModel));
    }

    public final void A0J(String str) {
        ExpressionsTrayViewModel expressionsViewModel = getExpressionsViewModel();
        AnonymousClass3MX.A1Q(new ExpressionsTrayViewModel$onMoveToStickerTab$1(expressionsViewModel, (C30391dr) null), C41561wd.A00(expressionsViewModel));
        ExpressionsTrayViewModel expressionsViewModel2 = getExpressionsViewModel();
        AnonymousClass3MX.A1Q(new ExpressionsTrayViewModel$onSearchStarted$1(expressionsViewModel2, str, (C30391dr) null), C41561wd.A00(expressionsViewModel2));
    }

    public final AnonymousClass1BI getCurrentChatJid() {
        return this.A0L;
    }

    public final AnonymousClass1GP getFragmentManager() {
        return this.A0s;
    }

    public final ViewGroup getRootView() {
        return this.A0c;
    }

    public final int getSurfaceOrigin() {
        return this.A00;
    }

    public void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        if (this.A0F == null) {
            A01();
        }
        ViewPager viewPager = this.A01;
        if (viewPager != null) {
            viewPager.setLayoutDirection(AnonymousClass3MW.A1Z(getWhatsAppLocale()) ? 1 : 0);
            C111025hp r1 = this.A0F;
            if (r1 != null) {
                viewPager.setOffscreenPageLimit(r1.A04.size());
            } else {
                r1 = null;
            }
            viewPager.setAdapter(r1);
            viewPager.A0K(new C142737Ap(this, 0));
        }
        MaterialButton materialButton = this.A0f;
        AnonymousClass78O.A00(materialButton, this, 7);
        MaterialButton materialButton2 = this.A0g;
        AnonymousClass78O.A00(materialButton2, this, 8);
        MaterialButton materialButton3 = this.A0e;
        AnonymousClass78O.A00(materialButton3, this, 9);
        MaterialButton materialButton4 = this.A0h;
        AnonymousClass78O.A00(materialButton4, this, 10);
        MaterialButtonToggleGroup materialButtonToggleGroup = this.A0i;
        materialButtonToggleGroup.A06.add(new AnonymousClass7BO(this, 1));
        View view = this.A0b;
        AnonymousClass78O.A00(view, this, 11);
        AnonymousClass78O.A00(this.A0k, this, 12);
        AnonymousClass3MW.A1Q(view);
        AnonymousClass1DT r3 = getExpressionsViewModel().A05;
        AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(this);
        C18070vi.A0b(A002);
        AnonymousClass7AT.A01(A002, r3, new AnonymousClass7z0(this), 24);
        AnonymousClass1F9 A003 = AnonymousClass1ZG.A00(this);
        if (A003 != null) {
            AnonymousClass3MX.A1Q(new ExpressionsTrayView$observeExpressionsSideEffects$1$1(A003, this, (C30391dr) null), AnonymousClass3MZ.A0H(A003));
        }
        AnonymousClass3MY.A0w(getContext(), materialButton, 2131898950);
        AnonymousClass3MY.A0w(getContext(), materialButton2, 2131890773);
        AnonymousClass3MY.A0w(getContext(), materialButton3, 2131898717);
        AnonymousClass3MY.A0w(getContext(), materialButton4, 2131896514);
        this.A0U = true;
        if (C18020vd.A05(C18040vf.A02, getAbProps(), 10150)) {
            str = "ExpressionsTrayView/onAttachedToWindow/ExpressionTrayAATestEnabled";
        } else {
            str = "ExpressionsTrayView/onAttachedToWindow/ExpressionTrayAATestDisabled";
        }
        Log.i(str);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0U = false;
    }

    public final void setEmojiClickListener(C107845ai r1) {
        this.A02 = r1;
    }

    public final void setExpressionsDismissListener(AnonymousClass873 r1) {
        this.A07 = r1;
    }

    public final void setGifSelectionListener(AnonymousClass87C r1) {
        this.A0J = r1;
    }

    public final void setShapeSelectionListener(C22821Di r1) {
        this.A0R = r1;
    }

    public final void setStickerSelectionListener(AnonymousClass88B r1) {
        this.A0M = r1;
    }

    public final void setSurfaceOrigin(int i) {
        this.A00 = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsTrayView(Context context, AttributeSet attributeSet, int i, boolean z, AnonymousClass1BI r10, int i2, AnonymousClass1GP r12) {
        super(context, attributeSet, i);
        Resources.Theme theme;
        C18070vi.A0d(context, 1);
        if (!this.A0T) {
            this.A0T = true;
            C27691Xc r4 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r1 = r4.A10;
            this.A0I = AnonymousClass10E.A8r(r1);
            this.A0O = C000200d.A00(r4.A0z.A09);
            this.A0P = C000200d.A00(r1.A0V);
            AnonymousClass10G r2 = r1.A00;
            this.A06 = (A59) r2.A1h.get();
            this.A03 = AnonymousClass10E.A12(r1);
            this.A0N = C108975cc.A0P(r2);
            this.A0S = C27011Uj.A00();
            this.A0G = (C138646xS) r4.A0e.get();
            this.A0K = AnonymousClass3MY.A0Z(r1);
            this.A04 = AnonymousClass3Ma.A0c(r1);
            this.A05 = AnonymousClass10E.A6Q(r1);
        }
        this.A00 = i2;
        this.A0s = r12;
        this.A0t = AnonymousClass1DF.A01(new C149917jp(this));
        this.A0L = r10;
        Integer num = AnonymousClass00R.A0C;
        this.A0m = C84074Ht.A00(this, num, 2131435764);
        this.A0n = new C109595dh(Looper.getMainLooper(), this, 2);
        this.A0l = AnonymousClass1DF.A00(num, new C149927jq(this));
        this.A0a = new C1422678u((Object) this, 13);
        setId(2131430746);
        if (z && (theme = context.getTheme()) != null) {
            theme.applyStyle(2132083200, true);
        }
        LayoutInflater.from(context).inflate(2131625290, this, true);
        this.A0c = (ViewGroup) C18070vi.A05(this, 2131430747);
        this.A0o = C18070vi.A05(this, 2131428429);
        this.A01 = (ViewPager) AnonymousClass1HF.A06(this, 2131428427);
        this.A0b = C18070vi.A05(this, 2131434860);
        this.A0j = C108965cb.A0I(this, 2131430745);
        this.A0Y = C108945cZ.A0P(this, 2131429525);
        this.A0Z = AnonymousClass3MW.A0R(this, 2131429524);
        this.A0X = AnonymousClass1HF.A06(this, 2131429523);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) C18070vi.A05(this, 2131428428);
        this.A0i = materialButtonToggleGroup;
        this.A0f = (MaterialButton) C18070vi.A05(this, 2131430352);
        this.A0q = (LinearLayout) C18070vi.A05(this, 2131434856);
        this.A0r = (ConstraintLayout) C18070vi.A05(this, 2131434904);
        this.A0p = C18070vi.A05(this, 2131434883);
        this.A0k = AnonymousClass3Ma.A0N(this, 2131434882);
        this.A0d = (FrameLayout) C18070vi.A05(this, 2131431367);
        this.A0g = (MaterialButton) C18070vi.A05(this, 2131431146);
        this.A0e = (MaterialButton) C18070vi.A05(this, 2131428000);
        this.A0h = (MaterialButton) C18070vi.A05(this, 2131435784);
        if (C72453Mb.A1a(this.A0l)) {
            ChipGroup chipGroup = (ChipGroup) AnonymousClass3MX.A0v(this.A0m).A02().findViewById(2131435765);
            C18070vi.A0b(chipGroup);
            LayoutInflater A0D2 = AnonymousClass3MZ.A0D(this);
            C18070vi.A0X(A0D2);
            for (Chip chip : C137716vu.A00(A0D2, chipGroup)) {
                chip.setCheckable(false);
                C84084Hu.A00(chip, new AnonymousClass82G(chip, this));
                chipGroup.addView(chip);
            }
            chipGroup.setChipSpacingVerticalResource(2131169544);
        }
        AnonymousClass1Y5.A07(materialButtonToggleGroup, "Checkbox");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExpressionsTrayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, (AnonymousClass1BI) null, 2, (AnonymousClass1GP) null);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExpressionsTrayView(Context context) {
        this(context, (AttributeSet) null, 0, false, (AnonymousClass1BI) null, 2, (AnonymousClass1GP) null);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExpressionsTrayView(Context context, AttributeSet attributeSet, int i, boolean z, AnonymousClass1BI r13, int i2, AnonymousClass1GP r15, int i3, AnonymousClass1Y1 r17) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) == 0 ? z : false, (i3 & 16) != 0 ? null : r13, (i3 & 32) != 0 ? 2 : i2, (i3 & 64) == 0 ? r15 : null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExpressionsTrayView(Context context, AttributeSet attributeSet, int i, boolean z, AnonymousClass1BI r13, int i2) {
        this(context, attributeSet, i, z, r13, i2, (AnonymousClass1GP) null);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExpressionsTrayView(Context context, AttributeSet attributeSet, int i, boolean z, AnonymousClass1BI r13) {
        this(context, attributeSet, i, z, r13, 2, (AnonymousClass1GP) null);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExpressionsTrayView(Context context, AttributeSet attributeSet, int i, boolean z) {
        this(context, attributeSet, i, z, (AnonymousClass1BI) null, 2, (AnonymousClass1GP) null);
        C18070vi.A0d(context, 1);
    }
}
