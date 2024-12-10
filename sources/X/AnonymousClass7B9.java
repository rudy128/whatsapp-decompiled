package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.7B9  reason: invalid class name */
public class AnonymousClass7B9 implements C28613EAh {
    public final /* synthetic */ C122076Mr A00;

    public void Br2(String str, boolean z, long j) {
    }

    public void BtN(C25951CpJ cpJ, String str, String str2, String str3, long j) {
    }

    public void Bwm(boolean z) {
    }

    public /* synthetic */ void Bz4(byte[] bArr) {
    }

    public void C0j() {
    }

    public void C0n(D49 d49, float f, long j) {
    }

    public void C1b(D49 d49, String str) {
    }

    public void C1c() {
    }

    public void C4s(long j) {
    }

    public void C7A(boolean z) {
    }

    public void C8i(List list) {
    }

    public void C9v(D40 d40, D49 d49, String str, String str2, String str3, String str4, long j, boolean z) {
    }

    public void C9y(String str, String str2) {
    }

    public void CA0() {
    }

    public void CA1() {
    }

    public void CA2(float f, int i, int i2, int i3) {
        this.A00.A0X.CGP(new AnonymousClass7Q4(this, f, i, i2, i3, 3));
    }

    public void CAH(boolean z, boolean z2) {
    }

    public void CAQ(C25951CpJ cpJ) {
    }

    public AnonymousClass7B9(C122076Mr r1) {
        this.A00 = r1;
    }

    public void Bqd(List list) {
        this.A00.A0X.CGP(new AnonymousClass7RD(this, list, 42));
    }

    public void BsN() {
        AnonymousClass7RJ.A01(this.A00.A0X, this, 24);
    }

    public void C6I(D40 d40, D49 d49, String str, long j, boolean z, boolean z2) {
        AnonymousClass7RJ.A01(this.A00.A0X, this, 27);
    }

    public void C72(long j, long j2, boolean z, boolean z2) {
        AnonymousClass7RJ.A00(this.A00.A0X, this, 30);
    }

    public void C79(CA0 ca0) {
        AnonymousClass7RJ.A01(this.A00.A0X, this, 26);
    }

    public void C9x(CA0 ca0, D40 d40, D49 d49, Integer num, String str, boolean z, boolean z2) {
        AnonymousClass7RJ.A01(this.A00.A0X, this, 29);
    }

    public void C9z(CA0 ca0, D40 d40, D49 d49, Integer num, String str, String str2, String str3, long j, long j2, boolean z) {
        AnonymousClass7RJ.A01(this.A00.A0X, this, 25);
    }

    public void CA4(D40 d40, D49 d49, String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2) {
        AnonymousClass7RJ.A01(this.A00.A0X, this, 28);
    }

    public void C0l(CA0 ca0, C25951CpJ cpJ, D40 d40, D49 d49, String str, String str2) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("sessionId = ");
        A10.append(str);
        StringBuilder A11 = AnonymousClass000.A11(AnonymousClass000.A0y("\n", A10));
        C17890vO.A10("waErrorString = ", str2, "\n", A11);
        StringBuilder A112 = AnonymousClass000.A11(A11.toString());
        A112.append("videoErrorInfo = ");
        A112.append(cpJ);
        String A0y = AnonymousClass000.A0y("\n", A112);
        if (cpJ != null) {
            StringBuilder A113 = AnonymousClass000.A11(A0y);
            A113.append("videoErrorInfo errorCode = ");
            A113.append(cpJ.A01);
            StringBuilder A114 = AnonymousClass000.A11(AnonymousClass000.A0y("\n", A113));
            A114.append("videoErrorInfo errorDomain = ");
            A114.append(cpJ.A02);
            StringBuilder A115 = AnonymousClass000.A11(AnonymousClass000.A0y("\n", A114));
            A115.append("videoErrorInfo message = ");
            A0y = AnonymousClass001.A1H(cpJ.A03, "\n", A115);
        }
        C122076Mr r3 = this.A00;
        r3.A0W.A0G("WaHeroPlayer/onPlaybackError", A0y, true);
        if (TextUtils.isEmpty(str2)) {
            str2 = "exoplayer_error_type_unknown";
        }
        r3.A0X.CGP(new AnonymousClass7RS(30, str2, this));
    }
}
