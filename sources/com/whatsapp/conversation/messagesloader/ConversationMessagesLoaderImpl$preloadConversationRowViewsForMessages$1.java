package com.whatsapp.conversation.messagesloader;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1LT;
import X.AnonymousClass1OS;
import X.AnonymousClass4UB;
import X.C18020vd;
import X.C18040vf;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C87204Ur;
import X.C95184lp;
import android.content.Context;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.messagesloader.ConversationMessagesLoaderImpl$preloadConversationRowViewsForMessages$1", f = "ConversationMessagesLoaderImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationMessagesLoaderImpl$preloadConversationRowViewsForMessages$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AnonymousClass1BI $jid;
    public final /* synthetic */ Context $outgoingBubbleContext;
    public int label;
    public final /* synthetic */ C95184lp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationMessagesLoaderImpl$preloadConversationRowViewsForMessages$1(Context context, Context context2, C95184lp r4, AnonymousClass1BI r5, C30391dr r6) {
        super(2, r6);
        this.$jid = r5;
        this.this$0 = r4;
        this.$outgoingBubbleContext = context;
        this.$context = context2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        AnonymousClass1BI r4 = this.$jid;
        return new ConversationMessagesLoaderImpl$preloadConversationRowViewsForMessages$1(this.$outgoingBubbleContext, this.$context, this.this$0, r4, r8);
    }

    public final Object invokeSuspend(Object obj) {
        List<AnonymousClass4UB> A0v;
        int i;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C87204Ur A01 = C95184lp.A01(this.this$0, this.$jid);
            if (A01 != null) {
                int max = Math.max(1, C18020vd.A00(C18040vf.A02, this.this$0.A05, 12745));
                List list = A01.A04;
                if (!(list == null || (A0v = C29431cG.A0v(list, max)) == null)) {
                    C95184lp r5 = this.this$0;
                    Context context = this.$outgoingBubbleContext;
                    Context context2 = this.$context;
                    for (AnonymousClass4UB r0 : A0v) {
                        boolean z = r0.A02;
                        int i2 = r0.A00;
                        if (i2 == 0) {
                            i = 2131624946;
                            if (z) {
                                i = 2131624948;
                            }
                        } else if (i2 == 1) {
                            i = 2131624850;
                            if (z) {
                                i = 2131624852;
                            }
                        } else if (i2 == 2) {
                            i = 2131624961;
                            if (z) {
                                i = 2131624962;
                            }
                        } else if (i2 == 3) {
                            i = 2131624956;
                            if (z) {
                                i = 2131624957;
                            }
                        } else if (i2 == 5) {
                            i = 2131624863;
                            if (z) {
                                i = 2131624865;
                            }
                        } else if (i2 == 9) {
                            i = 2131624814;
                            if (z) {
                                i = 2131624817;
                            }
                        } else if (i2 == 13) {
                            i = 2131624830;
                            if (z) {
                                i = 2131624831;
                            }
                        } else if (i2 == 16) {
                            i = 2131624856;
                            if (z) {
                                i = 2131624858;
                            }
                        } else if (i2 == 20) {
                            i = 2131624925;
                            if (z) {
                                i = 2131624931;
                            }
                        } else if (i2 == 99) {
                            i = 2131624764;
                            if (z) {
                                i = 2131624765;
                            }
                        }
                        Integer valueOf = Integer.valueOf(i);
                        if (valueOf != null) {
                            AnonymousClass1LT r2 = r5.A06;
                            Context context3 = context2;
                            if (z) {
                                context3 = context;
                            }
                            r2.A01(context3, valueOf.intValue());
                        }
                    }
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ConversationMessagesLoaderImpl$preloadConversationRowViewsForMessages$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
