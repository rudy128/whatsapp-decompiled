package com.whatsapp.group;

import X.AnonymousClass00R;
import X.AnonymousClass02n;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass126;
import X.AnonymousClass12M;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DF;
import X.AnonymousClass1EC;
import X.AnonymousClass1FU;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1NN;
import X.AnonymousClass1VD;
import X.AnonymousClass2YG;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4RP;
import X.AnonymousClass4X6;
import X.AnonymousClass5SV;
import X.C000200d;
import X.C102805Hw;
import X.C104295Np;
import X.C104305Nq;
import X.C104315Nr;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C203511u;
import X.C72453Mb;
import X.C72463Mc;
import X.C88414Zp;
import X.C91084f7;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.List;
import java.util.Set;

public final class AddMembersRouter extends Hilt_AddMembersRouter {
    public AnonymousClass2YG A00;
    public AnonymousClass1CJ A01;
    public final C18100vl A02 = C88414Zp.A03(this, "entry_point", 6);
    public final C18100vl A03;
    public final C18100vl A04 = C88414Zp.A00(this, "is_cag_and_community_add");
    public final C18100vl A05;
    public final C18100vl A06 = C88414Zp.A03(this, "request_invite_members", 1);
    public final C18100vl A07;

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.02h] */
    public void A1z(Bundle bundle) {
        String str;
        int i;
        Intent className;
        super.A1z(bundle);
        C72453Mb.A1D(this.A0B);
        AnonymousClass2YG r1 = this.A00;
        if (r1 != null) {
            AnonymousClass1EC A0p = AnonymousClass3MX.A0p(this.A03);
            AnonymousClass1EC A0p2 = AnonymousClass3MX.A0p(this.A05);
            List A11 = AnonymousClass3MW.A11(this.A07);
            int A0I = C72453Mb.A0I(this.A06);
            boolean A1a = C72453Mb.A1a(this.A04);
            int A0I2 = C72453Mb.A0I(this.A02);
            C102805Hw r3 = new C102805Hw(this);
            AnonymousClass5SV r2 = new AnonymousClass5SV(this);
            AnonymousClass10E r0 = r1.A00.A02;
            AnonymousClass1MZ A0V = AnonymousClass3MY.A0V(r0);
            AnonymousClass1NN A0e = AnonymousClass3Ma.A0e(r0);
            AnonymousClass1KB A12 = AnonymousClass10E.A12(r0);
            AnonymousClass1LU A0Z = AnonymousClass3MY.A0Z(r0);
            AnonymousClass1M9 A4z = AnonymousClass10E.A4z(r0);
            AnonymousClass12M BA8 = r0.BA8();
            AnonymousClass10G r02 = r0.A00;
            AnonymousClass4X6 r6 = new AnonymousClass4X6(A14(), this, (AnonymousClass1FU) C72453Mb.A0Z(this), A12, AnonymousClass3MZ.A0d(r0), A4z, A0e, A0V, (AnonymousClass126) r0.A8y.get(), BA8, A0Z, A0p, A0p2, (AnonymousClass1VD) r0.A9J.get(), C000200d.A00(r02.A2L), C000200d.A00(r02.A2M), A11, r3, r2, A0I, A0I2, A1a);
            r6.A00 = r6.A04.CDw(new C91084f7(r6, 1), new Object());
            if (bundle == null) {
                List list = r6.A0D;
                list.isEmpty();
                AnonymousClass1VD r22 = r6.A0A;
                if (r22.A00.A02()) {
                    r6.A05.CMl(r22.A00());
                    return;
                } else if (list.isEmpty()) {
                    AnonymousClass02n r5 = r6.A00;
                    if (r5 == null) {
                        str = "addMembersCaller";
                    } else {
                        AnonymousClass1EC r7 = r6.A09;
                        if (r7 != null) {
                            boolean A1a2 = C72453Mb.A1a(r6.A0G);
                            AnonymousClass4RP A002 = ((C203511u) r6.A0B.get()).A00.A00(r7);
                            if (A1a2 && AnonymousClass3MX.A1Y(A002.A05) && !A002.A00()) {
                                Context context = r6.A03;
                                AnonymousClass1EC r8 = r6.A08;
                                boolean z = r6.A0I;
                                r6.A0C.get();
                                Set A0P = C18070vi.A0P("com.whatsapp.community.DirectoryContactsLoader");
                                i = r6.A01;
                                className = C17880vN.A0A().setClassName(context.getPackageName(), "com.whatsapp.contact.picker.AddGroupParticipantsSelector");
                                AnonymousClass3MY.A12(className, r8, "gid");
                                className.putExtra("parent_group_jid_to_link", r7.getRawString());
                                className.putExtra("is_cag_and_community_add", z);
                                className.putExtra("contacts_loader_keys", (String[]) A0P.toArray(new String[0]));
                                className.putExtra("entry_point", i);
                                r5.A03(className);
                                return;
                            }
                        }
                        Context context2 = r6.A03;
                        AnonymousClass1EC r4 = r6.A08;
                        boolean z2 = r6.A0I;
                        i = r6.A01;
                        className = C17880vN.A0A().setClassName(context2.getPackageName(), "com.whatsapp.contact.picker.AddGroupParticipantsSelector");
                        AnonymousClass3MY.A12(className, r4, "gid");
                        className.putExtra("parent_group_jid_to_link", C72463Mc.A0n(r7));
                        className.putExtra("is_cag_and_community_add", z2);
                        className.putExtra("entry_point", i);
                        r5.A03(className);
                        return;
                    }
                } else {
                    AnonymousClass4X6.A00(r6, list);
                    return;
                }
            } else {
                return;
            }
        } else {
            str = "addMembersResultHandlerFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public AddMembersRouter() {
        Integer num = AnonymousClass00R.A0C;
        this.A03 = AnonymousClass1DF.A00(num, new C104295Np(this));
        this.A05 = AnonymousClass1DF.A00(num, new C104305Nq(this));
        this.A07 = AnonymousClass1DF.A00(num, new C104315Nr(this));
    }
}
