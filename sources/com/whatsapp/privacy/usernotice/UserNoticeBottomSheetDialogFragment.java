package com.whatsapp.privacy.usernotice;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3Mp;
import X.AnonymousClass4DO;
import X.AnonymousClass4DP;
import X.AnonymousClass4HG;
import X.AnonymousClass4HH;
import X.AnonymousClass4Z3;
import X.AnonymousClass86E;
import X.C107725aU;
import X.C123576Uz;
import X.C177659Ab;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C26106CsQ;
import X.C33451iq;
import X.C36731oN;
import X.C39151sZ;
import X.C39401t1;
import X.C40831vL;
import X.C40841vM;
import X.C40861vP;
import X.C42491yG;
import X.C48262Lu;
import X.C59432mI;
import X.C72453Mb;
import X.C72473Md;
import X.C74483bk;
import X.C87344Vf;
import X.C88754aj;
import X.C89964dJ;
import X.C90574eI;
import X.C90584eJ;
import X.C91364fZ;
import X.C98194qj;
import X.E3d;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.BulletSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;

public final class UserNoticeBottomSheetDialogFragment extends Hilt_UserNoticeBottomSheetDialogFragment implements AnonymousClass86E {
    public View A00;
    public TextView A01;
    public TextView A02;
    public NestedScrollView A03;
    public AnonymousClass1KB A04;
    public AnonymousClass11C A05;
    public C18030ve A06;
    public C36731oN A07;
    public C33451iq A08;
    public C48262Lu A09;
    public AnonymousClass00H A0A;
    public Runnable A0B;
    public int A0C;
    public ValueAnimator A0D;
    public View A0E;
    public ImageView A0F;
    public LinearLayout A0G;
    public UserNoticeModalIconView A0H;
    public final C107725aU A0I = new C98194qj(this);
    public final View.OnClickListener A0J = new C177659Ab(this, 47);
    public final E3d A0K = new C91364fZ(this, 1);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C40831vL r6;
        AnonymousClass4DO A002;
        AnonymousClass4DP A003;
        File file;
        File file2;
        String str;
        LayoutInflater layoutInflater2 = layoutInflater;
        C18070vi.A0d(layoutInflater2, 0);
        Log.i("UserNoticeBottomSheetDialogFragment/onCreateView");
        Bundle A15 = A15();
        String string = A15.getString("icon_light_url");
        if (string != null) {
            String string2 = A15.getString("icon_dark_url");
            if (string2 != null) {
                String string3 = A15.getString("icon_description");
                if (string3 != null) {
                    String string4 = A15.getString("title");
                    if (string4 != null) {
                        int i = 0;
                        int i2 = A15.getInt("bullets_size", 0);
                        ArrayList A0z = C17880vN.A0z(i2);
                        while (i < i2) {
                            String string5 = A15.getString(AnonymousClass001.A1I("bullet_text_", AnonymousClass000.A10(), i));
                            if (string5 != null) {
                                A0z.add(new C59432mI(string5, A15.getString(AnonymousClass001.A1I("bullet_icon_light_url_", AnonymousClass000.A10(), i)), A15.getString(AnonymousClass001.A1I("bullet_icon_dark_url_", AnonymousClass000.A10(), i))));
                                i++;
                            } else {
                                throw AnonymousClass000.A0n("Required value was null.");
                            }
                        }
                        String string6 = A15.getString("agree_button_text");
                        if (string6 != null) {
                            long j = A15.getLong("start_time_millis");
                            C40831vL r5 = null;
                            if (j != 0) {
                                r6 = new C40831vL(j);
                            } else {
                                r6 = null;
                            }
                            C40841vM r7 = new C40841vM(A15.getLongArray("duration_repeat"), A15.getLong("duration_static", -1));
                            long j2 = A15.getLong("end_time_millis");
                            if (j2 != 0) {
                                r5 = new C40831vL(j2);
                            }
                            C40861vP r0 = new C40861vP(r7, r6, r5, "onDemand");
                            String string7 = A15.getString("body");
                            String string8 = A15.getString("footer");
                            String string9 = A15.getString("dismiss_button_text");
                            String string10 = A15.getString("icon_role");
                            if (string10 == null) {
                                A002 = null;
                            } else {
                                A002 = AnonymousClass4HG.A00(string10);
                            }
                            String string11 = A15.getString("icon_style");
                            if (string11 == null) {
                                A003 = null;
                            } else {
                                A003 = AnonymousClass4HH.A00(string11);
                            }
                            C48262Lu r15 = new C48262Lu(r0, A002, A003, string, string2, string3, string4, string6, string7, string8, string9, A0z);
                            String string12 = A15.getString("light_icon_path");
                            if (string12 == null) {
                                file = null;
                            } else {
                                file = new File(string12);
                            }
                            r15.A01 = file;
                            String string13 = A15.getString("dark_icon_path");
                            if (string13 == null) {
                                file2 = null;
                            } else {
                                file2 = new File(string13);
                            }
                            r15.A00 = file2;
                            this.A09 = r15;
                            View inflate = layoutInflater2.inflate(2131627290, viewGroup, true);
                            C90574eI.A00(inflate.getViewTreeObserver(), inflate, this, 5);
                            this.A03 = (NestedScrollView) inflate.findViewById(2131436634);
                            this.A00 = AnonymousClass1HF.A06(inflate, 2131436633);
                            C18070vi.A05(inflate, 2131436632).setOnClickListener(this.A0J);
                            NestedScrollView nestedScrollView = this.A03;
                            if (nestedScrollView != null) {
                                nestedScrollView.setNestedScrollingEnabled(false);
                            }
                            NestedScrollView nestedScrollView2 = this.A03;
                            if (nestedScrollView2 != null) {
                                nestedScrollView2.A0B = this.A0K;
                                ViewTreeObserver viewTreeObserver = nestedScrollView2.getViewTreeObserver();
                                if (viewTreeObserver != null) {
                                    C90584eJ.A00(viewTreeObserver, this, 28);
                                }
                            }
                            this.A0E = AnonymousClass1HF.A06(inflate, 2131436626);
                            ImageView A0H2 = AnonymousClass3MW.A0H(inflate, 2131436627);
                            this.A0F = A0H2;
                            if (A0H2 != null) {
                                C48262Lu r02 = this.A09;
                                if (r02 != null) {
                                    A0H2.setContentDescription(r02.A04);
                                }
                                C18070vi.A11("data");
                                throw null;
                            }
                            UserNoticeModalIconView userNoticeModalIconView = (UserNoticeModalIconView) AnonymousClass1HF.A06(inflate, 2131436635);
                            this.A0H = userNoticeModalIconView;
                            if (userNoticeModalIconView != null) {
                                ImageView imageView = this.A0F;
                                if (imageView != null) {
                                    userNoticeModalIconView.A00 = imageView;
                                    C48262Lu r03 = this.A09;
                                    if (r03 != null) {
                                        userNoticeModalIconView.A07(r03);
                                    }
                                    C18070vi.A11("data");
                                    throw null;
                                }
                                throw AnonymousClass000.A0n("Required value was null.");
                            }
                            TextEmojiLabel A0W = AnonymousClass3MX.A0W(inflate, 2131436623);
                            A0W.setMovementMethod(LinkMovementMethod.getInstance());
                            C48262Lu r04 = this.A09;
                            if (r04 != null) {
                                A00(A0W, r04.A02);
                                TextEmojiLabel A0W2 = AnonymousClass3MX.A0W(inflate, 2131436629);
                                C18070vi.A0b(A0W2);
                                C48262Lu r05 = this.A09;
                                if (r05 != null) {
                                    A00(A0W2, r05.A04);
                                    TextView A0E2 = C17880vN.A0E(inflate, 2131436637);
                                    this.A02 = A0E2;
                                    if (A0E2 != null) {
                                        C48262Lu r06 = this.A09;
                                        if (r06 != null) {
                                            A0E2.setText(r06.A07);
                                        }
                                    }
                                    TextView textView = this.A02;
                                    if (textView != null) {
                                        AnonymousClass1HF.A0q(textView, true);
                                        this.A01 = AnonymousClass3MW.A0J(inflate, 2131436636);
                                        int dimensionPixelSize = AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131169121);
                                        int dimensionPixelSize2 = AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131169127);
                                        this.A0C = dimensionPixelSize2;
                                        TextView textView2 = this.A01;
                                        if (textView2 != null) {
                                            textView2.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
                                        }
                                        TextView textView3 = this.A01;
                                        if (textView3 != null) {
                                            textView3.setMaxLines(5);
                                        }
                                        TextView textView4 = this.A01;
                                        if (textView4 != null) {
                                            textView4.setEllipsize(TextUtils.TruncateAt.END);
                                        }
                                        if (!A2L()) {
                                            TextView textView5 = this.A01;
                                            if (textView5 != null) {
                                                C72453Mb.A17(A14(), textView5, 2131231126);
                                            } else {
                                                throw AnonymousClass000.A0n("Required value was null.");
                                            }
                                        }
                                        TextView textView6 = this.A01;
                                        if (textView6 != null) {
                                            C48262Lu r07 = this.A09;
                                            if (r07 != null) {
                                                textView6.setText(r07.A07);
                                            }
                                        }
                                        TextView textView7 = this.A01;
                                        if (textView7 != null) {
                                            AnonymousClass1HF.A0W(textView7, AnonymousClass3MZ.A09(this).getDimension(2131169126));
                                            TextView textView8 = this.A01;
                                            if (textView8 != null) {
                                                AnonymousClass1HF.A0q(textView8, true);
                                                LinearLayout A0K2 = AnonymousClass3MX.A0K(inflate, 2131436625);
                                                this.A0G = A0K2;
                                                if (A0K2 != null) {
                                                    LayoutInflater from = LayoutInflater.from(A14());
                                                    int dimensionPixelSize3 = AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131169114);
                                                    C48262Lu r08 = this.A09;
                                                    if (r08 != null) {
                                                        int size = r08.A08.size();
                                                        int i3 = 0;
                                                        while (i3 < size) {
                                                            View inflate2 = from.inflate(2131627291, A0K2, false);
                                                            C18070vi.A0z(inflate2, "null cannot be cast to non-null type com.whatsapp.TextEmojiLabel");
                                                            WaTextView waTextView = (WaTextView) inflate2;
                                                            AnonymousClass3MY.A19(waTextView, i3);
                                                            A0K2.addView(waTextView);
                                                            C48262Lu r09 = this.A09;
                                                            if (r09 != null) {
                                                                C59432mI r1 = (C59432mI) r09.A08.get(i3);
                                                                C18030ve r010 = this.A06;
                                                                if (r010 != null) {
                                                                    AnonymousClass3Ma.A1I(waTextView, r010);
                                                                    Rect rect = C39401t1.A0A;
                                                                    AnonymousClass11C r011 = this.A05;
                                                                    if (r011 != null) {
                                                                        AnonymousClass3Ma.A1K(waTextView, r011);
                                                                        SpannableString A004 = AnonymousClass4Z3.A00(A14(), this.A0I, false, r1.A02);
                                                                        SpannableString spannableString = new SpannableString(A004.toString());
                                                                        spannableString.setSpan(new BulletSpan(dimensionPixelSize3), 0, A004.length(), 17);
                                                                        for (Object obj : A004.getSpans(0, A004.length(), Object.class)) {
                                                                            spannableString.setSpan(obj, A004.getSpanStart(obj), A004.getSpanEnd(obj), 17);
                                                                        }
                                                                        waTextView.setText(spannableString);
                                                                        i3++;
                                                                    } else {
                                                                        str = "systemServices";
                                                                    }
                                                                } else {
                                                                    str = "abProps";
                                                                }
                                                                C18070vi.A11(str);
                                                                throw null;
                                                            }
                                                        }
                                                        TextView A0E3 = C17880vN.A0E(inflate, 2131436622);
                                                        C48262Lu r012 = this.A09;
                                                        if (r012 != null) {
                                                            A0E3.setText(r012.A01);
                                                            C89964dJ.A00(A0E3, this, 14);
                                                            TextView A0E4 = C17880vN.A0E(inflate, 2131436628);
                                                            C48262Lu r12 = this.A09;
                                                            if (r12 != null) {
                                                                if (r12.A02()) {
                                                                    A0E4.setText(r12.A03);
                                                                    C89964dJ.A00(A0E4, this, 15);
                                                                } else {
                                                                    A0E4.setVisibility(8);
                                                                    ViewGroup.LayoutParams layoutParams = A0E3.getLayoutParams();
                                                                    C18070vi.A0z(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                                                    C39151sZ r13 = (C39151sZ) layoutParams;
                                                                    r13.A0T = 0;
                                                                    A0E3.setLayoutParams(r13);
                                                                }
                                                                C48262Lu r013 = this.A09;
                                                                if (r013 != null) {
                                                                    A2D(r013.A02());
                                                                    AnonymousClass00H r014 = this.A0A;
                                                                    if (r014 != null) {
                                                                        C26106CsQ csQ = (C26106CsQ) r014.get();
                                                                        C48262Lu r015 = this.A09;
                                                                        if (r015 != null) {
                                                                            boolean A022 = r015.A02();
                                                                            int i4 = 7;
                                                                            if (A022) {
                                                                                i4 = 3;
                                                                            }
                                                                            C26106CsQ.A00(csQ, i4);
                                                                            return inflate;
                                                                        }
                                                                    } else {
                                                                        C18070vi.A11("userNoticeLogger");
                                                                        throw null;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    C18070vi.A11("data");
                                                    throw null;
                                                }
                                                throw AnonymousClass000.A0n("Required value was null.");
                                            }
                                            throw AnonymousClass000.A0n("Required value was null.");
                                        }
                                        throw AnonymousClass000.A0n("Required value was null.");
                                    }
                                    throw AnonymousClass000.A0n("Required value was null.");
                                }
                            }
                            C18070vi.A11("data");
                            throw null;
                        }
                        throw AnonymousClass000.A0n("Required value was null.");
                    }
                    throw AnonymousClass000.A0n("Required value was null.");
                }
                throw AnonymousClass000.A0n("Required value was null.");
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }

    public void A2K(View view) {
        C18070vi.A0d(view, 0);
        super.A2K(view);
        BottomSheetBehavior A022 = BottomSheetBehavior.A02(view);
        C18070vi.A0X(A022);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = Resources.getSystem().getDisplayMetrics().heightPixels - C87344Vf.A01(view.getContext(), AnonymousClass11C.A01(A14()));
        view.setLayoutParams(layoutParams);
        A022.A0a(new C74483bk(A022, 6));
        A022.A0W(3);
    }

    public void onConfigurationChanged(Configuration configuration) {
        ViewGroup.LayoutParams layoutParams;
        ViewTreeObserver viewTreeObserver;
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        View A002 = C123576Uz.A00(A26(), 2131429948);
        C18070vi.A0X(A002);
        A2K(A002);
        int dimensionPixelSize = AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131169117);
        ImageView imageView = this.A0F;
        if (imageView != null) {
            C42491yG.A09(imageView, dimensionPixelSize, dimensionPixelSize);
            int dimensionPixelSize2 = AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131169125);
            UserNoticeModalIconView userNoticeModalIconView = this.A0H;
            if (userNoticeModalIconView != null) {
                C42491yG.A09(userNoticeModalIconView, dimensionPixelSize2, dimensionPixelSize2);
                LinearLayout linearLayout = this.A0G;
                if (linearLayout != null) {
                    layoutParams = linearLayout.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                C18070vi.A0z(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int dimensionPixelSize3 = AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131169115);
                marginLayoutParams.leftMargin = dimensionPixelSize3;
                marginLayoutParams.rightMargin = dimensionPixelSize3;
                LinearLayout linearLayout2 = this.A0G;
                if (linearLayout2 != null) {
                    linearLayout2.setLayoutParams(marginLayoutParams);
                }
                int dimensionPixelSize4 = AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131169121);
                NestedScrollView nestedScrollView = this.A03;
                if (nestedScrollView != null) {
                    int paddingTop = nestedScrollView.getPaddingTop();
                    NestedScrollView nestedScrollView2 = this.A03;
                    if (nestedScrollView2 != null) {
                        nestedScrollView.setPadding(dimensionPixelSize4, paddingTop, dimensionPixelSize4, nestedScrollView2.getPaddingBottom());
                    } else {
                        throw AnonymousClass000.A0n("Required value was null.");
                    }
                }
                TextView textView = this.A01;
                if (textView != null) {
                    int paddingTop2 = textView.getPaddingTop();
                    TextView textView2 = this.A01;
                    if (textView2 != null) {
                        textView.setPadding(dimensionPixelSize4, paddingTop2, dimensionPixelSize4, textView2.getPaddingBottom());
                    } else {
                        throw AnonymousClass000.A0n("Required value was null.");
                    }
                }
                NestedScrollView nestedScrollView3 = this.A03;
                if (nestedScrollView3 != null && (viewTreeObserver = nestedScrollView3.getViewTreeObserver()) != null) {
                    C90584eJ.A00(viewTreeObserver, this, 28);
                    return;
                }
                return;
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }

    private final void A00(TextEmojiLabel textEmojiLabel, String str) {
        String str2;
        if (str == null || str.length() == 0) {
            textEmojiLabel.setVisibility(8);
            return;
        }
        C18030ve r0 = this.A06;
        if (r0 != null) {
            AnonymousClass3Ma.A1I(textEmojiLabel, r0);
            Rect rect = C39401t1.A0A;
            AnonymousClass11C r02 = this.A05;
            if (r02 != null) {
                AnonymousClass3Ma.A1K(textEmojiLabel, r02);
                textEmojiLabel.setText(AnonymousClass4Z3.A00(A14(), this.A0I, AnonymousClass000.A0h(), str));
                return;
            }
            str2 = "systemServices";
        } else {
            str2 = "abProps";
        }
        C18070vi.A11(str2);
        throw null;
    }

    public static final void A01(UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment) {
        TextView textView = userNoticeBottomSheetDialogFragment.A02;
        if (textView != null) {
            float y = textView.getY() - ((float) userNoticeBottomSheetDialogFragment.A0C);
            NestedScrollView nestedScrollView = userNoticeBottomSheetDialogFragment.A03;
            if (nestedScrollView != null) {
                int i = 0;
                boolean A1R = AnonymousClass000.A1R((((float) nestedScrollView.getScrollY()) > y ? 1 : (((float) nestedScrollView.getScrollY()) == y ? 0 : -1)));
                TextView textView2 = userNoticeBottomSheetDialogFragment.A02;
                if (textView2 != null) {
                    int i2 = 0;
                    if (A1R) {
                        i2 = 4;
                    }
                    textView2.setVisibility(i2);
                }
                TextView textView3 = userNoticeBottomSheetDialogFragment.A01;
                if (textView3 != null) {
                    if (!A1R) {
                        i = 8;
                    }
                    textView3.setVisibility(i);
                    return;
                }
                return;
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }

    public static final void A02(UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment, boolean z, boolean z2) {
        float f;
        long j;
        ValueAnimator valueAnimator = userNoticeBottomSheetDialogFragment.A0D;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            userNoticeBottomSheetDialogFragment.A0D = valueAnimator2;
            valueAnimator2.setInterpolator(new AccelerateDecelerateInterpolator());
            ValueAnimator valueAnimator3 = userNoticeBottomSheetDialogFragment.A0D;
            if (valueAnimator3 != null) {
                C88754aj.A00(valueAnimator3, userNoticeBottomSheetDialogFragment, 19);
            }
        } else {
            valueAnimator.cancel();
            ValueAnimator valueAnimator4 = userNoticeBottomSheetDialogFragment.A0D;
            if (valueAnimator4 != null) {
                valueAnimator4.removeAllListeners();
            }
        }
        ValueAnimator valueAnimator5 = userNoticeBottomSheetDialogFragment.A0D;
        if (valueAnimator5 != null) {
            valueAnimator5.addListener(new AnonymousClass3Mp(3, userNoticeBottomSheetDialogFragment, z));
        }
        View view = userNoticeBottomSheetDialogFragment.A00;
        float f2 = 0.0f;
        if (view != null) {
            f = view.getAlpha();
        } else {
            f = 0.0f;
        }
        if (z) {
            f2 = 1.0f;
        }
        ValueAnimator valueAnimator6 = userNoticeBottomSheetDialogFragment.A0D;
        if (valueAnimator6 != null) {
            valueAnimator6.setFloatValues(C72473Md.A1a(f, f2));
        }
        ValueAnimator valueAnimator7 = userNoticeBottomSheetDialogFragment.A0D;
        if (valueAnimator7 != null) {
            if (z2) {
                j = 400;
            } else {
                j = 0;
            }
            valueAnimator7.setDuration(j);
        }
        ValueAnimator valueAnimator8 = userNoticeBottomSheetDialogFragment.A0D;
        if (valueAnimator8 != null) {
            valueAnimator8.start();
        }
    }

    public static final boolean A03(UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment) {
        View view = userNoticeBottomSheetDialogFragment.A0E;
        if (view != null) {
            float y = view.getY();
            NestedScrollView nestedScrollView = userNoticeBottomSheetDialogFragment.A03;
            if (nestedScrollView != null) {
                float height = y - ((float) nestedScrollView.getHeight());
                NestedScrollView nestedScrollView2 = userNoticeBottomSheetDialogFragment.A03;
                if (nestedScrollView2 == null) {
                    throw AnonymousClass000.A0n("Required value was null.");
                } else if (height - ((float) nestedScrollView2.getScrollY()) < 0.0f) {
                    return true;
                } else {
                    return false;
                }
            } else {
                throw AnonymousClass000.A0n("Required value was null.");
            }
        } else {
            throw AnonymousClass000.A0n("Required value was null.");
        }
    }

    public void A1s() {
        super.A1s();
        NestedScrollView nestedScrollView = this.A03;
        if (nestedScrollView != null) {
            nestedScrollView.A0B = null;
        }
        this.A03 = null;
        this.A00 = null;
        this.A0E = null;
        this.A02 = null;
        this.A01 = null;
        this.A0F = null;
        this.A0H = null;
        this.A0G = null;
    }
}
