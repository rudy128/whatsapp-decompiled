package X;

import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AhM  reason: case insensitive filesystem */
public final class C21275AhM implements C22470B9c {
    public static final C21275AhM A00 = new C21275AhM();

    public final Object BCF(C29621ca r24, C62672rm r25) {
        C29621ca r13 = r24;
        C62672rm r12 = r25;
        int A17 = C18070vi.A17(r13, r12);
        if (!r12.A09(r13, "config")) {
            return null;
        }
        String[] strArr = new String[4];
        strArr[0] = "apple";
        strArr[A17] = "apple_dev";
        strArr[2] = "smbi";
        List A0O = C18070vi.A0O("smbi_dev", strArr, 3);
        String[] strArr2 = new String[A17];
        strArr2[0] = "platform";
        if (r12.A07(r13, A0O, strArr2) == null) {
            return null;
        }
        String[] strArr3 = new String[2];
        strArr3[0] = "0";
        List A0O2 = C18070vi.A0O("1", strArr3, A17);
        String[] strArr4 = new String[A17];
        strArr4[0] = "preview";
        if (r12.A07(r13, A0O2, strArr4) == null) {
            return null;
        }
        List A0o = AnonymousClass8BX.A0o("0", "1", 2, A17);
        String[] strArr5 = new String[A17];
        strArr5[0] = "background_location";
        r12.A07(r13, A0o, strArr5);
        List A0O3 = C18070vi.A0O("2", C17880vN.A1b("0", "1", 3, A17), 2);
        String[] strArr6 = new String[A17];
        strArr6[0] = "nse_ver";
        r12.A07(r13, A0O3, strArr6);
        List A0o2 = AnonymousClass8BX.A0o("0", "1", 2, A17);
        String[] strArr7 = new String[A17];
        strArr7[0] = "nse_call";
        r12.A07(r13, A0o2, strArr7);
        List A0o3 = AnonymousClass8BX.A0o("0", "1", 2, A17);
        String[] strArr8 = new String[A17];
        strArr8[0] = "nse_read";
        r12.A07(r13, A0o3, strArr8);
        List A0o4 = AnonymousClass8BX.A0o("0", "1", 2, A17);
        String[] strArr9 = new String[A17];
        strArr9[0] = "nse_retry";
        r12.A07(r13, A0o4, strArr9);
        String[] strArr10 = new String[4];
        strArr10[0] = "false";
        strArr10[A17] = "true";
        List A0N = C18070vi.A0N("0", "1", strArr10, 2, 3);
        String[] strArr11 = new String[A17];
        strArr11[0] = "reg_push";
        r12.A07(r13, A0N, strArr11);
        String[] strArr12 = new String[3];
        strArr12[0] = "0";
        List A0N2 = C18070vi.A0N("1", "2", strArr12, A17, 2);
        String[] strArr13 = new String[A17];
        strArr13[0] = "voip_payload_type";
        if (r12.A07(r13, A0N2, strArr13) == null) {
            return null;
        }
        String[] A1W = AnonymousClass8BS.A1W(A17, 0);
        Class<String> cls = String.class;
        Long A0X = C108975cc.A0X();
        Long A0k = AnonymousClass8BV.A0k();
        r12.A05(r13, cls, A0X, A0k, (Object) null, A1W, false);
        String[] strArr14 = new String[A17];
        strArr14[0] = "voip";
        r12.A05(r13, cls, A0X, A0k, (Object) null, strArr14, false);
        String[] strArr15 = new String[A17];
        strArr15[0] = CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID;
        Long A0c = AnonymousClass8BV.A0c();
        if (r12.A05(r13, cls, A0X, A0c, (Object) null, strArr15, false) == null) {
            return null;
        }
        String[] strArr16 = new String[A17];
        strArr16[0] = "groups";
        if (r12.A05(r13, cls, A0X, A0c, (Object) null, strArr16, false) == null) {
            return null;
        }
        String[] strArr17 = new String[A17];
        strArr17[0] = "call";
        if (r12.A05(r13, cls, A0X, A0c, (Object) null, strArr17, false) == null) {
            return null;
        }
        String[] strArr18 = new String[A17];
        strArr18[0] = "lg";
        Long A0b = AnonymousClass8BV.A0b();
        if (r12.A05(r13, cls, A0X, A0b, (Object) null, strArr18, false) == null) {
            return null;
        }
        String[] strArr19 = new String[A17];
        strArr19[0] = "lc";
        if (r12.A05(r13, cls, A0X, A0b, (Object) null, strArr19, false) == null) {
            return null;
        }
        String[] strArr20 = new String[A17];
        strArr20[0] = "pkey";
        r12.A05(r13, cls, A0X, 64L, (Object) null, strArr20, false);
        String[] strArr21 = new String[A17];
        strArr21[0] = "app_mute";
        Class cls2 = Long.TYPE;
        Long A0L = C17890vO.A0L();
        Long A0j = AnonymousClass8BU.A0j();
        r12.A05(r13, cls2, A0L, A0j, (Object) null, strArr21, false);
        String[] strArr22 = new String[A17];
        r12.A05(r13, cls, AnonymousClass8BW.A0Z("version", strArr22, 0), A0j, "2", strArr22, false);
        String[] strArr23 = new String[A17];
        strArr23[0] = "item";
        ArrayList A0k2 = AnonymousClass8BX.A0k(r13, r12, new C21288AhZ(41), strArr23);
        if (A0k2 != null) {
            return new AnonymousClass9EQ(r13, A0k2);
        }
        return null;
    }
}
