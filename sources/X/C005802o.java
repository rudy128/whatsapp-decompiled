package X;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.02o  reason: invalid class name and case insensitive filesystem */
public final class C005802o extends C005302h {
    public static Intent A00(String[] strArr) {
        C18070vi.A0d(strArr, 1);
        return AnonymousClass0D3.A00(strArr);
    }

    public static C03160Gv A01(Context context, String[] strArr) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(strArr, 1);
        int length = strArr.length;
        if (length == 0) {
            return new C03160Gv(AnonymousClass1D7.A0I());
        }
        int i = 0;
        int i2 = 0;
        while (C19740yt.A01(context, strArr[i2]) == 0) {
            i2++;
            if (i2 >= length) {
                int A03 = C200610r.A03(length);
                if (A03 < 16) {
                    A03 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(A03);
                do {
                    AnonymousClass1D6 A00 = AnonymousClass6YK.A00(strArr[i], true);
                    linkedHashMap.put(A00.A06(), A00.A07());
                    i++;
                } while (i < length);
                return new C03160Gv(linkedHashMap);
            }
        }
        return null;
    }

    public static Map A02(Intent intent, int i) {
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (!(intArrayExtra == null || stringArrayExtra == null)) {
                ArrayList arrayList = new ArrayList(r4);
                for (int i2 : intArrayExtra) {
                    boolean z = false;
                    if (i2 == 0) {
                        z = true;
                    }
                    arrayList.add(Boolean.valueOf(z));
                }
                return AnonymousClass1D7.A0D(C29431cG.A0j(C200410p.A0P(stringArrayExtra), arrayList));
            }
        }
        return AnonymousClass1D7.A0I();
    }

    public /* bridge */ /* synthetic */ Intent A03(Context context, Object obj) {
        return A00((String[]) obj);
    }

    public /* bridge */ /* synthetic */ C03160Gv A04(Context context, Object obj) {
        return A01(context, (String[]) obj);
    }

    public /* bridge */ /* synthetic */ Object A05(Intent intent, int i) {
        return A02(intent, i);
    }
}
