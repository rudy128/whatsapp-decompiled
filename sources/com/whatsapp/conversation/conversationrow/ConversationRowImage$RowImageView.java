package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00R;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4OH;
import X.AnonymousClass4QT;
import X.C108355bZ;
import X.C17960vV;
import X.C18000vb;
import X.C18070vi;
import X.C19880zA;
import X.C19890zB;
import X.C27691Xc;
import X.C62572rc;
import X.C72453Mb;
import X.C72463Mc;
import X.C72483Me;
import X.C72643My;
import X.C74743cP;
import X.C79973wL;
import X.C80013wP;
import X.C80043wS;
import X.C88164Yo;
import X.C88264Yz;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import androidx.appcompat.widget.AppCompatImageView;

public class ConversationRowImage$RowImageView extends AppCompatImageView implements AnonymousClass009 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public C19880zA A05;
    public C62572rc A06;
    public C108355bZ A07;
    public C88164Yo A08;
    public C18000vb A09;
    public AnonymousClass4OH A0A;
    public AnonymousClass031 A0B;
    public Integer A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public Shader A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public final Matrix A0P;
    public final RectF A0Q;
    public final RectF A0R;
    public final RectF A0S;

    public static void A01(ConversationRowImage$RowImageView conversationRowImage$RowImageView) {
        Integer num;
        if (conversationRowImage$RowImageView.A0A != null) {
            if (conversationRowImage$RowImageView.A0J) {
                num = AnonymousClass00R.A00;
            } else {
                num = AnonymousClass00R.A01;
            }
            conversationRowImage$RowImageView.A04 = conversationRowImage$RowImageView.A07.BS0(num, C72453Mb.A05(conversationRowImage$RowImageView.A0N ? 1 : 0), conversationRowImage$RowImageView.A0I);
        }
    }

    public void A03() {
        if (!this.A0M) {
            this.A0M = true;
            C27691Xc r2 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            this.A05 = C19890zB.A00;
            AnonymousClass10E r1 = r2.A10;
            this.A09 = AnonymousClass10E.A6Q(r1);
            this.A0A = (AnonymousClass4OH) r1.A00.A9R.get();
            this.A07 = AnonymousClass3MZ.A0V(r2.A0z);
        }
    }

    public void A04(int i, int i2) {
        C62572rc r0 = this.A06;
        if (r0 == null) {
            r0 = new C62572rc();
            this.A06 = r0;
        }
        r0.A08 = i;
        r0.A06 = i2;
        setImageData(r0);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0B;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public int getRowWidth() {
        return C88164Yo.A01(this.A08);
    }

    public void setFullWidth(boolean z) {
        this.A0D = z;
        A02(this);
    }

    public void setImageBitmap(Bitmap bitmap) {
        C72643My r0;
        if (bitmap == null) {
            r0 = null;
        } else {
            r0 = new C72643My(AnonymousClass000.A0Y(this), bitmap, this);
        }
        super.setImageDrawable(r0);
        A00();
    }

    public void setImageData(C62572rc r3) {
        this.A06 = r3;
        this.A08.A00 = new C62572rc(r3);
    }

    public void setInAlbum(boolean z) {
        this.A0F = z;
        A02(this);
    }

    public void setOutgoing(boolean z) {
        if (this.A0N != z) {
            this.A0N = z;
            A01(this);
        }
    }

    public void setPaddingOnTopOnly(boolean z) {
        if (z != this.A0J) {
            this.A0J = z;
            A01(this);
        }
    }

    public void setPortraitPreviewEnabled(boolean z) {
        this.A0O = z;
        A02(this);
    }

    public ConversationRowImage$RowImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0R = C72483Me.A0G(this);
        this.A0Q = AnonymousClass3MW.A08();
        this.A0P = new Matrix();
        this.A0S = AnonymousClass3MW.A08();
        A01(this);
        A02(this);
    }

    private void A00() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        RectF A022 = this.A08.A02(measuredWidth, measuredHeight);
        RectF rectF = new RectF(0.0f, 0.0f, (float) measuredWidth, (float) measuredHeight);
        if (A022 != null) {
            RectF rectF2 = this.A0Q;
            rectF2.set(A022);
            RectF rectF3 = this.A0R;
            rectF3.set(rectF);
            Matrix matrix = this.A0P;
            matrix.setRectToRect(rectF2, rectF3, Matrix.ScaleToFit.FILL);
            setImageMatrix(matrix);
        }
    }

    public static void A02(ConversationRowImage$RowImageView conversationRowImage$RowImageView) {
        C62572rc r4;
        AnonymousClass4QT r1;
        C88164Yo r3;
        AnonymousClass4QT r12;
        C62572rc r0;
        int A002 = C88264Yz.A00(conversationRowImage$RowImageView.getContext());
        C88164Yo r02 = conversationRowImage$RowImageView.A08;
        if (r02 == null || (r0 = r02.A00) == null) {
            r4 = null;
        } else {
            r4 = new C62572rc(r0);
        }
        if (conversationRowImage$RowImageView.A0F) {
            r3 = new C79973wL(A002, AnonymousClass3MZ.A0F(AnonymousClass3Ma.A05(conversationRowImage$RowImageView)).getHeight());
        } else if (conversationRowImage$RowImageView.A0D) {
            Context context = conversationRowImage$RowImageView.getContext();
            boolean z = conversationRowImage$RowImageView.A0O;
            C18070vi.A0d(context, 1);
            int A092 = C72453Mb.A09(context);
            if (z) {
                r12 = C80013wP.A02;
            } else {
                r12 = C80013wP.A01;
            }
            r3 = new C80043wS(r12, C80013wP.A00, A092);
        } else {
            if (conversationRowImage$RowImageView.A0O) {
                r1 = C80043wS.A04;
            } else {
                r1 = C80043wS.A03;
            }
            r3 = new C80043wS(r1, C80043wS.A02, A002);
        }
        conversationRowImage$RowImageView.A08 = r3;
        if (r4 != null) {
            r3.A00 = r4;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        A02(this);
        super.onConfigurationChanged(configuration);
    }

    public void onDraw(Canvas canvas) {
        Drawable drawable;
        super.onDraw(canvas);
        if (!isInEditMode()) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int A092 = C72463Mc.A09(this);
            int height = getHeight() - getPaddingBottom();
            Context context = getContext();
            C17960vV.A07(context);
            AnonymousClass4OH r8 = this.A0A;
            if (r8 != null) {
                Integer num = this.A0C;
                if (num == AnonymousClass00R.A0C) {
                    int height2 = getHeight();
                    AnonymousClass4OH r0 = this.A0A;
                    r0.A00.setShader(this.A0L);
                    RectF rectF = this.A0S;
                    float f = (float) height2;
                    rectF.set(0.0f, f - (context.getResources().getDimension(2131168020) * 1.0f), (float) getWidth(), f);
                    canvas.drawRect(rectF, this.A0A.A00);
                } else if (num == AnonymousClass00R.A01) {
                    Drawable drawable2 = r8.A02;
                    if (drawable2 == null) {
                        drawable2 = new C74743cP(context.getResources().getDrawable(2131231079), r8.A03);
                        r8.A02 = drawable2;
                    }
                    C19880zA r1 = this.A05;
                    if (!r1.A07() || !this.A0E) {
                        if (AnonymousClass3MY.A1b(this.A09)) {
                            drawable2.setBounds(A092 - drawable2.getIntrinsicWidth(), height - drawable2.getIntrinsicHeight(), A092, height);
                        } else {
                            drawable2.setBounds(paddingLeft, height - drawable2.getIntrinsicHeight(), drawable2.getIntrinsicWidth() + paddingLeft, height);
                        }
                        drawable2.draw(canvas);
                    } else {
                        r1.A03();
                        throw AnonymousClass000.A0s("getFrameOverlayShadeLabelsDrawable");
                    }
                }
                if (this.A0K && !this.A0F && (drawable = this.A04) != null) {
                    drawable.setBounds(paddingLeft, paddingTop, A092, height);
                    this.A04.draw(canvas);
                }
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00();
    }

    public void onMeasure(int i, int i2) {
        int A0M2;
        int A0M3;
        if (isInEditMode()) {
            A0M2 = 800;
            A0M3 = 600;
        } else {
            Pair A032 = this.A08.A03(i, i2);
            if (this.A0G) {
                A0M2 = this.A01;
                A0M3 = this.A00;
            } else if (this.A0H) {
                A0M2 = this.A03;
                A0M3 = this.A02;
            } else {
                A0M2 = AnonymousClass000.A0M(A032.first);
                A0M3 = AnonymousClass000.A0M(A032.second);
            }
        }
        setMeasuredDimension(A0M2, A0M3);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!isInEditMode() && this.A0C == AnonymousClass00R.A0C && this.A0A != null) {
            Context context = getContext();
            float f = (float) i2;
            this.A0L = new LinearGradient(0.0f, f - (context.getResources().getDimension(2131168020) * 1.0f), 0.0f, f, 0, context.getResources().getColor(2131099889), Shader.TileMode.CLAMP);
        }
    }

    public void setCarouselCardHeight(int i) {
        this.A00 = i;
    }

    public void setCarouselCardWidth(int i) {
        this.A01 = i;
    }

    public void setHasLabels(boolean z) {
        this.A0E = z;
    }

    public void setIsCarouselCard(boolean z) {
        this.A0G = z;
    }

    public void setIsLimitedTimeOffer(boolean z) {
        this.A0H = z;
    }

    public void setLimitedTimeOfferHeight(int i) {
        this.A02 = i;
    }

    public void setLimitedTimeOfferWidth(int i) {
        this.A03 = i;
    }

    public void setRoundedCornersEnabled(boolean z) {
        this.A0K = z;
    }

    public void setTemplateImageRatio(boolean z) {
        A02(this);
    }

    public ConversationRowImage$RowImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0R = C72483Me.A0G(this);
        this.A0Q = AnonymousClass3MW.A08();
        this.A0P = new Matrix();
        this.A0S = AnonymousClass3MW.A08();
        A01(this);
        A02(this);
    }

    public ConversationRowImage$RowImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A03();
    }

    public ConversationRowImage$RowImageView(Context context) {
        super(context, (AttributeSet) null);
        this.A0R = C72483Me.A0G(this);
        this.A0Q = AnonymousClass3MW.A08();
        this.A0P = new Matrix();
        this.A0S = AnonymousClass3MW.A08();
        A01(this);
        A02(this);
    }
}
