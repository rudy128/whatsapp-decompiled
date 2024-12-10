package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.Me;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4b0  reason: invalid class name */
public class AnonymousClass4b0 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AnonymousClass4b0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String A0y;
        C87884Xl r4;
        Activity activity;
        AnonymousClass1FR r2;
        AnonymousClass1BI r1;
        boolean z;
        switch (this.A00) {
            case 0:
                List list = (List) this.A01;
                C37551pj r22 = (C37551pj) this.A02;
                Activity activity2 = (Activity) this.A03;
                if (list.size() == 1) {
                    Object obj = list.get(0);
                    C17960vV.A07(obj);
                    r22.A0I(activity2, (UserJid) obj);
                    return;
                }
                Intent A0A = C17880vN.A0A();
                A0A.setClassName(activity2.getPackageName(), "com.whatsapp.blocklist.BlockList");
                activity2.startActivity(A0A);
                return;
            case 1:
                Context context = (Context) this.A01;
                C132216mP r5 = (C132216mP) this.A02;
                Me me = (Me) this.A04;
                boolean A002 = ((AnonymousClass1MB) this.A03).A00();
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("catalog not available");
                if (me == null) {
                    A0y = "";
                } else {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append(" +");
                    A102.append(me.cc);
                    A0y = AnonymousClass000.A0y(me.number, A102);
                }
                context.startActivity(r5.A00.A00((Bundle) null, (AnonymousClass770) null, (Integer) null, AnonymousClass000.A0y(A0y, A10), (String) null, (ArrayList) null, (ArrayList) null, A002));
                return;
            case 2:
                r4 = (C87884Xl) this.A01;
                activity = (Activity) this.A02;
                r2 = (AnonymousClass1FR) this.A03;
                r1 = (AnonymousClass1BI) this.A04;
                AnonymousClass4Yv.A00(activity, 10);
                z = true;
                break;
            case 3:
                r4 = (C87884Xl) this.A01;
                activity = (Activity) this.A02;
                r2 = (AnonymousClass1FR) this.A03;
                r1 = (AnonymousClass1BI) this.A04;
                AnonymousClass4Yv.A00(activity, 10);
                z = false;
                break;
            default:
                Object obj2 = this.A03;
                Object obj3 = this.A04;
                C18070vi.A0d(dialogInterface, 4);
                ((AnonymousClass10I) this.A01).CGF(new C70733Ch(obj2, obj3, 40));
                dialogInterface.dismiss();
                ((AnonymousClass5ZY) this.A02).BEw();
                return;
        }
        C87884Xl.A00(activity, r2, r4, r1, z);
    }
}
