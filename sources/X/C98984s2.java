package X;

import com.whatsapp.conversation.conversationrow.message.MessageDetailsViewModel;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.4s2  reason: invalid class name and case insensitive filesystem */
public class C98984s2 implements Comparator {
    public final int A00 = 2;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C98984s2(MessageDetailsViewModel messageDetailsViewModel, List list) {
        this.A03 = messageDetailsViewModel;
        this.A04 = list;
        this.A01 = new C146987Rj(messageDetailsViewModel.A04, messageDetailsViewModel.A05);
        this.A02 = new HashMap(list.size());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        if (r0 == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x00dd;
                case 1: goto L_0x0054;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.4Tf r8 = (X.C86824Tf) r8
            X.4Tf r9 = (X.C86824Tf) r9
            X.C18070vi.A0h(r8, r9)
            java.lang.Object r0 = r7.A04
            X.4NN r0 = (X.AnonymousClass4NN) r0
            X.11S r1 = r0.A01
            X.1E7 r5 = r8.A01
            boolean r0 = X.AnonymousClass3Ma.A1V(r1, r5)
            if (r0 != 0) goto L_0x0041
            X.1E7 r4 = r9.A01
            boolean r0 = X.AnonymousClass3Ma.A1V(r1, r4)
            if (r0 != 0) goto L_0x0041
            java.lang.Object r3 = r7.A01
            java.util.HashSet r3 = (java.util.HashSet) r3
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r5.A06(r2)
            boolean r1 = X.C29431cG.A18(r3, r0)
            com.whatsapp.jid.Jid r0 = r4.A06(r2)
            boolean r0 = X.C29431cG.A18(r3, r0)
            if (r1 == 0) goto L_0x003e
            if (r0 != 0) goto L_0x0041
        L_0x003c:
            r6 = -1
        L_0x003d:
            return r6
        L_0x003e:
            if (r0 == 0) goto L_0x0041
            goto L_0x0078
        L_0x0041:
            java.lang.Object r2 = r7.A03
            X.11S r2 = (X.AnonymousClass11S) r2
            boolean r1 = X.AnonymousClass3Ma.A1V(r2, r5)
            X.1E7 r0 = r9.A01
            boolean r0 = X.AnonymousClass3Ma.A1V(r2, r0)
            if (r1 == r0) goto L_0x00d0
            if (r1 == 0) goto L_0x0078
            goto L_0x003c
        L_0x0054:
            X.4Ua r8 = (X.C87034Ua) r8
            X.4Ua r9 = (X.C87034Ua) r9
            int r3 = r8.A00()
            int r2 = r9.A00()
            r6 = -1
            r5 = 1
            if (r3 == r2) goto L_0x007a
            java.lang.Integer r0 = r8.A02()
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            if (r1 == r0) goto L_0x003d
            java.lang.Integer r0 = r9.A02()
            if (r1 == r0) goto L_0x0083
            boolean r0 = X.C446824j.A03(r3, r2)
            if (r0 == 0) goto L_0x003d
        L_0x0078:
            r6 = 1
            return r6
        L_0x007a:
            com.whatsapp.jid.UserJid r2 = r8.A02
            if (r2 != 0) goto L_0x0084
            com.whatsapp.jid.UserJid r0 = r9.A02
            if (r0 != 0) goto L_0x0083
            r5 = 0
        L_0x0083:
            return r5
        L_0x0084:
            com.whatsapp.jid.UserJid r4 = r9.A02
            if (r4 == 0) goto L_0x003d
            java.lang.Object r1 = r7.A02
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r3 = r1.get(r2)
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            if (r3 != 0) goto L_0x00a1
            java.lang.Object r0 = r7.A03
            com.whatsapp.conversation.conversationrow.message.MessageDetailsViewModel r0 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsViewModel) r0
            X.1M9 r0 = r0.A03
            X.1E7 r3 = r0.A0H(r2)
            r1.put(r2, r3)
        L_0x00a1:
            java.lang.Object r2 = r1.get(r4)
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            if (r2 != 0) goto L_0x00b6
            java.lang.Object r0 = r7.A03
            com.whatsapp.conversation.conversationrow.message.MessageDetailsViewModel r0 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsViewModel) r0
            X.1M9 r0 = r0.A03
            X.1E7 r2 = r0.A0H(r4)
            r1.put(r4, r2)
        L_0x00b6:
            boolean r0 = X.AnonymousClass3MZ.A1X(r3)
            r1 = r0 ^ 1
            boolean r0 = X.AnonymousClass3MZ.A1X(r2)
            r0 = r0 ^ 1
            if (r1 != r0) goto L_0x00cd
            java.lang.Object r0 = r7.A01
            X.7Rj r0 = (X.C146987Rj) r0
            int r6 = r0.compare(r3, r2)
            return r6
        L_0x00cd:
            if (r1 == 0) goto L_0x0083
            return r6
        L_0x00d0:
            java.lang.Object r2 = r7.A02
            java.text.Collator r2 = (java.text.Collator) r2
            X.1yg r1 = r8.A00
            X.1yg r0 = r9.A00
            int r6 = X.C98964s0.A00(r1, r0, r2)
            return r6
        L_0x00dd:
            java.lang.Object r6 = r7.A04
            X.A11 r6 = (X.A11) r6
            java.lang.Object r5 = r7.A01
            X.1OX r5 = (X.AnonymousClass1OX) r5
            java.lang.Object r4 = r7.A03
            X.9hO r4 = (X.C188419hO) r4
            java.lang.Object r3 = r7.A02
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Map r0 = X.A11.A00(r4, r6, r3, r5)
            java.lang.Object r2 = r0.get(r8)
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r2 != 0) goto L_0x00ff
            r2 = r1
        L_0x00ff:
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.util.Map r0 = X.A11.A00(r4, r6, r3, r5)
            java.lang.Object r0 = r0.get(r9)
            if (r0 == 0) goto L_0x010c
            r1 = r0
        L_0x010c:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r6 = X.C40151uF.A00(r2, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98984s2.compare(java.lang.Object, java.lang.Object):int");
    }

    public C98984s2(AnonymousClass11S r2, C24921Me r3, AnonymousClass4NN r4, HashSet hashSet) {
        this.A04 = r4;
        this.A01 = hashSet;
        this.A03 = r2;
        this.A02 = r3.A0c();
    }

    public C98984s2(C188419hO r2, A11 a11, Collection collection, AnonymousClass1OX r5) {
        this.A04 = a11;
        this.A01 = r5;
        this.A03 = r2;
        this.A02 = collection;
    }
}
