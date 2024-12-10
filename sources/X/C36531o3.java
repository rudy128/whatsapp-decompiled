package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.util.Log;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1o3  reason: invalid class name and case insensitive filesystem */
public final class C36531o3 {
    public final AnonymousClass11E A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass11S A03;
    public final C18000vb A04;
    public final AnonymousClass1CM A05;
    public final AnonymousClass129 A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    public C36531o3(AnonymousClass11S r2, AnonymousClass11E r3, C18000vb r4, C18030ve r5, AnonymousClass1CM r6, AnonymousClass129 r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r8, 3);
        C18070vi.A0d(r9, 4);
        C18070vi.A0d(r7, 5);
        C18070vi.A0d(r10, 6);
        C18070vi.A0d(r4, 7);
        C18070vi.A0d(r6, 8);
        C18070vi.A0d(r3, 9);
        this.A01 = r5;
        this.A03 = r2;
        this.A02 = r8;
        this.A08 = r9;
        this.A06 = r7;
        this.A07 = r10;
        this.A04 = r4;
        this.A05 = r6;
        this.A00 = r3;
    }

    public final void A01(AnonymousClass1FL r3, String str) {
        C18070vi.A0d(str, 0);
        C18070vi.A0d(r3, 1);
        A02(r3, str, false);
    }

    public final String A00(String str) {
        Uri.Builder A022 = this.A06.A02();
        A022.appendPath("cxt");
        A022.appendQueryParameter("entrypointid", str);
        C18000vb r2 = this.A04;
        A022.appendQueryParameter("lg", r2.A05());
        A022.appendQueryParameter("lc", r2.A04());
        A022.appendQueryParameter("platform", "android");
        String obj = UUID.randomUUID().toString();
        C18070vi.A0X(obj);
        C46472Er r1 = new C46472Er();
        r1.A00 = obj;
        ((C51842Zv) this.A07.get()).A00.CC7(r1);
        A022.appendQueryParameter("anid", (String) new Pair("anid", obj).second);
        String obj2 = A022.toString();
        C18070vi.A0X(obj2);
        return obj2;
    }

    public final void A02(AnonymousClass1FL r8, String str, boolean z) {
        Intent intent;
        if (!this.A00.A09()) {
            int i = 2131892439;
            if (AnonymousClass11E.A02(r8)) {
                i = 2131892440;
            }
            C1411874q r4 = new C1411874q(16);
            LegacyMessageDialogFragment legacyMessageDialogFragment = new LegacyMessageDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("message_res", i);
            bundle.putInt("primary_action_text_id_res", 2131899286);
            legacyMessageDialogFragment.A00 = r4;
            legacyMessageDialogFragment.A1R(bundle);
            legacyMessageDialogFragment.A2C(r8.A03.A00.A03, (String) null);
            return;
        }
        AnonymousClass11S r0 = this.A03;
        r0.A0I();
        if (r0.A00 != null && this.A05.A04() && !((C22881Do) this.A08.get()).A01) {
            try {
                JSONArray jSONArray = C18020vd.A02(C18040vf.A02, this.A01, 9546).getJSONArray("entrypoints_block_list");
                int length = jSONArray.length();
                int i2 = 0;
                while (i2 < length) {
                    String string = jSONArray.getString(i2);
                    if (string == null || !string.equalsIgnoreCase(str)) {
                        i2++;
                    }
                }
                this.A02.get();
                Context baseContext = r8.getBaseContext();
                if (z) {
                    intent = new Intent();
                    intent.setClassName(baseContext, "com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity");
                    try {
                        intent.putExtra("screen_params", new JSONObject().put("params", new JSONObject().put("server_params", new JSONObject().put("entrypointid", str))).toString());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    intent.putExtra("screen_name", "com.bloks.www.cxthelp.whatsapp.bottomsheet.async");
                } else {
                    intent = AnonymousClass1LU.A1L(baseContext, str);
                }
                C18070vi.A0b(intent);
                r8.startActivity(intent);
                return;
            } catch (JSONException e2) {
                Log.e("ContextualHelpHandler/shouldNotRenderWithBloks", e2);
            }
        }
        this.A02.get();
        r8.startActivity(AnonymousClass1LU.A1K(r8.getBaseContext(), A00(str)));
    }
}
