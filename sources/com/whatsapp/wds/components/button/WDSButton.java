package com.whatsapp.wds.components.button;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass19D;
import X.AnonymousClass1DC;
import X.AnonymousClass1DF;
import X.AnonymousClass1J8;
import X.AnonymousClass1Y0;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3Rk;
import X.AnonymousClass4D1;
import X.AnonymousClass4DG;
import X.AnonymousClass4UO;
import X.AnonymousClass4ZM;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C19740yt;
import X.C27881Xz;
import X.C88614aD;
import X.C99064sD;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public class WDSButton extends AnonymousClass3Rk {
    public static final int[] A0M = {16842913};
    public static final int[] A0N = new int[0];
    public Drawable A00;
    public C18000vb A01;
    public AnonymousClass19D A02;
    public C18030ve A03;
    public AnonymousClass1DC A04;
    public AnonymousClass4DG A05;
    public AnonymousClass4ZM A06 = new AnonymousClass4ZM(this.A03);
    public C27881Xz A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public PorterDuffColorFilter A0B;
    public AnonymousClass4D1 A0C;
    public Integer A0D;
    public String A0E = "";
    public boolean A0F = true;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I = true;
    public final RectF A0J = AnonymousClass3MW.A08();
    public final RectF A0K = AnonymousClass3MW.A08();
    public final C18100vl A0L = AnonymousClass1DF.A01(new C99064sD(18));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z;
        Drawable drawable;
        C18070vi.A0d(context, 1);
        AnonymousClass4DG r7 = AnonymousClass4DG.NORMAL;
        this.A05 = r7;
        AnonymousClass4D1 r6 = AnonymousClass4D1.NORMAL;
        this.A0C = r6;
        C27881Xz r5 = C27881Xz.FILLED;
        this.A07 = r5;
        this.A0G = true;
        C18000vb r0 = this.A01;
        if (r0 != null) {
            z = AnonymousClass3MW.A1Z(r0);
        } else {
            z = false;
        }
        this.A09 = z;
        if (attributeSet != null) {
            int[] iArr = AnonymousClass1Y0.A04;
            C18070vi.A0Z(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(5, 0);
            if (resourceId != 0) {
                AnonymousClass3MY.A0w(context, this, resourceId);
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId2 != 0) {
                setHint(resourceId2);
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(4, 0);
            if (resourceId3 != 0) {
                setImeActionLabel(context.getString(resourceId3), getImeActionId());
            }
            int resourceId4 = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId4 != 0) {
                setText(resourceId4);
            }
            this.A0I = AnonymousClass000.A1P(obtainStyledAttributes.getResourceId(7, 0));
            this.A08 = obtainStyledAttributes.getBoolean(9, false);
            setMirrorIconForRtl(obtainStyledAttributes.getBoolean(10, false));
            obtainStyledAttributes.getBoolean(11, false);
            int i = obtainStyledAttributes.getInt(6, 0);
            AnonymousClass4DG[] values = AnonymousClass4DG.values();
            if (i >= 0 && i < values.length) {
                r7 = values[i];
            }
            setAction(r7);
            int i2 = obtainStyledAttributes.getInt(14, 0);
            AnonymousClass4D1[] values2 = AnonymousClass4D1.values();
            if (i2 >= 0 && i2 < values2.length) {
                r6 = values2[i2];
            }
            setSize(r6);
            int i3 = obtainStyledAttributes.getInt(13, 0);
            C27881Xz[] values3 = C27881Xz.values();
            if (i3 >= 0 && i3 < values3.length) {
                r5 = values3[i3];
            }
            setVariant(r5);
            setToggleSelection(obtainStyledAttributes.getBoolean(12, false));
            Drawable[] compoundDrawables = super.getCompoundDrawables();
            C18070vi.A0X(compoundDrawables);
            if (compoundDrawables.length == 0 || super.getCompoundDrawables()[0] == null) {
                drawable = this.A00 == null ? obtainStyledAttributes.getDrawable(8) : drawable;
                obtainStyledAttributes.recycle();
            } else {
                drawable = super.getCompoundDrawables()[0];
            }
            setupIcon(drawable);
            obtainStyledAttributes.recycle();
        }
        A04();
        A05();
    }

    public static final ColorStateList A02(Context context, AnonymousClass4UO r9) {
        int[][] iArr = {new int[]{-16842910}, new int[]{16842919}, new int[]{16842908}, new int[0]};
        int[] iArr2 = new int[4];
        AnonymousClass3MW.A1O(context, iArr2, r9.A00, 0);
        int i = r9.A02;
        AnonymousClass3MW.A1O(context, iArr2, i, 1);
        AnonymousClass3MW.A1O(context, iArr2, i, 2);
        AnonymousClass3MW.A1O(context, iArr2, r9.A01, 3);
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: android.graphics.drawable.LayerDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.graphics.drawable.Drawable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.graphics.drawable.Drawable A03(int r13, boolean r14) {
        /*
            r12 = this;
            r7 = 0
            if (r14 == 0) goto L_0x0047
            r4 = 0
            r5 = 0
        L_0x0005:
            r3 = 8
            float[] r2 = new float[r3]
            r1 = 0
        L_0x000a:
            X.4ZM r0 = r12.A06
            float r0 = r0.A00
            r2[r1] = r0
            int r1 = r1 + 1
            if (r1 < r3) goto L_0x000a
            r1 = 0
            android.graphics.drawable.shapes.RoundRectShape r0 = new android.graphics.drawable.shapes.RoundRectShape
            r0.<init>(r2, r1, r1)
            android.graphics.drawable.ShapeDrawable r3 = new android.graphics.drawable.ShapeDrawable
            r3.<init>(r0)
            android.graphics.Paint r0 = r3.getPaint()
            r0.setColor(r13)
            boolean r0 = r12.A0I
            if (r0 == 0) goto L_0x0034
            android.graphics.drawable.InsetDrawable r2 = new android.graphics.drawable.InsetDrawable
            r6 = r4
            r7 = r5
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0031:
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            return r2
        L_0x0034:
            r0 = 1
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r0]
            r0[r7] = r3
            android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
            r2.<init>(r0)
            r10 = r4
            r11 = r5
            r6 = r2
            r8 = r4
            r9 = r5
            r6.setLayerInset(r7, r8, r9, r10, r11)
            goto L_0x0031
        L_0x0047:
            X.4ZM r0 = r12.A06
            int r4 = r0.A03
            int r5 = r0.A04
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.button.WDSButton.A03(int, boolean):android.graphics.drawable.Drawable");
    }

    public Drawable[] getCompoundDrawables() {
        return new Drawable[]{this.A00, null, null, null};
    }

    public void onDraw(Canvas canvas) {
        int width;
        float f;
        C18070vi.A0d(canvas, 0);
        this.A0E = getEllipsizedText();
        float measureText = getPaint().measureText(this.A0E);
        if (this.A00 == null) {
            width = 0;
        } else {
            AnonymousClass4ZM r1 = this.A06;
            width = r1.A03 + r1.A07 + ((((getWidth() - getFixedSpace$app_ui_wds_wds()) - r1.A02) - ((int) measureText)) / 2);
            if (this.A09) {
                width = (getWidth() - width) - this.A06.A02;
            }
        }
        int height = getHeight();
        AnonymousClass4ZM r5 = this.A06;
        int i = r5.A02;
        int i2 = (height - i) / 2;
        if (this.A00 == null) {
            f = (((float) getWidth()) - measureText) / 2.0f;
        } else if (this.A09) {
            f = ((float) (width - r5.A06)) - measureText;
        } else {
            f = ((float) (width + i)) + ((float) r5.A06);
        }
        canvas.drawText(this.A0E, f, ((((float) getHeight()) - getPaint().descent()) - getPaint().ascent()) / 2.0f, getPaint());
        Drawable drawable = this.A00;
        if (drawable != null) {
            if (!this.A08) {
                PorterDuffColorFilter porterDuffColorFilter = this.A0B;
                if (porterDuffColorFilter == null) {
                    C18070vi.A11("colorFilter");
                    throw null;
                }
                drawable.setColorFilter(porterDuffColorFilter);
            }
            int i3 = this.A06.A02;
            drawable.setBounds(width, i2, i3 + width, i3 + i2);
            if (this.A0H) {
                canvas.scale(-1.0f, 1.0f, drawable.getBounds().exactCenterX(), 0.0f);
            }
            drawable.draw(canvas);
            drawable.clearColorFilter();
        }
        if (this.A07 == C27881Xz.OUTLINE) {
            RectF rectF = this.A0J;
            rectF.set(getBackground().getBounds());
            float f2 = ((float) this.A06.A09) / 2.0f;
            AnonymousClass4ZM r12 = this.A06;
            float f3 = (float) r12.A04;
            float height2 = (((float) getHeight()) / 2.0f) - f3;
            RectF rectF2 = this.A0K;
            float f4 = (float) r12.A03;
            rectF2.set(rectF.left + f2 + f4, rectF.top + f2 + f3, (rectF.right - f2) - f4, (rectF.bottom - f2) - f3);
            canvas.drawRoundRect(rectF2, height2, height2, getButtonStrokePaint());
        }
    }

    public void onMeasure(int i, int i2) {
        int min;
        this.A0F = true;
        CharSequence text = getText();
        if ((text == null || text.length() == 0) && this.A00 != null) {
            min = this.A06.A05;
        } else {
            min = Math.min(getMaxWidth(), Math.max(getMinWidth(), getFixedSpace$app_ui_wds_wds() + this.A06.A02 + ((int) getPaint().measureText(AnonymousClass3Ma.A13(this)))));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.resolveSize(min, i), 1073741824), View.MeasureSpec.makeMeasureSpec(this.A06.A01, 1073741824));
    }

    public final void setAction(AnonymousClass4DG r2) {
        C18070vi.A0d(r2, 0);
        boolean A1Z = AnonymousClass3Ma.A1Z(this.A05, r2);
        this.A05 = r2;
        if (A1Z) {
            A05();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable A0B2;
        Drawable A0B3;
        if (i == 0) {
            A0B2 = null;
        } else {
            A0B2 = AnonymousClass3MZ.A0B(this, i);
        }
        if (i3 == 0) {
            A0B3 = null;
        } else {
            A0B3 = AnonymousClass3MZ.A0B(this, i3);
        }
        setCompoundDrawablesWithIntrinsicBounds(A0B2, (Drawable) null, A0B3, (Drawable) null);
    }

    public final void setDimen$app_ui_wds_wds(AnonymousClass4ZM r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setSize(AnonymousClass4D1 r2) {
        C18070vi.A0d(r2, 0);
        boolean A1Z = AnonymousClass3Ma.A1Z(this.A0C, r2);
        this.A0C = r2;
        if (A1Z) {
            A04();
            A05();
            requestLayout();
        }
    }

    public final void setVariant(C27881Xz r2) {
        C18070vi.A0d(r2, 0);
        boolean A1Z = AnonymousClass3Ma.A1Z(this.A07, r2);
        this.A07 = r2;
        if (A1Z) {
            A05();
        }
    }

    public void setupBackgroundStyle(ColorStateList colorStateList, ColorStateList colorStateList2) {
        int colorForState;
        C18070vi.A0d(colorStateList, 0);
        int defaultColor = colorStateList.getDefaultColor();
        if (!this.A0A || !isEnabled()) {
            colorForState = colorStateList.getColorForState(getDrawableState(), defaultColor);
        } else {
            colorForState = defaultColor;
        }
        Drawable A032 = A03(colorForState, false);
        if (isEnabled()) {
            A032 = new RippleDrawable(colorStateList, A032, A03(colorStateList.getColorForState(new int[]{16842919, 16842910}, defaultColor), true));
        }
        setBackground(A032);
    }

    public void setupContentStyle(ColorStateList colorStateList) {
        C18070vi.A0d(colorStateList, 0);
        int colorForState = colorStateList.getColorForState(getDrawableState(), -1);
        getPaint().setColor(colorForState);
        getPaint().setTextSize((float) this.A06.A0A);
        this.A0B = new PorterDuffColorFilter(colorForState, PorterDuff.Mode.SRC_IN);
        boolean z = false;
        if (this.A05 == AnonymousClass4DG.MEDIA && this.A07 == C27881Xz.OUTLINE) {
            z = true;
        }
        TextPaint paint = getPaint();
        if (z) {
            paint.setShadowLayer(2.0f, 0.0f, 0.0f, C19740yt.A00(getContext(), 2131103235));
        } else {
            paint.clearShadowLayer();
        }
    }

    private final void A04() {
        Integer num;
        int i;
        int dimensionPixelSize;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int dimensionPixelSize2;
        int i9;
        if (this.A0G) {
            boolean A1X = AnonymousClass000.A1X(this.A00);
            CharSequence text = getText();
            if (text == null || text.length() == 0) {
                if (!A1X) {
                    num = AnonymousClass00R.A00;
                }
                num = AnonymousClass00R.A01;
            } else {
                if (!A1X) {
                    num = AnonymousClass00R.A0C;
                }
                num = AnonymousClass00R.A01;
            }
            AnonymousClass4ZM r6 = this.A06;
            Resources A052 = AnonymousClass3MX.A05(this);
            AnonymousClass4D1 r2 = this.A0C;
            C27881Xz r1 = this.A07;
            AnonymousClass4DG r0 = this.A05;
            C18070vi.A0d(r2, 1);
            C18070vi.A0f(r1, 2, r0);
            r6.A0C = r2;
            r6.A0D = r1;
            r6.A0E = num;
            r6.A0B = r0;
            r6.A01 = AnonymousClass4ZM.A00(A052, r6);
            AnonymousClass4DG r02 = r6.A0B;
            AnonymousClass4DG r22 = AnonymousClass4DG.SECTION_HEADER;
            if (r02 != r22 || !AnonymousClass1J8.A05(r6.A0F)) {
                int ordinal = r6.A0C.ordinal();
                if (ordinal == 0) {
                    i = 2131169378;
                } else if (ordinal == 1) {
                    i = 2131169396;
                } else if (ordinal == 2) {
                    i = 2131169373;
                } else {
                    throw AnonymousClass3MW.A14();
                }
                dimensionPixelSize = A052.getDimensionPixelSize(i);
            } else {
                dimensionPixelSize = AnonymousClass4ZM.A00(A052, r6) - (AnonymousClass4ZM.A01(A052, r6) * 2);
            }
            r6.A05 = dimensionPixelSize;
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue == 0) {
                    int ordinal2 = r6.A0C.ordinal();
                    if (ordinal2 == 0) {
                        i9 = 2131169355;
                    } else if (ordinal2 == 1) {
                        i9 = 2131169392;
                    } else if (ordinal2 == 2) {
                        i9 = 2131169369;
                    } else {
                        throw AnonymousClass3MW.A14();
                    }
                } else if (intValue == 2) {
                    int ordinal3 = r6.A0C.ordinal();
                    if (ordinal3 == 0) {
                        i9 = 2131169356;
                    } else if (ordinal3 == 1) {
                        i9 = 2131169393;
                    } else if (ordinal3 == 2) {
                        i9 = 2131169370;
                    } else {
                        throw AnonymousClass3MW.A14();
                    }
                } else {
                    throw AnonymousClass3MW.A14();
                }
                i2 = A052.getDimensionPixelSize(i9);
            } else {
                i2 = 0;
            }
            r6.A02 = i2;
            r6.A0A = A052.getDimensionPixelSize(2131169402);
            int ordinal4 = r6.A0C.ordinal();
            if (ordinal4 == 0) {
                i3 = 2131169401;
            } else if (ordinal4 == 1) {
                i3 = 2131169400;
            } else if (ordinal4 == 2) {
                i3 = 2131169377;
            } else {
                throw AnonymousClass3MW.A14();
            }
            r6.A09 = A052.getDimensionPixelSize(i3);
            int ordinal5 = r6.A0C.ordinal();
            if (ordinal5 == 0) {
                int ordinal6 = r6.A0D.ordinal();
                i4 = 3;
                int intValue2 = r6.A0E.intValue();
                if (ordinal6 != 3) {
                    if (intValue2 != 1) {
                        if (intValue2 != 0) {
                            if (intValue2 != 2) {
                                throw AnonymousClass3MW.A14();
                            }
                        }
                    }
                    i5 = 2131169380;
                } else if (intValue2 == 1) {
                    i5 = 2131169349;
                } else if (intValue2 != 0) {
                    if (intValue2 == 2) {
                        i5 = 2131169346;
                    } else {
                        throw AnonymousClass3MW.A14();
                    }
                }
                i5 = 2131169353;
            } else if (ordinal5 == 1) {
                int ordinal7 = r6.A0D.ordinal();
                i4 = 3;
                int intValue3 = r6.A0E.intValue();
                if (ordinal7 != 3) {
                    if (intValue3 != 1) {
                        if (intValue3 != 0) {
                            if (intValue3 != 2) {
                                throw AnonymousClass3MW.A14();
                            }
                        }
                    }
                    i5 = 2131169398;
                } else if (intValue3 == 1) {
                    i5 = 2131169386;
                } else if (intValue3 != 0) {
                    if (intValue3 == 2) {
                        i5 = 2131169383;
                    } else {
                        throw AnonymousClass3MW.A14();
                    }
                }
                i5 = 2131169390;
            } else if (ordinal5 == 2) {
                int ordinal8 = r6.A0D.ordinal();
                i4 = 3;
                int intValue4 = r6.A0E.intValue();
                if (ordinal8 != 3) {
                    if (intValue4 != 1) {
                        if (intValue4 != 0) {
                            if (intValue4 != 2) {
                                throw AnonymousClass3MW.A14();
                            }
                        }
                    }
                    i5 = 2131169375;
                } else if (intValue4 == 1) {
                    i5 = 2131169363;
                } else if (intValue4 != 0) {
                    if (intValue4 == 2) {
                        i5 = 2131169360;
                    } else {
                        throw AnonymousClass3MW.A14();
                    }
                }
                i5 = 2131169367;
            } else {
                throw AnonymousClass3MW.A14();
            }
            r6.A07 = A052.getDimensionPixelSize(i5);
            int ordinal9 = r6.A0C.ordinal();
            if (ordinal9 == 0) {
                int ordinal10 = r6.A0D.ordinal();
                int intValue5 = r6.A0E.intValue();
                if (ordinal10 != i4) {
                    if (intValue5 != 1) {
                        if (intValue5 != 0) {
                            if (intValue5 != 2) {
                                throw AnonymousClass3MW.A14();
                            }
                        }
                    }
                    i6 = 2131169381;
                } else if (intValue5 == 1) {
                    i6 = 2131169350;
                } else if (intValue5 != 0) {
                    if (intValue5 == 2) {
                        i6 = 2131169347;
                    } else {
                        throw AnonymousClass3MW.A14();
                    }
                }
                i6 = 2131169354;
            } else if (ordinal9 == 1) {
                int ordinal11 = r6.A0D.ordinal();
                int intValue6 = r6.A0E.intValue();
                if (ordinal11 != i4) {
                    if (intValue6 != 1) {
                        if (intValue6 != 0) {
                            if (intValue6 != 2) {
                                throw AnonymousClass3MW.A14();
                            }
                        }
                    }
                    i6 = 2131169399;
                } else if (intValue6 == 1) {
                    i6 = 2131169387;
                } else if (intValue6 != 0) {
                    if (intValue6 == 2) {
                        i6 = 2131169384;
                    } else {
                        throw AnonymousClass3MW.A14();
                    }
                }
                i6 = 2131169391;
            } else if (ordinal9 == 2) {
                int ordinal12 = r6.A0D.ordinal();
                int intValue7 = r6.A0E.intValue();
                if (ordinal12 != i4) {
                    if (intValue7 != 1) {
                        if (intValue7 != 0) {
                            if (intValue7 != 2) {
                                throw AnonymousClass3MW.A14();
                            }
                        }
                    }
                    i6 = 2131169376;
                } else if (intValue7 == 1) {
                    i6 = 2131169364;
                } else if (intValue7 != 0) {
                    if (intValue7 == 2) {
                        i6 = 2131169361;
                    } else {
                        throw AnonymousClass3MW.A14();
                    }
                }
                i6 = 2131169368;
            } else {
                throw AnonymousClass3MW.A14();
            }
            r6.A08 = A052.getDimensionPixelSize(i6);
            r6.A04 = AnonymousClass4ZM.A01(A052, r6);
            int ordinal13 = r6.A0C.ordinal();
            if (ordinal13 == 0) {
                int ordinal14 = r6.A0D.ordinal();
                int intValue8 = r6.A0E.intValue();
                if (ordinal14 != i4) {
                    if (intValue8 != 1) {
                        if (intValue8 != 0) {
                            if (intValue8 != 2) {
                                throw AnonymousClass3MW.A14();
                            }
                        }
                    }
                    i7 = 2131169379;
                } else if (intValue8 == 1) {
                    i7 = 2131169348;
                } else if (intValue8 != 0) {
                    if (intValue8 == 2) {
                        i7 = 2131169345;
                    } else {
                        throw AnonymousClass3MW.A14();
                    }
                }
                i7 = 2131169352;
            } else if (ordinal13 == 1) {
                int ordinal15 = r6.A0D.ordinal();
                int intValue9 = r6.A0E.intValue();
                if (ordinal15 != i4) {
                    if (intValue9 != 1) {
                        if (intValue9 != 0) {
                            if (intValue9 != 2) {
                                throw AnonymousClass3MW.A14();
                            }
                        }
                    }
                    i7 = 2131169397;
                } else if (intValue9 == 1) {
                    i7 = 2131169385;
                } else if (intValue9 != 0) {
                    if (intValue9 == 2) {
                        i7 = 2131169382;
                    } else {
                        throw AnonymousClass3MW.A14();
                    }
                }
                i7 = 2131169389;
            } else if (ordinal13 == 2) {
                int ordinal16 = r6.A0D.ordinal();
                int intValue10 = r6.A0E.intValue();
                if (ordinal16 != i4) {
                    if (intValue10 != 1) {
                        if (intValue10 != 0) {
                            if (intValue10 != 2) {
                                throw AnonymousClass3MW.A14();
                            }
                        }
                    }
                    i7 = 2131169374;
                } else if (intValue10 == 1) {
                    i7 = 2131169362;
                } else if (intValue10 != 0) {
                    if (intValue10 == 2) {
                        i7 = 2131169359;
                    } else {
                        throw AnonymousClass3MW.A14();
                    }
                }
                i7 = 2131169366;
            } else {
                throw AnonymousClass3MW.A14();
            }
            r6.A06 = A052.getDimensionPixelSize(i7);
            if (r6.A0B != r22 || !AnonymousClass1J8.A05(r6.A0F)) {
                int ordinal17 = r6.A0C.ordinal();
                if (ordinal17 == 0) {
                    i8 = 2131169357;
                } else if (ordinal17 == 1) {
                    i8 = 2131169394;
                } else if (ordinal17 == 2) {
                    i8 = 2131169371;
                } else {
                    throw AnonymousClass3MW.A14();
                }
                dimensionPixelSize2 = A052.getDimensionPixelSize(i8);
            } else {
                dimensionPixelSize2 = 0;
            }
            r6.A03 = dimensionPixelSize2;
            r6.A00 = (((float) r6.A01) / 2.0f) - ((float) r6.A04);
            this.A0D = num;
            getButtonStrokePaint().setStrokeWidth((float) this.A06.A09);
            this.A0F = true;
        }
    }

    private final void A05() {
        if (this.A0G) {
            setStateListAnimator((StateListAnimator) null);
            Context A042 = AnonymousClass3MY.A04(this);
            C27881Xz r3 = this.A07;
            C88614aD r2 = new C88614aD(A042, this.A03, this.A05, r3);
            AnonymousClass4UO r1 = r2.A01;
            if (r1 != null) {
                setupContentStyle(A02(AnonymousClass3MY.A04(this), r1));
                AnonymousClass4UO r12 = r2.A00;
                if (r12 != null) {
                    setupBackgroundStyle(A02(AnonymousClass3MY.A04(this), r12), (ColorStateList) null);
                    AnonymousClass4UO r13 = r2.A02;
                    if (r13 != null) {
                        setupStrokeStyle(A02(AnonymousClass3MY.A04(this), r13));
                        return;
                    }
                    return;
                }
                C18070vi.A11("background");
                throw null;
            }
            C18070vi.A11("content");
            throw null;
        }
    }

    private final Paint getButtonStrokePaint() {
        return (Paint) this.A0L.getValue();
    }

    private final String getEllipsizedText() {
        if (!this.A0F) {
            return this.A0E;
        }
        this.A0F = false;
        return TextUtils.ellipsize(getText(), getPaint(), Math.min((float) ((getWidth() - getFixedSpace$app_ui_wds_wds()) - this.A06.A02), getPaint().measureText(AnonymousClass3Ma.A13(this))), TextUtils.TruncateAt.END).toString();
    }

    private final void setupIcon(Drawable drawable) {
        C18030ve r2;
        int[] iArr;
        if ((drawable instanceof StateListDrawable) && (r2 = this.A03) != null && C18020vd.A05(C18040vf.A02, r2, 4359)) {
            if (isSelected()) {
                iArr = A0M;
            } else {
                iArr = A0N;
            }
            drawable.setState(iArr);
        }
        C18030ve r22 = this.A03;
        if (r22 != null && C18020vd.A05(C18040vf.A02, r22, 4358)) {
            if (drawable != null) {
                drawable = drawable.mutate();
            } else {
                drawable = null;
            }
        }
        this.A00 = drawable;
    }

    public final AnonymousClass19D getAbPreChatdProps() {
        return this.A02;
    }

    public final C18030ve getAbProps() {
        return this.A03;
    }

    public final AnonymousClass4DG getAction() {
        return this.A05;
    }

    public final AnonymousClass4ZM getDimen$app_ui_wds_wds() {
        return this.A06;
    }

    public final int getFixedSpace$app_ui_wds_wds() {
        AnonymousClass4ZM r2 = this.A06;
        return (r2.A03 * 2) + r2.A07 + r2.A06 + r2.A08;
    }

    public final Drawable getIcon() {
        return this.A00;
    }

    public final Drawable getIcon$app_ui_wds_wds() {
        return this.A00;
    }

    public final boolean getMirrorIconForRtl() {
        return this.A0H;
    }

    public final boolean getOverrideVrIconOnlyShape() {
        return false;
    }

    public final AnonymousClass4D1 getSize() {
        return this.A0C;
    }

    public final AnonymousClass1DC getSystemFeatures() {
        return this.A04;
    }

    public final boolean getToggleSelection() {
        return this.A0A;
    }

    public final C27881Xz getVariant() {
        return this.A07;
    }

    public final C18000vb getWhatsAppLocale() {
        return this.A01;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == null) {
            setVariant(C27881Xz.BORDERLESS);
        } else {
            super.setBackground(drawable);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (!this.A09 || drawable != null) {
            setIcon(drawable);
        } else {
            setIcon(drawable3);
        }
    }

    public final void setIcon(int i) {
        Drawable A0B2;
        if (i == 0) {
            A0B2 = null;
        } else {
            A0B2 = AnonymousClass3MZ.A0B(this, i);
        }
        setIcon(A0B2);
    }

    public final void setMirrorIconForRtl(boolean z) {
        boolean z2 = this.A0H;
        boolean z3 = true;
        boolean A1S = AnonymousClass000.A1S(z2 ? 1 : 0, z ? 1 : 0);
        boolean z4 = this.A09;
        if (!z4 || !z) {
            z3 = false;
        }
        this.A0H = z3;
        if (z4 && A1S) {
            A05();
            requestLayout();
        }
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        Integer num;
        if (!this.A0F) {
            this.A0F = !C18070vi.A18(getText(), String.valueOf(charSequence));
        }
        super.setText(charSequence, bufferType);
        boolean A1X = AnonymousClass000.A1X(this.A00);
        if (charSequence == null || charSequence.length() == 0) {
            if (!A1X) {
                num = AnonymousClass00R.A00;
            }
            num = AnonymousClass00R.A01;
        } else {
            if (!A1X) {
                num = AnonymousClass00R.A0C;
            }
            num = AnonymousClass00R.A01;
        }
        if (num != this.A0D) {
            A04();
            A05();
            requestLayout();
        }
    }

    public final void setToggleSelection(boolean z) {
        if (this.A05 == AnonymousClass4DG.MEDIA) {
            C27881Xz r2 = this.A07;
            C27881Xz r1 = C27881Xz.FILLED;
            if (r2 == r1 || r2 == C27881Xz.TONAL) {
                boolean z2 = this.A0A;
                boolean A1S = AnonymousClass000.A1S(z2 ? 1 : 0, z ? 1 : 0);
                this.A0A = z;
                if (A1S) {
                    if (!isSelected()) {
                        r1 = C27881Xz.TONAL;
                    }
                    setVariant(r1);
                }
            }
        }
    }

    private final void setupStrokeStyle(ColorStateList colorStateList) {
        getButtonStrokePaint().setColor(colorStateList.getColorForState(getDrawableState(), 0));
        boolean z = false;
        if (this.A05 == AnonymousClass4DG.MEDIA && this.A07 == C27881Xz.OUTLINE) {
            z = true;
        }
        Paint buttonStrokePaint = getButtonStrokePaint();
        if (z) {
            buttonStrokePaint.setShadowLayer(2.0f, 0.0f, 0.0f, C19740yt.A00(getContext(), 2131103235));
        } else {
            buttonStrokePaint.clearShadowLayer();
        }
    }

    public final void setAbPreChatdProps(AnonymousClass19D r1) {
        this.A02 = r1;
    }

    public final void setAbProps(C18030ve r1) {
        this.A03 = r1;
    }

    public final void setBrandIcon(boolean z) {
        this.A08 = z;
    }

    public void setEnabled(boolean z) {
        if (isEnabled() != z) {
            super.setEnabled(z);
            A05();
        }
    }

    public final void setIcon$app_ui_wds_wds(Drawable drawable) {
        this.A00 = drawable;
    }

    public final void setOverrideVrIconOnlyShape(boolean z) {
    }

    public final void setRtl$app_ui_wds_wds(boolean z) {
        this.A09 = z;
    }

    public void setSelected(boolean z) {
        C27881Xz r0;
        if (isSelected() != z) {
            super.setSelected(z);
            if (this.A0A) {
                if (isSelected()) {
                    r0 = C27881Xz.FILLED;
                } else {
                    r0 = C27881Xz.TONAL;
                }
                setVariant(r0);
            }
            A05();
            Drawable drawable = this.A00;
            if (drawable instanceof StateListDrawable) {
                setIcon(drawable);
            } else {
                requestLayout();
            }
        }
    }

    public final void setSystemFeatures(AnonymousClass1DC r1) {
        this.A04 = r1;
    }

    public final void setWhatsAppLocale(C18000vb r1) {
        this.A01 = r1;
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (!this.A09 || drawable != null) {
            setIcon(drawable);
        } else {
            setIcon(drawable3);
        }
    }

    public final void setIcon(Drawable drawable) {
        setupIcon(drawable);
        A04();
        requestLayout();
    }
}
