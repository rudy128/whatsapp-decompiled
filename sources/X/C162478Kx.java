package X;

import android.text.TextUtils;
import com.facebook.graphql.calls.GraphQlCallInput;
import java.util.ArrayList;

/* renamed from: X.8Kx  reason: invalid class name and case insensitive filesystem */
public final class C162478Kx extends C192519oX {
    public int A00;
    public final ArrayList A01 = C17880vN.A0z(32);

    public static void A02(C189819ju r2, GraphQlCallInput graphQlCallInput, Object obj) {
        C162478Kx A002 = r2.A00();
        A01(A002, obj, "context");
        graphQlCallInput.A02().A06(A002, "telemetry");
    }

    private void A03(String str) {
        if (!this.A02) {
            throw AnonymousClass000.A0n("Expected object to be mutable");
        } else if (TextUtils.isEmpty(str)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("key=");
            throw AnonymousClass001.A12(str, A10);
        }
    }

    public static C162478Kx A00(C189819ju r0, Object obj, String str) {
        C162478Kx A002 = r0.A00();
        A01(A002, obj, str);
        return A002;
    }

    public static void A01(C162478Kx r1, Object obj, String str) {
        r1.A03(str);
        ArrayList arrayList = r1.A01;
        arrayList.add(str);
        arrayList.add(obj);
        r1.A00++;
    }

    public void A06(C192519oX r1, String str) {
        A03(str);
        r1.A04();
        A01(this, r1, str);
        r1.A04();
        r1.A00 = this;
    }
}
