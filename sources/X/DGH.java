package X;

import android.os.Handler;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

public class DGH implements C28613EAh {
    public final CopyOnWriteArraySet A00;
    public final Handler A01;

    public void Br2(String str, boolean z, long j) {
        this.A01.post(new DTB(this, str, 0, j, z));
    }

    public void C0l(CA0 ca0, C25951CpJ cpJ, D40 d40, D49 d49, String str, String str2) {
        D49 d492 = d49;
        this.A01.post(new C21394AjN(this, d492, d40, ca0, cpJ, str, str2, 0));
    }

    public void CA2(float f, int i, int i2, int i3) {
        this.A01.post(new AnonymousClass7Q4(this, f, i2, i3, i, 1));
    }

    public static Iterator A00(Object obj) {
        return ((DGH) obj).A00.iterator();
    }

    public void Bqd(List list) {
        C27076DTa.A00(this.A01, this, list, 28);
    }

    public void BsN() {
        C27082DTh.A01(this.A01, this, 42);
    }

    public void BtN(C25951CpJ cpJ, String str, String str2, String str3, long j) {
        this.A01.post(new DTD(this, cpJ, str, str2, str3, j));
    }

    public void Bwm(boolean z) {
        this.A01.post(new AnonymousClass7RK(1, (Object) this, z));
    }

    public void Bz4(byte[] bArr) {
        C27076DTa.A00(this.A01, this, bArr, 31);
    }

    public void C0j() {
        C27082DTh.A01(this.A01, this, 46);
    }

    public void C0n(D49 d49, float f, long j) {
        this.A01.post(new DTA(this, d49, f, j));
    }

    public void C1b(D49 d49, String str) {
        this.A01.post(new C21459AkQ(this, d49, str, 4));
    }

    public void C1c() {
        C27082DTh.A01(this.A01, this, 45);
    }

    public void C4s(long j) {
        this.A01.post(new C146487Ph(this, j, 1));
    }

    public void C6I(D40 d40, D49 d49, String str, long j, boolean z, boolean z2) {
        this.A01.post(new DTG(this, d40, d49, str, j, z, z2));
    }

    public void C72(long j, long j2, boolean z, boolean z2) {
        this.A01.post(new DTC(this, j, j2, z, z2));
    }

    public void C79(CA0 ca0) {
        C27076DTa.A00(this.A01, this, ca0, 27);
    }

    public void C7A(boolean z) {
        this.A01.post(new AnonymousClass7RK(0, (Object) this, z));
    }

    public void C8i(List list) {
        C27076DTa.A00(this.A01, this, list, 30);
    }

    public void C9v(D40 d40, D49 d49, String str, String str2, String str3, String str4, long j, boolean z) {
        this.A01.post(new DTL(this, d40, d49, str, str2, str3, str4, j, z));
    }

    public void C9x(CA0 ca0, D40 d40, D49 d49, Integer num, String str, boolean z, boolean z2) {
        this.A01.post(new DTJ(this, ca0, d40, d49, num, str, z, z2));
    }

    public void C9y(String str, String str2) {
        this.A01.post(new AnonymousClass7Pq(this, str2, str, 1));
    }

    public void C9z(CA0 ca0, D40 d40, D49 d49, Integer num, String str, String str2, String str3, long j, long j2, boolean z) {
        this.A01.post(new DTN(this, ca0, d40, d49, num, str, str2, str3, j, j2, z));
    }

    public void CA0() {
        C27082DTh.A01(this.A01, this, 43);
    }

    public void CA1() {
        C27082DTh.A01(this.A01, this, 44);
    }

    public void CA4(D40 d40, D49 d49, String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2) {
        this.A01.post(new DTM(this, d40, d49, str, str2, str3, str4, str5, j, z, z2));
    }

    public void CAH(boolean z, boolean z2) {
        this.A01.post(new C146847Qv(this, 1, z2, z));
    }

    public void CAQ(C25951CpJ cpJ) {
        C27076DTa.A00(this.A01, this, cpJ, 29);
    }

    public DGH(Handler handler, C28613EAh eAh) {
        this.A01 = handler;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.A00 = copyOnWriteArraySet;
        copyOnWriteArraySet.add(eAh);
    }
}
