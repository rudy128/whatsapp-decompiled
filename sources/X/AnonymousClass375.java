package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.375  reason: invalid class name */
public class AnonymousClass375 implements AnonymousClass1O5 {
    public final AnonymousClass1OZ A00;
    public final Map A01;
    public final AnonymousClass190 A02;
    public final C53172c6 A03;

    public void BrD(String str) {
        C53172c6 r1 = this.A03;
        Log.w("FetchPrekeyForMissingDeviceManager/requestPrekeyForMissingDevice delivery failure");
        r1.A01.BrF(AnonymousClass000.A0h());
    }

    public AnonymousClass375(AnonymousClass190 r1, C53172c6 r2, AnonymousClass1OZ r3, Map map) {
        this.A02 = r1;
        this.A00 = r3;
        this.A01 = map;
        this.A03 = r2;
    }

    public void Bt9(C29621ca r6, String str) {
        Pair A012 = C60482o6.A01(r6);
        C53172c6 r4 = this.A03;
        if (A012 != null) {
            int A0M = AnonymousClass000.A0M(A012.first);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("FetchPrekeyForMissingDeviceManager/requestPrekeyForMissingDevice error=");
            A10.append(A0M);
            C17900vP.A0g("; text=", (String) A012.second, A10);
            r4.A01.BrF(AnonymousClass000.A0h());
            return;
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("FetchPrekeyForMissingDeviceManager/requestPrekeyForMissingDevice error=");
        A102.append(0);
        C17900vP.A0g("; text=", (String) null, A102);
        r4.A01.BrF(AnonymousClass000.A0h());
    }

    public void C7Z(C29621ca r28, String str) {
        C29621ca[] r12;
        byte b;
        C54492eE r0;
        HashMap A11 = C17880vN.A11();
        ArrayList A13 = AnonymousClass000.A13();
        C29621ca A0K = r28.A0K("list");
        if (!(A0K == null || (r12 = A0K.A02) == null)) {
            for (C29621ca r3 : r12) {
                UserJid userJid = (UserJid) r3.A0F(UserJid.class, "jid");
                if (userJid != null) {
                    C29621ca A0K2 = r3.A0K("error");
                    if (A0K2 != null) {
                        C17890vO.A0z(userJid, A11, A0K2.A0B(A0K2.A0P("code"), "code"));
                    } else {
                        C29621ca[] r9 = r3.A02;
                        if (r9 != null) {
                            Arrays.sort(r9, new C21486Akr(19));
                            for (C29621ca r7 : r9) {
                                byte[] bArr = null;
                                try {
                                    DeviceJid A032 = DeviceJid.Companion.A03(userJid, r7.A0B(r7.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_ID), PublicKeyCredentialControllerUtility.JSON_KEY_ID));
                                    C29621ca A0L = r7.A0L("identity");
                                    C29621ca A0K3 = r7.A0K("device-identity");
                                    C29621ca A0L2 = r7.A0L("registration");
                                    C29621ca A0K4 = r7.A0K(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                                    if (A0K4 == null) {
                                        b = 5;
                                    } else {
                                        byte[] bArr2 = A0K4.A01;
                                        if (bArr2 == null || bArr2.length != 1) {
                                            throw AnonymousClass1UI.A01("type node should contain exactly 1 byte");
                                        }
                                        b = bArr2[0];
                                    }
                                    C29621ca A0K5 = r7.A0K("key");
                                    if (A0K5 != null) {
                                        r0 = new C54492eE(A0K5.A0L(PublicKeyCredentialControllerUtility.JSON_KEY_ID).A01, A0K5.A0L("value").A01, (byte[]) null);
                                    } else {
                                        r0 = null;
                                    }
                                    C29621ca A0L3 = r7.A0L("skey");
                                    C29621ca A0L4 = A0L3.A0L(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                    C29621ca A0L5 = A0L3.A0L("value");
                                    C29621ca A0L6 = A0L3.A0L(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
                                    byte[] bArr3 = A0L.A01;
                                    byte[] bArr4 = A0L2.A01;
                                    if (A0K3 != null) {
                                        bArr = A0K3.A01;
                                    }
                                    A13.add(new C55852gT(A032, r0, new C54492eE(A0L4.A01, A0L5.A01, A0L6.A01), bArr3, bArr4, bArr, b));
                                } catch (AnonymousClass11T unused) {
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        C53172c6 r4 = this.A03;
        A13.size();
        if (!A13.isEmpty()) {
            C55912gZ r1 = r4.A00;
            if (r1.A02.A0Y()) {
                r1.A05.CGF(new C70773Cl(r4, A13, r4.A01, 16));
            } else {
                ((C25581Ot) r1.A07.get()).A02(new C70773Cl(r4, A13, r4.A01, 17));
            }
        } else {
            r4.A01.BrF(AnonymousClass000.A0i());
        }
        Iterator A0i = C17890vO.A0i(A11);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("FetchPrekeyForMissingDeviceManager/onSuccess error jid=");
            A10.append(A16.getKey());
            A10.append("; code=");
            A10.append(A16.getValue());
            C17890vO.A0w(A10);
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
