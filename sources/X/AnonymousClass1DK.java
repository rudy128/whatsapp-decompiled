package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1DK  reason: invalid class name */
public class AnonymousClass1DK {
    public C201110w A00;
    public final AnonymousClass00H A01;

    public C201110w A00() {
        C201110w r0;
        synchronized (this) {
            r0 = this.A00;
            if (r0 == null) {
                HashMap hashMap = new HashMap();
                for (C28381a4 r3 : (Set) this.A01.get()) {
                    C17960vV.A07(r3);
                    String str = r3.A05;
                    C17960vV.A07(str);
                    if (hashMap.containsKey(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("MigrationRegistry/addMigration/duplicate; name=");
                        sb.append(str);
                        Log.w(sb.toString());
                    }
                    hashMap.put(str, r3);
                }
                r0 = C201110w.copyOf((Map) hashMap);
                this.A00 = r0;
            }
        }
        return r0;
    }

    public AnonymousClass1DK(AnonymousClass00H r1) {
        this.A01 = r1;
    }

    public final C28381a4 A01(String str) {
        return (C28381a4) A00().get(str);
    }
}
