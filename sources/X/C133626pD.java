package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.6pD  reason: invalid class name and case insensitive filesystem */
public final class C133626pD {
    public final /* synthetic */ C135586sR A00;
    public final /* synthetic */ C132956nv A01;
    public final /* synthetic */ C130946kG A02;

    public void A01(Integer num, int i, long j) {
        List A0M = C18070vi.A0M(Long.valueOf(j));
        C130946kG r1 = this.A02;
        AnonymousClass74B.A06(r1.A01, (AnonymousClass2LI) C18070vi.A0E(r1.A07), r1.A08, A0M, 4);
        this.A01.A00(num, 2, i, j);
    }

    public C133626pD(C135586sR r1, C132956nv r2, C130946kG r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void A00(long j, String str) {
        C132956nv r6;
        Integer num;
        int i;
        int i2;
        Map map = this.A00.A02;
        long j2 = j;
        Long valueOf = Long.valueOf(j);
        C135936t0 r0 = (C135936t0) map.get(valueOf);
        if (r0 == null) {
            C17960vV.A0F(false, "XFamilyCrosspostMediaUploadManager/cached DB data map entry is empty");
            List A0M = C18070vi.A0M(valueOf);
            C130946kG r1 = this.A02;
            AnonymousClass74B.A06(r1.A01, (AnonymousClass2LI) C18070vi.A0E(r1.A07), r1.A08, A0M, 4);
            r6 = this.A01;
            num = null;
            i = 2;
            i2 = -12;
        } else {
            long j3 = r0.A01;
            map.put(valueOf, new C135936t0(r0.A02, r0.A03, str, r0.A00, j3));
            ((AnonymousClass72Q) this.A02.A08.get()).A04(j, str);
            r6 = this.A01;
            num = null;
            i = 1;
            i2 = 0;
        }
        r6.A00(num, i, i2, j2);
    }
}
