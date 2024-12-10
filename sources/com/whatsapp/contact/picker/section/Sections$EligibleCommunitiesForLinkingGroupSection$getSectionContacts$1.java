package com.whatsapp.contact.picker.section;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.AnonymousClass3rL;
import X.AnonymousClass4TO;
import X.C17880vN;
import X.C27621Wu;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C42941yz;
import X.C77663r9;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.section.Sections$EligibleCommunitiesForLinkingGroupSection$getSectionContacts$1", f = "Sections.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Sections$EligibleCommunitiesForLinkingGroupSection$getSectionContacts$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass3rL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Sections$EligibleCommunitiesForLinkingGroupSection$getSectionContacts$1(AnonymousClass3rL r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new Sections$EligibleCommunitiesForLinkingGroupSection$getSectionContacts$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new Sections$EligibleCommunitiesForLinkingGroupSection$getSectionContacts$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C77663r9 r0;
        int i;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass3rL r6 = this.this$0;
            ArrayList arrayList = r6.A01;
            ArrayList A0D = C29351c6.A0D(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass1E7 A0O = C17880vN.A0O(it);
                C42941yz r02 = AnonymousClass1EC.A01;
                AnonymousClass1EC A00 = C42941yz.A00(A0O.A0J);
                int i2 = 0;
                if (A00 != null) {
                    AnonymousClass4TO r03 = (AnonymousClass4TO) r6.A00.get(A00);
                    if (r03 != null) {
                        i = r03.A00;
                        i2 = r03.A01;
                    } else {
                        i = 0;
                    }
                    r0 = new C77663r9(A0O, i, i2);
                } else {
                    r0 = new C77663r9(A0O, 0, 0);
                }
                A0D.add(r0);
            }
            return C17880vN.A10(C29431cG.A0t(A0D));
        }
        throw AnonymousClass000.A0l();
    }
}
