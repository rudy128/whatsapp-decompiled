package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class A96 {
    public static final A96 A00 = new Object();

    public static final AnonymousClass9DL A00(C29621ca r16, C62672rm r17) {
        C29621ca r5 = r16;
        C62672rm r4 = r17;
        if (!r4.A09(r5, "messages")) {
            return null;
        }
        String[] A1Y = AnonymousClass8BS.A1Y(1, 0);
        Long A0i = AnonymousClass8BU.A0i();
        Long A0j = AnonymousClass8BU.A0j();
        C29681ch r1 = (C29681ch) r4.A05(r5, C29681ch.class, A0i, A0j, (Object) null, A1Y, false);
        Long l = (Long) r4.A05(r5, Long.TYPE, C17890vO.A0L(), A0j, (Object) null, new String[]{"t"}, false);
        C62672rm r10 = r4;
        C29621ca r11 = r5;
        ArrayList A08 = r10.A08(r11, new C21287AhY(34), new String[]{"message"}, 0, 300);
        if (A08 == null) {
            return null;
        }
        return new AnonymousClass9DL(r1, r5, l, (List) A08);
    }

    public static final AnonymousClass9D6 A01(C29621ca r13, C62672rm r14) {
        C29621ca r4 = r13;
        C62672rm r3 = r14;
        if (r14.A09(r13, "error")) {
            String[] A1U = AnonymousClass8BS.A1U(1);
            Long A0i = AnonymousClass8BU.A0i();
            Long A0j = AnonymousClass8BU.A0j();
            String str = (String) r3.A05(r4, String.class, A0i, A0j, "internal-server-error", A1U, false);
            if (str != null) {
                Number number = (Number) r3.A05(r4, Long.TYPE, A0i, A0j, AnonymousClass8BV.A0i(), AnonymousClass8BS.A1S(1), false);
                if (number != null) {
                    return new AnonymousClass9D6(r4, str, 9, number.longValue());
                }
            }
        }
        return null;
    }

    public static final AnonymousClass9EJ A02(C29621ca r11, C62672rm r12) {
        C29621ca r4 = r11;
        C62672rm r3 = r12;
        if (r12.A09(r11, "message")) {
            if (r3.A05(r4, String.class, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), "media", AnonymousClass8BS.A1a(1, 0), false) != null) {
                return new AnonymousClass9EJ(r11);
            }
        }
        return null;
    }

    public static final AnonymousClass9EJ A03(C29621ca r11, C62672rm r12) {
        C29621ca r4 = r11;
        C62672rm r3 = r12;
        if (r12.A09(r11, "message")) {
            if (r3.A05(r4, String.class, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), "text", AnonymousClass8BS.A1a(1, 0), false) != null) {
                return new AnonymousClass9EJ(r11);
            }
        }
        return null;
    }

    public static final C178169Cb A04(C29621ca r11, C62672rm r12) {
        C29621ca r4 = r11;
        C62672rm r3 = r12;
        if (r12.A09(r11, "message")) {
            String str = (String) r3.A05(r4, String.class, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), "3", new String[]{"edit"}, false);
            if (str != null) {
                return new C178169Cb(r11, str);
            }
        }
        return null;
    }

    public static final C178169Cb A05(C29621ca r11, C62672rm r12) {
        C29621ca r4 = r11;
        C62672rm r3 = r12;
        if (r12.A09(r11, "message")) {
            String str = (String) r3.A05(r4, String.class, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), "8", new String[]{"edit"}, false);
            if (str != null) {
                return new C178169Cb(r11, str);
            }
        }
        return null;
    }

    public static final C178169Cb A06(C29621ca r11, C62672rm r12) {
        C29621ca r4 = r11;
        C62672rm r3 = r12;
        if (r12.A09(r11, "message")) {
            String[] A1Z = C17880vN.A1Z();
            A1Z[0] = "meta";
            A1Z[1] = "is_wamo_sub";
            String str = (String) r3.A05(r4, String.class, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), "true", A1Z, false);
            if (str != null) {
                return new C178169Cb(r11, str);
            }
        }
        return null;
    }

    public static final AnonymousClass9DB A07(C29621ca r18, C29621ca r19, C62672rm r20) {
        C29621ca r13 = r18;
        C62672rm r4 = r20;
        if (!r4.A09(r13, "iq")) {
            return null;
        }
        String[] A1Z = AnonymousClass8BS.A1Z(1, 0);
        Class<Jid> cls = Jid.class;
        String[] strArr = new String[1];
        Long A0Z = AnonymousClass8BW.A0Z("to", strArr, 0);
        Long A0j = AnonymousClass8BU.A0j();
        C29621ca r5 = r19;
        Object A05 = r4.A05(r5, cls, A0Z, A0j, (Object) null, strArr, false);
        if (A05 == null) {
            return null;
        }
        C62672rm r12 = r4;
        Long l = A0Z;
        Long l2 = A0j;
        Jid jid = (Jid) r12.A05(r13, cls, l, l2, A05, A1Z, true);
        if (jid == null) {
            return null;
        }
        String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Class<String> cls2 = String.class;
        Object A052 = r4.A05(r5, cls2, A0Z, A0j, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
        if (A052 == null) {
            return null;
        }
        Class<String> cls3 = cls2;
        if (r12.A05(r13, cls3, l, l2, A052, strArr2, true) == null || r12.A05(r13, cls3, l, l2, "error", AnonymousClass8BS.A1a(1, 0), false) == null) {
            return null;
        }
        return new AnonymousClass9DB(jid, r13);
    }

    public static final AnonymousClass9DB A08(C29621ca r18, C29621ca r19, C62672rm r20) {
        C29621ca r13 = r18;
        C62672rm r4 = r20;
        if (!r4.A09(r13, "iq")) {
            return null;
        }
        String[] A1Z = AnonymousClass8BS.A1Z(1, 0);
        Class<Jid> cls = Jid.class;
        String[] strArr = new String[1];
        Long A0Z = AnonymousClass8BW.A0Z("to", strArr, 0);
        Long A0j = AnonymousClass8BU.A0j();
        C29621ca r5 = r19;
        Object A05 = r4.A05(r5, cls, A0Z, A0j, (Object) null, strArr, false);
        if (A05 == null) {
            return null;
        }
        C62672rm r12 = r4;
        Long l = A0Z;
        Long l2 = A0j;
        Jid jid = (Jid) r12.A05(r13, cls, l, l2, A05, A1Z, true);
        if (jid == null) {
            return null;
        }
        String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Class<String> cls2 = String.class;
        Object A052 = r4.A05(r5, cls2, A0Z, A0j, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
        if (A052 == null) {
            return null;
        }
        Class<String> cls3 = cls2;
        if (r12.A05(r13, cls3, l, l2, A052, strArr2, true) == null || r12.A05(r13, cls3, l, l2, "result", AnonymousClass8BS.A1a(1, 0), false) == null) {
            return null;
        }
        return new AnonymousClass9DB(jid, r13);
    }

    public static final AnonymousClass9DM A09(C29621ca r7, C62672rm r8) {
        C29621ca r3 = r7;
        C62672rm r2 = r8;
        if (!r8.A09(r7, "plaintext")) {
            return null;
        }
        Class<byte[]> cls = byte[].class;
        byte[] bArr = (byte[]) r2.A04(r3, cls, C108975cc.A0X(), 1048576L, (Object) null, AnonymousClass8BS.A1V(1));
        if (bArr == null) {
            return null;
        }
        return new AnonymousClass9DM(r3, bArr, 6);
    }

    public static final AnonymousClass9EK A0A(C29621ca r11, C62672rm r12) {
        C29621ca r4 = r11;
        C62672rm r3 = r12;
        if (r12.A09(r11, "message")) {
            String[] A1a = AnonymousClass8BS.A1a(1, 0);
            Class<String> cls = String.class;
            Long A0i = AnonymousClass8BU.A0i();
            Long A0j = AnonymousClass8BU.A0j();
            if (r3.A05(r4, cls, A0i, A0j, "poll", A1a, false) != null) {
                String[] A1Z = C17880vN.A1Z();
                A1Z[0] = "meta";
                A1Z[1] = "polltype";
                if (r3.A05(r4, cls, A0i, A0j, "creation", A1Z, false) != null) {
                    return new AnonymousClass9EK(r11);
                }
            }
        }
        return null;
    }

    public static final C24159BwR A0B(C29621ca r16, C62672rm r17) {
        AnonymousClass9EJ A02;
        String A0u;
        StringBuilder A10;
        C29621ca r14 = r16;
        C62672rm r9 = r17;
        if (r9.A09(r14, "message")) {
            String[] strArr = new String[16];
            strArr[0] = "audio";
            strArr[1] = "avatar_sticker";
            strArr[2] = "cataloglink";
            strArr[3] = "document";
            strArr[4] = "genai_sticker";
            strArr[5] = "gif";
            strArr[6] = "image";
            strArr[7] = "productlink";
            strArr[8] = "ptt";
            strArr[9] = "sticker";
            strArr[10] = "sticker_pack";
            strArr[11] = "url";
            strArr[12] = "user_created_sticker";
            strArr[13] = "vcard";
            strArr[14] = "video";
            if (r9.A07(r14, C18070vi.A0O("1p_sticker", strArr, 15), new String[]{"plaintext", "mediatype"}) != null) {
                String[] strArr2 = new String[1];
                C29621ca A0Z = AnonymousClass8BT.A0Z(r14, "plaintext", strArr2);
                if (A0Z == null) {
                    A10 = AnonymousClass000.A10();
                    AnonymousClass8BY.A12(r14, A10, strArr2, 0);
                } else {
                    AnonymousClass9DM A09 = A09(A0Z, r9);
                    if (!(A09 == null || (A02 = A02(r14, r9)) == null)) {
                        C178169Cb A06 = A06(r14, r9);
                        String str = new String[]{"plaintext"}[0];
                        List A0R = r14.A0R(str);
                        ArrayList A0t = C108965cb.A0t(A0R);
                        Iterator it = A0R.iterator();
                        while (it.hasNext()) {
                            AnonymousClass8BX.A1M(A0t, it);
                        }
                        if (AnonymousClass8BR.A06(A0t) < 1) {
                            A10 = AnonymousClass000.A10();
                            AnonymousClass8BY.A1K(str, A10, A0t);
                            A10.append(1);
                            A10.append('.');
                        } else if (AnonymousClass8BR.A06(A0t) > 1) {
                            StringBuilder A102 = AnonymousClass000.A10();
                            AnonymousClass8BY.A1J(str, A102, A0t);
                            A0u = AnonymousClass8BV.A0u(A102, '.', 1);
                            r9.A00 = A0u;
                        } else {
                            C29621ca A0m = AnonymousClass8BR.A0m(A0t, 0);
                            if (A0m != null) {
                                return new C24159BwR(A0m, r14, A02, A06, A09);
                            }
                        }
                    }
                }
                A0u = A10.toString();
                r9.A00 = A0u;
            }
        }
        return null;
    }

    public static final C24158BwQ A0C(C29621ca r5, C62672rm r6) {
        AnonymousClass9EJ A03;
        if (r6.A09(r5, "message")) {
            String[] strArr = new String[1];
            C29621ca A0Z = AnonymousClass8BT.A0Z(r5, "plaintext", strArr);
            if (A0Z == null) {
                AnonymousClass8BY.A11(r5, r6, strArr, 0);
            } else {
                AnonymousClass9DM A09 = A09(A0Z, r6);
                if (!(A09 == null || (A03 = A03(r5, r6)) == null)) {
                    return new C24158BwQ(r5, A03, A06(r5, r6), A09);
                }
            }
        }
        return null;
    }
}
