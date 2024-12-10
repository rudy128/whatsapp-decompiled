package com.whatsapp.conversationslist.filter;

import X.AnonymousClass000;
import X.AnonymousClass0DT;
import X.AnonymousClass1NA;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C23141Ev;
import X.C27621Wu;
import X.C28781at;
import X.C28801av;
import X.C29351c6;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C41551wc;
import X.C41761x1;
import X.C58112kA;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversationslist.filter.ConversationFilterActions$getLabelFilterList$2", f = "ConversationFilterActions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationFilterActions$getLabelFilterList$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C58112kA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationFilterActions$getLabelFilterList$2(C58112kA r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ConversationFilterActions$getLabelFilterList$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ConversationFilterActions$getLabelFilterList$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Cursor A00;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1NA r4 = (AnonymousClass1NA) this.this$0.A00.get();
            C28781at A04 = r4.A03.get();
            try {
                A00 = C23141Ev.A00(((C28801av) A04).A02, "SELECT labels._id, labels.type, labels.label_name, labels.predefined_id, labels.sort_id, labels.color_id, labels.hidden, (SELECT COUNT(*) FROM labeled_jid WHERE label_id = labels._id) as labelItemCount FROM labels WHERE labelItemCount > 0", "SELECT_USED_LABELS");
                ArrayList A02 = AnonymousClass1NA.A02(A00, true);
                if (A00 != null) {
                    A00.close();
                }
                A04.close();
                AnonymousClass1NA.A03(r4, A02);
                ArrayList A0D = C29351c6.A0D(A02);
                Iterator it = A02.iterator();
                while (it.hasNext()) {
                    C41761x1 r2 = (C41761x1) it.next();
                    C18070vi.A0b(r2);
                    A0D.add(new C41551wc(r2, 0));
                }
                return A0D;
            } catch (Throwable th) {
                try {
                    A04.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        throw th;
    }
}
