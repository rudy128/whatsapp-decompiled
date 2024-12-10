package com.whatsapp.calling.chatmessages;

import X.AnonymousClass000;
import X.AnonymousClass118;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass1ZU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4UT;
import X.C178109Bv;
import X.C178119Bw;
import X.C17880vN;
import X.C22931Dv;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C89444cT;
import X.C98924rw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel$refreshParticipants$1", f = "AdhocParticipantBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AdhocParticipantBottomSheetViewModel$refreshParticipants$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AdhocParticipantBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdhocParticipantBottomSheetViewModel$refreshParticipants$1(AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = adhocParticipantBottomSheetViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AdhocParticipantBottomSheetViewModel$refreshParticipants$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AdhocParticipantBottomSheetViewModel$refreshParticipants$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C178119Bw A05;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel = this.this$0;
            C89444cT r1 = adhocParticipantBottomSheetViewModel.A0C;
            if (!(r1 == null || (A05 = adhocParticipantBottomSheetViewModel.A0B.A05(r1)) == null)) {
                AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel2 = this.this$0;
                adhocParticipantBottomSheetViewModel2.A02 = A05.A0J;
                adhocParticipantBottomSheetViewModel2.A00 = A05;
                AnonymousClass1G4 r3 = adhocParticipantBottomSheetViewModel2.A0G;
                int i = 2131887760;
                if (A05.A0Q()) {
                    i = 2131887761;
                }
                r3.setValue(AnonymousClass3MX.A0t(i));
                AnonymousClass1G4 r4 = adhocParticipantBottomSheetViewModel2.A0F;
                AnonymousClass118 r32 = adhocParticipantBottomSheetViewModel2.A0A;
                Object[] A1a = AnonymousClass3MW.A1a();
                C17880vN.A1T(A1a, A05.A0B().size() - 1, 0);
                r4.setValue(r32.A02(2131887738, A1a));
                ArrayList A0B = A05.A0B();
                AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel3 = this.this$0;
                ArrayList<C178109Bv> A13 = AnonymousClass000.A13();
                Iterator it = A0B.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    AnonymousClass11S r12 = adhocParticipantBottomSheetViewModel3.A05;
                    C22931Dv r0 = AnonymousClass1BI.A00;
                    if (!r12.A0O(C22931Dv.A00(((C178109Bv) next).A00))) {
                        A13.add(next);
                    }
                }
                AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel4 = this.this$0;
                ArrayList A0D = C29351c6.A0D(A13);
                for (C178109Bv r02 : A13) {
                    AnonymousClass1E7 A0H = adhocParticipantBottomSheetViewModel4.A08.A0H(r02.A00);
                    String str = adhocParticipantBottomSheetViewModel4.A09.A0F(A0H, 7, false, true).A01;
                    if (str == null) {
                        str = "";
                    }
                    A0D.add(new AnonymousClass4UT(A0H, str, true, true));
                }
                AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel5 = this.this$0;
                AnonymousClass1G4 r8 = adhocParticipantBottomSheetViewModel5.A0I;
                List A00 = C98924rw.A00(A0D, 2);
                ArrayList A0D2 = C29351c6.A0D(A00);
                Iterator it2 = A00.iterator();
                int i2 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            AnonymousClass1ZU.A0B();
                            break;
                        }
                        AnonymousClass4UT r42 = (AnonymousClass4UT) next2;
                        int i4 = adhocParticipantBottomSheetViewModel5.A04;
                        boolean z = true;
                        r42.A01 = AnonymousClass000.A1U(i2, i4);
                        if (i2 >= i4) {
                            z = false;
                        }
                        r42.A00 = z;
                        A0D2.add(r42);
                        i2 = i3;
                    } else {
                        r8.setValue(A0D2);
                        AnonymousClass1G4 r33 = adhocParticipantBottomSheetViewModel5.A0H;
                        Iterable<AnonymousClass4UT> iterable = (Iterable) adhocParticipantBottomSheetViewModel5.A0I.getValue();
                        int i5 = 0;
                        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                            for (AnonymousClass4UT r03 : iterable) {
                                if (r03.A01 && (i5 = i5 + 1) < 0) {
                                    AnonymousClass1ZU.A0A();
                                }
                            }
                        }
                        r33.setValue(AnonymousClass3MW.A0v(i5));
                    }
                }
                throw null;
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
