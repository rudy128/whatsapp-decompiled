package X;

import java.util.List;
import java.util.UUID;

/* renamed from: X.32B  reason: invalid class name */
public final class AnonymousClass32B implements C436620k {
    public /* bridge */ /* synthetic */ AnonymousClass206 BF7(AnonymousClass206 r6, AnonymousClass205 r7, long j) {
        AnonymousClass22H r62 = (AnonymousClass22H) r6;
        C18070vi.A0h(r62, r7);
        AnonymousClass22H r4 = new AnonymousClass22H(r7, j);
        String str = r62.A05;
        if (str == null) {
            str = "";
        }
        r4.A05 = str;
        List list = r62.A07;
        List list2 = r4.A07;
        list2.clear();
        list2.addAll(list);
        r4.A02 = r62.A02;
        r4.A03 = r62.A03;
        r4.A01 = r62.A01;
        r4.A04 = r62.A04;
        r4.A00 = r62.A00;
        if (r4.A0v.A02) {
            r4.A04 = UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
        }
        return r4;
    }
}
