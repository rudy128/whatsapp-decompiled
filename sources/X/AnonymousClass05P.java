package X;

import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: X.05P  reason: invalid class name */
public class AnonymousClass05P extends BaseAdapter {
    public C003301m A00;
    public boolean A01;
    public int A02 = -1;
    public final int A03;
    public final LayoutInflater A04;
    public final boolean A05;

    public long getItemId(int i) {
        return (long) i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r4 == r1) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r2 = 0
            if (r7 != 0) goto L_0x000b
            android.view.LayoutInflater r1 = r5.A04
            int r0 = r5.A03
            android.view.View r7 = r1.inflate(r0, r8, r2)
        L_0x000b:
            X.03G r0 = r5.getItem(r6)
            int r4 = r0.getGroupId()
            int r0 = r6 + -1
            if (r0 < 0) goto L_0x0044
            X.03G r0 = r5.getItem(r0)
            int r1 = r0.getGroupId()
        L_0x001f:
            r3 = r7
            androidx.appcompat.view.menu.ListMenuItemView r3 = (androidx.appcompat.view.menu.ListMenuItemView) r3
            X.01m r0 = r5.A00
            boolean r0 = r0.A0c()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            r0 = 1
            if (r4 != r1) goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            r3.setGroupDividerEnabled(r0)
            r1 = r7
            X.03p r1 = (X.C008003p) r1
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x003c
            r3.setForceShowIcon(r2)
        L_0x003c:
            X.03G r0 = r5.getItem(r6)
            r1.BdW(r0)
            return r7
        L_0x0044:
            r1 = r4
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05P.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: A01 */
    public AnonymousClass03G getItem(int i) {
        ArrayList A0D;
        boolean z = this.A05;
        C003301m r0 = this.A00;
        if (z) {
            A0D = r0.A0C();
        } else {
            A0D = r0.A0D();
        }
        int i2 = this.A02;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (AnonymousClass03G) A0D.get(i);
    }

    public void A02() {
        C003301m r0 = this.A00;
        AnonymousClass03G A07 = r0.A07();
        if (A07 != null) {
            ArrayList A0C = r0.A0C();
            int size = A0C.size();
            for (int i = 0; i < size; i++) {
                if (A0C.get(i) == A07) {
                    this.A02 = i;
                    return;
                }
            }
        }
        this.A02 = -1;
    }

    public int getCount() {
        ArrayList A0D;
        boolean z = this.A05;
        C003301m r0 = this.A00;
        if (z) {
            A0D = r0.A0C();
        } else {
            A0D = r0.A0D();
        }
        int i = this.A02;
        int size = A0D.size();
        if (i >= 0) {
            return size - 1;
        }
        return size;
    }

    public AnonymousClass05P(LayoutInflater layoutInflater, C003301m r3, int i, boolean z) {
        this.A05 = z;
        this.A04 = layoutInflater;
        this.A00 = r3;
        this.A03 = i;
        A02();
    }

    public C003301m A00() {
        return this.A00;
    }

    public void notifyDataSetChanged() {
        A02();
        super.notifyDataSetChanged();
    }
}
