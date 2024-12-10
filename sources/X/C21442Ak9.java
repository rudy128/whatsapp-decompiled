package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Ak9  reason: case insensitive filesystem */
public final class C21442Ak9 implements Runnable {
    public C185549cl A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C192829p3 A02;
    public final /* synthetic */ C20287AEv A03;
    public final /* synthetic */ UserJid A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;

    public C21442Ak9(C192829p3 r1, C20287AEv aEv, UserJid userJid, String str, String str2, String str3, List list, long j) {
        this.A01 = j;
        this.A02 = r1;
        this.A04 = userJid;
        this.A03 = aEv;
        this.A06 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A08 = list;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.A7D, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.A7D, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.A7D, java.lang.Object] */
    public void run() {
        A8Q a8q;
        A7D a7d;
        String str;
        List list;
        List<C20245ADd> A0v;
        List<C20245ADd> list2;
        long j = this.A01;
        boolean z = true;
        boolean z2 = true;
        String str2 = null;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        C192829p3 r9 = this.A02;
        A8S a8s = r9.A06;
        UserJid userJid = this.A04;
        if (i == 0) {
            C20287AEv aEv = this.A03;
            String str3 = aEv.A0H;
            a8s.A0D(userJid, str3);
            C196479v8.A01(r9.A05, a8s, userJid);
            A8Q a8q2 = r9.A07;
            ? obj = new Object();
            C185549cl r0 = this.A00;
            if (r0 != null) {
                A7D.A03(obj, r0);
                A8Q.A02(obj, a8q2);
                obj.A09 = Long.valueOf(r0.A01);
                A7D.A01(obj, 30);
                A7D.A02(obj, 54);
                if (aEv.A05 == null) {
                    z2 = null;
                }
                obj.A04(z2);
                obj.A0H = str3;
                obj.A00 = userJid;
                A00(this, obj, j);
                a8q2.A09(obj);
            }
            C18070vi.A11("sessionSnapShot");
            throw null;
        }
        C20287AEv aEv2 = this.A03;
        String str4 = aEv2.A0H;
        C194209rM A072 = a8s.A07(userJid, str4);
        if (A072 == null) {
            A072 = new C194209rM(aEv2, C25511Om.A00, 1);
            a8q = r9.A07;
            ? obj2 = new Object();
            C185549cl r02 = this.A00;
            if (r02 != null) {
                A7D.A03(obj2, r02);
                A8Q.A02(obj2, a8q);
                obj2.A09 = Long.valueOf(r02.A01);
                A7D.A01(obj2, 28);
                A7D.A02(obj2, 49);
                obj2.A0H = str4;
                AE6 ae6 = aEv2.A05;
                if (ae6 == null) {
                    z2 = null;
                }
                obj2.A04(z2);
                obj2.A00 = userJid;
                A00(this, obj2, A072.A00);
                List list3 = this.A08;
                if (!(list3 == null || ae6 == null || (list2 = ae6.A02) == null)) {
                    ArrayList A13 = AnonymousClass000.A13();
                    for (C20245ADd aDd : list2) {
                        String str5 = aDd.A00;
                        if (!list3.contains(str5)) {
                            A13.add(str5);
                        }
                    }
                    AnonymousClass1D6[] r1 = new AnonymousClass1D6[2];
                    C72463Mc.A1H("shown_variants", list3, r1);
                    AnonymousClass1D6.A03("dropped_variants", A13, r1, 1);
                    str2 = AnonymousClass8BU.A0s(AnonymousClass1D7.A0B(r1));
                }
                obj2.A0J = str2;
                AE6 ae62 = aEv2.A05;
                if (ae62 == null || (list = ae62.A02) == null || (A0v = C29431cG.A0v(list, 2)) == null) {
                    str = null;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(A0v));
                    for (C20245ADd aDd2 : A0v) {
                        linkedHashMap.put(aDd2.A00, aDd2.A01);
                    }
                    str = AnonymousClass8BU.A0s(linkedHashMap);
                }
                obj2.A0K = str;
                a7d = obj2;
            }
            C18070vi.A11("sessionSnapShot");
            throw null;
        }
        z = false;
        A072.A00 = j;
        a8q = r9.A07;
        ? obj3 = new Object();
        C185549cl r03 = this.A00;
        if (r03 != null) {
            A7D.A03(obj3, r03);
            A8Q.A02(obj3, a8q);
            obj3.A09 = Long.valueOf(r03.A01);
            A7D.A01(obj3, 29);
            A7D.A02(obj3, 53);
            if (aEv2.A05 == null) {
                z2 = null;
            }
            obj3.A04(z2);
            obj3.A0H = str4;
            obj3.A00 = userJid;
            A00(this, obj3, j);
            a7d = obj3;
        }
        C18070vi.A11("sessionSnapShot");
        throw null;
        a8q.A09(a7d);
        a8s.A0A(A072, userJid);
        if (z) {
            a8s.A0B(aEv2, userJid);
        }
        r9.A00();
    }

    public static void A00(C21442Ak9 ak9, A7D a7d, long j) {
        a7d.A08 = Long.valueOf(j);
        a7d.A0D = ak9.A06;
        a7d.A0I = ak9.A07;
        a7d.A0C = ak9.A05;
    }
}
