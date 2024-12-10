package X;

import android.os.Build;
import android.telecom.ConnectionRequest;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1VM  reason: invalid class name */
public class AnonymousClass1VM implements AnonymousClass191 {
    public final AnonymousClass1VN A00;

    public /* synthetic */ void Blg() {
    }

    public static AnonymousClass1VN A00(AnonymousClass1VM r2) {
        if (Build.VERSION.SDK_INT >= 28) {
            AnonymousClass1VN r0 = r2.A00;
            C17960vV.A07(r0);
            return r0;
        }
        throw new RuntimeException("Requires API level 28");
    }

    public int A02() {
        AnonymousClass1VN r0;
        if (Build.VERSION.SDK_INT < 28 || (r0 = this.A00) == null) {
            return 0;
        }
        return r0.A08();
    }

    public boolean A0B() {
        AnonymousClass1VN r0;
        if (Build.VERSION.SDK_INT < 28 || (r0 = this.A00) == null || !r0.A0L()) {
            return false;
        }
        return true;
    }

    public boolean A0C() {
        AnonymousClass1VN r0;
        if (Build.VERSION.SDK_INT < 28 || (r0 = this.A00) == null || !r0.A0M()) {
            return false;
        }
        return true;
    }

    public boolean A0D() {
        AnonymousClass1VN r0;
        if (Build.VERSION.SDK_INT < 28 || (r0 = this.A00) == null || !r0.A0N()) {
            return false;
        }
        return true;
    }

    public boolean A0E() {
        AnonymousClass1VN r0;
        if (Build.VERSION.SDK_INT < 28 || (r0 = this.A00) == null || !r0.A0O()) {
            return false;
        }
        return true;
    }

    public AnonymousClass1VM(AnonymousClass1VL r9, AnonymousClass11S r10, AnonymousClass11C r11, AnonymousClass118 r12, C18030ve r13, AnonymousClass1DC r14, AnonymousClass00H r15) {
        AnonymousClass1VN r0;
        if (Build.VERSION.SDK_INT >= 28) {
            r0 = new AnonymousClass1VN(r9, r10, r11, r12, r13, r14, r15);
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }

    public int A01() {
        AnonymousClass1VN A002 = A00(this);
        C17960vV.A02();
        return A002.A03.size();
    }

    public C161328Ct A03(ConnectionRequest connectionRequest, boolean z) {
        return A00(this).A09(connectionRequest, z);
    }

    public C161328Ct A04(String str) {
        return A00(this).A0A(str);
    }

    public void A05() {
        A00(this).A0B();
    }

    public void A06(ConnectionRequest connectionRequest) {
        A00(this).A0F(connectionRequest);
    }

    public void A07(ConnectionRequest connectionRequest) {
        A00(this).A0G(connectionRequest);
    }

    public void A08(AnonymousClass1VR r2) {
        A00(this).registerObserver(r2);
    }

    public void A09(AnonymousClass1VR r2) {
        A00(this).unregisterObserver(r2);
    }

    public void A0A(String str, String str2) {
        A00(this).A0K(str, str2);
    }

    public boolean A0F(UserJid userJid, String str, String str2, boolean z) {
        return A00(this).A0P(userJid, str, str2, z);
    }

    public boolean A0G(UserJid userJid, String str, String str2, boolean z, boolean z2) {
        return A00(this).A0Q(userJid, str, str2, z, z2);
    }

    public void Ba9() {
    }

    public void Blf() {
        AnonymousClass1VN r0;
        Log.i("voip/SelfManagedConnectionsManager/onAsyncInit");
        if (A0D() || A0C()) {
            A0E();
        } else if (Build.VERSION.SDK_INT >= 30 && (r0 = this.A00) != null) {
            r0.A0C();
        }
    }
}
