package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class AQF implements AnonymousClass5Z4 {
    public HashSet A00 = C17880vN.A12();
    public HashSet A01 = C17880vN.A12();
    public List A02 = AnonymousClass000.A13();
    public final AnonymousClass1KB A03;
    public final AnonymousClass11S A04;
    public final AnonymousClass1QS A05;
    public final C33651jA A06;

    public static void A00(C22459B8r b8r, AQF aqf, String str) {
        aqf.A00.add(str);
        aqf.A01.remove(str);
        if (b8r != null) {
            b8r.Bqm();
        }
        List<Reference> list = aqf.A02;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((Reference) list.get(size)).get() == null) {
                list.remove(size);
            }
        }
        for (Reference reference : list) {
            C22459B8r b8r2 = (C22459B8r) reference.get();
            if (b8r2 != null) {
                b8r2.Bqm();
            }
        }
    }

    public void A03(C22459B8r b8r) {
        List list = this.A02;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (((Reference) list.get(size)).get() != b8r);
        list.remove(size);
    }

    public void C1I(AnonymousClass206 r4) {
        AW0 A002;
        if (r4 != null && (A002 = AnonymousClass25B.A00(r4)) != null && A002.A03 == 1000) {
            AnonymousClass11S r1 = this.A04;
            if (r1.A0O(A002.A0D) || r1.A0O(A002.A0E)) {
                String str = A002.A0K;
                if (!TextUtils.isEmpty(str)) {
                    A01((C22459B8r) null, this, C108965cb.A0s(str));
                    return;
                }
                return;
            }
            A02(this, r4.A0v, A002.A0K);
        }
    }

    public AQF(AnonymousClass1KB r2, AnonymousClass11S r3, AnonymousClass1QS r4, C33651jA r5) {
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = r4;
        this.A06 = r5;
    }

    public static void A01(C22459B8r b8r, AQF aqf, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            HashSet hashSet = aqf.A01;
            if (!hashSet.contains(A0v) && !aqf.A00.contains(A0v)) {
                hashSet.add(A0v);
                aqf.A06.A02(new AXF(b8r, aqf, A0v, 0), A0v, true);
            }
        }
    }

    public static void A02(AQF aqf, AnonymousClass205 r11, String str) {
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass205 r9 = r11;
            if (r11 != null) {
                AnonymousClass1BI r3 = r11.A00;
                if (C22971Dz.A0e(r3)) {
                    HashSet hashSet = aqf.A01;
                    if (!hashSet.contains(str) && !aqf.A00.contains(str)) {
                        hashSet.add(str);
                        C33651jA r8 = aqf.A06;
                        AXD axd = new AXD(aqf, str);
                        AnonymousClass1MD[] r2 = new AnonymousClass1MD[3];
                        AnonymousClass8BV.A1M("action", "get-missing-group-transaction-details", r2);
                        AnonymousClass8BV.A1N(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r2);
                        r2[2] = new AnonymousClass1MD((Jid) r3, "group");
                        C29621ca A0k = AnonymousClass8BR.A0k("account", r2);
                        AnonymousClass8BW.A1C(r8.A05, new C175488yn(r8.A01.A00, AnonymousClass8BR.A0a(r8.A08), r8.A00, axd, r8, r9, 7), A0k);
                    }
                }
            }
        }
    }

    public void A04(List list) {
        AnonymousClass8pG r2;
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AW0 aw0 = (AW0) it.next();
            if ((aw0.A03 == 1000 && !TextUtils.isEmpty(aw0.A0K)) || ((r2 = aw0.A0A) != null && (r2 instanceof C170318pf) && "MISSING_FIELD_NOT_PARTIAL".equals(((C170318pf) r2).A0W))) {
                A13.add(aw0.A0K);
            }
        }
        if (!A13.isEmpty()) {
            A01((C22459B8r) null, this, A13);
        }
    }
}
