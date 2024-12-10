package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;

/* renamed from: X.38J  reason: invalid class name */
public class AnonymousClass38J implements C108635c2 {
    public String A00 = "";
    public final AnonymousClass118 A01;

    public AnonymousClass38J(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public void CJs(String str) {
        C18070vi.A0d(str, 0);
        this.A00 = str;
    }

    public String BTj() {
        if (this instanceof C48822Oc) {
            return "show_reaction_notifications";
        }
        if (this instanceof C48842Oe) {
            return "message_popup_notifications";
        }
        if (this instanceof C48812Ob) {
            return "message_notifications_vibrate";
        }
        if (this instanceof C48802Oa) {
            return "sounds";
        }
        if (this instanceof AnonymousClass2OZ) {
            return "message_notifications_section";
        }
        if (this instanceof AnonymousClass2OY) {
            return "message_notifications_light";
        }
        if (this instanceof AnonymousClass2OX) {
            return "message_high_priority_notifications";
        }
        if (this instanceof AnonymousClass2OW) {
            return "group_show_reaction_notifications";
        }
        if (this instanceof C48832Od) {
            return "group_message_popup_notifications";
        }
        if (this instanceof AnonymousClass2OV) {
            return "group_message_notifications_vibrate";
        }
        if (this instanceof AnonymousClass2OU) {
            return "group_sounds";
        }
        if (this instanceof AnonymousClass2OT) {
            return "group_message_notifications_section";
        }
        if (this instanceof AnonymousClass2OS) {
            return "group_message_notifications_light";
        }
        if (this instanceof AnonymousClass2OR) {
            return "group_message_high_priority_notifications";
        }
        if (this instanceof AnonymousClass2OQ) {
            return "conversation_tones";
        }
        if (this instanceof AnonymousClass2OP) {
            return "incoming_call_vibrate";
        }
        if (this instanceof AnonymousClass2OO) {
            return "incoming_call_ringtone";
        }
        if (this instanceof AnonymousClass2ON) {
            return "call_notifications_section";
        }
        return "notifications";
    }

    public String BWD() {
        if ((this instanceof C48822Oc) || (this instanceof C48842Oe) || (this instanceof C48812Ob) || (this instanceof C48802Oa)) {
            return "message_notifications_section";
        }
        if (this instanceof AnonymousClass2OZ) {
            return "notifications";
        }
        if ((this instanceof AnonymousClass2OY) || (this instanceof AnonymousClass2OX)) {
            return "message_notifications_section";
        }
        if ((this instanceof AnonymousClass2OW) || (this instanceof C48832Od) || (this instanceof AnonymousClass2OV) || (this instanceof AnonymousClass2OU)) {
            return "group_message_notifications_section";
        }
        if (this instanceof AnonymousClass2OT) {
            return "notifications";
        }
        if ((this instanceof AnonymousClass2OS) || (this instanceof AnonymousClass2OR)) {
            return "group_message_notifications_section";
        }
        if (this instanceof AnonymousClass2OQ) {
            return "notifications";
        }
        if ((this instanceof AnonymousClass2OP) || (this instanceof AnonymousClass2OO)) {
            return "call_notifications_section";
        }
        if (!(this instanceof AnonymousClass2ON)) {
            return "";
        }
        return "notifications";
    }

    public String BXZ() {
        if (this instanceof C48822Oc) {
            return C18070vi.A0G(this.A01, 2131895946);
        }
        if (this instanceof C48842Oe) {
            return C18070vi.A0G(this.A01, 2131899406);
        }
        if (this instanceof C48812Ob) {
            return C18070vi.A0G(this.A01, 2131899413);
        }
        if (this instanceof C48802Oa) {
            return C18070vi.A0G(this.A01, 2131899408);
        }
        if (this instanceof AnonymousClass2OZ) {
            return C18070vi.A0G(this.A01, 2131893066);
        }
        if (this instanceof AnonymousClass2OY) {
            return C18070vi.A0G(this.A01, 2131899404);
        }
        if (this instanceof AnonymousClass2OX) {
            return C18070vi.A0G(this.A01, 2131899411);
        }
        if (this instanceof AnonymousClass2OW) {
            return C18070vi.A0G(this.A01, 2131895946);
        }
        if (this instanceof C48832Od) {
            return C18070vi.A0G(this.A01, 2131899406);
        }
        if (this instanceof AnonymousClass2OV) {
            return C18070vi.A0G(this.A01, 2131899413);
        }
        if (this instanceof AnonymousClass2OU) {
            return C18070vi.A0G(this.A01, 2131899408);
        }
        if (this instanceof AnonymousClass2OT) {
            return C18070vi.A0G(this.A01, 2131893065);
        }
        if (this instanceof AnonymousClass2OS) {
            return C18070vi.A0G(this.A01, 2131899404);
        }
        if (this instanceof AnonymousClass2OR) {
            return C18070vi.A0G(this.A01, 2131899411);
        }
        if (this instanceof AnonymousClass2OQ) {
            return C18070vi.A0G(this.A01, 2131895816);
        }
        if (this instanceof AnonymousClass2OP) {
            return C18070vi.A0G(this.A01, 2131899413);
        }
        if (this instanceof AnonymousClass2OO) {
            return C18070vi.A0G(this.A01, 2131899392);
        }
        boolean z = this instanceof AnonymousClass2ON;
        AnonymousClass118 r1 = this.A01;
        if (z) {
            return C18070vi.A0G(r1, 2131893064);
        }
        return C18070vi.A0G(r1, 2131899415);
    }

    public View BbT(View view) {
        int i;
        if (this instanceof C48822Oc) {
            C18070vi.A0d(view, 0);
            i = 2131434333;
        } else if (this instanceof C48842Oe) {
            C18070vi.A0d(view, 0);
            i = 2131433981;
        } else if (this instanceof C48812Ob) {
            C18070vi.A0d(view, 0);
            i = 2131436736;
        } else if (this instanceof C48802Oa) {
            C18070vi.A0d(view, 0);
            i = 2131433212;
        } else if (this instanceof AnonymousClass2OZ) {
            C18070vi.A0d(view, 0);
            i = 2131432679;
        } else if (this instanceof AnonymousClass2OY) {
            C18070vi.A0d(view, 0);
            i = 2131433208;
        } else if (this instanceof AnonymousClass2OX) {
            C18070vi.A0d(view, 0);
            i = 2131431458;
        } else if (this instanceof AnonymousClass2OW) {
            C18070vi.A0d(view, 0);
            i = 2131431290;
        } else if (this instanceof C48832Od) {
            C18070vi.A0d(view, 0);
            i = 2131431282;
        } else if (this instanceof AnonymousClass2OV) {
            C18070vi.A0d(view, 0);
            i = 2131431313;
        } else if (this instanceof AnonymousClass2OU) {
            C18070vi.A0d(view, 0);
            i = 2131431272;
        } else if (this instanceof AnonymousClass2OT) {
            C18070vi.A0d(view, 0);
            i = 2131431269;
        } else if (this instanceof AnonymousClass2OS) {
            C18070vi.A0d(view, 0);
            i = 2131431271;
        } else if (this instanceof AnonymousClass2OR) {
            C18070vi.A0d(view, 0);
            i = 2131431259;
        } else if (this instanceof AnonymousClass2OQ) {
            C18070vi.A0d(view, 0);
            i = 2131429620;
        } else if (this instanceof AnonymousClass2OP) {
            C18070vi.A0d(view, 0);
            i = 2131428756;
        } else if (this instanceof AnonymousClass2OO) {
            C18070vi.A0d(view, 0);
            i = 2131428745;
        } else if (this instanceof AnonymousClass2ON) {
            C18070vi.A0d(view, 0);
            i = 2131428711;
        } else {
            C18070vi.A0d(view, 0);
            i = 2131435294;
        }
        return view.findViewById(i);
    }

    public /* synthetic */ boolean BgM() {
        if ((this instanceof AnonymousClass2OZ) || (this instanceof AnonymousClass2OT) || (this instanceof AnonymousClass2ON)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean CLm() {
        if ((this instanceof C48822Oc) || (this instanceof AnonymousClass2OX) || (this instanceof AnonymousClass2OW) || (this instanceof AnonymousClass2OR) || (this instanceof AnonymousClass2OQ)) {
            return false;
        }
        return true;
    }

    public Drawable getIcon() {
        return C24261Jm.A00(this.A01.A00, 2131232143);
    }

    public /* synthetic */ List BMb() {
        return C18460wS.A00;
    }

    public String BWI() {
        return this.A00;
    }

    public int Bac() {
        return 4;
    }

    public /* synthetic */ boolean Bh4() {
        return true;
    }
}
