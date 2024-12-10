package X;

import android.os.Bundle;
import android.util.Log;
import java.util.Map;

/* renamed from: X.1XJ  reason: invalid class name */
public class AnonymousClass1XJ implements AnonymousClass1GC {
    public final /* synthetic */ AnonymousClass1GP A00;
    public final /* synthetic */ AnonymousClass1XI A01;
    public final /* synthetic */ C23381Fv A02;
    public final /* synthetic */ String A03;

    public AnonymousClass1XJ(AnonymousClass1GP r1, AnonymousClass1XI r2, C23381Fv r3, String str) {
        this.A00 = r1;
        this.A03 = str;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void C6U(C27581Wq r5, AnonymousClass1F9 r6) {
        if (r5 == C27581Wq.ON_START) {
            Map map = this.A00.A0Y;
            String str = this.A03;
            Bundle bundle = (Bundle) map.get(str);
            if (bundle != null) {
                this.A01.Bv0(str, bundle);
                map.remove(str);
                if (AnonymousClass1GP.A0G(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Clearing fragment result with key ");
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        if (r5 == C27581Wq.ON_DESTROY) {
            this.A02.A06(this);
            this.A00.A0X.remove(this.A03);
        }
    }
}
