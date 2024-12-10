package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class A5J {
    public final int A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            A5J a5j = (A5J) obj;
            if (this.A00 != a5j.A00 || !this.A03.equals(a5j.A03) || !AnonymousClass026.A00(this.A04, a5j.A04) || !AnonymousClass026.A00(this.A02, a5j.A02) || !AnonymousClass026.A00(this.A01, a5j.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        AnonymousClass000.A1L(objArr, this.A00);
        objArr[1] = this.A03;
        objArr[2] = this.A04;
        objArr[3] = this.A02;
        return AnonymousClass000.A0P(this.A01, objArr, 4);
    }

    public static A5J A00(Context context, String str, boolean z) {
        try {
            return A01(C180919Ol.A00(context, str, 64), z);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new C21588Amc(AnonymousClass001.A1H("Unable to get packageInfo for package ", str, AnonymousClass000.A10()));
        }
    }

    public String A02() {
        List list = this.A03;
        if (!list.isEmpty()) {
            return C17880vN.A0v(list.iterator());
        }
        throw AnonymousClass000.A0n("Invalid AppIdentity object: no package names");
    }

    public String toString() {
        C21339AiQ aiQ;
        String str;
        List list = this.A04;
        if (list.isEmpty()) {
            aiQ = null;
        } else {
            aiQ = (C21339AiQ) C108955ca.A0p(list);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AppIdentity{uid=");
        A10.append(this.A00);
        A10.append(", packageNames=");
        A10.append(this.A03);
        A10.append(", sha2=");
        String str2 = "null";
        if (aiQ == null) {
            str = str2;
        } else {
            str = aiQ.sha256Hash;
        }
        A10.append(str);
        A10.append(", version=");
        String str3 = this.A02;
        if (str3 == null) {
            str3 = str2;
        }
        A10.append(str3);
        A10.append(", domain=");
        String str4 = this.A01;
        if (str4 != null) {
            str2 = str4;
        }
        A10.append(str2);
        return C17890vO.A0b(A10);
    }

    public A5J(String str, String str2, List list, List list2, int i) {
        this.A00 = i;
        this.A03 = Collections.unmodifiableList(list);
        this.A04 = list2;
        this.A02 = str;
        this.A01 = str2;
        if (list.isEmpty()) {
            throw AnonymousClass000.A0k("At least one package name is required");
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.AiQ] */
    public static A5J A01(C192529oY r11, boolean z) {
        C21339AiQ aiQ;
        HashSet A12 = C17880vN.A12();
        C194179rJ A012 = r11.A01();
        if (A012 != null) {
            List<Signature> list = A012.A00;
            if (!list.isEmpty()) {
                ApplicationInfo applicationInfo = r11.A00;
                if (applicationInfo != null) {
                    ArrayList A14 = AnonymousClass000.A14(list);
                    for (Signature byteArray : list) {
                        byte[] byteArray2 = byteArray.toByteArray();
                        try {
                            String A0x = AnonymousClass8BT.A0x(AnonymousClass8BW.A1W(byteArray2, "SHA-256"));
                            if (z) {
                                String A0x2 = AnonymousClass8BT.A0x(AnonymousClass8BW.A1W(byteArray2, "SHA-1"));
                                ? obj = new Object();
                                obj.sha1Hash = A0x2;
                                if (A0x.length() == 43) {
                                    obj.sha256Hash = A0x;
                                    aiQ = obj;
                                } else {
                                    throw new SecurityException("Invalid SHA256 key hash - should be 256-bit.");
                                }
                            } else {
                                aiQ = new C21339AiQ(A0x);
                            }
                            A14.add(aiQ);
                        } catch (NoSuchAlgorithmException unused) {
                            throw new SecurityException("Error obtaining SHA1/SHA256");
                        }
                    }
                    A12.add(r11.A01);
                    int i = applicationInfo.uid;
                    return new A5J(r11.A02, (String) null, C17880vN.A10(A12), A14, i);
                }
                throw new SecurityException("Unable to construct AppIdentity -- package applicationInfo is null");
            }
            throw new C21589Amd("Unable to construct AppIdentity -- packageInfo does not have any signatures. Make sure you called getPackageInfo() with GET_SIGNATURES or GET_CERTIFICATES flag.");
        }
        throw new C21589Amd("Unable to construct AppIdentity -- signingInfo was null. Make sure you called getPackageInfo() with GET_SIGNATURES or GET_CERTIFICATES flag.");
    }
}
