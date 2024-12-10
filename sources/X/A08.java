package X;

import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class A08 {
    public final AnonymousClass190 A00;
    public final C198049xh A01;
    public final C57302ir A02;
    public final AnonymousClass10I A03;
    public final ReadWriteLock A04 = new ReentrantReadWriteLock();
    public final AnonymousClass11P A05;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ef, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0028 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0205 A[Catch:{ all -> 0x0218, all -> 0x021d, all -> 0x0222 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A01() {
        /*
            r17 = this;
            r5 = r17
            X.2ir r0 = r5.A02
            java.io.File r1 = r0.A00()
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x023d
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x022b }
            java.util.concurrent.locks.ReadWriteLock r7 = r5.A04     // Catch:{ Exception -> 0x022b }
            java.util.concurrent.locks.Lock r0 = r7.readLock()     // Catch:{ Exception -> 0x022b }
            r0.lock()     // Catch:{ Exception -> 0x022b }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x0222 }
            r0.<init>(r1)     // Catch:{ all -> 0x0222 }
            android.util.JsonReader r6 = new android.util.JsonReader     // Catch:{ all -> 0x0222 }
            r6.<init>(r0)     // Catch:{ all -> 0x0222 }
            r6.beginArray()     // Catch:{ all -> 0x0218 }
        L_0x0028:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0218 }
            if (r0 == 0) goto L_0x020a
            java.util.HashMap r8 = X.C17880vN.A11()     // Catch:{ all -> 0x0218 }
            r6.beginObject()     // Catch:{ all -> 0x0218 }
        L_0x0035:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0218 }
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = r6.nextName()     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = r6.nextString()     // Catch:{ all -> 0x0218 }
            r8.put(r1, r0)     // Catch:{ all -> 0x0218 }
            goto L_0x0035
        L_0x0047:
            r6.endObject()     // Catch:{ all -> 0x0218 }
            X.9xh r3 = r5.A01     // Catch:{ all -> 0x0218 }
            java.lang.String r2 = "type"
            java.lang.String r1 = X.C108945cZ.A1G(r2, r8)     // Catch:{ all -> 0x0218 }
            boolean r0 = X.AnonymousClass1EG.A0H(r1)     // Catch:{ all -> 0x0218 }
            if (r0 != 0) goto L_0x0192
            java.lang.String r1 = X.C198049xh.A00(r3, r1)     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "TEXT_QUERY"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0218 }
            if (r0 != 0) goto L_0x0192
            java.lang.String r0 = "BUSINESS_PROFILE"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0218 }
            if (r0 == 0) goto L_0x00fa
            java.util.Iterator r10 = X.C17890vO.A0i(r8)     // Catch:{ all -> 0x0218 }
            java.lang.String r14 = ""
            r15 = r14
            r16 = r14
            r12 = 1
            r1 = 0
        L_0x0078:
            boolean r8 = r10.hasNext()     // Catch:{ all -> 0x0218 }
            r0 = 3
            if (r8 == 0) goto L_0x00ed
            java.util.Map$Entry r8 = X.AnonymousClass000.A16(r10)     // Catch:{ all -> 0x0218 }
            java.lang.Object r0 = r8.getValue()     // Catch:{ all -> 0x0218 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x0218 }
            boolean r0 = X.AnonymousClass1EG.A0H(r0)     // Catch:{ all -> 0x0218 }
            if (r0 != 0) goto L_0x0078
            java.lang.String r9 = X.C17880vN.A0x(r8)     // Catch:{ all -> 0x0218 }
            int r0 = r9.hashCode()     // Catch:{ all -> 0x0218 }
            switch(r0) {
                case 105221: goto L_0x00a0;
                case 3575610: goto L_0x00af;
                case 55126294: goto L_0x00b6;
                case 629885866: goto L_0x00d1;
                case 1296516636: goto L_0x00e0;
                default: goto L_0x009a;
            }     // Catch:{ all -> 0x0218 }
        L_0x009a:
            java.lang.String r0 = "DirectoryRecentSearchJsonIOManager/mapBusinessItemSelection Illegal field type for item. This field won't be mapped to the item."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0218 }
            goto L_0x0078
        L_0x00a0:
            java.lang.String r0 = "jid"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0218 }
            if (r0 == 0) goto L_0x009a
            int r1 = r1 + 1
            java.lang.String r16 = A00(r3, r8)     // Catch:{ all -> 0x0218 }
            goto L_0x0078
        L_0x00af:
            boolean r0 = r9.equals(r2)     // Catch:{ all -> 0x0218 }
            if (r0 != 0) goto L_0x0078
            goto L_0x009a
        L_0x00b6:
            java.lang.String r0 = "timestamp"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0218 }
            if (r0 == 0) goto L_0x009a
            int r1 = r1 + 1
            java.lang.Object r0 = r8.getValue()     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = X.C198049xh.A00(r3, r0)     // Catch:{ all -> 0x0218 }
            long r12 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x0218 }
            goto L_0x0078
        L_0x00d1:
            java.lang.String r0 = "business_name"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0218 }
            if (r0 == 0) goto L_0x009a
            int r1 = r1 + 1
            java.lang.String r14 = A00(r3, r8)     // Catch:{ all -> 0x0218 }
            goto L_0x0078
        L_0x00e0:
            java.lang.String r0 = "categories"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0218 }
            if (r0 == 0) goto L_0x009a
            java.lang.String r15 = A00(r3, r8)     // Catch:{ all -> 0x0218 }
            goto L_0x0078
        L_0x00ed:
            if (r1 != r0) goto L_0x00f6
            X.AEx r11 = new X.AEx     // Catch:{ all -> 0x0218 }
            r11.<init>(r12, r14, r15, r16)     // Catch:{ all -> 0x0218 }
            goto L_0x0203
        L_0x00f6:
            java.lang.String r0 = "DirectoryRecentSearchJsonIOManager/mapBusinessItemSelection Could not map all the necessary fields. Item won't be shown to the user"
            goto L_0x01ff
        L_0x00fa:
            java.lang.String r0 = "CATEGORY_SEARCH"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0218 }
            if (r0 == 0) goto L_0x01fd
            java.util.Iterator r10 = X.C17890vO.A0i(r8)     // Catch:{ all -> 0x0218 }
            java.lang.String r14 = ""
            r11 = 0
            r15 = r14
            r16 = r11
            r12 = 1
            r1 = 0
        L_0x010f:
            boolean r8 = r10.hasNext()     // Catch:{ all -> 0x0218 }
            r0 = 3
            if (r8 == 0) goto L_0x0184
            java.util.Map$Entry r8 = X.AnonymousClass000.A16(r10)     // Catch:{ all -> 0x0218 }
            java.lang.Object r0 = r8.getValue()     // Catch:{ all -> 0x0218 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x0218 }
            boolean r0 = X.AnonymousClass1EG.A0H(r0)     // Catch:{ all -> 0x0218 }
            if (r0 != 0) goto L_0x010f
            java.lang.String r9 = X.C17880vN.A0x(r8)     // Catch:{ all -> 0x0218 }
            int r0 = r9.hashCode()     // Catch:{ all -> 0x0218 }
            switch(r0) {
                case -664075021: goto L_0x0137;
                case 3575610: goto L_0x0144;
                case 55126294: goto L_0x014b;
                case 338683180: goto L_0x0166;
                case 1537780732: goto L_0x0175;
                default: goto L_0x0131;
            }     // Catch:{ all -> 0x0218 }
        L_0x0131:
            java.lang.String r0 = "DirectoryRecentSearchJsonIOManager/mapCategoryItemSelection Illegal field type for item. This field won't be mapped to the item."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0218 }
            goto L_0x010f
        L_0x0137:
            java.lang.String r0 = "parent_category"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0218 }
            if (r0 == 0) goto L_0x0131
            java.lang.String r16 = A00(r3, r8)     // Catch:{ all -> 0x0218 }
            goto L_0x010f
        L_0x0144:
            boolean r0 = r9.equals(r2)     // Catch:{ all -> 0x0218 }
            if (r0 != 0) goto L_0x010f
            goto L_0x0131
        L_0x014b:
            java.lang.String r0 = "timestamp"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0218 }
            if (r0 == 0) goto L_0x0131
            java.lang.Object r0 = r8.getValue()     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = X.C198049xh.A00(r3, r0)     // Catch:{ all -> 0x0218 }
            long r12 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x0218 }
            int r1 = r1 + 1
            goto L_0x010f
        L_0x0166:
            java.lang.String r0 = "category_name"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0218 }
            if (r0 == 0) goto L_0x0131
            java.lang.String r14 = A00(r3, r8)     // Catch:{ all -> 0x0218 }
            int r1 = r1 + 1
            goto L_0x010f
        L_0x0175:
            java.lang.String r0 = "category_id"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0218 }
            if (r0 == 0) goto L_0x0131
            java.lang.String r15 = A00(r3, r8)     // Catch:{ all -> 0x0218 }
            int r1 = r1 + 1
            goto L_0x010f
        L_0x0184:
            if (r1 != r0) goto L_0x018c
            X.AEy r11 = new X.AEy     // Catch:{ all -> 0x0218 }
            r11.<init>(r12, r14, r15, r16)     // Catch:{ all -> 0x0218 }
            goto L_0x0203
        L_0x018c:
            java.lang.String r0 = "DirectoryRecentSearchJsonIOManager/mapSearchQuery Could not map all the necessary fields. Item won't be shown to the user"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0218 }
            goto L_0x0203
        L_0x0192:
            java.util.Iterator r13 = X.C17890vO.A0i(r8)     // Catch:{ all -> 0x0218 }
            java.lang.String r9 = ""
            r0 = 1
            r10 = 0
        L_0x019b:
            boolean r11 = r13.hasNext()     // Catch:{ all -> 0x0218 }
            r8 = 2
            if (r11 == 0) goto L_0x01f2
            java.util.Map$Entry r11 = X.AnonymousClass000.A16(r13)     // Catch:{ all -> 0x0218 }
            java.lang.Object r8 = r11.getValue()     // Catch:{ all -> 0x0218 }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ all -> 0x0218 }
            boolean r8 = X.AnonymousClass1EG.A0H(r8)     // Catch:{ all -> 0x0218 }
            if (r8 != 0) goto L_0x019b
            java.lang.String r12 = X.C17880vN.A0x(r11)     // Catch:{ all -> 0x0218 }
            int r8 = r12.hashCode()     // Catch:{ all -> 0x0218 }
            switch(r8) {
                case 3575610: goto L_0x01c3;
                case 55126294: goto L_0x01ca;
                case 107944136: goto L_0x01e3;
                default: goto L_0x01bd;
            }     // Catch:{ all -> 0x0218 }
        L_0x01bd:
            java.lang.String r8 = "DirectoryRecentSearchJsonIOManager/mapSearchQuery Illegal field type for item. This field won't be mapped to the item."
            com.whatsapp.util.Log.i((java.lang.String) r8)     // Catch:{ all -> 0x0218 }
            goto L_0x019b
        L_0x01c3:
            boolean r8 = r12.equals(r2)     // Catch:{ all -> 0x0218 }
            if (r8 != 0) goto L_0x019b
            goto L_0x01bd
        L_0x01ca:
            java.lang.String r8 = "timestamp"
            boolean r8 = r12.equals(r8)     // Catch:{ all -> 0x0218 }
            if (r8 == 0) goto L_0x01bd
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = X.C198049xh.A00(r3, r0)     // Catch:{ all -> 0x0218 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x0218 }
            goto L_0x01ef
        L_0x01e3:
            java.lang.String r8 = "query"
            boolean r8 = r12.equals(r8)     // Catch:{ all -> 0x0218 }
            if (r8 == 0) goto L_0x01bd
            java.lang.String r9 = A00(r3, r11)     // Catch:{ all -> 0x0218 }
        L_0x01ef:
            int r10 = r10 + 1
            goto L_0x019b
        L_0x01f2:
            if (r10 != r8) goto L_0x01fa
            X.AEw r11 = new X.AEw     // Catch:{ all -> 0x0218 }
            r11.<init>(r9, r0)     // Catch:{ all -> 0x0218 }
            goto L_0x0203
        L_0x01fa:
            java.lang.String r0 = "DirectoryRecentSearchJsonIOManager/mapSearchQuery Could not map all the necessary fields. Item won't be shown to the user"
            goto L_0x01ff
        L_0x01fd:
            java.lang.String r0 = "DirectoryRecentSearchJsonIOManager/map Could not map one of the items to DirectoryRecentSearch. Unknwon type"
        L_0x01ff:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0218 }
            r11 = 0
        L_0x0203:
            if (r11 == 0) goto L_0x0028
            r4.add(r11)     // Catch:{ all -> 0x0218 }
            goto L_0x0028
        L_0x020a:
            r6.endArray()     // Catch:{ all -> 0x0218 }
            r6.close()     // Catch:{ all -> 0x0222 }
            java.util.concurrent.locks.Lock r0 = r7.readLock()     // Catch:{ Exception -> 0x022b }
            r0.unlock()     // Catch:{ Exception -> 0x022b }
            goto L_0x023e
        L_0x0218:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x021d }
            goto L_0x0221
        L_0x021d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0222 }
        L_0x0221:
            throw r1     // Catch:{ all -> 0x0222 }
        L_0x0222:
            r1 = move-exception
            java.util.concurrent.locks.Lock r0 = r7.readLock()     // Catch:{ Exception -> 0x022b }
            r0.unlock()     // Catch:{ Exception -> 0x022b }
            throw r1     // Catch:{ Exception -> 0x022b }
        L_0x022b:
            r1 = move-exception
            java.lang.String r0 = "DirectoryRecentSearchManagerImpl/getRecentSearchList: Failed to load recent search history"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.190 r3 = r5.A00
            java.lang.String r2 = r1.toString()
            r1 = 0
            java.lang.String r0 = "getRecentSearchList/getRecentSearchList: Failed to load recent search history"
            r3.A0G(r0, r2, r1)
        L_0x023d:
            r4 = 0
        L_0x023e:
            if (r4 != 0) goto L_0x0244
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
        L_0x0244:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A08.A01():java.util.ArrayList");
    }

    public A08(AnonymousClass190 r2, C198049xh r3, AnonymousClass11P r4, C57302ir r5, AnonymousClass10I r6) {
        this.A05 = r4;
        this.A03 = r6;
        this.A00 = r2;
        this.A02 = r5;
        this.A01 = r3;
    }

    public static String A00(C198049xh r1, Map.Entry entry) {
        return C198049xh.A00(r1, (String) entry.getValue());
    }
}
