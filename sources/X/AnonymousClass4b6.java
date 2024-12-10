package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.4b6  reason: invalid class name */
public class AnonymousClass4b6 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public AnonymousClass4b6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj4;
        this.A04 = obj6;
        this.A05 = obj3;
        this.A06 = obj2;
        this.A02 = obj5;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                AnonymousClass1FR r4 = (AnonymousClass1FR) this.A01;
                C34511kb r7 = (C34511kb) this.A05;
                Object obj = this.A06;
                r4.CNB(0, 2131895077);
                Set singleton = Collections.singleton(obj);
                ((AnonymousClass10I) this.A02).CGD(new AnonymousClass2PS(new C91214fK(r4, obj, 0), (AnonymousClass1F9) this.A03, r7, (C34591kk) this.A04, singleton), new Object[0]);
                return;
            case 1:
                BDu bDu = (BDu) this.A02;
                AnonymousClass1BI r2 = (AnonymousClass1BI) this.A03;
                UserJid userJid = (UserJid) this.A04;
                AnonymousClass1KN r0 = (AnonymousClass1KN) this.A05;
                C55032f6 r42 = (C55032f6) this.A06;
                bDu.CEc();
                C20107A7l.A03(r0, (AEX) null, r2, userJid, r42, bDu, (C20107A7l) this.A01);
                return;
            default:
                Set set = (Set) this.A04;
                AnonymousClass1KB r72 = (AnonymousClass1KB) this.A05;
                Resources resources = (Resources) this.A06;
                C126466cm r5 = (C126466cm) this.A02;
                AnonymousClass4Yv.A00((Activity) this.A01, 13);
                ((C33251iW) this.A03).A0q(set, true);
                C18070vi.A0b(resources);
                if (set.size() == 1) {
                    r72.A08(2131896336, 0);
                } else {
                    int size = set.size();
                    Object[] objArr = new Object[1];
                    C17880vN.A1T(objArr, set.size(), 0);
                    r72.A0G(resources.getQuantityString(2131755412, size, objArr), 0);
                }
                if (r5 != null) {
                    MyStatusesActivity myStatusesActivity = r5.A00;
                    myStatusesActivity.A12.clear();
                    AnonymousClass02B r02 = myStatusesActivity.A00;
                    if (r02 != null) {
                        r02.A05();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
