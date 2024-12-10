package com.whatsapp.status.playback.avatar;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C133416oi;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.whatsapp.status.playback.MessageReplyActivity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$handleAvatarEvent$3", f = "AvatarReactionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarReactionRepository$handleAvatarEvent$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ WeakReference $listener;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionRepository$handleAvatarEvent$3(WeakReference weakReference, C30391dr r3) {
        super(2, r3);
        this.$listener = weakReference;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AvatarReactionRepository$handleAvatarEvent$3(this.$listener, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AvatarReactionRepository$handleAvatarEvent$3(this.$listener, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C133416oi r0 = (C133416oi) this.$listener.get();
            if (r0 == null) {
                return null;
            }
            MessageReplyActivity messageReplyActivity = r0.A00;
            HashMap hashMap = MessageReplyActivity.A1v;
            MaterialButtonToggleGroup.A01(messageReplyActivity.A0C, 2131430352, true);
            messageReplyActivity.A0C.setVisibility(8);
            messageReplyActivity.A05.setVisibility(8);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
