package X;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.3P3  reason: invalid class name */
public class AnonymousClass3P3 extends Filter {
    public final /* synthetic */ AnonymousClass3XO A00;

    public AnonymousClass3P3(AnonymousClass3XO r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00be, code lost:
        if (X.C20103A7h.A04(r5, r10.A0c, r4, true) != false) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x005d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r15) {
        /*
            r14 = this;
            android.widget.Filter$FilterResults r8 = new android.widget.Filter$FilterResults
            r8.<init>()
            r4 = 0
            if (r15 == 0) goto L_0x00de
            int r0 = r15.length()
            if (r0 != 0) goto L_0x001b
            X.3XO r0 = r14.A00
            java.util.List r0 = r0.A05
            r8.values = r0
            int r0 = r0.size()
        L_0x0018:
            r8.count = r0
            return r8
        L_0x001b:
            java.lang.String r0 = r15.toString()
            java.lang.String r3 = " "
            boolean r0 = r0.startsWith(r3)
            if (r0 != 0) goto L_0x00de
            int r2 = r15.length()
            java.lang.String r1 = r15.toString()
            java.lang.String r0 = ""
            java.lang.String r0 = r1.replaceAll(r3, r0)
            int r0 = r0.length()
            int r2 = r2 - r0
            r0 = 1
            if (r2 > r0) goto L_0x00de
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.lang.String r0 = r15.toString()
            java.lang.String r6 = r0.toLowerCase()
            java.lang.String r0 = r15.toString()
            X.3XO r9 = r14.A00
            X.0vb r5 = r9.A0H
            java.util.ArrayList r4 = X.C20103A7h.A03(r5, r0)
            java.util.List r0 = r9.A05
            java.util.Iterator r13 = r0.iterator()
            r12 = 0
            r3 = r12
        L_0x005d:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r2 = r13.next()
            X.4Mh r2 = (X.C85154Mh) r2
            int r11 = r2.A00
            r0 = 4
            if (r11 != r0) goto L_0x0070
            r3 = r2
            goto L_0x005d
        L_0x0070:
            java.lang.Object r10 = r2.A01
            X.C17960vV.A07(r10)
            boolean r0 = r10 instanceof X.AnonymousClass1E7
            if (r0 == 0) goto L_0x005d
            X.1E7 r10 = (X.AnonymousClass1E7) r10
            r0 = 2
            r1 = 0
            if (r11 == r0) goto L_0x009c
            r0 = 16
            if (r11 == r0) goto L_0x009c
            r0 = 8
            if (r11 != r0) goto L_0x005d
        L_0x0087:
            java.lang.String r1 = r10.A0K()
        L_0x008b:
            r0 = 1
            boolean r0 = X.C20103A7h.A04(r5, r1, r4, r0)
            if (r0 == 0) goto L_0x005d
        L_0x0092:
            if (r3 == 0) goto L_0x0098
            r7.add(r3)
            r3 = r12
        L_0x0098:
            r7.add(r2)
            goto L_0x005d
        L_0x009c:
            boolean r0 = r10.A0O()
            if (r0 == 0) goto L_0x00a9
            X.1Me r0 = r9.A0E
            java.lang.String r1 = r0.A0W(r10, r1)
            goto L_0x008b
        L_0x00a9:
            boolean r0 = X.AnonymousClass3MZ.A1X(r10)
            if (r0 == 0) goto L_0x0087
            java.lang.String r0 = r10.A0c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 != 0) goto L_0x00c1
            java.lang.String r0 = r10.A0c
            boolean r0 = X.C20103A7h.A04(r5, r0, r4, r1)
            if (r0 == 0) goto L_0x00c1
            goto L_0x0092
        L_0x00c1:
            com.whatsapp.jid.Jid r0 = X.AnonymousClass1E7.A01(r10)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = X.AnonymousClass17K.A04(r0)
            if (r0 == 0) goto L_0x005d
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x005d
            goto L_0x0092
        L_0x00d6:
            r8.values = r7
            int r0 = r7.size()
            goto L_0x0018
        L_0x00de:
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r8.values = r0
            r8.count = r4
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3P3.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        int i;
        String str;
        Set set;
        Object obj = filterResults.values;
        if (obj instanceof List) {
            AnonymousClass3XO r6 = this.A00;
            List<C85154Mh> list = (List) obj;
            if (r6.A03 != null) {
                ArrayList A13 = AnonymousClass000.A13();
                ArrayList A132 = AnonymousClass000.A13();
                for (C85154Mh r2 : list) {
                    if (r2.A00 == 4 && A132.size() > 0) {
                        Collections.sort(A132, r6.A03);
                        A13.addAll(A132);
                        A132 = AnonymousClass000.A13();
                    }
                    A132.add(r2);
                }
                Collections.sort(A132, r6.A03);
                A13.addAll(A132);
                list = A13;
            }
            r6.A06 = list;
            C98884rs r0 = r6.A03;
            if (r0 != null && (set = r0.A00) != null) {
                Iterator it = list.iterator();
                int i2 = 0;
                int i3 = -1;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C85154Mh r22 = (C85154Mh) it.next();
                    if (r22.A00 == 2) {
                        if (!set.contains(AnonymousClass1E7.A01((AnonymousClass1E7) r22.A01))) {
                            i = i3 + i2;
                            break;
                        }
                        i3++;
                    } else {
                        i2++;
                    }
                }
            }
            i = -1;
            r6.A01 = i;
            if (charSequence != null) {
                str = charSequence.toString().toLowerCase();
            } else {
                str = "";
            }
            r6.A04 = str;
            r6.notifyDataSetChanged();
        }
    }
}
