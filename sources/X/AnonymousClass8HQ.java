package X;

import android.view.ViewGroup;
import java.util.Map;

/* renamed from: X.8HQ  reason: invalid class name */
public class AnonymousClass8HQ extends C41251w3 {
    public long A00 = 1;
    public final Map A01 = C17880vN.A11();

    public AnonymousClass8HQ() {
        super(new C40471ul(new AnonymousClass8HK(0)).A00());
        A0K(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bmc(X.C42011xT r7, int r8) {
        /*
            r6 = this;
            X.8Ie r7 = (X.C161898Ie) r7
            java.lang.Object r4 = r6.A0U(r8)
            X.9aX r4 = (X.C184179aX) r4
            android.view.View r5 = r7.A0H
            android.content.Context r1 = r5.getContext()
            r0 = 2131889608(0x7f120dc8, float:1.9413884E38)
            java.lang.String r1 = r1.getString(r0)
            com.whatsapp.WaTextView r3 = r7.A01
            boolean r2 = r4.A01
            if (r2 != 0) goto L_0x005f
            boolean r0 = r4 instanceof X.C169038kG
            if (r0 == 0) goto L_0x0057
            r0 = r4
            X.8kG r0 = (X.C169038kG) r0
            java.lang.String r0 = r0.A00
        L_0x0024:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005f
            android.content.Context r1 = r5.getContext()
            r0 = 1123024896(0x42f00000, float:120.0)
            int r0 = X.C62762rw.A01(r1, r0)
        L_0x0034:
            r3.setMaxWidth(r0)
            r0 = 7
            X.AFN.A00(r3, r4, r0)
            boolean r0 = r4 instanceof X.C169038kG
            if (r0 == 0) goto L_0x0050
            X.8kG r4 = (X.C169038kG) r4
            java.lang.String r0 = r4.A00
        L_0x0043:
            r3.setText(r0)
            android.widget.ImageView r1 = r7.A00
            int r0 = X.C72453Mb.A01(r2)
            r1.setVisibility(r0)
            return
        L_0x0050:
            X.8kF r4 = (X.C169028kF) r4
            X.9rR r0 = r4.A00
            java.lang.String r0 = r0.A01
            goto L_0x0043
        L_0x0057:
            r0 = r4
            X.8kF r0 = (X.C169028kF) r0
            X.9rR r0 = r0.A00
            java.lang.String r0 = r0.A01
            goto L_0x0024
        L_0x005f:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8HQ.Bmc(X.1xT, int):void");
    }

    public long A0M(int i) {
        String str;
        C184179aX r1 = (C184179aX) A0U(i);
        Map map = this.A01;
        if (r1 instanceof C169038kG) {
            str = ((C169038kG) r1).A00;
        } else {
            str = ((C169028kF) r1).A00.A00;
        }
        Number A1E = C108945cZ.A1E(str, map);
        if (A1E == null) {
            long j = this.A00;
            this.A00 = 1 + j;
            A1E = Long.valueOf(j);
            map.put(str, A1E);
        }
        return A1E.longValue();
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new C161898Ie(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625749));
    }
}
