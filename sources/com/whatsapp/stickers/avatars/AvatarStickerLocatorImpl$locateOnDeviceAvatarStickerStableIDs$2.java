package com.whatsapp.stickers.avatars;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass70H;
import X.C108945cZ;
import X.C124166Xh;
import X.C130616jj;
import X.C136656uA;
import X.C139726zL;
import X.C139856zY;
import X.C1418377d;
import X.C144637Ic;
import X.C18070vi;
import X.C27621Wu;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerLocatorImpl$locateOnDeviceAvatarStickerStableIDs$2", f = "AvatarStickerLocatorImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerLocatorImpl$locateOnDeviceAvatarStickerStableIDs$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C130616jj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerLocatorImpl$locateOnDeviceAvatarStickerStableIDs$2(C130616jj r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AvatarStickerLocatorImpl$locateOnDeviceAvatarStickerStableIDs$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AvatarStickerLocatorImpl$locateOnDeviceAvatarStickerStableIDs$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            ArrayList A01 = ((C139856zY) this.this$0.A04.get()).A01(Integer.MAX_VALUE, 2);
            C130616jj r5 = this.this$0;
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                AnonymousClass70H r1 = (AnonymousClass70H) C18070vi.A0E(r5.A05);
                C1418377d A00 = C124166Xh.A00(r5.A01, r1, (C136656uA) it.next());
                if (A00 != null) {
                    A13.add(A00);
                }
            }
            ArrayList A132 = AnonymousClass000.A13();
            Iterator it2 = A13.iterator();
            while (it2.hasNext()) {
                String str = C108945cZ.A0x(it2).A07;
                if (str != null) {
                    A132.add(str);
                }
            }
            ArrayList A0E = C29351c6.A0E(A132);
            Iterator it3 = A132.iterator();
            while (it3.hasNext()) {
                C139726zL.A00(A0E, it3);
            }
            ArrayList A012 = this.this$0.A03.A01();
            ArrayList A133 = AnonymousClass000.A13();
            Iterator it4 = A012.iterator();
            while (it4.hasNext()) {
                String str2 = ((C144637Ic) it4.next()).A01.A04.A07;
                if (str2 != null) {
                    A133.add(str2);
                }
            }
            ArrayList A0E2 = C29351c6.A0E(A133);
            Iterator it5 = A133.iterator();
            while (it5.hasNext()) {
                C139726zL.A00(A0E2, it5);
            }
            return C29431cG.A12(C29431cG.A0k(A0E2, A0E));
        }
        throw AnonymousClass000.A0l();
    }
}
