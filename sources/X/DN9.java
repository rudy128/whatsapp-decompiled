package X;

public class DN9 implements E85 {
    public E85[] A00;

    public boolean Bgc(Class cls) {
        E85[] e85Arr = this.A00;
        int i = 0;
        while (!e85Arr[i].Bgc(cls)) {
            i++;
            if (i >= 2) {
                return false;
            }
        }
        return true;
    }

    public C24953CRd Bjp(Class cls) {
        E85[] e85Arr = this.A00;
        int i = 0;
        do {
            E85 e85 = e85Arr[i];
            if (e85.Bgc(cls)) {
                return e85.Bjp(cls);
            }
            i++;
        } while (i < 2);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("No factory is available for message type: ");
        throw BE6.A0v(AnonymousClass000.A0y(cls.getName(), A10));
    }
}
