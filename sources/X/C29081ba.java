package X;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.Map;

/* renamed from: X.1ba  reason: invalid class name and case insensitive filesystem */
public class C29081ba extends AnonymousClass1LG {
    public static final Property A00 = new AnonymousClass271(2);
    public static final Property A01 = new AnonymousClass271(1);
    public static final Property A02 = new AnonymousClass271(4);
    public static final Property A03 = new AnonymousClass271(3);
    public static final Property A04 = new AnonymousClass271(0);
    public static final String[] A05 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property A06 = new C29091bb();

    public static void A01(C62392rK r7) {
        View view = r7.A00;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            Map map = r7.A02;
            map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put("android:changeBounds:parent", view.getParent());
        }
    }
}
