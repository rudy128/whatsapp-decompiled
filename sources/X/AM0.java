package X;

import android.content.Intent;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import java.util.ArrayList;

public final /* synthetic */ class AM0 implements C107045Ye {
    public final /* synthetic */ A6L A00;
    public final /* synthetic */ WaBloksActivity A01;
    public final /* synthetic */ String A02;

    public final boolean Bky(Intent intent, int i, int i2) {
        A6L a6l = this.A00;
        String str = this.A02;
        WaBloksActivity waBloksActivity = this.A01;
        if (i2 != -1 || i != 1) {
            return false;
        }
        ArrayList A0A = C22971Dz.A0A(AnonymousClass1BI.class, intent.getStringArrayListExtra("jids"));
        if (A0A.isEmpty()) {
            return true;
        }
        ((BDO) a6l.A0a.get()).CFZ(new AnonymousClass7M1(a6l, waBloksActivity, str, A0A), str);
        return true;
    }

    public /* synthetic */ AM0(A6L a6l, WaBloksActivity waBloksActivity, String str) {
        this.A00 = a6l;
        this.A02 = str;
        this.A01 = waBloksActivity;
    }
}
