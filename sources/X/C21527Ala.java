package X;

import com.whatsapp.ohai.WaOhaiClient;
import com.whatsapp.ohai.WaTeeTLSSession;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Ala  reason: case insensitive filesystem */
public class C21527Ala implements C18080vj, C18090vk {
    public final int A00;

    public C21527Ala(int i) {
        this.A00 = i;
    }

    public static C18110vm A00(int i) {
        return AnonymousClass1DF.A01(new C21527Ala(i));
    }

    public final Object invoke() {
        switch (this.A00) {
            case 0:
                String[] strArr = new String[4];
                strArr[0] = "databases";
                strArr[1] = "shared_prefs";
                strArr[2] = "files";
                return C18070vi.A0O("cache", strArr, 3);
            case 1:
                return new ReentrantLock();
            case 2:
                return C17890vO.A0D();
            case 3:
                Field declaredField = C23577Bm6.class.getDeclaredField("unknownFields");
                declaredField.setAccessible(true);
                return declaredField;
            case 4:
                Field declaredField2 = C26042Cr6.class.getDeclaredField("count");
                declaredField2.setAccessible(true);
                return declaredField2;
            case 5:
                AnonymousClass4XD r0 = WaOhaiClient.A00;
                AnonymousClass1A8.A06("ohai");
                return C27621Wu.A00;
            case 6:
                return Long.valueOf(WaTeeTLSSession.create());
            case 7:
                return Collections.synchronizedSet(C17880vN.A12());
            case 8:
                return C34071js.A00((Object) null);
            case 9:
                return new AnonymousClass1G7(AnonymousClass9IB.NONE);
            case 10:
                return new AnonymousClass1G7(AnonymousClass9I3.DISABLED);
            case 11:
                return "0";
            case 12:
                Boolean bool = C17970vW.A01;
                return AnonymousClass000.A0i();
            case 13:
                return C17890vO.A0Q();
            case 14:
                return "sender jid cant be null in admin revoke";
            default:
                return null;
        }
    }
}
