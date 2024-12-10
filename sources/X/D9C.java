package X;

import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class D9C implements EBU {
    public final /* synthetic */ C26219Cv7 A00;
    public final /* synthetic */ HashMap A01;

    public D9C(C26219Cv7 cv7, HashMap hashMap) {
        this.A00 = cv7;
        this.A01 = hashMap;
    }

    public List BQL(String str, boolean z) {
        int A0D;
        ArrayList A10 = C17880vN.A10(EBU.A00.BQL(str, z));
        HashMap hashMap = this.A01;
        if (hashMap != null && !hashMap.isEmpty()) {
            Iterator it = A10.iterator();
            while (it.hasNext()) {
                String str2 = ((C26125Csn) it.next()).A02;
                if (str2 != null) {
                    String lowerCase = str2.toLowerCase(Locale.ROOT);
                    if (hashMap.containsKey(lowerCase) && ((A0D = BE9.A0D(lowerCase, hashMap)) == -1 || Build.VERSION.SDK_INT < A0D)) {
                        it.remove();
                    }
                }
            }
        }
        if ("video/av01".equals(str)) {
            DUP.A00(this, A10, 10);
            Object[] A1b = AnonymousClass3MW.A1b();
            AnonymousClass001.A1Q("video/av01", A10, A1b);
            C25922Cog.A01("MediaCodecSelector", "%s dec order (hw first) %s", A1b);
        }
        return A10;
    }

    public C26125Csn BWO() {
        return EBU.A00.BWO();
    }
}
