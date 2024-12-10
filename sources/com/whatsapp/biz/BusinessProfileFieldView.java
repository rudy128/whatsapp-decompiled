package com.whatsapp.biz;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass1KW;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C43251zV;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel;
import java.util.List;

public class BusinessProfileFieldView extends LinearLayout implements AnonymousClass009 {
    public C18000vb A00;
    public AnonymousClass1KW A01;
    public C18030ve A02;
    public AnonymousClass031 A03;
    public int A04;
    public ColorStateList A05;
    public ColorStateList A06;
    public ImageView A07;
    public EllipsizedTextEmojiLabel A08;
    public EllipsizedTextEmojiLabel A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.util.AttributeSet r12) {
        /*
            r11 = this;
            r2 = 1
            r10 = 0
            if (r12 == 0) goto L_0x006f
            android.content.res.Resources$Theme r1 = X.AnonymousClass3Ma.A06(r11)
            int[] r0 = X.AnonymousClass4IZ.A01
            r9 = 0
            android.content.res.TypedArray r6 = r1.obtainStyledAttributes(r12, r0, r9, r9)
            X.C18070vi.A0X(r6)
            r0 = 2
            android.graphics.drawable.Drawable r3 = r6.getDrawable(r0)     // Catch:{ all -> 0x006a }
            int r0 = r6.getInteger(r9, r9)     // Catch:{ all -> 0x006a }
            r11.A04 = r0     // Catch:{ all -> 0x006a }
            r0 = 3
            boolean r0 = r6.getBoolean(r0, r9)     // Catch:{ all -> 0x006a }
            r11.A0C = r0     // Catch:{ all -> 0x006a }
            r0 = 4
            android.content.res.ColorStateList r0 = r6.getColorStateList(r0)     // Catch:{ all -> 0x006a }
            r11.A05 = r0     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0050
            int[][] r8 = new int[r2][]     // Catch:{ all -> 0x006a }
            int[] r0 = new int[r9]     // Catch:{ all -> 0x006a }
            r8[r9] = r0     // Catch:{ all -> 0x006a }
            int[] r7 = new int[r2]     // Catch:{ all -> 0x006a }
            android.content.Context r5 = r11.getContext()     // Catch:{ all -> 0x006a }
            android.content.Context r4 = r11.getContext()     // Catch:{ all -> 0x006a }
            r1 = 2130970831(0x7f0408cf, float:1.7550383E38)
            r0 = 2131102246(0x7f060a26, float:1.7816925E38)
            int r0 = X.AnonymousClass3MZ.A02(r4, r5, r1, r0)     // Catch:{ all -> 0x006a }
            r7[r9] = r0     // Catch:{ all -> 0x006a }
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList     // Catch:{ all -> 0x006a }
            r0.<init>(r8, r7)     // Catch:{ all -> 0x006a }
            r11.A05 = r0     // Catch:{ all -> 0x006a }
        L_0x0050:
            r0 = 5
            android.content.res.ColorStateList r0 = r6.getColorStateList(r0)     // Catch:{ all -> 0x006a }
            r11.A06 = r0     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x005d
            android.content.res.ColorStateList r0 = r11.A05     // Catch:{ all -> 0x006a }
            r11.A06 = r0     // Catch:{ all -> 0x006a }
        L_0x005d:
            X.0vb r0 = r11.A00     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = r0.A0E(r6, r2)     // Catch:{ all -> 0x006a }
        L_0x0065:
            r11.A0A = r0     // Catch:{ all -> 0x006a }
            goto L_0x0071
        L_0x0068:
            r0 = r10
            goto L_0x0065
        L_0x006a:
            r0 = move-exception
            r6.recycle()
            throw r0
        L_0x006f:
            r3 = r10
            goto L_0x0074
        L_0x0071:
            r6.recycle()
        L_0x0074:
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r11)
            r0 = 2131624382(0x7f0e01be, float:1.8875942E38)
            android.view.View r1 = r1.inflate(r0, r11, r2)
            r0 = 2131430837(0x7f0b0db5, float:1.8483386E38)
            android.view.View r0 = X.AnonymousClass3MX.A0C(r1, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r11.A07 = r0
            r11.setIcon((android.graphics.drawable.Drawable) r3)
            r0 = 2131430838(0x7f0b0db6, float:1.8483388E38)
            android.view.View r0 = X.C18070vi.A05(r1, r0)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = (com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel) r0
            r11.A09 = r0
            r0 = 2131435857(0x7f0b2151, float:1.8493568E38)
            android.view.View r0 = X.C18070vi.A05(r1, r0)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = (com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel) r0
            r11.A08 = r0
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r1 = r11.A09
            java.lang.String r5 = "textView"
            if (r1 != 0) goto L_0x00ad
            X.C18070vi.A11(r5)
            throw r10
        L_0x00ad:
            boolean r0 = r11.A0C
            r1.setSingleLine(r0)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r1 = r11.A08
            java.lang.String r4 = "subTextView"
            if (r1 != 0) goto L_0x00bc
            X.C18070vi.A11(r4)
            throw r10
        L_0x00bc:
            boolean r0 = r11.A0C
            r1.setSingleLine(r0)
            int r1 = r11.A04
            if (r1 == 0) goto L_0x00e3
            if (r1 == r2) goto L_0x00e0
            r0 = 2
            if (r1 == r0) goto L_0x00dd
            r0 = 3
            if (r1 == r0) goto L_0x00da
            r0 = 4
            if (r1 != r0) goto L_0x00e3
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.MARQUEE
        L_0x00d2:
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r11.A09
            if (r0 != 0) goto L_0x00e5
            X.C18070vi.A11(r5)
            throw r10
        L_0x00da:
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            goto L_0x00d2
        L_0x00dd:
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x00d2
        L_0x00e0:
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.START
            goto L_0x00d2
        L_0x00e3:
            r1 = r10
            goto L_0x00d2
        L_0x00e5:
            r0.setEllipsize(r1)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r11.A08
            if (r0 != 0) goto L_0x00f0
            X.C18070vi.A11(r4)
            throw r10
        L_0x00f0:
            r0.setEllipsize(r1)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r1 = r11.A09
            if (r1 != 0) goto L_0x00fb
            X.C18070vi.A11(r5)
            throw r10
        L_0x00fb:
            android.content.Context r0 = r11.getContext()
            r3 = 2130971977(0x7f040d49, float:1.7552708E38)
            r2 = 2131099690(0x7f06002a, float:1.781174E38)
            int r0 = X.AnonymousClass1YL.A00(r0, r3, r2)
            r1.A00 = r0
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r1 = r11.A08
            if (r1 != 0) goto L_0x0113
            X.C18070vi.A11(r4)
            throw r10
        L_0x0113:
            android.content.Context r0 = r11.getContext()
            int r0 = X.AnonymousClass1YL.A00(r0, r3, r2)
            r1.A00 = r0
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r1 = r11.A09
            if (r1 != 0) goto L_0x0125
            X.C18070vi.A11(r5)
            throw r10
        L_0x0125:
            android.content.res.ColorStateList r0 = r11.A05
            r1.setTextColor(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.BusinessProfileFieldView.A01(android.util.AttributeSet):void");
    }

    private final void setIcon(Drawable drawable) {
        if (drawable != null) {
            ImageView imageView = this.A07;
            if (imageView != null) {
                imageView.setVisibility(0);
                ImageView imageView2 = this.A07;
                if (imageView2 != null) {
                    imageView2.setImageDrawable(drawable);
                    return;
                }
            }
            C18070vi.A11("fieldIcon");
            throw null;
        }
    }

    public void A00() {
        if (!this.A0B) {
            this.A0B = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A02 = AnonymousClass10E.A8r(A0O);
            this.A01 = AnonymousClass3Ma.A0f(A0O);
            this.A00 = AnonymousClass10E.A6Q(A0O);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A03;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final TextView getSubTextView() {
        EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel = this.A08;
        if (ellipsizedTextEmojiLabel != null) {
            return ellipsizedTextEmojiLabel;
        }
        C18070vi.A11("subTextView");
        throw null;
    }

    public String getText() {
        EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel = this.A09;
        if (ellipsizedTextEmojiLabel != null) {
            return AnonymousClass3Ma.A13(ellipsizedTextEmojiLabel);
        }
        C18070vi.A11("textView");
        throw null;
    }

    public final TextView getTextView() {
        EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel = this.A09;
        if (ellipsizedTextEmojiLabel != null) {
            return ellipsizedTextEmojiLabel;
        }
        C18070vi.A11("textView");
        throw null;
    }

    public final void setSubText(CharSequence charSequence) {
        EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel;
        int i;
        if (charSequence == null || charSequence.length() == 0) {
            EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel2 = this.A08;
            if (ellipsizedTextEmojiLabel2 == null) {
                C18070vi.A11("subTextView");
                throw null;
            }
            AnonymousClass3MW.A1S(ellipsizedTextEmojiLabel2);
            ellipsizedTextEmojiLabel = this.A08;
            if (ellipsizedTextEmojiLabel == null) {
                C18070vi.A11("subTextView");
                throw null;
            }
            i = 8;
        } else {
            AnonymousClass1KW r2 = this.A01;
            if (r2 != null) {
                EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel3 = this.A08;
                if (ellipsizedTextEmojiLabel3 == null) {
                    C18070vi.A11("subTextView");
                    throw null;
                }
                Context context = getContext();
                EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel4 = this.A09;
                if (ellipsizedTextEmojiLabel4 == null) {
                    C18070vi.A11("textView");
                    throw null;
                }
                ellipsizedTextEmojiLabel3.A0S(C43251zV.A03(context, ellipsizedTextEmojiLabel4.getPaint(), r2, charSequence), (List) null, 180, true);
            }
            ellipsizedTextEmojiLabel = this.A08;
            if (ellipsizedTextEmojiLabel == null) {
                C18070vi.A11("subTextView");
                throw null;
            }
            i = 0;
        }
        ellipsizedTextEmojiLabel.setVisibility(i);
    }

    public final void setText(CharSequence charSequence, View.OnClickListener onClickListener) {
        int i;
        String str;
        if ((charSequence == null || charSequence.length() == 0) && ((str = this.A0A) == null || str.length() == 0)) {
            EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel = this.A09;
            if (ellipsizedTextEmojiLabel != null) {
                AnonymousClass3MW.A1S(ellipsizedTextEmojiLabel);
                i = 8;
            }
            C18070vi.A11("textView");
            throw null;
        }
        EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel2 = this.A09;
        if (ellipsizedTextEmojiLabel2 != null) {
            ellipsizedTextEmojiLabel2.setTextColor(this.A05);
            if (charSequence == null || charSequence.length() == 0) {
                charSequence = this.A0A;
                EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel3 = this.A09;
                if (ellipsizedTextEmojiLabel3 != null) {
                    ellipsizedTextEmojiLabel3.setTextColor(this.A06);
                }
            }
            EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel4 = this.A09;
            if (ellipsizedTextEmojiLabel4 != null) {
                ellipsizedTextEmojiLabel4.A01 = onClickListener;
                ellipsizedTextEmojiLabel4.setContentDescription(charSequence);
                AnonymousClass1KW r2 = this.A01;
                if (r2 != null) {
                    EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel5 = this.A09;
                    if (ellipsizedTextEmojiLabel5 != null) {
                        Context context = getContext();
                        EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel6 = this.A09;
                        if (ellipsizedTextEmojiLabel6 != null) {
                            ellipsizedTextEmojiLabel5.A0S(C43251zV.A03(context, ellipsizedTextEmojiLabel6.getPaint(), r2, charSequence), (List) null, 180, true);
                        }
                    }
                }
                i = 0;
            }
        }
        C18070vi.A11("textView");
        throw null;
        setVisibility(i);
    }

    public final void setTextColor(int i) {
        EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel = this.A09;
        if (ellipsizedTextEmojiLabel == null) {
            C18070vi.A11("textView");
            throw null;
        }
        ellipsizedTextEmojiLabel.setTextColor(i);
        this.A05 = new ColorStateList(new int[][]{new int[0]}, new int[]{i});
    }

    public BusinessProfileFieldView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        A01(attributeSet);
    }

    public void setEnabled(boolean z) {
        String str;
        super.setEnabled(z);
        EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel = this.A09;
        if (ellipsizedTextEmojiLabel == null) {
            str = "textView";
        } else {
            ellipsizedTextEmojiLabel.setEnabled(z);
            EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel2 = this.A08;
            if (ellipsizedTextEmojiLabel2 == null) {
                str = "subTextView";
            } else {
                ellipsizedTextEmojiLabel2.setEnabled(z);
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public final int getLayoutRes() {
        return 2131624382;
    }

    public BusinessProfileFieldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        A01(attributeSet);
    }

    public void setIcon(int i) {
        setIcon(AnonymousClass3MZ.A0B(this, i));
    }

    public BusinessProfileFieldView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
        A01(attributeSet);
    }

    public BusinessProfileFieldView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public BusinessProfileFieldView(Context context) {
        super(context);
        A00();
        A01((AttributeSet) null);
    }
}
