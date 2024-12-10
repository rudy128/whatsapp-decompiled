package X;

import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: X.8op  reason: invalid class name and case insensitive filesystem */
public final class C170158op extends AnonymousClass1NZ {
    public final AnonymousClass118 A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public ArrayList A0N(File file) {
        C18070vi.A0d(file, 0);
        return AnonymousClass8BU.A0v(file, "avatar-password.bkup", A3K.A02(AnonymousClass9JN.CRYPT14));
    }

    public boolean A0S(C171768sF r13, File file) {
        AnonymousClass9JN r0;
        String str;
        String str2;
        Object obj;
        C18070vi.A0d(file, 1);
        try {
            File A002 = this.A04.A00("avatar_password.json");
            C191639mv r1 = (C191639mv) this.A04.get();
            int A003 = A3K.A00(AnonymousClass8BS.A0i(file), "avatar_password.json");
            if (A003 <= 0 || (r0 = AnonymousClass9JN.A02(A003)) == null) {
                r0 = AnonymousClass9JN.UNENCRYPTED;
            }
            Boolean bool = null;
            C189869jz A07 = r1.A00((C19947A0e) null, r0, file, false).A07(this.A00, (B9V) null, A002, 0, 0, false);
            if (r13 != null) {
                r13.A00 = Integer.valueOf(A3O.A00(A07.A00));
            }
            StringBuilder A10 = AnonymousClass000.A10();
            BufferedReader A0V = AnonymousClass8BW.A0V(A002);
            while (true) {
                String readLine = A0V.readLine();
                if (readLine == null) {
                    break;
                }
                A10.append(readLine);
            }
            if (A10.length() > 0) {
                JSONObject A16 = C17880vN.A16(A10.toString());
                if (A16.has("avatar_fbid")) {
                    str = A16.getString("avatar_fbid");
                } else {
                    str = null;
                }
                if (A16.has("avatar_password")) {
                    str2 = A16.getString("avatar_password");
                } else {
                    str2 = null;
                }
                if (!(str == null || str.length() == 0 || str2 == null || str2.length() == 0)) {
                    C134906rL r4 = new C134906rL(AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), Long.TYPE, C108965cb.A0m(str), "WaFbid"), AnonymousClass8BX.A0K(str2, "WaFbPassword"));
                    try {
                        C26981Ug r3 = new C26981Ug();
                        ((C136796uQ) this.A03.get()).A02(r4, new C20898AbE(this, r3));
                        obj = (Boolean) r3.get();
                    } catch (Throwable th) {
                        obj = C108945cZ.A1J(th);
                    }
                    Throwable A004 = C30671eK.A00(obj);
                    if (A004 != null) {
                        Log.e(A004);
                    }
                    if (!(obj instanceof AnonymousClass1IU)) {
                        bool = obj;
                    }
                    Boolean bool2 = bool;
                    if (bool2 != null) {
                        return bool2.booleanValue();
                    }
                }
                return false;
            }
            Log.w("AvatarBackup/restore could not read JSON metadata from backup file");
            return false;
        } catch (Exception e) {
            Log.e("AvatarBackup/restore failed", e);
            if (r13 != null) {
                r13.A00 = Integer.valueOf(A3O.A02(e));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.io.File} */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        X.CDX.A00(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0132, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0135, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        X.CDX.A00(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0139, code lost:
        throw r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.A26 A0T(X.C171828sL r22, X.AnonymousClass9JN r23) {
        /*
            r21 = this;
            r0 = r22
            r9 = r23
            X.C18070vi.A0h(r9, r0)
            java.lang.String r11 = "avatar-token"
            X.1Ez r2 = new X.1Ez
            r2.<init>((java.lang.String) r11)
            r8 = r21
            X.00H r1 = r8.A03
            java.lang.Object r1 = r1.get()
            X.6uQ r1 = (X.C136796uQ) r1
            X.732 r3 = r1.A00()
            if (r3 != 0) goto L_0x003b
            r9 = 0
            r12 = 3
        L_0x0020:
            r13 = 0
            X.A26 r8 = new X.A26
            r10 = r9
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x0028:
            int r1 = r8.A01
            int r1 = X.A3O.A01(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.A01 = r1
            java.lang.Long r1 = X.AnonymousClass8BT.A0n(r2)
            r0.A0E = r1
            return r8
        L_0x003b:
            X.77e r1 = r3.A05
            java.lang.Object r10 = r1.A00
            X.C17960vV.A07(r10)
            X.77e r1 = r3.A04
            java.lang.Object r1 = r1.A00
            X.C17960vV.A07(r1)
            java.lang.String r6 = java.lang.String.valueOf(r1)
            X.17y r3 = r8.A04
            java.lang.String r1 = "avatar_password.json"
            java.io.File r7 = r3.A00(r1)
            java.io.FileOutputStream r4 = X.C108945cZ.A19(r7)     // Catch:{ IOException -> 0x013a }
            java.lang.String r1 = X.C19620yd.A0A     // Catch:{ all -> 0x0133 }
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0133 }
            r5.<init>(r4, r1)     // Catch:{ all -> 0x0133 }
            X.C18070vi.A0b(r10)     // Catch:{ all -> 0x012c }
            org.json.JSONObject r3 = X.C17880vN.A15()     // Catch:{ all -> 0x012c }
            java.lang.String r1 = "avatar_password"
            r3.put(r1, r10)     // Catch:{ all -> 0x012c }
            java.lang.String r1 = "avatar_fbid"
            r3.put(r1, r6)     // Catch:{ all -> 0x012c }
            r1 = 2
            java.lang.String r1 = r3.toString(r1)     // Catch:{ all -> 0x012c }
            r5.write(r1)     // Catch:{ all -> 0x012c }
            r1 = 0
            r5.close()     // Catch:{ all -> 0x0133 }
            r4.close()     // Catch:{ IOException -> 0x013a }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x011a }
            java.lang.String r3 = "avatar-password.bkup.crypt"
            r4.append(r3)     // Catch:{ IOException -> 0x011a }
            int r3 = r9.version     // Catch:{ IOException -> 0x011a }
            java.lang.String r4 = X.C17880vN.A0t(r4, r3)     // Catch:{ IOException -> 0x011a }
            java.io.File r3 = r8.A0G(r9)     // Catch:{ IOException -> 0x011a }
            java.io.File r15 = X.C17880vN.A0e(r3, r4)     // Catch:{ IOException -> 0x011a }
            X.00H r3 = r8.A04     // Catch:{ IOException -> 0x011c }
            java.lang.Object r3 = r3.get()     // Catch:{ IOException -> 0x011c }
            X.9mv r3 = (X.C191639mv) r3     // Catch:{ IOException -> 0x011c }
            r5 = 0
            X.A5N r6 = r3.A00(r1, r9, r15, r5)     // Catch:{ IOException -> 0x011c }
            X.0ve r10 = r8.A01     // Catch:{ IOException -> 0x011c }
            r4 = 8968(0x2308, float:1.2567E-41)
            X.0vf r3 = X.C18040vf.A02     // Catch:{ IOException -> 0x011c }
            boolean r3 = X.C18020vd.A05(r3, r10, r4)     // Catch:{ IOException -> 0x011c }
            java.lang.String r10 = "AvatarBackup/backup prepare for backup failed"
            if (r3 == 0) goto L_0x00e5
            X.118 r3 = r8.A00     // Catch:{ IOException -> 0x011c }
            android.content.Context r4 = r3.A00     // Catch:{ IOException -> 0x011c }
            boolean r3 = r6.A09(r4, r7)     // Catch:{ IOException -> 0x011c }
            if (r3 == 0) goto L_0x00cd
            java.lang.String r3 = "AvatarBackup/backup/skip backup because backup file has the same source file"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ IOException -> 0x011c }
            r12 = 2
            r13 = 0
            X.A26 r8 = new X.A26     // Catch:{ IOException -> 0x011c }
            r10 = r1
            r9 = r1
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x011c }
            goto L_0x0028
        L_0x00cd:
            boolean r3 = r6.A0A(r4, r7)     // Catch:{ IOException -> 0x011c }
            if (r3 != 0) goto L_0x0101
            com.whatsapp.util.Log.e((java.lang.String) r10)     // Catch:{ IOException -> 0x011c }
            X.C64062u9.A0Q(r15)     // Catch:{ IOException -> 0x011c }
            r12 = 1
            r13 = 0
            X.A26 r8 = new X.A26     // Catch:{ IOException -> 0x011c }
            r10 = r1
            r9 = r1
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x011c }
            goto L_0x0028
        L_0x00e5:
            X.118 r3 = r8.A00     // Catch:{ IOException -> 0x011c }
            android.content.Context r3 = r3.A00     // Catch:{ IOException -> 0x011c }
            boolean r3 = r6.A0A(r3, r1)     // Catch:{ IOException -> 0x011c }
            if (r3 != 0) goto L_0x0101
            com.whatsapp.util.Log.e((java.lang.String) r10)     // Catch:{ IOException -> 0x011c }
            X.C64062u9.A0Q(r15)     // Catch:{ IOException -> 0x011c }
            r12 = 1
            r13 = 0
            X.A26 r8 = new X.A26     // Catch:{ IOException -> 0x011c }
            r10 = r1
            r9 = r1
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x011c }
            goto L_0x0028
        L_0x0101:
            r6.A08(r1, r7)     // Catch:{ IOException -> 0x011c }
            java.io.File r3 = r8.A0G(r9)
            long r19 = r8.A0E(r3)
            X.A26 r8 = new X.A26
            r14 = r8
            r16 = r1
            r17 = r11
            r18 = r5
            r14.<init>(r15, r16, r17, r18, r19)
            goto L_0x0028
        L_0x011a:
            r4 = move-exception
            goto L_0x011e
        L_0x011c:
            r4 = move-exception
            r1 = r15
        L_0x011e:
            java.lang.String r3 = "AvatarBackup/backup backup failed"
            com.whatsapp.util.Log.e(r3, r4)
            if (r1 == 0) goto L_0x0128
            X.C64062u9.A0Q(r1)
        L_0x0128:
            r9 = 0
            r12 = 1
            goto L_0x0020
        L_0x012c:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x012e }
        L_0x012e:
            r1 = move-exception
            X.CDX.A00(r5, r3)     // Catch:{ all -> 0x0133 }
            throw r1     // Catch:{ all -> 0x0133 }
        L_0x0133:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0135 }
        L_0x0135:
            r1 = move-exception
            X.CDX.A00(r4, r3)     // Catch:{ IOException -> 0x013a }
            throw r1     // Catch:{ IOException -> 0x013a }
        L_0x013a:
            r3 = move-exception
            java.lang.String r1 = "AvatarBackup/backup exception while writing to temp file"
            com.whatsapp.util.Log.e(r1, r3)
            r9 = 0
            r12 = 1
            r13 = 0
            X.A26 r8 = new X.A26
            r10 = r9
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170158op.A0T(X.8sL, X.9JN):X.A26");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C170158op(AnonymousClass118 r1, AnonymousClass1NX r2, C18030ve r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        super(r2);
        C18070vi.A0w(r1, r3, r4, r5, r6);
        this.A00 = r1;
        this.A01 = r3;
        this.A04 = r4;
        this.A02 = r5;
        this.A03 = r6;
    }

    public void A0K(C171768sF r2, long j) {
        r2.A09 = Long.valueOf(j);
    }

    public String A0M() {
        return "avatar-token";
    }

    public void A0O(C171878sQ r2, double d) {
        r2.A03 = AnonymousClass8BW.A0Y(d);
    }

    public void A0P(C171878sQ r2, double d) {
        r2.A04 = AnonymousClass8BW.A0Y(d);
    }

    public void A0Q(C171878sQ r2, double d) {
        r2.A02 = AnonymousClass8BW.A0Y(d);
    }
}
