package X;

import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.4nh  reason: invalid class name and case insensitive filesystem */
public abstract class C96344nh implements BC1 {
    public final C188679ho A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass1NN A02;
    public final AnonymousClass122 A03;
    public final AnonymousClass126 A04;
    public final AnonymousClass1PQ A05;

    public void C8g() {
        C188679ho r0 = this.A00;
        AnonymousClass1EB r3 = r0.A02;
        String str = r0.A04;
        List list = r0.A05;
        int i = r0.A00;
        Log.i("groupmgr/group_request/timeout/type: 14");
        this.A04.A1F.remove(r3);
        this.A03.BBM(this.A05.A07(r3, str, list, 3, i, AnonymousClass11P.A01(this.A01)));
        this.A02.A03(r3, false);
    }

    public void onError(int i) {
        C188679ho r0 = this.A00;
        AnonymousClass1EB r3 = r0.A02;
        String str = r0.A04;
        List list = r0.A05;
        int i2 = r0.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("groupmgr/request failed : ");
        A10.append(i);
        A10.append(" | ");
        A10.append(r3);
        A10.append(" | ");
        A10.append(14);
        C17890vO.A0w(A10);
        AnonymousClass126 r2 = this.A04;
        r2.A1F.remove(r3);
        int i3 = 2003;
        if (i != 406) {
            i3 = 2027;
            if (i != 412) {
                i3 = 2004;
                if (i != 429) {
                    i3 = 2002;
                    if (i != 500) {
                        i3 = 2001;
                    }
                }
            }
        }
        r2.A0O(i3, str);
        this.A03.BBM(this.A05.A07(r3, str, list, 3, i2, AnonymousClass11P.A01(this.A01)));
        this.A02.A03(r3, false);
    }

    public C96344nh(AnonymousClass11P r2, AnonymousClass1NN r3, AnonymousClass122 r4, AnonymousClass126 r5, C188679ho r6, AnonymousClass1PQ r7) {
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r7;
        this.A02 = r3;
        this.A00 = r6;
        List list = r6.A05;
        if (list != null) {
            Arrays.deepToString(list.toArray());
        }
    }

    public void C7e(AnonymousClass4OX r4, AnonymousClass1EC r5) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("groupmgr/request success : ");
        A10.append(r5);
        A10.append(" | ");
        C17900vP.A0o(A10, 14);
        this.A02.A03(this.A00.A02, false);
    }
}
