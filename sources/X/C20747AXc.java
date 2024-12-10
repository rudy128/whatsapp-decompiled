package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;

/* renamed from: X.AXc  reason: case insensitive filesystem */
public class C20747AXc implements C22555BCo {
    public final C184669bK A00;
    public final C19954A0l A01;

    public AnonymousClass1MD BLu(String str) {
        return null;
    }

    public boolean Bgh() {
        return false;
    }

    public String Bai(Resources resources, AW0 aw0, String str) {
        if (aw0.A02 == 420) {
            return resources.getString(2131897047, AnonymousClass8BV.A1b(str));
        }
        C184669bK r2 = this.A00;
        int A012 = C20099A7c.A01(aw0.A0J, -1);
        String A002 = r2.A01.A00(A012);
        if (A002 != null) {
            return A002;
        }
        if (A012 == 20727) {
            return r2.A00.A01(2131891189);
        }
        return null;
    }

    public void BcP(Context context, Intent intent, String str) {
        if (intent != null && (context instanceof AnonymousClass1FU)) {
            C19954A0l a0l = this.A01;
            if (C29431cG.A18(C19954A0l.A04, str)) {
                if (C18020vd.A05(C18040vf.A02, a0l.A00, 8558)) {
                    a0l.A00((AnonymousClass1FU) AnonymousClass1L9.A00(context), new C194529rs(intent.getExtras(), false, false), (AnonymousClass9YW) null);
                }
            }
        }
    }

    public boolean CMA(String str) {
        C19954A0l a0l = this.A01;
        if (C29431cG.A18(C19954A0l.A04, str)) {
            if (!C18020vd.A05(C18040vf.A02, a0l.A00, 8558)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C20747AXc(C184669bK r1, C19954A0l a0l) {
        this.A00 = r1;
        this.A01 = a0l;
    }
}
