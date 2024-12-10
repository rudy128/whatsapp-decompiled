package X;

import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2ty  reason: invalid class name and case insensitive filesystem */
public abstract class C63952ty {
    public static final AnonymousClass1MD[] A00 = new AnonymousClass1MD[0];

    public static C29621ca A02(DeviceJid deviceJid, DeviceJid deviceJid2, String str, String str2, String str3) {
        C29621ca[] r3 = new C29621ca[1];
        AnonymousClass1MD[] r2 = new AnonymousClass1MD[2];
        int A1W = C17890vO.A1W("call-id", str2, r2);
        C17880vN.A1I(deviceJid2, "call-creator", r2, 1);
        r3[A1W] = new C29621ca(str3, r2);
        AnonymousClass1MD[] r22 = new AnonymousClass1MD[2];
        C17880vN.A1I(deviceJid, "to", r22, A1W);
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r22, 1);
        return new C29621ca("receipt", r22, r3);
    }

    public static C29621ca A03(DeviceJid deviceJid, DeviceJid deviceJid2, String str, String str2, String str3, byte[] bArr, byte b) {
        int i = 2;
        if (bArr == null) {
            i = 1;
        }
        C29621ca[] r3 = new C29621ca[i];
        int i2 = 3;
        AnonymousClass1MD[] r7 = new AnonymousClass1MD[3];
        int A1W = C17890vO.A1W("call-id", str2, r7);
        C17880vN.A1I(deviceJid2, "call-creator", r7, 1);
        C17880vN.A1Q("count", String.valueOf(b), r7, 2);
        r3[A1W] = new C29621ca("enc_rekey", r7);
        if (bArr != null) {
            C29621ca.A06("registration", bArr, r3, 1);
        }
        if (str3 == null) {
            i2 = 2;
        }
        AnonymousClass1MD[] r2 = new AnonymousClass1MD[i2];
        C17880vN.A1I(deviceJid, "to", r2, A1W);
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r2, 1);
        if (str3 != null) {
            C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3, r2, 2);
        }
        return new C29621ca("receipt", r2, r3);
    }

    public static C29621ca[] A07(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        C29621ca[] r5 = new C29621ca[length];
        for (int i = 0; i < length; i++) {
            AnonymousClass1MD[] r2 = new AnonymousClass1MD[1];
            C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, strArr[i], r2, 0);
            r5[i] = new C29621ca("item", r2);
        }
        return new C29621ca[]{new C29621ca("list", (AnonymousClass1MD[]) null, r5)};
    }

    public static C29621ca A01(AnonymousClass1BI r4, DeviceJid deviceJid, UserJid userJid, AnonymousClass205 r7, String str, String[] strArr, int i) {
        Pair A05 = C20133A8t.A05(deviceJid, r7.A00, r4);
        C29621ca[] A07 = A07(strArr);
        String str2 = r7.A01;
        Jid jid = (Jid) A05.second;
        ArrayList A13 = AnonymousClass000.A13();
        C17890vO.A0n((Jid) A05.first, "to", A13);
        C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2, A13);
        if (str != null) {
            C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str, A13);
        }
        if (jid != null) {
            C17890vO.A0n(jid, "participant", A13);
        }
        if (userJid != null) {
            C17890vO.A0n(userJid, "recipient", A13);
        }
        if (i == 2) {
            C17890vO.A11("privacy_token", "false", A13);
        }
        return new C29621ca("receipt", (AnonymousClass1MD[]) A13.toArray(A00), A07);
    }

    public static C29621ca A04(C56222h7 r20) {
        C56222h7 r6 = r20;
        Jid jid = r6.A05;
        String str = r6.A0B;
        Jid jid2 = r6.A06;
        UserJid userJid = r6.A07;
        int i = r6.A01;
        long j = r6.A04;
        byte[] bArr = r6.A0F;
        byte[] bArr2 = r6.A0D;
        byte b = r6.A00;
        C54492eE r1 = r6.A09;
        C54492eE r14 = r6.A08;
        byte[] bArr3 = r6.A0C;
        String str2 = r6.A0A;
        int i2 = r6.A02;
        byte[] bArr4 = r6.A0E;
        Jid jid3 = jid2;
        if (!C22971Dz.A0O(jid2)) {
            jid3 = jid;
            jid = jid2;
        }
        ArrayList A13 = AnonymousClass000.A13();
        C17890vO.A0n(jid3, "to", A13);
        C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, A13);
        C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "retry", A13);
        if (jid != null) {
            C17890vO.A0n(jid, "participant", A13);
        }
        if (userJid != null) {
            C17890vO.A0n(userJid, "recipient", A13);
        }
        if (str2 != null) {
            C17890vO.A11("category", str2, A13);
        }
        AnonymousClass1MD[] r13 = A00;
        AnonymousClass1MD[] r3 = (AnonymousClass1MD[]) A13.toArray(r13);
        ArrayList A132 = AnonymousClass000.A13();
        ArrayList A133 = AnonymousClass000.A13();
        C17890vO.A11("v", "1", A133);
        C17890vO.A11("count", String.valueOf(i), A133);
        C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, A133);
        C17890vO.A11("t", String.valueOf(C17880vN.A04(j)), A133);
        A133.add(new AnonymousClass1MD("error", i2));
        C29621ca.A05("retry", A132, (AnonymousClass1MD[]) A133.toArray(r13));
        A132.add(new C29621ca("registration", bArr, (AnonymousClass1MD[]) null));
        if (!(bArr2 == null || r1 == null || r14 == null)) {
            C29621ca[] r15 = new C29621ca[3];
            C29621ca.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r1.A01, r15, 0);
            r15[1] = new C29621ca("value", r1.A00, (AnonymousClass1MD[]) null);
            r15[2] = new C29621ca(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, r1.A02, (AnonymousClass1MD[]) null);
            C29621ca r10 = new C29621ca("skey", (AnonymousClass1MD[]) null, r15);
            C29621ca[] r12 = new C29621ca[2];
            C29621ca.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r14.A01, r12, 0);
            C29621ca.A06("value", r14.A00, r12, 1);
            C29621ca r8 = new C29621ca("key", (AnonymousClass1MD[]) null, r12);
            ArrayList A134 = AnonymousClass000.A13();
            A134.add(new C29621ca("identity", bArr2, (AnonymousClass1MD[]) null));
            A134.add(new C29621ca(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, new byte[]{b}, (AnonymousClass1MD[]) null));
            A134.add(r8);
            A134.add(r10);
            if (bArr3 != null) {
                A134.add(new C29621ca("device-identity", bArr3, (AnonymousClass1MD[]) null));
            }
            A132.add(new C29621ca("keys", (AnonymousClass1MD[]) null, C17890vO.A1Y(A134, 0)));
            if (bArr4 != null) {
                A132.add(new C29621ca("padding", bArr4, (AnonymousClass1MD[]) null));
            }
        }
        return new C29621ca("receipt", r3, C17890vO.A1Y(A132, 0));
    }

    public static C29621ca A05(AnonymousClass206 r7, int i) {
        String str;
        UserJid userJid;
        boolean z = r7.A19;
        if (z) {
            str = "sender";
        } else if (r7 instanceof AnonymousClass226) {
            str = ((AnonymousClass226) r7).BUl();
        } else {
            str = null;
        }
        AnonymousClass205 r5 = r7.A0v;
        AnonymousClass1BI A0H = r7.A0H();
        if (z) {
            AnonymousClass1BI r1 = r5.A00;
            if (!(r1 instanceof AnonymousClass1E9)) {
                userJid = C22941Dw.A00(r1);
                return A01(A0H, r7.A13, userJid, r5, str, (String[]) null, i);
            }
        }
        userJid = null;
        return A01(A0H, r7.A13, userJid, r5, str, (String[]) null, i);
    }

    public static C29621ca A06(C29621ca r7, C60132nR r8) {
        String str;
        Jid jid = r8.A02;
        String str2 = r8.A06;
        if (!"receipt".equals(str2) || !"delivery".equals(r8.A09)) {
            str = r8.A09;
        } else {
            str = null;
        }
        ArrayList A13 = AnonymousClass000.A13();
        String str3 = r8.A08;
        if (str3 != null) {
            C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3, A13);
        } else {
            C17960vV.A0F(false, "received stanza with null id");
        }
        if (jid != null) {
            C17890vO.A0n(jid, "to", A13);
        } else {
            Boolean bool = C17960vV.A01;
        }
        if (str2 != null) {
            C17890vO.A11("class", str2, A13);
        } else {
            C17960vV.A0F(false, "received stanza with null class");
        }
        if (str != null) {
            C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str, A13);
        }
        Jid jid2 = r8.A01;
        if (jid2 != null) {
            C17890vO.A0n(jid2, "participant", A13);
        }
        UserJid userJid = r8.A03;
        if (userJid != null) {
            C17890vO.A0n(userJid, "recipient", A13);
        }
        String str4 = r8.A07;
        if (!TextUtils.isEmpty(str4) && !"0".equals(str4)) {
            C17890vO.A11("edit", str4, A13);
        }
        List list = r8.A0A;
        if (list != null) {
            A13.addAll(list);
        }
        return new C29621ca("ack", (AnonymousClass1MD[]) A13.toArray(new AnonymousClass1MD[0]), r7 == null ? null : new C29621ca[]{r7});
    }

    public static C29621ca A00(AnonymousClass1BI r9, AnonymousClass1BI r10, Integer num, String str, String str2, String str3, String str4) {
        boolean A0O = C22971Dz.A0O(r10);
        AnonymousClass1BI r8 = r9;
        if (A0O) {
            r8 = r10;
        }
        C17960vV.A07(r8);
        if (!A0O) {
            r9 = r10;
        }
        ArrayList A13 = AnonymousClass000.A13();
        C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3, A13);
        if (num != null) {
            C17890vO.A11("reason", String.valueOf(num), A13);
        }
        if (str2 != null) {
            C17890vO.A11("sub-type", str2, A13);
        }
        ArrayList A132 = AnonymousClass000.A13();
        AnonymousClass1MD[] r6 = A00;
        C29621ca r2 = new C29621ca("error", (AnonymousClass1MD[]) A13.toArray(r6));
        ArrayList A133 = AnonymousClass000.A13();
        C17890vO.A0n(r8, "to", A133);
        C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, A133);
        C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "error", A133);
        if (r9 != null) {
            C17890vO.A0n(r9, "participant", A133);
        }
        AnonymousClass1MD[] r3 = (AnonymousClass1MD[]) A133.toArray(r6);
        A132.add(r2);
        if (str4 != null) {
            AnonymousClass1MD[] r1 = new AnonymousClass1MD[1];
            C17880vN.A1Q("reason", str4, r1, 0);
            C29621ca.A05("biz", A132, r1);
        }
        return new C29621ca("receipt", r3, C17890vO.A1Y(A132, 0));
    }
}
