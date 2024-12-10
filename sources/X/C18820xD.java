package X;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: X.0xD  reason: invalid class name and case insensitive filesystem */
public final class C18820xD {
    public static C18820xD A01;
    public static final long A02 = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern A03 = Pattern.compile("\\AA[\\w-]{38}\\z");
    public final C18810xC A00;

    public boolean A00(C24686CFk cFk) {
        C23572Bm0 bm0 = (C23572Bm0) cFk;
        if (TextUtils.isEmpty(bm0.A03) || bm0.A01 + bm0.A00 < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + A02) {
            return true;
        }
        return false;
    }

    public C18820xD(C18810xC r1) {
        this.A00 = r1;
    }
}
