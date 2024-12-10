package X;

import android.content.Context;
import android.content.Intent;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.6ni  reason: invalid class name and case insensitive filesystem */
public final class C132856ni {
    public final C56582hh A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass118 A02;
    public final C18030ve A03;
    public final AnonymousClass18K A04;
    public final AnonymousClass00H A05;

    public final void A00(AnonymousClass1FL r8, boolean z) {
        String str;
        String str2;
        AnonymousClass1D6[] r3 = new AnonymousClass1D6[2];
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        AnonymousClass1D6.A03("is_image_feedback", str, r3, 0);
        if (C18020vd.A05(C18040vf.A02, this.A03, 6527)) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        r3[1] = AnonymousClass1D6.A01("is_multi_feedback_abprop_enabled", str2);
        LinkedHashMap A0B = AnonymousClass1D7.A0B(r3);
        this.A05.get();
        Context context = this.A02.A00;
        C18070vi.A0d(A0B, 0);
        String obj = new JSONObject(C108975cc.A0h("server_params", A0B)).toString();
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(context, "com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity");
        A0A.putExtra("screen_name", "com.bloks.www.whatsapp.bonsai.feedback");
        A0A.putExtra("screen_params", obj);
        A0A.putExtra("mode_half_sheet_extra", true);
        A0A.putExtra("drag_to_dismiss_extra", (String) null);
        A0A.setFlags(268435456);
        r8.startActivity(A0A);
    }

    public C132856ni(C56582hh r2, AnonymousClass1KB r3, AnonymousClass118 r4, C18030ve r5, AnonymousClass18K r6, AnonymousClass00H r7) {
        C18070vi.A0w(r5, r3, r4, r7, r6);
        C18070vi.A0d(r2, 6);
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
        this.A05 = r7;
        this.A04 = r6;
        this.A00 = r2;
    }
}
