package X;

import android.content.pm.PackageInfo;
import com.whatsapp.Main;
import com.whatsapp.util.Log;

/* renamed from: X.2PM  reason: invalid class name */
public class AnonymousClass2PM extends A34 {
    public final String A00;
    public final /* synthetic */ Main A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2PM(Main main, String str) {
        super(main, true);
        this.A01 = main;
        this.A00 = str;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        String str;
        PackageInfo packageArchiveInfo = this.A01.getPackageManager().getPackageArchiveInfo(this.A00, 0);
        if (packageArchiveInfo == null || (str = packageArchiveInfo.versionName) == null) {
            return null;
        }
        return C49982Sr.A00(str);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C60022nG r4 = (C60022nG) obj;
        Main main = this.A01;
        main.A02 = null;
        if (r4 != null) {
            C60022nG A002 = C49982Sr.A00("2.24.24.78");
            C17960vV.A07(A002);
            if (r4.A00(A002) >= 1) {
                AnonymousClass4Yv.A01(main, 0);
                return;
            }
        }
        if (main.A05.A02) {
            Main.A0Q(main);
            return;
        }
        Log.i("main/gotoActivity");
        Main.A0V(main);
    }
}
