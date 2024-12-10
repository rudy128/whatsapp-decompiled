package X;

import android.os.BaseBundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.1m9  reason: invalid class name and case insensitive filesystem */
public class C35381m9 implements AnonymousClass1RJ {
    public final AnonymousClass18O A00;
    public final AnonymousClass1DM A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass118 A03;
    public final C19830z4 A04;
    public final AnonymousClass18K A05;
    public final C25011Mn A06;
    public final C35371m8 A07;
    public final C25081Mu A08;
    public final AnonymousClass10I A09;

    public int[] BSG() {
        return new int[]{6, 27, 250, 159, 174, 18};
    }

    public boolean BcT(Message message, int i) {
        int i2;
        int i3;
        Message message2 = message;
        int i4 = i;
        if (i4 == 6) {
            BaseBundle baseBundle = (BaseBundle) message2.obj;
            String string = baseBundle.getString("gcmToken");
            String string2 = baseBundle.getString("fbnsToken");
            String string3 = baseBundle.getString("mutedChatsHash");
            String string4 = baseBundle.getString("appMuteConfig");
            String string5 = baseBundle.getString("num_acc");
            String string6 = baseBundle.getString("pkey");
            String string7 = baseBundle.getString("voip_payload_type");
            StringBuilder sb = new StringBuilder();
            sb.append("AppMessagingXmppHandler/received client config from server; gcmToken=");
            boolean z = false;
            if (string != null) {
                i2 = string.length();
            } else {
                i2 = 0;
            }
            sb.append(i2);
            sb.append(" bytes; fbnsToken=");
            if (string2 != null) {
                i3 = string2.length();
            } else {
                i3 = 0;
            }
            sb.append(i3);
            sb.append(" bytes: mutedChatsHash=");
            sb.append(string3);
            sb.append(" appMuteConfig:");
            sb.append(string4);
            sb.append(" numberOfAccounts: ");
            sb.append(string5);
            sb.append(" has pKeyHash:");
            if (string6 != null) {
                z = true;
            }
            sb.append(z);
            sb.append(" voipPayloadType:");
            sb.append(string7);
            Log.i(sb.toString());
            RegistrationIntentService.A03(this.A03.A00, this.A08, string, string3, string4, string5, string6, string7);
            C35371m8 r2 = this.A07;
            if (r2.A01()) {
                r2.A00(string2);
                return true;
            } else if (!TextUtils.isEmpty(string2)) {
                ((AnonymousClass1OZ) this.A06.A01.get()).A0M(Message.obtain((Handler) null, 0, 263, 0));
                return true;
            }
        } else if (i4 != 18) {
            if (i4 == 27) {
                int i5 = message2.arg2;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("AppMessagingXmppHandler/clientConfigError/");
                sb2.append(i5);
                Log.e(sb2.toString());
                if (i5 == 404) {
                    RegistrationIntentService.A03(this.A03.A00, this.A08, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
                    C35371m8 r1 = this.A07;
                    if (r1.A01()) {
                        r1.A00((String) null);
                        return true;
                    }
                }
            } else if (i4 == 159) {
                this.A01.A01(((BaseBundle) message2.obj).getLong("timestampMs"));
            } else if (i4 != 174) {
                return false;
            } else {
                C29621ca r3 = (C29621ca) message2.obj;
                int A012 = C20099A7c.A01(r3.A0Q("version", (String) null), 0);
                int A013 = C20099A7c.A01(r3.A0Q("protocol", (String) null), 1);
                HashMap hashMap = new HashMap();
                for (C29621ca r4 : r3.A0R("prop")) {
                    hashMap.put(r4.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), r4.A0Q("value", (String) null));
                }
                if (A013 == 2) {
                    this.A00.A08(this.A02, r3.A0Q("hash", (String) null), r3.A0Q("key", (String) null), hashMap, A012, A013, C20099A7c.A04(r3.A0Q("refresh", (String) null), 86400) * 1000);
                } else {
                    this.A00.A08(this.A02, (String) null, (String) null, hashMap, A012, 1, 86400000);
                }
                this.A09.CGF(new C146757Qm((Object) this, 42));
                return true;
            }
        }
        return true;
    }

    public C35381m9(AnonymousClass18O r1, AnonymousClass1DM r2, AnonymousClass11P r3, AnonymousClass118 r4, C19830z4 r5, AnonymousClass18K r6, C25011Mn r7, C35371m8 r8, C25081Mu r9, AnonymousClass10I r10) {
        this.A03 = r4;
        this.A02 = r3;
        this.A09 = r10;
        this.A05 = r6;
        this.A06 = r7;
        this.A00 = r1;
        this.A08 = r9;
        this.A07 = r8;
        this.A04 = r5;
        this.A01 = r2;
    }
}
