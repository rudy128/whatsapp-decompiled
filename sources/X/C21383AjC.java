package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.AjC  reason: case insensitive filesystem */
public final /* synthetic */ class C21383AjC implements Runnable {
    public final /* synthetic */ C21132Af0 A00;
    public final /* synthetic */ A99 A01;
    public final /* synthetic */ DeviceJid A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public final void run() {
        Object obj;
        A99 a99 = this.A01;
        boolean z = this.A05;
        UserJid userJid = this.A03;
        String str = this.A04;
        boolean z2 = this.A06;
        DeviceJid deviceJid = this.A02;
        C21132Af0 af0 = this.A00;
        if (!z) {
            AnonymousClass1TD r3 = a99.A2j;
            String A0A = C40811vJ.A0A(str);
            long A012 = AnonymousClass11P.A01(a99.A2c);
            C17960vV.A07(deviceJid);
            C89444cT r8 = new C89444cT(-1, userJid, A0A, true);
            AnonymousClass1TD.A03(r3, r8);
            C178119Bw r6 = new C178119Bw(deviceJid, r8, (List) null, A012, z2);
            AnonymousClass1TD.A00(r3, r6);
            AnonymousClass1TD.A01(r3, r6);
            obj = new C23631Ha(r6);
        } else {
            obj = C19890zB.A00;
        }
        af0.A0B(obj);
    }

    public /* synthetic */ C21383AjC(C21132Af0 af0, A99 a99, DeviceJid deviceJid, UserJid userJid, String str, boolean z, boolean z2) {
        this.A01 = a99;
        this.A05 = z;
        this.A03 = userJid;
        this.A04 = str;
        this.A06 = z2;
        this.A02 = deviceJid;
        this.A00 = af0;
    }
}
