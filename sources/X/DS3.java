package X;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;

public class DS3 implements Cloneable {
    public float A00;
    public float A01;
    public float A02 = Float.MAX_VALUE;
    public float A03 = 1.0f;
    public float A04 = 0.0f;
    public float A05 = 0.0f;
    public float A06 = 0.0f;
    public float A07 = 0.0f;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D = -16776961;
    public int A0E;
    public int A0F;
    public int A0G = -1;
    public int A0H = Integer.MAX_VALUE;
    public int A0I = Integer.MAX_VALUE;
    public int A0J = -1;
    public int A0K = Integer.MIN_VALUE;
    public int A0L = 0;
    public int A0M = -7829368;
    public int A0N = -16777216;
    public int A0O = -1;
    public int A0P = Typeface.DEFAULT.getStyle();
    public ColorStateList A0Q;
    public Typeface A0R;
    public TextUtils.TruncateAt A0S;
    public AnonymousClass1X5 A0T;
    public C24913CPg A0U;
    public CharSequence A0V;
    public Integer A0W;
    public Integer A0X;
    public String A0Y;
    public boolean A0Z = true;
    public boolean A0a = false;
    public boolean A0b;
    public boolean A0c;

    public static void A00(DS3 ds3, Integer num) {
        Integer num2;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                num2 = AnonymousClass00R.A0C;
            } else if (intValue == 8388611 || intValue != 8388613) {
                num2 = AnonymousClass00R.A00;
            } else {
                num2 = AnonymousClass00R.A01;
            }
            ds3.A0W = num2;
        }
    }

    public DS3() {
        Integer num = AnonymousClass00R.A00;
        this.A0W = num;
        this.A08 = -1;
        this.A0B = 0;
        this.A0C = 0;
        this.A0X = num;
        this.A09 = 0;
        this.A0A = 0;
        this.A0c = false;
        this.A0E = Integer.MIN_VALUE;
        this.A0F = Integer.MIN_VALUE;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A0U = null;
    }

    public DS3 A01() {
        try {
            return (DS3) super.clone();
        } catch (CloneNotSupportedException e) {
            throw AnonymousClass8BR.A0x(e);
        }
    }
}
