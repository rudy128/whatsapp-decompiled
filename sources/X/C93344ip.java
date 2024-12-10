package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallState;
import java.util.Map;

/* renamed from: X.4ip  reason: invalid class name and case insensitive filesystem */
public final class C93344ip implements BDF {
    public final /* synthetic */ C85914Pf A00;
    public final /* synthetic */ C108475bl A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ void Blp(int i, boolean z, boolean z2) {
    }

    public /* synthetic */ void BmO(C89344cJ r1) {
    }

    public /* synthetic */ void Bn8() {
    }

    public void BnL(C86534Sa r2) {
        C18070vi.A0d(r2, 0);
        this.A01.CQ0(r2);
    }

    public void BnM(C86534Sa r2) {
        C18070vi.A0d(r2, 0);
        if (this.A02) {
            BnL(r2);
        }
    }

    public /* synthetic */ void BnO(Bitmap bitmap, boolean z) {
    }

    public /* synthetic */ void BnP(boolean z, String str) {
    }

    public /* synthetic */ void Bvf(boolean z) {
    }

    public /* synthetic */ void Byq(UserJid userJid, boolean z) {
    }

    public /* synthetic */ void Byr(UserJid userJid, boolean z) {
    }

    public /* synthetic */ void Bz3(C136336te r1, boolean z) {
    }

    public /* synthetic */ void C07(UserJid[] userJidArr, int[] iArr) {
    }

    public /* synthetic */ void C08(UserJid userJid) {
    }

    public /* synthetic */ void C33(UserJid userJid, boolean z, boolean z2) {
    }

    public /* synthetic */ void C36(UserJid userJid, boolean z, boolean z2) {
    }

    public /* synthetic */ void C4X(int i) {
    }

    public /* synthetic */ void C4Y(UserJid userJid, boolean z, boolean z2) {
    }

    public /* synthetic */ void C5Q(String str, boolean z) {
    }

    public /* synthetic */ void C9p(UserJid userJid, boolean z) {
    }

    public C93344ip(C85914Pf r1, C108475bl r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = r1;
    }

    public void Bn6(long j) {
        C86534Sa A07 = this.A00.A00.A07();
        C201110w r0 = A07.A06;
        boolean z = A07.A0I;
        boolean z2 = A07.A0L;
        CallState callState = A07.A0B;
        boolean z3 = A07.A0Q;
        boolean z4 = A07.A0M;
        C134216qE r17 = A07.A07;
        AnonymousClass1EC r18 = A07.A08;
        UserJid userJid = A07.A0A;
        String str = A07.A0C;
        boolean z5 = A07.A0P;
        boolean z6 = A07.A0K;
        UserJid userJid2 = A07.A09;
        int i = A07.A00;
        boolean z7 = A07.A0H;
        String str2 = A07.A0D;
        boolean z8 = A07.A0G;
        int i2 = A07.A02;
        int i3 = A07.A04;
        boolean z9 = A07.A0F;
        boolean z10 = A07.A0O;
        boolean z11 = A07.A0J;
        int i4 = A07.A01;
        int i5 = i4;
        UserJid userJid3 = userJid2;
        CallState callState2 = callState;
        String str3 = str2;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        C86534Sa r15 = new C86534Sa(C201110w.copyOf((Map) r0), r17, r18, userJid, userJid3, callState2, str, str3, (String) null, i6, i7, i8, 0, i5, j, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, A07.A0N);
        if (r15.A0B == CallState.ACTIVE) {
            this.A01.CQ0(r15);
        }
    }

    public void Bnc() {
        this.A01.CQ0(this.A00.A00.A07());
    }
}
