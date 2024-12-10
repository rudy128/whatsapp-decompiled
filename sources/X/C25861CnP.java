package X;

import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.List;

/* renamed from: X.CnP  reason: case insensitive filesystem */
public abstract class C25861CnP {
    public static final void A00(Spannable spannable, int i, int i2, long j) {
        if (j != C05100Qk.A05) {
            spannable.setSpan(new ForegroundColorSpan(AnonymousClass0Oy.A00(j)), i, i2, 33);
        }
    }

    public static final void A01(Spannable spannable, DUE due, int i, int i2) {
        int i3;
        List list;
        LocaleSpan localeSpan;
        if (due != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = C25288Ccq.A00(due);
            } else {
                if (due.isEmpty()) {
                    i3 = 0;
                    list = CE6.A00.BPq().A01;
                } else {
                    i3 = 0;
                    list = due.A01;
                }
                localeSpan = new LocaleSpan(C25756ClR.A00(list.get(i3)));
            }
            spannable.setSpan(localeSpan, i, i2, 33);
        }
    }

    public static final void A02(Spannable spannable, C28644ECa eCa, int i, int i2, long j) {
        Object relativeSizeSpan;
        long A00 = C26130Cst.A00(j);
        if (A00 == 4294967296L) {
            relativeSizeSpan = new AbsoluteSizeSpan(C22339B3q.A01(eCa.CPP(j)), false);
        } else if (A00 == 8589934592L) {
            relativeSizeSpan = new RelativeSizeSpan(AnonymousClass001.A01(j));
        } else {
            return;
        }
        spannable.setSpan(relativeSizeSpan, i, i2, 33);
    }
}
