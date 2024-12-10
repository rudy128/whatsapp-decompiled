package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.4SC  reason: invalid class name */
public class AnonymousClass4SC {
    public final Drawable A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4SC r5 = (AnonymousClass4SC) obj;
            if (!this.A03.equals(r5.A03) || this.A00 != r5.A00 || !C42171xk.A00(this.A01, r5.A01) || this.A04 != r5.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A03;
        objArr[1] = this.A00;
        objArr[2] = this.A01;
        return AnonymousClass000.A0P(Boolean.valueOf(this.A04), objArr, 3);
    }

    public AnonymousClass4SC(Drawable drawable, Integer num, String str, String str2, boolean z) {
        this.A03 = str;
        this.A00 = drawable;
        this.A01 = num;
        this.A04 = z;
        this.A02 = str2;
    }
}
