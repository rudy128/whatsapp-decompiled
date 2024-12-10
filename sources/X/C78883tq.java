package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.3tq  reason: invalid class name and case insensitive filesystem */
public class C78883tq extends C78783td {
    public View A00;
    public ViewGroup A01;
    public LinearLayout A02;
    public LottieAnimationView A03;
    public WaTextView A04;
    public AnonymousClass5XG A05;
    public C107275Zb A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public boolean A09 = true;
    public TextView A0A;
    public AnonymousClass4MN A0B;
    public final AnonymousClass3VB A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004f, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r1.A02, 5246) != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C78883tq(android.content.Context r8, X.C108875cR r9, X.AnonymousClass210 r10) {
        /*
            r7 = this;
            r0 = 1
            X.C18070vi.A0e(r8, r0, r10)
            r7.<init>(r8, r9, r10)
            r7.A1M()
            r7.A09 = r0
            r5 = 0
            if (r9 == 0) goto L_0x006f
            X.1DS r4 = r9.getLastMessageLiveData()
            X.1DS r3 = r9.getHasOutgoingMessagesLiveData()
            if (r4 == 0) goto L_0x006f
            if (r3 == 0) goto L_0x006f
            X.00H r6 = r7.getMetaAiGating()
            X.00H r2 = r7.A1h
            X.C18070vi.A0W(r2)
            X.205 r0 = r10.A0v
            X.1BI r1 = r0.A00
            X.1Ps r0 = X.AnonymousClass3MW.A0W(r2)
            boolean r0 = r0.A0D(r1)
            if (r0 != 0) goto L_0x0051
            java.lang.Object r1 = r6.get()
            X.4NR r1 = (X.AnonymousClass4NR) r1
            X.0zA r0 = r1.A00
            X.AnonymousClass4W5.A01(r0)
            X.1UD r0 = r1.A01
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x006f
            X.0ve r2 = r1.A02
            r1 = 5246(0x147e, float:7.351E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x006f
        L_0x0051:
            X.5Zb r0 = r7.getInlineFeedbackViewModelFactory()
            X.3VB r4 = r0.BGV(r4, r3)
            r7.A0C = r4
            X.1Dg r3 = r4.A02
            X.1F9 r2 = r9.getLifecycleOwner()
            r0 = 38
            X.5Am r1 = X.AnonymousClass3MW.A16(r7, r0)
            r0 = 7
            X.C91644g1.A00(r2, r3, r1, r0)
            r4.A0V(r10)
            return
        L_0x006f:
            r7.A0C = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78883tq.<init>(android.content.Context, X.5cR, X.210):void");
    }

    public boolean A1X() {
        return false;
    }

    public void A2K(AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        super.A2K(r4);
        if (!AnonymousClass3MW.A0X(this.A1k).A03()) {
            A2q();
        }
        if (!C18020vd.A05(C18040vf.A02, this.A0F, 7268)) {
            A2p();
        }
        A2o();
    }

    public void A2V(AnonymousClass206 r5, boolean z) {
        C692036h A002;
        C108875cR r0;
        C18070vi.A0d(r5, 0);
        AnonymousClass205 A0A2 = AnonymousClass25A.A0A(r5);
        C18070vi.A0X(A0A2);
        AnonymousClass206 r02 = this.A0I;
        C18070vi.A0X(r02);
        AnonymousClass205 A0A3 = AnonymousClass25A.A0A(r02);
        C18070vi.A0X(A0A3);
        boolean z2 = !A0A2.equals(A0A3);
        if ((z2 || z) && (A002 = AnonymousClass2UW.A00(r5)) != null && A002.A01.ordinal() < 3 && (r0 = this.A0k) != null) {
            r0.CJr(r5, 0);
        }
        super.A2V(r5, z);
        if (z2 && A05(r5)) {
            A04(0);
        }
        AnonymousClass3VB r03 = this.A0C;
        if (r03 != null) {
            r03.A0V(r5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (r1.equals(X.C60492o7.A00(r4).A02) == false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2l(X.AnonymousClass210 r7) {
        /*
            r6 = this;
            r3 = 0
            X.C18070vi.A0d(r7, r3)
            X.206 r5 = r6.A0I
            X.C18070vi.A0X(r5)
            r6.setFMessage(r7)
            X.00H r0 = r6.A1i
            r0.get()
            boolean r0 = X.C87494Vu.A00(r5)
            if (r0 == 0) goto L_0x0043
            X.206 r4 = r6.A0I
            if (r5 == r4) goto L_0x0043
            r1 = 131072(0x20000, double:6.47582E-319)
            boolean r0 = r4.A11(r1)
            if (r0 == 0) goto L_0x0043
            X.36c r0 = X.C60492o7.A00(r4)
            if (r0 == 0) goto L_0x0043
            boolean r0 = r5.A11(r1)
            if (r0 == 0) goto L_0x0068
            X.36c r0 = X.C60492o7.A00(r5)
            X.205 r1 = r0.A02
        L_0x0036:
            X.36c r0 = X.C60492o7.A00(r4)
            X.205 r0 = r0.A02
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0044
        L_0x0043:
            r2 = 0
        L_0x0044:
            r1 = 0
            if (r2 == 0) goto L_0x004e
            X.5cR r0 = r6.A0k
            if (r0 == 0) goto L_0x004e
            r0.CJr(r7, r3)
        L_0x004e:
            com.whatsapp.TextEmojiLabel r0 = r6.A06
            if (r0 == 0) goto L_0x005c
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L_0x005c
            int r1 = r0.length()
        L_0x005c:
            r6.A2i()
            if (r2 == 0) goto L_0x0064
            r6.A04(r1)
        L_0x0064:
            r6.A2L(r7)
            return
        L_0x0068:
            X.205 r1 = r5.A0v
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78883tq.A2l(X.210):void");
    }

    public final void A2r(AnonymousClass206 r7) {
        C28931bI A0s = C72453Mb.A0s(this, 2131429585);
        C691736e r0 = (C691736e) r7.A0M(C691736e.class).A02;
        if (r0 != null) {
            String str = r0.A00;
            if (C18020vd.A05(C18040vf.A01, AnonymousClass3MW.A0X(this.A1k).A00, 10817)) {
                AnonymousClass3MY.A1T(A0s, 0);
                TextView A0E = C17880vN.A0E(A0s.A02(), 2131429584);
                if (A0E != null) {
                    A0E.setText(str);
                    return;
                }
                return;
            }
        }
        if (A0s.A01() == 0) {
            A0s.A04(8);
        }
    }

    public final void A2s(Collection collection) {
        AnonymousClass4VK r10;
        Integer num;
        if (this.A09 || !AnonymousClass3MW.A0X(getBonsaiGating()).A04()) {
            LinkedHashMap A13 = C17880vN.A13();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass210 r2 = (AnonymousClass210) it.next();
                C692136i A002 = AnonymousClass2UX.A00(r2);
                if (!(A002 == null || (num = A002.A02) == null)) {
                    A13.put(num, new AnonymousClass4VK(r2));
                }
            }
            if (getContext() != null && AnonymousClass000.A0Y(this) != null) {
                SpannableStringBuilder spannableStringBuilder = this.A2q;
                Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C72803No.class);
                C18070vi.A0X(spans);
                for (C72803No r11 : (C72803No[]) spans) {
                    int spanStart = this.A2q.getSpanStart(r11);
                    int spanEnd = this.A2q.getSpanEnd(r11);
                    String str = r11.A00;
                    if (AnonymousClass1YD.A03(str) != null) {
                        Integer valueOf = Integer.valueOf(Integer.parseInt(str));
                        if (!(!A13.containsKey(valueOf) || (r10 = (AnonymousClass4VK) A13.get(valueOf)) == null || this.A05 == null)) {
                            this.A2q.setSpan(new C74693cD(AnonymousClass3MY.A04(this), (AnonymousClass4KS) ((C94444kd) getAiSearchInlineCitationTouchableSpanFactory()).A00.A01.A0N.get(), r10, r11, spanStart), spanStart, spanEnd, 33);
                        }
                    }
                }
                TextEmojiLabel textEmojiLabel = this.A06;
                if (textEmojiLabel != null) {
                    textEmojiLabel.setText(this.A2q, TextView.BufferType.SPANNABLE);
                }
            }
        }
    }

    public String getGroupRoleTitle() {
        return null;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = i;
        int i5 = i2;
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        LinearLayout linearLayout = this.A02;
        if (linearLayout != null) {
            C42491yG.A0A(linearLayout, i4, 0, 0, i5, 0);
            i3 = C42491yG.A00(linearLayout);
        } else {
            i3 = 0;
        }
        setMeasuredDimension(measuredWidth, measuredHeight + i3);
    }

    public final void setAiSearchInlineCitationTouchableSpanFactory(AnonymousClass5XG r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setBonsaiGating(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setInlineFeedbackViewModelFactory(C107275Zb r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setMetaAiGating(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    private final void A04(int i) {
        CharSequence charSequence;
        int i2;
        C108885cS A022;
        TextEmojiLabel textEmojiLabel;
        if (this.A0B == null || i == 0) {
            this.A0B = new AnonymousClass4MN(this);
        }
        AnonymousClass206 r0 = this.A0I;
        C18070vi.A0X(r0);
        boolean A052 = A05(r0);
        AnonymousClass4MN r4 = this.A0B;
        if (A052) {
            if (r4 != null) {
                C78883tq r5 = r4.A00;
                int height = r5.getHeight();
                AnonymousClass3MY.A1C(r5, r5.getMeasuredHeight(), 0, View.MeasureSpec.makeMeasureSpec(r5.getMeasuredWidth(), Integer.MIN_VALUE));
                int measuredHeight = r5.getMeasuredHeight();
                TextEmojiLabel textEmojiLabel2 = r5.A06;
                if (textEmojiLabel2 != null) {
                    textEmojiLabel2.getLineCount();
                }
                if (measuredHeight > height && (A022 = C88404Zo.A02(r5)) != null) {
                    if (r5.getTop() - (measuredHeight - height) < A022.getListView().getTop() || ((textEmojiLabel = r5.A06) != null && textEmojiLabel.getLineCount() > 4)) {
                        A022.BIf();
                    } else if (r5.getBottom() <= A022.getListView().getHeight()) {
                        AnonymousClass3MX.A1F(r5, height);
                        r5.requestLayout();
                        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{height, measuredHeight});
                        ofInt.setDuration(150);
                        ofInt.setInterpolator(new LinearInterpolator());
                        C88754aj.A00(ofInt, r4, 13);
                        ofInt.addListener(new C88664aa(r4, 3));
                        r5.getViewTreeObserver().addOnGlobalLayoutListener(new C90424e3(A022, r4));
                        ofInt.start();
                    }
                }
                C87784Wy r52 = r4.A01;
                Handler handler = r52.A02;
                handler.removeCallbacksAndMessages((Object) null);
                r52.A01 = r52.A00;
                TextEmojiLabel textEmojiLabel3 = r52.A04;
                if (textEmojiLabel3 != null) {
                    charSequence = textEmojiLabel3.getText();
                } else {
                    charSequence = null;
                }
                r52.A03 = charSequence;
                int i3 = 0;
                if (charSequence != null) {
                    i2 = charSequence.length();
                } else {
                    i2 = 0;
                }
                if (i2 > r52.A01) {
                    CharSequence charSequence2 = r52.A03;
                    if (charSequence2 != null) {
                        i3 = charSequence2.length();
                    }
                    r52.A00 = i3;
                    int i4 = r52.A01;
                    if (i4 != 0) {
                        C87784Wy.A00(r52, i4);
                        String valueOf = String.valueOf(r52.A03);
                        int i5 = r52.A01;
                        ArrayList A0s = C72463Mc.A0s(valueOf);
                        int length = valueOf.length();
                        int i6 = i5;
                        while (i5 < length) {
                            if (AnonymousClass1c5.A00(valueOf.charAt(i5))) {
                                if (i6 != i5) {
                                    C17890vO.A1D(A0s, i6);
                                }
                                i6 = i5 + 1;
                            }
                            i5++;
                        }
                        if (i6 != length) {
                            C17890vO.A1D(A0s, i6);
                        }
                        if (!A0s.isEmpty()) {
                            A0s.size();
                            CharSequence charSequence3 = r52.A03;
                            if (charSequence3 != null) {
                                int size = A0s.size();
                                long j = 0;
                                for (int i7 = 0; i7 < size; i7++) {
                                    int length2 = charSequence3.length() - 1;
                                    if (i7 < A0s.size() - 1) {
                                        length2 = AnonymousClass000.A0M(A0s.get(i7 + 1)) - 1;
                                    }
                                    handler.sendMessageDelayed(Message.obtain(handler, 0, AnonymousClass1D6.A00(A0s.get(i7), length2)), j);
                                    j += 50;
                                }
                            }
                        }
                    }
                }
            }
        } else if (r4 != null) {
            r4.A01.A02.removeCallbacksAndMessages((Object) null);
        }
    }

    private final int getLottieTypingAnimationAsset() {
        C18030ve r2 = this.A0F;
        C18070vi.A0W(r2);
        if (C36301nf.A00(r2, 10056, 0) > 0) {
            return 2132017228;
        }
        return 2132017227;
    }

    public final void A2q() {
        TextEmojiLabel textEmojiLabel;
        CharSequence text;
        TextEmojiLabel textEmojiLabel2;
        CharSequence text2;
        CharSequence A0G;
        String str;
        LottieAnimationView lottieAnimationView;
        boolean A032 = AnonymousClass3MW.A0X(this.A1k).A03();
        AnonymousClass206 r0 = this.A0I;
        C18070vi.A0X(r0);
        boolean A052 = A05(r0);
        if (A032) {
            int i = 0;
            if (A052) {
                C42491yG.A0B(this.A06, 8);
                if (this.A01 == null) {
                    WaTextView waTextView = null;
                    View inflate = AnonymousClass3MZ.A0D(this).inflate(2131624778, (ViewGroup) null, false);
                    C18070vi.A0z(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup = (ViewGroup) inflate;
                    this.A01 = viewGroup;
                    ViewGroup viewGroup2 = this.A02;
                    if (viewGroup2 != null) {
                        viewGroup2.addView(viewGroup);
                    }
                    ViewGroup viewGroup3 = this.A01;
                    if (viewGroup3 != null) {
                        lottieAnimationView = (LottieAnimationView) viewGroup3.findViewById(2131436482);
                    } else {
                        lottieAnimationView = null;
                    }
                    this.A03 = lottieAnimationView;
                    C18000vb r02 = this.A0D;
                    C18070vi.A0z(lottieAnimationView, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
                    C27641Ww.A0C(lottieAnimationView, r02);
                    LottieAnimationView lottieAnimationView2 = this.A03;
                    if (lottieAnimationView2 != null) {
                        lottieAnimationView2.setAnimation(getLottieTypingAnimationAsset());
                    }
                    LottieAnimationView lottieAnimationView3 = this.A03;
                    C18070vi.A0z(lottieAnimationView3, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
                    C42491yG.A0C(lottieAnimationView3, AnonymousClass3Ma.A01(getContext(), AnonymousClass000.A0Y(this), 2130970659, 2131102034));
                    ViewGroup viewGroup4 = this.A01;
                    if (viewGroup4 != null) {
                        waTextView = AnonymousClass3MW.A0U(viewGroup4, 2131435839);
                    }
                    this.A04 = waTextView;
                }
                LottieAnimationView lottieAnimationView4 = this.A03;
                if (lottieAnimationView4 != null) {
                    lottieAnimationView4.A04();
                }
                WaTextView waTextView2 = this.A04;
                if (waTextView2 != null) {
                    AnonymousClass206 r1 = this.A0I;
                    C18070vi.A0X(r1);
                    C20953Ac7 ac7 = (C20953Ac7) r1.A0M(C20953Ac7.class).A02;
                    if (ac7 != null) {
                        str = ac7.A00;
                    } else {
                        str = null;
                    }
                    waTextView2.setText(str);
                }
                ViewGroup viewGroup5 = this.A01;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                }
                TextEmojiLabel textEmojiLabel3 = this.A06;
                if (textEmojiLabel3 != null) {
                    CharSequence text3 = textEmojiLabel3.getText();
                    if ((text3 != null && text3.length() == 0) || !((textEmojiLabel = this.A06) == null || (text = textEmojiLabel.getText()) == null || text.length() != 1 || (textEmojiLabel2 = this.A06) == null || (text2 = textEmojiLabel2.getText()) == null || (A0G = AnonymousClass1YF.A0G(text2)) == null || A0G.length() != 0)) {
                        i = 8;
                    }
                    textEmojiLabel3.setVisibility(i);
                    return;
                }
                return;
            }
            LottieAnimationView lottieAnimationView5 = this.A03;
            if (lottieAnimationView5 != null) {
                lottieAnimationView5.A03();
            }
            ViewGroup viewGroup6 = this.A01;
            if (viewGroup6 != null) {
                viewGroup6.setVisibility(8);
            }
            TextEmojiLabel textEmojiLabel4 = this.A06;
            if (textEmojiLabel4 != null) {
                textEmojiLabel4.setVisibility(0);
            }
        } else if (A052) {
            ViewGroup viewGroup7 = this.A06;
            C42491yG.A0B(viewGroup7, 8);
            if (this.A03 == null) {
                View inflate2 = AnonymousClass3MZ.A0D(this).inflate(2131624950, (ViewGroup) null, false);
                C18070vi.A0z(inflate2, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
                LottieAnimationView lottieAnimationView6 = (LottieAnimationView) inflate2;
                this.A03 = lottieAnimationView6;
                if (lottieAnimationView6 != null) {
                    lottieAnimationView6.setRepeatCount(-1);
                }
                C18000vb r12 = this.A0D;
                LottieAnimationView lottieAnimationView7 = this.A03;
                C18070vi.A0z(lottieAnimationView7, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
                C27641Ww.A0C(lottieAnimationView7, r12);
                viewGroup7.addView(this.A03);
            }
            LottieAnimationView lottieAnimationView8 = this.A03;
            if (lottieAnimationView8 != null) {
                lottieAnimationView8.setAnimation(getLottieTypingAnimationAsset());
            }
            LottieAnimationView lottieAnimationView9 = this.A03;
            C18070vi.A0z(lottieAnimationView9, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
            C42491yG.A0C(lottieAnimationView9, AnonymousClass3Ma.A01(getContext(), AnonymousClass000.A0Y(this), 2130970659, 2131102034));
            LottieAnimationView lottieAnimationView10 = this.A03;
            if (lottieAnimationView10 != null) {
                lottieAnimationView10.A04();
            }
            LottieAnimationView lottieAnimationView11 = this.A03;
            if (lottieAnimationView11 != null) {
                lottieAnimationView11.setVisibility(0);
                return;
            }
            return;
        } else {
            LottieAnimationView lottieAnimationView12 = this.A03;
            if (lottieAnimationView12 != null) {
                lottieAnimationView12.A03();
                LottieAnimationView lottieAnimationView13 = this.A03;
                if (lottieAnimationView13 != null) {
                    lottieAnimationView13.setVisibility(8);
                }
            }
        }
        super.A2K(this.A0I);
    }

    public final AnonymousClass5XG getAiSearchInlineCitationTouchableSpanFactory() {
        AnonymousClass5XG r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("aiSearchInlineCitationTouchableSpanFactory");
        throw null;
    }

    public final AnonymousClass00H getBonsaiGating() {
        AnonymousClass00H r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("bonsaiGating");
        throw null;
    }

    public final boolean getContainOnlyOneText() {
        return this.A09;
    }

    public final AnonymousClass3VB getInlineFeedbackViewModel() {
        return this.A0C;
    }

    public final C107275Zb getInlineFeedbackViewModelFactory() {
        C107275Zb r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("inlineFeedbackViewModelFactory");
        throw null;
    }

    public final AnonymousClass00H getMetaAiGating() {
        AnonymousClass00H r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("metaAiGating");
        throw null;
    }

    public final TextView getModelLabel() {
        return this.A0A;
    }

    public C108675c7 getRowCustomizer() {
        C108875cR r0;
        if (!C42701yb.A01(this.A0I.A0v.A00) && (r0 = this.A0k) != null && r0.getContainerType() == 0) {
            return this.A0B.A04;
        }
        C108675c7 rowCustomizer = super.getRowCustomizer();
        C18070vi.A0X(rowCustomizer);
        return rowCustomizer;
    }

    private final boolean A05(AnonymousClass206 r8) {
        C692036h A002 = AnonymousClass2UW.A00(r8);
        AnonymousClass11P r3 = this.A0u;
        C18030ve r5 = this.A0F;
        long j = r8.A0I;
        C691536c A003 = C60492o7.A00(r8);
        if (A003 != null) {
            j = A003.A00;
        }
        if (AnonymousClass11P.A01(r3) - j > ((long) C18020vd.A00(C18040vf.A02, r5, 4736)) || A002 == null || A002.A01.ordinal() >= 3) {
            return false;
        }
        return true;
    }

    public void A1w() {
        super.A1w();
        LinearLayout linearLayout = this.A02;
        if (linearLayout != null) {
            linearLayout.bringToFront();
        }
    }

    public void A2i() {
        super.A2i();
        A2q();
        if (!C18020vd.A05(C18040vf.A02, this.A0F, 7268)) {
            A2p();
        }
        A2o();
        AnonymousClass206 r0 = this.A0I;
        C18070vi.A0X(r0);
        A2r(r0);
    }

    public final LinearLayout A2n() {
        LinearLayout linearLayout = (LinearLayout) findViewById(2131429588);
        if (linearLayout == null) {
            View A092 = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(this), this, 2131624776);
            C18070vi.A0z(A092, "null cannot be cast to non-null type android.widget.LinearLayout");
            linearLayout = (LinearLayout) A092;
            addView(linearLayout);
        }
        this.A02 = linearLayout;
        return linearLayout;
    }

    public void A2o() {
        int i;
        TextView textView;
        AnonymousClass9IU r1;
        if (AnonymousClass3MW.A0X(getBonsaiGating()).A0E()) {
            AnonymousClass206 r12 = this.A0I;
            C18070vi.A0X(r12);
            C20944Aby aby = (C20944Aby) r12.A0M(C20944Aby.class).A02;
            if (aby != null) {
                r1 = aby.A00;
            } else {
                r1 = null;
            }
            if (r1 == AnonymousClass9IU.LLAMA_PROD_PREMIUM) {
                AnonymousClass206 r0 = this.A0I;
                C18070vi.A0X(r0);
                if (!A05(r0)) {
                    i = 0;
                    if (this.A0A == null) {
                        LayoutInflater A0D = AnonymousClass3MZ.A0D(this);
                        ViewGroup viewGroup = this.A06;
                        View inflate = A0D.inflate(2131624759, viewGroup, false);
                        C18070vi.A0z(inflate, "null cannot be cast to non-null type android.widget.TextView");
                        TextView textView2 = (TextView) inflate;
                        this.A0A = textView2;
                        if (textView2 != null) {
                            Context context = getContext();
                            Object[] A1a = AnonymousClass3MW.A1a();
                            A1a[0] = AnonymousClass3MW.A0W(this.A1h).A04();
                            AnonymousClass3MY.A0y(context, textView2, A1a, 2131892194);
                            TextView textView3 = this.A0H;
                            viewGroup.addView(textView2, viewGroup.indexOfChild(textView3));
                            LinearLayout.LayoutParams A0D2 = AnonymousClass3Ma.A0D();
                            A0D2.gravity = 80;
                            textView3.setLayoutParams(A0D2);
                        }
                    }
                    textView = this.A0A;
                    if (textView == null) {
                        return;
                    }
                    textView.setVisibility(i);
                }
            }
        }
        textView = this.A0A;
        if (textView != null) {
            i = 8;
            textView.setVisibility(i);
        }
    }

    public final void A2p() {
        String str;
        Uri parse;
        int i;
        int ordinal;
        View findViewById = findViewById(2131434950);
        if (findViewById != null) {
            C28931bI A0p = AnonymousClass3MW.A0p(findViewById);
            AnonymousClass206 r0 = this.A0I;
            C18070vi.A0X(r0);
            C692136i A002 = AnonymousClass2UX.A00(r0);
            C179479Ic r1 = null;
            if (A002 != null) {
                r1 = A002.A01;
            }
            AnonymousClass206 r02 = this.A0I;
            C18070vi.A0X(r02);
            C692136i A003 = AnonymousClass2UX.A00(r02);
            if (A003 == null || (str = A003.A05) == null || (parse = Uri.parse(str)) == null) {
                A0p.A04(8);
                return;
            }
            A0p.A04(0);
            Context context = getContext();
            if (!(r1 == null || (ordinal = r1.ordinal()) == -1)) {
                i = 2131887324;
                if (ordinal != 0) {
                    i = 2131887325;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            throw AnonymousClass3MW.A14();
                        }
                    }
                }
                String A0F = C18070vi.A0F(context, i);
                Context context2 = getContext();
                C18030ve r11 = this.A0F;
                AnonymousClass1KB r8 = this.A0S;
                C26302CxJ.A0K(context2, parse, this.A0Q, r8, (TextEmojiLabel) A0p.A02(), this.A0C, r11, A0F, "link-one");
            }
            i = 2131887323;
            String A0F2 = C18070vi.A0F(context, i);
            Context context22 = getContext();
            C18030ve r112 = this.A0F;
            AnonymousClass1KB r82 = this.A0S;
            C26302CxJ.A0K(context22, parse, this.A0Q, r82, (TextEmojiLabel) A0p.A02(), this.A0C, r112, A0F2, "link-one");
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int right;
        super.onLayout(z, i, i2, i3, i4);
        LinearLayout linearLayout = this.A02;
        if (linearLayout != null) {
            boolean A1b = AnonymousClass3MY.A1b(this.A0D);
            int height = getHeight();
            int measuredWidth = linearLayout.getMeasuredWidth();
            int measuredHeight = linearLayout.getMeasuredHeight();
            View view = this.A0j;
            if (A1b) {
                right = view.getLeft();
            } else {
                right = view.getRight() - measuredWidth;
            }
            linearLayout.layout(0, height - measuredHeight, measuredWidth, height);
            View view2 = this.A00;
            if (view2 != null) {
                view2.setPadding(right, 0, 0, 0);
            }
        }
    }

    public final void setContainOnlyOneText(boolean z) {
        this.A09 = z;
    }

    public final void setModelLabel(TextView textView) {
        this.A0A = textView;
    }
}
