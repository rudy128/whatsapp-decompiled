package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Aiw  reason: case insensitive filesystem */
public class C21367Aiw implements Runnable {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C21367Aiw(Object obj, String str, String str2, String str3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
    }

    public final void run() {
        AnonymousClass206 A012;
        AnonymousClass21K r0;
        C20285AEt BPK;
        C20277AEk aEk;
        AnonymousClass122 r02;
        AnonymousClass21K r03;
        C20285AEt BPK2;
        C20277AEk aEk2;
        AnonymousClass21K r04;
        C20285AEt BPK3;
        C20277AEk aEk3;
        switch (this.A00) {
            case 0:
                ((C22927BVp) this.A01).A00.CAR(this.A02, this.A03, this.A04);
                return;
            case 1:
                A2M a2m = (A2M) this.A01;
                String str = this.A02;
                String str2 = this.A03;
                String str3 = this.A04;
                C171758sE r2 = new C171758sE();
                A2M.A00(r2, a2m);
                r2.A07 = Long.valueOf(a2m.A00);
                r2.A0N = a2m.A04;
                r2.A0C = str;
                r2.A0D = str2;
                r2.A0B = str3;
                a2m.A08.CC4(r2);
                return;
            case 2:
                String str4 = this.A02;
                String str5 = this.A03;
                C20052A4y a4y = (C20052A4y) this.A01;
                String str6 = this.A04;
                A012 = AnonymousClass1W2.A01(AnonymousClass205.A01(AnonymousClass3MX.A0l(str4), str5, false), a4y.A02);
                Object obj = null;
                if ((A012 instanceof AnonymousClass21K) && (r03 = (AnonymousClass21K) A012) != null && (BPK2 = r03.BPK()) != null && BPK2.A00 == 5 && (aEk2 = BPK2.A06) != null) {
                    Iterator it = aEk2.A03.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (AnonymousClass8BW.A1U(next, str6)) {
                                obj = next;
                            }
                        }
                    }
                    C20253ADl aDl = (C20253ADl) obj;
                    if (aDl != null) {
                        aDl.A00 = true;
                    }
                    r02 = a4y.A00;
                    break;
                } else {
                    return;
                }
            case 3:
                C188159gy r5 = (C188159gy) this.A01;
                String str7 = this.A02;
                String str8 = this.A03;
                String str9 = this.A04;
                C18070vi.A0d(r5, 0);
                C18070vi.A0b(str8);
                JSONObject A15 = C17880vN.A15();
                try {
                    A15.put("cta", str9);
                } catch (JSONException e) {
                    Log.w(C17900vP.A0C("FlowsLogger/WaBkCommerceInterpreterCallbackImpl/updateNativeFlowMessageWithSelectedState/", AnonymousClass000.A10(), e));
                }
                ((C190579lB) C18070vi.A0E(r5.A05)).A00((Jid) null, (Integer) null, A15.toString(), (String) null, 2, 4, 1, true);
                A012 = AnonymousClass1W2.A01(AnonymousClass205.A01(AnonymousClass3MX.A0l(str8), str7, false), r5.A04);
                Object obj2 = null;
                if ((A012 instanceof AnonymousClass21K) && (r0 = (AnonymousClass21K) A012) != null && (BPK = r0.BPK()) != null && BPK.A00 == 5 && (aEk = BPK.A06) != null) {
                    Iterator it2 = aEk.A03.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            if (AnonymousClass8BW.A1U(next2, str9)) {
                                obj2 = next2;
                            }
                        }
                    }
                    C20253ADl aDl2 = (C20253ADl) obj2;
                    if (aDl2 != null) {
                        aDl2.A00 = true;
                    }
                    r02 = r5.A02;
                    break;
                } else {
                    return;
                }
                break;
            default:
                String str10 = this.A02;
                String str11 = this.A03;
                AS6 as6 = (AS6) this.A01;
                String str12 = this.A04;
                A012 = C108945cZ.A0s(AnonymousClass205.A01(AnonymousClass3MX.A0l(str10), str11, false), as6.A09);
                Object obj3 = null;
                if ((A012 instanceof AnonymousClass21K) && (r04 = (AnonymousClass21K) A012) != null && (BPK3 = r04.BPK()) != null && BPK3.A00 == 5 && (aEk3 = BPK3.A06) != null) {
                    Iterator it3 = aEk3.A03.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next3 = it3.next();
                            if (AnonymousClass8BW.A1U(next3, str12)) {
                                obj3 = next3;
                            }
                        }
                    }
                    C20253ADl aDl3 = (C20253ADl) obj3;
                    if (aDl3 != null) {
                        aDl3.A00 = true;
                    }
                    r02 = as6.A05;
                    break;
                } else {
                    return;
                }
                break;
        }
        r02.CQw(A012);
    }
}
