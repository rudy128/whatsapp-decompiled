package X;

import android.content.Context;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Pd  reason: invalid class name and case insensitive filesystem */
public class C49092Pd extends A34 {
    public final long A00;
    public final C18000vb A01;
    public final C26421Sb A02;
    public final Integer A03;
    public final WeakReference A04;
    public final WeakReference A05;
    public final List A06;
    public final boolean A07;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        long j;
        C56202h4 A032;
        C26421Sb r9 = this.A02;
        Iterator it = this.A06.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            AnonymousClass21V A0b = C17880vN.A0b(it);
            C62572rc A002 = AnonymousClass206.A00(A0b);
            long j3 = A0b.A01;
            if (A002.A0c) {
                j = 0;
            } else {
                String str = A002.A0L;
                j = 0;
                if (!(str == null || (A032 = r9.A0I.A03(str, 1)) == null)) {
                    j = A032.A0A;
                }
            }
            j2 += j3 - j;
        }
        return Long.valueOf(j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if ((r1 instanceof java.util.List) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0H(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Number r9 = (java.lang.Number) r9
            java.lang.ref.WeakReference r0 = r8.A05
            java.lang.Object r7 = r0.get()
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.ref.WeakReference r0 = r8.A04
            java.lang.Object r6 = r0.get()
            android.content.Context r6 = (android.content.Context) r6
            if (r7 == 0) goto L_0x0050
            java.lang.Object r1 = r7.getTag()
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x0050
        L_0x001c:
            java.util.List r0 = r8.A06
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004a
            long r2 = r9.longValue()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0030
            long r2 = r8.A00
        L_0x0030:
            X.0vb r1 = r8.A01
            boolean r4 = r8.A07
            java.lang.Integer r0 = r8.A03
            java.lang.String r3 = X.AnonymousClass25A.A0C(r1, r2)
            r2 = 0
            r1 = 1
            if (r0 != 0) goto L_0x004b
            if (r4 == 0) goto L_0x0047
            r0 = 2131891185(0x7f1213f1, float:1.9417083E38)
        L_0x0043:
            java.lang.String r3 = X.C17890vO.A0R(r6, r3, r1, r2, r0)
        L_0x0047:
            r7.setText(r3)
        L_0x004a:
            return
        L_0x004b:
            int r0 = r0.intValue()
            goto L_0x0043
        L_0x0050:
            r1 = 0
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49092Pd.A0H(java.lang.Object):void");
    }

    public C49092Pd(Context context, TextView textView, C18000vb r4, C26421Sb r5, Integer num, List list, long j, boolean z) {
        this.A02 = r5;
        this.A01 = r4;
        this.A06 = list;
        this.A03 = num;
        this.A00 = j;
        this.A07 = z;
        this.A05 = new WeakReference(textView);
        this.A04 = new WeakReference(context);
    }
}
