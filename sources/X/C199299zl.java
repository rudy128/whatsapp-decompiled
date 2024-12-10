package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.9zl  reason: invalid class name and case insensitive filesystem */
public class C199299zl {
    public static final Double A03 = AnonymousClass8BV.A0Q();
    public final AnonymousClass190 A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass10I A02;

    public void A00(C195459tN r4) {
        String str = r4.A03;
        if (TextUtils.isEmpty(str)) {
            for (List A012 : r4.A04) {
                Log.e("DirectoryBusinessRankerValueModel/fallbackToSortByDistance Falling back to ranking by distance.");
                C21486Akr.A01(8, A012);
            }
            if (!r4.A00) {
                r4.A02.C2S();
                return;
            }
            return;
        }
        C21459AkQ.A01(this.A02, this, r4, str, 47);
    }

    public C199299zl(AnonymousClass190 r1, AnonymousClass1KB r2, AnonymousClass10I r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
