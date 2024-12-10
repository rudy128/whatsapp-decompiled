package X;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0O3  reason: invalid class name */
public abstract class AnonymousClass0O3 {
    public static final C05050Qf A00 = new AnonymousClass0C4();

    public static final void A01(Context context, C16930tS r11, RenderTreeNode renderTreeNode, ArrayList arrayList, int i, int i2) {
        RenderTreeNode renderTreeNode2 = renderTreeNode;
        if (r11 != null) {
            Rect rect = new Rect(i, i2, r11.getWidth() + i, r11.getHeight() + i2);
            ArrayList arrayList2 = arrayList;
            arrayList.size();
            C05050Qf BY6 = r11.BY6();
            if (BY6 != null) {
                int BOk = r11.BOk();
                RenderTreeNode A002 = A00(rect, r11, renderTreeNode, BY6);
                arrayList.add(A002);
                List A003 = RenderTreeNode.A00(renderTreeNode);
                if (BOk > 0) {
                    A003.add(A002);
                    renderTreeNode2 = A002;
                } else {
                    A003.add(A002);
                }
                i = 0;
                i2 = 0;
            }
            int BOk2 = r11.BOk();
            for (int i3 = 0; i3 < BOk2; i3++) {
                A01(context, r11.BOa(i3), renderTreeNode2, arrayList2, r11.Bbx(i3) + i, r11.Bby(i3) + i2);
            }
        }
    }

    public static final RenderTreeNode A00(Rect rect, C16930tS r8, RenderTreeNode renderTreeNode, C05050Qf r10) {
        Rect rect2;
        int i;
        int BW2 = r8.BW2();
        if (BW2 == 0 && r8.BW5() == 0 && r8.BW3() == 0 && r8.BW0() == 0) {
            rect2 = null;
        } else {
            rect2 = new Rect(BW2, r8.BW5(), r8.BW3(), r8.BW0());
        }
        Object BTv = r8.BTv();
        RenderTreeNode renderTreeNode2 = renderTreeNode;
        if (renderTreeNode != null) {
            i = RenderTreeNode.A00(renderTreeNode).size();
        } else {
            i = 0;
        }
        return new RenderTreeNode(rect, rect2, AnonymousClass0ME.A00, renderTreeNode2, r10, BTv, i);
    }
}
