package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.1Us  reason: invalid class name and case insensitive filesystem */
public class C27101Us {
    public static final AnonymousClass1MD[] A05 = new AnonymousClass1MD[0];
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass190 A03;
    public final C18030ve A04;

    public C26981Ug A00(AnonymousClass1BI r10, AnonymousClass1BI r11, C194059r6 r12, String str, int i) {
        AnonymousClass00H r4 = this.A02;
        String A0C = ((AnonymousClass1OZ) r4.get()).A0C();
        C29621ca r3 = new C29621ca(new C29621ca(A83.A01(r12, i), "location", r11 == null ? new AnonymousClass1MD[]{new AnonymousClass1MD("final", str)} : new AnonymousClass1MD[]{new AnonymousClass1MD("final", str), new AnonymousClass1MD((Jid) r11, "context")}), "notification", new AnonymousClass1MD[]{new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0C), new AnonymousClass1MD((Jid) r10, "to"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "location")});
        C58762lD r0 = new C58762lD();
        r0.A06 = "notification";
        r0.A09 = "location";
        r0.A02 = r10;
        r0.A08 = A0C;
        return ((AnonymousClass1OZ) r4.get()).A08(r3, r0.A00(), 188);
    }

    public void A01(Jid jid, String str, int i) {
        C29621ca r2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass1MD(jid, "to"));
        arrayList.add(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
        if (i == 0) {
            arrayList.add(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "result"));
            r2 = null;
        } else {
            arrayList.add(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "error"));
            r2 = new C29621ca("error", new AnonymousClass1MD[]{new AnonymousClass1MD("code", Integer.toString(i))});
        }
        C29621ca r3 = new C29621ca(r2, "iq", (AnonymousClass1MD[]) arrayList.toArray(A05));
        AnonymousClass1OZ r22 = (AnonymousClass1OZ) this.A02.get();
        C23651Hc r1 = r22.A02;
        if (r1.A07 && r1.A02()) {
            AnonymousClass1OZ.A03(AnonymousClass2U2.A00(r3, (Boolean) null, (String) null, 225, false, true), r22, false);
        }
    }

    public void A02(C57262in r13) {
        AnonymousClass00H r2 = this.A02;
        String A0B = ((AnonymousClass1OZ) r2.get()).A0B();
        StringBuilder sb = new StringBuilder();
        sb.append("LocationSubscriptionSendMethods/subscribe; iqId=");
        sb.append(A0B);
        Log.i(sb.toString());
        AnonymousClass1OZ r5 = (AnonymousClass1OZ) r2.get();
        C29621ca r3 = new C29621ca("subscribe", r13.A01 ? new AnonymousClass1MD[]{new AnonymousClass1MD("participants", "true")} : null);
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B));
        arrayList.add(new AnonymousClass1MD("xmlns", "location"));
        arrayList.add(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"));
        arrayList.add(new AnonymousClass1MD((Jid) C173438v4.A00, "to"));
        arrayList.add(new AnonymousClass1MD((Jid) r13.A00, "target"));
        r5.A0I(new AnonymousClass37G(this, r13, 3), new C29621ca(r3, "iq", (AnonymousClass1MD[]) arrayList.toArray(A05)), A0B, 82, 32000);
    }

    public void A03(C194059r6 r8, String str, long j) {
        AnonymousClass1MD[] r0;
        StringBuilder sb = new StringBuilder();
        sb.append("sendmethods/sendLocation elapsed=");
        sb.append(j);
        Log.i(sb.toString());
        C29621ca A012 = A83.A01(r8, 0);
        ArrayList arrayList = new ArrayList();
        if (j != 0) {
            arrayList.add(new AnonymousClass1MD("elapsed", Long.toString(j)));
        }
        if (str != null) {
            arrayList.add(new AnonymousClass1MD("liveloc_mode", str));
        }
        if (arrayList.isEmpty()) {
            r0 = A05;
        } else {
            r0 = (AnonymousClass1MD[]) arrayList.toArray(new AnonymousClass1MD[0]);
        }
        ((AnonymousClass1OZ) this.A02.get()).A0O(new C29621ca(new C29621ca(A012, "location", r0), "ib", (AnonymousClass1MD[]) null), 84);
    }

    public C27101Us(AnonymousClass190 r1, C18030ve r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        this.A04 = r2;
        this.A03 = r1;
        this.A02 = r3;
        this.A00 = r4;
        this.A01 = r5;
    }
}
