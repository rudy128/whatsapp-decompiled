package X;

import android.content.ContentValues;

/* renamed from: X.39R  reason: invalid class name */
public final class AnonymousClass39R implements AnonymousClass3ML {
    public final AnonymousClass00H A00;

    public AnonymousClass39R(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void CCZ(AnonymousClass206 r8, C49702Rn r9) {
        C18070vi.A0d(r8, 0);
        if (r8.A11(1024)) {
            C53312cK r2 = (C53312cK) this.A00.get();
            if (r8.A11(1024)) {
                C20941Abv A002 = C60532oB.A00(r8);
                C28791au A05 = r2.A00.A05();
                try {
                    C23141Ev r4 = ((C28801av) A05).A02;
                    ContentValues A08 = C17880vN.A08();
                    A08.put("message_row_id", Long.valueOf(r8.A0x));
                    A08.put("title", A002.A0G);
                    A08.put("body", A002.A04);
                    A08.put("media_type", Integer.valueOf(A002.A02));
                    A08.put("thumbnail_url", A002.A0F);
                    A08.put("micro_thumbnail", A002.A0N);
                    A08.put("full_thumbnail", A002.A01);
                    A08.put("media_url", A002.A08);
                    A08.put("source_type", A002.A0D);
                    A08.put("source_id", A002.A0C);
                    A08.put("source_url", A002.A0E);
                    A08.put("render_larger_thumbnail", Boolean.valueOf(A002.A0L));
                    A08.put("show_ad_attribution", Boolean.valueOf(A002.A0M));
                    A08.put("has_icebreaker_auto_response", Boolean.valueOf(A002.A0K));
                    A08.put("has_click_to_call_auto_response", Boolean.valueOf(A002.A0J));
                    C63432t4.A02(A08, "ad_context_preview_dismissed", A002.A0H);
                    A08.put("ctwa_clid", A002.A06);
                    A08.put("source_app", A002.A0B);
                    C63432t4.A02(A08, "automated_greeting_message_shown", A002.A00);
                    A08.put("greeting_message_body", A002.A07);
                    A08.put("cta_payload", A002.A05);
                    C63432t4.A02(A08, "disable_nudge", A002.A0I);
                    A08.put("original_image_url", A002.A09);
                    A08.put("automated_greeting_message_cta_type", A002.A03);
                    r4.A05("message_external_ad_content", "ExternalAdContentInfoStore/insertAdContentInfo", A08);
                    A05.close();
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                    throw th;
                }
            }
            if (r9 != null) {
                throw C17900vP.A07(AnonymousClass39R.class);
            }
        }
    }
}
