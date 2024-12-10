package X;

import android.database.Cursor;

/* renamed from: X.250  reason: invalid class name */
public final class AnonymousClass250 implements C447624r {
    public final AnonymousClass00H A00;

    public AnonymousClass250(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void CCZ(AnonymousClass206 r35, C49702Rn r36) {
        Cursor A0A;
        String str;
        AnonymousClass206 r4 = r35;
        C18070vi.A0d(r4, 0);
        if (r4.A11(1024)) {
            C53312cK r1 = (C53312cK) this.A00.get();
            C28781at A04 = r1.A00.get();
            try {
                A0A = ((C28801av) A04).A02.A0A("SELECT title, body, media_type, thumbnail_url, full_thumbnail, micro_thumbnail, media_url, source_type, source_id, source_url, render_larger_thumbnail, show_ad_attribution, has_icebreaker_auto_response, has_click_to_call_auto_response, ad_context_preview_dismissed, ctwa_clid, source_app, automated_greeting_message_shown, greeting_message_body, cta_payload, disable_nudge, original_image_url, automated_greeting_message_cta_type  FROM message_external_ad_content WHERE message_row_id = ?", "GET_EXTERNAL_AD_CONTENT_INFO_BY_ROW_ID_SQL", new String[]{String.valueOf(r4.A0x)});
                if (A0A.moveToLast()) {
                    String string = A0A.getString(A0A.getColumnIndexOrThrow("title"));
                    String string2 = A0A.getString(A0A.getColumnIndexOrThrow("body"));
                    int i = A0A.getInt(A0A.getColumnIndexOrThrow("media_type"));
                    String string3 = A0A.getString(A0A.getColumnIndexOrThrow("thumbnail_url"));
                    byte[] blob = A0A.getBlob(A0A.getColumnIndexOrThrow("micro_thumbnail"));
                    byte[] blob2 = A0A.getBlob(A0A.getColumnIndexOrThrow("full_thumbnail"));
                    String string4 = A0A.getString(A0A.getColumnIndexOrThrow("media_url"));
                    String string5 = A0A.getString(A0A.getColumnIndexOrThrow("source_type"));
                    String string6 = A0A.getString(A0A.getColumnIndexOrThrow("source_id"));
                    String string7 = A0A.getString(A0A.getColumnIndexOrThrow("source_url"));
                    boolean A05 = AnonymousClass1Eu.A05(A0A, A0A.getColumnIndexOrThrow("render_larger_thumbnail"));
                    boolean A052 = AnonymousClass1Eu.A05(A0A, A0A.getColumnIndexOrThrow("show_ad_attribution"));
                    boolean A053 = AnonymousClass1Eu.A05(A0A, A0A.getColumnIndexOrThrow("has_icebreaker_auto_response"));
                    boolean A054 = AnonymousClass1Eu.A05(A0A, A0A.getColumnIndexOrThrow("has_click_to_call_auto_response"));
                    boolean A055 = AnonymousClass1Eu.A05(A0A, A0A.getColumnIndexOrThrow("ad_context_preview_dismissed"));
                    if (C18020vd.A05(C18040vf.A02, r1.A01, 12540)) {
                        str = A0A.getString(A0A.getColumnIndexOrThrow("ctwa_clid"));
                    } else {
                        str = null;
                    }
                    String string8 = A0A.getString(A0A.getColumnIndexOrThrow("source_app"));
                    boolean A056 = AnonymousClass1Eu.A05(A0A, A0A.getColumnIndexOrThrow("automated_greeting_message_shown"));
                    C60532oB.A01(new C20941Abv(string, string2, string3, string4, string5, string6, string7, str, (String) null, string8, A0A.getString(A0A.getColumnIndexOrThrow("greeting_message_body")), A0A.getString(A0A.getColumnIndexOrThrow("cta_payload")), A0A.getString(A0A.getColumnIndexOrThrow("original_image_url")), A0A.getString(A0A.getColumnIndexOrThrow("automated_greeting_message_cta_type")), blob, blob2, i, A05, A052, A053, A054, A055, A056, AnonymousClass1Eu.A05(A0A, A0A.getColumnIndexOrThrow("disable_nudge"))), r4);
                }
                A0A.close();
                A04.close();
                if (r36 != null) {
                    new AnonymousClass20F(AnonymousClass250.class);
                    throw new NullPointerException("onProcessorExecuted");
                }
                return;
            } catch (Throwable th) {
                try {
                    A04.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }
}
