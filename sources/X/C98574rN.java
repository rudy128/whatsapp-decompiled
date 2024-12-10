package X;

import com.whatsapp.calling.service.VoiceServiceEventCallback;
import com.whatsapp.expressionstray.ExpressionsTrayView;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.4rN  reason: invalid class name and case insensitive filesystem */
public class C98574rN implements Runnable {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    public C98574rN(Object obj, String str, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = str;
    }

    public final void run() {
        Object obj;
        switch (this.A00) {
            case 0:
                boolean z = this.A03;
                String str = this.A02;
                C143887Fe r2 = (C143887Fe) this.A01;
                HashMap hashMap = AnonymousClass4WC.A00;
                if (z) {
                    obj = hashMap.remove(str);
                } else {
                    obj = hashMap.get(str);
                }
                AbstractCollection abstractCollection = (AbstractCollection) obj;
                if (abstractCollection != null) {
                    Iterator it = abstractCollection.iterator();
                    while (it.hasNext()) {
                        AnonymousClass5a2 r0 = (AnonymousClass5a2) it.next();
                        if (r0 != null) {
                            r0.Bzv(r2, z);
                        }
                    }
                }
                if (!C87504Vv.A01(str)) {
                    C20016A3i.A01(r2, str);
                    return;
                }
                return;
            case 1:
                boolean z2 = this.A03;
                ((C21138Af9) this.A01).A00.notifyAllObservers(new C97034oo(this.A02, z2, 0));
                return;
            case 2:
                ((VoiceServiceEventCallback) this.A01).m39lambda$linkCreateAcked$0$comwhatsappcallingserviceVoiceServiceEventCallback(this.A02, this.A03);
                return;
            default:
                boolean z3 = this.A03;
                String str2 = this.A02;
                ExpressionsTrayView expressionsTrayView = ((AnonymousClass4aY) this.A01).A3D;
                if (expressionsTrayView == null) {
                    return;
                }
                if (z3) {
                    expressionsTrayView.A0H(str2);
                    return;
                } else {
                    expressionsTrayView.A0I(str2);
                    return;
                }
        }
    }
}
