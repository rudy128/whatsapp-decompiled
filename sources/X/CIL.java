package X;

public abstract class CIL {
    public static final C24965CRp A00;
    public static final C24965CRp A01;
    public static final C24965CRp A02;
    public static final C24965CRp A03;
    public static final C24965CRp A04;
    public static final C24965CRp A05;
    public static final C24965CRp A06;
    public static final C24965CRp A07;
    public static final C24965CRp A08;
    public static final C24965CRp A09;
    public static final C24965CRp A0A;
    public static final C24965CRp A0B;
    public static final C24965CRp[] A0C;

    static {
        Integer num = AnonymousClass00R.A00;
        C24047BuY buY = CIQ.A0I;
        C24965CRp cRp = new C24965CRp((C26189CuF) null, buY, num, "START");
        A02 = cRp;
        Integer num2 = AnonymousClass00R.A01;
        C24965CRp cRp2 = new C24965CRp((C26189CuF) null, buY, num2, "WAIT_SH_HRR");
        A0B = cRp2;
        C24965CRp cRp3 = new C24965CRp(CIQ.A05, (C26189CuF) null, num2, "WAIT_SEND_EARLY_DATA");
        A09 = cRp3;
        C24965CRp cRp4 = new C24965CRp((C26189CuF) null, buY, num2, "WAIT_SH");
        A0A = cRp4;
        C24965CRp cRp5 = new C24965CRp(CIQ.A06, buY, num2, "WAIT_EE");
        A06 = cRp5;
        C24965CRp cRp6 = new C24965CRp((C26189CuF) null, buY, num2, "WAIT_CERT_CR");
        A04 = cRp6;
        C24965CRp cRp7 = new C24965CRp((C26189CuF) null, buY, num2, "WAIT_CERT");
        A03 = cRp7;
        C24965CRp cRp8 = new C24965CRp((C26189CuF) null, buY, num2, "WAIT_CV");
        A05 = cRp8;
        C24965CRp cRp9 = new C24965CRp((C26189CuF) null, buY, num2, "WAIT_FINISHED");
        A07 = cRp9;
        C24965CRp cRp10 = new C24965CRp(CIQ.A04, buY, num2, "WAIT_SEND_CERTS_FIN");
        A08 = cRp10;
        C24965CRp cRp11 = new C24965CRp(CIQ.A07, (C26189CuF) null, num2, "CONNECTED");
        A00 = cRp11;
        C24965CRp cRp12 = new C24965CRp((C26189CuF) null, (C26189CuF) null, AnonymousClass00R.A0C, "END");
        A01 = cRp12;
        C24965CRp[] cRpArr = new C24965CRp[12];
        C17900vP.A0O(cRp, cRp3, cRp2, cRp4, cRpArr);
        C17900vP.A0P(cRp5, cRp6, cRp7, cRp8, cRpArr);
        C17890vO.A0x(cRp9, cRp10, cRpArr);
        BE9.A1B(cRp11, cRp12, cRpArr);
        A0C = cRpArr;
    }
}
