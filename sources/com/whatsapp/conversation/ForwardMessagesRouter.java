package com.whatsapp.conversation;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass2YF;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4PB;
import X.AnonymousClass5GB;
import X.AnonymousClass5N6;
import X.AnonymousClass727;
import X.C18070vi;
import X.C18100vl;
import X.C19880zA;
import X.C33251iW;
import X.C34511kb;
import X.C34531kd;
import X.C72453Mb;
import X.C88414Zp;
import X.C91084f7;
import X.C98774rh;
import android.content.Context;
import android.os.Bundle;

public final class ForwardMessagesRouter extends Hilt_ForwardMessagesRouter {
    public C19880zA A00;
    public AnonymousClass2YF A01;
    public AnonymousClass1KB A02;
    public C34511kb A03;
    public AnonymousClass4PB A04;
    public AnonymousClass1LU A05;
    public AnonymousClass10I A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public final C18100vl A09 = C88414Zp.A03(this, "entry_point", -1);
    public final C18100vl A0A = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5N6(this));
    public final C18100vl A0B = AnonymousClass1DF.A01(new AnonymousClass5GB(this));

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.02h] */
    public void A1z(Bundle bundle) {
        String str;
        super.A1z(bundle);
        C72453Mb.A1D(this.A0B);
        AnonymousClass2YF r0 = this.A01;
        if (r0 != null) {
            Context A14 = A14();
            AnonymousClass1FL A1D = A1D();
            AnonymousClass10E r02 = r0.A00.A02;
            C34531kd A0R = AnonymousClass3MZ.A0R(r02);
            AnonymousClass1LU A0Z = AnonymousClass3MY.A0Z(r02);
            AnonymousClass10I AL1 = AnonymousClass10E.AL1(r02);
            C33251iW A0U = AnonymousClass3MZ.A0U(r02);
            AnonymousClass4PB r5 = new AnonymousClass4PB(A1D, A14, this, AnonymousClass3MZ.A0N(r02), A0R, A0U, A0Z, (AnonymousClass727) r02.A00.A4e.get(), AL1, AnonymousClass3MX.A12(r02));
            r5.A00 = r5.A03.CDw(new C91084f7(r5, 0), new Object());
            this.A04 = r5;
            if (bundle == null) {
                AnonymousClass10I r1 = this.A06;
                if (r1 != null) {
                    C98774rh.A01(r1, this, 15);
                    return;
                }
                str = "waWorkers";
            } else {
                return;
            }
        } else {
            str = "forwardMessagesResultHandlerFactory";
        }
        C18070vi.A11(str);
        throw null;
    }
}
