package X;

import android.app.Activity;
import android.content.Intent;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import com.whatsapp.businessdirectory.view.activity.DirectoryBusinessChainingActivity;
import com.whatsapp.jid.Jid;

/* renamed from: X.9qO  reason: invalid class name and case insensitive filesystem */
public class C193619qO {
    public final AnonymousClass11S A00;
    public final AnonymousClass1XN A01;

    public void A00(Activity activity, AnonymousClass1E7 r6) {
        if (r6.A0J != null && A02(r6) && r6.A0L() != null) {
            AnonymousClass1BI r3 = r6.A0J;
            String A0L = r6.A0L();
            Intent A07 = AnonymousClass8BR.A07(activity, DirectoryBusinessChainingActivity.class);
            A07.putExtra("directory_biz_chaining_jid", r3);
            A07.putExtra("directory_biz_chaining_name", A0L);
            activity.startActivity(A07);
        }
    }

    public void A01(Activity activity, AnonymousClass1E7 r3) {
        if (r3.A0J != null && A02(r3) && r3.A0L() != null) {
            AnonymousClass8BT.A16(activity, BusinessDirectoryActivity.class);
        }
    }

    public boolean A02(AnonymousClass1E7 r5) {
        Jid A012;
        AnonymousClass1XN r2 = this.A01;
        C18030ve r3 = r2.A03;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r3, 1616) || !r2.A02() || !r5.A0C() || (((!C18020vd.A05(r1, r3, 2192) || !r2.A02()) && ((!C18020vd.A05(r1, r3, 1616) || !r2.A02() || !C18020vd.A05(r1, r3, 1764)) && ((A012 = AnonymousClass1E7.A01(r5)) == null || !A012.getRawString().startsWith("5511")))) || C42761yh.A00(r5, r2.A00))) {
            return false;
        }
        return true;
    }

    public C193619qO(AnonymousClass11S r1, AnonymousClass1XN r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
