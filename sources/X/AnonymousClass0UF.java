package X;

import androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1$1;

/* renamed from: X.0UF  reason: invalid class name */
public final class AnonymousClass0UF implements C16040rc {
    public static final AnonymousClass0UF A00 = new Object();

    public static final C17330uU A00(C16110rj r7, C17130tn r8) {
        Object A1C = AnonymousClass001.A1C(r8, 1206586544);
        Object obj = AnonymousClass0MH.A00;
        if (A1C == obj) {
            A1C = AnonymousClass0Q9.A03(false);
            AnonymousClass0VR.A0V(r8, A1C);
        }
        AnonymousClass0VR r3 = (AnonymousClass0VR) r8;
        AnonymousClass0VR.A0R(r3, false);
        C17330uU r6 = (C17330uU) A1C;
        boolean A1a = AnonymousClass001.A1a(r8, r7, r6, 1135049322);
        Object CER = r8.CER();
        if (A1a || CER == obj) {
            CER = new HoverInteractionKt$collectIsHoveredAsState$1$1(r7, r6, (C30391dr) null);
            r3.A0c(CER);
        }
        AnonymousClass0VR.A0R(r3, false);
        AnonymousClass0QC.A04(r8, r7, (AnonymousClass1OS) CER);
        AnonymousClass0VR.A0R(r3, false);
        return r6;
    }

    public C16050rd CEQ(C16110rj r6, C17130tn r7) {
        r7.COB(1683566979);
        C17330uU A002 = C02270Dj.A00(r6, r7);
        C17330uU A003 = A00(r6, r7);
        C17330uU A004 = C02260Di.A00(r6, r7);
        boolean A1X = AnonymousClass001.A1X(r7, r6);
        Object CER = r7.CER();
        if (A1X || CER == AnonymousClass0MH.A00) {
            CER = new AnonymousClass0UG(A002, A003, A004);
            AnonymousClass0VR.A0V(r7, CER);
        }
        AnonymousClass0VR r72 = (AnonymousClass0VR) r7;
        AnonymousClass0VR.A0R(r72, false);
        AnonymousClass0UG r1 = (AnonymousClass0UG) CER;
        AnonymousClass0VR.A0R(r72, false);
        return r1;
    }
}
