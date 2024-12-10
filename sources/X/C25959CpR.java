package X;

/* renamed from: X.CpR  reason: case insensitive filesystem */
public class C25959CpR {
    public static final C23433Bgy A08;
    public static final C23433Bgy A09;
    public static final C23433Bgy A0A;
    public static final C23433Bgy A0B;
    public static final C23433Bgy A0C;
    public static final C23433Bgy A0D;
    public static final C23433Bgy A0E;
    public static final C23433Bgy A0F;
    public long A00;
    public String A01;
    public String A02;
    public final int A03;
    public final long A04;
    public final C24950CRa A05;
    public final C24877CNv A06;
    public final byte[] A07;

    public C25959CpR(C24950CRa cRa, C24877CNv cNv, byte[] bArr, int i, long j) {
        this.A04 = j;
        this.A03 = i;
        this.A07 = bArr;
        this.A05 = cRa;
        this.A06 = cNv;
    }

    public static C25959CpR A00(C24950CRa cRa, long j) {
        C24950CRa cRa2 = cRa;
        C25959CpR cpR = new C25959CpR(cRa2, (C24877CNv) null, (byte[]) null, 2, j);
        long j2 = cRa2.A00;
        if (j2 > 0) {
            if (j2 >= 0) {
                cpR.A00 = j2;
            } else {
                throw AnonymousClass000.A0k("Payload size must be positive.");
            }
        }
        return cpR;
    }

    static {
        C23435Bh0 bh0 = C23433Bgy.A00;
        Object[] objArr = new Object[3];
        AnonymousClass001.A1Q("/", "\\", objArr);
        objArr[2] = "../";
        CBF.A00(objArr, 3);
        A08 = new C23432Bgx(objArr, 3);
        Object[] A1a = C108945cZ.A1a("../", "/", 15, 1);
        A1a[2] = "\\";
        A1a[3] = "?";
        C17900vP.A0P("*", "\"", "<", ">", A1a);
        C17890vO.A0x("|", ":", A1a);
        BE9.A1B("\u0000", "\n", A1a);
        System.arraycopy(new String[]{"\r", "\t", "\f"}, 0, A1a, 12, 3);
        CBF.A00(A1a, 15);
        A09 = new C23432Bgx(A1a, 15);
        Object[] objArr2 = new Object[4];
        AnonymousClass8BS.A1B("..", ".", objArr2);
        BE7.A1F("\\", "/", objArr2);
        CBF.A00(objArr2, 4);
        A0A = new C23432Bgx(objArr2, 4);
        Object[] objArr3 = {"\\"};
        CBF.A00(objArr3, 1);
        A0B = new C23432Bgx(objArr3, 1);
        Object[] objArr4 = new Object[2];
        AnonymousClass8BS.A1B("../", "..\\", objArr4);
        CBF.A00(objArr4, 2);
        A0C = new C23432Bgx(objArr4, 2);
        Object[] objArr5 = new Object[12];
        AnonymousClass8BS.A1B("?", "*", objArr5);
        BE7.A1F("\"", "|", objArr5);
        C17900vP.A0P(":", "\u0000", "\n", "\r", objArr5);
        C17890vO.A0x("\t", "\f", objArr5);
        BE9.A1B("../", "..", objArr5);
        System.arraycopy(new String[0], 0, objArr5, 12, 0);
        CBF.A00(objArr5, 12);
        A0D = new C23432Bgx(objArr5, 12);
        Object[] objArr6 = {"\\"};
        CBF.A00(objArr6, 1);
        A0E = new C23432Bgx(objArr6, 1);
        Object[] A1a2 = C108945cZ.A1a("\\", "/", 2, 1);
        CBF.A00(A1a2, 2);
        A0F = new C23432Bgx(A1a2, 2);
    }
}
