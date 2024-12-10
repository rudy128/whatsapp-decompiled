package X;

public class DDP implements E4Y {
    public final int A00;
    public final Object A01;

    public DDP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void CNX(String str, String str2, Throwable th) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            if (((BTP) obj).A04.BS8() != null) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("AREngineLogger/softReport ");
                A10.append(str);
                String A0Z = C17890vO.A0Z(str2, A10, ' ');
                new RuntimeException(str2, th);
                C18070vi.A0d(A0Z, 0);
            }
        } else if (((C28574E8g) obj).BS8() != null) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("AREngineLogger/softReport ");
            A102.append(str);
            String A0Z2 = C17890vO.A0Z(str2, A102, ' ');
            new RuntimeException(str2, th);
            C18070vi.A0d(A0Z2, 0);
        }
    }
}
