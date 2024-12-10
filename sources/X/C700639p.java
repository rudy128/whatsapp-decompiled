package X;

import android.content.ContentValues;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.39p  reason: invalid class name and case insensitive filesystem */
public final class C700639p implements AnonymousClass3LK {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public void CCb(AnonymousClass206 r18, C49702Rn r19, int i) {
        AnonymousClass6RT r0;
        C693236t A002;
        AnonymousClass206 r6 = r18;
        C18070vi.A0d(r6, 0);
        if (i == 6 && (r6 instanceof AnonymousClass210)) {
            C693236t A003 = C60512o9.A00(r6);
            AnonymousClass205 r5 = null;
            if (A003 != null) {
                r0 = A003.A01;
            } else {
                r0 = null;
            }
            AnonymousClass6RT r3 = AnonymousClass6RT.STATUS_TAPPABLE_MESSAGE;
            if (r0 == r3) {
                if (C18020vd.A05(C18040vf.A02, this.A00, 11852) && (A002 = C60512o9.A00(r6)) != null && A002.A01 == r3) {
                    C49482Qq r11 = C49482Qq.LINKCLICK;
                    C25951Qg r4 = (C25951Qg) this.A02.get();
                    C693236t A004 = C60512o9.A00(r6);
                    if (A004 != null) {
                        long j = A004.A00;
                        long j2 = r6.A0x;
                        C28791au A05 = r4.A01.A05();
                        try {
                            ContentValues A08 = C17880vN.A08();
                            C17880vN.A18(A08, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r11.value);
                            C23141Ev r112 = ((C28801av) A05).A02;
                            String[] A1Z = C17880vN.A1Z();
                            C17890vO.A1J(A1Z, j);
                            C17890vO.A1K(A1Z, j2);
                            r112.A02(A08, "message_media_interactive_annotation", "message_row_id = ? AND child_message_row_id = ?", "UPDATE_MESSAGE_MEDIA_INTERACTIVE_ANNOTATION_EMBEDDED_TYPE", A1Z);
                            A05.close();
                            AnonymousClass1Q8 r1 = (AnonymousClass1Q8) this.A01.get();
                            C693236t A005 = C60512o9.A00(r6);
                            if (A005 != null) {
                                A51 a51 = A005.A02;
                                if (a51 != null) {
                                    r5 = a51.A01;
                                }
                                r1.A01(r5);
                                return;
                            }
                            throw AnonymousClass000.A0k("Required value was null.");
                        } catch (Throwable th) {
                            AnonymousClass0DT.A00(th, th);
                            throw th;
                        }
                    } else {
                        throw AnonymousClass000.A0k("Required value was null.");
                    }
                }
            }
        }
    }

    public C700639p(C18030ve r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }
}
