package X;

import com.whatsapp.util.Log;

/* renamed from: X.2yo  reason: invalid class name and case insensitive filesystem */
public final class C66832yo implements AnonymousClass1UP {
    public final /* synthetic */ C678831f A00;

    public void BcR(C53372cQ r4, String str) {
        C18070vi.A0d(str, 0);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ContactQuerySync/result sid=");
        A10.append(str);
        C17900vP.A0j(" index=", A10, 0);
        this.A00.A02.put(str, r4);
    }

    public C66832yo(C678831f r1) {
        this.A00 = r1;
    }

    public void BcQ(AnonymousClass2R1 r5, String str, int i, long j) {
        if (j > 0) {
            C678831f r3 = this.A00;
            long A01 = AnonymousClass11P.A01(r3.A01) + j;
            C26861Tt r32 = r3.A00;
            r32.A04(A01);
            if (i == 503) {
                Log.e("ContactQuerySync/handleSyncContactError need global backoff");
                r32.A03(A01);
            }
        }
    }

    public void BcS(int i, String str, long j) {
        throw C17880vN.A0y();
    }
}
