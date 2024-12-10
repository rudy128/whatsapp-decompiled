package X;

import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.2yW  reason: invalid class name and case insensitive filesystem */
public class C66652yW implements C34241kA {
    public final int A00;
    public final Object A01;

    public C66652yW(ConversationsFragment conversationsFragment, int i) {
        this.A00 = i;
        this.A01 = conversationsFragment;
    }

    public final void C3e(AnonymousClass4YL r11) {
        if (this.A00 != 0) {
            ConversationsFragment conversationsFragment = (ConversationsFragment) this.A01;
            Integer num = r11.A02;
            if (num == AnonymousClass00R.A00) {
                boolean z = !C17880vN.A1X(conversationsFragment.A1v.A01);
                LinkedHashSet linkedHashSet = conversationsFragment.A3g;
                ((C31191fA) conversationsFragment.A2x.get()).A0H(linkedHashSet, true);
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass4VV) conversationsFragment.A2w.get()).A04(C17880vN.A0Q(it), 1, (Integer) null, 5);
                    AnonymousClass1TK.A00(((AnonymousClass4VV) conversationsFragment.A2w.get()).A00, "new_add_chat_count");
                }
                if (z) {
                    ((C31191fA) conversationsFragment.A2x.get()).A08(conversationsFragment.A14());
                }
            } else if (num == AnonymousClass00R.A0C) {
                ((C31191fA) conversationsFragment.A2x.get()).A0E((AnonymousClass1FY) conversationsFragment.A1D(), ConversationsFragment.A05(conversationsFragment));
            }
            if (!conversationsFragment.A3t) {
                conversationsFragment.A2I(false, true);
            }
            if (num != AnonymousClass00R.A0Y) {
                ((C31191fA) conversationsFragment.A2x.get()).A00 = false;
                ConversationsFragment.A0h(conversationsFragment, 2);
                return;
            }
            return;
        }
        ConversationsFragment conversationsFragment2 = (ConversationsFragment) this.A01;
        Integer num2 = r11.A02;
        if (num2 == AnonymousClass00R.A00) {
            LinkedHashSet linkedHashSet2 = conversationsFragment2.A3g;
            ((C31191fA) conversationsFragment2.A2x.get()).A0H(linkedHashSet2, false);
            Iterator it2 = linkedHashSet2.iterator();
            while (it2.hasNext()) {
                ((AnonymousClass4VV) conversationsFragment2.A2w.get()).A04(C17880vN.A0Q(it2), C17880vN.A0h(), (Integer) null, 6);
                AnonymousClass1TK.A00(((AnonymousClass4VV) conversationsFragment2.A2w.get()).A00, "new_remove_chat_count");
            }
        } else if (num2 == AnonymousClass00R.A0C) {
            ((C31191fA) conversationsFragment2.A2x.get()).A0E((AnonymousClass1FY) conversationsFragment2.A1D(), ConversationsFragment.A05(conversationsFragment2));
        }
        if (num2 != AnonymousClass00R.A0Y) {
            ((C31191fA) conversationsFragment2.A2x.get()).A00 = false;
            ConversationsFragment.A0h(conversationsFragment2, 2);
        }
    }
}
