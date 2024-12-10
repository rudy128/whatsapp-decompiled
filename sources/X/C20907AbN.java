package X;

import android.app.Activity;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.AbN  reason: case insensitive filesystem */
public final class C20907AbN implements C22521BBe {
    public final Activity A00;
    public final List A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Activity A03;
    public final /* synthetic */ AnonymousClass8nx A04;
    public final /* synthetic */ C20271AEe A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ HashMap A08;

    public C20907AbN(Activity activity, AnonymousClass8nx r3, C20271AEe aEe, Object obj, String str, String str2, HashMap hashMap, long j) {
        this.A03 = activity;
        this.A04 = r3;
        this.A06 = str;
        this.A02 = j;
        this.A05 = aEe;
        this.A07 = str2;
        this.A08 = hashMap;
        C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        List list = (List) obj;
        C18070vi.A0d(list, 2);
        this.A00 = activity;
        this.A01 = list;
    }

    public void Btu(C19980A1q a1q, Map map) {
        Log.e("AddressCaptureAction: FDS onFailure");
    }

    public void C7V(Map map) {
        String str;
        HashMap hashMap;
        Map map2 = map;
        if (map != null) {
            Activity activity = this.A03;
            C18070vi.A0z(activity, "null cannot be cast to non-null type com.whatsapp.conversation.ConversationInterface");
            AnonymousClass1BI A0l = AnonymousClass3MX.A0l(C22971Dz.A06(((C22559BCs) activity).getContact().A06(AnonymousClass1BI.class)));
            String str2 = "address_message";
            Object obj = null;
            if (map2.get(str2) instanceof String) {
                str = C17880vN.A0s(str2, map2);
                str2 = "params";
                if (!(map2.get(str2) instanceof HashMap)) {
                    hashMap = null;
                }
                hashMap = (HashMap) map2.get(str2);
            } else {
                str = C17880vN.A0s("body", map2);
                hashMap = (HashMap) map2.get(str2);
            }
            if (A0l != null && str != null && hashMap != null) {
                if (this.A01.contains("address_message_validate")) {
                    AbstractMap abstractMap = (AbstractMap) hashMap.get("values");
                    if (abstractMap != null) {
                        obj = abstractMap.get("in_pin_code");
                    }
                    AnonymousClass8nx r6 = this.A04;
                    ((C199409zx) r6.A01.get()).A01(new AM4(activity, r6, A0l, this.A05, this.A06, str, this.A07, hashMap, this.A08, this.A02), (String) obj, A0l.getRawString());
                    return;
                }
                activity.runOnUiThread(new C21385AjE(activity, this.A04, A0l, str, this.A06, hashMap, this.A02));
            }
        }
    }
}
