package com.whatsapp.productinfra.avatar.stickers.search;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7IK;
import X.AnonymousClass7IL;
import X.AnonymousClass8AO;
import X.C1193067o;
import X.C121906Ly;
import X.C122596Qz;
import X.C131976ly;
import X.C139596z7;
import X.C17960vV;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C31781g7;
import X.C72473Md;
import java.util.Arrays;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.stickers.search.AvatarStickerSearchProvider$searchAwait$2", f = "AvatarStickerSearchProvider.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerSearchProvider$searchAwait$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String[] $query;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C1193067o this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerSearchProvider$searchAwait$2(C1193067o r2, C30391dr r3, String[] strArr) {
        super(2, r3);
        this.$query = strArr;
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AvatarStickerSearchProvider$searchAwait$2(this.this$0, r5, this.$query);
    }

    public final Object invokeSuspend(Object obj) {
        C131976ly r3;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            String[] strArr = this.$query;
            C1193067o r6 = this.this$0;
            this.L$0 = strArr;
            this.L$1 = r6;
            this.label = 1;
            C31781g7 A0m = C72473Md.A0m(this);
            int length = strArr.length;
            if (length == 1) {
                String str = strArr[0];
                C18070vi.A0d(str, 0);
                r3 = r6.A00(str, false, false);
            } else {
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, length);
                C18070vi.A0d(strArr2, 0);
                r3 = new C131976ly();
                if (r6.A02) {
                    C139596z7 r7 = r6.A03;
                    AnonymousClass7IL r9 = new AnonymousClass7IL(r3, 0);
                    C17960vV.A02();
                    AnonymousClass8AO r10 = r7.A06;
                    C122596Qz r8 = C122596Qz.ANY;
                    C121906Ly r62 = new C121906Ly(r7, r8, r9, r10, true);
                    r7.A08.CGD(r62, Arrays.copyOf(strArr2, strArr2.length));
                    C139596z7.A00(r62, r7, r8);
                }
            }
            r3.A00(new AnonymousClass7IK(A0m, 1));
            obj = A0m.A0C();
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerSearchProvider$searchAwait$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
