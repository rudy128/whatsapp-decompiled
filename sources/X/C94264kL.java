package X;

import android.app.Activity;
import android.view.View;
import com.whatsapp.contact.picker.SelectedContactsList;
import java.util.List;

/* renamed from: X.4kL  reason: invalid class name and case insensitive filesystem */
public final class C94264kL implements C108375bb {
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r1 == 0) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BEa(X.AnonymousClass3gf r8, X.AnonymousClass1E7 r9) {
        /*
            r7 = this;
            r3 = 0
            r5 = 1
            X.C18070vi.A0d(r9, r5)
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            boolean r0 = r9.A0y
            r6 = 0
            if (r0 != 0) goto L_0x0024
            r9.A0y = r5
            r2.add(r9)
            java.util.List r1 = r8.A0i
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0029
            java.lang.Object r9 = r1.get(r3)
            X.C18070vi.A0X(r9)
            X.1E7 r9 = (X.AnonymousClass1E7) r9
        L_0x0024:
            r9.A0y = r3
            r2.add(r9)
        L_0x0029:
            java.lang.String r0 = r8.A0R
            if (r0 == 0) goto L_0x0034
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0035
        L_0x0034:
            r0 = 1
        L_0x0035:
            r4 = r0 ^ 1
            java.util.Iterator r3 = r2.iterator()
        L_0x003b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x006b
            X.1E7 r2 = X.C17880vN.A0O(r3)
            android.widget.ListView r0 = r8.A02
            android.view.View r1 = r0.findViewWithTag(r2)
            com.whatsapp.components.SelectionCheckView r1 = (com.whatsapp.components.SelectionCheckView) r1
            if (r1 == 0) goto L_0x0060
            boolean r0 = r8 instanceof com.whatsapp.community.LinkExistingGroups
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = r8.A0R
            if (r0 == 0) goto L_0x005d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0060
        L_0x005d:
            r8.A4x(r1, r2, r5)
        L_0x0060:
            X.C88384Zm.A01(r8, r2, r4)
            boolean r0 = X.C88384Zm.A03(r8, r2)
            if (r0 == 0) goto L_0x003b
            r6 = 1
            goto L_0x003b
        L_0x006b:
            boolean r0 = r8 instanceof com.whatsapp.community.LinkExistingGroups
            if (r0 != 0) goto L_0x0072
            X.C88384Zm.A00(r8)
        L_0x0072:
            java.util.List r0 = r8.A0i
            X.C18070vi.A0W(r0)
            X.C88384Zm.A02(r8, r0)
            r8.A4t()
            if (r6 == 0) goto L_0x0084
            android.widget.BaseAdapter r0 = r8.A01
            r0.notifyDataSetChanged()
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94264kL.BEa(X.3gf, X.1E7):void");
    }

    public void C4C(AnonymousClass4SL r3) {
        r3.A01.setBackgroundResource(0);
    }

    public void C4D(AnonymousClass4SL r3, int i, boolean z) {
        View view = r3.A01;
        if (z) {
            view.setBackgroundResource(i);
        } else {
            view.setBackgroundResource(0);
        }
    }

    public SelectedContactsList CLH(Activity activity, C108435bh r3, List list, int i) {
        return null;
    }
}
