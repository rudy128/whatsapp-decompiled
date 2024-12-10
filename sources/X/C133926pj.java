package X;

import android.util.Base64;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6pj  reason: invalid class name and case insensitive filesystem */
public class C133926pj {
    public int A00 = 0;
    public String A01;
    public List A02 = AnonymousClass000.A13();
    public C136406tl A03;
    public C128926gu A04;

    public void A00(String str) {
        String str2 = this.A01;
        if (str2 == null || str2.equalsIgnoreCase(CredentialProviderBaseController.TYPE_TAG)) {
            this.A03.A04.add(str);
        } else {
            this.A03.A00.put(str2, str);
        }
        this.A01 = null;
    }

    public void A01(List list) {
        C136406tl r6;
        String str;
        byte[] bArr;
        byte[] bArr2;
        C122926Sl r1;
        if (list == null || list.size() == 0) {
            C136406tl r12 = this.A03;
            r12.A06 = null;
            r12.A03.clear();
            str = "";
            this.A03.A03.add(str);
            r6 = this.A03;
        } else {
            String asString = this.A03.A00.getAsString("ENCODING");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                C136406tl r13 = this.A03;
                List list2 = r13.A03;
                if (asString != null) {
                    int i = 0;
                    if (asString.equals("BASE64") || asString.equals("B")) {
                        r13.A06 = Base64.decode(A0v.getBytes(), 0);
                        list2.add(A0v);
                    } else if (asString.equals("QUOTED-PRINTABLE")) {
                        String replaceAll = A0v.replaceAll("= ", " ").replaceAll("=\t", "\t");
                        StringBuilder A10 = AnonymousClass000.A10();
                        int length = replaceAll.length();
                        ArrayList A13 = AnonymousClass000.A13();
                        int i2 = 0;
                        while (i2 < length) {
                            char charAt = replaceAll.charAt(i2);
                            if (charAt == 10) {
                                C108955ca.A1U(A10, A13);
                                A10 = AnonymousClass000.A10();
                            } else if (charAt == 13) {
                                C108955ca.A1U(A10, A13);
                                A10 = AnonymousClass000.A10();
                                if (i2 < length - 1 && replaceAll.charAt(i2 + 1) == 10) {
                                    i2++;
                                }
                            } else {
                                A10.append(charAt);
                            }
                            i2++;
                        }
                        String obj = A10.toString();
                        if (obj.length() > 0) {
                            A13.add(obj);
                        }
                        String[] A1b = C17890vO.A1b(A13, 0);
                        StringBuilder A102 = AnonymousClass000.A10();
                        for (String str2 : A1b) {
                            if (str2.endsWith("=")) {
                                str2 = str2.substring(0, str2.length() - 1);
                            }
                            A102.append(str2);
                        }
                        try {
                            bArr2 = A102.toString().getBytes(DefaultCrypto.UTF_8);
                        } catch (UnsupportedEncodingException e) {
                            C17900vP.A0h("Failed to encode: charset=", DefaultCrypto.UTF_8, AnonymousClass000.A10(), e);
                            bArr2 = A102.toString().getBytes();
                        }
                        if (bArr2 == null) {
                            bArr = null;
                        } else {
                            try {
                                ByteArrayOutputStream A15 = C108945cZ.A15();
                                while (i < bArr2.length) {
                                    byte b = bArr2[i];
                                    if (b == 61) {
                                        int i3 = i + 1;
                                        byte b2 = bArr2[i3];
                                        int digit = Character.digit((char) b2, 16);
                                        if (digit != -1) {
                                            i = i3 + 1;
                                            byte b3 = bArr2[i];
                                            int digit2 = Character.digit((char) b3, 16);
                                            if (digit2 != -1) {
                                                A15.write((char) ((digit << 4) + digit2));
                                            } else {
                                                r1 = new C122926Sl(AnonymousClass001.A1I("Invalid URL encoding: not a valid digit (radix 16): ", AnonymousClass000.A10(), b3));
                                            }
                                        } else {
                                            r1 = new C122926Sl(AnonymousClass001.A1I("Invalid URL encoding: not a valid digit (radix 16): ", AnonymousClass000.A10(), b2));
                                        }
                                        throw r1;
                                    }
                                    A15.write(b);
                                    i++;
                                }
                                bArr = A15.toByteArray();
                            } catch (ArrayIndexOutOfBoundsException e2) {
                                throw new C122926Sl((Throwable) e2);
                            } catch (C122926Sl e3) {
                                Log.e("Failed to decode quoted-printable: ", e3);
                                A0v = "";
                            }
                        }
                        try {
                            A0v = new String(bArr, DefaultCrypto.UTF_8);
                        } catch (UnsupportedEncodingException e4) {
                            C17900vP.A0h("Failed to encode: charset=", DefaultCrypto.UTF_8, AnonymousClass000.A10(), e4);
                            A0v = new String(bArr);
                        }
                        list2.add(A0v);
                    }
                }
                if (!DefaultCrypto.UTF_8.equalsIgnoreCase(DefaultCrypto.UTF_8)) {
                    ByteBuffer encode = Charset.forName(DefaultCrypto.UTF_8).encode(A0v);
                    bArr = new byte[encode.remaining()];
                    encode.get(bArr);
                    A0v = new String(bArr, DefaultCrypto.UTF_8);
                }
                list2.add(A0v);
            }
            r6 = this.A03;
            List list3 = r6.A03;
            int size = list3.size();
            if (size > 1) {
                StringBuilder A103 = AnonymousClass000.A10();
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    A103.append(C17880vN.A0v(it2));
                    A103.append(";");
                }
                int length2 = A103.length();
                if (length2 <= 0 || A103.charAt(length2 - 1) != ';') {
                    str = A103.toString();
                } else {
                    str = A103.substring(0, length2 - 1);
                }
            } else if (size == 1) {
                str = C17880vN.A0w(list3, 0);
            } else {
                str = "";
            }
        }
        r6.A02 = str;
    }
}
