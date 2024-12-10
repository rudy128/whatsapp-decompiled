package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass6D8;
import X.AnonymousClass6D9;
import X.C123086Tb;
import X.C1417776x;
import X.C17880vN;
import X.C17890vO;
import X.C18100vl;
import X.C27021Uk;
import X.C27031Ul;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarConfigRepository$hasAvatarAwait$2", f = "AvatarConfigRepository.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarConfigRepository$hasAvatarAwait$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C27031Ul $avatarSharedPreferences;
    public final /* synthetic */ boolean $skipCache;
    public int label;
    public final /* synthetic */ C27021Uk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarConfigRepository$hasAvatarAwait$2(C27021Uk r2, C27031Ul r3, C30391dr r4, boolean z) {
        super(2, r4);
        this.$avatarSharedPreferences = r3;
        this.$skipCache = z;
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new AvatarConfigRepository$hasAvatarAwait$2(this.this$0, this.$avatarSharedPreferences, r6, this.$skipCache);
    }

    public final Object invokeSuspend(Object obj) {
        Boolean valueOf;
        boolean z;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C18100vl r2 = this.$avatarSharedPreferences.A01;
            if (!C17880vN.A0C(r2).contains("pref_has_avatar_config")) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(C17880vN.A1W(C17880vN.A0C(r2), "pref_has_avatar_config"));
            }
            if (!this.$skipCache && valueOf != null) {
                return valueOf;
            }
            C27021Uk r3 = this.this$0;
            this.label = 1;
            obj = C30451dy.A00(this, r3.A02, new AvatarConfigRepository$fetchAvatarAwait$2(r3, (C30391dr) null));
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C123086Tb r7 = (C123086Tb) obj;
        if (r7 instanceof AnonymousClass6D9) {
            C1417776x r1 = (C1417776x) ((AnonymousClass6D9) r7).A00;
            if (r1 != null) {
                z = r1.A00;
                C17880vN.A1F(C17890vO.A0A(((C27031Ul) this.this$0.A01.get()).A01), "pref_has_avatar_config", z);
            }
            z = false;
        } else if (r7 instanceof AnonymousClass6D8) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("AvatarConfigRepository/hasAvatarWithCoroutines");
            A10.append(((AnonymousClass6D8) r7).A00);
            C17890vO.A0w(A10);
            z = false;
        } else {
            throw AnonymousClass3MW.A14();
        }
        return Boolean.valueOf(z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarConfigRepository$hasAvatarAwait$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
