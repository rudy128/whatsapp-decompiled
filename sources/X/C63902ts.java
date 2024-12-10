package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2ts  reason: invalid class name and case insensitive filesystem */
public abstract class C63902ts {
    public static Message A01() {
        return Message.obtain((Handler) null, 0, 13, 0);
    }

    public static Message A04(String str, byte[] bArr, boolean z) {
        Message obtain = Message.obtain((Handler) null, 0, 35, 0);
        obtain.getData().putByteArray("rc", bArr);
        obtain.getData().putString("rcJid", str);
        obtain.getData().putBoolean("saveRecoveryToken", z);
        return obtain;
    }

    public static void A07(AnonymousClass190 r5, C18030ve r6, String str, String str2, String str3, long j, boolean z) {
        if (str2 == null) {
            C17960vV.A0F(AnonymousClass000.A1O((j > 0 ? 1 : (j == 0 ? 0 : -1))), "loggableStanzaId must be >= 1.");
        }
        if (z && j == 0 && C18020vd.A05(C18040vf.A02, r6, 4207)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("XmppSendMessage/validateStanzaKeyForAckOrReceipt ack-without-loggable-stanza-id cls=");
            A10.append(str);
            A10.append(", error=");
            A10.append(str2);
            C17900vP.A0g(" id=", str3, A10);
            r5.A0G("ack-without-loggable-stanza-id", AnonymousClass001.A1H("-", str2, AnonymousClass000.A11(str)), false);
        }
    }

    public static Bundle A00(Message message) {
        Object obj = message.obj;
        if (obj instanceof Bundle) {
            return (Bundle) obj;
        }
        if (message.peekData() != null) {
            return message.getData();
        }
        return null;
    }

    public static Message A02(AnonymousClass190 r12, C18030ve r13, C60132nR r14) {
        String str;
        long j = r14.A00;
        boolean A01 = r14.A01();
        String str2 = r14.A06;
        List list = r14.A0A;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass1MD r1 = (AnonymousClass1MD) it.next();
                if (r1.A02.equals("error")) {
                    str = r1.A03;
                    break;
                }
            }
        }
        str = null;
        A07(r12, r13, str2, str, r14.A08, j, A01);
        return Message.obtain((Handler) null, 0, 129, 0, r14);
    }

    public static Message A03(AnonymousClass190 r12, C18030ve r13, C60132nR r14) {
        String str;
        long j = r14.A00;
        boolean A01 = r14.A01();
        String str2 = r14.A06;
        List list = r14.A0A;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass1MD r1 = (AnonymousClass1MD) it.next();
                if (r1.A02.equals("error")) {
                    str = r1.A03;
                    break;
                }
            }
        }
        str = null;
        A07(r12, r13, str2, str, r14.A08, j, A01);
        return Message.obtain((Handler) null, 0, 76, 0, r14);
    }

    public static Message A05(boolean z) {
        return Message.obtain((Handler) null, 0, 37, 0, Boolean.valueOf(z));
    }

    public static void A06(Bundle bundle, DeviceJid deviceJid, Jid jid, String str, String str2, long j) {
        bundle.putString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        bundle.putString("jid", jid.getRawString());
        bundle.putString("callCreatorJid", deviceJid.getRawString());
        bundle.putString("callId", str2);
        bundle.putLong("loggableStanzaId", j);
    }
}
