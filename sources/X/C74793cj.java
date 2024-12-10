package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.3cj  reason: invalid class name and case insensitive filesystem */
public abstract class C74793cj extends AnonymousClass3Qa {
    public TextEmojiLabel A00;
    public WaImageView A01;
    public WaTextView A02;
    public AnonymousClass11C A03;
    public C18000vb A04;
    public C18030ve A05;
    public boolean A06 = true;

    public C74793cj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        A04();
        A06(attributeSet);
    }

    public void A06(AttributeSet attributeSet) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        float f2;
        float f3;
        float f4;
        AttributeSet attributeSet2 = attributeSet;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = AnonymousClass3Ma.A06(this).obtainStyledAttributes(attributeSet2, C84144If.A0D, 0, 0);
            try {
                i = obtainStyledAttributes.getResourceId(7, 0);
                i2 = obtainStyledAttributes.getResourceId(0, 0);
                i3 = obtainStyledAttributes.getResourceId(4, 0);
                i4 = obtainStyledAttributes.getColor(5, 0);
                i5 = obtainStyledAttributes.getColor(8, 0);
                i6 = obtainStyledAttributes.getColor(1, 0);
                this.A06 = obtainStyledAttributes.getBoolean(6, true);
                f4 = obtainStyledAttributes.getDimension(9, 0.0f);
                f = obtainStyledAttributes.getDimension(10, 0.0f);
                f2 = obtainStyledAttributes.getDimension(2, 0.0f);
                f3 = obtainStyledAttributes.getDimension(3, 0.0f);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            f4 = 0.0f;
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        }
        View inflate = AnonymousClass3MZ.A0D(this).inflate(getRootLayoutID(), this, true);
        this.A02 = AnonymousClass3MW.A0T(inflate, 2131432096);
        this.A00 = AnonymousClass3MX.A0V(inflate, 2131432091);
        this.A01 = AnonymousClass3MW.A0R(inflate, 2131432092);
        if (i != 0) {
            this.A02.setText(i);
        }
        if (i2 != 0) {
            setDescription(i2);
        }
        if (i5 != 0) {
            this.A02.setTextColor(i5);
        }
        if (i6 != 0) {
            this.A00.setTextColor(i6);
        }
        if (i4 != 0) {
            setIconColor(i4);
        }
        if (i3 != 0) {
            setIcon(i3);
        }
        if (f4 != 0.0f) {
            this.A02.setTextSize(0, f4);
        }
        if (f != 0.0f) {
            this.A02.setLineSpacing(f, 1.0f);
        }
        if (f2 != 0.0f) {
            this.A00.setTextSize(0, f2);
        }
        if (f3 != 0.0f) {
            this.A00.setLineSpacing(f3, 1.0f);
        }
        AnonymousClass1Y5.A0A(this.A02, true);
    }

    public abstract int getRootLayoutID();

    public CharSequence getTitle() {
        return this.A02.getText();
    }

    public TextView getTitleView() {
        return this.A02;
    }

    public void setDescription(int i) {
        this.A00.setText(i);
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.A06;
        C74743cP r1 = new C74743cP(drawable, this.A04);
        r1.A00 = z;
        this.A01.setImageDrawable(r1);
        this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    public void setIconColor(int i) {
        C28081Yu.A00(ColorStateList.valueOf(i), this.A01);
    }

    public void setIconVisible(boolean z) {
        this.A01.setVisibility(C72453Mb.A07(z ? 1 : 0));
    }

    public void setTitle(int i) {
        this.A02.setText(i);
    }

    public static void A01(Context context, C74793cj r1, int i) {
        r1.setTitle((CharSequence) context.getString(i));
    }

    public static void A02(Context context, C74793cj r1, int i) {
        r1.setDescription((CharSequence) context.getString(i));
    }

    public void A05(int i, boolean z) {
        Drawable drawable;
        try {
            if (getResources().getXml(i) != null) {
                drawable = C24291Jp.A00((Resources.Theme) null, getResources(), i);
                C74743cP r1 = new C74743cP(drawable, this.A04);
                r1.A00 = z;
                this.A01.setImageDrawable(r1);
                this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
        } catch (Resources.NotFoundException unused) {
        }
        drawable = AnonymousClass3MZ.A0B(this, i);
        C74743cP r12 = new C74743cP(drawable, this.A04);
        r12.A00 = z;
        this.A01.setImageDrawable(r12);
        this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    public void setDescription(CharSequence charSequence) {
        this.A00.setText(charSequence);
    }

    public void setIcon(int i) {
        A05(i, this.A06);
    }

    public void setTitle(CharSequence charSequence) {
        this.A02.setText(charSequence);
    }
}
