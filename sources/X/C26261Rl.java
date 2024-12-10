package X;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Rl  reason: invalid class name and case insensitive filesystem */
public final class C26261Rl extends AnonymousClass10T {
    public final Handler A00;
    public final C26251Rk A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass11E A03;
    public final C19830z4 A04;
    public final C26241Rj A05;
    public final Map A06;
    public final C18100vl A07 = new C18110vm(new C71023Dm(this, 1));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26261Rl(C26251Rk r4, AnonymousClass1KB r5, AnonymousClass11E r6, C19830z4 r7, C26241Rj r8, AnonymousClass00H r9) {
        super(r9, false);
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r8, 2);
        C18070vi.A0d(r7, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r4, 5);
        C18070vi.A0d(r9, 6);
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        C18070vi.A0X(synchronizedMap);
        Handler handler = new Handler(Looper.getMainLooper());
        this.A02 = r5;
        this.A05 = r8;
        this.A04 = r7;
        this.A03 = r6;
        this.A06 = synchronizedMap;
        this.A00 = handler;
        this.A01 = r4;
    }

    public final int A00(String str) {
        int A0N = this.A04.A0N(C63682tW.A01(str));
        C58812lI r0 = (C58812lI) this.A06.get(str);
        if (r0 != null) {
            A0N = C63682tW.A00(r0.A00);
        }
        return Math.max(0, A0N);
    }

    public final void A02(String str, String str2) {
        if (!this.A03.A09()) {
            this.A02.A09(2131888361, 0);
            return;
        }
        A03(str, str2);
        Handler handler = this.A00;
        C18100vl r1 = this.A07;
        handler.removeCallbacks((Runnable) r1.getValue());
        handler.postDelayed((Runnable) r1.getValue(), 20000);
    }

    public final void A01(C57732jY r14) {
        C693836z r7 = new C693836z(new C52902bf(this, r14), (AnonymousClass1OZ) this.A01.A00.A00.A6N.get());
        Log.i("PrivacySettingsProtocolHelper/sendGetPrivacySettingsRequest");
        AnonymousClass1OZ r6 = r7.A00;
        String A0B = r6.A0B();
        r6.A0N(r7, new C29621ca(new C29621ca("privacy", (AnonymousClass1MD[]) null), "iq", new AnonymousClass1MD[]{new AnonymousClass1MD((Jid) C173438v4.A00, "to"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B), new AnonymousClass1MD("xmlns", "privacy"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get")}), A0B, 70, 0);
    }

    public final void A03(String str, String str2) {
        String str3 = str2;
        String str4 = str;
        this.A06.put(str4, new C58812lI(str3));
        C693836z r13 = new C693836z(new C52902bf(this, (C57732jY) null), (AnonymousClass1OZ) this.A01.A00.A00.A6N.get());
        Log.i("PrivacySettingsProtocolHelper/sendSetPrivacySettingsRequest");
        AnonymousClass1OZ r12 = r13.A00;
        String A0B = r12.A0B();
        r12.A0N(r13, new C29621ca(new C29621ca("privacy", (AnonymousClass1MD[]) null, new C29621ca[]{new C29621ca("category", new AnonymousClass1MD[]{new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str4), new AnonymousClass1MD("value", str3)})}), "iq", new AnonymousClass1MD[]{new AnonymousClass1MD((Jid) C173438v4.A00, "to"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B), new AnonymousClass1MD("xmlns", "privacy")}), A0B, 69, 0);
        notifyAllObservers(new AnonymousClass7KX(3));
        notifyAllObservers(new AnonymousClass7KS(str4, str3, 0));
    }

    public final void A04(Map map) {
        C19830z4 r3;
        String str;
        SharedPreferences sharedPreferences;
        boolean z = false;
        boolean z2 = false;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append("settingsprivacy/received ");
            sb.append(str2);
            sb.append(':');
            sb.append(str3);
            Log.i(sb.toString());
            int A002 = C63682tW.A00(str3);
            Map map2 = this.A06;
            C58812lI r1 = (C58812lI) map2.get(str2);
            if (A002 < 0 || !C63682tW.A03(str2, A002)) {
                map2.remove(str2);
                z = true;
            } else if (r1 == null || C18070vi.A18(r1.A00, str3)) {
                map2.remove(str2);
                int hashCode = str2.hashCode();
                if (hashCode != -1012222381) {
                    if (hashCode != 3314326) {
                        if (hashCode == 1974548689 && str2.equals("readreceipts")) {
                            C19830z4 r12 = this.A04;
                            C19830z4.A00(r12).putBoolean("read_receipts_enabled", AnonymousClass1YE.A08("all", str3)).apply();
                        }
                    } else if (str2.equals("last")) {
                        r3 = this.A04;
                        sharedPreferences = (SharedPreferences) r3.A00.get();
                        str = "privacy_last_seen";
                    }
                    try {
                        C19830z4 r0 = this.A04;
                        C19830z4.A00(r0).putInt(C63682tW.A01(str2), A002).apply();
                    } catch (IllegalArgumentException e) {
                        Log.i("Received unexpected privacy category from the server", e);
                    }
                } else {
                    if (str2.equals("online")) {
                        r3 = this.A04;
                        sharedPreferences = (SharedPreferences) r3.A00.get();
                        str = "privacy_online";
                    }
                    C19830z4 r02 = this.A04;
                    C19830z4.A00(r02).putInt(C63682tW.A01(str2), A002).apply();
                }
                int i = sharedPreferences.getInt(str, 0);
                C19830z4.A00(r3).putInt(str, A002).apply();
                if (i != A002) {
                    z2 = true;
                }
            }
        }
        if (z) {
            this.A02.A0J(new C70603Bt(this, 33));
        }
        if (z2) {
            this.A02.A0J(new C70603Bt(this, 34));
        }
        notifyAllObservers(new AnonymousClass7KX(3));
    }
}
