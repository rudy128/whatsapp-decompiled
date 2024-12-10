package X;

import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1PK  reason: invalid class name */
public class AnonymousClass1PK {
    public final C18030ve A00;
    public final JniBridge A01;

    public static ArrayList A00(AnonymousClass1PK r5, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JniBridge jniBridge = r5.A01;
            Object jvidispatchOOO = JniBridge.jvidispatchOOO(1, jniBridge.wajContext.get(), ((C33801jP) it.next()).A00);
            if (jvidispatchOOO == null) {
                Log.e("wamsys/convertToNativePublicKeyList/public-key-conversion-failed");
                return null;
            }
            arrayList.add(jvidispatchOOO);
        }
        return arrayList;
    }

    public AnonymousClass1PK(C18030ve r1, JniBridge jniBridge) {
        this.A00 = r1;
        this.A01 = jniBridge;
    }
}
