package X;

import android.os.PowerManager;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.conversation.ConversationListView;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3CS  reason: invalid class name */
public class AnonymousClass3CS implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    public AnonymousClass3CS(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
        this.A07 = z;
        this.A06 = obj6;
    }

    public final void run() {
        AW0 aw0;
        long j;
        switch (this.A00) {
            case 0:
                CallInfo callInfo = (CallInfo) this.A03;
                boolean z = this.A07;
                A99.A0A((A99) this.A01, (AnonymousClass1BI) this.A06, callInfo, (C178119Bw) ((C19880zA) this.A05).A04(), (CallState) this.A02, (CallState) this.A04, z);
                return;
            case 1:
                AnonymousClass2RD r3 = (AnonymousClass2RD) this.A02;
                C129996ii r4 = (C129996ii) this.A03;
                AnonymousClass2BR r2 = (AnonymousClass2BR) this.A04;
                DNC dnc = (DNC) this.A05;
                DNC dnc2 = (DNC) this.A06;
                boolean z2 = this.A07;
                AnonymousClass37B r10 = ((C63292sp) this.A01).A01;
                if (r10 == null || !r10.A03) {
                    Log.i("CompanionDeviceQrHandler/request aborted, stopping");
                    return;
                }
                AnonymousClass1OZ r9 = r10.A07;
                String A0B = r9.A0B();
                r10.A01 = r3;
                r10.A00 = r4;
                r10.A02 = r2;
                r10.A04 = z2;
                String str = r4.A03;
                byte[] bArr = r4.A05;
                if (r2 != null) {
                    j = r2.timestamp_;
                } else {
                    j = -1;
                }
                ArrayList A13 = AnonymousClass000.A13();
                AnonymousClass8BU.A1J("ref", str, A13);
                A13.add(new C29621ca("pub-key", bArr, (AnonymousClass1MD[]) null));
                if (!(dnc == null || dnc2 == null)) {
                    A13.add(new C29621ca("device-identity", dnc.A0M(), (AnonymousClass1MD[]) null));
                    A13.add(new C29621ca("key-index-list", dnc2.A0M(), new AnonymousClass1MD[]{new AnonymousClass1MD("ts", j)}));
                }
                AnonymousClass1MD[] r42 = new AnonymousClass1MD[4];
                r42[0] = new AnonymousClass1MD((Jid) C173438v4.A00, "to");
                AnonymousClass8BV.A1N(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B, r42);
                C17890vO.A12("xmlns", "md", r42);
                AnonymousClass8BV.A1O(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r42);
                r9.A0I(r10, AnonymousClass8BT.A0a(AnonymousClass8BR.A0l("pair-device", new AnonymousClass1MD[0], C17890vO.A1Y(A13, 0)), r42), A0B, 219, 32000);
                return;
            case 2:
                AnonymousClass4aY r6 = (AnonymousClass4aY) this.A01;
                C85714Ol r92 = (C85714Ol) this.A02;
                C145777Mo r22 = (C145777Mo) this.A03;
                AnonymousClass206 r8 = (AnonymousClass206) this.A04;
                AnonymousClass206 r43 = (AnonymousClass206) this.A05;
                C441822l r5 = (C441822l) this.A06;
                boolean z3 = this.A07;
                if (!r6.A2Q.getMessageAudioPlayerProvider().A0B() && r92.A03) {
                    if (r6.A76) {
                        boolean z4 = true;
                        r22.A0N = true;
                        PowerManager.WakeLock wakeLock = r22.A0a;
                        if (wakeLock == null || !wakeLock.isHeld()) {
                            z4 = false;
                        }
                        r22.A0V = z4;
                        C145777Mo.A05(r22);
                    }
                    r22.A0C(C145777Mo.A15, true, false);
                    if (C18020vd.A05(C18040vf.A02, r6.A3F, 10174)) {
                        AnonymousClass3uP A012 = r6.A2B.A01(r8.A0v);
                        if (A012 instanceof C23819BqW) {
                            ((C23819BqW) A012).A0D = true;
                        }
                    }
                    r6.A3z = r43;
                    if (r92.A04) {
                        AnonymousClass4aY.A1Y(r6, r8);
                    }
                    if (r5 != null && z3) {
                        r6.A3B(r5, 0, false);
                    }
                    ConversationListView conversationListView = r6.A2B;
                    AnonymousClass7RR r0 = new AnonymousClass7RR(conversationListView, r43);
                    conversationListView.A0L = r0;
                    conversationListView.post(r0);
                    return;
                }
                return;
            case 3:
                AnonymousClass8Gd r44 = (AnonymousClass8Gd) this.A01;
                UserJid userJid = (UserJid) this.A02;
                boolean z5 = this.A07;
                C20281AEp aEp = (C20281AEp) this.A03;
                ADI adi = (ADI) this.A04;
                AnonymousClass9I2 r82 = (AnonymousClass9I2) this.A05;
                List list = (List) this.A06;
                AnonymousClass205 r1 = r44.A0B;
                if (r1 != null) {
                    AnonymousClass21K Bhj = r44.A08.Bhj(r1);
                    AnonymousClass1DT r12 = r44.A04;
                    C189639jZ r45 = r44.A09;
                    Boolean valueOf = Boolean.valueOf(z5);
                    if (adi != null) {
                        aw0 = adi.A00;
                    } else {
                        aw0 = null;
                    }
                    r12.A0E(r45.A00(aw0, userJid, aEp, r82, Bhj, valueOf, (String) null, list, 0));
                    return;
                }
                return;
            default:
                AnonymousClass206 r32 = (AnonymousClass206) this.A02;
                View view = (View) this.A03;
                AnonymousClass3M2 r62 = (AnonymousClass3M2) this.A04;
                C130226j5 r52 = (C130226j5) this.A05;
                Object obj = this.A06;
                boolean z6 = this.A07;
                C32051gY r13 = ((C32021gV) this.A01).A04;
                synchronized (r13) {
                    r13.A01(view, r32, (C693536w) null, r52, r62, obj, z6);
                }
                return;
        }
    }
}
