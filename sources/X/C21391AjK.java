package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AjK  reason: case insensitive filesystem */
public final /* synthetic */ class C21391AjK implements Runnable {
    public final /* synthetic */ AnonymousClass1BI A00;
    public final /* synthetic */ C21150AfL A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public final void run() {
        UserJid userJid;
        Integer num;
        C60082nM r1;
        String str;
        String str2;
        AnonymousClass21K r0;
        C20285AEt BPK;
        C20277AEk aEk;
        C21150AfL afL = this.A01;
        String str3 = this.A02;
        String str4 = this.A03;
        AnonymousClass1BI r9 = this.A00;
        String str5 = this.A04;
        String str6 = this.A05;
        boolean z = this.A06;
        String valueOf = String.valueOf(str4);
        AnonymousClass206 A012 = AnonymousClass1W2.A01(AnonymousClass205.A01(r9, valueOf, false), afL.A05);
        JSONObject A15 = C17880vN.A15();
        try {
            A15.put("cta", str6);
            A15.put("flow_id", str5);
            A15.put("extensions_message_id", A4O.A00.A01(afL.A02, valueOf, false));
            String A0Y = AnonymousClass8BY.A0Y(str3);
            C18070vi.A0X(A0Y);
            A15.put("session_id", A0Y);
        } catch (JSONException e) {
            Log.w(C17900vP.A0C("SendFlowsResponseMessage/sendWamEvent/", AnonymousClass000.A10(), e));
        }
        Object obj = null;
        if (r9 instanceof UserJid) {
            userJid = (UserJid) r9;
            if (userJid != null) {
                num = Integer.valueOf(AnonymousClass9Q5.A00(afL.A01.A02(userJid)));
                r1 = afL.A03.A03(userJid);
            }
            num = null;
            r1 = null;
        } else {
            userJid = null;
            num = null;
            r1 = null;
        }
        A0M a0m = (A0M) afL.A06.get();
        String A0H = C18070vi.A0H(A15);
        if (r1 != null) {
            str = r1.A08;
            str2 = r1.A05;
        } else {
            str = null;
            str2 = null;
        }
        a0m.A01(userJid, A012, num, A0H, str, str2, valueOf, 2);
        if ((A012 instanceof AnonymousClass21K) && (r0 = (AnonymousClass21K) A012) != null && (BPK = r0.BPK()) != null && BPK.A00 == 5 && (aEk = BPK.A06) != null) {
            Iterator it = aEk.A03.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (AnonymousClass8BW.A1U(next, str6)) {
                    obj = next;
                    break;
                }
            }
            C20253ADl aDl = (C20253ADl) obj;
            if (aDl != null) {
                aDl.A00 = z;
            }
            afL.A04.CQw(A012);
        }
    }

    public /* synthetic */ C21391AjK(AnonymousClass1BI r1, C21150AfL afL, String str, String str2, String str3, String str4, boolean z) {
        this.A01 = afL;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = r1;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = z;
    }
}
