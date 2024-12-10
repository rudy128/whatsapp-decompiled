package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.05q  reason: invalid class name */
public class AnonymousClass05q extends AnonymousClass02n {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public AnonymousClass05q(AnonymousClass01M r1, C005302h r2, String str, int i) {
        this.A00 = i;
        this.A02 = r1;
        this.A03 = str;
        this.A01 = r2;
    }

    public C005302h A00() {
        return (C005302h) this.A01;
    }

    public void A01() {
        ((AnonymousClass01M) this.A02).A08(this.A03);
    }

    public void A02(C1406772n r6, Object obj) {
        int i = this.A00;
        AnonymousClass01M r4 = (AnonymousClass01M) this.A02;
        Map map = r4.A02;
        String str = this.A03;
        Object obj2 = map.get(str);
        C005302h r2 = (C005302h) this.A01;
        if (i != 0) {
            if (obj2 == null) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                A10.append(r2);
                A10.append(" and input ");
                A10.append(obj);
                throw AnonymousClass000.A0o(". You must ensure the ActivityResultLauncher is registered before calling launch().", A10);
            }
        } else if (obj2 == null) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            A102.append(r2);
            A102.append(" and input ");
            A102.append(obj);
            throw AnonymousClass000.A0o(". You must ensure the ActivityResultLauncher is registered before calling launch().", A102);
        }
        int A0M = AnonymousClass000.A0M(obj2);
        List list = r4.A01;
        list.add(str);
        try {
            r4.A07(r2, r6, obj, A0M);
        } catch (Exception e) {
            list.remove(str);
            throw e;
        }
    }
}
