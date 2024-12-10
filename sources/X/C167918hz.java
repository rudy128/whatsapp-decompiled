package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8hz  reason: invalid class name and case insensitive filesystem */
public class C167918hz extends C20997Acp {
    public C194829sM A00;
    public B9L A01;
    public final C190449kx A02;
    public final C19830z4 A03;
    public final C19949A0g A04;
    public final C20004A2u A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass1KB A07;
    public final C37111oz A08 = ((C37111oz) AnonymousClass12Q.A03(C37111oz.class));
    public final AnonymousClass10I A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;

    public static void A00(C194829sM r4, C167918hz r5) {
        String A0T = C17890vO.A0T(r5.A0B);
        ((C195049si) r5.A0A.get()).A02(A0T, r4.A00, 252);
        r5.A09.CGN(new C21459AkQ(r5, r4, A0T, 33));
    }

    public void BrD(String str) {
        this.A05.A02("order_creates_tag");
        ((C195049si) this.A0A.get()).A00(str);
        C21445AkC.A00(this.A07, this, 6);
    }

    public void Brd(UserJid userJid) {
        C21445AkC.A00(this.A07, this, 7);
    }

    public void Bre(UserJid userJid) {
        C21445AkC.A00(this.A07, this, 5);
    }

    public void Bt9(C29621ca r5, String str) {
        int A012;
        this.A05.A02("order_creates_tag");
        ((C195049si) this.A0A.get()).A00(str);
        Pair A013 = C60482o6.A01(r5);
        C194829sM r2 = this.A00;
        if (r2 == null || A013 == null || (A012 = C108965cb.A01(A013)) != 421) {
            this.A00 = null;
            C21450AkH.A00(this.A07, this, A013, 27);
            return;
        }
        A02(r2.A00, A012);
    }

    public void C7Z(C29621ca r7, String str) {
        C185639cu r2;
        this.A05.A02("order_creates_tag");
        ((C195049si) this.A0A.get()).A01(str);
        C37111oz r5 = this.A08;
        C18070vi.A0d(r7, 0);
        C29621ca A0K = r7.A0K("order");
        if (A0K != null) {
            String A0Q = A0K.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
            String A0Q2 = A0K.A0Q("token", (String) null);
            C185649cv A002 = ((C189049iQ) r5.A00.get()).A00(A0K.A0K("price"));
            if (A0Q != null) {
                r2 = new C185639cu(A002, A0Q, A0Q2);
                C21450AkH.A00(this.A07, this, r2, 26);
            }
        }
        r2 = null;
        C21450AkH.A00(this.A07, this, r2, 26);
    }

    public C167918hz(AnonymousClass1KB r2, C26911Ty r3, C190449kx r4, C19830z4 r5, C19949A0g a0g, C20004A2u a2u, AnonymousClass10I r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        super(r3);
        this.A07 = r2;
        this.A05 = a2u;
        this.A0B = r9;
        this.A04 = a0g;
        this.A03 = r5;
        this.A06 = r10;
        this.A0A = r11;
        this.A09 = r8;
        this.A02 = r4;
    }
}
