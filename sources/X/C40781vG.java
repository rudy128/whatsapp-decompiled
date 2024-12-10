package X;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1vG  reason: invalid class name and case insensitive filesystem */
public class C40781vG {
    public PointF A00;
    public boolean A01;
    public final List A02;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShapeData{numCurves=");
        sb.append(this.A02.size());
        sb.append("closed=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }

    public C40781vG(PointF pointF, List list, boolean z) {
        this.A00 = pointF;
        this.A01 = z;
        this.A02 = new ArrayList(list);
    }

    public C40781vG() {
        this.A02 = new ArrayList();
    }
}
