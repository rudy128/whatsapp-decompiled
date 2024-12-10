package X;

import android.content.ClipData;
import android.content.ClipDescription;
import android.view.ContentInfo;
import java.util.List;

/* renamed from: X.CqD  reason: case insensitive filesystem */
public final class C25997CqD {
    public final E9Z A00;

    public static ClipData A00(ClipDescription clipDescription, List list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), (ClipData.Item) C108955ca.A0p(list));
        for (int i = 1; i < list.size(); i++) {
            clipData.addItem((ClipData.Item) list.get(i));
        }
        return clipData;
    }

    public static C25997CqD A01(ContentInfo contentInfo) {
        return new C25997CqD(new D6Q(contentInfo));
    }

    public ContentInfo A02() {
        ContentInfo Bbu = this.A00.Bbu();
        Bbu.getClass();
        return Bbu;
    }

    public String toString() {
        return this.A00.toString();
    }

    public C25997CqD(E9Z e9z) {
        this.A00 = e9z;
    }
}
