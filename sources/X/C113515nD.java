package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.5nD  reason: invalid class name and case insensitive filesystem */
public final class C113515nD extends C42011xT {
    public final int A00;
    public final int A01;
    public final C109495dX A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r2.getRight() > r3) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B() {
        /*
            r5 = this;
            X.5dX r4 = r5.A02
            int r0 = r5.A01
            int r3 = r5.A00
            android.view.View r2 = r5.A0H
            X.C18070vi.A0W(r2)
            int r1 = X.C108995ce.A01(r0, r3)
            int r3 = r3 + r1
            int r0 = r2.getLeft()
            if (r1 > r0) goto L_0x001d
            int r0 = r2.getRight()
            r1 = 1
            if (r0 <= r3) goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            boolean r0 = r4.A01
            if (r0 == r1) goto L_0x0027
            r4.A01 = r1
            X.C109495dX.A00(r4)
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113515nD.A0B():void");
    }

    public C113515nD(View view, int i) {
        super(view);
        Context context = view.getContext();
        C72453Mb.A1R(context);
        this.A01 = C72453Mb.A09(context);
        this.A00 = context.getResources().getDimensionPixelSize(2131167972);
        C109495dX r2 = new C109495dX(context);
        float f = i == 0 ? 1.0f : 0.3f;
        if (r2.A00 != f) {
            r2.A00 = f;
            C109495dX.A00(r2);
        }
        this.A02 = r2;
        ((ImageView) view).setImageDrawable(r2);
    }
}
