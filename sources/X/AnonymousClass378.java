package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.378  reason: invalid class name */
public class AnonymousClass378 implements AnonymousClass1O5 {
    public final long A00;
    public final AnonymousClass1OZ A01;
    public final long A02;
    public final AnonymousClass1U4 A03;
    public final boolean A04;

    public void BrD(String str) {
        C17880vN.A1F(C19830z4.A00(this.A03.A02), "adv_key_index_list_require_update", true);
    }

    public void Bt9(C29621ca r4, String str) {
        C29621ca A0K = r4.A0K("error");
        int i = -1;
        if (A0K != null) {
            i = A0K.A0A("code", -1);
        }
        this.A03.A04(i);
    }

    public void C7Z(C29621ca r12, String str) {
        long j;
        C29621ca A0K = r12.A0K("retry-ts");
        if (A0K != null) {
            String A022 = C29621ca.A02(A0K, "ts");
            if (!TextUtils.isEmpty(A022)) {
                j = C20099A7c.A04(A022, -1);
            } else {
                j = -1;
            }
            if (this.A04 || j == -1) {
                this.A03.A04(-1);
                return;
            }
            AnonymousClass1U4 r2 = this.A03;
            long j2 = this.A02;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("DeviceKeyIndexListUpdateHandler/onRetry advTs=");
            A10.append(j);
            C17900vP.A0l(" serverTs=", A10, j2);
            AnonymousClass1U4.A00(r2, j, j2, true);
            return;
        }
        AnonymousClass1U4 r5 = this.A03;
        long j3 = this.A00;
        long j4 = this.A02;
        r5.A00.A06(j3);
        AnonymousClass1RK r9 = r5.A03;
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = r9.A06().iterator();
        while (it.hasNext()) {
            C88344Zh r7 = (C88344Zh) it.next();
            if (AnonymousClass000.A1R((r7.A01 > 0 ? 1 : (r7.A01 == 0 ? 0 : -1))) && r7.A01 < j4) {
                A13.add(r7.A08);
            }
        }
        r9.A0H.A08(C199410f.copyOf((Collection) A13));
    }

    public AnonymousClass378(AnonymousClass1U4 r1, AnonymousClass1OZ r2, long j, long j2, boolean z) {
        this.A01 = r2;
        this.A04 = z;
        this.A00 = j;
        this.A02 = j2;
        this.A03 = r1;
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
