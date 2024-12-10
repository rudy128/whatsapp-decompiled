package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.AXq  reason: case insensitive filesystem */
public class C20761AXq implements C22444B8c {
    public ArrayList CB8(AnonymousClass1KI r5, C29621ca r6) {
        String str;
        ArrayList A13 = AnonymousClass000.A13();
        String str2 = r6.A00;
        if (str2.equals("card-update")) {
            try {
                C29621ca A0L = r6.A0L("card");
                AnonymousClass8pT r0 = new AnonymousClass8pT();
                r0.A05(r5, A0L, 0);
                A13.add(r0);
                return A13;
            } catch (AnonymousClass1UI unused) {
                str = "PAY: BrazilProtoParser/parse: no card node for card-update notification";
                Log.w(str);
                return A13;
            }
        } else {
            if (str2.equals("merchant-update")) {
                try {
                    C29621ca A0L2 = r6.A0L("merchant");
                    AnonymousClass8pZ r02 = new AnonymousClass8pZ();
                    r02.A05(r5, A0L2, 0);
                    A13.add(r02);
                    return A13;
                } catch (AnonymousClass1UI unused2) {
                    str = "PAY: BrazilProtoParser/parse: no merchant node for merchant-update notification";
                    Log.w(str);
                    return A13;
                }
            }
            return A13;
        }
    }
}
