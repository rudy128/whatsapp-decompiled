package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.372  reason: invalid class name */
public class AnonymousClass372 implements AnonymousClass1O5 {
    public final AnonymousClass9F7 A00;
    public final Runnable A01;
    public final /* synthetic */ C29771cq A02;

    public AnonymousClass372(C29771cq r1, AnonymousClass9F7 r2, Runnable runnable) {
        this.A02 = r1;
        this.A01 = runnable;
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.2rm] */
    public void C7Z(C29621ca r25, String str) {
        AnonymousClass9F7 r4 = this.A00;
        C29621ca r14 = r25;
        C18070vi.A0d(r14, 1);
        C18070vi.A0d(r4, 2);
        C29621ca.A04(r14, "iq");
        C29621ca r6 = (C29621ca) r4.A00;
        ? obj = new Object();
        Class[] clsArr = new Class[2];
        clsArr[0] = Jid.class;
        if (obj.A01(r14, C18070vi.A0O(UserJid.class, clsArr, 1), new String[]{"from"}) != null) {
            String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
            Class<String> cls = String.class;
            Object A05 = obj.A05(r6, cls, -9007199254740991L, 9007199254740991L, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
            if (A05 != null) {
                C62672rm r13 = obj;
                if (r13.A05(r14, cls, -9007199254740991, 9007199254740991, A05, strArr, true) != null) {
                    Number number = (Number) r13.A05(r14, Long.TYPE, -9007199254740991, 9007199254740991, (Object) null, new String[]{"t"}, false);
                    if (number != null) {
                        long longValue = number.longValue();
                        if (obj.A05(r14, cls, -9007199254740991, 9007199254740991, "result", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_TYPE}, false) != null) {
                            C17900vP.A0m("ClientPingManager/recv/onSuccess; timestamp=", AnonymousClass000.A10(), longValue);
                            C29771cq r42 = this.A02;
                            r42.A0F.execute(new C70583Br(r42, 36));
                            Runnable runnable = this.A01;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                        throw AnonymousClass1O9.A00(obj);
                    }
                    throw AnonymousClass1O9.A00(obj);
                }
                throw AnonymousClass1O9.A00(obj);
            }
            throw AnonymousClass1O9.A00(obj);
        }
        throw AnonymousClass1O9.A00(obj);
    }

    public void BrD(String str) {
        C17900vP.A0f("ClientPingManager/recv/onDeliveryFailure id=", str, AnonymousClass000.A10());
    }

    public void Bt9(C29621ca r5, String str) {
        C17900vP.A0f("ClientPingManager/recv/onError id=", str, AnonymousClass000.A10());
        C29771cq r3 = this.A02;
        r3.A0F.execute(new C70583Br(r3, 36));
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
