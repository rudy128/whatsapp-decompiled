package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8IQ  reason: invalid class name */
public abstract class AnonymousClass8IQ extends C42011xT {
    public void A0B(C183399Yc r14) {
        long j;
        AEE aee;
        C20275AEi aEi;
        Long l;
        AEE aee2;
        C20275AEi aEi2;
        String str;
        C20279AEn aEn;
        boolean z;
        boolean z2;
        String string;
        String str2;
        String str3;
        String str4;
        View view;
        AW0 aw0;
        String str5;
        AFR afr;
        int i;
        C186209dp A00;
        Resources resources;
        Resources.Theme theme;
        int i2;
        AnonymousClass94E r142;
        AnonymousClass942 r143;
        int dimensionPixelSize;
        if (this instanceof AnonymousClass94V) {
            AnonymousClass94V r2 = (AnonymousClass94V) this;
            C18070vi.A0d(r14, 0);
            AnonymousClass94B r144 = (AnonymousClass94B) r14;
            r2.A00.setRotation((float) r144.A01);
            View view2 = r2.A0H;
            ViewGroup.MarginLayoutParams A0P = C72463Mc.A0P(view2);
            int i3 = r144.A02;
            int i4 = 0;
            if (i3 == 0) {
                dimensionPixelSize = 0;
            } else {
                dimensionPixelSize = AnonymousClass000.A0Y(view2).getDimensionPixelSize(i3);
            }
            int i5 = r144.A00;
            if (i5 != 0) {
                i4 = AnonymousClass000.A0Y(view2).getDimensionPixelSize(i5);
            }
            A0P.setMargins(A0P.leftMargin, dimensionPixelSize, A0P.rightMargin, i4);
        } else if (this instanceof AnonymousClass94U) {
            AnonymousClass94U r1 = (AnonymousClass94U) this;
            C18070vi.A0d(r14, 0);
            if ((r14 instanceof AnonymousClass942) && (r143 = (AnonymousClass942) r14) != null) {
                r1.A00.setText(r143.A00);
            }
        } else if (this instanceof C1763894a) {
            C1763894a r4 = (C1763894a) this;
            C18070vi.A0d(r14, 0);
            if ((r14 instanceof AnonymousClass94E) && (r142 = (AnonymousClass94E) r14) != null) {
                r4.A03.setImageDrawable(AnonymousClass03S.A01(C108945cZ.A0D(r4), r142.A00));
                CharSequence charSequence = r142.A03;
                if (charSequence == null || charSequence.length() == 0) {
                    r4.A02.setVisibility(8);
                } else {
                    TextEmojiLabel textEmojiLabel = r4.A02;
                    textEmojiLabel.setVisibility(0);
                    textEmojiLabel.setText(charSequence);
                }
                r4.A01.setText(r142.A02);
                View.OnClickListener onClickListener = r142.A01;
                ImageView imageView = r4.A00;
                if (onClickListener != null) {
                    imageView.setVisibility(0);
                    imageView.setOnClickListener(onClickListener);
                    return;
                }
                imageView.setVisibility(8);
            }
        } else if (this instanceof C1764094c) {
            C1764094c r8 = (C1764094c) this;
            C18070vi.A0d(r14, 0);
            AnonymousClass94H r6 = (AnonymousClass94H) r14;
            int i6 = 8;
            if (r6.A05) {
                WaTextView waTextView = r8.A02;
                waTextView.setVisibility(0);
                int i7 = r14.A00;
                View view3 = r8.A0H;
                Context context = view3.getContext();
                if (i7 != 12) {
                    AnonymousClass1KJ r22 = r6.A01;
                    AnonymousClass1R2 r12 = r8.A03;
                    i = r6.A00;
                    A00 = C1764094c.A00(context, r22, r12, i, r6.A03);
                } else {
                    AnonymousClass1R2 r122 = r8.A03;
                    AnonymousClass1KJ r23 = r6.A01;
                    i = r6.A00;
                    A00 = C1764094c.A00(context, r23, r122, i, false);
                    if (i == 1) {
                        A00 = new C186209dp(r122.A0M(context, r23, C72463Mc.A01(context), 2131168116), context.getString(2131893242), A00.A00);
                    }
                }
                C18070vi.A0b(A00);
                Drawable drawable = A00.A01;
                Resources resources2 = view3.getResources();
                int i8 = A00.A00;
                Drawable A08 = AnonymousClass4aX.A08(drawable, resources2.getColor(i8));
                C18070vi.A0X(A08);
                CharSequence A03 = C72813Np.A03(waTextView.getPaint(), A08, A00.A02);
                SpannableStringBuilder A09 = AnonymousClass3MW.A09(A03);
                A09.setSpan(new ForegroundColorSpan(view3.getResources().getColor(i8)), 0, A03.length(), 33);
                waTextView.setText(A09);
                if (i == 3 || i == 9) {
                    resources = view3.getResources();
                    theme = view3.getContext().getTheme();
                    i2 = 2131232765;
                } else {
                    resources = view3.getResources();
                    theme = view3.getContext().getTheme();
                    i2 = 2131232764;
                }
                waTextView.setBackground(C40501uo.A00(theme, resources, i2));
            } else {
                r8.A02.setVisibility(8);
            }
            String str6 = r6.A02;
            if (str6 == null || str6.length() == 0) {
                r8.A01.setVisibility(8);
            } else {
                WaTextView waTextView2 = r8.A01;
                waTextView2.setText(str6);
                waTextView2.setVisibility(0);
            }
            View view4 = r8.A00;
            if (r6.A04) {
                i6 = 0;
            }
            view4.setVisibility(i6);
        } else if (this instanceof AnonymousClass94R) {
        } else {
            if (this instanceof AnonymousClass94Q) {
                C18070vi.A0d(r14, 0);
                View view5 = this.A0H;
                TextView A0E = AnonymousClass3Ma.A0E(view5, 2131435426);
                View A05 = C18070vi.A05(view5, 2131429094);
                AnonymousClass94D r145 = (AnonymousClass94D) r14;
                AES aes = r145.A01;
                AEV A002 = aes.A00();
                if ((aes.A00 == -1 && aes.A02 == null) || A002 == null) {
                    str5 = null;
                } else {
                    String[] strArr = new String[9];
                    strArr[0] = A002.A07.toString();
                    strArr[1] = A002.A04.toString();
                    strArr[2] = A002.A03.toString();
                    strArr[3] = A002.A0A.toString();
                    strArr[4] = A002.A00.toString();
                    strArr[5] = A002.A06.toString();
                    strArr[6] = A002.A02.toString();
                    strArr[7] = A002.A09.toString();
                    List A0O = C18070vi.A0O(A002.A05.toString(), strArr, 8);
                    ArrayList A13 = AnonymousClass000.A13();
                    for (Object next : A0O) {
                        AnonymousClass3MZ.A1V(next, A13, AnonymousClass1EG.A0H((String) next) ? 1 : 0);
                    }
                    str5 = C29431cG.A0g(", ", "", "", A13, B3H.A00);
                }
                A0E.setText(str5);
                if (r145.A03) {
                    A05.setVisibility(0);
                    afr = new AFR(r145, 16);
                } else {
                    A05.setVisibility(8);
                    afr = null;
                }
                view5.setOnClickListener(afr);
            } else if (this instanceof AnonymousClass94W) {
                AnonymousClass94W r62 = (AnonymousClass94W) this;
                C18070vi.A0d(r14, 0);
                AnonymousClass94F r146 = (AnonymousClass94F) r14;
                C20279AEn aEn2 = r146.A04;
                C18000vb r10 = r146.A00;
                if (aEn2.A04 != null) {
                    WaTextView waTextView3 = r62.A01;
                    View view6 = r62.A0H;
                    C20266ADy aDy = r146.A03;
                    waTextView3.setText(AnonymousClass3MW.A0x(AnonymousClass000.A0Y(view6), aDy.A01, new Object[1], 0, 2131893229));
                    r62.A02.setText(AnonymousClass3MW.A0x(AnonymousClass000.A0Y(view6), aEn2.A07(r10, aDy.A00), new Object[1], 0, 2131893230));
                    if (!(C20089A6r.A00(aEn2) == 1 && r146.A01 == null) && ((aw0 = r146.A01) == null || aw0.A0L())) {
                        r62.A00.setVisibility(8);
                        return;
                    }
                    WaImageView waImageView = r62.A00;
                    waImageView.setVisibility(0);
                    AFR.A00(waImageView, r146, 15);
                }
            } else if (this instanceof AnonymousClass94Z) {
                AnonymousClass94Z r7 = (AnonymousClass94Z) this;
                C18070vi.A0d(r14, 0);
                AnonymousClass947 r147 = (AnonymousClass947) r14;
                if (r147.A01) {
                    AnonymousClass3MY.A0y(r7.A03.A00, r7.A01, new Object[]{r147.A00}, 2131893193);
                    r7.A00.setVisibility(0);
                    view = r7.A02;
                } else {
                    WaTextView waTextView4 = r7.A02;
                    waTextView4.setText(AnonymousClass8BS.A0f(r7.A03, r147.A00, new Object[1], 0, 2131893228));
                    waTextView4.setVisibility(0);
                    view = r7.A00;
                }
                view.setVisibility(8);
            } else if (this instanceof AnonymousClass94P) {
            } else {
                if (this instanceof AnonymousClass94Y) {
                    AnonymousClass94Y r42 = (AnonymousClass94Y) this;
                    C18070vi.A0d(r14, 0);
                    AnonymousClass94G r148 = (AnonymousClass94G) r14;
                    for (AEZ aez : r148.A05) {
                        if (C18070vi.A18(aez.A0A, r148.A03)) {
                            r42.A02.setText(A2H.A00(r42.A03, aez.A09, aez.A08));
                        }
                    }
                    if (!C18070vi.A18(r148.A03, "checkout_lite")) {
                        r42.A01.setVisibility(0);
                        View view7 = r42.A00;
                        view7.setVisibility(0);
                        AnonymousClass3Ma.A1D(view7, r148, 40);
                        return;
                    }
                    r42.A00.setVisibility(8);
                    r42.A01.setVisibility(8);
                } else if (this instanceof C1764194d) {
                    C1764194d r63 = (C1764194d) this;
                    C18070vi.A0d(r14, 0);
                    AnonymousClass94J r149 = (AnonymousClass94J) r14;
                    C20285AEt BPK = r149.A06.BPK();
                    LinearLayout linearLayout = r63.A00;
                    linearLayout.setVisibility(8);
                    AnonymousClass8pG r72 = null;
                    if (BPK != null) {
                        aEn = BPK.A02;
                    } else {
                        aEn = null;
                    }
                    if (aEn != null) {
                        AnonymousClass1QO r3 = r63.A08;
                        C18030ve r102 = r3.A02;
                        C18040vf r24 = C18040vf.A02;
                        if (!((!C18020vd.A05(r24, r102, 5574) && !C18020vd.A05(r24, r102, 5575)) || (str4 = aEn.A0G) == null || str4.length() == 0)) {
                            linearLayout.setVisibility(0);
                            r63.A04.setText(str4);
                        }
                        z = r3.A0M(aEn.A0I);
                        z2 = true;
                    } else {
                        z = false;
                        z2 = false;
                    }
                    if (r149.A0A) {
                        r63.A06.setVisibility(8);
                        WaImageView waImageView2 = r63.A03;
                        waImageView2.setImageDrawable(r149.A01);
                        int i9 = 4;
                        if (z2) {
                            i9 = 0;
                        }
                        waImageView2.setVisibility(i9);
                        AW0 aw02 = r149.A03;
                        if (aw02 != null) {
                            r72 = aw02.A0A;
                        }
                        if (z) {
                            C1764194d.A00(aw02, r63);
                            if (r63.A08.A0C()) {
                                r63.A07.setText(2131893868);
                                C28931bI r32 = r63.A09;
                                r32.A04(0);
                                r32.A05(new AFR(r149, 12));
                            }
                        } else if (r72 != null && (r72 instanceof C170318pf) && ((C170318pf) r72).A0a) {
                            C1764194d.A00(aw02, r63);
                        }
                        LinearLayout linearLayout2 = r63.A02;
                        linearLayout2.setVisibility(0);
                        AFR.A00(linearLayout2, r149, 13);
                    } else {
                        r63.A02.setVisibility(8);
                    }
                    if (z || (str2 = r149.A07) == null || str2.length() == 0) {
                        string = r63.A0H.getResources().getString(2131893197);
                    } else {
                        Resources resources3 = r63.A0H.getResources();
                        Object[] objArr = new Object[1];
                        C184479b1 r0 = r149.A02;
                        if (r0 == null || (str3 = r0.A01) == null) {
                            str3 = str2;
                        }
                        string = AnonymousClass3MW.A0x(resources3, str3, objArr, 0, 2131893196);
                    }
                    C18070vi.A0b(string);
                    r63.A05.setText(string);
                    if (r149.A09) {
                        LinearLayout linearLayout3 = r63.A01;
                        linearLayout3.setVisibility(0);
                        AFR.A00(linearLayout3, r149, 14);
                        return;
                    }
                    r63.A01.setVisibility(8);
                } else if (this instanceof AnonymousClass94X) {
                    AnonymousClass94X r43 = (AnonymousClass94X) this;
                    C18070vi.A0d(r14, 0);
                    AnonymousClass94C r1410 = (AnonymousClass94C) r14;
                    WaImageView waImageView3 = r43.A00;
                    waImageView3.setVisibility(0);
                    C27201Vd r33 = r43.A03;
                    View view8 = r43.A0H;
                    C37451pZ A06 = r33.A06(view8.getContext(), "payment-checkout-order-details-view");
                    AnonymousClass1E7 r02 = r1410.A00;
                    C17960vV.A07(r02);
                    A06.A07(waImageView3, r02);
                    String str7 = r1410.A01;
                    if (!(str7 == null || str7.length() == 0)) {
                        waImageView3.setContentDescription(AnonymousClass3MW.A0x(view8.getResources(), str7, AnonymousClass3MW.A1a(), 0, 2131893223));
                    }
                    boolean z3 = r1410.A03;
                    WaTextView waTextView5 = r43.A01;
                    if (z3) {
                        waTextView5.setVisibility(0);
                        waTextView5.setText(str7);
                    } else {
                        waTextView5.setVisibility(8);
                    }
                    r43.A02.setText(r1410.A02);
                } else if (!(this instanceof AnonymousClass94O) && !(this instanceof AnonymousClass94N)) {
                    if (this instanceof AnonymousClass94T) {
                        AnonymousClass94T r34 = (AnonymousClass94T) this;
                        C18070vi.A0d(r14, 0);
                        String str8 = ((AnonymousClass946) r14).A00;
                        if (str8.length() > 0) {
                            TextView textView = r34.A00;
                            textView.setText(str8);
                            textView.setVisibility(0);
                            return;
                        }
                        r34.A00.setVisibility(4);
                    } else if (this instanceof C1763994b) {
                        C1763994b r5 = (C1763994b) this;
                        C18070vi.A0d(r14, 0);
                        if (r14 instanceof AnonymousClass949) {
                            r5.A03.setText(2131897958);
                            WaImageView waImageView4 = r5.A02;
                            View view9 = r5.A0H;
                            waImageView4.setImageDrawable(C137486vX.A01(view9.getContext(), "application/pdf", (String) null, false));
                            AnonymousClass949 r25 = (AnonymousClass949) r14;
                            AnonymousClass21K r73 = r25.A02;
                            C20285AEt BPK2 = r73.BPK();
                            if (BPK2 == null || (aee2 = BPK2.A05) == null || (aEi2 = aee2.A00) == null || (str = aEi2.A00) == null || str.length() == 0) {
                                WaImageView waImageView5 = r5.A01;
                                waImageView5.setVisibility(0);
                                waImageView5.setImageResource(2131232495);
                                View A02 = C28931bI.A00(view9, 2131434181).A02();
                                C18070vi.A0X(A02);
                                AnonymousClass1DT r35 = r25.A00;
                                Context context2 = view9.getContext();
                                C18070vi.A0z(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                                C20339AGv.A00((AnonymousClass1F9) context2, r35, new C22244Azy((CircularProgressBar) A02), 45);
                            } else {
                                r5.A01.setVisibility(8);
                            }
                            C20285AEt BPK3 = r73.BPK();
                            if (BPK3 == null || (aee = BPK3.A05) == null || (aEi = aee.A00) == null || (l = aEi.A01) == null) {
                                j = 0;
                            } else {
                                j = l.longValue();
                            }
                            r5.A00.setText(C88584aA.A02(r5.A04, j));
                            AFR.A00(view9, r14, 11);
                        }
                    } else if (this instanceof AnonymousClass94S) {
                        C18070vi.A0d(r14, 0);
                        ((AnonymousClass94S) this).A00.A00(((AnonymousClass945) r14).A00);
                    } else if (this instanceof AnonymousClass94M) {
                    } else {
                        if (this instanceof AnonymousClass94L) {
                            AFR.A00(C108965cb.A09(this, r14), r14, 9);
                            return;
                        }
                        C18070vi.A0d(r14, 0);
                        AnonymousClass948 r1411 = (AnonymousClass948) r14;
                        View view10 = this.A0H;
                        AFR.A00(view10, r1411, 8);
                        View A052 = C18070vi.A05(view10, 2131430517);
                        View A053 = C18070vi.A05(view10, 2131430527);
                        if (r1411.A02) {
                            A052.setVisibility(0);
                            A053.setVisibility(0);
                            return;
                        }
                        A052.setVisibility(8);
                        A053.setVisibility(8);
                    }
                }
            }
        }
    }
}
