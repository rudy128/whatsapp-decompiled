package X;

import android.database.Cursor;

/* renamed from: X.39G  reason: invalid class name */
public final class AnonymousClass39G implements C447124m, C447224n, C447324o, C436720l {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public void BdY(AnonymousClass206 r17) {
        AnonymousClass206 r3 = r17;
        C18070vi.A0d(r3, 0);
        C447424p.A00(r3, this.A01);
        C25911Qc r4 = (C25911Qc) this.A00.get();
        AnonymousClass224 r0 = (AnonymousClass224) r3;
        String str = r0.A01;
        int i = r0.A00;
        Integer num = r0.A03;
        if (r3.A0x == -1) {
            throw AnonymousClass000.A0k("main message part must be inserted before");
        } else if (r3.A0u == 32) {
            C61762qD r6 = new C61762qD(num, "", str, "", (String) null, 1, i, 0, false);
            C28791au A05 = r4.A00.A05();
            try {
                ((C28801av) A05).A02.A05("message_template_button", "INSERT_TEMPLATE_BUTTON_SQL", C25911Qc.A00(r6, r3.A0x));
                A05.close();
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        } else {
            throw AnonymousClass000.A0k("only for template button reply message");
        }
    }

    public void CQL(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        ((C447424p) this.A01.get()).CQL(r2);
    }

    public void BL9(AnonymousClass206 r22) {
        Cursor A0A;
        AnonymousClass206 r3 = r22;
        C18070vi.A0d(r3, 0);
        ((C447424p) this.A01.get()).BL9(r3);
        long j = r3.A0x;
        C28781at A04 = ((C25911Qc) this.A00.get()).A00.get();
        try {
            C23141Ev r9 = ((C28801av) A04).A02;
            String[] strArr = new String[1];
            C17880vN.A1V(strArr, 0, j);
            A0A = r9.A0A("SELECT _id, text_data, extra_data, button_type, used, selected_index, selected_carousel_card_index, otp_button_type, extra_consent_data, otp_matched_package_name, webview_presentation, webview_interaction FROM message_template_button WHERE message_row_id = ?", "GET_TEMPLATE_MESSAGE_BUTTONS_SQL", strArr);
            Integer num = null;
            if (!A0A.moveToFirst()) {
                C17900vP.A0l("TemplateMessageStore/getTemplateButtonReplyData/Template button reply data doesn't exist in the table; messageRowId=", AnonymousClass000.A10(), j);
                A0A.close();
                A04.close();
                return;
            }
            long A06 = C17890vO.A06(A0A, "_id");
            String A0S = C17890vO.A0S(A0A, "text_data");
            String A0S2 = C17890vO.A0S(A0A, "extra_data");
            String A0S3 = C17890vO.A0S(A0A, "extra_consent_data");
            int A012 = C17890vO.A01(A0A, "button_type");
            boolean A1T = AnonymousClass000.A1T(C17890vO.A01(A0A, "used"), 1);
            int A013 = C17890vO.A01(A0A, "selected_index");
            if (!A0A.isNull(A0A.getColumnIndexOrThrow("selected_carousel_card_index"))) {
                num = Integer.valueOf(C17890vO.A01(A0A, "selected_carousel_card_index"));
            }
            C61762qD r11 = new C61762qD(num, A0S, A0S2, A0S3, (String) null, A012, A013, 0, A1T);
            r11.A00 = A06;
            A0A.close();
            A04.close();
            AnonymousClass224 r32 = (AnonymousClass224) r3;
            r32.A01 = r11.A01;
            r32.A00 = r11.A06;
            r32.A03 = r11.A08;
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
        throw th;
    }

    public AnonymousClass39G(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
