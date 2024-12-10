package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00R;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass4QT;
import X.C108355bZ;
import X.C18070vi;
import X.C27691Xc;
import X.C62572rc;
import X.C72453Mb;
import X.C79973wL;
import X.C80003wO;
import X.C80013wP;
import X.C80043wS;
import X.C88164Yo;
import X.C88264Yz;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;

public class ConversationRowVideo$RowVideoView extends AppCompatImageView implements AnonymousClass009 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public View A05;
    public FrameLayout A06;
    public C108355bZ A07;
    public C88164Yo A08;
    public AnonymousClass031 A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public int A0F;
    public int A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;

    public static void A01(ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView) {
        Integer num;
        if (conversationRowVideo$RowVideoView.A0B) {
            num = AnonymousClass00R.A00;
        } else {
            num = AnonymousClass00R.A01;
        }
        conversationRowVideo$RowVideoView.A04 = conversationRowVideo$RowVideoView.A07.BS0(num, C72453Mb.A05(conversationRowVideo$RowVideoView.A0C ? 1 : 0), conversationRowVideo$RowVideoView.A0D);
    }

    public void A02() {
        if (!this.A0J) {
            this.A0J = true;
            this.A07 = AnonymousClass3MZ.A0V(((C27691Xc) ((AnonymousClass033) generatedComponent())).A0z);
        }
    }

    public void A03(int i, int i2, boolean z) {
        int i3;
        int i4 = this.A0G;
        if (i4 <= 0 || (i3 = this.A0F) <= 0 || z) {
            hashCode();
            this.A0G = i;
            i4 = i;
            this.A0F = i2;
            i3 = i2;
        }
        this.A08.A05(i4, i3);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A09;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public int getRowWidth() {
        return C88164Yo.A01(this.A08);
    }

    public void setFullWidth(boolean z) {
        this.A0H = z;
        A00();
    }

    public void setInAlbum(boolean z) {
        this.A0I = z;
        A00();
    }

    public void setIsGif(boolean z) {
        this.A0K = z;
        A00();
    }

    public void setKeepRatio(boolean z) {
        this.A0L = z;
        A00();
    }

    public void setPortraitPreviewEnabled(boolean z) {
        this.A0M = z;
        A00();
    }

    public ConversationRowVideo$RowVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A0A = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A0B = false;
        this.A03 = 0;
        this.A02 = 0;
        A00();
    }

    private void A00() {
        C62572rc r3;
        AnonymousClass4QT r1;
        C88164Yo r4;
        AnonymousClass4QT r12;
        C62572rc r0;
        int A002 = C88264Yz.A00(getContext());
        C88164Yo r02 = this.A08;
        if (r02 == null || (r0 = r02.A00) == null) {
            r3 = null;
        } else {
            r3 = new C62572rc(r0);
        }
        if (this.A0I && this.A0L) {
            r4 = new C79973wL(A002, 0);
        } else if (this.A0K) {
            Context context = getContext();
            C18070vi.A0d(context, 1);
            r4 = new C80043wS(C80003wO.A01, C80003wO.A00, C72453Mb.A09(context));
        } else if (this.A0H) {
            Context context2 = getContext();
            boolean z = this.A0M;
            C18070vi.A0d(context2, 1);
            int A092 = C72453Mb.A09(context2);
            if (z) {
                r12 = C80013wP.A02;
            } else {
                r12 = C80013wP.A01;
            }
            r4 = new C80043wS(r12, C80013wP.A00, A092);
        } else if (this.A0L) {
            r4 = new C88164Yo(A002);
        } else {
            if (this.A0M) {
                r1 = C80043wS.A04;
            } else {
                r1 = C80043wS.A03;
            }
            r4 = new C80043wS(r1, C80043wS.A02, A002);
        }
        this.A08 = r4;
        if (r3 != null) {
            r4.A00 = r3;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        A00();
        super.onConfigurationChanged(configuration);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.A04 != null && !this.A0I) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.A04.setBounds(new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom)));
            this.A04.draw(canvas);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int A0M2;
        int A0M3;
        if (!isInEditMode()) {
            if (getDrawable() == null || (getDrawable() instanceof ColorDrawable)) {
                i3 = this.A0G;
                i4 = this.A0F;
            } else {
                i3 = this.A0G;
                if (i3 <= 0 || !this.A0E) {
                    i3 = getDrawable().getIntrinsicWidth();
                }
                i4 = this.A0F;
                if (i4 <= 0 || !this.A0E) {
                    i4 = getDrawable().getIntrinsicHeight();
                }
            }
            C88164Yo r0 = this.A08;
            r0.A05(i3, i4);
            Pair A032 = r0.A03(i, i2);
            if (this.A0A) {
                A0M2 = this.A01;
                A0M3 = this.A00;
            } else if (this.A0B) {
                A0M2 = this.A03;
                A0M3 = this.A02;
            } else {
                A0M2 = AnonymousClass000.A0M(A032.first);
                A0M3 = AnonymousClass000.A0M(A032.second);
            }
            setMeasuredDimension(A0M2, A0M3);
        } else if (this.A0L) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(600, 600);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!isInEditMode()) {
            FrameLayout frameLayout = this.A06;
            if (frameLayout != null) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = i2;
                this.A06.setLayoutParams(layoutParams);
            }
            View view = this.A05;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = i;
                this.A05.setLayoutParams(layoutParams2);
            }
        }
    }

    public void setCarouselCardHeight(int i) {
        this.A00 = i;
    }

    public void setCarouselCardWidth(int i) {
        this.A01 = i;
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A04 = drawable;
    }

    public void setIsCarouselCard(boolean z) {
        this.A0A = z;
    }

    public void setIsLimitedTimeOffer(boolean z) {
        this.A0B = z;
    }

    public void setIsOutgoing(boolean z) {
        this.A0C = z;
    }

    public void setIsThumbnailSizeMitigationEnabled(boolean z) {
        this.A0E = z;
    }

    public void setLimitedTimeOfferHeight(int i) {
        this.A02 = i;
    }

    public void setLimitedTimeOfferWidth(int i) {
        this.A03 = i;
    }

    public void setShade(View view) {
        this.A05 = view;
    }

    public void setVideoContainer(FrameLayout frameLayout) {
        this.A06 = frameLayout;
    }

    public ConversationRowVideo$RowVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
        this.A0A = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A0B = false;
        this.A03 = 0;
        this.A02 = 0;
        A00();
    }

    public ConversationRowVideo$RowVideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A02();
    }

    public ConversationRowVideo$RowVideoView(Context context) {
        super(context, (AttributeSet) null);
        A02();
        this.A0A = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A0B = false;
        this.A03 = 0;
        this.A02 = 0;
        A00();
    }
}
