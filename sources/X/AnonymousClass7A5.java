package X;

import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetLauncher;

/* renamed from: X.7A5  reason: invalid class name */
public class AnonymousClass7A5 implements AnonymousClass1XI {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7A5(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void Bv0(String str, Bundle bundle) {
        String str2;
        AnonymousClass1GP supportFragmentManager;
        switch (this.A00) {
            case 0:
                AiImagineBottomSheetLauncher.A03((Uri) this.A02, bundle, (AiImagineBottomSheetLauncher) this.A01, str);
                return;
            case 1:
                AnonymousClass4aY r3 = (AnonymousClass4aY) this.A01;
                AnonymousClass1FL r2 = (AnonymousClass1FL) this.A02;
                C18070vi.A0d(str, 2);
                str2 = "request_bottom_sheet_fragment";
                if (str.hashCode() == -860456940 && str.equals(str2) && r3 != null) {
                    AnonymousClass4aY.A0r(r3);
                }
                supportFragmentManager = r2.getSupportFragmentManager();
                break;
            default:
                C37731q2 r22 = (C37731q2) this.A01;
                AnonymousClass1FL r1 = (AnonymousClass1FL) this.A02;
                str2 = "request_bottom_sheet_fragment";
                if (str2.equals(str)) {
                    r22.A01();
                }
                supportFragmentManager = r1.getSupportFragmentManager();
                break;
        }
        supportFragmentManager.A0u(str2);
    }
}
