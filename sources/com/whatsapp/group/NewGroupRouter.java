package com.whatsapp.group;

import X.AnonymousClass00R;
import X.AnonymousClass02n;
import X.AnonymousClass10E;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1LU;
import X.AnonymousClass2YH;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C104345Nu;
import X.C104355Nv;
import X.C104365Nw;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C22971Dz;
import X.C72453Mb;
import X.C72463Mc;
import X.C85844Oy;
import X.C88414Zp;
import X.C91084f7;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Collection;

public final class NewGroupRouter extends Hilt_NewGroupRouter {
    public AnonymousClass2YH A00;
    public AnonymousClass1LU A01;
    public final C18100vl A02;
    public final C18100vl A03 = C88414Zp.A00(this, "create_lazily");
    public final C18100vl A04 = C88414Zp.A00(this, "duplicate_ug_found");
    public final C18100vl A05 = C88414Zp.A03(this, "entry_point", -1);
    public final C18100vl A06;
    public final C18100vl A07;
    public final C18100vl A08 = C88414Zp.A00(this, "optional_participants");
    public final C18100vl A09;
    public final C18100vl A0A;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.02h] */
    public void A1z(Bundle bundle) {
        String str;
        super.A1z(bundle);
        C72453Mb.A1D(this.A0B);
        AnonymousClass2YH r0 = this.A00;
        if (r0 != null) {
            Context A14 = A14();
            AnonymousClass1FL A1D = A1D();
            AnonymousClass10E r02 = r0.A00.A02;
            C85844Oy r4 = new C85844Oy(A1D, A14, this, AnonymousClass3MZ.A0N(r02), AnonymousClass3Ma.A0d(r02), AnonymousClass10E.A8r(r02));
            r4.A00 = r4.A03.CDw(new C91084f7(r4, 2), new Object());
            if (bundle != null) {
                return;
            }
            if (this.A01 != null) {
                Context A142 = A14();
                Intent A0A2 = C17880vN.A0A();
                A0A2.setClassName(A142.getPackageName(), "com.whatsapp.group.newgroup.NewGroup");
                A0A2.putExtra("duplicate_ug_exists", C72453Mb.A1a(this.A04));
                A0A2.putExtra("entry_point", C72453Mb.A0I(this.A05));
                A0A2.putExtra("create_group_for_community", C72453Mb.A1a(this.A03));
                A0A2.putExtra("optional_participants", C72453Mb.A1a(this.A08));
                A0A2.putExtra("selected", C22971Dz.A0B((Collection) this.A0A.getValue()));
                A0A2.putExtra("parent_group_jid_to_link", C72463Mc.A0n(AnonymousClass3MW.A0h(this.A09)));
                A0A2.putExtra("messages_to_forward_bundle", (Bundle) this.A07.getValue());
                A0A2.putExtra("include_captions", C72453Mb.A1a(this.A06));
                A0A2.putExtra("appended_message", AnonymousClass3MW.A0y(this.A02));
                AnonymousClass02n r03 = r4.A00;
                if (r03 != null) {
                    r03.A03(A0A2);
                    return;
                }
                str = "createGroup";
            } else {
                str = "waIntents";
            }
        } else {
            str = "createGroupResultHandlerFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public NewGroupRouter() {
        Integer num = AnonymousClass00R.A0C;
        this.A0A = AnonymousClass1DF.A00(num, new C104365Nw(this));
        this.A09 = AnonymousClass1DF.A00(num, new C104355Nv(this));
        this.A07 = AnonymousClass1DF.A00(num, new C104345Nu(this));
        this.A06 = C88414Zp.A00(this, "include_captions");
        this.A02 = C88414Zp.A01(this, "appended_message");
    }
}
