package X;

import android.graphics.Point;
import android.graphics.Rect;

/* renamed from: X.6zf  reason: invalid class name and case insensitive filesystem */
public class C139926zf {
    public static final C139926zf A03 = new C139926zf((Point) null, (Rect) null, 3);
    public static final C139926zf A04 = new C139926zf((Point) null, (Rect) null, 0);
    public final int A00;
    public final Rect A01;
    public final Point A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C139926zf r5 = (C139926zf) obj;
            if (this.A00 != r5.A00 || !C42171xk.A00(this.A01, r5.A01) || !C42171xk.A00(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        AnonymousClass000.A1L(objArr, this.A00);
        objArr[1] = this.A01;
        return AnonymousClass000.A0P(this.A02, objArr, 2);
    }

    public C139926zf(Point point, Rect rect, int i) {
        this.A00 = i;
        this.A01 = rect;
        this.A02 = point;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlexState{separationType=");
        A10.append(this.A00);
        A10.append(", bounds=");
        A10.append(this.A01);
        A10.append(", parentDimensions=");
        A10.append(this.A02);
        return C17890vO.A0b(A10);
    }
}
