package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.05v  reason: invalid class name */
public final class AnonymousClass05v extends C005302h {
    public static Intent A00(String str) {
        C18070vi.A0d(str, 1);
        return AnonymousClass0D3.A00(new String[]{str});
    }

    public static C03160Gv A01(Context context, String str) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(str, 1);
        if (C19740yt.A01(context, str) == 0) {
            return new C03160Gv(true);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Object A05(Intent intent, int i) {
        int[] intArrayExtra;
        boolean z = false;
        if (intent != null && i == -1 && (intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS")) != null) {
            int length = intArrayExtra.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (intArrayExtra[i2] == 0) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public /* bridge */ /* synthetic */ Intent A03(Context context, Object obj) {
        return A00((String) obj);
    }

    public /* bridge */ /* synthetic */ C03160Gv A04(Context context, Object obj) {
        return A01(context, (String) obj);
    }
}
