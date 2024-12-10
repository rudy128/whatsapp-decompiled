package X;

import com.whatsapp.wabloks.ui.WaBloksActivity;
import java.util.List;
import java.util.Map;

/* renamed from: X.7M1  reason: invalid class name */
public class AnonymousClass7M1 implements C22525BBi {
    public final /* synthetic */ A6L A00;
    public final /* synthetic */ WaBloksActivity A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public AnonymousClass7M1(A6L a6l, WaBloksActivity waBloksActivity, String str, List list) {
        this.A00 = a6l;
        this.A03 = list;
        this.A01 = waBloksActivity;
        this.A02 = str;
    }

    public void BuK(Map map) {
        A6L.A02(this.A01, this.A02);
    }

    public void BuL(AnonymousClass77H r13) {
        if (!r13.A00()) {
            A6L a6l = this.A00;
            List list = this.A03;
            String str = r13.A00;
            String str2 = r13.A02;
            String str3 = r13.A01;
            WaBloksActivity waBloksActivity = this.A01;
            ((C33251iW) a6l.A0e.get()).A0f((AnonymousClass206) null, str, str2, str3, waBloksActivity.getString(2131896871), list, r13.A01());
            if (list.size() == 1) {
                waBloksActivity.startActivity(C108945cZ.A0h(a6l.A0i).A1w(waBloksActivity, C108945cZ.A0i(list, 0), 0));
                return;
            }
            return;
        }
        A6L.A02(this.A01, this.A02);
    }
}
