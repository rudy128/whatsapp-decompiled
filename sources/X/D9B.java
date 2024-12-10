package X;

import java.util.ArrayList;
import java.util.List;

public class D9B implements EBU {
    public final /* synthetic */ C26219Cv7 A00;
    public final /* synthetic */ String A01;

    public D9B(C26219Cv7 cv7, String str) {
        this.A00 = cv7;
        this.A01 = str;
    }

    public List BQL(String str, boolean z) {
        ArrayList A10 = C17880vN.A10(EBU.A00.BQL(str, z));
        String str2 = this.A01;
        if (str2 == null || str2.equals(str)) {
            DUP.A00(this, A10, 9);
            Object[] A1b = AnonymousClass3MW.A1b();
            AnonymousClass8BS.A1B(str2, A10, A1b);
            C25922Cog.A01("MediaCodecSelector", "%s dec order (sw first) %s", A1b);
        }
        return A10;
    }

    public C26125Csn BWO() {
        return EBU.A00.BWO();
    }
}
