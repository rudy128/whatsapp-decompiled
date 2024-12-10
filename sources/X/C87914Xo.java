package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.whatsapp.chatinfo.view.custom.ContactDetailsCard;

/* renamed from: X.4Xo  reason: invalid class name and case insensitive filesystem */
public class C87914Xo {
    public Runnable A00;
    public Runnable A01;
    public boolean A02;
    public final Handler A03 = C17890vO.A0D();
    public final AnonymousClass1KB A04;
    public final AnonymousClass11S A05;
    public final ContactDetailsCard A06;
    public final AnonymousClass1M9 A07;
    public final C24921Me A08;
    public final AnonymousClass11C A09;
    public final C18000vb A0A;
    public final C18030ve A0B;
    public final C34651kr A0C;
    public final AnonymousClass1QJ A0D;
    public final C30921ej A0E;
    public final AnonymousClass1R2 A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final C42201xn A0I;
    public final AnonymousClass11P A0J;
    public final C39541tF A0K;
    public final AnonymousClass10I A0L;

    public static void A00(C87914Xo r3, AnonymousClass1E7 r4) {
        AnonymousClass11P r1 = r3.A0J;
        ContactDetailsCard contactDetailsCard = r3.A06;
        String A012 = AnonymousClass72Y.A01(contactDetailsCard.getContext(), r1, r4);
        if (!AnonymousClass1EG.A0H(A012)) {
            contactDetailsCard.setContactTextStatus(A012);
        }
        r3.A02 = true;
    }

    public void A01(AnonymousClass1E7 r8) {
        Runnable runnable = this.A01;
        if (runnable != null) {
            this.A03.removeCallbacksAndMessages(runnable);
        }
        Runnable runnable2 = this.A00;
        if (runnable2 != null) {
            this.A03.removeCallbacksAndMessages(runnable2);
        }
        String A022 = this.A0I.A02(r8, true);
        if (!r8.A0B() || TextUtils.isEmpty(A022)) {
            this.A06.setContactChatStatusVisibility(8);
            if (r8.A0B()) {
                if (C18020vd.A05(C18040vf.A02, this.A0B, 5839)) {
                    A00(this, r8);
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(A022.substring(0, 1).toUpperCase(this.A0A.A0N()));
        String A0y = AnonymousClass000.A0y(A022.substring(1), A10);
        ContactDetailsCard contactDetailsCard = this.A06;
        contactDetailsCard.setContactChatStatusVisibility(0);
        contactDetailsCard.setContactChatStatus(A0y);
        if (A0y != null) {
            if (C18020vd.A05(C18040vf.A02, this.A0B, 5839)) {
                Context context = contactDetailsCard.getContext();
                if (!this.A02 || context == null || !A0y.equals(context.getString(2131888979))) {
                    AnonymousClass7RL r2 = new AnonymousClass7RL(this, r8, 32);
                    this.A01 = r2;
                    Handler handler = this.A03;
                    handler.postDelayed(r2, 3000);
                    if (context != null && A0y.equals(contactDetailsCard.getContext().getString(2131888979))) {
                        C21452AkJ akJ = new C21452AkJ(47, A0y, this);
                        this.A00 = akJ;
                        handler.postDelayed(akJ, 6000);
                    }
                }
            }
        }
    }

    public void A02(String str) {
        if (str == null || str.isEmpty()) {
            this.A06.setUsername("");
        } else if (str.charAt(0) == '@') {
            this.A06.setUsername(str);
        }
    }

    public C87914Xo(C42201xn r2, AnonymousClass1KB r3, AnonymousClass11S r4, ContactDetailsCard contactDetailsCard, AnonymousClass1M9 r6, C24921Me r7, AnonymousClass11C r8, AnonymousClass11P r9, C18000vb r10, C18030ve r11, C81743zj r12, C39541tF r13, C34651kr r14, AnonymousClass1QJ r15, C30921ej r16, AnonymousClass1R2 r17, AnonymousClass10I r18, boolean z, boolean z2) {
        this.A0J = r9;
        this.A04 = r3;
        this.A0H = z;
        this.A0G = z2;
        this.A0B = r11;
        this.A05 = r4;
        this.A0F = r17;
        this.A07 = r6;
        this.A0I = r2;
        this.A09 = r8;
        this.A08 = r7;
        this.A0A = r10;
        this.A0E = r16;
        this.A06 = contactDetailsCard;
        contactDetailsCard.A0Q = r12;
        this.A0D = r15;
        this.A0K = r13;
        this.A0L = r18;
        this.A0C = r14;
    }
}
