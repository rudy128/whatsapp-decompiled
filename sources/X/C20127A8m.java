package X;

import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.A8m  reason: case insensitive filesystem */
public abstract class C20127A8m {
    public static final int A00(AnonymousClass1NW r10, C19990A2d a2d, AnonymousClass1L7 r12, String str) {
        long j;
        String str2;
        C18070vi.A0d(str, 0);
        AnonymousClass3Ma.A1O(r12, 2, r10);
        File A17 = C108945cZ.A17(str);
        if (!A17.exists()) {
            return 1;
        }
        if (a2d == null) {
            return 2;
        }
        long length = A17.length();
        A55 a55 = a2d.A02;
        if (a55 != null) {
            j = a55.A00;
        } else {
            j = a2d.A00;
        }
        if (length == j) {
            String A05 = C41361wE.A05(r10, r12, A17, A17.length());
            if (A05 == null) {
                C17900vP.A0Y(A17, "gdrive/v2/utils/is-local-same-as-remote/md5-is-null/ ", AnonymousClass000.A10());
                return 1;
            }
            if (a55 != null) {
                str2 = a55.A03;
            } else {
                str2 = a2d.A03;
            }
            if (A05.equals(str2)) {
                return 3;
            }
        }
        return 4;
    }

    public static final C20007A2x A01(C36821oW r2, A7X a7x, String str, String str2) {
        C18070vi.A0d(str, 1);
        try {
            return (C20007A2x) A84.A00(new C167438gH(a7x, str, 0), r2, str2);
        } catch (C167568gb unused) {
            return null;
        }
    }

    public static final String A02(File file) {
        C18070vi.A0d(file, 0);
        try {
            return file.getCanonicalPath();
        } catch (IOException e) {
            C108995ce.A1J(file, "gdrive/backup/failed to get canonical path for ", AnonymousClass000.A10(), e);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0018 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A03(java.util.Map r8) {
        /*
            r5 = 0
            java.util.ArrayList r4 = X.C108955ca.A16(r8, r5)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x005f
            java.lang.String r0 = "msgstore.db.crypt(\\d+)|msgstore-increment-(\\d+).db.crypt(\\d+)"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r0)
            X.C18070vi.A0X(r3)
            java.util.Iterator r7 = X.AnonymousClass8BU.A0x(r8)
        L_0x0018:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x005f
            java.lang.String r6 = X.C17880vN.A0v(r7)
            java.lang.String r0 = java.io.File.separator
            X.C18070vi.A0Z(r0)
            java.util.List r2 = X.C108965cb.A0v(r6, r0, r5)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x005c
            java.util.ListIterator r1 = X.C108955ca.A18(r2)
        L_0x0035:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x005c
            int r0 = X.C108985cd.A08(r1)
            if (r0 == 0) goto L_0x0035
            java.util.List r0 = X.C108985cd.A0t(r2, r1)
        L_0x0045:
            java.lang.String[] r1 = X.C108955ca.A1b(r0)
            int r0 = r1.length
            int r0 = r0 + -1
            r0 = r1[r0]
            boolean r0 = X.AnonymousClass8BU.A1V(r0, r3)
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r8.get(r6)
            r4.add(r0)
            goto L_0x0018
        L_0x005c:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x0045
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20127A8m.A03(java.util.Map):java.util.ArrayList");
    }

    public static final boolean A06(AnonymousClass1NP r2) {
        C18070vi.A0d(r2, 0);
        int A02 = r2.A02();
        if (A02 == 11 || A02 == 31 || A02 == 30 || A02 == 28 || A02 == 29) {
            return true;
        }
        return false;
    }

    public static final boolean A09(C36821oW r3, A7X a7x) {
        int i;
        C18070vi.A0d(r3, 1);
        synchronized (A84.class) {
            i = A84.A00;
        }
        Boolean bool = (Boolean) A84.A01(new C167398gC(a7x), r3, "gdrive-backup-util/fetch-token", i);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public static final boolean A0A(C19990A2d a2d) {
        C18070vi.A0d(a2d, 0);
        for (AnonymousClass9JN r3 : (AnonymousClass9JN[]) AnonymousClass9TM.A00.toArray(new AnonymousClass9JN[0])) {
            String str = a2d.A06;
            C18070vi.A0W(str);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(".crypt");
            String A0t = C17880vN.A0t(A10, r3.version);
            C18070vi.A0d(A0t, 1);
            if (str.endsWith(A0t)) {
                return true;
            }
        }
        String str2 = a2d.A06;
        C18070vi.A0W(str2);
        return str2.endsWith(".mcrypt1");
    }

    public static final Map A04(C36821oW r6, C20007A2x a2x) {
        HashMap hashMap = new HashMap(1000);
        String str = null;
        do {
            Pair pair = (Pair) A84.A00(new AnonymousClass8gE(a2x, str, 1), r6, "gdrive/v2/load-files");
            if (pair == null) {
                return null;
            }
            str = (String) pair.second;
            Iterator A13 = AnonymousClass8BR.A13(pair.first);
            while (A13.hasNext()) {
                C19990A2d A0I = AnonymousClass8BR.A0I(A13);
                String A01 = A0I.A01();
                C18070vi.A0X(A01);
                hashMap.put(A01, A0I);
            }
        } while (str != null);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("gdrive/v2/load-files result ");
        C17900vP.A0o(A10, hashMap.size());
        return Collections.unmodifiableMap(hashMap);
    }

    public static final boolean A07(B73 b73, C36821oW r4, A7X a7x, C19990A2d a2d, File file) {
        AnonymousClass8gN r2 = new AnonymousClass8gN(b73, r4, a7x, a2d, file);
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0N(file, "restore>gdrive/restore/file ", A10);
        Boolean bool = (Boolean) A84.A00(r2, r4, A10.toString());
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r3 = r2.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.AnonymousClass1NT r2, java.util.Collection r3) {
        /*
            X.C18070vi.A0h(r2, r3)
            boolean r0 = r2.A04()
            if (r0 == 0) goto L_0x0038
            java.util.Iterator r1 = r3.iterator()
        L_0x000d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x003b
            X.A2d r0 = X.AnonymousClass8BR.A0I(r1)
            boolean r0 = A0A(r0)
            if (r0 != 0) goto L_0x000d
            r1 = 0
        L_0x001e:
            boolean r0 = r2.A04()
            if (r0 == 0) goto L_0x0038
            X.0z4 r3 = r2.A05
            java.lang.String r2 = r3.A0f()
            if (r2 == 0) goto L_0x0038
            if (r1 != 0) goto L_0x0039
            int r1 = r3.A0M(r2)
            r0 = 1
            if (r1 == r0) goto L_0x0038
        L_0x0035:
            r3.A1k(r2, r0)
        L_0x0038:
            return
        L_0x0039:
            r0 = 2
            goto L_0x0035
        L_0x003b:
            r1 = 1
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20127A8m.A05(X.1NT, java.util.Collection):void");
    }

    public static final boolean A08(C36821oW r6, C20007A2x a2x, A7X a7x, List list) {
        boolean A1K = C108975cc.A1K(list);
        int size = list.size();
        for (int i = 0; i < size; i += 2500) {
            int i2 = i + 2500;
            if (i2 > size) {
                i2 = size;
            }
            if (A84.A00(new C167418gF(a2x, a7x, list.subList(i, i2)), r6, "gdrive/backup/files") != Boolean.valueOf(A1K)) {
                return false;
            }
        }
        return A1K;
    }
}
