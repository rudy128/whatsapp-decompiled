package X;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.DfU  reason: case insensitive filesystem */
public class C27443DfU extends C445423v implements AnonymousClass1OS {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C27443DfU(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x001c;
                case 2: goto L_0x0025;
                case 3: goto L_0x002e;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.BLb> r3 = X.C22699BLb.class
            java.lang.String r5 = "loaderConsumer(Lcom/facebook/commonavatarliveediting/leplayer/LiveEditingPlayer$LiveEditingPlayerEvent;)V"
            r6 = 4
            r1 = 2
            java.lang.String r4 = "loaderConsumer"
        L_0x000e:
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.1DT> r3 = X.AnonymousClass1DT.class
            java.lang.String r5 = "postValue(Ljava/lang/Object;)V"
            r6 = 4
            r1 = 2
            java.lang.String r4 = "postValue"
            goto L_0x000e
        L_0x001c:
            java.lang.Class<X.CcM> r3 = X.C25274CcM.class
            java.lang.String r5 = "sendPlatformEventToEffect(Lorg/json/JSONObject;)V"
            r6 = 4
            r1 = 2
            java.lang.String r4 = "sendPlatformEventToEffect"
            goto L_0x000e
        L_0x0025:
            java.lang.Class<X.CcM> r3 = X.C25274CcM.class
            java.lang.String r5 = "updateSliderValue(Ljava/util/Map;)V"
            r6 = 4
            r1 = 2
            java.lang.String r4 = "updateSliderValue"
            goto L_0x000e
        L_0x002e:
            java.lang.Class<X.BLb> r3 = X.C22699BLb.class
            java.lang.String r5 = "bloksConsumer(Lcom/facebook/commonavatarliveediting/leplayer/LiveEditingPlayer$LiveEditingPlayerEvent;)V"
            r6 = 4
            r1 = 2
            java.lang.String r4 = "bloksConsumer"
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27443DfU.<init>(java.lang.Object, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C24883COb cOb;
        C24305Bz2 bz2;
        AnonymousClass1G4 r1;
        boolean z;
        switch (this.A00) {
            case 0:
                ((AnonymousClass1DS) this.receiver).A0E(obj);
                break;
            case 1:
                JSONObject jSONObject = (JSONObject) obj;
                C18070vi.A0d(jSONObject, 0);
                ((C25274CcM) this.receiver).A0A.A09.A01.A00(jSONObject);
                break;
            case 2:
                ((C25274CcM) this.receiver).A05((Map) obj);
                break;
            case 3:
                C3B c3b = (C3B) obj;
                C22699BLb bLb = (C22699BLb) this.receiver;
                if (!(c3b instanceof BR5)) {
                    if (!(c3b instanceof BR4)) {
                        if (!(c3b instanceof BRC)) {
                            if (c3b instanceof BR1) {
                                C24883COb cOb2 = bLb.A0C;
                                AnonymousClass1D6 r0 = ((BR1) c3b).A00;
                                Object obj3 = r0.first;
                                String obj4 = r0.second.toString();
                                C18070vi.A0d(obj3, 0);
                                if (obj4 != null) {
                                    cOb2.A01.invoke(obj3, obj4);
                                    break;
                                }
                            }
                        } else {
                            cOb = bLb.A0C;
                            bz2 = C24305Bz2.EDITOR_SCREEN_PREVIEW_EFFECT_LOAD_END;
                        }
                    } else {
                        cOb = bLb.A0C;
                        bz2 = C24305Bz2.EDITOR_SCREEN_PREVIEW_AVATAR_LOAD_END;
                    }
                } else {
                    cOb = bLb.A0C;
                    bz2 = C24305Bz2.EDITOR_SCREEN_PREVIEW_AVATAR_LOAD_START;
                }
                cOb.A00.invoke(bz2.toString(), (Object) null);
                break;
            default:
                C22699BLb bLb2 = (C22699BLb) this.receiver;
                if ((obj instanceof BR3) || (obj instanceof BR5)) {
                    r1 = bLb2.A0G;
                    z = true;
                } else if (obj instanceof BR4) {
                    r1 = bLb2.A0G;
                    z = false;
                }
                r1.CPw(Boolean.valueOf(z));
                break;
        }
        return C27621Wu.A00;
    }
}
