package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4q8  reason: invalid class name and case insensitive filesystem */
public class C97834q8 implements C22525BBi {
    public final /* synthetic */ AnonymousClass3TA A00;

    public C97834q8(AnonymousClass3TA r1) {
        this.A00 = r1;
    }

    public void BuL(AnonymousClass77H r4) {
        AnonymousClass3TA r2 = this.A00;
        C143887Fe r1 = r2.A00;
        if (r1 != null && (r1 instanceof C75363hK)) {
            C75363hK r12 = (C75363hK) r1;
            r12.A00 = r4;
            String str = r4.A02;
            if (str != null) {
                r12.A0B = str;
            }
            String str2 = r4.A01;
            if (str2 != null) {
                r12.A0A = str2;
            }
            byte[] A01 = r4.A01();
            if (A01 != null) {
                r12.A0J = A01;
            }
            AnonymousClass3TA.A03(r2.A00, r2, AnonymousClass4DX.SMALL_THUMBNAIL_LOADED);
        }
    }

    public void BuK(Map map) {
        Iterator A0l = C17890vO.A0l(map);
        while (A0l.hasNext()) {
            C17890vO.A0w(A0l.next());
        }
        AnonymousClass3TA r2 = this.A00;
        C143887Fe r0 = r2.A00;
        if (r0 != null) {
            r2.A0Z((AnonymousClass1BI) null, r0.A0S);
        }
    }
}
