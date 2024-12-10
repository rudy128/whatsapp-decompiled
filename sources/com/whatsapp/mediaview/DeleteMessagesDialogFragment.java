package com.whatsapp.mediaview;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass18K;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1M9;
import X.AnonymousClass1MB;
import X.AnonymousClass1MZ;
import X.AnonymousClass1PM;
import X.AnonymousClass1W2;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4aU;
import X.AnonymousClass5YU;
import X.C010105w;
import X.C107825ag;
import X.C107835ah;
import X.C17880vN;
import X.C18000vb;
import X.C18030ve;
import X.C19830z4;
import X.C19880zA;
import X.C24921Me;
import X.C25241Nl;
import X.C25491Ok;
import X.C33251iW;
import X.C42211xo;
import X.C62242r5;
import X.C72463Mc;
import X.C87794Wz;
import X.C88224Yu;
import X.C91994ga;
import X.C92034ge;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class DeleteMessagesDialogFragment extends Hilt_DeleteMessagesDialogFragment {
    public C19880zA A00;
    public AnonymousClass1KB A01;
    public C33251iW A02;
    public AnonymousClass1M9 A03;
    public AnonymousClass1PM A04;
    public C24921Me A05;
    public C25491Ok A06;
    public AnonymousClass11P A07;
    public C19830z4 A08;
    public AnonymousClass1CJ A09;
    public AnonymousClass1MZ A0A;
    public AnonymousClass1KW A0B;
    public AnonymousClass18K A0C;
    public C25241Nl A0D;
    public AnonymousClass1MB A0E;
    public C87794Wz A0F;
    public AnonymousClass10I A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public final C107825ag A0N = new C91994ga(this, 1);
    public final C107835ah A0O = new C92034ge(this, 4);

    public static DeleteMessagesDialogFragment A00(AnonymousClass1BI r6, List list) {
        DeleteMessagesDialogFragment deleteMessagesDialogFragment = new DeleteMessagesDialogFragment();
        Bundle A0D2 = C17880vN.A0D();
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C72463Mc.A1L(A13, it);
        }
        AnonymousClass4aU.A0C(A0D2, A13);
        if (r6 != null) {
            AnonymousClass3MY.A15(A0D2, r6, "jid");
        }
        A0D2.putBoolean("is_revokable", true);
        deleteMessagesDialogFragment.A1R(A0D2);
        return deleteMessagesDialogFragment;
    }

    public Dialog A27(Bundle bundle) {
        ArrayList A042;
        Bundle bundle2 = this.A06;
        if (!(bundle2 == null || A1n() == null || (A042 = AnonymousClass4aU.A04(bundle2)) == null)) {
            LinkedHashSet A14 = C17880vN.A14();
            Iterator it = A042.iterator();
            while (it.hasNext()) {
                AnonymousClass206 A012 = AnonymousClass1W2.A01((AnonymousClass205) it.next(), this.A0H);
                if (A012 != null) {
                    A14.add(A012);
                }
            }
            AnonymousClass1BI A0f = C72463Mc.A0f(bundle2, "jid");
            boolean z = bundle2.getBoolean("is_revokable");
            String A013 = C88224Yu.A01(A1n(), this.A03, this.A05, A0f, A14);
            Context A1n = A1n();
            AnonymousClass11P r28 = this.A07;
            C18030ve r25 = this.A02;
            AnonymousClass1KB r22 = this.A01;
            AnonymousClass10I r21 = this.A0G;
            AnonymousClass18K r19 = this.A0C;
            AnonymousClass1KW r18 = this.A0B;
            C33251iW r23 = this.A02;
            AnonymousClass1M9 r24 = this.A03;
            C24921Me r17 = this.A05;
            C18000vb r15 = this.A01;
            C25491Ok r14 = this.A06;
            C42211xo A0i = AnonymousClass3MX.A0i(this.A0M);
            AnonymousClass1MB r13 = this.A0E;
            C25241Nl r12 = this.A0D;
            C19880zA r11 = this.A00;
            AnonymousClass1PM r8 = this.A04;
            C19830z4 r7 = this.A08;
            AnonymousClass1MZ r6 = this.A0A;
            C87794Wz r4 = this.A0F;
            C107825ag r3 = this.A0N;
            C107835ah r2 = this.A0O;
            AnonymousClass1CJ r1 = this.A09;
            C19880zA r172 = r11;
            C010105w A002 = C88224Yu.A00(A1n, r172, (C19880zA) this.A0I.get(), r3, (AnonymousClass5YU) null, r2, r22, r23, r24, r8, r17, r14, r28, r7, r15, r1, r6, r18, r25, r19, r12, A0i, r13, (C62242r5) this.A0L.get(), r4, r21, A013, A14, z);
            if (A002 != null) {
                return A002;
            }
        }
        A29();
        return super.A27(bundle);
    }
}
