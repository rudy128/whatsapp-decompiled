package X;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: X.CjQ  reason: case insensitive filesystem */
public class C25638CjQ {
    public final C24940CQq[] A00;

    public C25638CjQ(String str) {
        this.A00 = new C24940CQq[]{new C24940CQq(str, this), new C24940CQq(AnonymousClass001.A1H("X509 ", str, AnonymousClass000.A10()), this), new C24940CQq("PKCS7", this)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r0 > 0) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.io.InputStream r5) {
        /*
            java.lang.StringBuffer r4 = X.BE6.A0s()
        L_0x0004:
            int r3 = r5.read()
            r2 = 10
            r1 = 13
            if (r3 == r1) goto L_0x001f
            if (r3 == r2) goto L_0x001f
            if (r3 < 0) goto L_0x0017
            char r0 = (char) r3
            r4.append(r0)
            goto L_0x0004
        L_0x0017:
            int r0 = r4.length()
            if (r0 != 0) goto L_0x0037
            r0 = 0
            return r0
        L_0x001f:
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0004
            if (r3 != r1) goto L_0x0037
            r1 = 1
            r5.mark(r1)
            int r0 = r5.read()
            if (r0 != r2) goto L_0x003c
            r5.mark(r1)
        L_0x0034:
            r5.reset()
        L_0x0037:
            java.lang.String r0 = r4.toString()
            return r0
        L_0x003c:
            if (r0 <= 0) goto L_0x0037
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25638CjQ.A00(java.io.InputStream):java.lang.String");
    }

    public C28339Dxl A01(InputStream inputStream) {
        String A002;
        C24940CQq[] cQqArr;
        int length;
        C24940CQq cQq;
        String A003;
        StringBuffer A0s = BE6.A0s();
        loop0:
        while (true) {
            A002 = A00(inputStream);
            if (A002 != null) {
                int i = 0;
                while (true) {
                    cQqArr = this.A00;
                    length = cQqArr.length;
                    if (i != length) {
                        cQq = cQqArr[i];
                        if (!A002.startsWith(cQq.A01) && !A002.startsWith(cQq.A00)) {
                            i++;
                        }
                    }
                }
            } else {
                throw C17880vN.A0f("malformed PEM data: no header found");
            }
        }
        if (!A002.startsWith(cQq.A01)) {
            throw C17880vN.A0f("malformed PEM data: found footer where header was expected");
        }
        loop2:
        while (true) {
            A003 = A00(inputStream);
            if (A003 != null) {
                int i2 = 0;
                while (i2 != length) {
                    C24940CQq cQq2 = cQqArr[i2];
                    if (!A003.startsWith(cQq2.A01) && !A003.startsWith(cQq2.A00)) {
                        i2++;
                    }
                }
                A0s.append(A003);
            } else {
                throw C17880vN.A0f("malformed PEM data: no footer found");
            }
        }
        if (!A003.startsWith(cQq.A00)) {
            throw C17880vN.A0f("malformed PEM data: header/footer mismatch");
        } else if (A0s.length() == 0) {
            return null;
        } else {
            try {
                String obj = A0s.toString();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((obj.length() / 4) * 3);
                C197429wg.A00.BI5(byteArrayOutputStream, obj);
                return C28339Dxl.A05(byteArrayOutputStream.toByteArray());
            } catch (Exception e) {
                throw new C180099Lc(C17900vP.A0C("unable to decode base64 string: ", AnonymousClass000.A10(), e), e);
            } catch (Exception unused) {
                throw C17880vN.A0f("malformed PEM data encountered");
            }
        }
    }
}
