package com.whatsapp.calling.callconfirmationsheet.vm;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass11S;
import X.AnonymousClass1DF;
import X.AnonymousClass1EC;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1I8;
import X.AnonymousClass1J2;
import X.AnonymousClass1M9;
import X.AnonymousClass1MW;
import X.AnonymousClass1MZ;
import X.AnonymousClass1VP;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4Cl;
import X.AnonymousClass4IV;
import X.AnonymousClass4T3;
import X.AnonymousClass4US;
import X.AnonymousClass4VY;
import X.AnonymousClass4XV;
import X.AnonymousClass4ZN;
import X.AnonymousClass5CJ;
import X.AnonymousClass5CK;
import X.AnonymousClass5CL;
import X.AnonymousClass5HU;
import X.C18070vi;
import X.C18100vl;
import X.C18460wS;
import X.C18600wl;
import X.C23421Fz;
import X.C29431cG;
import X.C37361pP;
import X.C75953mC;
import X.C87154Um;
import X.C89444cT;
import X.C93464j1;
import X.C99454sq;
import java.util.Collection;
import java.util.List;

public final class CallConfirmationSheetViewModel extends AnonymousClass1J2 {
    public boolean A00;
    public final int A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass4Cl A03;
    public final AnonymousClass4XV A04;
    public final AnonymousClass1VP A05;
    public final AnonymousClass1M9 A06;
    public final AnonymousClass1MZ A07;
    public final AnonymousClass1MW A08;
    public final AnonymousClass1EC A09;
    public final C89444cT A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final C18600wl A0F;
    public final C18600wl A0G;
    public final C23421Fz A0H;
    public final C23421Fz A0I;
    public final AnonymousClass1G4 A0J;
    public final AnonymousClass1G4 A0K;

    public CallConfirmationSheetViewModel(C37361pP r6, AnonymousClass11S r7, AnonymousClass4XV r8, AnonymousClass1VP r9, AnonymousClass1M9 r10, AnonymousClass1MZ r11, AnonymousClass1MW r12, C18600wl r13, C18600wl r14) {
        C18070vi.A0d(r6, 1);
        C18070vi.A0p(r7, r9, r10);
        C18070vi.A0d(r12, 5);
        C18070vi.A0l(r11, r13);
        C18070vi.A0d(r14, 9);
        this.A02 = r7;
        this.A05 = r9;
        this.A06 = r10;
        this.A08 = r12;
        this.A07 = r11;
        this.A0G = r13;
        this.A04 = r8;
        this.A0F = r14;
        this.A03 = (AnonymousClass4Cl) r6.A02("call_type");
        this.A09 = (AnonymousClass1EC) r6.A02("group_jid");
        Number number = (Number) r6.A02("call_from_ui");
        if (number != null) {
            this.A01 = number.intValue();
            this.A0A = (C89444cT) r6.A02("call_log_key");
            Integer num = AnonymousClass00R.A0C;
            this.A0E = AnonymousClass1DF.A00(num, new AnonymousClass5CL(this));
            this.A0C = AnonymousClass1DF.A00(num, new AnonymousClass5CJ(this));
            C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A01, new AnonymousClass5HU(new AnonymousClass4T3(C18460wS.A00, true)));
            this.A0B = A002;
            this.A0H = AnonymousClass3MX.A18(A002);
            AnonymousClass1I8 r3 = AnonymousClass4IV.A01;
            AnonymousClass1G7 A18 = AnonymousClass3MW.A18(r3);
            this.A0K = A18;
            this.A0I = new C99454sq(A18, 13);
            this.A0J = AnonymousClass3MW.A18(r3);
            this.A0D = AnonymousClass1DF.A00(num, new AnonymousClass5CK(this));
            return;
        }
        throw AnonymousClass000.A0n("CallConfirmationSheetViewModel callFromUi cannot be null");
    }

    public static AnonymousClass4US A00(CallConfirmationSheetViewModel callConfirmationSheetViewModel) {
        return (AnonymousClass4US) callConfirmationSheetViewModel.A0E.getValue();
    }

    public static final Integer A03(CallConfirmationSheetViewModel callConfirmationSheetViewModel) {
        AnonymousClass1EC r1 = callConfirmationSheetViewModel.A09;
        if (r1 != null) {
            return Integer.valueOf(callConfirmationSheetViewModel.A08.A0A(r1));
        }
        return null;
    }

    public static final void A04(CallConfirmationSheetViewModel callConfirmationSheetViewModel) {
        Collection collection;
        boolean z;
        List A062;
        C87154Um r3;
        List A063;
        AnonymousClass1G4 r1 = callConfirmationSheetViewModel.A0K;
        C18100vl r4 = callConfirmationSheetViewModel.A0E;
        boolean Bf6 = r4.Bf6();
        AnonymousClass4VY r32 = (AnonymousClass4VY) callConfirmationSheetViewModel.A0C.getValue();
        if (Bf6) {
            collection = (Collection) ((AnonymousClass4US) r4.getValue()).A02.getValue();
            z = ((AnonymousClass4US) r4.getValue()).A00;
        } else {
            collection = C18460wS.A00;
            z = false;
        }
        if (r32 instanceof C75953mC) {
            C75953mC r33 = (C75953mC) r32;
            C18070vi.A0d(collection, 0);
            AnonymousClass4ZN A022 = r33.A02(collection);
            AnonymousClass4ZN A032 = r33.A03(collection, z);
            C93464j1 A002 = r33.A00(collection);
            if (collection.isEmpty() || r33.A08(collection)) {
                A063 = r33.A06();
            } else {
                A063 = C29431cG.A0t(collection);
            }
            r3 = new C87154Um(A002, r33.A01(collection), A022, A032, A063);
        } else {
            C18070vi.A0d(collection, 0);
            AnonymousClass4ZN A023 = r32.A02(collection);
            AnonymousClass4ZN A033 = r32.A03(collection, z);
            C93464j1 A003 = r32.A00(collection);
            if (collection.isEmpty() || r32.A08(collection)) {
                A062 = r32.A06();
            } else {
                A062 = C29431cG.A0t(collection);
            }
            r3 = new C87154Um(A003, r32.A01(collection), A023, A033, A062);
        }
        r1.setValue(r3);
    }
}
