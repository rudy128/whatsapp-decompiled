package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.7QR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7QR implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ C32741hg A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public final void run() {
        int intValue;
        int i = this.A00;
        C32741hg r9 = this.A02;
        String str = this.A04;
        UserJid userJid = this.A01;
        String str2 = this.A05;
        Long l = this.A03;
        String str3 = this.A06;
        boolean z = this.A07;
        AnonymousClass641 r2 = new AnonymousClass641();
        r2.A02 = Integer.valueOf(i);
        AnonymousClass71S r11 = r9.A01;
        if (r11 != null) {
            r2.A03 = C17880vN.A0i();
            r2.A06 = Long.valueOf(r11.A04);
            r2.A07 = Long.valueOf(r11.A05);
            r2.A08 = str2;
            r2.A09 = r11.A08;
            if (str2 != null) {
                r2.A05 = l;
                r2.A04 = C17880vN.A0n(C72463Mc.A0B(C108945cZ.A1E(str3, r9.A0P)));
            }
        } else {
            r2.A03 = 1;
            r2.A06 = Long.valueOf(C108995ce.A0A(r9));
            r2.A09 = str;
        }
        AnonymousClass1E7 A0E = r9.A07.A0E(userJid);
        if (A0E != null) {
            r2.A00 = Boolean.valueOf(A0E.A0C());
            r2.A01 = Boolean.valueOf(A0E.A0B());
        }
        String str4 = r2.A09;
        if (str4 == null || str4.length() == 0) {
            r9.A0C.CC7(r2);
        } else {
            r9.A0C.CC0(r2, AnonymousClass73K.A00, true);
        }
        AnonymousClass71S r0 = r9.A01;
        if (r0 != null) {
            ArrayList A13 = AnonymousClass000.A13();
            Collection<C56012gk> values = r0.A0D.values();
            if (values != null) {
                for (C56012gk r02 : values) {
                    A13.addAll(r02.A08.values());
                }
            }
            ArrayList<C138716xZ> A132 = AnonymousClass000.A13();
            Iterator it = A13.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C108975cc.A13(((C138716xZ) next).A0T, str3, next, A132);
            }
            for (C138716xZ r6 : A132) {
                AnonymousClass71A r13 = (AnonymousClass71A) r9.A0O.get();
                Long valueOf = Long.valueOf(r6.A09);
                Boolean valueOf2 = Boolean.valueOf(r6.A0R);
                String str5 = r6.A0T;
                UserJid userJid2 = r6.A0S;
                Integer num = r6.A0J;
                boolean z2 = true;
                if (num != null && (((intValue = num.intValue()) == 4 || intValue == 3) && r6.A08 < r6.A06)) {
                    z2 = false;
                }
                Boolean valueOf3 = Boolean.valueOf(z2);
                Integer valueOf4 = Integer.valueOf(C138716xZ.A00(r6.A02));
                Boolean bool = r6.A0C;
                if (z) {
                    AnonymousClass642 A002 = AnonymousClass71A.A00(userJid2, r13, valueOf3, valueOf2, valueOf4, valueOf, str5);
                    A002.A06 = C17880vN.A0k();
                    if (C18020vd.A05(C18040vf.A02, r13.A02.A01, 8729)) {
                        A002.A02 = bool;
                    }
                    C108965cb.A1E(A002, r13.A01);
                }
            }
        }
    }

    public /* synthetic */ AnonymousClass7QR(UserJid userJid, C32741hg r2, Long l, String str, String str2, String str3, int i, boolean z) {
        this.A00 = i;
        this.A02 = r2;
        this.A04 = str;
        this.A01 = userJid;
        this.A05 = str2;
        this.A03 = l;
        this.A06 = str3;
        this.A07 = z;
    }
}
