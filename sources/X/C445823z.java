package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.23z  reason: invalid class name and case insensitive filesystem */
public final class C445823z extends AnonymousClass206 {
    public long A00;
    public C194409rg A01;
    public Integer A02 = AnonymousClass00R.A00;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass25F A09 = A0N(C692636n.class);
    public final AnonymousClass25F A0A = A0N(C692936q.class);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C445823z(AnonymousClass205 r2, Long l, String str, long j, long j2) {
        super(r2, 92, j);
        C18070vi.A0d(str, 3);
        this.A06 = str;
        this.A00 = j2;
        this.A03 = l;
    }

    public final void A19(AnonymousClass11S r5, UserJid userJid, AnonymousClass24H r7) {
        Object A0I;
        C18070vi.A0d(r7, 0);
        if (!A10(32)) {
            A0W(32);
        }
        if (r7.A0v.A02) {
            r5.A0I();
            A0I = r5.A0E;
        } else {
            A0I = r7.A0I();
        }
        AnonymousClass25F r2 = this.A0A;
        C18070vi.A0d(r2, 0);
        if (r2.A02 == null) {
            r2.A02(new C692936q(new LinkedHashMap()));
        }
        if (A0I == null) {
            Log.w("Event Response senderUserJid is null; Not adding to event message");
            return;
        }
        C692936q r0 = (C692936q) r2.A02;
        if (r0 != null) {
            Map map = r0.A00;
            map.put(A0I, r7);
            C41681wt.A03(map).remove(userJid);
        }
    }

    public final void A1A(AnonymousClass11S r4, List list) {
        C18070vi.A0d(r4, 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A19(r4, (UserJid) null, (AnonymousClass24H) it.next());
        }
    }

    public final C438421d A17() {
        C692636n r0 = (C692636n) this.A09.A02;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public final List A18() {
        Collection values;
        AnonymousClass25F r1 = this.A0A;
        C18070vi.A0d(r1, 0);
        C692936q r0 = (C692936q) r1.A02;
        if (r0 == null || (values = r0.A00.values()) == null) {
            return null;
        }
        return C29431cG.A0t(values);
    }

    public final void A1B(C445823z r3) {
        this.A06 = r3.A06;
        this.A00 = r3.A00;
        this.A03 = r3.A03;
        this.A04 = r3.A04;
        this.A01 = r3.A01;
        this.A05 = r3.A05;
        this.A08 = r3.A08;
        this.A02 = r3.A02;
        this.A07 = r3.A07;
    }
}
