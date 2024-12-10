package X;

import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GetVNameCertificateJob;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.Axo  reason: case insensitive filesystem */
public final class C22110Axo extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CartFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22110Axo(CartFragment cartFragment) {
        super(1);
        this.this$0 = cartFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        String str2;
        String stringText;
        CartFragment cartFragment = this.this$0;
        MentionableEntry mentionableEntry = cartFragment.A0c;
        if (mentionableEntry == null || (stringText = mentionableEntry.getStringText()) == null) {
            str = null;
        } else {
            int length = stringText.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean A0u = C109005cf.A0u(stringText, i2);
                if (z) {
                    if (!A0u) {
                        break;
                    }
                    length--;
                } else if (!A0u) {
                    z = true;
                } else {
                    i++;
                }
            }
            str = C108985cd.A0g(length, i, stringText);
        }
        MentionableEntry mentionableEntry2 = cartFragment.A0c;
        if (mentionableEntry2 != null) {
            mentionableEntry2.setText("");
        }
        if (str != null) {
            AnonymousClass8G8 A2K = cartFragment.A2K();
            AnonymousClass01E r7 = (AnonymousClass01E) C72453Mb.A0Z(cartFragment);
            C161848Hz r8 = cartFragment.A0J;
            if (r8 == null) {
                C18070vi.A11("cartItemsAdapter");
                throw null;
            }
            C20005A2v a2v = cartFragment.A0O;
            if (a2v == null) {
                C18070vi.A11("catalogLoadSession");
                throw null;
            }
            C18070vi.A0d(r7, 1);
            AnonymousClass1PM r0 = A2K.A0L;
            UserJid userJid = A2K.A0O;
            C42741yf A02 = r0.A02(userJid);
            if (A02 == null || (str2 = A02.A08) == null) {
                A2K.A0G.A01(new GetVNameCertificateJob(userJid));
            } else {
                AnonymousClass8G8.A00(r7, r8, A2K, a2v, str, str2);
            }
        }
        C198719yn r2 = cartFragment.A2L().A02;
        C21424Ajr.A00(r2.A0C, r2, 22);
        return C27621Wu.A00;
    }
}
