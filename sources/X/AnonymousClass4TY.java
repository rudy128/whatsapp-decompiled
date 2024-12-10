package X;

import java.util.Arrays;

/* renamed from: X.4TY  reason: invalid class name */
public final class AnonymousClass4TY {
    public final String A00;
    public final byte[] A01;

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (C18070vi.A18(cls2, cls)) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.ctwa.xmpp.CTWAContentResponse.CTWAThumbnail");
                AnonymousClass4TY r5 = (AnonymousClass4TY) obj;
                if (C18070vi.A18(this.A00, r5.A00)) {
                    byte[] bArr = this.A01;
                    byte[] bArr2 = r5.A01;
                    if (bArr != null) {
                        if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                            return false;
                        }
                    } else if (bArr2 != null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass4TY(String str, byte[] bArr) {
        this.A00 = str;
        this.A01 = bArr;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        int i = 0;
        A1b[0] = this.A00;
        byte[] bArr = this.A01;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        }
        AnonymousClass000.A1M(A1b, i);
        return Arrays.hashCode(A1b);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CTWAThumbnail(url=");
        A10.append(this.A00);
        A10.append(", data=");
        return C17900vP.A0B(Arrays.toString(this.A01), A10);
    }
}
