package com.whatsapp.communitymedia;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.C27621Wu;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C72463Mc;
import X.C73373Vg;
import X.C94064jz;
import X.C98914rv;
import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.communitymedia.CommunityMediaViewModel$refreshSubgroups$1", f = "CommunityMediaViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMediaViewModel$refreshSubgroups$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C73373Vg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMediaViewModel$refreshSubgroups$1(C73373Vg r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CommunityMediaViewModel$refreshSubgroups$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommunityMediaViewModel$refreshSubgroups$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList A13;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C73373Vg r0 = this.this$0;
            List A0y = C29431cG.A0y(r0.A0D.A0A(r0.A0Q), new C98914rv(this.this$0.A0N));
            ArrayList<GroupJid> A0E = C29351c6.A0E(A0y);
            Iterator it = A0y.iterator();
            while (it.hasNext()) {
                C72463Mc.A1K(A0E, it);
            }
            this.this$0.A08.A0E(A0E);
            C73373Vg r5 = this.this$0;
            AnonymousClass1G4 r4 = r5.A0n;
            do {
                value = r4.getValue();
                ArrayList A0E2 = C29351c6.A0E(A0E);
                for (GroupJid groupJid : A0E) {
                    A0E2.add(new C94064jz(r5.A0K.A0H(groupJid), C73373Vg.A00(r5, groupJid), AnonymousClass3MW.A16(r5, 34), r5.A0O.A07(C18070vi.A0M(groupJid))));
                }
                A13 = AnonymousClass000.A13();
                for (Object next : A0E2) {
                    if (((C94064jz) next).A00 > 0) {
                        A13.add(next);
                    }
                }
            } while (!r4.BFK(value, A13));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
