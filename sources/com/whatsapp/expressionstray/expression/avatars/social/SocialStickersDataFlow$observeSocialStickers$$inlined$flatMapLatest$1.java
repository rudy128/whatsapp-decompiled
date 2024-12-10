package com.whatsapp.expressionstray.expression.avatars.social;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1G2;
import X.C130336jG;
import X.C147197Se;
import X.C23421Fz;
import X.C27621Wu;
import X.C28243Du4;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C36001nB;
import X.C88604aC;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.avatars.social.SocialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1", f = "SocialStickersDataFlow.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
public final class SocialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1 extends C30431dv implements C36001nB {
    public final /* synthetic */ String $ownFbId$inlined;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ C130336jG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SocialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1(C130336jG r2, String str, C30391dr r4) {
        super(3, r4);
        this.this$0 = r2;
        this.$ownFbId$inlined = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        SocialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1 socialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1 = new SocialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1(this.this$0, this.$ownFbId$inlined, (C30391dr) obj3);
        socialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1.L$0 = obj;
        socialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1.L$1 = obj2;
        return socialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C23421Fz r1;
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G2 r5 = (AnonymousClass1G2) this.L$0;
            AnonymousClass1BI r4 = (AnonymousClass1BI) this.L$1;
            if (!(r4 instanceof UserJid) || r4 == null) {
                r1 = new C147197Se((Object) null, 5);
            } else {
                r1 = new C28243Du4(new SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1(this.this$0, r4, this.$ownFbId$inlined, (C30391dr) null));
            }
            this.label = 1;
            if (C88604aC.A02(this, r1, r5) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
