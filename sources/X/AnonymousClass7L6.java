package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

/* renamed from: X.7L6  reason: invalid class name */
public final class AnonymousClass7L6 implements AnonymousClass8B1 {
    public boolean A00;
    public final AnonymousClass00H A01;
    public final C18140vp A02;

    public /* synthetic */ void Bla(String str) {
    }

    public void Bly(String str) {
        C18070vi.A0d(str, 0);
        if (str.equals(PublicKeyCredentialControllerUtility.JSON_KEY_USER)) {
            C108975cc.A0L(this.A01).A03((Boolean) null, 8);
        }
    }

    public /* synthetic */ void BpC() {
    }

    public void Blz() {
        boolean A012 = ((C27021Uk) this.A02.get()).A01();
        AnonymousClass00H r3 = this.A01;
        C136936ue A0p = C108945cZ.A0p(r3);
        C18070vi.A0b(A0p);
        A0p.A04((Integer) null, (String) null, 5, A012);
        A0p.A01 = null;
        if (this.A00) {
            this.A00 = false;
            C108975cc.A0L(r3).A03((Boolean) null, 21);
        }
    }

    public void Bm0(String str) {
        if (C18070vi.A18(str, "will_delete")) {
            C108975cc.A0L(this.A01).A03((Boolean) null, 25);
        } else {
            C17900vP.A0e("AvatarEditorLoggingEvents/onAvatarEditorEvent received unhandled event = ", str, AnonymousClass000.A10());
        }
    }

    public void Bm2(String str, Map map) {
        C136936ue r1;
        int i;
        String str2;
        if (str != null) {
            switch (str.hashCode()) {
                case -1147774587:
                    if (str.equals("notice_screen_shown")) {
                        this.A00 = true;
                        r1 = C108975cc.A0L(this.A01);
                        i = 20;
                        break;
                    }
                    break;
                case 871004653:
                    if (str.equals("user_confirmation_success")) {
                        this.A00 = false;
                        r1 = C108975cc.A0L(this.A01);
                        i = 23;
                        break;
                    }
                    break;
                case 1038955126:
                    str2 = "editor_navigation_failed";
                    break;
                case 1161655571:
                    str2 = "user_confirmation_failed";
                    break;
                case 1182156104:
                    if (str.equals("notice_screen_next_click")) {
                        r1 = C108975cc.A0L(this.A01);
                        i = 22;
                        break;
                    }
                    break;
            }
            if (str.equals(str2)) {
                this.A00 = true;
                r1 = C108975cc.A0L(this.A01);
                i = 24;
                r1.A03((Boolean) null, i);
                return;
            }
        }
        C17900vP.A0e("AvatarEditorLoggingEvents/onAvatarNoticeEvent received unhandled event = ", str, AnonymousClass000.A10());
    }

    public void Bm4(boolean z, boolean z2) {
        C136936ue A0p = C108945cZ.A0p(this.A01);
        int i = 7;
        if (z) {
            i = 3;
        }
        A0p.A03(Boolean.valueOf(z2), i);
    }

    public AnonymousClass7L6(AnonymousClass00H r1, C18140vp r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A02 = r2;
    }
}
