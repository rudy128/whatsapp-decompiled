package com.whatsapp.status.playback.avatar;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass6E0;
import X.AnonymousClass6E1;
import X.AnonymousClass6GQ;
import X.AnonymousClass6GR;
import X.C111065i8;
import X.C123116Te;
import X.C123196Tm;
import X.C133416oi;
import X.C139726zL;
import X.C1418377d;
import X.C18600wl;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1", f = "AvatarReactionRepository.kt", i = {1}, l = {194, 202}, m = "invokeSuspend", n = {"avatarReaction"}, s = {"L$0"})
public final class AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C139726zL $avatarStickerStableId;
    public final /* synthetic */ int $index;
    public final /* synthetic */ WeakReference $listener;
    public final /* synthetic */ List $onDemandStickerList;
    public Object L$0;
    public int label;
    public final /* synthetic */ AvatarReactionRepository this$0;

    @DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1$1", f = "AvatarReactionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r8) {
            return new AnonymousClass1(r5, avatarReactionRepository2, weakReference, r8, i2);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                ArrayList A0m = C29431cG.A0m(avatarReactionRepository2.A01);
                A0m.set(i2, r5);
                AvatarReactionRepository avatarReactionRepository = avatarReactionRepository2;
                WeakReference weakReference = weakReference;
                List A0t = C29431cG.A0t(A0m);
                C133416oi r0 = (C133416oi) weakReference.get();
                if (r0 != null) {
                    r0.A01(A0t);
                }
                avatarReactionRepository.A01 = A0t;
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1(C139726zL r2, AvatarReactionRepository avatarReactionRepository, WeakReference weakReference, List list, C30391dr r6, int i) {
        super(2, r6);
        this.this$0 = avatarReactionRepository;
        this.$avatarStickerStableId = r2;
        this.$onDemandStickerList = list;
        this.$index = i;
        this.$listener = weakReference;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        AvatarReactionRepository avatarReactionRepository = this.this$0;
        return new AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1(this.$avatarStickerStableId, avatarReactionRepository, this.$listener, this.$onDemandStickerList, r9, this.$index);
    }

    public final Object invokeSuspend(Object obj) {
        C139726zL r0;
        final C123196Tm r5;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AvatarReactionRepository avatarReactionRepository = this.this$0;
            C139726zL r4 = this.$avatarStickerStableId;
            C123116Te r1 = (C123116Te) this.$onDemandStickerList.get(this.$index);
            this.label = 1;
            if (r1 instanceof AnonymousClass6E0) {
                obj = ((AnonymousClass6E0) r1).A00;
            } else if (r1 instanceof AnonymousClass6E1) {
                C111065i8 r6 = (C111065i8) avatarReactionRepository.A04.get();
                obj = C30451dy.A00(this, r6.A02, new AvatarReactionImageLoader$loadAvatarReactionStickerImage$2(r6, r4.A00, (C30391dr) null));
            } else {
                throw AnonymousClass3MW.A14();
            }
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else if (i == 2) {
            Object obj2 = this.L$0;
            C30691eM.A01(obj);
            return obj2;
        } else {
            throw AnonymousClass000.A0l();
        }
        C1418377d r11 = (C1418377d) obj;
        String str = this.$avatarStickerStableId.A00;
        if (r11 != null) {
            r5 = new AnonymousClass6GR(r0, r11);
        } else {
            r0 = new C139726zL(str);
            r5 = new AnonymousClass6GQ(r0);
        }
        final AvatarReactionRepository avatarReactionRepository2 = this.this$0;
        C18600wl r02 = avatarReactionRepository2.A08;
        final int i2 = this.$index;
        final WeakReference weakReference = this.$listener;
        AnonymousClass1 r42 = new AnonymousClass1((C30391dr) null);
        this.L$0 = r5;
        this.label = 2;
        if (C30451dy.A00(this, r02, r42) != r2) {
            return r5;
        }
        return r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
