package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass11S;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.C17880vN;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C445823z;
import X.C78943ty;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowEvent$fillResponsesSection$1", f = "ConversationRowEvent.kt", i = {}, l = {580}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowEvent$fillResponsesSection$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C445823z $eventMessage;
    public final /* synthetic */ List $facePileMessages;
    public int label;
    public final /* synthetic */ C78943ty this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowEvent$fillResponsesSection$1$1", f = "ConversationRowEvent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.conversationrow.ConversationRowEvent$fillResponsesSection$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(r3, r22, A13, r6);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x008c, code lost:
            if (r0 == null) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
            if (r3.size() == 2) goto L_0x0084;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                int r0 = r9.label
                if (r0 != 0) goto L_0x00b7
                X.C30691eM.A01(r10)
                java.util.ArrayList r0 = r5
                java.util.Iterator r8 = r0.iterator()
                r6 = 0
                r1 = 0
            L_0x000f:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto L_0x0037
                int r7 = r1 + 1
                X.1E7 r5 = X.C17880vN.A0O(r8)
                X.3ty r0 = r3
                com.whatsapp.contact.FacepileView r0 = r0.A0J
                com.whatsapp.WaImageView r4 = r0.A04(r1)
                if (r4 == 0) goto L_0x0035
                X.3ty r3 = r3
                X.1pZ r2 = r3.A0K
                r1 = 2
                X.4kF r0 = new X.4kF
                r0.<init>(r5, r3, r1)
                r2.A05(r4, r0, r5, r6)
                r4.setVisibility(r6)
            L_0x0035:
                r1 = r7
                goto L_0x000f
            L_0x0037:
                java.util.ArrayList r3 = r5
                boolean r0 = r3.isEmpty()
                r2 = 8
                r7 = 1
                if (r0 == 0) goto L_0x0070
                X.3ty r0 = r3
                android.widget.LinearLayout r0 = r0.A0C
            L_0x0046:
                r0.setVisibility(r2)
            L_0x0049:
                X.23z r0 = r2
                java.util.List r0 = r0.A18()
                if (r0 == 0) goto L_0x009b
                java.util.ArrayList r4 = X.AnonymousClass000.A13()
                java.util.Iterator r3 = r0.iterator()
            L_0x0059:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0096
                java.lang.Object r2 = r3.next()
                r0 = r2
                X.24H r0 = (X.AnonymousClass24H) r0
                X.2Qx r1 = r0.A02
                X.2Qx r0 = X.C49552Qx.GOING
                if (r1 != r0) goto L_0x0059
                r4.add(r2)
                goto L_0x0059
            L_0x0070:
                int r0 = r3.size()
                r1 = 2
                if (r0 != r7) goto L_0x008f
                X.3ty r0 = r3
                com.whatsapp.contact.FacepileView r0 = r0.A0J
                com.whatsapp.WaImageView r0 = r0.A04(r7)
                if (r0 == 0) goto L_0x0084
                r0.setVisibility(r2)
            L_0x0084:
                X.3ty r0 = r3
                com.whatsapp.contact.FacepileView r0 = r0.A0J
                com.whatsapp.WaImageView r0 = r0.A04(r1)
                if (r0 != 0) goto L_0x0046
                goto L_0x0049
            L_0x008f:
                int r0 = r3.size()
                if (r0 != r1) goto L_0x0049
                goto L_0x0084
            L_0x0096:
                int r0 = r4.size()
                goto L_0x009c
            L_0x009b:
                r0 = 0
            L_0x009c:
                int r5 = r0 + 1
                X.3ty r0 = r3
                com.whatsapp.WaTextView r4 = r0.A0I
                android.content.res.Resources r3 = X.AnonymousClass000.A0Y(r0)
                r2 = 2131755132(0x7f10007c, float:1.9141135E38)
                java.lang.Object[] r1 = new java.lang.Object[r7]
                java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r5)
                r1[r6] = r0
                X.AnonymousClass3MX.A1E(r3, r4, r1, r2, r5)
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x00b7:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.ConversationRowEvent$fillResponsesSection$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowEvent$fillResponsesSection$1(C78943ty r2, C445823z r3, List list, C30391dr r5) {
        super(2, r5);
        this.$facePileMessages = list;
        this.this$0 = r2;
        this.$eventMessage = r3;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ConversationRowEvent$fillResponsesSection$1(this.this$0, this.$eventMessage, this.$facePileMessages, r6);
    }

    public final Object invokeSuspend(Object obj) {
        Object A0H;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final ArrayList A13 = AnonymousClass000.A13();
            Iterator it = this.$facePileMessages.iterator();
            while (it.hasNext()) {
                AnonymousClass206 A0Y = C17880vN.A0Y(it);
                C78943ty r2 = this.this$0;
                if (A0Y.A0v.A02) {
                    AnonymousClass11S r0 = r2.A0U;
                    r0.A0I();
                    A0H = r0.A0D;
                } else {
                    UserJid A0I = A0Y.A0I();
                    if (A0I != null) {
                        A0H = r2.A0j.A0H(A0I);
                    }
                }
                if (A0H != null) {
                    A13.add(A0H);
                }
            }
            C18600wl mainDispatcher = this.this$0.getMainDispatcher();
            final C78943ty r3 = this.this$0;
            final C445823z r22 = this.$eventMessage;
            AnonymousClass1 r02 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, mainDispatcher, r02) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ConversationRowEvent$fillResponsesSection$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
