package X;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6pC  reason: invalid class name */
public final class AnonymousClass6pC {
    public final /* synthetic */ C136316tc A00;
    public final /* synthetic */ C132936nt A01;
    public final /* synthetic */ C130986kK A02;

    public AnonymousClass6pC(C136316tc r1, C132936nt r2, C130986kK r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void A00(int i, long j) {
        AnonymousClass1IX r0 = this.A00.A01;
        ArrayList A0D = C29351c6.A0D(r0);
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            C139886zb.A00(A0D, it);
        }
        List A0M = C18070vi.A0M(Long.valueOf(j));
        C130986kK r1 = this.A02;
        AnonymousClass74A.A06(r1.A02, (AnonymousClass2LF) C18070vi.A0E(r1.A08), r1.A09, A0M, A0D, 4);
        this.A01.A00(2, j, i);
    }

    public void A01(long j, String str) {
        C132936nt r2;
        int i;
        int i2;
        C136316tc r22 = this.A00;
        Map map = r22.A05;
        Long valueOf = Long.valueOf(j);
        C136066tD r0 = (C136066tD) map.get(valueOf);
        if (r0 == null) {
            C17960vV.A0F(false, "CrosspostMediaUploadManager/cached DB data map entry is empty");
            AnonymousClass1IX r02 = r22.A01;
            ArrayList A0D = C29351c6.A0D(r02);
            Iterator it = r02.iterator();
            while (it.hasNext()) {
                C139886zb.A00(A0D, it);
            }
            List A0M = C18070vi.A0M(valueOf);
            C130986kK r1 = this.A02;
            AnonymousClass74A.A06(r1.A02, (AnonymousClass2LF) C18070vi.A0E(r1.A08), r1.A09, A0M, A0D, 4);
            r2 = this.A01;
            i = 2;
            i2 = -12;
        } else {
            String str2 = str;
            map.put(valueOf, new C136066tD(r0.A03, r0.A02, str2, r0.A04, r0.A00));
            ContentValues A08 = C17880vN.A08();
            A08.put("direct_url_path", str);
            AnonymousClass73E.A02(A08, (AnonymousClass73E) this.A02.A09.get(), C18070vi.A0M(valueOf));
            r2 = this.A01;
            i = 1;
            i2 = 0;
        }
        r2.A00(i, j, i2);
    }
}
