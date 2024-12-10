package X;

import android.text.TextUtils;
import java.util.ArrayList;

public class AYU implements C22456B8o {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AYU(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void C3r(String str) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C20284AEs aEs = (C20284AEs) obj;
            C20923Abd abd = (C20923Abd) this.A02;
            AnonymousClass8pT r1 = (AnonymousClass8pT) aEs.A08;
            if (str == null || str.length() == 0 || r1 == null) {
                throw AnonymousClass000.A0s("fun buildPrepData tokenId must not be null");
            }
            r1.A05 = str;
            abd.A02 = str;
            abd.A0A.A01().A03((C22442B7y) null, aEs);
            return;
        }
        A0N a0n = (A0N) obj;
        C20284AEs aEs2 = (C20284AEs) this.A02;
        AnonymousClass8pT r12 = (AnonymousClass8pT) aEs2.A08;
        if (TextUtils.isEmpty(str) || r12 == null) {
            a0n.A02.BrN((AnonymousClass8pK) null, A7B.A00(), (ArrayList) null, false);
            return;
        }
        r12.A05 = str;
        A5I.A01(a0n.A01.A01(), aEs2, a0n, 4);
    }
}
