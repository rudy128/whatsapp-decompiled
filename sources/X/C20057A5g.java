package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;

/* renamed from: X.A5g  reason: case insensitive filesystem */
public abstract class C20057A5g {
    public static C21132Af0 A00(Context context, Intent intent, AnonymousClass1KB r18, C20114A7x a7x, A8Q a8q, CatalogManager catalogManager, UserJid userJid, String str, boolean z) {
        boolean z2;
        C21132Af0 af0 = new C21132Af0();
        UserJid userJid2 = userJid;
        String str2 = str;
        Context context2 = context;
        Intent intent2 = intent;
        boolean z3 = z;
        if (a7x.A0A(userJid2, str2) == null) {
            Integer valueOf = Integer.valueOf(AnonymousClass3MW.A01(context2.getResources(), 2131167707));
            Integer valueOf2 = Integer.valueOf(AnonymousClass3MW.A01(context2.getResources(), 2131167707));
            String str3 = a8q.A03;
            C18070vi.A0j(userJid2, str2);
            CatalogManager catalogManager2 = catalogManager;
            if (catalogManager2.A0G(new C195469tO((C194359rb) null, userJid2, valueOf, valueOf2, str2, str3, false))) {
                catalogManager2.A08.add(new ANG(context2, intent2, r18, af0, catalogManager2, userJid2, str2, z3));
                return af0;
            }
            z2 = false;
        } else {
            A01(context2, intent2, userJid2, (Integer) null, (Integer) null, str2, 6, z3);
            z2 = true;
        }
        af0.A0B(Boolean.valueOf(z2));
        return af0;
    }

    public static void A01(Context context, Intent intent, UserJid userJid, Integer num, Integer num2, String str, int i, boolean z) {
        Bundle bundle;
        AnonymousClass01C r3 = (AnonymousClass01C) C18050vg.A01(context, AnonymousClass01E.class);
        if (r3 != null) {
            intent.putExtra("product", str);
            intent.putExtra("disable_report", z);
            AnonymousClass3MY.A12(intent, userJid, "jid");
            if (num2 != null) {
                intent.putExtra("thumb_height", num2);
            }
            if (num != null) {
                intent.putExtra("thumb_width", num);
            }
            intent.putExtra("view_product_origin", i);
            try {
                if (!AnonymousClass4WF.A00) {
                    bundle = null;
                } else {
                    bundle = C1406772n.A01(r3, new C19760yx[0]).A00.toBundle();
                }
                r3.startActivityForResult(intent, 0, bundle);
            } catch (IllegalArgumentException e) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("ProductNavigation/sA: activityState = ");
                A10.append(((C23391Fw) r3.getLifecycle()).A02);
                C108995ce.A1J(intent, ", intent = ", A10, e);
            }
        }
    }

    public static void A02(Context context, View view, C195529tU r18, C20114A7x a7x, C19957A0o a0o, AnonymousClass22Q r21, C32021gV r22, int i, boolean z, boolean z2, boolean z3) {
        AnonymousClass22Q r6 = r21;
        String str = r6.A06;
        UserJid userJid = r6.A01;
        C17960vV.A07(userJid);
        C20114A7x a7x2 = a7x;
        C20287AEv A0A = a7x2.A0A((UserJid) null, str);
        Context context2 = context;
        C195529tU r3 = r18;
        C19957A0o a0o2 = a0o;
        int i2 = i;
        boolean z4 = z2;
        boolean z5 = z3;
        if (A0A == null) {
            View view2 = view;
            C32021gV r7 = r22;
            C21086AeG aeG = new C21086AeG(context2, view2, r3, a7x2, a0o2, r6, r7, i2, z4, z5);
            if (z) {
                r7.A0E(view2, r6, aeG);
            } else {
                r7.A0D(view2, r6, aeG);
            }
        } else {
            A03(context2, r3, a0o2, userJid, (Integer) null, (Integer) null, A0A.A0H, i2, z4, z5, false);
        }
    }

    public static void A03(Context context, C195529tU r3, C19957A0o a0o, UserJid userJid, Integer num, Integer num2, String str, int i, boolean z, boolean z2, boolean z3) {
        if (z2) {
            Intent A0G = C72463Mc.A0G(context);
            A0G.setClassName(context.getPackageName(), "com.whatsapp.biz.product.view.activity.ProductDetailActivity");
            A01(context, A0G, userJid, num, num2, str, i, z);
            return;
        }
        r3.A02(userJid).A09(new C21130Aey(context, r3, a0o, userJid, num, num2, str, i, z, z3));
    }
}
