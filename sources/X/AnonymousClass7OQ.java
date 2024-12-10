package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wabloks.commerce.interpreter.actions.FetchCatalogAction$perform$1$2;
import java.util.List;
import java.util.Map;

/* renamed from: X.7OQ  reason: invalid class name */
public final class AnonymousClass7OQ implements B9Y {
    public final C56612hk A00;
    public final C189949k7 A01;
    public final AnonymousClass10I A02;
    public final C18600wl A03;
    public final AnonymousClass1KB A04;
    public final AnonymousClass181 A05;
    public final AnonymousClass11E A06;
    public final C19830z4 A07;
    public final AnonymousClass122 A08;
    public final C18030ve A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass1OX A0B;

    private final void A02(Activity activity, A45 a45, String str, Map map, boolean z) {
        C99834tX.A0L(map);
        Activity activity2 = activity;
        this.A04.A0J(new AnonymousClass3CO(activity2, this, a45, map, str, 3, z));
    }

    public static final void A00(Activity activity, A45 a45, C138506xC r4, AnonymousClass7OQ r5, boolean z) {
        AnonymousClass7OQ r1 = r5;
        if (r4.A00 == 0) {
            r1.A02(activity, a45, "success", A3M.A01((String) r4.A03.A00), z);
        } else {
            A01(activity, a45, r5, z);
        }
    }

    public static final void A01(Activity activity, A45 a45, AnonymousClass7OQ r7, boolean z) {
        AnonymousClass7OQ r0 = r7;
        r0.A02(activity, a45, "error", AnonymousClass1D7.A0I(), z);
    }

    public void CBS(Activity activity, A45 a45, Map map) {
        Intent intent;
        Bundle extras;
        Object obj;
        boolean z;
        Activity activity2 = activity;
        if (activity != null && (intent = activity2.getIntent()) != null && (extras = intent.getExtras()) != null) {
            UserJid A022 = C22941Dw.A02(extras.getString("chat_id"));
            A45 a452 = a45;
            if (A022 != null) {
                Map map2 = map;
                if (map != null && map2.containsKey("catalog_id") && map2.containsKey("retailer_ids")) {
                    Object obj2 = map2.get("retailer_ids");
                    C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
                    List A012 = C41681wt.A01(obj2);
                    Object obj3 = map2.get("catalog_id");
                    C18070vi.A0z(obj3, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj3;
                    Object obj4 = "360";
                    if (map2.containsKey("height")) {
                        obj = map2.get("height");
                    } else {
                        obj = obj4;
                    }
                    if (map2.containsKey("width")) {
                        obj4 = map2.get("width");
                    }
                    if (map2.containsKey("show_full_screen_error")) {
                        Object obj5 = map2.get("show_full_screen_error");
                        C18070vi.A0z(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                        z = AnonymousClass000.A1Y(obj5);
                    } else {
                        z = false;
                    }
                    C18070vi.A0b(A022);
                    A20 a20 = new A20(A022, String.valueOf(obj4), String.valueOf(obj), A012);
                    if (C18020vd.A05(C18040vf.A02, this.A09, 5764)) {
                        AnonymousClass3MX.A1Q(new FetchCatalogAction$perform$1$2(activity2, a20, a452, this, str, (C30391dr) null, z), this.A0B);
                        return;
                    }
                    this.A02.CGF(new AnonymousClass3CO(this, a20, activity2, a452, str, 4, z));
                    return;
                }
            }
            A02(activity2, a452, "error", AnonymousClass1D7.A0I(), true);
        }
    }

    public AnonymousClass7OQ(C56612hk r1, AnonymousClass1KB r2, AnonymousClass181 r3, C189949k7 r4, AnonymousClass11E r5, C19830z4 r6, AnonymousClass122 r7, C18030ve r8, AnonymousClass10I r9, AnonymousClass00H r10, C18600wl r11, AnonymousClass1OX r12) {
        C18070vi.A0w(r4, r9, r7, r2, r10);
        C18070vi.A0x(r5, r8, r3, r1, r6);
        C72473Md.A1L(r11, r12);
        this.A01 = r4;
        this.A02 = r9;
        this.A08 = r7;
        this.A04 = r2;
        this.A0A = r10;
        this.A06 = r5;
        this.A09 = r8;
        this.A05 = r3;
        this.A00 = r1;
        this.A07 = r6;
        this.A03 = r11;
        this.A0B = r12;
    }
}
