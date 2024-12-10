package X;

/* renamed from: X.CmS  reason: case insensitive filesystem */
public class C25815CmS {
    public static final C22910BUv A0F = new CKP(5);
    public static final C22910BUv A0G = new CKP(3);
    public static final C22910BUv A0H = new CKP(2);
    public static final C22910BUv A0I = new CKP(4);
    public static final CKP A0J = new CKP(7);
    public static final CKP A0K = new CKP(0);
    public static final CKP A0L = new CKP(6);
    public static final CKP A0M = new CKP(17);
    public static final CKP A0N = new CKP(12);
    public static final CKP A0O = new CKP(13);
    public static final CKP A0P = new CKP(14);
    public static final CKP A0Q = new CKP(15);
    public static final CKP A0R = new CKP(8);
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final String A0D;
    public final boolean A0E;

    public Integer A00(C22910BUv bUv) {
        int i;
        int i2 = bUv.A00;
        if (i2 == 2) {
            i = this.A07;
        } else if (i2 == 3) {
            i = this.A06;
        } else if (i2 != 4) {
            i = this.A05;
        } else {
            i = this.A08;
        }
        return Integer.valueOf(i);
    }

    public Object A01(CKP ckp) {
        long j;
        int i = ckp.A00;
        if (i == 0) {
            return this.A0D;
        }
        if (i == 1) {
            return null;
        }
        switch (i) {
            case 6:
                return Boolean.valueOf(this.A0E);
            case 7:
                return Integer.valueOf(this.A04);
            case 8:
                return Integer.valueOf(this.A09);
            case 9:
                return this.A0A;
            case 10:
                return this.A0B;
            case 11:
                return this.A0C;
            case 12:
                j = this.A00;
                break;
            case 13:
                j = this.A01;
                break;
            case 14:
                j = this.A02;
                break;
            case 15:
                j = this.A03;
                break;
            case 16:
            case 17:
                return null;
            default:
                throw BEA.A0h("Invalid required video capture result key: ", AnonymousClass000.A10(), i);
        }
        return Long.valueOf(j);
    }

    public void A02(CKP ckp, Object obj) {
        String str;
        String str2;
        switch (ckp.A00) {
            case 12:
                if (this.A00 != -1) {
                    str = "VideoCaptureRequest";
                    str2 = "Start request time was already set, cannot set it again";
                    break;
                } else {
                    this.A00 = C17880vN.A05(obj);
                    return;
                }
            case 13:
                if (this.A01 != -1) {
                    str = "VideoCaptureRequest";
                    str2 = "Start time was already set, cannot set it again";
                    break;
                } else {
                    this.A01 = C17880vN.A05(obj);
                    return;
                }
            case 14:
                if (this.A02 != -1) {
                    str = "VideoCaptureRequest";
                    str2 = "Stop request time was already set, cannot set it again";
                    break;
                } else {
                    this.A02 = C17880vN.A05(obj);
                    return;
                }
            default:
                if (this.A03 != -1) {
                    str = "VideoCaptureRequest";
                    str2 = "Stop time was already set, cannot set it again";
                    break;
                } else {
                    this.A03 = C17880vN.A05(obj);
                    return;
                }
        }
        C26175Cts.A02(str, str2);
    }

    public C25815CmS(C25693CkO ckO) {
        String str = ckO.A0B;
        if (str == null) {
            throw AnonymousClass000.A0k("one of file path or FileDescriptor must be set");
        }
        this.A0D = str;
        this.A07 = ckO.A03;
        this.A06 = ckO.A02;
        this.A08 = ckO.A04;
        this.A05 = ckO.A01;
        this.A0E = true;
        this.A04 = ckO.A00;
        this.A09 = ckO.A05;
        this.A0A = ckO.A08;
        this.A0B = ckO.A09;
        this.A0C = ckO.A0A;
        this.A00 = ckO.A06;
        this.A01 = ckO.A07;
        this.A02 = -1;
        this.A03 = -1;
    }
}
