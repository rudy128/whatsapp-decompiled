package com.whatsapp.conversationslist;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1J2;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4FM;
import X.C139106yE;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18600wl;
import X.C19830z4;
import X.C23581Gv;
import X.C23651Hc;
import X.C24671Lf;
import X.C29401cD;
import X.C29431cG;
import X.C30391dr;
import X.C30451dy;
import X.C35751mk;
import X.C37611pq;
import X.C41531wa;
import X.C41541wb;
import X.C41561wd;
import X.C41731wy;
import X.C57002iN;
import X.C57892jo;
import X.C72463Mc;
import X.C72483Me;
import X.C76693nw;
import X.C82934Cs;
import X.C92224gx;
import X.C94174kA;
import X.C97904qF;
import android.view.View;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ConversationsSuggestedContactsViewModel extends AnonymousClass1J2 {
    public C41531wa A00;
    public Integer A01 = AnonymousClass00R.A00;
    public List A02 = AnonymousClass000.A13();
    public List A03 = AnonymousClass000.A13();
    public C92224gx A04;
    public final C57892jo A05;
    public final C23651Hc A06;
    public final AnonymousClass1M9 A07;
    public final C19830z4 A08;
    public final C18030ve A09;
    public final C57002iN A0A;
    public final C97904qF A0B;
    public final C41731wy A0C = AnonymousClass3MW.A0o();
    public final C41731wy A0D = AnonymousClass3MW.A0o();
    public final C41731wy A0E = AnonymousClass3MW.A0o();
    public final C41731wy A0F = AnonymousClass3MW.A0o();
    public final C41731wy A0G = new C41731wy(AnonymousClass000.A0h());
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final Map A0L = C17880vN.A13();
    public final C18600wl A0M;
    public final C18600wl A0N;
    public final C35751mk A0O;
    public final C76693nw A0P;
    public final C23581Gv A0Q;
    public final C24671Lf A0R;

    public ConversationsSuggestedContactsViewModel(C57892jo r8, C23651Hc r9, C35751mk r10, AnonymousClass1M9 r11, C24671Lf r12, C19830z4 r13, C18030ve r14, C57002iN r15, C97904qF r16, AnonymousClass00H r17, AnonymousClass00H r18, AnonymousClass00H r19, AnonymousClass00H r20, C18600wl r21, C18600wl r22) {
        AnonymousClass00H r5 = r17;
        C18070vi.A0w(r14, r11, r5, r12, r9);
        AnonymousClass00H r3 = r19;
        AnonymousClass00H r4 = r18;
        C72483Me.A16(r10, r13, r4, r3, 7);
        C18600wl r2 = r21;
        C18600wl r1 = r22;
        C18070vi.A0r(r2, r1, r8);
        AnonymousClass00H r6 = r20;
        C18070vi.A0d(r6, 15);
        this.A09 = r14;
        this.A07 = r11;
        this.A0H = r5;
        this.A0R = r12;
        this.A06 = r9;
        this.A0A = r15;
        this.A0O = r10;
        this.A08 = r13;
        this.A0I = r4;
        this.A0K = r3;
        this.A0M = r2;
        this.A0N = r1;
        this.A05 = r8;
        this.A0B = r16;
        this.A0J = r6;
        C94174kA r23 = new C94174kA(this, 6);
        this.A0Q = r23;
        this.A0P = new C76693nw(this, 3);
        this.A04 = new C92224gx(this, 1);
        r12.registerObserver(r23);
    }

    public static final void A00(ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel, AnonymousClass1BI r5) {
        if (conversationsSuggestedContactsViewModel.A01 == AnonymousClass00R.A0N) {
            AnonymousClass3MW.A1X(conversationsSuggestedContactsViewModel.A0M, new ConversationsSuggestedContactsViewModel$updateSuggestionPicOrInfo$1(conversationsSuggestedContactsViewModel, r5, (C30391dr) null), C41561wd.A00(conversationsSuggestedContactsViewModel));
        }
    }

    public static final void A03(ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel, Set set) {
        List list = conversationsSuggestedContactsViewModel.A03;
        int A012 = AnonymousClass3MX.A01(list);
        if (A012 >= 0) {
            while (true) {
                int i = A012 - 1;
                if (C29431cG.A18(set, C72463Mc.A0n(((AnonymousClass4FM) list.get(A012)).A00.A0J))) {
                    list.remove(A012);
                    Object A0I2 = C29401cD.A0I(conversationsSuggestedContactsViewModel.A02);
                    if (A0I2 != null) {
                        list.add(A0I2);
                    }
                }
                if (i < 0) {
                    break;
                }
                A012 = i;
            }
        }
        if (list.size() <= 1) {
            list.clear();
            AnonymousClass3MY.A1M(conversationsSuggestedContactsViewModel.A0G, false);
            conversationsSuggestedContactsViewModel.A01 = AnonymousClass00R.A0j;
        }
        conversationsSuggestedContactsViewModel.A0E.A0E(list);
    }

    private final boolean A04() {
        C41531wa r1 = this.A00;
        if ((r1 == null || ((r1 instanceof C41541wb) && "ALL_FILTER".equals(((C41541wb) r1).A02))) && !C17880vN.A1W(C17890vO.A0B(this.A08), "is_chat_list_suggestions_dismissed")) {
            if (!C18020vd.A05(C18040vf.A02, this.A09, 7223)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A05(ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel) {
        Integer num = conversationsSuggestedContactsViewModel.A01;
        if ((num == AnonymousClass00R.A01 || (num == AnonymousClass00R.A0N && AnonymousClass000.A1a(conversationsSuggestedContactsViewModel.A03))) && conversationsSuggestedContactsViewModel.A04()) {
            return true;
        }
        return false;
    }

    public void A0S() {
        this.A0R.unregisterObserver(this.A0Q);
        this.A06.unregisterObserver(this.A04);
        this.A0O.unregisterObserver(this.A0P);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.4FO] */
    public final void A0U(View view, View view2, C82934Cs r8, AnonymousClass1E7 r9, C139106yE r10, int i) {
        AnonymousClass00H r4 = this.A0J;
        ((C37611pq) r4.get()).A01(r9, Integer.valueOf(i), 4, 6);
        ((C37611pq) C18070vi.A0E(r4)).A02(r9, (Integer) null, 6, true);
        C41731wy r1 = this.A0D;
        ? obj = new Object();
        obj.A00 = i;
        obj.A03 = r8;
        obj.A04 = r9;
        obj.A02 = view;
        obj.A01 = view2;
        obj.A05 = r10;
        r1.A0F(obj);
    }

    public final void A0T() {
        boolean A052 = A05(this);
        Integer num = this.A01;
        if (A052) {
            if (num == AnonymousClass00R.A01) {
                AnonymousClass3MY.A1L(this.A0C, true);
            }
            AnonymousClass3MY.A1L(this.A0G, true);
            return;
        }
        Integer num2 = AnonymousClass00R.A00;
        if (num != num2 || !A04()) {
            this.A01.intValue();
            return;
        }
        C23651Hc r1 = this.A06;
        if (r1.A07) {
            C30451dy.A02(num2, this.A0M, new ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1(this, (C30391dr) null), C41561wd.A00(this));
            return;
        }
        r1.registerObserver(this.A04);
    }
}
