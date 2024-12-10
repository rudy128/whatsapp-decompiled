package X;

/* renamed from: X.7JU  reason: invalid class name */
public class AnonymousClass7JU implements C160898Aj {
    public final /* synthetic */ C111295jU A00;

    public AnonymousClass21V BUg(int i) {
        if (i <= -1) {
            return null;
        }
        C111295jU r1 = this.A00;
        if (i < r1.A06.A01.size()) {
            return (AnonymousClass21V) r1.A06.A01.get(i);
        }
        return null;
    }

    public int BXL(AnonymousClass205 r5) {
        if (r5 != null) {
            int i = 0;
            while (true) {
                C111295jU r1 = this.A00;
                if (i >= r1.A06.A01.size()) {
                    break;
                } else if (r5.equals(AnonymousClass3MW.A0k(r1.A06.A01, i).A0v)) {
                    return i;
                } else {
                    i++;
                }
            }
        }
        return -2;
    }

    public void CNr() {
    }

    public void COX() {
    }

    public void close() {
    }

    public AnonymousClass7JU(C111295jU r1) {
        this.A00 = r1;
    }

    public void Byw() {
        this.A00.A0g(2);
    }

    public void CId(Runnable runnable) {
        this.A00.A0E = runnable;
    }

    public void CQZ(int i) {
        C111295jU r2 = this.A00;
        int A0X = r2.A0X((AnonymousClass21V) r2.A06.A01.get(i));
        if (A0X >= 0 && A0X <= C111295jU.A05(r2).size()) {
            AnonymousClass3MX.A1K(r2.A1J, A0X);
        }
    }

    public int getCount() {
        return this.A00.A06.A01.size();
    }
}
