package com.whatsapp.group;

import X.AnonymousClass00R;
import X.AnonymousClass02n;
import X.AnonymousClass10E;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1LU;
import X.AnonymousClass1OX;
import X.AnonymousClass2YJ;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass4RX;
import X.C104385Ny;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C27011Uj;
import X.C72453Mb;
import X.C72463Mc;
import X.C88414Zp;
import X.C91084f7;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;

public final class SuggestGroupRouter extends Hilt_SuggestGroupRouter {
    public AnonymousClass2YJ A00;
    public AnonymousClass1LU A01;
    public final C18100vl A02 = C88414Zp.A03(this, "entry_point", -1);
    public final C18100vl A03 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C104385Ny(this));

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.02h] */
    public void A1z(Bundle bundle) {
        String str;
        super.A1z(bundle);
        C72453Mb.A1D(this.A0B);
        AnonymousClass2YJ r0 = this.A00;
        if (r0 != null) {
            Context A14 = A14();
            AnonymousClass1FL A1D = A1D();
            AnonymousClass10E r1 = r0.A00.A02;
            C18030ve A8r = AnonymousClass10E.A8r(r1);
            AnonymousClass4RX r5 = new AnonymousClass4RX(A1D, A14, this, AnonymousClass10E.A12(r1), (MemberSuggestedGroupsManager) r1.A6F.get(), AnonymousClass3Ma.A0a(r1), A8r, (CreateSubGroupSuggestionProtocolHelper) r1.A00.A1C.get(), C27011Uj.A00(), (AnonymousClass1OX) r1.A9C.get());
            r5.A00 = r5.A02.CDw(new C91084f7(r5, 3), new Object());
            if (bundle != null) {
                return;
            }
            if (this.A01 != null) {
                Context A142 = A14();
                Intent A0A = C17880vN.A0A();
                A0A.setClassName(A142.getPackageName(), "com.whatsapp.group.newgroup.NewGroup");
                A0A.putExtra("entry_point", C72453Mb.A0I(this.A02));
                A0A.putExtra("parent_group_jid_to_link", C72463Mc.A0n(AnonymousClass3MW.A0h(this.A03)));
                AnonymousClass02n r02 = r5.A00;
                if (r02 != null) {
                    r02.A03(A0A);
                    return;
                }
                str = "suggestGroup";
            } else {
                str = "waIntents";
            }
        } else {
            str = "suggestGroupResultHandlerFactory";
        }
        C18070vi.A11(str);
        throw null;
    }
}
