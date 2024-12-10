package com.whatsapp.labelitem.view;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass1D6;
import X.AnonymousClass1DT;
import X.AnonymousClass1KB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4KT;
import X.AnonymousClass4TZ;
import X.AnonymousClass8FK;
import X.C130096is;
import X.C17880vN;
import X.C18070vi;
import X.C18090vk;
import X.C18100vl;
import X.C18460wS;
import X.C194139rE;
import X.C27621Wu;
import X.C29431cG;
import X.C37751q4;
import X.C41731wy;
import X.C72473Md;
import X.C74883d4;
import X.C99154sM;
import android.app.Application;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class AddToListViewModel extends AnonymousClass8FK {
    public C130096is A00;
    public final Application A01;
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0M(C18460wS.A00);
    public final AnonymousClass4KT A03;
    public final AnonymousClass1KB A04;
    public final C37751q4 A05 = new C74883d4(this);
    public final AnonymousClass11S A06;
    public final C41731wy A07 = AnonymousClass3MW.A0o();
    public final C41731wy A08 = AnonymousClass3MW.A0o();
    public final C41731wy A09 = AnonymousClass3MW.A0o();
    public final C41731wy A0A = AnonymousClass3MW.A0o();
    public final C41731wy A0B = AnonymousClass3MW.A0o();
    public final C41731wy A0C = AnonymousClass3MW.A0o();
    public final AnonymousClass10I A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final HashSet A0L = C17880vN.A12();
    public final C18100vl A0M = C99154sM.A01(this, 42);
    public final C18090vk A0N = new C99154sM(this, 41);
    public final C18090vk A0O = new C99154sM(this, 40);
    public final C18090vk A0P = new C99154sM(this, 36);
    public final C18090vk A0Q = new C99154sM(this, 39);
    public final C18090vk A0R = new C99154sM(this, 35);
    public final C18090vk A0S = new C99154sM(this, 37);
    public final C18090vk A0T = new C99154sM(this, 38);

    public void A0S() {
        C17880vN.A0V(this.A0H).unregisterObserver(this.A05);
    }

    public void A0T() {
        C41731wy r4;
        Object obj;
        List A10 = AnonymousClass3MW.A10(this.A02);
        if (A10 != null) {
            if (A10.size() + this.A0L.size() >= 20) {
                r4 = this.A08;
                Application application = this.A01;
                obj = AnonymousClass1D6.A01(application.getResources().getString(2131891733), application.getResources().getString(2131893144));
            } else {
                r4 = this.A07;
                obj = C27621Wu.A00;
            }
            r4.A0F(obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddToListViewModel(Application application, AnonymousClass4KT r4, AnonymousClass1KB r5, AnonymousClass11S r6, AnonymousClass10I r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14) {
        super(application);
        C18070vi.A0w(r5, r6, r8, r7, r9);
        C18070vi.A0x(r10, r11, r12, r4, r13);
        C72473Md.A1L(r14, application);
        this.A04 = r5;
        this.A06 = r6;
        this.A0E = r8;
        this.A0D = r7;
        this.A0K = r9;
        this.A0I = r10;
        this.A0J = r11;
        this.A0H = r12;
        this.A03 = r4;
        this.A0G = r13;
        this.A0F = r14;
        this.A01 = application;
    }

    public void A0U(ArrayList arrayList, ArrayList arrayList2) {
        C18070vi.A0h(arrayList, arrayList2);
        C41731wy r5 = this.A0C;
        boolean z = false;
        Iterator it = C29431cG.A15(arrayList).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C194139rE r4 = (C194139rE) it.next();
            HashSet hashSet = this.A0L;
            AnonymousClass4TZ r2 = (AnonymousClass4TZ) r4.A01;
            if (hashSet.contains(Long.valueOf(r2.A01.A03))) {
                break;
            }
            int i = r2.A00;
            Number number = (Number) arrayList2.get(r4.A00);
            if (number != null) {
                if (i != number.intValue()) {
                    break;
                }
            } else {
                break;
            }
        }
        z = true;
        AnonymousClass3MY.A1L(r5, z);
    }
}
