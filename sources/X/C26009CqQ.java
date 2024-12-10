package X;

import android.text.TextUtils;

/* renamed from: X.CqQ  reason: case insensitive filesystem */
public class C26009CqQ {
    public static final C26009CqQ A06 = new C26009CqQ("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final CharSequence A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C26009CqQ cqQ = (C26009CqQ) obj;
            if (!(TextUtils.equals(this.A05, cqQ.A05) && this.A00 == cqQ.A00 && this.A03 == cqQ.A03 && this.A02 == cqQ.A02 && this.A01 == cqQ.A01 && this.A04 == cqQ.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[17];
        objArr[0] = this.A05;
        objArr[1] = null;
        objArr[2] = null;
        objArr[3] = null;
        objArr[4] = Float.valueOf(this.A00);
        AnonymousClass3Ma.A1U(objArr, this.A03);
        C17890vO.A1H(objArr, this.A02);
        objArr[7] = Float.valueOf(this.A01);
        objArr[8] = Integer.valueOf(this.A04);
        Float valueOf = Float.valueOf(-3.4028235E38f);
        objArr[9] = valueOf;
        objArr[10] = valueOf;
        objArr[11] = AnonymousClass000.A0h();
        BE8.A1L(objArr, -16777216);
        objArr[13] = Integer.MIN_VALUE;
        objArr[14] = valueOf;
        objArr[15] = Integer.MIN_VALUE;
        return AnonymousClass000.A0P(BE7.A0W(), objArr, 16);
    }

    public C26009CqQ(CharSequence charSequence, float f, float f2, int i, int i2, int i3) {
        this.A05 = charSequence;
        this.A00 = f;
        this.A03 = i;
        this.A02 = i2;
        this.A01 = f2;
        this.A04 = i3;
    }

    @Deprecated
    public C26009CqQ(CharSequence charSequence) {
        this(charSequence, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
