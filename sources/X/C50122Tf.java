package X;

import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.2Tf  reason: invalid class name and case insensitive filesystem */
public abstract class C50122Tf {
    public static final void A00(C18030ve r5, C19998A2m a2m, AnonymousClass8X8 r7, AnonymousClass206 r8) {
        C18070vi.A0d(r7, 2);
        List list = r8.A0h;
        if (list != null && !AnonymousClass4aJ.A02(GroupJid.class, list).isEmpty() && !C18020vd.A05(C18040vf.A02, r5, 8784)) {
            AnonymousClass8X8 r4 = a2m.A00;
            C163988Xc r0 = ((C166418cr) r4.A00).groupMentionedMessage_;
            if (r0 == null) {
                r0 = C163988Xc.DEFAULT_INSTANCE;
            }
            AnonymousClass8X6 r02 = (AnonymousClass8X6) r0.A0O();
            C166048cG A0G = r7.A0G();
            C20133A8t.A09(r5, r7);
            r02.A0H(r7);
            r4.A0D();
            C166418cr r2 = (C166418cr) C17880vN.A0G(r4);
            C163988Xc r03 = (C163988Xc) r02.A0C();
            r03.getClass();
            r2.groupMentionedMessage_ = r03;
            r2.bitField1_ |= A7Y.A0F;
            if (A0G != null && A0G.A0J((EAO) null) > 0) {
                r4.A0V(A0G);
            }
        }
    }
}
