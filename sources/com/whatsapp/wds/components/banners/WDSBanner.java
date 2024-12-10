package com.whatsapp.wds.components.banners;

import X.AnonymousClass000;
import X.AnonymousClass1Y0;
import X.AnonymousClass1YF;
import X.AnonymousClass1YH;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4A7;
import X.AnonymousClass4A8;
import X.AnonymousClass4A9;
import X.AnonymousClass4AA;
import X.AnonymousClass4AB;
import X.AnonymousClass4AC;
import X.AnonymousClass4AF;
import X.AnonymousClass4AG;
import X.AnonymousClass4F5;
import X.AnonymousClass4XT;
import X.C17880vN;
import X.C18070vi;
import X.C18090vk;
import X.C19740yt;
import X.C26264Cw9;
import X.C27801Xq;
import X.C27831Xu;
import X.C28011Ym;
import X.C28041Yp;
import X.C39351sv;
import X.C40501uo;
import X.C43531zx;
import X.C85604Oa;
import X.C85784Os;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

public final class WDSBanner extends ConstraintLayout {
    public TextEmojiLabel A00 = AnonymousClass3MX.A0W(this, 2131428063);
    public TextEmojiLabel A01 = AnonymousClass3MX.A0W(this, 2131428064);
    public WaImageView A02 = AnonymousClass3MW.A0S(this, 2131430060);
    public WaImageView A03 = AnonymousClass3MW.A0S(this, 2131428066);
    public C85604Oa A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2132084366);
        WaImageView waImageView;
        C18070vi.A0d(context, 1);
        C85604Oa r6 = AnonymousClass4A7.A00;
        this.A04 = r6;
        View.inflate(context, 2131627554, this);
        if (attributeSet != null) {
            int[] iArr = AnonymousClass1Y0.A01;
            C18070vi.A0Z(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            AnonymousClass4XT r4 = new AnonymousClass4XT();
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                r6 = new AnonymousClass4AC(new AnonymousClass4AG(resourceId));
            } else {
                int i = obtainStyledAttributes.getInt(1, 0);
                if (i != 0) {
                    if (i == 1) {
                        r6 = AnonymousClass4A9.A00;
                    } else if (i == 2) {
                        r6 = AnonymousClass4A8.A00;
                    }
                }
            }
            this.A04 = r6;
            r4.A02 = r6;
            int resourceId2 = obtainStyledAttributes.getResourceId(4, 0);
            if (resourceId2 != 0) {
                r4.A01 = resourceId2;
            } else {
                r4.A04 = obtainStyledAttributes.getString(4);
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId3 != 0) {
                r4.A00 = resourceId3;
            } else {
                r4.A03 = obtainStyledAttributes.getString(2);
            }
            setDismissible(obtainStyledAttributes.getBoolean(3, true));
            C85784Os A012 = r4.A01();
            if (!(A012.A03 == null && A012.A00 == 0)) {
                setState(A012);
            }
            float dimension = obtainStyledAttributes.getDimension(5, -1.0f);
            if (!(dimension == -1.0f || (waImageView = this.A03) == null)) {
                ViewGroup.LayoutParams layoutParams = waImageView.getLayoutParams();
                int i2 = (int) dimension;
                layoutParams.width = i2;
                layoutParams.height = i2;
            }
            obtainStyledAttributes.recycle();
        }
        WaImageView waImageView2 = this.A02;
        if (waImageView2 != null) {
            AnonymousClass3MW.A1Q(waImageView2);
        }
        AnonymousClass3MY.A14(getResources(), this, 2131169332);
        requestLayout();
    }

    public final void setState(C85784Os r8) {
        TextEmojiLabel textEmojiLabel;
        TextEmojiLabel textEmojiLabel2;
        Drawable drawable;
        TextEmojiLabel textEmojiLabel3;
        C39351sv r0;
        TextEmojiLabel textEmojiLabel4;
        int i;
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        CharSequence text;
        TextEmojiLabel textEmojiLabel5;
        CharSequence text2;
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        ViewGroup.MarginLayoutParams marginLayoutParams6;
        TextEmojiLabel textEmojiLabel6;
        CharSequence charSequence;
        int i5 = 0;
        C18070vi.A0d(r8, 0);
        C85604Oa r3 = r8.A02;
        this.A04 = r3;
        CharSequence charSequence2 = r8.A04;
        if (charSequence2 == null || r8.A01 == 0) {
            int i6 = r8.A01;
            if (i6 != 0) {
                TextEmojiLabel textEmojiLabel7 = this.A01;
                if (textEmojiLabel7 != null) {
                    textEmojiLabel7.setText(i6);
                }
            } else if (!(charSequence2 == null || (textEmojiLabel = this.A01) == null)) {
                textEmojiLabel.setText(charSequence2);
            }
            CharSequence charSequence3 = r8.A03;
            if (charSequence3 == null || r8.A00 == 0) {
                int i7 = r8.A00;
                if (i7 != 0) {
                    TextEmojiLabel textEmojiLabel8 = this.A00;
                    if (textEmojiLabel8 != null) {
                        textEmojiLabel8.setText(i7);
                    }
                } else if (!(charSequence3 == null || (textEmojiLabel2 = this.A00) == null)) {
                    textEmojiLabel2.setText(charSequence3);
                }
                if ((r3 instanceof AnonymousClass4AA) && (textEmojiLabel6 = this.A00) != null) {
                    Context context = getContext();
                    Object[] A1a = AnonymousClass3MW.A1a();
                    TextEmojiLabel textEmojiLabel9 = this.A00;
                    if (textEmojiLabel9 != null) {
                        charSequence = textEmojiLabel9.getText();
                    } else {
                        charSequence = null;
                    }
                    textEmojiLabel6.setContentDescription(C17880vN.A0q(context, charSequence, A1a, 0, 2131899589));
                }
                setDismissible(r8.A05);
                Context context2 = getContext();
                C85604Oa r02 = this.A04;
                int A002 = AnonymousClass1YL.A00(context2, r02.A02, r02.A03);
                AnonymousClass4F5 r32 = this.A04.A04;
                if (r32 instanceof AnonymousClass4AG) {
                    drawable = C40501uo.A00((Resources.Theme) null, getResources(), ((AnonymousClass4AG) r32).A00);
                } else if (r32 instanceof AnonymousClass4AF) {
                    drawable = ((AnonymousClass4AF) r32).A00;
                } else {
                    throw AnonymousClass3MW.A14();
                }
                if (drawable != null) {
                    Drawable A022 = C27831Xu.A02(drawable.mutate());
                    C18070vi.A0X(A022);
                    C27831Xu.A0C(A022, AnonymousClass1YH.A00((Resources.Theme) null, getResources(), A002));
                    WaImageView waImageView = this.A03;
                    if (waImageView != null) {
                        waImageView.setImageDrawable(A022);
                    }
                }
                C28041Yp r2 = new C28041Yp();
                r2.A01(getResources().getDimension(2131169405));
                C27801Xq r22 = new C27801Xq(new C28011Ym(r2));
                Context context3 = getContext();
                C85604Oa r03 = this.A04;
                r22.A0F(C19740yt.A03(getContext(), AnonymousClass1YL.A00(context3, r03.A00, r03.A01)));
                if (this.A04 instanceof AnonymousClass4AB) {
                    r22.A0G(C19740yt.A03(getContext(), 2131103166));
                    r22.A01.A04 = AnonymousClass000.A0Y(this).getDimension(2131169335);
                    r22.invalidateSelf();
                }
                setBackground(r22);
                C26264Cw9 cw9 = new C26264Cw9();
                TextEmojiLabel textEmojiLabel10 = this.A01;
                int i8 = 0;
                if ((textEmojiLabel10 == null || textEmojiLabel10.getVisibility() != 8) && ((textEmojiLabel4 = this.A01) == null || (text = textEmojiLabel4.getText()) == null || AnonymousClass1YF.A0T(text))) {
                    TextEmojiLabel textEmojiLabel11 = this.A01;
                    if (textEmojiLabel11 != null) {
                        textEmojiLabel11.setVisibility(8);
                    }
                    cw9.A0C(this);
                    cw9.A09(2131428063, 7, 2131430060, 6);
                    cw9.A0A(this);
                    textEmojiLabel3 = this.A00;
                    if (textEmojiLabel3 != null) {
                        ViewGroup.LayoutParams layoutParams = textEmojiLabel3.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                            i = 0;
                        } else {
                            i = marginLayoutParams3.leftMargin;
                        }
                        ViewGroup.LayoutParams layoutParams2 = textEmojiLabel3.getLayoutParams();
                        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
                            i2 = 0;
                        } else {
                            i2 = marginLayoutParams2.rightMargin;
                        }
                        ViewGroup.LayoutParams layoutParams3 = textEmojiLabel3.getLayoutParams();
                        if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) == null) {
                            i3 = 0;
                        } else {
                            i3 = marginLayoutParams.bottomMargin;
                        }
                        r0 = new C39351sv(i, 0, i2, i3);
                    } else {
                        return;
                    }
                } else {
                    TextEmojiLabel textEmojiLabel12 = this.A01;
                    if ((textEmojiLabel12 == null || textEmojiLabel12.getVisibility() != 0) && (textEmojiLabel5 = this.A01) != null && (text2 = textEmojiLabel5.getText()) != null && (!AnonymousClass1YF.A0T(text2))) {
                        TextEmojiLabel textEmojiLabel13 = this.A01;
                        if (textEmojiLabel13 != null) {
                            textEmojiLabel13.setVisibility(0);
                        }
                        cw9.A0C(this);
                        cw9.A09(2131428063, 7, 0, 7);
                        cw9.A0A(this);
                        int A012 = AnonymousClass3MW.A01(getResources(), 2131169405);
                        textEmojiLabel3 = this.A00;
                        if (textEmojiLabel3 != null) {
                            ViewGroup.LayoutParams layoutParams4 = textEmojiLabel3.getLayoutParams();
                            if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams4) == null) {
                                i4 = 0;
                            } else {
                                i4 = marginLayoutParams6.leftMargin;
                            }
                            ViewGroup.LayoutParams layoutParams5 = textEmojiLabel3.getLayoutParams();
                            if ((layoutParams5 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                                i5 = marginLayoutParams5.rightMargin;
                            }
                            ViewGroup.LayoutParams layoutParams6 = textEmojiLabel3.getLayoutParams();
                            if ((layoutParams6 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams6) != null) {
                                i8 = marginLayoutParams4.bottomMargin;
                            }
                            r0 = new C39351sv(i4, A012, i5, i8);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                C43531zx.A03(textEmojiLabel3, r0);
                return;
            }
            throw AnonymousClass000.A0n("Both id and string values are set for descriptionText. Please specify one of them");
        }
        throw AnonymousClass000.A0n("Both id and string values are set for headlineText. Please specify one of them");
    }

    private final void setDismissible(boolean z) {
        int i = 8;
        WaImageView waImageView = this.A02;
        if (waImageView != null) {
            if (z) {
                i = 0;
            }
            waImageView.setVisibility(i);
        }
    }

    public final TextEmojiLabel getDescription() {
        return this.A00;
    }

    public final TextEmojiLabel getHeader() {
        return this.A01;
    }

    public final void setDescriptionSelected(boolean z) {
        TextEmojiLabel textEmojiLabel = this.A00;
        if (textEmojiLabel != null) {
            textEmojiLabel.setSelected(z);
        }
    }

    public final void setOnDismissListener(C18090vk r3) {
        WaImageView waImageView = this.A02;
        if (r3 == null) {
            if (waImageView != null) {
                waImageView.setOnClickListener((View.OnClickListener) null);
            }
        } else if (waImageView != null) {
            AnonymousClass3MZ.A1M(waImageView, r3, 10);
        }
    }

    private final void A00(int i, int i2) {
        Object layoutParams;
        if (getLayoutParams() != null) {
            layoutParams = getLayoutParams();
            C18070vi.A0z(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(i2, i, i2, i);
        requestLayout();
    }

    public final void A07() {
        A00(0, getResources().getDimensionPixelSize(2131169331));
    }

    public final void A08() {
        A00(getResources().getDimensionPixelSize(2131169544), getResources().getDimensionPixelSize(2131169331));
    }

    public final void setDescription(TextEmojiLabel textEmojiLabel) {
        this.A00 = textEmojiLabel;
    }

    public final void setHeader(TextEmojiLabel textEmojiLabel) {
        this.A01 = textEmojiLabel;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        AnonymousClass3MZ.A1K(this, onClickListener, 13);
    }

    public static final void setOnDismissListener$lambda$4(C18090vk r0, View view) {
        r0.invoke();
    }

    public static final void setOnDismissListener$lambda$5(C18090vk r0, View view) {
        r0.invoke();
    }

    public final void setOnDismissListener(View.OnClickListener onClickListener) {
        WaImageView waImageView = this.A02;
        if (waImageView != null) {
            waImageView.setOnClickListener(onClickListener);
        }
    }
}
