package X;

import java.util.Iterator;

/* renamed from: X.AcY  reason: case insensitive filesystem */
public final class C20980AcY implements AnonymousClass1O5 {
    public final /* synthetic */ C27341Vs A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ byte[] A03;
    public final /* synthetic */ byte[] A04;

    public void C7Z(C29621ca r10, String str) {
        C18070vi.A0d(r10, 1);
        C29621ca A0J = r10.A0J(0);
        C17960vV.A07(A0J);
        C18070vi.A0X(A0J);
        C29621ca.A04(A0J, "crypto");
        byte[] bArr = A0J.A0L("password").A01;
        String str2 = this.A02;
        byte[] bArr2 = this.A04;
        byte[] bArr3 = this.A03;
        Runnable runnable = this.A01;
        C17900vP.A0f("BackupSendMethods/sendGetCipherKey/success v=", str2, AnonymousClass000.A10());
        ((AnonymousClass9j8) this.A00.A01.get()).A00(str2, bArr, bArr2, bArr3, 0);
        runnable.run();
    }

    public C20980AcY(C27341Vs r1, Runnable runnable, String str, byte[] bArr, byte[] bArr2) {
        this.A02 = str;
        this.A04 = bArr;
        this.A03 = bArr2;
        this.A01 = runnable;
        this.A00 = r1;
    }

    public void BrD(String str) {
        C17900vP.A0e("BackupSendMethods/sendGetCipherKey/failed to deliver id=", str, C18070vi.A0K(str));
    }

    public void Bt9(C29621ca r12, String str) {
        C18070vi.A0h(str, r12);
        Iterator A0r = AnonymousClass8BW.A0r(r12, "error");
        while (A0r.hasNext()) {
            C29621ca A0a = C17880vN.A0a(A0r);
            if (A0a != null) {
                String A0Q = A0a.A0Q("code", (String) null);
                String A0Q2 = A0a.A0Q("text", (String) null);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("BackupSendMethods/sendGetCipherKey id=");
                A10.append(str);
                A10.append(" error=");
                A10.append(A0Q);
                A10.append(' ');
                C17890vO.A1B(A10, A0Q2);
                if (A0Q != null) {
                    int parseInt = Integer.parseInt(A0Q);
                    String str2 = this.A02;
                    byte[] bArr = this.A04;
                    byte[] bArr2 = this.A03;
                    Runnable runnable = this.A01;
                    C17900vP.A0f("BackupSendMethods/sendGetCipherKey/success v=", str2, AnonymousClass000.A10());
                    ((AnonymousClass9j8) this.A00.A01.get()).A00(str2, (byte[]) null, bArr, bArr2, parseInt);
                    runnable.run();
                }
            }
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
