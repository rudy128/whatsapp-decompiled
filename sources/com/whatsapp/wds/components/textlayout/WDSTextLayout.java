package com.whatsapp.wds.components.textlayout;

import X.AnonymousClass1Y0;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MZ;
import X.AnonymousClass4CE;
import X.AnonymousClass4CJ;
import X.AnonymousClass4CN;
import X.AnonymousClass4F6;
import X.AnonymousClass4F7;
import X.AnonymousClass5WG;
import X.C107805ac;
import X.C18070vi;
import X.C18090vk;
import X.C28236Dtw;
import X.C82824Cf;
import X.C82834Cg;
import X.C99074sE;
import X.C99404sl;
import X.E8K;
import X.EEE;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public final class WDSTextLayout extends FrameLayout {
    public static final /* synthetic */ EEE[] A0G;
    public C107805ac A00;
    public C107805ac A01;
    public final C18090vk A02;
    public final E8K A03;
    public final E8K A04;
    public final E8K A05;
    public final E8K A06;
    public final E8K A07;
    public final E8K A08;
    public final E8K A09;
    public final E8K A0A;
    public final E8K A0B;
    public final E8K A0C;
    public final E8K A0D;
    public final E8K A0E;
    public final E8K A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSTextLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C82824Cf r0;
        C82834Cg r02;
        AnonymousClass4CN r03;
        C18070vi.A0d(context, 1);
        C99074sE r1 = new C99074sE(this, 3);
        this.A02 = r1;
        this.A0F = new AnonymousClass5WG(this, AnonymousClass4CJ.A00);
        this.A0A = new C99404sl(r1);
        this.A09 = new C99404sl(r1);
        this.A07 = new C99404sl(r1);
        this.A08 = new C99404sl(r1);
        this.A04 = new C99404sl(r1);
        this.A06 = new C99404sl(r1);
        this.A0C = new C99404sl(r1);
        this.A0E = new C99404sl(r1);
        this.A0B = new C99404sl(r1);
        this.A0D = new C99404sl(r1);
        this.A05 = new C99404sl(r1);
        this.A03 = new C99404sl(r1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        if (attributeSet != null) {
            int[] iArr = AnonymousClass1Y0.A0I;
            C18070vi.A0Z(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            setHeaderImage(obtainStyledAttributes.getDrawable(3));
            setHeadlineText(obtainStyledAttributes.getString(4));
            setDescriptionText(obtainStyledAttributes.getString(0));
            setFootnoteText(obtainStyledAttributes.getString(2));
            setPrimaryButtonText(obtainStyledAttributes.getString(6));
            setSecondaryButtonText(obtainStyledAttributes.getString(7));
            int resourceId = obtainStyledAttributes.getResourceId(9, -1);
            if (resourceId != -1) {
                setContent(new AnonymousClass4CE(resourceId));
            }
            C82824Cf[] values = C82824Cf.values();
            int i = obtainStyledAttributes.getInt(1, -1);
            if (i < 0 || i >= values.length) {
                r0 = C82824Cf.CONTENT_END;
            } else {
                r0 = values[i];
            }
            setFootnotePosition(r0);
            C82834Cg[] values2 = C82834Cg.values();
            int i2 = obtainStyledAttributes.getInt(8, -1);
            if (i2 < 0 || i2 >= values2.length) {
                r02 = C82834Cg.MEDIUM;
            } else {
                r02 = values2[i2];
            }
            setLayoutSize(r02);
            AnonymousClass4CN[] values3 = AnonymousClass4CN.values();
            int i3 = obtainStyledAttributes.getInt(5, -1);
            if (i3 < 0 || i3 >= values3.length) {
                r03 = AnonymousClass4CN.CARD;
            } else {
                r03 = values3[i3];
            }
            setLayoutStyle(r03);
            obtainStyledAttributes.recycle();
        }
    }

    public final void setTextLayoutViewState(AnonymousClass4F7 r4) {
        C18070vi.A0d(r4, 0);
        this.A0F.CLJ(r4, A0G[0]);
    }

    static {
        Class<WDSTextLayout> cls = WDSTextLayout.class;
        A0G = new EEE[]{new C28236Dtw(cls, "textLayoutViewState", "getTextLayoutViewState()Lcom/whatsapp/wds/components/textlayout/model/TextLayoutViewState;"), new C28236Dtw(cls, "layoutStyle", "getLayoutStyle()Lcom/whatsapp/wds/components/textlayout/attributes/TextLayoutStyle;"), new C28236Dtw(cls, "layoutSize", "getLayoutSize()Lcom/whatsapp/wds/components/textlayout/attributes/TextLayoutSize;"), new C28236Dtw(cls, "headerImage", "getHeaderImage()Landroid/graphics/drawable/Drawable;"), new C28236Dtw(cls, "headlineText", "getHeadlineText()Ljava/lang/CharSequence;"), new C28236Dtw(cls, "descriptionText", "getDescriptionText()Ljava/lang/CharSequence;"), new C28236Dtw(cls, "footnoteText", "getFootnoteText()Ljava/lang/CharSequence;"), new C28236Dtw(cls, "primaryButtonText", "getPrimaryButtonText()Ljava/lang/String;"), new C28236Dtw(cls, "secondaryButtonText", "getSecondaryButtonText()Ljava/lang/String;"), new C28236Dtw(cls, "primaryButtonClickListener", "getPrimaryButtonClickListener()Landroid/view/View$OnClickListener;"), new C28236Dtw(cls, "secondaryButtonClickListener", "getSecondaryButtonClickListener()Landroid/view/View$OnClickListener;"), new C28236Dtw(cls, "footnotePosition", "getFootnotePosition()Lcom/whatsapp/wds/components/textlayout/attributes/FootnotePosition;"), new C28236Dtw(cls, "content", "getContent()Lcom/whatsapp/wds/components/textlayout/model/TextLayoutViewState$ContentView$Content;")};
    }

    public final AnonymousClass4F6 getContent() {
        return (AnonymousClass4F6) this.A03.BbC();
    }

    public final CharSequence getDescriptionText() {
        return (CharSequence) this.A04.BbC();
    }

    public final C82824Cf getFootnotePosition() {
        return (C82824Cf) this.A05.BbC();
    }

    public final CharSequence getFootnoteText() {
        return (CharSequence) this.A06.BbC();
    }

    public final Drawable getHeaderImage() {
        return (Drawable) this.A07.BbC();
    }

    public final CharSequence getHeadlineText() {
        return (CharSequence) this.A08.BbC();
    }

    public final C82834Cg getLayoutSize() {
        return (C82834Cg) this.A09.BbC();
    }

    public final AnonymousClass4CN getLayoutStyle() {
        return (AnonymousClass4CN) this.A0A.BbC();
    }

    public final View.OnClickListener getPrimaryButtonClickListener() {
        return (View.OnClickListener) this.A0B.BbC();
    }

    public final String getPrimaryButtonText() {
        return (String) this.A0C.BbC();
    }

    public final View.OnClickListener getSecondaryButtonClickListener() {
        return (View.OnClickListener) this.A0D.BbC();
    }

    public final String getSecondaryButtonText() {
        return (String) this.A0E.BbC();
    }

    public final AnonymousClass4F7 getTextLayoutViewState() {
        return (AnonymousClass4F7) this.A0F.BbC();
    }

    public final void setContent(AnonymousClass4F6 r4) {
        this.A03.CLJ(r4, A0G[12]);
    }

    public final void setDescriptionText(CharSequence charSequence) {
        this.A04.CLJ(charSequence, A0G[5]);
    }

    public final void setFootnotePosition(C82824Cf r4) {
        this.A05.CLJ(r4, A0G[11]);
    }

    public final void setFootnoteText(CharSequence charSequence) {
        this.A06.CLJ(charSequence, A0G[6]);
    }

    public final void setHeaderImage(Drawable drawable) {
        this.A07.CLJ(drawable, A0G[3]);
    }

    public final void setHeadlineText(CharSequence charSequence) {
        this.A08.CLJ(charSequence, A0G[4]);
    }

    public final void setLayoutSize(C82834Cg r4) {
        this.A09.CLJ(r4, A0G[2]);
    }

    public final void setLayoutStyle(AnonymousClass4CN r4) {
        this.A0A.CLJ(r4, A0G[1]);
    }

    public final void setPrimaryButtonClickListener(View.OnClickListener onClickListener) {
        this.A0B.CLJ(onClickListener, A0G[9]);
    }

    public final void setPrimaryButtonText(String str) {
        this.A0C.CLJ(str, A0G[7]);
    }

    public final void setSecondaryButtonClickListener(View.OnClickListener onClickListener) {
        this.A0D.CLJ(onClickListener, A0G[10]);
    }

    public final void setSecondaryButtonText(String str) {
        this.A0E.CLJ(str, A0G[8]);
    }

    public /* synthetic */ WDSTextLayout(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSTextLayout(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
