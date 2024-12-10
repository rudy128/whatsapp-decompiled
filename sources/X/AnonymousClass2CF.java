package X;

import android.app.Activity;
import android.os.Bundle;
import com.whatsapp.LegacyMessageDialogFragment;
import java.util.List;

/* renamed from: X.2CF  reason: invalid class name */
public class AnonymousClass2CF extends C65802x8 {
    public final C56122gw A00;

    public /* bridge */ /* synthetic */ Object BKe(C199029zJ r13, C25681CkC ckC, String str) {
        C23736Boh boh = (C23736Boh) ckC;
        if (str.equals("bk.action.support.OpenContactSupport")) {
            List list = r13.A00;
            String A0w = C17880vN.A0w(list, 0);
            String A0w2 = C17880vN.A0w(list, 1);
            C56122gw r7 = this.A00;
            Activity A05 = ALS.A05(boh);
            C18070vi.A0d(A05, 0);
            C18070vi.A0e(A0w, 1, A0w2);
            if (!r7.A01.A09()) {
                String A0F = C18070vi.A0F(A05, 2131892932);
                String A0q = C17880vN.A0q(A05, A05.getString(2131888733), new Object[1], 0, 2131894998);
                C18070vi.A0X(A0q);
                C1411974r r5 = new C1411974r(22);
                LegacyMessageDialogFragment legacyMessageDialogFragment = new LegacyMessageDialogFragment();
                Bundle A0D = C17880vN.A0D();
                A0D.putInt("primary_action_text_id_res", 2131899286);
                A0D.putCharSequence("title", A0F);
                A0D.putCharSequence("message", A0q);
                legacyMessageDialogFragment.A00 = r5;
                legacyMessageDialogFragment.A1R(A0D);
                legacyMessageDialogFragment.A2C(((AnonymousClass1FL) A05).A03.A00.A03, (String) null);
            } else {
                AnonymousClass770 r10 = new AnonymousClass770(A0w2, A0w);
                AnonymousClass10I r9 = r7.A08;
                r9.CGF(new C70833Cr((Object) r7, (Object) A05, (Object) r9, (Object) r10, 44));
                return null;
            }
        }
        return null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2CF(X.C56122gw r4) {
        /*
            r3 = this;
            java.lang.String[] r2 = X.C17880vN.A1Y()
            r1 = 0
            java.lang.String r0 = "bk.action.support.OpenContactSupport"
            r2[r1] = r0
            r3.<init>(r2)
            r3.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2CF.<init>(X.2gw):void");
    }
}
