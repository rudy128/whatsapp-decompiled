package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.6o0  reason: invalid class name and case insensitive filesystem */
public final class C132996o0 {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final C18100vl A03 = AnonymousClass1DF.A01(new C153247pD(this));
    public final C18100vl A04 = AnonymousClass1DF.A01(new C153257pE(this));
    public final C18100vl A05 = AnonymousClass1DF.A01(new C153267pF(this));
    public final AnonymousClass00H A06;

    public final Intent A00(Activity activity, AnonymousClass1BI r19, String str) {
        boolean z;
        Intent A1w;
        Activity activity2 = activity;
        AnonymousClass1BI r11 = r19;
        boolean A17 = C18070vi.A17(activity2, r11);
        Intent intent = activity2.getIntent();
        Bundle bundleExtra = intent.getBundleExtra("ctwa_deeplink_content");
        String str2 = str;
        if (bundleExtra == null) {
            Log.w("launchChatWithCtwaContext: Bundle is null");
            if (str == null || str2.length() == 0) {
                A1w = ((AnonymousClass1LU) AnonymousClass3MX.A14(this.A05)).A1w(activity2, r11, 0);
            } else {
                A1w = ((AnonymousClass1LU) AnonymousClass3MX.A14(this.A05)).A1y(activity2, r11, str2);
            }
            C18070vi.A0b(A1w);
            return A1w;
        }
        C87814Xd A002 = AnonymousClass4GX.A00(bundleExtra);
        boolean z2 = false;
        if (intent.hasExtra("ctwa_show_blocking_disclosure")) {
            z = intent.getBooleanExtra("ctwa_show_blocking_disclosure", false);
        } else {
            z = false;
        }
        if (str == null || str2.length() == 0) {
            z2 = true;
        }
        boolean z3 = !z2;
        C18100vl r2 = this.A05;
        AnonymousClass1LU r8 = (AnonymousClass1LU) AnonymousClass3MX.A14(r2);
        String str3 = A002.A0D;
        if (str3 == null) {
            str3 = "";
        }
        Intent A1s = r8.A1s(activity2, bundleExtra, r11, str3, 0, A17, z3, false);
        if (z3) {
            A1s.putExtra("share_msg", str2);
        }
        if (intent.hasExtra("entry_point_conversion_source") && intent.hasExtra("entry_point_conversion_app")) {
            String stringExtra = intent.getStringExtra("entry_point_conversion_source");
            String stringExtra2 = intent.getStringExtra("entry_point_conversion_app");
            if (!(stringExtra == null || stringExtra2 == null)) {
                this.A06.get();
                C137826w5.A00(A1s, (C18030ve) AnonymousClass3MX.A14(this.A03), stringExtra, stringExtra2);
            }
        }
        if (intent.hasExtra("extra_deep_link_session_id")) {
            A1s.putExtra("extra_deep_link_session_id", intent.getStringExtra("extra_deep_link_session_id"));
        }
        String A0x = C108955ca.A0x(this);
        C18070vi.A0X(A0x);
        AnonymousClass11P r0 = (AnonymousClass11P) this.A04.getValue();
        C18070vi.A0X(r0);
        C60442o2.A00(A1s, r0, A0x);
        if (!z) {
            return A1s;
        }
        C18070vi.A0X(r2.getValue());
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(activity2.getPackageName(), "com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureActivity");
        A0A.putExtra("extra_next_intent", A1s);
        AnonymousClass3MY.A12(A0A, r11, "jid");
        A0A.addFlags(335544320);
        Intent intent2 = A0A;
        C18070vi.A0b(A0A);
        return intent2;
    }

    public C132996o0(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0s(r2, r3, r4, r5);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r4;
        this.A06 = r5;
    }
}
