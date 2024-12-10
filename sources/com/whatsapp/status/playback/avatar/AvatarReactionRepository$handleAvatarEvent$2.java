package com.whatsapp.status.playback.avatar;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108975cc;
import X.C133416oi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.status.playback.MessageReplyActivity;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$handleAvatarEvent$2", f = "AvatarReactionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarReactionRepository$handleAvatarEvent$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ WeakReference $listener;
    public int label;
    public final /* synthetic */ AvatarReactionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionRepository$handleAvatarEvent$2(AvatarReactionRepository avatarReactionRepository, WeakReference weakReference, C30391dr r4) {
        super(2, r4);
        this.this$0 = avatarReactionRepository;
        this.$listener = weakReference;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AvatarReactionRepository$handleAvatarEvent$2(this.this$0, this.$listener, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AvatarReactionRepository avatarReactionRepository = this.this$0;
            List list = AvatarReactionRepository.A0E;
            avatarReactionRepository.A01 = list;
            avatarReactionRepository.A00 = null;
            C133416oi r0 = (C133416oi) this.$listener.get();
            if (r0 != null) {
                r0.A01(list);
            }
            C133416oi r02 = (C133416oi) this.$listener.get();
            if (r02 != null) {
                r02.A00((File) null);
            }
            C133416oi r03 = (C133416oi) this.$listener.get();
            if (r03 == null) {
                return null;
            }
            MessageReplyActivity messageReplyActivity = r03.A00;
            HashMap hashMap = MessageReplyActivity.A1v;
            if (C108975cc.A1I(messageReplyActivity.A17)) {
                messageReplyActivity.A0z.A04(8);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarReactionRepository$handleAvatarEvent$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
