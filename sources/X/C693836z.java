package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.36z  reason: invalid class name and case insensitive filesystem */
public final class C693836z implements AnonymousClass1O5 {
    public final AnonymousClass1OZ A00;
    public final C52902bf A01;

    public C693836z(C52902bf r2, AnonymousClass1OZ r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
        this.A01 = r2;
    }

    public void C7Z(C29621ca r5, String str) {
        Map map;
        C18070vi.A0d(r5, 1);
        C29621ca A0I = r5.A0I();
        C18070vi.A0X(A0I);
        C29621ca.A04(A0I, "privacy");
        C29621ca[] r0 = A0I.A02;
        if (r0 != null) {
            map = AnonymousClass1D7.A0H(AnonymousClass1b2.A0A(new AnonymousClass7S5(3), AnonymousClass1b2.A0A(new AnonymousClass7SB((Object) A0I, 45), new C99434so(new C25411Oc(0, r0.length - 1), 4))));
        } else {
            map = AnonymousClass1CQ.A00;
            C18070vi.A0z(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        }
        C52902bf r2 = this.A01;
        C57732jY r1 = r2.A00;
        if (r1 != null) {
            r1.A00(3);
        }
        r2.A01.A04(map);
    }

    public void Bt9(C29621ca r2, String str) {
        Log.e("PrivacySettingsProtocolHelper/onError");
    }

    public void BrD(String str) {
        C17900vP.A0g("PrivacySettingsProtocolHelper/onDeliveryFailure iqId=", str, C18070vi.A0K(str));
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
