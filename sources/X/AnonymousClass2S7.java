package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.profile.SetAboutInfo;
import com.whatsapp.util.Log;

/* renamed from: X.2S7  reason: invalid class name */
public abstract class AnonymousClass2S7 {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C29621ca r7) {
        /*
            r6 = this;
            java.lang.String r0 = "error"
            java.util.List r0 = r7.A0R(r0)
            X.C18070vi.A0X(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x000d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00e2
            X.1ca r2 = X.C17880vN.A0a(r5)
            java.lang.String r0 = "code"
            r3 = 0
            java.lang.String r1 = r2.A0Q(r0, r3)
            java.lang.String r0 = "text"
            r2.A0Q(r0, r3)
            if (r1 == 0) goto L_0x000d
            int r4 = java.lang.Integer.parseInt(r1)
            r2 = r6
            boolean r0 = r6 instanceof X.AnonymousClass2M6
            if (r0 == 0) goto L_0x0037
            X.2M6 r2 = (X.AnonymousClass2M6) r2
            X.B9K r0 = r2.A02
            r0.CGB(r4)
            goto L_0x000d
        L_0x0037:
            boolean r0 = r6 instanceof X.AnonymousClass2M7
            if (r0 == 0) goto L_0x0051
            X.2M7 r2 = (X.AnonymousClass2M7) r2
            int r0 = r2.A00
            switch(r0) {
                case 1: goto L_0x0043;
                case 2: goto L_0x00c9;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x000d
        L_0x0043:
            java.lang.Object r0 = r2.A01
            X.2rj r0 = (X.C62642rj) r0
            X.37L r1 = r0.A08
            java.lang.Object r0 = r2.A02
            com.whatsapp.jid.DeviceJid[] r0 = (com.whatsapp.jid.DeviceJid[]) r0
            r1.A02(r0, r4)
            goto L_0x000d
        L_0x0051:
            boolean r0 = r6 instanceof X.AnonymousClass2M3
            if (r0 == 0) goto L_0x000d
            X.2M3 r2 = (X.AnonymousClass2M3) r2
            int r0 = r2.A00
            switch(r0) {
                case 3: goto L_0x005d;
                case 4: goto L_0x008b;
                case 5: goto L_0x0096;
                case 6: goto L_0x00ab;
                default: goto L_0x005c;
            }
        L_0x005c:
            goto L_0x000d
        L_0x005d:
            r0 = 404(0x194, float:5.66E-43)
            if (r4 != r0) goto L_0x0076
            java.lang.Object r0 = r2.A01
            X.2rj r0 = (X.C62642rj) r0
            X.37L r1 = r0.A08
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-get-pre-key-digest-none"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3LB r2 = r1.A00
            r1 = 0
            r0 = 83
        L_0x0071:
            android.os.Message r0 = android.os.Message.obtain(r3, r1, r0, r1)
            goto L_0x00dd
        L_0x0076:
            r0 = 503(0x1f7, float:7.05E-43)
            if (r4 != r0) goto L_0x000d
            java.lang.Object r0 = r2.A01
            X.2rj r0 = (X.C62642rj) r0
            X.37L r1 = r0.A08
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-get-pre-key-digest-server-error"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3LB r2 = r1.A00
            r1 = 0
            r0 = 84
            goto L_0x0071
        L_0x008b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConnectionWriter/sendClearFbnsToken/failed to clear code="
            X.C17900vP.A0i(r0, r1, r4)
            goto L_0x000d
        L_0x0096:
            java.lang.Object r0 = r2.A01
            X.2rj r0 = (X.C62642rj) r0
            X.37L r2 = r0.A08
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-number-normalization-error="
            X.C17900vP.A0j(r0, r1, r4)
            X.3LB r2 = r2.A00
            r1 = 0
            r0 = 199(0xc7, float:2.79E-43)
            goto L_0x00d9
        L_0x00ab:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConnectionWriter/change number failed; code="
            X.C17900vP.A0k(r0, r1, r4)
            java.lang.Object r0 = r2.A01
            X.2rj r0 = (X.C62642rj) r0
            X.37L r2 = r0.A08
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-change-number-error="
            X.C17900vP.A0j(r0, r1, r4)
            X.3LB r2 = r2.A00
            r1 = 0
            r0 = 201(0xc9, float:2.82E-43)
            goto L_0x00d9
        L_0x00c9:
            java.lang.Object r0 = r2.A01
            X.2rj r0 = (X.C62642rj) r0
            X.37L r1 = r0.A08
            java.lang.String r0 = "ConnectionThreadRequestsImpl/client_config_error"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3LB r2 = r1.A00
            r1 = 0
            r0 = 27
        L_0x00d9:
            android.os.Message r0 = android.os.Message.obtain(r3, r1, r0, r4)
        L_0x00dd:
            r2.CAe(r0)
            goto L_0x000d
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2S7.A00(X.1ca):void");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [byte[][], java.io.Serializable] */
    public void A01(C29621ca r17) {
        int i;
        AnonymousClass3LB r8;
        Message obtain;
        int i2;
        int i3;
        if (this instanceof AnonymousClass2M5) {
            AnonymousClass2M5 r4 = (AnonymousClass2M5) this;
            if (!r4.A02) {
                Log.i("ConnectionWriter/app/handle/skip-set-recovery-token");
                C62642rj r3 = r4.A00;
                C17880vN.A1F(C19830z4.A00(r3.A06), "pref_deprecate_rc", true);
                C17970vW.A09(r3.A05.A00);
                return;
            }
            if (!C17970vW.A0E(r4.A00.A05.A00, r4.A01, r4.A03)) {
                Log.e("ConnectionWriter/app/set-recovery-token/fail");
            }
        } else if (this instanceof AnonymousClass2M4) {
            AnonymousClass2M4 r42 = (AnonymousClass2M4) this;
            AnonymousClass37L r2 = r42.A00.A08;
            boolean z = r42.A01;
            C17900vP.A0n("ConnectionThreadRequestsImpl/connectionactive/set ", AnonymousClass000.A10(), z);
            C17890vO.A0p(r2.A00, Boolean.valueOf(z), 87);
        } else if (this instanceof AnonymousClass2M6) {
            AnonymousClass2M6 r43 = (AnonymousClass2M6) this;
            C52542b5 r0 = r43.A00;
            String str = r43.A04;
            SetAboutInfo setAboutInfo = r0.A00;
            setAboutInfo.A06 = true;
            Handler handler = setAboutInfo.A08;
            handler.removeMessages(0);
            handler.sendMessage(Message.obtain(handler, 1, str));
        } else {
            AnonymousClass2M3 r44 = (AnonymousClass2M3) this;
            C29621ca r1 = r17;
            switch (r44.A00) {
                case 0:
                    C29621ca.A04(r1.A0J(0), "remove");
                    AnonymousClass37L r12 = ((C62642rj) r44.A01).A08;
                    Log.i("ConnectionThreadRequestsImpl/removeaccount");
                    r8 = r12.A00;
                    i2 = 0;
                    i3 = 12;
                    break;
                case 1:
                    return;
                case 2:
                    C29621ca A0K = r1.A0K("props");
                    if (A0K != null) {
                        AnonymousClass37L r13 = ((C62642rj) r44.A01).A08;
                        Log.i("ConnectionThreadRequestsImpl/server-props");
                        r8 = r13.A00;
                        obtain = Message.obtain((Handler) null, 0, 174, 0, A0K);
                        break;
                    } else {
                        return;
                    }
                case 3:
                    C29621ca A0L = r1.A0L("digest");
                    C29621ca A0L2 = A0L.A0L("registration");
                    C29621ca A0L3 = A0L.A0L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    C29621ca A0L4 = A0L.A0L("skey").A0L(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    C29621ca A0L5 = A0L.A0L("list");
                    C29621ca A0L6 = A0L.A0L("hash");
                    C29621ca[] r14 = A0L5.A02;
                    if (r14 != null) {
                        i = r14.length;
                    } else {
                        i = 0;
                    }
                    ? r6 = new byte[i][];
                    for (int i4 = 0; i4 < i; i4++) {
                        C29621ca.A04(r14[i4], PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        r6[i4] = C29621ca.A08(r14[i4], 3);
                    }
                    AnonymousClass37L r22 = ((C62642rj) r44.A01).A08;
                    byte[] A08 = C29621ca.A08(A0L2, 4);
                    byte b = C29621ca.A08(A0L3, 1)[0];
                    byte[] A082 = C29621ca.A08(A0L4, 3);
                    byte[] A083 = C29621ca.A08(A0L6, 20);
                    Log.i("ConnectionThreadRequestsImpl/on-get-pre-key-digest");
                    r8 = r22.A00;
                    Bundle A0D = C17880vN.A0D();
                    A0D.putByteArray("registration", A08);
                    A0D.putByte(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, b);
                    A0D.putByteArray("signedKeyId", A082);
                    A0D.putSerializable("keyIds", r6);
                    A0D.putByteArray("hash", A083);
                    obtain = Message.obtain((Handler) null, 0, 82, 0, A0D);
                    break;
                case 4:
                    Log.i("ConnectionWriter/Connection/sendClearFbnsToken/successfully cleared");
                    return;
                case 5:
                    C29621ca A0J = r1.A0J(0);
                    C29621ca.A04(A0J, "normalize");
                    String A0Q = A0J.A0Q("result", (String) null);
                    AnonymousClass37L r23 = ((C62642rj) r44.A01).A08;
                    C17900vP.A0f("ConnectionThreadRequestsImpl/on-number-normalized=", A0Q, AnonymousClass000.A10());
                    C17890vO.A0p(r23.A00, A0Q, 198);
                    return;
                default:
                    Log.i("ConnectionWriter/change number succeeded");
                    C29621ca.A04(r1.A0J(0), "modify");
                    AnonymousClass37L r15 = ((C62642rj) r44.A01).A08;
                    Log.i("ConnectionThreadRequestsImpl/on-change-number-success");
                    r8 = r15.A00;
                    i2 = 0;
                    i3 = 200;
                    break;
            }
            obtain = Message.obtain((Handler) null, i2, i3, i2);
            r8.CAe(obtain);
        }
    }
}
