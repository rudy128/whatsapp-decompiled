package X;

import android.text.TextUtils;
import android.util.LruCache;
import android.util.SparseArray;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.AHy  reason: case insensitive filesystem */
public class C20368AHy implements BDM {
    public final int A00;
    public final int A01;
    public final long A02;
    public final SparseArray A03;
    public final String A04;
    public final HashMap A05;
    public final List A06;
    public final Map A07;
    public final Map A08;
    public final Map A09;
    public final boolean A0A;

    public boolean equals(Object obj) {
        if (!(obj instanceof C20368AHy)) {
            return false;
        }
        C20368AHy aHy = (C20368AHy) obj;
        String str = this.A04;
        String str2 = aHy.A04;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        if (!this.A05.equals(aHy.A05)) {
            return false;
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            throw AnonymousClass000.A0s("equals");
        } else if (TextUtils.isEmpty((CharSequence) null)) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        int A0O = AnonymousClass000.A0O(this.A05, C17900vP.A00(this.A04) * 31);
        if (TextUtils.isEmpty((CharSequence) null)) {
            return A0O;
        }
        throw AnonymousClass000.A0s("hashCode");
    }

    public C20368AHy(C187839gS r6) {
        String str = r6.A01;
        this.A04 = str;
        HashMap hashMap = r6.A02;
        HashMap hashMap2 = hashMap;
        this.A05 = hashMap == null ? C17880vN.A11() : hashMap;
        this.A08 = C17880vN.A11();
        Map map = r6.A05;
        this.A09 = map == null ? C17880vN.A11() : map;
        int i = r6.A00;
        this.A01 = i <= 0 ? 719983200 : i;
        int A002 = (C17900vP.A00(str) * 31) + C17880vN.A02(hashMap2);
        if (TextUtils.isEmpty((CharSequence) null)) {
            synchronized (C197089w8.class) {
                LruCache lruCache = C197089w8.A00;
                Integer valueOf = Integer.valueOf(A002);
                Integer num = (Integer) lruCache.get(valueOf);
                A002 = num != null ? (num.intValue() + 1) * 31 : A002;
                lruCache.put(valueOf, Integer.valueOf(A002));
            }
            this.A00 = A002;
            this.A02 = AwakeTimeSinceBootClock.INSTANCE.now();
            this.A06 = r6.A03;
            this.A03 = new SparseArray();
            Map map2 = r6.A04;
            this.A07 = map2 == null ? C17880vN.A11() : map2;
            this.A0A = r6.A06;
            return;
        }
        throw AnonymousClass000.A0s("hashCode");
    }

    public String BVJ() {
        return "legacy_screen";
    }
}
