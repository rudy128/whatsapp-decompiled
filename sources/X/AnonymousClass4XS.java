package X;

import android.os.Bundle;
import com.whatsapp.community.CommunityAdminDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4XS  reason: invalid class name */
public final class AnonymousClass4XS {
    public final AnonymousClass11S A00;
    public final AnonymousClass1FY A01;
    public final AnonymousClass4QS A02 = new AnonymousClass4QS(this);
    public final C84794Kw A03;
    public final C18100vl A04;
    public final C18100vl A05;

    public final void A01(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        if (!((AnonymousClass4VH) this.A04.getValue()).A02()) {
            Bundle A0D = C17880vN.A0D();
            A0D.putInt("dialog_id", 3);
            AnonymousClass1FY r3 = this.A01;
            AnonymousClass11S r2 = this.A00;
            int i = 2131889349;
            if (r2.A0O(userJid)) {
                i = 2131889351;
            }
            A0D.putString("title", r3.getString(i));
            int i2 = 2131889347;
            if (r2.A0O(userJid)) {
                i2 = 2131889350;
            }
            A0D.putCharSequence("message", C18070vi.A0F(r3, i2));
            AnonymousClass3MY.A15(A0D, userJid, "user_jid");
            C84794Kw r1 = this.A03;
            C18070vi.A0d(r1, 0);
            C72483Me.A0k(A0D, r3, r1, 2131899286);
        }
    }

    public static void A00(CommunityAdminDialogFragment communityAdminDialogFragment, C84794Kw r3, AnonymousClass1BI r4) {
        int i = communityAdminDialogFragment.A00;
        AnonymousClass4XS r1 = r3.A00;
        if (!r1.A00.A0O(r4)) {
            return;
        }
        if (i == 3) {
            ((AnonymousClass4ZZ) r1.A05.getValue()).A02();
        } else if (i == 4) {
            ((AnonymousClass4ZZ) r1.A05.getValue()).A03();
        }
    }

    public AnonymousClass4XS(C84304Iz r3, AnonymousClass4PU r4, AnonymousClass11S r5, AnonymousClass1FY r6, AnonymousClass1EC r7, int i) {
        C18070vi.A0w(r6, r5, r3, r4, r7);
        this.A01 = r6;
        this.A00 = r5;
        this.A05 = AnonymousClass1DF.A01(new C99084sF(r3, i, 2));
        this.A04 = AnonymousClass1DF.A01(new C99094sG(r4, this, r7, 0));
        this.A03 = new C84794Kw(this);
    }
}
