package X;

import android.content.res.TypedArray;

public class BVN extends C25276CcS {
    public BVN() {
        this.A00.A0F = false;
    }

    public /* bridge */ /* synthetic */ void A07(TypedArray typedArray) {
        super.A07(typedArray);
        if (typedArray.hasValue(2)) {
            CUR cur = this.A00;
            cur.A05 = (typedArray.getColor(2, cur.A05) & 16777215) | (cur.A05 & -16777216);
        }
        if (typedArray.hasValue(12)) {
            CUR cur2 = this.A00;
            cur2.A09 = typedArray.getColor(12, cur2.A09);
        }
    }
}
