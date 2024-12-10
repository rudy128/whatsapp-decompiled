package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.48e  reason: invalid class name and case insensitive filesystem */
public final class C824948e extends C38471rL {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass1KB A01;
    public final /* synthetic */ C34531kd A02;
    public final /* synthetic */ C33251iW A03;
    public final /* synthetic */ C37551pj A04;
    public final /* synthetic */ AnonymousClass122 A05;
    public final /* synthetic */ AnonymousClass1WM A06;
    public final /* synthetic */ AnonymousClass206 A07;
    public final /* synthetic */ AnonymousClass4M0 A08;
    public final /* synthetic */ AnonymousClass10I A09;

    public C824948e(Context context, AnonymousClass1KB r2, C34531kd r3, C33251iW r4, C37551pj r5, AnonymousClass122 r6, AnonymousClass1WM r7, AnonymousClass206 r8, AnonymousClass4M0 r9, AnonymousClass10I r10) {
        this.A04 = r5;
        this.A07 = r8;
        this.A00 = context;
        this.A08 = r9;
        this.A09 = r10;
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = r7;
    }

    public void A04(View view) {
        int i;
        String string;
        C37551pj r1 = this.A04;
        C22941Dw r0 = UserJid.Companion;
        AnonymousClass206 r5 = this.A07;
        boolean A0P = r1.A0P(C22941Dw.A01(r5.A0v.A00));
        Context context = this.A00;
        if (A0P) {
            AnonymousClass4Yv.A01(AnonymousClass1L9.A00(context), 106);
            return;
        }
        C73203Rj A002 = AnonymousClass4a6.A00(context);
        AnonymousClass4M0 r9 = this.A08;
        Resources resources = context.getResources();
        List list = r9.A00;
        if (list.size() == 0) {
            string = "";
        } else {
            AnonymousClass206 A0k = AnonymousClass3MW.A0k(list, 0);
            if (list.size() != 1) {
                i = 2131889948;
                if (!(A0k instanceof AnonymousClass212)) {
                    i = 2131889986;
                }
            } else if (A0k != null && A0k.A11(131072)) {
                i = 2131889964;
            } else if (A0k instanceof AnonymousClass22E) {
                i = 2131890026;
                if (((AnonymousClass22E) A0k).A06.isEmpty()) {
                    i = 2131890021;
                }
            } else if (A0k instanceof AnonymousClass227) {
                string = AnonymousClass3MW.A0x(resources, ((AnonymousClass227) A0k).A01, new Object[1], 0, 2131890008);
            } else if (A0k instanceof AnonymousClass22A) {
                i = 2131891565;
                if (((AnonymousClass22A) A0k).A01 == 1) {
                    i = 2131891564;
                }
            } else if (A0k instanceof AnonymousClass22C) {
                i = 2131890003;
                if (((AnonymousClass22C) A0k).A00 == 1) {
                    i = 2131890002;
                }
            } else {
                i = 2131889988;
                if (A0k instanceof AnonymousClass24H) {
                    i = 2131889965;
                }
            }
            string = resources.getString(i);
        }
        A002.A0S(string);
        if (r5.A0D() == 21) {
            A002.A0Z(new C1411874q(48), 2131899286);
            if (r5.A0w()) {
                A002.A0Y(new C88854aw(r5, this.A09, this.A05, 10), 2131898874);
            }
        } else {
            A002.A0Z(new AnonymousClass4b7(this.A01, this.A02, this.A03, this.A05, this.A06, r9, this.A09), 2131897145);
            C73203Rj.A07(A002, 49, 2131898766);
        }
        AnonymousClass3MY.A0L(A002).show();
    }
}
