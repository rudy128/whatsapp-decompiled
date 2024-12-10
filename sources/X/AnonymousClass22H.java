package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.22H  reason: invalid class name */
public class AnonymousClass22H extends AnonymousClass206 implements AnonymousClass22G {
    public int A00;
    public int A01 = 0;
    public int A02;
    public long A03 = -1;
    public long A04 = 0;
    public String A05 = "";
    public final AnonymousClass25F A06 = A0N(C693036r.class);
    public final List A07 = new CopyOnWriteArrayList();

    public AnonymousClass22H(AnonymousClass205 r3, long j) {
        super(r3, 66, j);
    }

    public void A0i(String str) {
        if (str == null) {
            str = "";
        }
        this.A05 = str;
    }

    public List A17() {
        AnonymousClass25F r1 = this.A06;
        synchronized (r1) {
            C693036r r0 = (C693036r) r1.A02;
            if (r0 == null) {
                return null;
            }
            List list = r0.A00;
            return list;
        }
    }

    public void A18(List list) {
        AnonymousClass25F r2 = this.A06;
        synchronized (r2) {
            if (A17() == null) {
                r2.A02(new C693036r(list));
            } else {
                throw new IllegalStateException("FMessagePoll/setPollVotes re-assigning pollVotes");
            }
        }
    }

    public void A19(List list) {
        AnonymousClass25F r1 = this.A06;
        synchronized (r1) {
            if (A17() == null) {
                r1.A02(new C693036r(list));
            }
        }
    }

    public List BXF() {
        ArrayList arrayList = new ArrayList();
        for (A18 a18 : this.A07) {
            arrayList.add(a18.A04);
        }
        return arrayList;
    }

    public String BXE() {
        return this.A05;
    }
}
