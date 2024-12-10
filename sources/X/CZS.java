package X;

import android.content.res.ColorStateList;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Arrays;

public class CZS {
    public float A00 = Float.MAX_VALUE;
    public float A01;
    public float A02;
    public float A03;
    public float A04 = 0.0f;
    public float A05 = 1.0f;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public ColorStateList A0D;
    public Layout.Alignment A0E;
    public TextPaint A0F = new TextPaint(1);
    public TextUtils.TruncateAt A0G;
    public AnonymousClass1X5 A0H;
    public CharSequence A0I;
    public boolean A0J = true;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public void A00() {
        if (this.A0K) {
            TextPaint textPaint = new TextPaint(this.A0F);
            textPaint.set(this.A0F);
            this.A0F = textPaint;
            this.A0K = false;
        }
    }

    public int hashCode() {
        int i;
        int A0B2 = AnonymousClass000.A0B((31 + this.A0F.getColor()) * 31, this.A0F.getTextSize());
        int i2 = 0;
        if (this.A0F.getTypeface() != null) {
            i = this.A0F.getTypeface().hashCode();
        } else {
            i = 0;
        }
        TextPaint textPaint = this.A0F;
        int A0N2 = (((((((AnonymousClass000.A0N(this.A0H, AnonymousClass000.A0N(this.A0E, (((((((((AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B((((((AnonymousClass000.A0B((((AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B((A0B2 + i) * 31, this.A01), this.A02), this.A03) + this.A09) * 31) + textPaint.linkColor) * 31, textPaint.density) + Arrays.hashCode(textPaint.drawableState)) * 31) + this.A0C) * 31) + this.A0B) * 31, this.A05), this.A04), this.A00) + (this.A0J ? 1 : 0)) * 31) + (this.A0N ? 1 : 0)) * 31) + AnonymousClass001.A0l(this.A0G)) * 31) + (this.A0M ? 1 : 0)) * 31) + this.A0A) * 31)) + this.A06) * 31) + this.A07) * 31) + Arrays.hashCode((int[]) null)) * 31) + Arrays.hashCode((int[]) null)) * 31;
        CharSequence charSequence = this.A0I;
        if (charSequence != null) {
            i2 = charSequence.hashCode();
        }
        return A0N2 + i2;
    }

    public CZS() {
        boolean z = true;
        this.A0N = Build.VERSION.SDK_INT < 28 ? false : z;
        this.A0L = false;
        this.A0G = null;
        this.A0M = false;
        this.A0A = Integer.MAX_VALUE;
        this.A0E = Layout.Alignment.ALIGN_NORMAL;
        this.A0H = AnonymousClass1X4.A01;
        this.A06 = 0;
        this.A07 = 0;
        this.A08 = 0;
        this.A0K = false;
    }
}
