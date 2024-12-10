package X;

import android.text.TextUtils;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

public class A5L {
    public Long A00;
    public boolean A01;
    public final C173738ve A02;
    public final AnonymousClass11P A03;
    public final C18030ve A04;
    public final AnonymousClass1XN A05;
    public final AtomicBoolean A06 = C108965cb.A0w();
    public final C219217x A07;

    public static Integer A00(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel) {
        return businessDirectoryContextualSearchViewModel.A0N.A04();
    }

    public static Integer A01(AnonymousClass8FD r0) {
        return r0.A0G.A04();
    }

    public C20079A6f A02() {
        try {
            C173738ve r3 = this.A02;
            String string = r3.A03.A00().getString("current_search_location", "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return C20079A6f.A01(C20015A3h.A00(r3.A00, r3.A02, string));
        } catch (Exception e) {
            Log.e("SearchLocationRepository/readSearchLocation: Failed to fetch the search location", e);
            return null;
        }
    }

    public boolean A05() {
        if (this.A05.A07()) {
            return this.A07.A06();
        }
        C173738ve r1 = this.A02;
        return r1.A03.A00().getBoolean("location_access_granted", r1.A00.A07());
    }

    public A5L(C173738ve r2, AnonymousClass11P r3, C219217x r4, C18030ve r5, AnonymousClass1XN r6) {
        this.A03 = r3;
        this.A04 = r5;
        this.A07 = r4;
        this.A05 = r6;
        this.A02 = r2;
    }

    public C20079A6f A03() {
        C20079A6f A022 = A02();
        if (A022 == null) {
            return null;
        }
        if ("device".equals(A022.A08) && (this.A01 || !this.A05.A07())) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l = this.A00;
            if (l == null || 86400000 < currentTimeMillis - l.longValue()) {
                return null;
            }
        }
        return A022;
    }

    public Integer A04() {
        int i;
        C20079A6f A022 = A02();
        if (A022 != null) {
            i = A022.A03();
        } else {
            i = 2;
        }
        return Integer.valueOf(i);
    }
}
