package X;

import java.util.HashMap;

/* renamed from: X.347  reason: invalid class name */
public class AnonymousClass347 implements BC9 {
    public final /* synthetic */ C32431hB A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ void BsA(long j) {
    }

    public AnonymousClass347(C32431hB r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public void BsC(boolean z) {
        HashMap hashMap = this.A00.A0N;
        synchronized (hashMap) {
            hashMap.remove(this.A01);
        }
    }

    public void BsD(C1409173o r3, C136996uk r4) {
        HashMap hashMap = this.A00.A0N;
        synchronized (hashMap) {
            hashMap.remove(this.A01);
        }
    }
}
