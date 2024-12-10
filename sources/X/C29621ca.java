package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1ca  reason: invalid class name and case insensitive filesystem */
public class C29621ca {
    public final String A00;
    public final byte[] A01;
    public final C29621ca[] A02;
    public final AnonymousClass1MD[] A03;

    public static String A02(C29621ca r1, String str) {
        return r1.A0Q(str, (String) null);
    }

    public static void A06(String str, byte[] bArr, Object[] objArr, int i) {
        objArr[i] = new C29621ca(str, bArr, (AnonymousClass1MD[]) null);
    }

    public int A0A(String str, int i) {
        String A0Q = A0Q(str, (String) null);
        if (A0Q == null) {
            return i;
        }
        return A0B(A0Q, str);
    }

    public long A0D(String str, long j) {
        String A0Q = A0Q(str, (String) null);
        if (A0Q == null) {
            return j;
        }
        return A0E(A0Q, str);
    }

    public String A0O(String str) {
        return A0Q(str, (String) null);
    }

    public String A0P(String str) {
        String A0Q = A0Q(str, (String) null);
        if (A0Q != null) {
            return A0Q;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("required attribute '");
        sb.append(str);
        sb.append("' missing for tag ");
        sb.append(this.A00);
        throw new AnonymousClass1UI(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r0 == null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0065, code lost:
        if (r6 == null) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r9 = 1
            if (r10 == r11) goto L_0x0082
            r8 = 0
            if (r11 == 0) goto L_0x0081
            java.lang.Class r1 = r10.getClass()
            java.lang.Class r0 = r11.getClass()
            if (r1 != r0) goto L_0x0081
            X.1ca r11 = (X.C29621ca) r11
            java.lang.String r1 = r10.A00
            java.lang.String r0 = r11.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0081
            X.1MD[] r5 = r10.A03
            X.1MD[] r0 = r11.A03
            if (r5 == 0) goto L_0x0041
            if (r0 == 0) goto L_0x0081
            int r4 = r5.length
            int r0 = r0.length
            if (r4 != r0) goto L_0x0081
            r3 = 0
        L_0x0029:
            if (r3 >= r4) goto L_0x0043
            r2 = r5[r3]
            java.lang.String r1 = r2.A02
            r0 = 0
            java.lang.String r1 = r11.A0Q(r1, r0)
            if (r1 == 0) goto L_0x0081
            java.lang.String r0 = r2.A03
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0081
            int r3 = r3 + 1
            goto L_0x0029
        L_0x0041:
            if (r0 != 0) goto L_0x0081
        L_0x0043:
            X.1ca[] r7 = r10.A02
            X.1ca[] r6 = r11.A02
            if (r7 == 0) goto L_0x0065
            if (r6 == 0) goto L_0x0081
            int r5 = r7.length
            int r4 = r6.length
            if (r5 != r4) goto L_0x0081
            r3 = 0
        L_0x0050:
            if (r3 >= r5) goto L_0x0067
            r2 = r7[r3]
            r1 = 0
        L_0x0055:
            if (r1 >= r4) goto L_0x0081
            r0 = r6[r1]
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0062
            int r3 = r3 + 1
            goto L_0x0050
        L_0x0062:
            int r1 = r1 + 1
            goto L_0x0055
        L_0x0065:
            if (r6 != 0) goto L_0x0081
        L_0x0067:
            byte[] r3 = r10.A01
            if (r3 == 0) goto L_0x007a
            byte[] r2 = r11.A01
            if (r2 == 0) goto L_0x007f
            int r1 = r3.length
            int r0 = r2.length
            if (r1 != r0) goto L_0x007f
            boolean r0 = java.util.Arrays.equals(r3, r2)
            if (r0 == 0) goto L_0x007f
            return r9
        L_0x007a:
            byte[] r0 = r11.A01
            if (r0 != 0) goto L_0x007f
            return r9
        L_0x007f:
            r9 = 0
            return r9
        L_0x0081:
            return r8
        L_0x0082:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29621ca.equals(java.lang.Object):boolean");
    }

    public static C29621ca A01(C29621ca r2, String str, String str2, AnonymousClass1MD[] r5) {
        r5[3] = new AnonymousClass1MD(str, str2);
        return new C29621ca(r2, "iq", r5);
    }

    public static void A05(String str, AbstractCollection abstractCollection, AnonymousClass1MD[] r3) {
        abstractCollection.add(new C29621ca(str, r3));
    }

    public static boolean A07(C29621ca r0, String str) {
        if (r0 == null || !r0.A00.equals(str)) {
            return false;
        }
        return true;
    }

    public static byte[] A08(C29621ca r3, int i) {
        byte[] bArr = r3.A01;
        if (bArr != null) {
            int length = bArr.length;
            if (length == i) {
                return bArr;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("failed require. node ");
            sb.append(r3);
            sb.append(" data length ");
            sb.append(length);
            sb.append(" != required length ");
            sb.append(i);
            throw new AnonymousClass1UI(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("failed require. node ");
        sb2.append(r3);
        sb2.append(" missing data");
        throw new AnonymousClass1UI(sb2.toString());
    }

    public AnonymousClass1MD A0H(String str) {
        int length;
        AnonymousClass1MD[] r4 = this.A03;
        if (r4 == null || (length = r4.length) <= 0) {
            return null;
        }
        int i = 0;
        do {
            AnonymousClass1MD r1 = r4[i];
            if (TextUtils.equals(str, r1.A02)) {
                return r1;
            }
            i++;
        } while (i < length);
        return null;
    }

    public C29621ca A0I() {
        C29621ca[] r1 = this.A02;
        if (r1 != null && r1.length != 0) {
            return r1[0];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("required first child missing for tag ");
        sb.append(this.A00);
        throw new AnonymousClass1UI(sb.toString());
    }

    public C29621ca A0J(int i) {
        C29621ca[] r1 = this.A02;
        if (r1 == null || r1.length <= i) {
            return null;
        }
        return r1[i];
    }

    public C29621ca A0K(String str) {
        C29621ca[] r5 = this.A02;
        if (r5 != null) {
            for (C29621ca r1 : r5) {
                if (TextUtils.equals(str, r1.A00)) {
                    return r1;
                }
            }
        }
        return null;
    }

    public String A0M() {
        byte[] bArr = this.A01;
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, C19620yd.A0A);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public List A0R(String str) {
        C29621ca[] r5 = this.A02;
        if (r5 == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (C29621ca r1 : r5) {
            if (TextUtils.equals(str, r1.A00)) {
                arrayList.add(r1);
            }
        }
        return arrayList;
    }

    public AnonymousClass1MD[] A0S() {
        AnonymousClass1MD[] r1 = this.A03;
        if (r1 == null || r1.length != 0) {
            return r1;
        }
        return null;
    }

    public int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = (31 + this.A00.hashCode()) * 31;
        byte[] bArr = this.A01;
        int i2 = 0;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        int i3 = (hashCode2 + hashCode) * 31;
        C29621ca[] r4 = this.A02;
        if (r4 == null) {
            i = 0;
        } else {
            i = 0;
            for (C29621ca r0 : r4) {
                if (r0 != null) {
                    i += r0.hashCode();
                }
            }
        }
        int i4 = (i3 + i) * 31;
        AnonymousClass1MD[] r3 = this.A03;
        if (r3 != null) {
            for (AnonymousClass1MD r02 : r3) {
                if (r02 != null) {
                    i2 += r02.hashCode();
                }
            }
        }
        return i4 + i2;
    }

    public String toString() {
        String str;
        boolean z;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        String str3 = this.A00;
        sb.append(str3);
        AnonymousClass1MD[] r6 = this.A03;
        if (r6 == null) {
            r6 = new AnonymousClass1MD[0];
        }
        for (AnonymousClass1MD r1 : r6) {
            sb.append(" ");
            sb.append(r1.A02);
            sb.append("='");
            sb.append(r1.A03);
            sb.append("'");
        }
        byte[] bArr = this.A01;
        if (bArr == null && this.A02 == null) {
            str = "/>";
        } else {
            str = ">";
            sb.append(str);
            C29621ca[] r2 = this.A02;
            if (r2 == null) {
                r2 = new C29621ca[0];
            }
            for (C29621ca r0 : r2) {
                if (r0 != null) {
                    sb.append(r0.toString());
                }
            }
            if (bArr != null) {
                try {
                    C19620yd.A0C.newDecoder().decode(ByteBuffer.wrap(bArr));
                    z = true;
                } catch (CharacterCodingException unused) {
                    z = false;
                }
                if (z) {
                    try {
                        str2 = new String(bArr, C19620yd.A0A);
                    } catch (UnsupportedEncodingException unused2) {
                        str2 = null;
                    }
                } else {
                    str2 = Base64.encodeToString(bArr, 2);
                }
                sb.append(str2);
            }
            sb.append("</");
            sb.append(str3);
        }
        sb.append(str);
        return sb.toString();
    }

    public C29621ca(String str, byte[] bArr, AnonymousClass1MD[] r5, C29621ca[] r6) {
        C17960vV.A07(str);
        this.A00 = str;
        this.A03 = r5;
        this.A02 = r6;
        this.A01 = bArr;
        if (r6 != null && bArr != null) {
            throw new IllegalArgumentException("node may not have both data and children");
        }
    }

    public static C29621ca A00(Jid jid, C29621ca r3, AnonymousClass1MD[] r4) {
        r4[3] = new AnonymousClass1MD(jid, "to");
        return new C29621ca(r3, "iq", r4);
    }

    public static Iterator A03(C29621ca r0, String str) {
        return r0.A0R(str).iterator();
    }

    public static void A04(C29621ca r2, String str) {
        String str2;
        if (!A07(r2, str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("failed requireTag: expected: ");
            sb.append(str);
            sb.append(", actual: ");
            if (r2 != null) {
                str2 = r2.A00;
            } else {
                str2 = "null";
            }
            sb.append(str2);
            throw new AnonymousClass1UI(sb.toString());
        }
    }

    public int A09(String str) {
        return A0B(A0P(str), str);
    }

    public int A0B(String str, String str2) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("attribute ");
            sb.append(str2);
            sb.append(" for tag ");
            sb.append(this.A00);
            sb.append(" is not integral: ");
            sb.append(str);
            throw new AnonymousClass1UI(sb.toString());
        }
    }

    public long A0C(String str) {
        return A0E(A0P(str), str);
    }

    public long A0E(String str, String str2) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("attribute ");
            sb.append(str2);
            sb.append(" for tag ");
            sb.append(this.A00);
            sb.append(" is not integral: ");
            sb.append(str);
            throw new AnonymousClass1UI(sb.toString());
        }
    }

    public Jid A0F(Class cls, String str) {
        Jid jid;
        AnonymousClass1MD A0H = A0H(str);
        if (!((A0H == null || (jid = A0H.A01) == null) && (jid = Jid.Companion.A02(A0Q(str, (String) null))) == null) && !jid.isProtocolCompliant()) {
            StringBuilder sb = new StringBuilder();
            sb.append("ProtocolTreeNode/getAttributeJid invalid jid, Jid: '");
            sb.append(jid);
            sb.append("' key: '");
            sb.append(str);
            sb.append("' tag: '");
            sb.append(this.A00);
            sb.append("'");
            Log.e(sb.toString());
        }
        if (cls == DeviceJid.class && C22971Dz.A0d(jid)) {
            jid = DeviceJid.Companion.A02(jid);
        }
        try {
            return (Jid) cls.cast(jid);
        } catch (ClassCastException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ProtocolTreeNode/getAttributeJid/failed to convert '");
            sb2.append(jid);
            sb2.append("' to ");
            sb2.append(cls.getName());
            Log.e(sb2.toString(), e);
            return null;
        }
    }

    public Jid A0G(Class cls, String str) {
        Jid A0F = A0F(cls, str);
        if (A0F != null) {
            return A0F;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("required attribute '");
        sb.append(str);
        sb.append("' missing for tag ");
        sb.append(this.A00);
        throw new AnonymousClass1UI(sb.toString());
    }

    public C29621ca A0L(String str) {
        C29621ca A0K = A0K(str);
        if (A0K != null) {
            return A0K;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("required child ");
        sb.append(str);
        sb.append(" missing for tag ");
        sb.append(this.A00);
        throw new AnonymousClass1UI(sb.toString());
    }

    public String A0N() {
        return this.A00;
    }

    public String A0Q(String str, String str2) {
        AnonymousClass1MD A0H = A0H(str);
        if (A0H != null) {
            return A0H.A03;
        }
        return str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C29621ca(C29621ca r4, String str, AnonymousClass1MD[] r6) {
        this(str, (byte[]) null, r6, r4 != null ? new C29621ca[]{r4} : null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C29621ca(java.lang.String r3, java.lang.String r4, X.AnonymousClass1MD[] r5) {
        /*
            r2 = this;
            r1 = 0
            if (r4 == 0) goto L_0x000b
            byte[] r0 = r4.getBytes()
        L_0x0007:
            r2.<init>(r3, r0, r5, r1)
            return
        L_0x000b:
            r0 = r1
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29621ca.<init>(java.lang.String, java.lang.String, X.1MD[]):void");
    }

    public C29621ca(String str, byte[] bArr, AnonymousClass1MD[] r4) {
        this(str, bArr, r4, (C29621ca[]) null);
    }

    public C29621ca(String str, AnonymousClass1MD[] r3, C29621ca[] r4) {
        this(str, (byte[]) null, r3, r4);
    }

    public C29621ca(String str, AnonymousClass1MD[] r3) {
        this(str, (byte[]) null, r3, (C29621ca[]) null);
    }
}
