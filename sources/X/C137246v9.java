package X;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.6v9  reason: invalid class name and case insensitive filesystem */
public abstract class C137246v9 {
    public static final String A00(AnonymousClass118 r10, C33971jg r11) {
        List list;
        Context context;
        int i;
        Object[] objArr;
        Object valueOf;
        C135786sl r0;
        List A01 = A01(r11);
        if (A01.size() == 1) {
            context = r10.A00;
            i = 2131894888;
            objArr = new Object[2];
            objArr[0] = ((C135786sl) A01.get(0)).A02;
            valueOf = ((C135786sl) A01.get(0)).A03;
        } else {
            List A00 = C147027Rn.A00(A01, 17);
            LinkedHashMap A13 = C17880vN.A13();
            for (Object next : A00) {
                ((List) C72473Md.A0h(Integer.valueOf(((C135786sl) next).A00), A13)).add(next);
            }
            int size = A13.keySet().size();
            String str = null;
            if (size <= 0 || (list = (List) A13.get(C29431cG.A0X(A13.keySet()))) == null) {
                return "";
            }
            if (size == 1) {
                context = r10.A00;
                i = 2131894891;
                objArr = new Object[3];
                objArr[0] = ((C135786sl) C29431cG.A0b(list)).A02;
                C17880vN.A1T(objArr, AnonymousClass3MX.A02(list, 1), 1);
                objArr[2] = ((C135786sl) C29431cG.A0b(list)).A03;
            } else {
                String str2 = ((C135786sl) C29431cG.A0b(list)).A03;
                context = r10.A00;
                if (size == 2) {
                    i = 2131894889;
                    objArr = new Object[2];
                    objArr[0] = str2;
                    List list2 = (List) A13.get(C29431cG.A0Z(A13.keySet()));
                    if (!(list2 == null || (r0 = (C135786sl) C29431cG.A0b(list2)) == null)) {
                        str = r0.A03;
                    }
                    objArr[1] = str;
                } else {
                    i = 2131894890;
                    objArr = new Object[2];
                    objArr[0] = str2;
                    valueOf = Integer.valueOf(A13.keySet().size() - 1);
                }
            }
            String string = context.getString(i, objArr);
            C18070vi.A0X(string);
            return string;
        }
        objArr[1] = valueOf;
        String string2 = context.getString(i, objArr);
        C18070vi.A0X(string2);
        return string2;
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [X.6sl, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0019 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A01(X.C33971jg r7) {
        /*
            android.content.SharedPreferences r2 = X.C33971jg.A00(r7)
            java.lang.String r1 = "interop_reach_notifs"
            r0 = 0
            java.util.Set r0 = r2.getStringSet(r1, r0)
            if (r0 == 0) goto L_0x0089
            java.util.List r0 = X.C29431cG.A0t(r0)
        L_0x0011:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r7 = r0.iterator()
        L_0x0019:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.String r2 = X.C17880vN.A0v(r7)
            r4 = 0
            X.C18070vi.A0d(r2, r4)
            java.lang.String r1 = ":"
            X.1wr r0 = new X.1wr
            r0.<init>((java.lang.String) r1)
            r6 = 0
            java.util.List r2 = r0.A01(r2, r4)
            boolean r0 = r2.isEmpty()
            r3 = 1
            if (r0 != 0) goto L_0x0086
            java.util.ListIterator r1 = X.C108955ca.A18(r2)
        L_0x003e:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x0086
            int r0 = X.C108985cd.A08(r1)
            if (r0 == 0) goto L_0x003e
            java.util.List r0 = X.C108985cd.A0t(r2, r1)
        L_0x004e:
            java.lang.String[] r2 = X.C108955ca.A1b(r0)
            int r1 = r2.length
            r0 = 4
            if (r1 != r0) goto L_0x0019
            r0 = r2[r4]
            java.lang.Integer r0 = X.AnonymousClass1YD.A03(r0)
            if (r0 == 0) goto L_0x0062
            int r6 = r0.intValue()
        L_0x0062:
            r4 = r2[r3]
            r0 = 2
            r3 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            java.lang.Long r0 = X.AnonymousClass1YD.A04(r0)
            long r1 = X.C17900vP.A01(r0)
            X.C18070vi.A0k(r4, r3)
            X.6sl r0 = new X.6sl
            r0.<init>()
            r0.A00 = r6
            r0.A03 = r4
            r0.A02 = r3
            r0.A01 = r1
            r5.add(r0)
            goto L_0x0019
        L_0x0086:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x004e
        L_0x0089:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x0011
        L_0x008c:
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r6 = r5.iterator()
        L_0x0094:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r5 = r6.next()
            r0 = r5
            X.6sl r0 = (X.C135786sl) r0
            long r3 = r0.A01
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            long r3 = r3 + r0
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0094
            r7.add(r5)
            goto L_0x0094
        L_0x00b3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137246v9.A01(X.1jg):java.util.List");
    }
}
