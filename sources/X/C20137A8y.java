package X;

import android.database.Cursor;
import android.os.Build;

/* renamed from: X.A8y  reason: case insensitive filesystem */
public abstract class C20137A8y {
    public static final int A00(Integer num) {
        C18070vi.A0d(num, 0);
        int intValue = num.intValue();
        int i = 1;
        if (intValue == 0) {
            return 0;
        }
        if (intValue != 1) {
            i = 3;
            if (intValue == 2) {
                return 2;
            }
            if (intValue != 3) {
                i = 5;
                if (intValue == 4) {
                    return 4;
                }
                if (Build.VERSION.SDK_INT < 30 || num != AnonymousClass00R.A0j) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Could not convert ");
                    A10.append(AnonymousClass9OD.A00(num));
                    throw AnonymousClass001.A12(" to int", A10);
                }
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.LinkedHashSet A09(byte[] r8) {
        /*
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            java.util.LinkedHashSet r7 = X.C17880vN.A14()
            int r0 = r8.length
            if (r0 == 0) goto L_0x0050
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r6.<init>(r8)
            java.io.ObjectInputStream r5 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0041 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0041 }
            int r4 = r5.readInt()     // Catch:{ all -> 0x003a }
            r3 = 0
        L_0x001a:
            if (r3 >= r4) goto L_0x0036
            java.lang.String r0 = r5.readUTF()     // Catch:{ all -> 0x003a }
            android.net.Uri r2 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x003a }
            boolean r1 = r5.readBoolean()     // Catch:{ all -> 0x003a }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x003a }
            X.9nt r0 = new X.9nt     // Catch:{ all -> 0x003a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x003a }
            r7.add(r0)     // Catch:{ all -> 0x003a }
            int r3 = r3 + 1
            goto L_0x001a
        L_0x0036:
            r5.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0045
        L_0x003a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ IOException -> 0x0041 }
            throw r0     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0049 }
        L_0x0045:
            r6.close()
            return r7
        L_0x0049:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        L_0x0050:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20137A8y.A09(byte[]):java.util.LinkedHashSet");
    }

    public static void A0B(BE4 be4, A2t a2t, String str) {
        be4.BDB(1, str);
        be4.BD9(2, (long) A01(a2t.A0G));
        be4.BDB(3, a2t.A0I);
        be4.BDB(4, a2t.A0H);
        byte[] A01 = A6Y.A01(a2t.A0C);
        if (A01 == null) {
            be4.BDA(5);
        } else {
            be4.BD5(5, A01);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] A0C(java.util.Set r5) {
        /*
            r1 = 0
            X.C18070vi.A0d(r5, r1)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x000d
            byte[] r0 = new byte[r1]
            return r0
        L_0x000d:
            java.io.ByteArrayOutputStream r4 = X.C108945cZ.A15()
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0051 }
            r3.<init>(r4)     // Catch:{ all -> 0x0051 }
            int r0 = r5.size()     // Catch:{ all -> 0x004a }
            r3.writeInt(r0)     // Catch:{ all -> 0x004a }
            java.util.Iterator r2 = r5.iterator()     // Catch:{ all -> 0x004a }
        L_0x0021:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x003c
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x004a }
            X.9nt r1 = (X.C192149nt) r1     // Catch:{ all -> 0x004a }
            android.net.Uri r0 = r1.A00     // Catch:{ all -> 0x004a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x004a }
            r3.writeUTF(r0)     // Catch:{ all -> 0x004a }
            boolean r0 = r1.A01     // Catch:{ all -> 0x004a }
            r3.writeBoolean(r0)     // Catch:{ all -> 0x004a }
            goto L_0x0021
        L_0x003c:
            r3.close()     // Catch:{ all -> 0x0051 }
            r4.close()
            byte[] r0 = r4.toByteArray()
            X.C18070vi.A0X(r0)
            return r0
        L_0x004a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0051 }
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20137A8y.A0C(java.util.Set):byte[]");
    }

    public static final Integer A02(int i) {
        if (i == 0) {
            return AnonymousClass00R.A00;
        }
        if (i == 1) {
            return AnonymousClass00R.A01;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Could not convert ");
        A10.append(i);
        throw AnonymousClass001.A12(" to BackoffPolicy", A10);
    }

    public static final Integer A03(int i) {
        if (i == 0) {
            return AnonymousClass00R.A00;
        }
        if (i == 1) {
            return AnonymousClass00R.A01;
        }
        if (i == 2) {
            return AnonymousClass00R.A0C;
        }
        if (i == 3) {
            return AnonymousClass00R.A0N;
        }
        if (i == 4) {
            return AnonymousClass00R.A0Y;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return AnonymousClass00R.A0j;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Could not convert ");
        A10.append(i);
        throw AnonymousClass001.A12(" to NetworkType", A10);
    }

    public static final Integer A04(int i) {
        if (i == 0) {
            return AnonymousClass00R.A00;
        }
        if (i == 1) {
            return AnonymousClass00R.A01;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Could not convert ");
        A10.append(i);
        throw AnonymousClass001.A12(" to OutOfQuotaPolicy", A10);
    }

    public static final Integer A05(int i) {
        if (i == 0) {
            return AnonymousClass00R.A00;
        }
        if (i == 1) {
            return AnonymousClass00R.A01;
        }
        if (i == 2) {
            return AnonymousClass00R.A0C;
        }
        if (i == 3) {
            return AnonymousClass00R.A0N;
        }
        if (i == 4) {
            return AnonymousClass00R.A0Y;
        }
        if (i == 5) {
            return AnonymousClass00R.A0j;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Could not convert ");
        A10.append(i);
        throw AnonymousClass001.A12(" to State", A10);
    }

    public static void A0A(BE4 be4, A2t a2t, int i) {
        be4.BD9(17, (long) i);
        be4.BD9(18, (long) a2t.A01);
        be4.BD9(19, (long) a2t.A0K);
        be4.BD9(20, a2t.A09);
        be4.BD9(21, (long) a2t.A00);
        be4.BD9(22, (long) a2t.A0L);
        C20078A6e a6e = a2t.A0B;
        be4.BD9(23, (long) A00(a6e.A00));
        be4.BD9(24, a6e.A02 ? 1 : 0);
        be4.BD9(25, a6e.A04() ? 1 : 0);
        be4.BD9(26, a6e.A01 ? 1 : 0);
        be4.BD9(27, a6e.A04 ? 1 : 0);
        be4.BD9(28, a6e.A01());
        be4.BD9(29, a6e.A00());
        be4.BD5(30, A0C(a6e.A02()));
    }

    public static final int A01(Integer num) {
        switch (num.intValue()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            default:
                throw AnonymousClass3MW.A14();
        }
    }

    public static Integer A06(Cursor cursor, int i) {
        return A03(cursor.getInt(i));
    }

    public static Integer A07(Cursor cursor, int i) {
        return A05(cursor.getInt(i));
    }

    public static Integer A08(Cursor cursor, int i) {
        return A02(cursor.getInt(i));
    }
}
